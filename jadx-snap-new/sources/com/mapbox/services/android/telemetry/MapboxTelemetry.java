package com.mapbox.services.android.telemetry;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.location.Location;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import com.mapbox.services.android.telemetry.connectivity.ConnectivityReceiver;
import com.mapbox.services.android.telemetry.constants.TelemetryConstants;
import com.mapbox.services.android.telemetry.http.TelemetryClient;
import com.mapbox.services.android.telemetry.location.LocationEngine;
import com.mapbox.services.android.telemetry.location.LocationEngineListener;
import com.mapbox.services.android.telemetry.navigation.MapboxNavigationEvent;
import com.mapbox.services.android.telemetry.service.TelemetryService;
import com.mapbox.services.android.telemetry.utils.TelemetryUtils;
import defpackage.akgx;
import defpackage.akgy;
import defpackage.akhv;
import defpackage.akib;
import defpackage.hc;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

public class MapboxTelemetry implements akgy, LocationEngineListener {
    private static final String LOG_TAG = "MapboxTelemetry";
    private static final int UNAVAILABLE_BATTERY_LEVEL = 100;
    private static final List<String> VALID_USER_AGENTS = new ArrayList<String>() {
        {
            add("MapboxEventsAndroid/");
            add("MapboxTelemetryAndroid/");
            add("MapboxEventsUnityAndroid/");
            add("mapbox-navigation-android/");
            add("mapbox-navigation-ui-android/");
        }
    };
    private static MapboxTelemetry instance;
    private String accessToken = null;
    private Intent batteryStatus = null;
    private TelemetryClient client = null;
    private Context context = null;
    private Hashtable<String, Object> customTurnstileEvent = null;
    private boolean debugLoggingEnabled = false;
    private DisplayMetrics displayMetrics = null;
    private Vector<Hashtable<String, Object>> events = new Vector();
    private boolean initialized = false;
    private LocationEngine locationEngine = null;
    private String mapboxSessionId = null;
    private long mapboxSessionIdLastSet = 0;
    private String mapboxVendorId = null;
    private String sdkIdentifier;
    private String sdkVersion;
    private int sessionIdRotationTime = 24;
    private Boolean telemetryEnabled = null;
    protected CopyOnWriteArrayList<TelemetryListener> telemetryListeners;
    private Timer timer = null;
    private String userAgent = null;
    private boolean withShutDown = false;

    private MapboxTelemetry() {
        String str = "";
        this.sdkIdentifier = str;
        this.sdkVersion = str;
    }

    private void addGeneralNavigationMetadataTo(Hashtable<String, Object> hashtable) {
        hashtable.put(MapboxNavigationEvent.KEY_DEVICE, Build.MODEL);
        hashtable.put(MapboxNavigationEvent.KEY_VOLUME_LEVEL, Integer.valueOf(TelemetryUtils.getVolumeLevel(this.context)));
        hashtable.put(MapboxNavigationEvent.KEY_AUDIO_TYPE, TelemetryUtils.obtainAudioType(this.context));
        hashtable.put(MapboxNavigationEvent.KEY_SCREEN_BRIGHTNESS, Integer.valueOf(TelemetryUtils.getScreenBrightness(this.context)));
        hashtable.put("applicationState", TelemetryUtils.getApplicationState(this.context));
        hashtable.put(MapboxNavigationEvent.KEY_BATTERY_PLUGGED_IN, Boolean.valueOf(isPluggedIn()));
        hashtable.put("batteryLevel", Integer.valueOf(getBatteryLevel()));
        hashtable.put(MapboxNavigationEvent.KEY_CONNECTIVITY, TelemetryUtils.getCellularNetworkType(this.context));
    }

    private Object addSdkIdentifier() {
        return this.sdkIdentifier.isEmpty() ? JSONObject.NULL : this.sdkIdentifier;
    }

    private Object addSdkVersion() {
        return this.sdkVersion.isEmpty() ? JSONObject.NULL : this.sdkVersion;
    }

    private void checkStagingServerInformation() {
        String str = LOG_TAG;
        try {
            CharSequence charSequence;
            CharSequence charSequence2;
            boolean z;
            ApplicationInfo applicationInfo = this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 128);
            if (applicationInfo == null || applicationInfo.metaData == null) {
                charSequence = null;
                charSequence2 = charSequence;
                z = false;
            } else {
                charSequence = applicationInfo.metaData.getString(TelemetryConstants.KEY_META_DATA_STAGING_SERVER);
                charSequence2 = applicationInfo.metaData.getString(TelemetryConstants.KEY_META_DATA_STAGING_ACCESS_TOKEN);
                z = applicationInfo.metaData.getBoolean(TelemetryConstants.KEY_META_DATA_CN_SERVER);
            }
            if (z) {
                this.client.setEnableCnEndpoint();
                return;
            }
            if (TextUtils.isEmpty(charSequence) || TextUtils.isEmpty(r6)) {
                SharedPreferences sharedPreferences = TelemetryUtils.getSharedPreferences(this.context);
                charSequence = sharedPreferences.getString(TelemetryConstants.MAPBOX_SHARED_PREFERENCE_KEY_TELEMETRY_STAGING_URL, null);
                charSequence2 = sharedPreferences.getString(TelemetryConstants.MAPBOX_SHARED_PREFERENCE_KEY_TELEMETRY_STAGING_ACCESS_TOKEN, null);
            }
            if (!(TextUtils.isEmpty(charSequence) || TextUtils.isEmpty(charSequence2))) {
                Log.w(str, String.format("Using staging server '%s' with access token '%s'.", new Object[]{charSequence, charSequence2}));
                this.client.setEventsEndpoint(charSequence);
                this.client.setAccessToken(charSequence2);
                this.client.setStagingEnvironment(true);
            }
        } catch (Exception e) {
            Log.e(str, String.format("Failed to check for staging credentials: %s", new Object[]{e.getMessage()}));
        }
    }

    private int getBatteryLevel() {
        Intent intent = this.batteryStatus;
        if (intent == null) {
            return 100;
        }
        return Math.round((((float) intent.getIntExtra("level", -1)) / ((float) this.batteryStatus.getIntExtra("scale", -1))) * 100.0f);
    }

    public static synchronized MapboxTelemetry getInstance() {
        MapboxTelemetry mapboxTelemetry;
        synchronized (MapboxTelemetry.class) {
            if (instance == null) {
                instance = new MapboxTelemetry();
            }
            mapboxTelemetry = instance;
        }
        return mapboxTelemetry;
    }

    private boolean isANavigationEvent(String str) {
        return str.equalsIgnoreCase(MapboxNavigationEvent.TYPE_DEPART) || str.equalsIgnoreCase(MapboxNavigationEvent.TYPE_FEEDBACK) || str.equalsIgnoreCase(MapboxNavigationEvent.TYPE_ARRIVE) || str.equalsIgnoreCase(MapboxNavigationEvent.TYPE_CANCEL) || str.equalsIgnoreCase(MapboxNavigationEvent.TYPE_REROUTE);
    }

    private boolean isInitializedAndEnabled() {
        return this.initialized && isTelemetryEnabled();
    }

    private boolean isPluggedIn() {
        Intent intent = this.batteryStatus;
        if (intent != null) {
            int intExtra = intent.getIntExtra("plugged", -1);
            if (intExtra == 2 || intExtra == 1) {
                return true;
            }
        }
        return false;
    }

    private boolean isUserAgentValid(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (String startsWith : VALID_USER_AGENTS) {
                if (str.startsWith(startsWith)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void loadUserPreferences() {
        SharedPreferences sharedPreferences = TelemetryUtils.getSharedPreferences(this.context);
        String str = TelemetryConstants.MAPBOX_SHARED_PREFERENCE_KEY_VENDOR_ID;
        if (sharedPreferences.contains(str)) {
            this.mapboxVendorId = sharedPreferences.getString(str, "");
        }
        if (TextUtils.isEmpty(this.mapboxVendorId)) {
            this.mapboxVendorId = TelemetryUtils.buildUUID();
            Editor edit = sharedPreferences.edit();
            edit.putString(str, this.mapboxVendorId);
            edit.apply();
        }
        setTelemetryEnabled(isTelemetryEnabled());
    }

    private void pushTurnstileEvent() {
        Hashtable customTurnstileEvent = getCustomTurnstileEvent();
        if (customTurnstileEvent == null) {
            customTurnstileEvent = new Hashtable();
            customTurnstileEvent.put("event", MapboxEvent.TYPE_TURNSTILE);
        }
        customTurnstileEvent.put("created", TelemetryUtils.generateCreateDate(null));
        customTurnstileEvent.put("userId", this.mapboxVendorId);
        customTurnstileEvent.put(MapboxEvent.KEY_ENABLED_TELEMETRY, Boolean.valueOf(isTelemetryEnabled()));
        customTurnstileEvent.put("sdkIdentifier", addSdkIdentifier());
        customTurnstileEvent.put("sdkVersion", addSdkVersion());
        this.events.add(customTurnstileEvent);
        flushEventsQueueImmediately(true);
    }

    private void putEventOnQueue(Hashtable<String, Object> hashtable) {
        this.events.add(hashtable);
        if (this.events.size() >= 180) {
            flushEventsQueueImmediately(false);
        }
    }

    private void readDisplayMetrics() {
        this.displayMetrics = new DisplayMetrics();
        ((WindowManager) this.context.getSystemService("window")).getDefaultDisplay().getMetrics(this.displayMetrics);
    }

    private void registerBatteryUpdates() {
        this.batteryStatus = this.context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    private void rotateSessionId() {
        long currentTimeMillis = System.currentTimeMillis() - this.mapboxSessionIdLastSet;
        if (TextUtils.isEmpty(this.mapboxSessionId) || currentTimeMillis > ((long) (this.sessionIdRotationTime * TelemetryConstants.ONE_HOUR_IN_MS))) {
            this.mapboxSessionId = TelemetryUtils.buildUUID();
            this.mapboxSessionIdLastSet = System.currentTimeMillis();
        }
    }

    private void setUserAgent() {
        String str;
        if (TextUtils.isEmpty(TelemetryUtils.getApplicationIdentifier(this.context))) {
            str = this.userAgent;
        } else {
            str = akib.a(String.format(TelemetryConstants.DEFAULT_LOCALE, "%s %s", new Object[]{str, this.userAgent}));
        }
        this.client.setUserAgent(str);
    }

    private void setupHttpClient() {
        this.client = new TelemetryClient(this.accessToken);
    }

    private void shutdownTelemetry() {
        String str = LOG_TAG;
        Log.d(str, "Shutting down telemetry service.");
        this.withShutDown = false;
        this.events.removeAllElements();
        Context context = this.context;
        context.stopService(new Intent(context, TelemetryService.class));
        LocationEngine locationEngine = this.locationEngine;
        if (locationEngine == null) {
            Log.e(str, String.format("Shutdown error: Location Engine instance wasn't set up (initialized: %b).", new Object[]{Boolean.valueOf(this.initialized)}));
        } else {
            locationEngine.removeLocationEngineListener(this);
            this.locationEngine.removeLocationUpdates();
            this.locationEngine.deactivate();
        }
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
            this.timer = null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x004c in {8, 9, 11, 14} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private void validateTelemetryServiceConfigured() {
        /*
        r6 = this;
        r0 = 0;
        r1 = r6.context;	 Catch:{ Exception -> 0x0034 }
        r1 = r1.getPackageManager();	 Catch:{ Exception -> 0x0034 }
        r2 = r6.context;	 Catch:{ Exception -> 0x0034 }
        r2 = r2.getPackageName();	 Catch:{ Exception -> 0x0034 }
        r3 = 4;	 Catch:{ Exception -> 0x0034 }
        r1 = r1.getPackageInfo(r2, r3);	 Catch:{ Exception -> 0x0034 }
        r2 = r1.services;	 Catch:{ Exception -> 0x0034 }
        if (r2 == 0) goto L_0x002c;	 Catch:{ Exception -> 0x0034 }
        r1 = r1.services;	 Catch:{ Exception -> 0x0034 }
        r2 = r1.length;	 Catch:{ Exception -> 0x0034 }
        r3 = 0;	 Catch:{ Exception -> 0x0034 }
        if (r3 >= r2) goto L_0x002c;	 Catch:{ Exception -> 0x0034 }
        r4 = r1[r3];	 Catch:{ Exception -> 0x0034 }
        r5 = "com.mapbox.services.android.telemetry.service.TelemetryService";	 Catch:{ Exception -> 0x0034 }
        r4 = r4.name;	 Catch:{ Exception -> 0x0034 }
        r4 = android.text.TextUtils.equals(r5, r4);	 Catch:{ Exception -> 0x0034 }
        if (r4 == 0) goto L_0x0029;
        return;
        r3 = r3 + 1;
        goto L_0x001a;
        r0 = new com.mapbox.services.android.telemetry.TelemetryException;
        r1 = "Please, make sure you add the Telemetry service (`com.mapbox.services.android.telemetry.service.TelemetryService`) to your `AndroidManifest.xml` file. For more information, please visit https://www.mapbox.com/android-sdk.";
        r0.<init>(r1);
        throw r0;
        r1 = move-exception;
        r2 = new com.mapbox.services.android.telemetry.TelemetryException;
        r3 = com.mapbox.services.android.telemetry.constants.TelemetryConstants.DEFAULT_LOCALE;
        r4 = 1;
        r4 = new java.lang.Object[r4];
        r1 = r1.getMessage();
        r4[r0] = r1;
        r0 = "Failed to find the Telemetry service in your `AndroidManifest.xml` file (%s). For more information, please visit https://www.mapbox.com/android-sdk.";
        r0 = java.lang.String.format(r3, r0, r4);
        r2.<init>(r0);
        throw r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.services.android.telemetry.MapboxTelemetry.validateTelemetryServiceConfigured():void");
    }

    @Experimental
    public void addAbsoluteDistanceToDestination(int i, Hashtable<String, Object> hashtable) {
        hashtable.put(MapboxNavigationEvent.KEY_ABSOLUTE_DISTANCE_TO_DESTINATION, Integer.valueOf(i));
    }

    @Experimental
    public void addCommentToCancel(String str, Hashtable<String, Object> hashtable) {
        hashtable.put(MapboxNavigationEvent.KEY_COMMENT, str);
    }

    @Experimental
    public void addLocationEngineName(String str, Hashtable<String, Object> hashtable) {
        hashtable.put(MapboxNavigationEvent.KEY_LOCATION_ENGINE, str);
    }

    /* Access modifiers changed, original: protected */
    public void addLocationEvent(Location location) {
        if (!(!isInitializedAndEnabled() || Double.isNaN(location.getLatitude()) || Double.isNaN(location.getLongitude()) || Double.isNaN(location.getAltitude()) || Float.isNaN(location.getAccuracy()) || Double.isInfinite(location.getLatitude()) || Double.isInfinite(location.getLongitude()) || Double.isInfinite(location.getAltitude()) || Float.isInfinite(location.getAccuracy()))) {
            double doubleValue = new BigDecimal(location.getLatitude()).setScale(7, 1).doubleValue();
            double doubleValue2 = new BigDecimal(location.getLongitude()).setScale(7, 1).doubleValue();
            Hashtable hashtable = new Hashtable();
            hashtable.put("event", MapboxEvent.TYPE_LOCATION);
            hashtable.put("created", TelemetryUtils.generateCreateDate(location));
            hashtable.put("source", MapboxEvent.SOURCE_MAPBOX);
            hashtable.put("sessionId", this.mapboxSessionId);
            hashtable.put("lat", Double.valueOf(doubleValue));
            hashtable.put("lng", Double.valueOf(doubleValue2));
            hashtable.put(MapboxEvent.KEY_ALTITUDE, Long.valueOf(Math.round(location.getAltitude())));
            hashtable.put(MapboxEvent.KEY_HORIZONTAL_ACCURACY, Integer.valueOf(Math.round(location.getAccuracy())));
            hashtable.put("operatingSystem", TelemetryConstants.OPERATING_SYSTEM);
            hashtable.put("applicationState", TelemetryUtils.getApplicationState(this.context));
            putEventOnQueue(hashtable);
            rotateSessionId();
        }
    }

    @Experimental
    public void addPercentTimeInForeground(int i, Hashtable<String, Object> hashtable) {
        hashtable.put(MapboxNavigationEvent.KEY_PERCENT_TIME_IN_FOREGROUND, Integer.valueOf(i));
    }

    @Experimental
    public void addPercentTimeInPortrait(int i, Hashtable<String, Object> hashtable) {
        hashtable.put(MapboxNavigationEvent.KEY_PERCENT_TIME_IN_PORTRAIT, Integer.valueOf(i));
    }

    @Experimental
    public void addRatingToCancel(int i, Hashtable<String, Object> hashtable) {
        hashtable.put(MapboxNavigationEvent.KEY_RATING, Integer.valueOf(i));
    }

    public void addTelemetryListener(TelemetryListener telemetryListener) {
        if (!this.telemetryListeners.contains(telemetryListener)) {
            this.telemetryListeners.add(telemetryListener);
        }
    }

    public void flushEventsQueueImmediately(boolean z) {
        if (this.initialized && this.events.size() > 0) {
            if (ConnectivityReceiver.isConnected(this.context) && (z || isTelemetryEnabled())) {
                this.client.sendEvents(this.events, this);
                Iterator it = this.telemetryListeners.iterator();
                while (it.hasNext()) {
                    ((TelemetryListener) it.next()).onSendEvents(this.events.size());
                }
            } else {
                this.events.removeAllElements();
            }
        }
        if (this.withShutDown) {
            shutdownTelemetry();
        }
    }

    public Hashtable<String, Object> getCustomTurnstileEvent() {
        return this.customTurnstileEvent;
    }

    public void initialize(Context context, String str, String str2) {
        if (!this.initialized) {
            Log.v(LOG_TAG, "Initializing telemetry.");
            this.context = context.getApplicationContext();
            this.accessToken = str;
            this.userAgent = str2;
            if (this.context == null || TextUtils.isEmpty(this.accessToken) || TextUtils.isEmpty(this.userAgent) || this.sdkIdentifier == null || this.sdkVersion == null) {
                throw new TelemetryException("Please, make sure you provide a valid context, access token, user agent, sdkIdentifier and sdkVersion. For more information, please visit https://www.mapbox.com/android-sdk.");
            }
            this.telemetryListeners = new CopyOnWriteArrayList();
            validateTelemetryServiceConfigured();
            setupHttpClient();
            checkStagingServerInformation();
            setUserAgent();
            rotateSessionId();
            readDisplayMetrics();
            registerBatteryUpdates();
            loadUserPreferences();
            this.initialized = true;
        }
    }

    public void initialize(Context context, String str, String str2, LocationEngine locationEngine) {
        this.locationEngine = locationEngine;
        initialize(context, str, str2);
    }

    public void initialize(Context context, String str, String str2, String str3, String str4) {
        this.sdkIdentifier = str3;
        this.sdkVersion = str4;
        initialize(context, str, str2);
    }

    @Experimental
    public boolean isDebugLoggingEnabled() {
        return this.debugLoggingEnabled;
    }

    public boolean isTelemetryEnabled() {
        if (this.telemetryEnabled == null) {
            this.telemetryEnabled = Boolean.valueOf(TelemetryUtils.getSharedPreferences(this.context).getBoolean(TelemetryConstants.MAPBOX_SHARED_PREFERENCE_KEY_TELEMETRY_ENABLED, true));
        }
        return this.telemetryEnabled.booleanValue();
    }

    @Experimental
    public void newUserAgent(String str) {
        if (isUserAgentValid(str)) {
            this.userAgent = str;
            setUserAgent();
        }
    }

    public void onConnected() {
    }

    public void onFailure(akgx akgx, IOException iOException) {
        Iterator it = this.telemetryListeners.iterator();
        while (it.hasNext()) {
            ((TelemetryListener) it.next()).onHttpFailure(iOException.getMessage());
        }
        this.events.removeAllElements();
        if (this.withShutDown) {
            shutdownTelemetry();
        }
    }

    public void onLocationChanged(Location location) {
        Intent intent = new Intent(TelemetryLocationReceiver.INTENT_STRING);
        intent.putExtra(MapboxEvent.TYPE_LOCATION, location);
        hc.a(this.context.getApplicationContext()).a(intent);
    }

    public void onResponse(akgx akgx, akhv akhv) {
        Iterator it = this.telemetryListeners.iterator();
        while (it.hasNext()) {
            ((TelemetryListener) it.next()).onHttpResponse(akhv.c(), akhv.c);
        }
        this.events.removeAllElements();
        if (!(akhv == null || akhv.g == null)) {
            akhv.g.close();
        }
        if (this.withShutDown) {
            shutdownTelemetry();
        }
    }

    public void pushEvent(Hashtable<String, Object> hashtable) {
        if (isInitializedAndEnabled() && hashtable != null) {
            String str = (String) hashtable.get("event");
            if (!TextUtils.isEmpty(str)) {
                boolean equalsIgnoreCase = str.equalsIgnoreCase(MapboxEvent.TYPE_MAP_LOAD);
                String str2 = MapboxEvent.KEY_WIFI;
                String str3 = MapboxEvent.KEY_CELLULAR_NETWORK_TYPE;
                String str4 = MapboxEvent.KEY_CARRIER;
                String str5 = MapboxEvent.KEY_PLUGGED_IN;
                String str6 = "batteryLevel";
                String str7 = "orientation";
                if (equalsIgnoreCase) {
                    hashtable.put("userId", this.mapboxVendorId);
                    hashtable.put(MapboxEvent.KEY_MODEL, Build.MODEL);
                    hashtable.put("operatingSystem", TelemetryConstants.OPERATING_SYSTEM);
                    hashtable.put(MapboxEvent.KEY_RESOLUTION, Float.valueOf(this.displayMetrics.density));
                    hashtable.put(MapboxEvent.KEY_ACCESSIBILITY_FONT_SCALE, Float.valueOf(TelemetryUtils.getAccesibilityFontScaleSize(this.context)));
                    hashtable.put(str7, TelemetryUtils.getOrientation(this.context));
                    hashtable.put(str6, Integer.valueOf(getBatteryLevel()));
                    hashtable.put(str5, Boolean.valueOf(isPluggedIn()));
                    hashtable.put(str4, TelemetryUtils.getCellularCarrier(this.context));
                    hashtable.put(str3, TelemetryUtils.getCellularNetworkType(this.context));
                    hashtable.put(str2, TelemetryUtils.getConnectedToWifi(this.context));
                    putEventOnQueue(hashtable);
                    pushTurnstileEvent();
                } else if (str.equalsIgnoreCase(MapboxEvent.TYPE_MAP_CLICK)) {
                    hashtable.put(str7, TelemetryUtils.getOrientation(this.context));
                    hashtable.put(str6, Integer.valueOf(getBatteryLevel()));
                    hashtable.put(str5, Boolean.valueOf(isPluggedIn()));
                    hashtable.put(str4, TelemetryUtils.getCellularCarrier(this.context));
                    hashtable.put(str3, TelemetryUtils.getCellularNetworkType(this.context));
                    hashtable.put(str2, TelemetryUtils.getConnectedToWifi(this.context));
                    putEventOnQueue(hashtable);
                } else if (str.equalsIgnoreCase(MapboxEvent.TYPE_MAP_DRAG_END)) {
                    hashtable.put(str7, TelemetryUtils.getOrientation(this.context));
                    hashtable.put(str6, Integer.valueOf(getBatteryLevel()));
                    hashtable.put(str5, Boolean.valueOf(isPluggedIn()));
                    hashtable.put(str4, TelemetryUtils.getCellularCarrier(this.context));
                    hashtable.put(str3, TelemetryUtils.getCellularNetworkType(this.context));
                    hashtable.put(str2, TelemetryUtils.getConnectedToWifi(this.context));
                    putEventOnQueue(hashtable);
                } else if (isANavigationEvent(str)) {
                    addGeneralNavigationMetadataTo(hashtable);
                    putEventOnQueue(hashtable);
                } else {
                    Log.w(LOG_TAG, String.format("Unknown event type provided: %s.", new Object[]{str}));
                }
            }
        }
    }

    public boolean removeTelemetryListener(TelemetryListener telemetryListener) {
        return this.telemetryListeners.remove(telemetryListener);
    }

    @Experimental
    public void setAccessToken(String str) {
        if (this.client == null || TextUtils.isEmpty(str)) {
            throw new TelemetryException("Please, make sure you have initialized MapboxTelemetry before resetting the access token and it's a valid one. For more information, please visit https://www.mapbox.com/android-sdk.");
        }
        this.accessToken = str;
        this.client.setAccessToken(str);
    }

    public void setCustomTurnstileEvent(Hashtable<String, Object> hashtable) {
        this.customTurnstileEvent = hashtable;
    }

    @Experimental
    public void setDebugLoggingEnabled(boolean z) {
        this.debugLoggingEnabled = z;
        TelemetryClient telemetryClient = this.client;
        if (telemetryClient != null) {
            telemetryClient.setDebugLoggingEnabled(z);
        }
    }

    @Experimental
    public void setSessionIdRotationTime(int i) {
        this.sessionIdRotationTime = i;
    }

    public void setTelemetryEnabled(boolean z) {
        boolean z2 = this.initialized;
        String str = LOG_TAG;
        if (z2 && isTelemetryEnabled() == z) {
            Log.v(str, String.format("Telemetry was already initialized on that state (enabled: %b).", new Object[]{Boolean.valueOf(z)}));
            return;
        }
        if (z) {
            Log.v(str, "Enabling telemetry.");
            Context context = this.context;
            context.startService(new Intent(context, TelemetryService.class));
            this.timer = new Timer();
            this.timer.schedule(new TimerTask() {
                public void run() {
                    MapboxTelemetry.this.flushEventsQueueImmediately(false);
                }
            }, TelemetryConstants.FLUSH_DELAY_MS, TelemetryConstants.FLUSH_PERIOD_MS);
        } else {
            Log.v(str, "Disabling telemetry.");
            this.withShutDown = true;
            pushTurnstileEvent();
        }
        this.telemetryEnabled = Boolean.valueOf(z);
        Editor edit = TelemetryUtils.getSharedPreferences(this.context).edit();
        edit.putBoolean(TelemetryConstants.MAPBOX_SHARED_PREFERENCE_KEY_TELEMETRY_ENABLED, z);
        edit.apply();
    }
}
