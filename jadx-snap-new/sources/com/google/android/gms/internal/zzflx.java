package com.google.android.gms.internal;

public final class zzflx extends zzflm<zzflx> {
    public String zzdbn;

    public zzflx() {
        this.zzdbn = null;
        this.zzpvl = null;
        this.zzpnr = -1;
    }

    public final void zza(zzflk zzflk) {
        String str = this.zzdbn;
        if (str != null) {
            zzflk.zzp(1, str);
        }
        super.zza(zzflk);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzq() {
        int zzq = super.zzq();
        String str = this.zzdbn;
        return str != null ? zzq + zzflk.zzq(1, str) : zzq;
    }
}
