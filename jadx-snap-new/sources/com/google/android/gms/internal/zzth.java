package com.google.android.gms.internal;

import android.os.RemoteException;

final /* synthetic */ class zzth implements Runnable {
    private final zztg zzcdg;
    private final zzsx zzcdh;
    private final zzamd zzcdi;
    private final zzsy zzcdj;

    zzth(zztg zztg, zzsx zzsx, zzamd zzamd, zzsy zzsy) {
        this.zzcdg = zztg;
        this.zzcdh = zzsx;
        this.zzcdi = zzamd;
        this.zzcdj = zzsy;
    }

    public final void run() {
        zztg zztg = this.zzcdg;
        zzsx zzsx = this.zzcdh;
        zzamd zzamd = this.zzcdi;
        try {
            zzamd.set(zzsx.zzle().zza(this.zzcdj));
        } catch (RemoteException e) {
            zzaky.zzb("Unable to obtain a cache service instance.", e);
            zzamd.setException(e);
            zztg.zzcdd.disconnect();
        }
    }
}
