package com.google.android.gms.internal;

final class zzadf implements Runnable {
    private /* synthetic */ zzada zzcve;

    zzadf(zzada zzada) {
        this.zzcve = zzada;
    }

    public final void run() {
        if (this.zzcve.zzcvd != null) {
            this.zzcve.zzcvd.release();
            this.zzcve.zzcvd = null;
        }
    }
}
