package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.AlertDialog.Builder;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Debug;
import android.os.Debug.MemoryInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import com.brightcove.player.event.Event;
import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.common.util.zzp;
import com.google.android.gms.common.util.zzs;
import com.mapbox.mapboxsdk.style.sources.RasterSource;
import com.mapbox.services.android.telemetry.navigation.MapboxNavigationEvent;
import defpackage.ppy;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;
import net.sqlcipher.database.SQLiteDatabase;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.opencv.imgproc.Imgproc;

@zzabh
public final class zzaij {
    public static final Handler zzdfn = new zzahx(Looper.getMainLooper());
    private final Object mLock = new Object();
    private String zzddt;
    private boolean zzdfo = true;
    private boolean zzdfp = false;
    private boolean zzdfq = false;
    private Pattern zzdfr;
    private Pattern zzdfs;

    public static Bundle zza(zzhm zzhm) {
        if (zzhm == null) {
            return null;
        }
        if (!((Boolean) zzlc.zzio().zzd(zzoi.zzbnn)).booleanValue()) {
            if (!((Boolean) zzlc.zzio().zzd(zzoi.zzbnp)).booleanValue()) {
                return null;
            }
        }
        if (zzbt.zzep().zzqe().zzqp() && zzbt.zzep().zzqe().zzqr()) {
            return null;
        }
        String zzgo;
        Object zzgp;
        String zzgq;
        if (zzhm.zzhb()) {
            zzhm.wakeup();
        }
        zzhg zzgz = zzhm.zzgz();
        if (zzgz != null) {
            zzgo = zzgz.zzgo();
            zzgp = zzgz.zzgp();
            zzgq = zzgz.zzgq();
            if (zzgo != null) {
                zzbt.zzep().zzqe().zzcb(zzgo);
            }
            if (zzgq != null) {
                zzbt.zzep().zzqe().zzcc(zzgq);
            }
        } else {
            zzgo = zzbt.zzep().zzqe().zzqq();
            zzgq = zzbt.zzep().zzqe().zzqs();
            zzgp = null;
        }
        Bundle bundle = new Bundle(1);
        if (zzgq != null) {
            if (((Boolean) zzlc.zzio().zzd(zzoi.zzbnp)).booleanValue() && !zzbt.zzep().zzqe().zzqr()) {
                bundle.putString("v_fp_vertical", zzgq);
            }
        }
        if (zzgo != null) {
            if (((Boolean) zzlc.zzio().zzd(zzoi.zzbnn)).booleanValue() && !zzbt.zzep().zzqe().zzqp()) {
                bundle.putString("fingerprint", zzgo);
                if (!zzgo.equals(zzgp)) {
                    bundle.putString("v_fp", zzgp);
                }
            }
        }
        return !bundle.isEmpty() ? bundle : null;
    }

    public static DisplayMetrics zza(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static PopupWindow zza(View view, int i, int i2, boolean z) {
        return new PopupWindow(view, i, i2, false);
    }

    public static String zza(Context context, View view, zzko zzko) {
        if (!((Boolean) zzlc.zzio().zzd(zzoi.zzbof)).booleanValue()) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", zzko.width);
            jSONObject2.put("height", zzko.height);
            jSONObject.put(Event.SIZE, jSONObject2);
            jSONObject.put(Event.ACTIVITY, zzam(context));
            if (!zzko.zzbib) {
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent != null) {
                        int i = -1;
                        if (parent instanceof ViewGroup) {
                            i = ((ViewGroup) parent).indexOfChild(view);
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("type", parent.getClass().getName());
                        jSONObject3.put("index_of_child", i);
                        jSONArray.put(jSONObject3);
                    }
                    view = (parent == null || !(parent instanceof View)) ? null : (View) parent;
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("parents", jSONArray);
                }
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            zzaky.zzc("Fail to get view hierarchy json", e);
            return null;
        }
    }

    public static String zza(InputStreamReader inputStreamReader) {
        StringBuilder stringBuilder = new StringBuilder(8192);
        char[] cArr = new char[ItemAnimator.FLAG_MOVED];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read == -1) {
                return stringBuilder.toString();
            }
            stringBuilder.append(cArr, 0, read);
        }
    }

    private final JSONArray zza(Collection<?> collection) {
        JSONArray jSONArray = new JSONArray();
        for (Object zza : collection) {
            zza(jSONArray, zza);
        }
        return jSONArray;
    }

    public static void zza(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            context.startActivity(intent);
        }
    }

    @TargetApi(18)
    public static void zza(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            if (((Boolean) zzlc.zzio().zzd(zzoi.zzbuo)).booleanValue()) {
                zzb(context, intent);
            }
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(uri2).length() + 26);
            stringBuilder.append("Opening ");
            stringBuilder.append(uri2);
            stringBuilder.append(" in a new browser.");
            zzaky.zzby(stringBuilder.toString());
        } catch (ActivityNotFoundException e) {
            zzaky.zzb("No browser is found.", e);
        }
    }

    public static void zza(Context context, String str, List<String> list) {
        for (String zzakd : list) {
            new zzakd(context, str, zzakd).zzns();
        }
    }

    private final void zza(JSONArray jSONArray, Object obj) {
        if (obj instanceof Bundle) {
            obj = zzd((Bundle) obj);
        } else if (obj instanceof Map) {
            obj = zzq((Map) obj);
        } else if (obj instanceof Collection) {
            obj = zza((Collection) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            JSONArray jSONArray2 = new JSONArray();
            for (Object zza : objArr) {
                zza(jSONArray2, zza);
            }
            jSONArray.put(jSONArray2);
            return;
        } else {
            jSONArray.put(obj);
            return;
        }
        jSONArray.put(obj);
    }

    private final void zza(JSONObject jSONObject, String str, Object obj) {
        if (obj instanceof Bundle) {
            obj = zzd((Bundle) obj);
        } else if (obj instanceof Map) {
            obj = zzq((Map) obj);
        } else {
            Collection collection;
            if (obj instanceof Collection) {
                if (str == null) {
                    str = "null";
                }
                collection = (Collection) obj;
            } else if (obj instanceof Object[]) {
                collection = Arrays.asList((Object[]) obj);
            } else {
                jSONObject.put(str, obj);
                return;
            }
            obj = zza(collection);
        }
        jSONObject.put(str, obj);
    }

    @TargetApi(24)
    public static boolean zza(Activity activity, Configuration configuration) {
        zzlc.zzij();
        int zza = zzako.zza((Context) activity, configuration.screenHeightDp);
        int zza2 = zzako.zza((Context) activity, configuration.screenWidthDp);
        DisplayMetrics zza3 = zza((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i = zza3.heightPixels;
        int i2 = zza3.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        identifier = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        double d = (double) activity.getResources().getDisplayMetrics().density;
        Double.isNaN(d);
        int round = ((int) Math.round(d + 0.5d)) * ((Integer) zzlc.zzio().zzd(zzoi.zzbuy)).intValue();
        return zzb(i, zza + identifier, round) && zzb(i2, zza2, round);
    }

    public static boolean zza(ClassLoader classLoader, Class<?> cls, String str) {
        try {
            return cls.isAssignableFrom(Class.forName(str, false, classLoader));
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean zzag(Context context) {
        String str;
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, Imgproc.FLOODFILL_FIXED_RANGE);
        if (resolveActivity == null || resolveActivity.activityInfo == null) {
            str = "Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.";
        } else {
            boolean z;
            String str2 = "com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".";
            if ((resolveActivity.activityInfo.configChanges & 16) == 0) {
                zzaky.zzcz(String.format(str2, new Object[]{"keyboard"}));
                z = false;
            } else {
                z = true;
            }
            if ((resolveActivity.activityInfo.configChanges & 32) == 0) {
                zzaky.zzcz(String.format(str2, new Object[]{"keyboardHidden"}));
                z = false;
            }
            if ((resolveActivity.activityInfo.configChanges & 128) == 0) {
                zzaky.zzcz(String.format(str2, new Object[]{"orientation"}));
                z = false;
            }
            if ((resolveActivity.activityInfo.configChanges & 256) == 0) {
                zzaky.zzcz(String.format(str2, new Object[]{"screenLayout"}));
                z = false;
            }
            if ((resolveActivity.activityInfo.configChanges & RasterSource.DEFAULT_TILE_SIZE) == 0) {
                zzaky.zzcz(String.format(str2, new Object[]{"uiMode"}));
                z = false;
            }
            if ((resolveActivity.activityInfo.configChanges & Imgproc.INTER_TAB_SIZE2) == 0) {
                zzaky.zzcz(String.format(str2, new Object[]{"screenSize"}));
                z = false;
            }
            if ((resolveActivity.activityInfo.configChanges & ItemAnimator.FLAG_MOVED) != 0) {
                return z;
            }
            str = String.format(str2, new Object[]{"smallestScreenSize"});
        }
        zzaky.zzcz(str);
        return false;
    }

    protected static String zzaj(Context context) {
        try {
            return new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return zzrb();
        }
    }

    public static Builder zzak(Context context) {
        return new Builder(context);
    }

    public static zznu zzal(Context context) {
        return new zznu(context);
    }

    private static String zzam(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(Event.ACTIVITY);
            if (activityManager == null) {
                return null;
            }
            List runningTasks = activityManager.getRunningTasks(1);
            if (!(runningTasks == null || runningTasks.isEmpty())) {
                RunningTaskInfo runningTaskInfo = (RunningTaskInfo) runningTasks.get(0);
                if (!(runningTaskInfo == null || runningTaskInfo.topActivity == null)) {
                    return runningTaskInfo.topActivity.getClassName();
                }
            }
            return null;
        } catch (Exception unused) {
        }
    }

    public static boolean zzan(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(Event.ACTIVITY);
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager != null) {
                if (keyguardManager != null) {
                    List<RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses == null) {
                        return false;
                    }
                    for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                        if (Process.myPid() == runningAppProcessInfo.pid) {
                            if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode()) {
                                PowerManager powerManager = (PowerManager) context.getSystemService("power");
                                if (powerManager == null ? false : powerManager.isScreenOn()) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static Bitmap zzao(Context context) {
        Bitmap bitmap = null;
        if (!(context instanceof Activity)) {
            return null;
        }
        try {
            if (((Boolean) zzlc.zzio().zzd(zzoi.zzbsa)).booleanValue()) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    bitmap = zzu(window.getDecorView().getRootView());
                }
            } else {
                bitmap = zzt(((Activity) context).getWindow().getDecorView());
            }
        } catch (RuntimeException e) {
            zzaky.zzb("Fail to capture screen shot", e);
        }
        return bitmap;
    }

    public static int zzap(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo == null ? 0 : applicationInfo.targetSdkVersion;
    }

    private static KeyguardManager zzaq(Context context) {
        Object systemService = context.getSystemService("keyguard");
        return (systemService == null || !(systemService instanceof KeyguardManager)) ? null : (KeyguardManager) systemService;
    }

    @TargetApi(16)
    public static boolean zzar(Context context) {
        if (context != null && zzs.zzans()) {
            KeyguardManager zzaq = zzaq(context);
            if (zzaq != null && zzaq.isKeyguardLocked()) {
                return true;
            }
        }
        return false;
    }

    public static boolean zzas(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            zzaky.zzb("Error loading class.", th);
            zzbt.zzep().zza(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    @TargetApi(18)
    public static void zzb(Context context, Intent intent) {
        if (intent != null && zzs.zzanu()) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            extras.putBinder("android.support.customtabs.extra.SESSION", null);
            extras.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(extras);
        }
    }

    private static boolean zzb(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    public static void zzc(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            zzaid.zzb(runnable);
        }
    }

    public static String zzci(String str) {
        return Uri.parse(str).buildUpon().query(null).build().toString();
    }

    public static int zzcj(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            str = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 22);
            stringBuilder.append("Could not parse value:");
            stringBuilder.append(str);
            zzaky.zzcz(stringBuilder.toString());
            return 0;
        }
    }

    public static boolean zzck(String str) {
        return TextUtils.isEmpty(str) ? false : str.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
    }

    public static String zzcn(String str) {
        return TextUtils.isEmpty(str) ? "" : str.split(";")[0].trim();
    }

    public static String zzco(String str) {
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        String[] split = str.split(";");
        if (split.length == 1) {
            return str2;
        }
        for (int i = 1; i < split.length; i++) {
            if (split[i].trim().startsWith("charset")) {
                String[] split2 = split[i].trim().split("=");
                if (split2.length > 1) {
                    return split2[1].trim();
                }
            }
        }
        return str2;
    }

    private final JSONObject zzd(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            zza(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public static boolean zzd(Context context, String str, String str2) {
        return zzbih.zzdd(context).checkPermission(str2, str) == 0;
    }

    public static void zze(Context context, String str, String str2) {
        List arrayList = new ArrayList();
        arrayList.add(str2);
        zza(context, str, arrayList);
    }

    public static Map<String, String> zzf(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : zzbt.zzen().zzg(uri)) {
            hashMap.put(str, uri.getQueryParameter(str));
        }
        return hashMap;
    }

    public static void zzf(Context context, String str, String str2) {
        try {
            FileOutputStream openFileOutput = context.openFileOutput(str, 0);
            openFileOutput.write(str2.getBytes("UTF-8"));
            openFileOutput.close();
        } catch (Exception e) {
            zzaky.zzb("Error writing to file in internal storage.", e);
        }
    }

    public static int[] zzf(Activity activity) {
        Window window = activity.getWindow();
        if (window == null || window.findViewById(16908290) == null) {
            return zzre();
        }
        return new int[]{window.findViewById(16908290).getWidth(), window.findViewById(16908290).getHeight()};
    }

    public static String zzm(Context context, String str) {
        try {
            return new String(zzp.zza(context.openFileInput(str), true), "UTF-8");
        } catch (IOException unused) {
            zzaky.zzby("Error reading from internal storage.");
            return "";
        }
    }

    public static Bitmap zzr(View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return createBitmap;
    }

    private static String zzrb() {
        StringBuilder stringBuilder = new StringBuilder(256);
        stringBuilder.append("Mozilla/5.0 (Linux; U; Android");
        if (VERSION.RELEASE != null) {
            stringBuilder.append(" ");
            stringBuilder.append(VERSION.RELEASE);
        }
        String str = "; ";
        stringBuilder.append(str);
        stringBuilder.append(Locale.getDefault());
        if (Build.DEVICE != null) {
            stringBuilder.append(str);
            stringBuilder.append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                stringBuilder.append(" Build/");
                stringBuilder.append(Build.DISPLAY);
            }
        }
        stringBuilder.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return stringBuilder.toString();
    }

    public static String zzrc() {
        return UUID.randomUUID().toString();
    }

    public static String zzrd() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append(" ");
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    private static int[] zzre() {
        return new int[]{0, 0};
    }

    public static Bundle zzrf() {
        Bundle bundle = new Bundle();
        try {
            if (((Boolean) zzlc.zzio().zzd(zzoi.zzbmj)).booleanValue()) {
                MemoryInfo memoryInfo = new MemoryInfo();
                Debug.getMemoryInfo(memoryInfo);
                bundle.putParcelable("debug_memory_info", memoryInfo);
            }
            if (((Boolean) zzlc.zzio().zzd(zzoi.zzbmk)).booleanValue()) {
                Runtime runtime = Runtime.getRuntime();
                bundle.putLong("runtime_free_memory", runtime.freeMemory());
                bundle.putLong("runtime_max_memory", runtime.maxMemory());
                bundle.putLong("runtime_total_memory", runtime.totalMemory());
            }
            bundle.putInt("web_view_count", zzbt.zzep().zzqd());
        } catch (Exception e) {
            zzaky.zzc("Unable to gather memory stats", e);
        }
        return bundle;
    }

    public static Bitmap zzs(View view) {
        if (view == null) {
            return null;
        }
        Bitmap zzu = zzu(view);
        if (zzu == null) {
            zzu = zzt(view);
        }
        return zzu;
    }

    private static Bitmap zzt(View view) {
        try {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width != 0) {
                if (height != 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Config.RGB_565);
                    Canvas canvas = new Canvas(createBitmap);
                    view.layout(0, 0, width, height);
                    view.draw(canvas);
                    return createBitmap;
                }
            }
            zzaky.zzcz("Width or height of view is zero");
            return null;
        } catch (RuntimeException e) {
            zzaky.zzb("Fail to capture the webview", e);
            return null;
        }
    }

    private static Bitmap zzu(View view) {
        Bitmap bitmap = null;
        try {
            boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
            view.setDrawingCacheEnabled(true);
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null) {
                bitmap = Bitmap.createBitmap(drawingCache);
            }
            view.setDrawingCacheEnabled(isDrawingCacheEnabled);
        } catch (RuntimeException e) {
            zzaky.zzb("Fail to capture the web view", e);
        }
        return bitmap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016 A:{RETURN} */
    public static boolean zzv(android.view.View r2) {
        /*
        r2 = r2.getRootView();
        r0 = 0;
        if (r2 == 0) goto L_0x0012;
    L_0x0007:
        r2 = r2.getContext();
        r1 = r2 instanceof android.app.Activity;
        if (r1 == 0) goto L_0x0012;
    L_0x000f:
        r2 = (android.app.Activity) r2;
        goto L_0x0013;
    L_0x0012:
        r2 = r0;
    L_0x0013:
        r1 = 0;
        if (r2 != 0) goto L_0x0017;
    L_0x0016:
        return r1;
    L_0x0017:
        r2 = r2.getWindow();
        if (r2 != 0) goto L_0x001e;
    L_0x001d:
        goto L_0x0022;
    L_0x001e:
        r0 = r2.getAttributes();
    L_0x0022:
        if (r0 == 0) goto L_0x002d;
    L_0x0024:
        r2 = r0.flags;
        r0 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;
        r2 = r2 & r0;
        if (r2 == 0) goto L_0x002d;
    L_0x002b:
        r2 = 1;
        return r2;
    L_0x002d:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzaij.zzv(android.view.View):boolean");
    }

    public static int zzw(View view) {
        if (view == null) {
            return -1;
        }
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof AdapterView)) {
            parent = parent.getParent();
        }
        return parent == null ? -1 : ((AdapterView) parent).getPositionForView(view);
    }

    public final JSONObject zza(Bundle bundle, JSONObject jSONObject) {
        if (bundle != null) {
            try {
                return zzd(bundle);
            } catch (JSONException e) {
                zzaky.zzb("Error converting Bundle to JSON", e);
            }
        }
        return null;
    }

    public final void zza(Context context, String str, WebSettings webSettings) {
        webSettings.setUserAgentString(zzl(context, str));
    }

    public final void zza(Context context, String str, String str2, Bundle bundle, boolean z) {
        if (z) {
            zzbt.zzel();
            bundle.putString(MapboxNavigationEvent.KEY_DEVICE, zzrd());
            bundle.putString("eids", TextUtils.join(ppy.b, zzoi.zzjf()));
        }
        zzlc.zzij();
        zzako.zza(context, str, str2, bundle, z, new zzaim(this, context, str));
    }

    public final void zza(Context context, String str, boolean z, HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty("User-Agent", zzl(context, str));
        httpURLConnection.setUseCaches(false);
    }

    public final void zza(Context context, List<String> list) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (!TextUtils.isEmpty(zzfxd.zzfk(activity))) {
                if (list == null) {
                    zzahw.v("Cannot ping urls: empty list.");
                } else if (zzpf.zzh(context)) {
                    zzpf zzpf = new zzpf();
                    zzpf.zza(new zzaik(this, list, zzpf, context));
                    zzpf.zzd(activity);
                } else {
                    zzahw.v("Cannot ping url because custom tabs is not supported");
                }
            }
        }
    }

    public final boolean zza(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return zza(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, zzaq(context));
    }

    public final boolean zza(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        Object obj;
        Object obj2;
        if (!zzbt.zzel().zzdfo) {
            if (keyguardManager == null ? false : keyguardManager.inKeyguardRestrictedInputMode()) {
                if (!(((Boolean) zzlc.zzio().zzd(zzoi.zzbqn)).booleanValue() && zzv(view))) {
                    obj = null;
                    if (view.getVisibility() == 0 && view.isShown()) {
                        obj2 = (powerManager != null || powerManager.isScreenOn()) ? 1 : null;
                        if (!(obj2 == null || obj == null)) {
                            if (((Boolean) zzlc.zzio().zzd(zzoi.zzbql)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        obj = 1;
        if (powerManager != null) {
        }
        if (((Boolean) zzlc.zzio().zzd(zzoi.zzbql)).booleanValue()) {
        }
        return true;
    }

    public final boolean zzah(Context context) {
        if (this.zzdfp) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.getApplicationContext().registerReceiver(new zzaio(this, null), intentFilter);
        this.zzdfp = true;
        return true;
    }

    public final boolean zzai(Context context) {
        if (this.zzdfq) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        context.getApplicationContext().registerReceiver(new zzain(this, null), intentFilter);
        this.zzdfq = true;
        return true;
    }

    public final void zzb(Context context, String str, String str2, Bundle bundle, boolean z) {
        if (((Boolean) zzlc.zzio().zzd(zzoi.zzbqq)).booleanValue()) {
            zza(context, str, str2, bundle, z);
        }
    }

    /* JADX WARNING: Missing block: B:9:0x0023, code skipped:
            if (((java.lang.String) com.google.android.gms.internal.zzlc.zzio().zzd(com.google.android.gms.internal.zzoi.zzbol)).equals(r3.zzdfr.pattern()) == false) goto L_0x0025;
     */
    public final boolean zzcl(java.lang.String r4) {
        /*
        r3 = this;
        r0 = android.text.TextUtils.isEmpty(r4);
        r1 = 0;
        if (r0 == 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        monitor-enter(r3);	 Catch:{ PatternSyntaxException -> 0x0046 }
        r0 = r3.zzdfr;	 Catch:{ all -> 0x0043 }
        if (r0 == 0) goto L_0x0025;
    L_0x000d:
        r0 = com.google.android.gms.internal.zzoi.zzbol;	 Catch:{ all -> 0x0043 }
        r2 = com.google.android.gms.internal.zzlc.zzio();	 Catch:{ all -> 0x0043 }
        r0 = r2.zzd(r0);	 Catch:{ all -> 0x0043 }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x0043 }
        r2 = r3.zzdfr;	 Catch:{ all -> 0x0043 }
        r2 = r2.pattern();	 Catch:{ all -> 0x0043 }
        r0 = r0.equals(r2);	 Catch:{ all -> 0x0043 }
        if (r0 != 0) goto L_0x0037;
    L_0x0025:
        r0 = com.google.android.gms.internal.zzoi.zzbol;	 Catch:{ all -> 0x0043 }
        r2 = com.google.android.gms.internal.zzlc.zzio();	 Catch:{ all -> 0x0043 }
        r0 = r2.zzd(r0);	 Catch:{ all -> 0x0043 }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x0043 }
        r0 = java.util.regex.Pattern.compile(r0);	 Catch:{ all -> 0x0043 }
        r3.zzdfr = r0;	 Catch:{ all -> 0x0043 }
    L_0x0037:
        r0 = r3.zzdfr;	 Catch:{ all -> 0x0043 }
        r4 = r0.matcher(r4);	 Catch:{ all -> 0x0043 }
        r4 = r4.matches();	 Catch:{ all -> 0x0043 }
        monitor-exit(r3);	 Catch:{ all -> 0x0043 }
        return r4;
    L_0x0043:
        r4 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0043 }
        throw r4;	 Catch:{ PatternSyntaxException -> 0x0046 }
    L_0x0046:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzaij.zzcl(java.lang.String):boolean");
    }

    /* JADX WARNING: Missing block: B:9:0x0023, code skipped:
            if (((java.lang.String) com.google.android.gms.internal.zzlc.zzio().zzd(com.google.android.gms.internal.zzoi.zzbom)).equals(r3.zzdfs.pattern()) == false) goto L_0x0025;
     */
    public final boolean zzcm(java.lang.String r4) {
        /*
        r3 = this;
        r0 = android.text.TextUtils.isEmpty(r4);
        r1 = 0;
        if (r0 == 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        monitor-enter(r3);	 Catch:{ PatternSyntaxException -> 0x0046 }
        r0 = r3.zzdfs;	 Catch:{ all -> 0x0043 }
        if (r0 == 0) goto L_0x0025;
    L_0x000d:
        r0 = com.google.android.gms.internal.zzoi.zzbom;	 Catch:{ all -> 0x0043 }
        r2 = com.google.android.gms.internal.zzlc.zzio();	 Catch:{ all -> 0x0043 }
        r0 = r2.zzd(r0);	 Catch:{ all -> 0x0043 }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x0043 }
        r2 = r3.zzdfs;	 Catch:{ all -> 0x0043 }
        r2 = r2.pattern();	 Catch:{ all -> 0x0043 }
        r0 = r0.equals(r2);	 Catch:{ all -> 0x0043 }
        if (r0 != 0) goto L_0x0037;
    L_0x0025:
        r0 = com.google.android.gms.internal.zzoi.zzbom;	 Catch:{ all -> 0x0043 }
        r2 = com.google.android.gms.internal.zzlc.zzio();	 Catch:{ all -> 0x0043 }
        r0 = r2.zzd(r0);	 Catch:{ all -> 0x0043 }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x0043 }
        r0 = java.util.regex.Pattern.compile(r0);	 Catch:{ all -> 0x0043 }
        r3.zzdfs = r0;	 Catch:{ all -> 0x0043 }
    L_0x0037:
        r0 = r3.zzdfs;	 Catch:{ all -> 0x0043 }
        r4 = r0.matcher(r4);	 Catch:{ all -> 0x0043 }
        r4 = r4.matches();	 Catch:{ all -> 0x0043 }
        monitor-exit(r3);	 Catch:{ all -> 0x0043 }
        return r4;
    L_0x0043:
        r4 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0043 }
        throw r4;	 Catch:{ PatternSyntaxException -> 0x0046 }
    L_0x0046:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzaij.zzcm(java.lang.String):boolean");
    }

    public final int[] zzg(Activity activity) {
        int[] zzf = zzf(activity);
        r1 = new int[2];
        zzlc.zzij();
        r1[0] = zzako.zzb((Context) activity, zzf[0]);
        zzlc.zzij();
        r1[1] = zzako.zzb((Context) activity, zzf[1]);
        return r1;
    }

    public final int[] zzh(Activity activity) {
        Window window = activity.getWindow();
        int[] zzre = (window == null || window.findViewById(16908290) == null) ? zzre() : new int[]{window.findViewById(16908290).getTop(), window.findViewById(16908290).getBottom()};
        r0 = new int[2];
        zzlc.zzij();
        r0[0] = zzako.zzb((Context) activity, zzre[0]);
        zzlc.zzij();
        r0[1] = zzako.zzb((Context) activity, zzre[1]);
        return r0;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:47:0x00d5 in {7, 11, 13, 24, 28, 29, 30, 31, 37, 40, 43, 46} preds:[]
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
    public final java.lang.String zzl(android.content.Context r5, java.lang.String r6) {
        /*
        r4 = this;
        r0 = r4.mLock;
        monitor-enter(r0);
        r1 = r4.zzddt;	 Catch:{ all -> 0x00d2 }
        if (r1 == 0) goto L_0x000b;	 Catch:{ all -> 0x00d2 }
        r5 = r4.zzddt;	 Catch:{ all -> 0x00d2 }
        monitor-exit(r0);	 Catch:{ all -> 0x00d2 }
        return r5;	 Catch:{ all -> 0x00d2 }
        if (r6 != 0) goto L_0x0013;	 Catch:{ all -> 0x00d2 }
        r5 = zzrb();	 Catch:{ all -> 0x00d2 }
        monitor-exit(r0);	 Catch:{ all -> 0x00d2 }
        return r5;
        r1 = com.google.android.gms.ads.internal.zzbt.zzen();	 Catch:{ Exception -> 0x001d }
        r1 = r1.getDefaultUserAgent(r5);	 Catch:{ Exception -> 0x001d }
        r4.zzddt = r1;	 Catch:{ Exception -> 0x001d }
    L_0x001d:
        r1 = r4.zzddt;	 Catch:{ all -> 0x00d2 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ all -> 0x00d2 }
        if (r1 == 0) goto L_0x006e;	 Catch:{ all -> 0x00d2 }
        com.google.android.gms.internal.zzlc.zzij();	 Catch:{ all -> 0x00d2 }
        r1 = com.google.android.gms.internal.zzako.zzsa();	 Catch:{ all -> 0x00d2 }
        if (r1 != 0) goto L_0x0068;	 Catch:{ all -> 0x00d2 }
        r1 = 0;	 Catch:{ all -> 0x00d2 }
        r4.zzddt = r1;	 Catch:{ all -> 0x00d2 }
        r1 = zzdfn;	 Catch:{ all -> 0x00d2 }
        r2 = new com.google.android.gms.internal.zzail;	 Catch:{ all -> 0x00d2 }
        r2.<init>(r4, r5);	 Catch:{ all -> 0x00d2 }
        r1.post(r2);	 Catch:{ all -> 0x00d2 }
        r1 = r4.zzddt;	 Catch:{ all -> 0x00d2 }
        if (r1 != 0) goto L_0x006e;
        r1 = r4.mLock;	 Catch:{ InterruptedException -> 0x0045 }
        r1.wait();	 Catch:{ InterruptedException -> 0x0045 }
        goto L_0x003b;
    L_0x0045:
        r1 = zzrb();	 Catch:{ all -> 0x00d2 }
        r4.zzddt = r1;	 Catch:{ all -> 0x00d2 }
        r1 = "Interrupted, use default user agent: ";	 Catch:{ all -> 0x00d2 }
        r2 = r4.zzddt;	 Catch:{ all -> 0x00d2 }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x00d2 }
        r3 = r2.length();	 Catch:{ all -> 0x00d2 }
        if (r3 == 0) goto L_0x005e;	 Catch:{ all -> 0x00d2 }
        r1 = r1.concat(r2);	 Catch:{ all -> 0x00d2 }
        goto L_0x0064;	 Catch:{ all -> 0x00d2 }
        r2 = new java.lang.String;	 Catch:{ all -> 0x00d2 }
        r2.<init>(r1);	 Catch:{ all -> 0x00d2 }
        r1 = r2;	 Catch:{ all -> 0x00d2 }
        com.google.android.gms.internal.zzaky.zzcz(r1);	 Catch:{ all -> 0x00d2 }
        goto L_0x003b;	 Catch:{ all -> 0x00d2 }
        r1 = zzaj(r5);	 Catch:{ all -> 0x00d2 }
        r4.zzddt = r1;	 Catch:{ all -> 0x00d2 }
        r1 = r4.zzddt;	 Catch:{ all -> 0x00d2 }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x00d2 }
        r2 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x00d2 }
        r2 = r2.length();	 Catch:{ all -> 0x00d2 }
        r2 = r2 + 10;	 Catch:{ all -> 0x00d2 }
        r3 = java.lang.String.valueOf(r6);	 Catch:{ all -> 0x00d2 }
        r3 = r3.length();	 Catch:{ all -> 0x00d2 }
        r2 = r2 + r3;	 Catch:{ all -> 0x00d2 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00d2 }
        r3.<init>(r2);	 Catch:{ all -> 0x00d2 }
        r3.append(r1);	 Catch:{ all -> 0x00d2 }
        r1 = " (Mobile; ";	 Catch:{ all -> 0x00d2 }
        r3.append(r1);	 Catch:{ all -> 0x00d2 }
        r3.append(r6);	 Catch:{ all -> 0x00d2 }
        r6 = r3.toString();	 Catch:{ all -> 0x00d2 }
        r4.zzddt = r6;	 Catch:{ all -> 0x00d2 }
        r5 = com.google.android.gms.internal.zzbih.zzdd(r5);	 Catch:{ Exception -> 0x00b6 }
        r5 = r5.zzaoe();	 Catch:{ Exception -> 0x00b6 }
        if (r5 == 0) goto L_0x00c0;	 Catch:{ Exception -> 0x00b6 }
        r5 = r4.zzddt;	 Catch:{ Exception -> 0x00b6 }
        r5 = java.lang.String.valueOf(r5);	 Catch:{ Exception -> 0x00b6 }
        r6 = ";aia";	 Catch:{ Exception -> 0x00b6 }
        r5 = r5.concat(r6);	 Catch:{ Exception -> 0x00b6 }
        r4.zzddt = r5;	 Catch:{ Exception -> 0x00b6 }
        goto L_0x00c0;
        r5 = move-exception;
        r6 = com.google.android.gms.ads.internal.zzbt.zzep();	 Catch:{ all -> 0x00d2 }
        r1 = "AdUtil.getUserAgent";	 Catch:{ all -> 0x00d2 }
        r6.zza(r5, r1);	 Catch:{ all -> 0x00d2 }
        r5 = r4.zzddt;	 Catch:{ all -> 0x00d2 }
        r5 = java.lang.String.valueOf(r5);	 Catch:{ all -> 0x00d2 }
        r6 = ")";	 Catch:{ all -> 0x00d2 }
        r5 = r5.concat(r6);	 Catch:{ all -> 0x00d2 }
        r4.zzddt = r5;	 Catch:{ all -> 0x00d2 }
        r5 = r4.zzddt;	 Catch:{ all -> 0x00d2 }
        monitor-exit(r0);	 Catch:{ all -> 0x00d2 }
        return r5;	 Catch:{ all -> 0x00d2 }
        r5 = move-exception;	 Catch:{ all -> 0x00d2 }
        monitor-exit(r0);	 Catch:{ all -> 0x00d2 }
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzaij.zzl(android.content.Context, java.lang.String):java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x0043 in {5, 6, 10, 11, 13} preds:[]
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
    public final org.json.JSONObject zzq(java.util.Map<java.lang.String, ?> r5) {
        /*
        r4 = this;
        r0 = new org.json.JSONObject;	 Catch:{ ClassCastException -> 0x0022 }
        r0.<init>();	 Catch:{ ClassCastException -> 0x0022 }
        r1 = r5.keySet();	 Catch:{ ClassCastException -> 0x0022 }
        r1 = r1.iterator();	 Catch:{ ClassCastException -> 0x0022 }
        r2 = r1.hasNext();	 Catch:{ ClassCastException -> 0x0022 }
        if (r2 == 0) goto L_0x0021;	 Catch:{ ClassCastException -> 0x0022 }
        r2 = r1.next();	 Catch:{ ClassCastException -> 0x0022 }
        r2 = (java.lang.String) r2;	 Catch:{ ClassCastException -> 0x0022 }
        r3 = r5.get(r2);	 Catch:{ ClassCastException -> 0x0022 }
        r4.zza(r0, r2, r3);	 Catch:{ ClassCastException -> 0x0022 }
        goto L_0x000d;
        return r0;
        r5 = move-exception;
        r0 = new org.json.JSONException;
        r1 = "Could not convert map to JSON: ";
        r5 = r5.getMessage();
        r5 = java.lang.String.valueOf(r5);
        r2 = r5.length();
        if (r2 == 0) goto L_0x003a;
        r5 = r1.concat(r5);
        goto L_0x003f;
        r5 = new java.lang.String;
        r5.<init>(r1);
        r0.<init>(r5);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzaij.zzq(java.util.Map):org.json.JSONObject");
    }
}
