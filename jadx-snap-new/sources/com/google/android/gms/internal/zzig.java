package com.google.android.gms.internal;

final class zzig implements Runnable {
    private /* synthetic */ zzif zzbay;

    zzig(zzif zzif) {
        this.zzbay = zzif;
    }

    public final void run() {
        this.zzbay.disconnect();
    }
}
