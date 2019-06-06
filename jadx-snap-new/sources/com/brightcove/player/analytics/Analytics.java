package com.brightcove.player.analytics;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.Component;
import com.brightcove.player.event.Default;
import com.brightcove.player.event.Emits;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.event.EventType;
import com.brightcove.player.event.ListensFor;
import com.brightcove.player.media.CuePointFields;
import com.brightcove.player.media.HttpService;
import com.brightcove.player.model.Video;
import com.mapbox.services.android.telemetry.constants.TelemetryConstants;
import com.mapbox.services.android.telemetry.navigation.MapboxNavigationEvent;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;

@ListensFor(events = {"account", "activityStarted", "activityStopped", "adBreakStarted", "adBreakCompleted", "adProgress", "addAnalyticsBaseParams", "analyticsCatalogRequest", "analyticsCatalogResponse", "analyticsVideoEngagement", "bufferingCompleted", "bufferingStarted", "completed", "didPause", "didPlay", "didSeekTo", "didSetVideo", "error", "fragmentStarted", "fragmentStopped", "play", "progress", "setAnalyticsBaseParams", "version", "videoDurationChanged", "videoSizeKnown", "willChangeVideo"})
@Emits(events = {"account", "didSetAnalyticsBaseParams", "error"})
public class Analytics extends AbstractComponent {
    private static String H = null;
    public static final String TAG = "Analytics";
    int A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    Event F;
    private String G;
    private String I;
    private String J;
    private boolean K;
    private Context L;
    private Runnable M;
    private boolean N;
    final Map<String, String> a;
    int b;
    int c;
    int d;
    public String destination;
    boolean e;
    String f;
    String g;
    Handler h;
    long i;
    long j;
    long k;
    long l;
    long m;
    long n;
    long o;
    String p;
    int q;
    String r;
    int s;
    int t;
    long u;
    long v;
    int w;
    int x;
    int y;
    int z;

    public static class Fields {
        public static final String BASE_PARAMS = "baseParams";
    }

    class a extends AsyncTask<Map<String, String>, Integer, Void> {
        private HttpService a = new HttpService(60000, 60000);

        @SafeVarargs
        private Void a(Map<String, String>... mapArr) {
            String str = "error";
            Map map = mapArr[0];
            HashMap hashMap = new HashMap();
            for (Entry entry : map.entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            try {
                this.a.doGetRequest(HttpService.buildURIWithQueryParameters("https://metrics.brightcove.com/v2/tracker", hashMap));
            } catch (IOException | UnsupportedEncodingException | MalformedURLException | URISyntaxException e) {
                Analytics.this.eventEmitter.emit(str, Collections.singletonMap(str, e));
            }
            return null;
        }

        /* Access modifiers changed, original: protected|final|synthetic */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return a((Map[]) objArr);
        }
    }

    public Analytics(EventEmitter eventEmitter, Context context) {
        this(eventEmitter, context, Analytics.class);
    }

    private Analytics(EventEmitter eventEmitter, Context context, Class<? extends Component> cls) {
        super(eventEmitter, cls);
        this.a = new HashMap();
        this.J = "android-native-sdk";
        this.K = true;
        this.B = false;
        this.C = false;
        this.N = false;
        this.D = false;
        this.E = false;
        this.L = context;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                PackageManager packageManager = applicationContext.getPackageManager();
                if (packageManager != null) {
                    try {
                        String str = (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 0));
                        StringBuilder stringBuilder = new StringBuilder("bcsdk://");
                        stringBuilder.append(str);
                        stringBuilder.append("/");
                        stringBuilder.append(context.getClass().getPackage().getName());
                        setDestination(stringBuilder.toString());
                    } catch (NameNotFoundException unused) {
                        Log.w(TAG, "No application name found.");
                    }
                }
            }
        }
        this.eventEmitter.on(EventType.ADD_ANALYTICS_BASE_PARAMS, new EventListener() {
            @Default
            public final void processEvent(Event event) {
                Map map = (Map) event.properties.get(Fields.BASE_PARAMS);
                if (map != null) {
                    Analytics.this.a.putAll(map);
                }
                Analytics.a(Analytics.this);
            }
        });
        this.eventEmitter.on(EventType.SET_ANALYTICS_BASE_PARAMS, new EventListener() {
            @Default
            public final void processEvent(Event event) {
                Map map = (Map) event.properties.get(Fields.BASE_PARAMS);
                if (map != null) {
                    Analytics.this.a.clear();
                    Analytics.this.a.putAll(map);
                }
                Analytics.a(Analytics.this);
            }
        });
        this.eventEmitter.on(EventType.PLAY, new EventListener() {
            @Default
            public final void processEvent(Event event) {
                if (!Analytics.this.e) {
                    Analytics.this.j = System.currentTimeMillis();
                    Analytics.this.a(event, "play_request", null);
                }
            }
        });
        this.eventEmitter.on(EventType.DID_PLAY, new EventListener() {
            public final void processEvent(Event event) {
                if (Analytics.this.B) {
                    Analytics.b(Analytics.this);
                    Analytics.this.B = false;
                }
            }
        });
        this.eventEmitter.on(EventType.DID_PAUSE, new EventListener() {
            public final void processEvent(Event event) {
                if (!Analytics.this.C) {
                    Analytics.c(Analytics.this);
                    Analytics analytics = Analytics.this;
                    Analytics.a(analytics, event, analytics.c, Analytics.this.d);
                    Analytics analytics2 = Analytics.this;
                    analytics2.c = analytics2.d;
                    Analytics.this.B = true;
                }
            }
        });
        this.eventEmitter.on(EventType.DID_SET_VIDEO, new EventListener() {
            public final void processEvent(Event event) {
                Analytics.this.k = System.currentTimeMillis();
            }
        });
        this.eventEmitter.on(EventType.ANALYTICS_CATALOG_REQUEST, new EventListener() {
            public final void processEvent(Event event) {
                URI uri = (URI) event.properties.get(Event.CATALOG_URL);
                HashMap hashMap = new HashMap();
                hashMap.put("catalog_url", uri.toString());
                Analytics.this.a(event, "catalog_request", hashMap);
            }
        });
        this.eventEmitter.on(EventType.ANALYTICS_CATALOG_RESPONSE, new EventListener() {
            public final void processEvent(Event event) {
                URI uri = (URI) event.properties.get(Event.CATALOG_URL);
                long longValue = ((Long) event.properties.get(Event.RESPONSE_TIME_MS)).longValue();
                HashMap hashMap = new HashMap();
                hashMap.put("catalog_url", uri.toString());
                hashMap.put("response_time_ms", Long.toString(longValue));
                Analytics.this.a(event, "catalog_response", hashMap);
                Analytics.this.o = System.currentTimeMillis();
            }
        });
        this.eventEmitter.on(EventType.WILL_CHANGE_VIDEO, new EventListener() {
            @Default
            public final void processEvent(Event event) {
                Video video = (Video) event.properties.get(Event.CURRENT_VIDEO);
                String str = Event.VIDEO;
                if (video != null && Analytics.this.d - Analytics.this.c > 0) {
                    event.properties.put(str, video);
                    Analytics analytics = Analytics.this;
                    Analytics.a(analytics, event, analytics.c, Analytics.this.d);
                }
                video = (Video) event.properties.get(Event.NEXT_VIDEO);
                if (video != null) {
                    event.properties.put(str, video);
                    Analytics.this.a(event, "video_impression", null);
                    event.properties.remove(str);
                }
                Analytics analytics2 = Analytics.this;
                analytics2.d = 0;
                analytics2.c = 0;
                analytics2.b = 0;
                analytics2.e = false;
                analytics2.E = false;
                analytics2.k = 0;
                analytics2.j = 0;
                analytics2.i = 0;
                analytics2.o = 0;
                analytics2.l = 0;
                analytics2.n = 0;
                analytics2.m = 0;
                String str2 = "";
                analytics2.r = str2;
                analytics2.p = str2;
                analytics2.y = 0;
                analytics2.q = 0;
                analytics2.t = 0;
                analytics2.s = 0;
                analytics2.w = 0;
                analytics2.v = 0;
                analytics2.u = 0;
                analytics2.z = 0;
                analytics2.A = 0;
                analytics2.x = 0;
            }
        });
        this.eventEmitter.on(EventType.DID_SEEK_TO, new EventListener() {
            @Default
            public final void processEvent(Event event) {
                int integerProperty = event.getIntegerProperty(Event.SEEK_POSITION);
                if (integerProperty > 0 && integerProperty - Analytics.this.d > MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL) {
                    Analytics analytics = Analytics.this;
                    Analytics.a(analytics, event, analytics.c, Analytics.this.d);
                    Analytics analytics2 = Analytics.this;
                    analytics2.d = integerProperty;
                    analytics2.c = integerProperty;
                    analytics2.w = 0;
                    analytics2.v = 0;
                    analytics2.u = 0;
                }
            }
        });
        this.eventEmitter.on("progress", new EventListener() {
            @Default
            public final void processEvent(Event event) {
                Video video = (Video) event.properties.get(Event.VIDEO);
                int integerProperty = event.getIntegerProperty(Event.PLAYHEAD_POSITION);
                Analytics.this.b = event.getIntegerProperty("duration");
                Map map = event.properties;
                String str = Event.FORWARD_BUFFER_SECONDS;
                if (map.containsKey(str)) {
                    Analytics.this.x = event.getIntegerProperty(str);
                }
                if (integerProperty >= 0) {
                    if (Math.abs(Analytics.this.d - integerProperty) > 5000) {
                        Analytics analytics = Analytics.this;
                        analytics.d = integerProperty;
                        analytics.c = integerProperty;
                        return;
                    }
                    Analytics analytics2 = Analytics.this;
                    analytics2.F = event;
                    if (analytics2.d - Analytics.this.c >= 10000) {
                        analytics2 = Analytics.this;
                        analytics2.c = analytics2.d;
                    }
                    analytics2 = Analytics.this;
                    analytics2.d = integerProperty;
                    if (!(analytics2.e || video == null || Analytics.this.d == 0)) {
                        Analytics.this.i = System.currentTimeMillis();
                        long j = Analytics.this.o != 0 ? Analytics.this.k - Analytics.this.o : 0;
                        Analytics.b(Analytics.this);
                        Analytics analytics3 = Analytics.this;
                        analytics3.e = true;
                        if (analytics3.l == 0) {
                            analytics3 = Analytics.this;
                            analytics3.l = analytics3.n;
                        }
                        if (Analytics.this.j == 0) {
                            Log.e(Analytics.TAG, "videoViewStartTime is 0");
                        } else if (Analytics.this.m == 0 || Analytics.this.l != 0) {
                            long j2 = (Analytics.this.i - Analytics.this.j) - (Analytics.this.l - Analytics.this.m);
                            analytics3 = Analytics.this;
                            HashMap hashMap = new HashMap();
                            Object[] objArr = new Object[]{Long.valueOf(j)};
                            String str2 = "%d";
                            hashMap.put("load_time_ms", String.format(str2, objArr));
                            hashMap.put("start_time_ms", String.format(str2, new Object[]{Long.valueOf(j2)}));
                            analytics3.a(event, "video_view", hashMap);
                        } else {
                            Log.e(Analytics.TAG, "adEndTime and adProgressTime are 0.");
                        }
                    }
                }
            }
        });
        this.eventEmitter.on(EventType.COMPLETED, new EventListener() {
            @Default
            public final void processEvent(Event event) {
                int integerProperty = event.getIntegerProperty(Event.PLAYHEAD_POSITION);
                if (integerProperty >= 0) {
                    Analytics analytics = Analytics.this;
                    analytics.d = integerProperty;
                    Analytics.a(analytics, event, analytics.c, Analytics.this.d);
                    Analytics analytics2 = Analytics.this;
                    analytics2.c = analytics2.d;
                    Analytics.this.a(event, "video_complete", null);
                    Analytics.c(Analytics.this);
                    Analytics.this.E = true;
                }
            }
        });
        this.eventEmitter.on(EventType.VIDEO_DURATION_CHANGED, new EventListener() {
            @Default
            public final void processEvent(Event event) {
                int intValue = ((Integer) event.properties.get("duration")).intValue();
                if (intValue > 0) {
                    Analytics.this.b = intValue;
                }
            }
        });
        this.eventEmitter.on(EventType.AD_BREAK_STARTED, new EventListener() {
            public final void processEvent(Event event) {
                Analytics.this.m = System.currentTimeMillis();
                Analytics.this.a(event, "ad_start", null);
                Analytics.c(Analytics.this);
                Analytics analytics = Analytics.this;
                Analytics.a(analytics, event, analytics.c, Analytics.this.d);
                Analytics analytics2 = Analytics.this;
                analytics2.C = true;
                analytics2.c = analytics2.d;
            }
        });
        this.eventEmitter.on(EventType.AD_PROGRESS, new EventListener() {
            public final void processEvent(Event event) {
                Analytics.this.n = System.currentTimeMillis();
            }
        });
        this.eventEmitter.on(EventType.AD_BREAK_COMPLETED, new EventListener() {
            public final void processEvent(Event event) {
                Analytics.this.l = System.currentTimeMillis();
                Analytics.this.a(event, "ad_end", null);
                Analytics.b(Analytics.this);
                Analytics analytics = Analytics.this;
                analytics.C = false;
                if (analytics.E) {
                    Analytics.c(Analytics.this);
                    Analytics.this.E = false;
                }
            }
        });
        this.eventEmitter.on("version", new EventListener() {
            @Default
            public final void processEvent(Event event) {
                Analytics.this.g = (String) event.properties.get(Event.BUILD_VERSION);
            }
        });
        this.eventEmitter.on(EventType.ANALYTICS_VIDEO_ENGAGEMENT, new EventListener() {
            public final void processEvent(Event event) {
                Map map = event.properties;
                String str = Event.RENDITION_URL;
                if (map.containsKey(str)) {
                    Analytics.this.p = (String) event.properties.get(str);
                }
                map = event.properties;
                str = Event.RENDITION_INDICATED_BPS;
                if (map.containsKey(str)) {
                    Analytics.this.q = event.getIntegerProperty(str);
                }
                map = event.properties;
                str = Event.RENDITION_MIME_TYPE;
                if (map.containsKey(str)) {
                    Analytics.this.r = (String) event.properties.get(str);
                }
                map = event.properties;
                str = Event.RENDITION_HEIGHT;
                if (map.containsKey(str)) {
                    Analytics.this.s = event.getIntegerProperty(str);
                }
                map = event.properties;
                str = Event.RENDITION_WIDTH;
                if (map.containsKey(str)) {
                    Analytics.this.t = event.getIntegerProperty(str);
                }
                map = event.properties;
                str = Event.FORWARD_BUFFER_SECONDS;
                if (map.containsKey(str)) {
                    Analytics.this.x = event.getIntegerProperty(str);
                }
                map = event.properties;
                str = Event.MEASURED_BPS;
                if (map.containsKey(str)) {
                    Analytics.this.y = event.getIntegerProperty(str);
                }
            }
        });
        this.eventEmitter.on(EventType.BUFFERING_STARTED, new EventListener() {
            public final void processEvent(Event event) {
                Analytics analytics = Analytics.this;
                analytics.w++;
                Analytics.this.u = System.currentTimeMillis();
                Analytics.this.D = true;
            }
        });
        this.eventEmitter.on(EventType.BUFFERING_COMPLETED, new EventListener() {
            public final void processEvent(Event event) {
                Analytics analytics;
                if (Analytics.this.u == 0) {
                    Log.e(Analytics.TAG, "Buffer complete without buffer start time!");
                } else {
                    analytics = Analytics.this;
                    analytics.v += System.currentTimeMillis() - Analytics.this.u;
                }
                if (Analytics.this.v < 1000 && Analytics.this.w > 0) {
                    analytics = Analytics.this;
                    analytics.w--;
                }
                Analytics.this.D = false;
            }
        });
        this.eventEmitter.on(EventType.ACCOUNT, new EventListener() {
            public final void processEvent(Event event) {
                Analytics.this.f = (String) event.properties.get("value");
            }
        });
        this.eventEmitter.on(EventType.VIDEO_SIZE_KNOWN, new EventListener() {
            public final void processEvent(Event event) {
                Analytics.this.z = event.getIntegerProperty("width");
                Analytics.this.A = event.getIntegerProperty("height");
            }
        });
        this.eventEmitter.on(EventType.ACTIVITY_STOPPED, new EventListener() {
            public final void processEvent(Event event) {
                Analytics.c(Analytics.this);
            }
        });
        this.eventEmitter.on(EventType.ACTIVITY_STARTED, new EventListener() {
            public final void processEvent(Event event) {
                Analytics.b(Analytics.this);
            }
        });
        this.eventEmitter.on(EventType.FRAGMENT_STOPPED, new EventListener() {
            public final void processEvent(Event event) {
                Analytics.c(Analytics.this);
            }
        });
        this.eventEmitter.on(EventType.FRAGMENT_STARTED, new EventListener() {
            public final void processEvent(Event event) {
                Analytics.b(Analytics.this);
            }
        });
        this.eventEmitter.on("error", new EventListener() {
            public final void processEvent(Event event) {
                String str = (String) event.properties.get(Event.ERROR_CODE);
                String str2 = (String) event.properties.get(Event.ERROR_MESSAGE);
                Analytics analytics = Analytics.this;
                HashMap hashMap = new HashMap();
                if (!(str == null || str.isEmpty())) {
                    hashMap.put("error_code", str);
                }
                if (!(str2 == null || str2.isEmpty())) {
                    hashMap.put("error_description", str2);
                }
                analytics.a(event, "error", hashMap);
            }
        });
        this.G = a(context);
        if (H == null) {
            H = UUID.randomUUID().toString();
        }
    }

    private static String a(Context context) {
        String str = "tablet";
        if (context == null) {
            return str;
        }
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getPhoneType() != 0 ? "mobile" : str;
        } catch (IllegalStateException | UnsupportedOperationException unused) {
            return str;
        }
    }

    static /* synthetic */ void a(Analytics analytics, Event event, int i, int i2) {
        double d;
        if (i != 0) {
            d = (double) i;
            Double.isNaN(d);
            i = Double.valueOf(Math.ceil(d / 1000.0d)).intValue();
        }
        d = (double) i2;
        Double.isNaN(d);
        i2 = Double.valueOf(Math.floor(d / 1000.0d)).intValue();
        if (i2 >= i && i2 > 0) {
            int i3 = analytics.b;
            if (i3 <= 0 || i2 <= i3) {
                i3 = analytics.w;
                long currentTimeMillis = (analytics.D ? System.currentTimeMillis() - analytics.u : analytics.v) / 1000;
                HashMap hashMap = new HashMap();
                if (currentTimeMillis < 10) {
                    Object format;
                    Object obj;
                    if (analytics.b > 0) {
                        format = String.format("%d..%d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
                        obj = "range";
                    } else {
                        format = String.format("%d", new Object[]{Integer.valueOf(i2 - i)});
                        obj = "video_seconds_viewed";
                    }
                    hashMap.put(obj, format);
                }
                hashMap.put("rendition_url", analytics.p);
                hashMap.put("rendition_indicated_bps", Integer.toString(analytics.q));
                hashMap.put("rendition_mime_type", analytics.r);
                hashMap.put("rendition_height", Integer.toString(analytics.s));
                hashMap.put("rendition_width", Integer.toString(analytics.t));
                hashMap.put("rebuffering_seconds", Long.toString(currentTimeMillis));
                hashMap.put("rebuffering_count", Integer.toString(i3));
                hashMap.put("forward_buffer_seconds", Integer.toString(analytics.x));
                hashMap.put("measured_bps", Integer.toString(analytics.y));
                hashMap.put("player_width", Integer.toString(analytics.z));
                hashMap.put("player_height", Integer.toString(analytics.A));
                analytics.a(event, "video_engagement", hashMap);
                analytics.c = analytics.d;
            }
        }
    }

    static /* synthetic */ void b(Analytics analytics) {
        if (!analytics.N) {
            analytics.h = new Handler();
            analytics.M = new Runnable() {
                public final void run() {
                    if (Analytics.this.F != null) {
                        Analytics analytics = Analytics.this;
                        Analytics.a(analytics, analytics.F, Analytics.this.c, Analytics.this.d);
                        analytics = Analytics.this;
                        analytics.w = 0;
                        if (analytics.D) {
                            Analytics.this.u = System.currentTimeMillis();
                        } else {
                            Analytics.this.u = 0;
                        }
                        Analytics.this.v = 0;
                    }
                    Analytics.this.h.postDelayed(this, TelemetryConstants.FLUSH_DELAY_MS);
                }
            };
            analytics.h.postDelayed(analytics.M, TelemetryConstants.FLUSH_DELAY_MS);
            analytics.N = true;
        }
    }

    static /* synthetic */ void c(Analytics analytics) {
        Handler handler = analytics.h;
        if (handler != null) {
            handler.removeCallbacks(analytics.M);
            analytics.N = false;
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(Event event, String str, Map<String, String> map) {
        Map map2;
        String stringProperty;
        if (map2 == null) {
            map2 = new HashMap();
        }
        Map map3 = event.properties;
        String str2 = Event.VIDEO;
        Video video = (Video) map3.get(str2);
        if (video != null) {
            String id = video.getId();
            if (!id.isEmpty()) {
                map2.put(str2, id);
            }
            if (this.f == null) {
                stringProperty = video.getStringProperty(com.brightcove.player.model.Video.Fields.PUBLISHER_ID);
                if (!(stringProperty == null || stringProperty.isEmpty())) {
                    setAccount(stringProperty);
                }
            }
        }
        stringProperty = this.f;
        if (stringProperty != null) {
            String stringProperty2;
            StringBuilder stringBuilder;
            map2.put(EventType.ACCOUNT, stringProperty);
            HashMap hashMap = new HashMap();
            hashMap.putAll(this.a);
            if (map2 != null) {
                hashMap.putAll(map2);
            }
            Video video2 = (Video) event.properties.get(str2);
            if (!(video2 == null || video2.getId() == null)) {
                stringProperty2 = video2.getStringProperty("name");
                if (!(stringProperty2 == null || stringProperty2.isEmpty())) {
                    hashMap.put("video_name", stringProperty2);
                }
            }
            if (this.b > 0) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(this.b / MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL);
                hashMap.put("video_duration", stringBuilder.toString());
            }
            hashMap.put("session", H);
            hashMap.put("event", str);
            hashMap.put("domain", "videocloud");
            hashMap.put("device_os", "android");
            hashMap.put("device_type", this.G);
            hashMap.put("device_os_version", VERSION.RELEASE);
            hashMap.put("device_cpu", VERSION.SDK_INT >= 21 ? Build.SUPPORTED_ABIS[0] : Build.CPU_ABI);
            hashMap.put(MapboxNavigationEvent.KEY_DEVICE, Build.DEVICE);
            hashMap.put("device_hardware", Build.HARDWARE);
            hashMap.put("device_manufacturer", Build.MANUFACTURER);
            hashMap.put("device_model", Build.MODEL);
            hashMap.put("device_product", Build.PRODUCT);
            stringBuilder = new StringBuilder();
            stringBuilder.append(new Date().getTime());
            hashMap.put(CuePointFields.TIME, stringBuilder.toString());
            hashMap.put("platform", this.J);
            hashMap.put("platform_version", this.g);
            stringProperty2 = this.destination;
            if (stringProperty2 != null) {
                hashMap.put("destination", stringProperty2);
            }
            stringProperty2 = this.I;
            if (stringProperty2 != null) {
                hashMap.put("source", stringProperty2);
            }
            if (this.K) {
                hashMap.put("user", Secure.getString(this.L.getContentResolver(), "android_id"));
            }
            a aVar = new a();
            HashMap[] hashMapArr = new HashMap[]{hashMap};
            if (VERSION.SDK_INT >= 14) {
                aVar.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, hashMapArr);
                return;
            } else {
                aVar.execute(hashMapArr);
                return;
            }
        }
        Log.e(TAG, "The account id must be sent with every analytics request.");
    }

    public String getAccount() {
        return this.f;
    }

    public boolean getUniqueIdentifierEnabled() {
        return this.K;
    }

    public void setAccount(String str) {
        this.f = str;
        HashMap hashMap = new HashMap();
        hashMap.put("value", str);
        this.eventEmitter.emit(EventType.ACCOUNT, hashMap);
    }

    public void setDestination(String str) {
        this.destination = str;
        Uri parse = Uri.parse(str);
        if (parse.getScheme() == null) {
            Log.e(TAG, "Invalid destination (a scheme is required): ".concat(String.valueOf(str)));
        }
        if (parse.getAuthority() == null) {
            Log.e(TAG, "Invalid destination (an authority is required): ".concat(String.valueOf(str)));
        }
    }

    public void setSource(String str) {
        this.I = str;
        Uri parse = Uri.parse(str);
        if (parse.getScheme() == null) {
            Log.e(TAG, "Invalid source (a scheme is required): ".concat(String.valueOf(str)));
        }
        if (parse.getAuthority() == null) {
            Log.e(TAG, "Invalid source (an authority is required): ".concat(String.valueOf(str)));
        }
    }

    public void setUniqueIdentifierEnabled(boolean z) {
        this.K = z;
    }
}
