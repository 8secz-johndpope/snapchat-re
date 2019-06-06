package com.google.android.gms.internal;

public final class zzju extends zzflm<zzju> {
    private static volatile zzju[] zzbfs;
    private Integer zzbft;
    private Integer zzbfu;

    public zzju() {
        this.zzbft = null;
        this.zzbfu = null;
        this.zzpvl = null;
        this.zzpnr = -1;
    }

    public static zzju[] zzhx() {
        if (zzbfs == null) {
            synchronized (zzflq.zzpvt) {
                if (zzbfs == null) {
                    zzbfs = new zzju[0];
                }
            }
        }
        return zzbfs;
    }

    public final void zza(zzflk zzflk) {
        Integer num = this.zzbft;
        if (num != null) {
            zzflk.zzad(1, num.intValue());
        }
        num = this.zzbfu;
        if (num != null) {
            zzflk.zzad(2, num.intValue());
        }
        super.zza(zzflk);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzq() {
        int zzq = super.zzq();
        Integer num = this.zzbft;
        if (num != null) {
            zzq += zzflk.zzag(1, num.intValue());
        }
        num = this.zzbfu;
        return num != null ? zzq + zzflk.zzag(2, num.intValue()) : zzq;
    }
}
