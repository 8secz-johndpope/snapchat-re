package com.google.android.gms.internal;

final class zzzz implements Runnable {
    private /* synthetic */ zzamd zzcpd;
    private /* synthetic */ String zzcpe;
    private /* synthetic */ zzzy zzcpf;

    zzzz(zzzy zzzy, zzamd zzamd, String str) {
        this.zzcpf = zzzy;
        this.zzcpd = zzamd;
        this.zzcpe = str;
    }

    public final void run() {
        this.zzcpd.set((zzsb) this.zzcpf.zzcoy.zzdw().get(this.zzcpe));
    }
}
