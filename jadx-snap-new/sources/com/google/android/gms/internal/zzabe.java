package com.google.android.gms.internal;

final class zzabe implements Runnable {
    private /* synthetic */ zzakz zzcrc;
    private /* synthetic */ String zzcrd;

    zzabe(zzabb zzabb, zzakz zzakz, String str) {
        this.zzcrc = zzakz;
        this.zzcrd = str;
    }

    public final void run() {
        this.zzcrc.zzcp(this.zzcrd);
    }
}
