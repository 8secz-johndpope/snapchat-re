package com.google.android.gms.internal;

final class zzaet implements Runnable {
    private /* synthetic */ zzahe zzant;
    private /* synthetic */ zzaer zzczx;

    zzaet(zzaer zzaer, zzahe zzahe) {
        this.zzczx = zzaer;
        this.zzant = zzahe;
    }

    public final void run() {
        this.zzczx.zzb(new zzahd(this.zzant, null, null, null, null, null, null, null));
    }
}
