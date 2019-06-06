package com.google.android.gms.internal;

public final class zzjs extends zzflm<zzjs> {
    private Integer zzbfp;
    private Integer zzbfq;

    public zzjs() {
        this.zzbfp = null;
        this.zzbfq = null;
        this.zzpvl = null;
        this.zzpnr = -1;
    }

    public final void zza(zzflk zzflk) {
        Integer num = this.zzbfp;
        if (num != null) {
            zzflk.zzad(1, num.intValue());
        }
        num = this.zzbfq;
        if (num != null) {
            zzflk.zzad(2, num.intValue());
        }
        super.zza(zzflk);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzq() {
        int zzq = super.zzq();
        Integer num = this.zzbfp;
        if (num != null) {
            zzq += zzflk.zzag(1, num.intValue());
        }
        num = this.zzbfq;
        return num != null ? zzq + zzflk.zzag(2, num.intValue()) : zzq;
    }
}
