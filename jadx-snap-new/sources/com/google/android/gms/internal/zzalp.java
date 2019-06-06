package com.google.android.gms.internal;

import java.util.concurrent.ExecutionException;

final /* synthetic */ class zzalp implements Runnable {
    private final zzamd zzcdk;
    private final zzalt zzdjf;

    zzalp(zzamd zzamd, zzalt zzalt) {
        this.zzcdk = zzamd;
        this.zzdjf = zzalt;
    }

    public final void run() {
        Throwable e;
        zzamd zzamd = this.zzcdk;
        try {
            zzamd.set(this.zzdjf.get());
        } catch (ExecutionException e2) {
            e = e2.getCause();
            zzamd.setException(e);
        } catch (InterruptedException e3) {
            e = e3;
            Thread.currentThread().interrupt();
            zzamd.setException(e);
        } catch (Exception e4) {
            zzamd.setException(e4);
        }
    }
}
