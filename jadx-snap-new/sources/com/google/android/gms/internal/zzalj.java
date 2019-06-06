package com.google.android.gms.internal;

import java.util.concurrent.ExecutionException;

final /* synthetic */ class zzalj implements Runnable {
    private final zzalf zzdje;
    private final zzalt zzdjf;

    zzalj(zzalf zzalf, zzalt zzalt) {
        this.zzdje = zzalf;
        this.zzdjf = zzalt;
    }

    public final void run() {
        Throwable e;
        zzalf zzalf = this.zzdje;
        try {
            zzalf.onSuccess(this.zzdjf.get());
        } catch (ExecutionException e2) {
            e = e2.getCause();
            zzalf.zzb(e);
        } catch (InterruptedException e3) {
            e = e3;
            Thread.currentThread().interrupt();
            zzalf.zzb(e);
        } catch (Exception e4) {
            e = e4;
            zzalf.zzb(e);
        }
    }
}
