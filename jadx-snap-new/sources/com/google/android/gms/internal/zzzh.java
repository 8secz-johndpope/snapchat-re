package com.google.android.gms.internal;

final class zzzh implements Runnable {
    private /* synthetic */ zzzg zzcog;

    zzzh(zzzg zzzg) {
        this.zzcog = zzzg;
    }

    public final void run() {
        if (this.zzcog.zzcof.get()) {
            zzaky.e("Timed out waiting for WebView to finish loading.");
            this.zzcog.cancel();
        }
    }
}
