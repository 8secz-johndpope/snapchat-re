package com.google.android.gms.internal;

public final class zzbc extends zzflm<zzbc> {
    private Long zzeo;
    private Long zzep;
    public Long zzgc;
    public Long zzgd;
    public Long zzge;

    public zzbc() {
        this.zzeo = null;
        this.zzep = null;
        this.zzgc = null;
        this.zzgd = null;
        this.zzge = null;
        this.zzpnr = -1;
    }

    public final void zza(zzflk zzflk) {
        Long l = this.zzeo;
        if (l != null) {
            zzflk.zzf(1, l.longValue());
        }
        l = this.zzep;
        if (l != null) {
            zzflk.zzf(2, l.longValue());
        }
        l = this.zzgc;
        if (l != null) {
            zzflk.zzf(3, l.longValue());
        }
        l = this.zzgd;
        if (l != null) {
            zzflk.zzf(4, l.longValue());
        }
        l = this.zzge;
        if (l != null) {
            zzflk.zzf(5, l.longValue());
        }
        super.zza(zzflk);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzq() {
        int zzq = super.zzq();
        Long l = this.zzeo;
        if (l != null) {
            zzq += zzflk.zzc(1, l.longValue());
        }
        l = this.zzep;
        if (l != null) {
            zzq += zzflk.zzc(2, l.longValue());
        }
        l = this.zzgc;
        if (l != null) {
            zzq += zzflk.zzc(3, l.longValue());
        }
        l = this.zzgd;
        if (l != null) {
            zzq += zzflk.zzc(4, l.longValue());
        }
        l = this.zzge;
        return l != null ? zzq + zzflk.zzc(5, l.longValue()) : zzq;
    }
}
