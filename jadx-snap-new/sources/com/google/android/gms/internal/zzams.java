package com.google.android.gms.internal;

final class zzams implements Runnable {
    private /* synthetic */ zzamp zzdkz;
    private /* synthetic */ String zzdla;
    private /* synthetic */ String zzdlb;

    zzams(zzamp zzamp, String str, String str2) {
        this.zzdkz = zzamp;
        this.zzdla = str;
        this.zzdlb = str2;
    }

    public final void run() {
        if (this.zzdkz.zzdky != null) {
            this.zzdkz.zzdky.zzg(this.zzdla, this.zzdlb);
        }
    }
}
