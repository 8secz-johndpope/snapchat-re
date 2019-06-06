package com.google.android.gms.internal;

final class zzand implements Runnable {
    private /* synthetic */ zzanb zzdlw;

    zzand(zzanb zzanb) {
        this.zzdlw = zzanb;
    }

    public final void run() {
        this.zzdlw.zza("surfaceDestroyed", new String[0]);
    }
}
