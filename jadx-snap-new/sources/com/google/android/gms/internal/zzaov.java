package com.google.android.gms.internal;

import java.util.Map;

final /* synthetic */ class zzaov implements Runnable {
    private final Map zzbzh;
    private final zzaou zzdrv;

    zzaov(zzaou zzaou, Map map) {
        this.zzdrv = zzaou;
        this.zzbzh = map;
    }

    public final void run() {
        this.zzdrv.zzr(this.zzbzh);
    }
}
