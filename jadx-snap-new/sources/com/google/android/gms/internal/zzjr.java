package com.google.android.gms.internal;

public final class zzjr extends zzflm<zzjr> {
    private Integer zzbfn;
    private Integer zzbfo;

    public zzjr() {
        this.zzbfn = null;
        this.zzbfo = null;
        this.zzpvl = null;
        this.zzpnr = -1;
    }

    public final void zza(zzflk zzflk) {
        Integer num = this.zzbfn;
        if (num != null) {
            zzflk.zzad(1, num.intValue());
        }
        num = this.zzbfo;
        if (num != null) {
            zzflk.zzad(2, num.intValue());
        }
        super.zza(zzflk);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzq() {
        int zzq = super.zzq();
        Integer num = this.zzbfn;
        if (num != null) {
            zzq += zzflk.zzag(1, num.intValue());
        }
        num = this.zzbfo;
        return num != null ? zzq + zzflk.zzag(2, num.intValue()) : zzq;
    }
}
