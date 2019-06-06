package com.google.android.gms.internal;

import java.util.concurrent.Executor;

final /* synthetic */ class zzalo implements Runnable {
    private final zzamd zzcdk;
    private final zzalt zzdjf;
    private final Class zzdjk;
    private final zzald zzdjl;
    private final Executor zzdjm;

    zzalo(zzamd zzamd, zzalt zzalt, Class cls, zzald zzald, Executor executor) {
        this.zzcdk = zzamd;
        this.zzdjf = zzalt;
        this.zzdjk = cls;
        this.zzdjl = zzald;
        this.zzdjm = executor;
    }

    public final void run() {
        zzali.zza(this.zzcdk, this.zzdjf, this.zzdjk, this.zzdjl, this.zzdjm);
    }
}
