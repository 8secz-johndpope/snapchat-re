package com.google.android.gms.internal;

public final class zzfmf extends zzflm<zzfmf> {
    public String zzpxp;
    public Long zzpxq;
    public Boolean zzpxr;

    public zzfmf() {
        this.zzpxp = null;
        this.zzpxq = null;
        this.zzpxr = null;
        this.zzpvl = null;
        this.zzpnr = -1;
    }

    public final void zza(zzflk zzflk) {
        String str = this.zzpxp;
        if (str != null) {
            zzflk.zzp(1, str);
        }
        Long l = this.zzpxq;
        if (l != null) {
            zzflk.zzf(2, l.longValue());
        }
        Boolean bool = this.zzpxr;
        if (bool != null) {
            zzflk.zzl(3, bool.booleanValue());
        }
        super.zza(zzflk);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzq() {
        int zzq = super.zzq();
        String str = this.zzpxp;
        if (str != null) {
            zzq += zzflk.zzq(1, str);
        }
        Long l = this.zzpxq;
        if (l != null) {
            zzq += zzflk.zzc(2, l.longValue());
        }
        Boolean bool = this.zzpxr;
        if (bool == null) {
            return zzq;
        }
        bool.booleanValue();
        return zzq + (zzflk.zzlw(3) + 1);
    }
}
