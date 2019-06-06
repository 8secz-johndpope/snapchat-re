package com.google.android.gms.internal;

import android.util.Log;

@zzabh
public class zzaky {
    public static void e(String str) {
        if (zzae(6)) {
            Log.e("Ads", str);
        }
    }

    public static void zza(String str, Throwable th) {
        if (zzae(3)) {
            Log.d("Ads", str, th);
        }
    }

    public static boolean zzae(int i) {
        return i >= 5 || Log.isLoggable("Ads", i);
    }

    public static void zzb(String str, Throwable th) {
        if (zzae(6)) {
            Log.e("Ads", str, th);
        }
    }

    public static void zzby(String str) {
        if (zzae(3)) {
            Log.d("Ads", str);
        }
    }

    public static void zzc(String str, Throwable th) {
        if (zzae(5)) {
            Log.w("Ads", str, th);
        }
    }

    public static void zzcy(String str) {
        if (zzae(4)) {
            Log.i("Ads", str);
        }
    }

    public static void zzcz(String str) {
        if (zzae(5)) {
            Log.w("Ads", str);
        }
    }
}
