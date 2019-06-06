package defpackage;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import com.brightcove.player.event.Event;
import com.mapbox.services.android.telemetry.navigation.MapboxNavigationEvent;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;
import org.opencv.imgproc.Imgproc;

/* renamed from: airf */
public final class airf {
    public static final Comparator<File> a = new 1();
    private static Boolean b;
    private static final char[] c = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static long d = -1;

    /* renamed from: airf$1 */
    static class 1 implements Comparator<File> {
        1() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return (int) (((File) obj).lastModified() - ((File) obj2).lastModified());
        }
    }

    /* renamed from: airf$a */
    public enum a {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        
        public static final Map<String, a> matcher = null;

        static {
            HashMap hashMap = new HashMap(4);
            matcher = hashMap;
            hashMap.put("armeabi-v7a", ARMV7);
            matcher.put("armeabi", ARMV6);
            matcher.put("arm64-v8a", ARM64);
            matcher.put("x86", X86_32);
        }
    }

    public static int a(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, airf.j(context));
    }

    public static synchronized long a() {
        long j;
        synchronized (airf.class) {
            if (d == -1) {
                j = 0;
                String a = airf.a(new File("/proc/meminfo"), "MemTotal");
                if (!TextUtils.isEmpty(a)) {
                    a = a.toUpperCase(Locale.US);
                    try {
                        if (a.endsWith("KB")) {
                            j = airf.a(a, "KB", (int) Imgproc.INTER_TAB_SIZE2);
                        } else if (a.endsWith("MB")) {
                            j = airf.a(a, "MB", 1048576);
                        } else if (a.endsWith("GB")) {
                            j = airf.a(a, "GB", (int) AudioPlayer.INFINITY_LOOP_COUNT);
                        } else {
                            aiqj.a().a("Fabric", "Unexpected meminfo format while computing RAM: ".concat(String.valueOf(a)));
                        }
                    } catch (NumberFormatException e) {
                        aiqj.a().c("Fabric", "Unexpected meminfo format while computing RAM: ".concat(String.valueOf(a)), e);
                    }
                }
                d = j;
            }
            j = d;
        }
        return j;
    }

    private static long a(String str, String str2, int i) {
        return Long.parseLong(str.split(str2)[0].trim()) * ((long) i);
    }

    public static RunningAppProcessInfo a(String str, Context context) {
        List<RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(Event.ACTIVITY)).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(str)) {
                    return runningAppProcessInfo;
                }
            }
        }
        return null;
    }

    public static Float a(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return null;
        }
        return Float.valueOf(((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
    }

    private static String a(File file, String str) {
        Throwable e;
        Throwable th;
        String str2 = "Failed to close system file reader.";
        String str3 = null;
        if (file.exists()) {
            Closeable bufferedReader;
            try {
                bufferedReader = new BufferedReader(new FileReader(file), Imgproc.INTER_TAB_SIZE2);
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        String[] split = Pattern.compile("\\s*:\\s*").split(readLine, 2);
                        if (split.length > 1 && split[0].equals(str)) {
                            str3 = split[1];
                            break;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        try {
                            aiqj.a().c("Fabric", "Error parsing ".concat(String.valueOf(file)), e);
                            airf.a(bufferedReader, str2);
                            return str3;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
            } catch (Exception e3) {
                e = e3;
                bufferedReader = null;
                aiqj.a().c("Fabric", "Error parsing ".concat(String.valueOf(file)), e);
                airf.a(bufferedReader, str2);
                return str3;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
                airf.a(bufferedReader, str2);
                throw th;
            }
            airf.a(bufferedReader, str2);
        }
        return str3;
    }

    public static String a(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : "";
    }

    private static String a(InputStream inputStream, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            byte[] bArr = new byte[Imgproc.INTER_TAB_SIZE2];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return airf.a(instance.digest());
                }
                instance.update(bArr, 0, read);
            }
        } catch (Exception e) {
            aiqj.a().c("Fabric", "Could not calculate hash for app icon.", e);
            return "";
        }
    }

    public static String a(String str, String str2) {
        return airf.a(str.getBytes(), str2);
    }

    public static String a(byte[] bArr) {
        char[] cArr = new char[(bArr.length << 1)];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i << 1;
            char[] cArr2 = c;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    private static String a(byte[] bArr, String str) {
        try {
            str = MessageDigest.getInstance(str);
            str.update(bArr);
            return airf.a(str.digest());
        } catch (NoSuchAlgorithmException e) {
            aiqr a = aiqj.a();
            StringBuilder stringBuilder = new StringBuilder("Could not create hashing algorithm: ");
            stringBuilder.append(str);
            stringBuilder.append(", returning empty string.");
            a.c("Fabric", stringBuilder.toString(), e);
            return "";
        }
    }

    public static String a(String... strArr) {
        ArrayList<String> arrayList = new ArrayList();
        for (int i = 0; i <= 0; i++) {
            String str = strArr[0];
            if (str != null) {
                arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder stringBuilder = new StringBuilder();
        for (String append : arrayList) {
            stringBuilder.append(append);
        }
        String stringBuilder2 = stringBuilder.toString();
        return stringBuilder2.length() > 0 ? airf.a(stringBuilder2, "SHA-1") : null;
    }

    public static void a(Context context, String str) {
        if (airf.i(context)) {
            aiqj.a().a("Fabric", str);
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void a(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                aiqj.a().c("Fabric", str, e);
            }
        }
    }

    public static void a(Flushable flushable, String str) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (IOException e) {
                aiqj.a().c("Fabric", str, e);
            }
        }
    }

    public static void a(InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static boolean a(Context context, String str, boolean z) {
        if (context != null) {
            Resources resources = context.getResources();
            if (resources != null) {
                int a = airf.a(context, str, "bool");
                if (a > 0) {
                    return resources.getBoolean(a);
                }
                int a2 = airf.a(context, str, "string");
                if (a2 > 0) {
                    return Boolean.parseBoolean(context.getString(a2));
                }
            }
        }
        return z;
    }

    public static boolean a(String str) {
        return str == null || str.length() == 0;
    }

    public static void b(Context context, String str) {
        if (airf.i(context)) {
            aiqj.a().e("Fabric", str);
        }
    }

    public static boolean b(Context context) {
        String string = Secure.getString(context.getContentResolver(), "android_id");
        if (!"sdk".equals(Build.PRODUCT)) {
            if (!("google_sdk".equals(Build.PRODUCT) || string == null)) {
                return false;
            }
        }
        return true;
    }

    public static void c(Context context, String str) {
        if (airf.i(context)) {
            aiqj.a().a(4, "Fabric", str);
        }
    }

    public static boolean c(Context context) {
        boolean b = airf.b(context);
        String str = Build.TAGS;
        if ((!b && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        return !b && new File("/system/xbin/su").exists();
    }

    public static String d(Context context, String str) {
        int a = airf.a(context, str, "string");
        return a > 0 ? context.getString(a) : "";
    }

    public static boolean d(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static String e(Context context) {
        Throwable e;
        Throwable th;
        String str = "Failed to close icon input stream.";
        String str2 = null;
        Closeable openRawResource;
        try {
            openRawResource = context.getResources().openRawResource(airf.f(context));
            try {
                String a = airf.a((InputStream) openRawResource, "SHA-1");
                if (!airf.a(a)) {
                    str2 = a;
                }
                airf.a(openRawResource, str);
                return str2;
            } catch (Exception e2) {
                e = e2;
                try {
                    aiqj.a().c("Fabric", "Could not calculate hash for app icon.", e);
                    airf.a(openRawResource, str);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    airf.a(openRawResource, str);
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            openRawResource = null;
            aiqj.a().c("Fabric", "Could not calculate hash for app icon.", e);
            airf.a(openRawResource, str);
            return null;
        } catch (Throwable th3) {
            th = th3;
            openRawResource = null;
            airf.a(openRawResource, str);
            throw th;
        }
    }

    private static boolean e(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static int f(Context context) {
        return context.getApplicationContext().getApplicationInfo().icon;
    }

    public static String g(Context context) {
        String str = "string";
        int a = airf.a(context, "io.fabric.android.build_id", str);
        if (a == 0) {
            a = airf.a(context, "com.crashlytics.android.build_id", str);
        }
        if (a == 0) {
            return null;
        }
        String string = context.getResources().getString(a);
        aiqj.a().a("Fabric", "Build ID is: ".concat(String.valueOf(string)));
        return string;
    }

    @SuppressLint({"MissingPermission"})
    public static boolean h(Context context) {
        if (!airf.e(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService(MapboxNavigationEvent.KEY_CONNECTIVITY)).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    private static boolean i(Context context) {
        if (b == null) {
            b = Boolean.valueOf(airf.a(context, "com.crashlytics.Trace", false));
        }
        return b.booleanValue();
    }

    private static String j(Context context) {
        int i = context.getApplicationContext().getApplicationInfo().icon;
        return i > 0 ? context.getResources().getResourcePackageName(i) : context.getPackageName();
    }
}
