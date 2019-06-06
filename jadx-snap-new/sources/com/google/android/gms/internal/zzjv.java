package com.google.android.gms.internal;

public final class zzjv extends zzflm<zzjv> {
    public Integer zzbfv;
    public Integer zzbfw;
    public Integer zzbfx;

    public zzjv() {
        this.zzbfv = null;
        this.zzbfw = null;
        this.zzbfx = null;
        this.zzpvl = null;
        this.zzpnr = -1;
    }

    public final void zza(zzflk zzflk) {
        Integer num = this.zzbfv;
        if (num != null) {
            zzflk.zzad(1, num.intValue());
        }
        num = this.zzbfw;
        if (num != null) {
            zzflk.zzad(2, num.intValue());
        }
        num = this.zzbfx;
        if (num != null) {
            zzflk.zzad(3, num.intValue());
        }
        super.zza(zzflk);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzq() {
        int zzq = super.zzq();
        Integer num = this.zzbfv;
        if (num != null) {
            zzq += zzflk.zzag(1, num.intValue());
        }
        num = this.zzbfw;
        if (num != null) {
            zzq += zzflk.zzag(2, num.intValue());
        }
        num = this.zzbfx;
        return num != null ? zzq + zzflk.zzag(3, num.intValue()) : zzq;
    }
}
