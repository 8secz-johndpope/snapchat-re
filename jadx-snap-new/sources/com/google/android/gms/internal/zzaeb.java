package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.common.util.zzj;
import com.google.android.gms.common.util.zzs;
import com.mapbox.services.android.telemetry.navigation.MapboxNavigationEvent;
import java.util.Locale;
import org.opencv.imgproc.Imgproc;

public final class zzaeb {
    private float zzaxz;
    private int zzcse;
    private int zzcsf;
    private int zzcyb;
    private boolean zzcyc;
    private boolean zzcyd;
    private String zzcye;
    private String zzcyf;
    private boolean zzcyg;
    private boolean zzcyh;
    private boolean zzcyi;
    private boolean zzcyj;
    private String zzcyk;
    private String zzcyl;
    private String zzcym;
    private int zzcyn;
    private int zzcyo;
    private int zzcyp;
    private int zzcyq;
    private int zzcyr;
    private int zzcys;
    private double zzcyt;
    private boolean zzcyu;
    private boolean zzcyv;
    private int zzcyw;
    private String zzcyx;
    private String zzcyy;
    private boolean zzcyz;

    public zzaeb(Context context) {
        PackageManager packageManager = context.getPackageManager();
        zzl(context);
        zzm(context);
        zzn(context);
        Locale locale = Locale.getDefault();
        boolean z = true;
        this.zzcyc = zza(packageManager, "geo:0,0?q=donuts") != null;
        if (zza(packageManager, "http://www.google.com") == null) {
            z = false;
        }
        this.zzcyd = z;
        this.zzcyf = locale.getCountry();
        zzlc.zzij();
        this.zzcyg = zzako.zzrz();
        this.zzcyh = zzj.zzcw(context);
        this.zzcyk = locale.getLanguage();
        this.zzcyl = zzb(context, packageManager);
        this.zzcym = zza(context, packageManager);
        Resources resources = context.getResources();
        if (resources != null) {
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            if (displayMetrics != null) {
                this.zzaxz = displayMetrics.density;
                this.zzcse = displayMetrics.widthPixels;
                this.zzcsf = displayMetrics.heightPixels;
            }
        }
    }

    public zzaeb(Context context, zzaea zzaea) {
        context.getPackageManager();
        zzl(context);
        zzm(context);
        zzn(context);
        this.zzcyx = Build.FINGERPRINT;
        this.zzcyy = Build.DEVICE;
        boolean z = zzs.zzanr() && zzpf.zzh(context);
        this.zzcyz = z;
        this.zzcyc = zzaea.zzcyc;
        this.zzcyd = zzaea.zzcyd;
        this.zzcyf = zzaea.zzcyf;
        this.zzcyg = zzaea.zzcyg;
        this.zzcyh = zzaea.zzcyh;
        this.zzcyk = zzaea.zzcyk;
        this.zzcyl = zzaea.zzcyl;
        this.zzcym = zzaea.zzcym;
        this.zzaxz = zzaea.zzaxz;
        this.zzcse = zzaea.zzcse;
        this.zzcsf = zzaea.zzcsf;
    }

    private static ResolveInfo zza(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), Imgproc.FLOODFILL_FIXED_RANGE);
        } catch (Throwable th) {
            zzbt.zzep().zza(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    private static String zza(Context context, PackageManager packageManager) {
        try {
            PackageInfo packageInfo = zzbih.zzdd(context).getPackageInfo("com.android.vending", 128);
            if (packageInfo != null) {
                int i = packageInfo.versionCode;
                String str = packageInfo.packageName;
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 12);
                stringBuilder.append(i);
                stringBuilder.append(".");
                stringBuilder.append(str);
                return stringBuilder.toString();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private static String zzb(Context context, PackageManager packageManager) {
        ResolveInfo zza = zza(packageManager, "market://details?id=com.google.android.gms.ads");
        if (zza == null) {
            return null;
        }
        ActivityInfo activityInfo = zza.activityInfo;
        if (activityInfo == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = zzbih.zzdd(context).getPackageInfo(activityInfo.packageName, 0);
            if (packageInfo != null) {
                int i = packageInfo.versionCode;
                String str = activityInfo.packageName;
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 12);
                stringBuilder.append(i);
                stringBuilder.append(".");
                stringBuilder.append(str);
                return stringBuilder.toString();
            }
        } catch (NameNotFoundException unused) {
        }
        return null;
    }

    private final void zzl(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.zzcyb = audioManager.getMode();
                this.zzcyi = audioManager.isMusicActive();
                this.zzcyj = audioManager.isSpeakerphoneOn();
                this.zzcyn = audioManager.getStreamVolume(3);
                this.zzcyr = audioManager.getRingerMode();
                this.zzcys = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                zzbt.zzep().zza(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.zzcyb = -2;
        this.zzcyi = false;
        this.zzcyj = false;
        this.zzcyn = 0;
        this.zzcyr = 0;
        this.zzcys = 0;
    }

    @TargetApi(16)
    private final void zzm(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(MapboxNavigationEvent.KEY_CONNECTIVITY);
        this.zzcye = telephonyManager.getNetworkOperator();
        this.zzcyp = telephonyManager.getNetworkType();
        this.zzcyq = telephonyManager.getPhoneType();
        this.zzcyo = -2;
        this.zzcyv = false;
        this.zzcyw = -1;
        zzbt.zzel();
        if (zzaij.zzd(context, context.getPackageName(), "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.zzcyo = activeNetworkInfo.getType();
                this.zzcyw = activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.zzcyo = -1;
            }
            if (VERSION.SDK_INT >= 16) {
                this.zzcyv = connectivityManager.isActiveNetworkMetered();
            }
        }
    }

    private final void zzn(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            this.zzcyt = (double) (((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
            this.zzcyu = z;
            return;
        }
        this.zzcyt = -1.0d;
        this.zzcyu = false;
    }

    public final zzaea zzom() {
        return new zzaea(this.zzcyb, this.zzcyc, this.zzcyd, this.zzcye, this.zzcyf, this.zzcyg, this.zzcyh, this.zzcyi, this.zzcyj, this.zzcyk, this.zzcyl, this.zzcym, this.zzcyn, this.zzcyo, this.zzcyp, this.zzcyq, this.zzcyr, this.zzcys, this.zzaxz, this.zzcse, this.zzcsf, this.zzcyt, this.zzcyu, this.zzcyv, this.zzcyw, this.zzcyx, this.zzcyz, this.zzcyy);
    }
}
