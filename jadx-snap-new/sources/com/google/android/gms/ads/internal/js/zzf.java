package com.google.android.gms.ads.internal.js;

import com.google.android.gms.common.util.zzt;

final /* synthetic */ class zzf implements zzt {
    private final com.google.android.gms.ads.internal.gmsg.zzt zzcez;

    zzf(com.google.android.gms.ads.internal.gmsg.zzt zzt) {
        this.zzcez = zzt;
    }

    public final boolean apply(Object obj) {
        com.google.android.gms.ads.internal.gmsg.zzt zzt = (com.google.android.gms.ads.internal.gmsg.zzt) obj;
        return (zzt instanceof zzl) && ((zzl) zzt).zzcfg.equals(this.zzcez);
    }
}
