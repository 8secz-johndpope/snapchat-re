package com.google.android.gms.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

final /* synthetic */ class zzalk implements Runnable {
    private final zzamd zzcdk;
    private final zzale zzdjg;
    private final zzalt zzdjh;

    zzalk(zzamd zzamd, zzale zzale, zzalt zzalt) {
        this.zzcdk = zzamd;
        this.zzdjg = zzale;
        this.zzdjh = zzalt;
    }

    public final void run() {
        zzamd zzamd = this.zzcdk;
        try {
            zzamd.set(this.zzdjg.apply(this.zzdjh.get()));
        } catch (CancellationException unused) {
            zzamd.cancel(true);
        } catch (ExecutionException e) {
            Throwable e2 = e;
            Throwable cause = e2.getCause();
            if (cause != null) {
                e2 = cause;
            }
            zzamd.setException(e2);
        } catch (InterruptedException e3) {
            Thread.currentThread().interrupt();
            zzamd.setException(e3);
        } catch (Exception e4) {
            zzamd.setException(e4);
        }
    }
}
