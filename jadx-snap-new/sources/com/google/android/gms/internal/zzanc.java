package com.google.android.gms.internal;

final class zzanc implements Runnable {
    private /* synthetic */ zzanb zzdlw;

    zzanc(zzanb zzanb) {
        this.zzdlw = zzanb;
    }

    public final void run() {
        this.zzdlw.zza("surfaceCreated", new String[0]);
    }
}
