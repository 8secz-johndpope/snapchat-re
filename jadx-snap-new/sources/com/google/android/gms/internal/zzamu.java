package com.google.android.gms.internal;

final class zzamu implements Runnable {
    private /* synthetic */ zzamp zzdkz;
    private /* synthetic */ int zzdlc;
    private /* synthetic */ int zzdld;

    zzamu(zzamp zzamp, int i, int i2) {
        this.zzdkz = zzamp;
        this.zzdlc = i;
        this.zzdld = i2;
    }

    public final void run() {
        if (this.zzdkz.zzdky != null) {
            this.zzdkz.zzdky.zzf(this.zzdlc, this.zzdld);
        }
    }
}
