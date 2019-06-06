package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;

public final class zzj {
    private static Boolean zzgks;
    private static Boolean zzgkt;
    private static Boolean zzgku;

    @TargetApi(20)
    public static boolean zzcu(Context context) {
        if (zzgks == null) {
            boolean z = zzs.zzanw() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
            zzgks = Boolean.valueOf(z);
        }
        return zzgks.booleanValue();
    }

    @TargetApi(24)
    public static boolean zzcv(Context context) {
        return (!zzs.isAtLeastN() || zzcw(context)) && zzcu(context);
    }

    @TargetApi(21)
    public static boolean zzcw(Context context) {
        if (zzgkt == null) {
            boolean z = zzs.zzanx() && context.getPackageManager().hasSystemFeature("cn.google");
            zzgkt = Boolean.valueOf(z);
        }
        return zzgkt.booleanValue();
    }

    public static boolean zzcx(Context context) {
        if (zzgku == null) {
            boolean z = context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded");
            zzgku = Boolean.valueOf(z);
        }
        return zzgku.booleanValue();
    }
}
