package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.search.SearchAdView;
import com.google.android.gms.common.util.zzs;
import com.google.android.gms.common.zzf;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;

@zzabh
public final class zzako {
    public static final Handler zzaju = new Handler(Looper.getMainLooper());
    private static final String zzdij = AdView.class.getName();
    private static final String zzdik = InterstitialAd.class.getName();
    private static final String zzdil = PublisherAdView.class.getName();
    private static final String zzdim = PublisherInterstitialAd.class.getName();
    private static final String zzdin = SearchAdView.class.getName();
    private static final String zzdio = AdLoader.class.getName();

    public static int zza(Context context, int i) {
        return zza(context.getResources().getDisplayMetrics(), i);
    }

    public static int zza(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, displayMetrics);
    }

    public static String zza(StackTraceElement[] stackTraceElementArr, String str) {
        int i;
        String str2;
        int i2 = 0;
        while (true) {
            i = i2 + 1;
            if (i >= stackTraceElementArr.length) {
                str2 = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            String className = stackTraceElement.getClassName();
            if (!("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (zzdij.equalsIgnoreCase(className) || zzdik.equalsIgnoreCase(className) || zzdil.equalsIgnoreCase(className) || zzdim.equalsIgnoreCase(className) || zzdin.equalsIgnoreCase(className) || zzdio.equalsIgnoreCase(className)))) {
                i2 = i;
            }
        }
        str2 = stackTraceElementArr[i].getClassName();
        if (str != null) {
            CharSequence str3;
            String str4 = ".";
            StringTokenizer stringTokenizer = new StringTokenizer(str3, str4);
            StringBuilder stringBuilder = new StringBuilder();
            int i3 = 2;
            if (stringTokenizer.hasMoreElements()) {
                stringBuilder.append(stringTokenizer.nextToken());
                while (true) {
                    int i4 = i3 - 1;
                    if (i3 <= 0 || !stringTokenizer.hasMoreElements()) {
                        str3 = stringBuilder.toString();
                    } else {
                        stringBuilder.append(str4);
                        stringBuilder.append(stringTokenizer.nextToken());
                        i3 = i4;
                    }
                }
                str3 = stringBuilder.toString();
            }
            return (str2 == null || str2.contains(str3)) ? null : str2;
        }
    }

    public static void zza(Context context, String str, String str2, Bundle bundle, boolean z, zzakr zzakr) {
        if (z) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            bundle.putString("os", VERSION.RELEASE);
            bundle.putString("api", String.valueOf(VERSION.SDK_INT));
            bundle.putString("appid", applicationContext.getPackageName());
            if (str == null) {
                zzf.zzahf();
                int zzcg = zzf.zzcg(context);
                StringBuilder stringBuilder = new StringBuilder(20);
                stringBuilder.append(zzcg);
                stringBuilder.append(".12211000");
                str = stringBuilder.toString();
            }
            bundle.putString("js", str);
        }
        Builder appendQueryParameter = new Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", str2);
        for (String str22 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str22, bundle.getString(str22));
        }
        zzakr.zzcp(appendQueryParameter.toString());
    }

    private final void zza(ViewGroup viewGroup, zzko zzko, String str, int i, int i2) {
        if (viewGroup.getChildCount() == 0) {
            Context context = viewGroup.getContext();
            TextView textView = new TextView(context);
            textView.setGravity(17);
            textView.setText(str);
            textView.setTextColor(i);
            textView.setBackgroundColor(i2);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(i);
            i = zza(context, 3);
            frameLayout.addView(textView, new LayoutParams(zzko.widthPixels - i, zzko.heightPixels - i, 17));
            viewGroup.addView(frameLayout, zzko.widthPixels, zzko.heightPixels);
        }
    }

    public static void zza(boolean z, HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setReadTimeout(60000);
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setUseCaches(false);
    }

    public static String zzaz(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Secure.getString(contentResolver, "android_id");
        if (string == null || zzrz()) {
            string = "emulator";
        }
        return zzcu(string);
    }

    public static int zzb(Context context, int i) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return zzb(displayMetrics, i);
    }

    public static int zzb(DisplayMetrics displayMetrics, int i) {
        return Math.round(((float) i) / displayMetrics.density);
    }

    public static String zzba(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        return contentResolver == null ? null : Secure.getString(contentResolver, "android_id");
    }

    public static boolean zzbb(Context context) {
        return zzf.zzahf().isGooglePlayServicesAvailable(context) == 0;
    }

    public static int zzbc(Context context) {
        return DynamiteModule.zzy(context, ModuleDescriptor.MODULE_ID);
    }

    public static int zzbd(Context context) {
        return DynamiteModule.zzx(context, ModuleDescriptor.MODULE_ID);
    }

    public static boolean zzbe(Context context) {
        int isGooglePlayServicesAvailable = zzf.zzahf().isGooglePlayServicesAvailable(context);
        return isGooglePlayServicesAvailable == 0 || isGooglePlayServicesAvailable == 2;
    }

    public static boolean zzbf(Context context) {
        if (context.getResources().getConfiguration().orientation != 2) {
            return false;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return ((int) (((float) displayMetrics.heightPixels) / displayMetrics.density)) < 600;
    }

    @TargetApi(17)
    public static boolean zzbg(Context context) {
        int i;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int i2;
        if (zzs.zzant()) {
            defaultDisplay.getRealMetrics(displayMetrics);
            i = displayMetrics.heightPixels;
            i2 = displayMetrics.widthPixels;
        } else {
            try {
                i = ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                i2 = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
            } catch (Exception unused) {
            }
        }
        defaultDisplay.getMetrics(displayMetrics);
        int i3 = displayMetrics.heightPixels;
        int i4 = displayMetrics.widthPixels;
        if (i3 == i && i4 == i2) {
            return true;
        }
        return false;
    }

    public static int zzbh(Context context) {
        int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
        return identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0;
    }

    public static Throwable zzc(Throwable th) {
        if (((Boolean) zzlc.zzio().zzd(zzoi.zzblj)).booleanValue()) {
            return th;
        }
        LinkedList linkedList = new LinkedList();
        Object th2;
        while (th2 != null) {
            linkedList.push(th2);
            th2 = th2.getCause();
        }
        th2 = null;
        while (!linkedList.isEmpty()) {
            Throwable th3 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th3.getStackTrace();
            ArrayList arrayList = new ArrayList();
            String str = "<filtered>";
            arrayList.add(new StackTraceElement(th3.getClass().getName(), str, str, 1));
            Object obj = null;
            for (Object obj2 : stackTrace) {
                Object obj22;
                if (zzcv(obj22.getClassName())) {
                    arrayList.add(obj22);
                    obj = 1;
                } else {
                    String className = obj22.getClassName();
                    Object obj3 = (TextUtils.isEmpty(className) || !(className.startsWith("android.") || className.startsWith("java."))) ? null : 1;
                    if (obj3 == null) {
                        obj22 = new StackTraceElement(str, str, str, 1);
                    }
                    arrayList.add(obj22);
                }
            }
            if (obj != null) {
                th2 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
        return th2;
    }

    public static String zzcu(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest.getInstance("MD5").update(str.getBytes());
                str = String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, r2.digest())});
                return str;
            } catch (NoSuchAlgorithmException unused) {
                i++;
            } catch (ArithmeticException unused2) {
                return null;
            }
        }
        return null;
    }

    public static boolean zzcv(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith((String) zzlc.zzio().zzd(zzoi.zzblk))) {
            return true;
        }
        Object str2;
        try {
            str2 = Class.forName(str2).isAnnotationPresent(zzabh.class);
            return str2;
        } catch (Exception e) {
            String str3 = "Fail to check class type for class ";
            str2 = String.valueOf(str2);
            zzaky.zza(str2.length() != 0 ? str3.concat(str2) : new String(str3), e);
            return false;
        }
    }

    public static boolean zzrz() {
        return Build.DEVICE.startsWith("generic");
    }

    public static boolean zzsa() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static String zzsb() {
        UUID randomUUID = UUID.randomUUID();
        byte[] toByteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] toByteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, toByteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(toByteArray);
                instance.update(toByteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(instance.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    public final void zza(Context context, String str, String str2, Bundle bundle, boolean z) {
        zza(context, null, str2, bundle, true, new zzakp(this));
    }

    public final void zza(ViewGroup viewGroup, zzko zzko, String str) {
        zza(viewGroup, zzko, str, -16777216, -1);
    }

    public final void zza(ViewGroup viewGroup, zzko zzko, String str, String str2) {
        zzaky.zzcz(str2);
        zza(viewGroup, zzko, str, -65536, -16777216);
    }
}
