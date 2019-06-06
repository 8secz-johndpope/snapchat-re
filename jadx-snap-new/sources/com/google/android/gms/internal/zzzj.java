package com.google.android.gms.internal;

final class zzzj implements Runnable {
    private /* synthetic */ zzzi zzcoh;

    zzzj(zzzi zzzi) {
        this.zzcoh = zzzi;
    }

    public final void run() {
        this.zzcoh.onStop();
    }
}
