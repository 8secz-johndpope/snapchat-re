package com.google.android.gms.internal;

import android.annotation.TargetApi;

@zzabh
@TargetApi(17)
public final class zzaki {
    private static zzaki zzdhu;
    String zzddt;

    private zzaki() {
    }

    public static zzaki zzru() {
        if (zzdhu == null) {
            zzdhu = new zzaki();
        }
        return zzdhu;
    }
}
