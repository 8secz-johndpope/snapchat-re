package com.google.android.gms.internal;

public final class zzjh extends zzflm<zzjh> {
    private Integer zzbdq;
    private zzju zzbdr;
    private zzju zzbds;
    private zzju zzbdt;
    private zzju[] zzbdu;
    private Integer zzbdv;

    public zzjh() {
        this.zzbdq = null;
        this.zzbdr = null;
        this.zzbds = null;
        this.zzbdt = null;
        this.zzbdu = zzju.zzhx();
        this.zzbdv = null;
        this.zzpvl = null;
        this.zzpnr = -1;
    }

    public final void zza(zzflk zzflk) {
        Integer num = this.zzbdq;
        if (num != null) {
            zzflk.zzad(1, num.intValue());
        }
        zzfls zzfls = this.zzbdr;
        if (zzfls != null) {
            zzflk.zza(2, zzfls);
        }
        zzfls = this.zzbds;
        if (zzfls != null) {
            zzflk.zza(3, zzfls);
        }
        zzfls = this.zzbdt;
        if (zzfls != null) {
            zzflk.zza(4, zzfls);
        }
        zzju[] zzjuArr = this.zzbdu;
        if (zzjuArr != null && zzjuArr.length > 0) {
            int i = 0;
            while (true) {
                zzju[] zzjuArr2 = this.zzbdu;
                if (i >= zzjuArr2.length) {
                    break;
                }
                zzfls zzfls2 = zzjuArr2[i];
                if (zzfls2 != null) {
                    zzflk.zza(5, zzfls2);
                }
                i++;
            }
        }
        num = this.zzbdv;
        if (num != null) {
            zzflk.zzad(6, num.intValue());
        }
        super.zza(zzflk);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzq() {
        int zzq = super.zzq();
        Integer num = this.zzbdq;
        if (num != null) {
            zzq += zzflk.zzag(1, num.intValue());
        }
        zzfls zzfls = this.zzbdr;
        if (zzfls != null) {
            zzq += zzflk.zzb(2, zzfls);
        }
        zzfls = this.zzbds;
        if (zzfls != null) {
            zzq += zzflk.zzb(3, zzfls);
        }
        zzfls = this.zzbdt;
        if (zzfls != null) {
            zzq += zzflk.zzb(4, zzfls);
        }
        zzju[] zzjuArr = this.zzbdu;
        if (zzjuArr != null && zzjuArr.length > 0) {
            int i = 0;
            while (true) {
                zzju[] zzjuArr2 = this.zzbdu;
                if (i >= zzjuArr2.length) {
                    break;
                }
                zzfls zzfls2 = zzjuArr2[i];
                if (zzfls2 != null) {
                    zzq += zzflk.zzb(5, zzfls2);
                }
                i++;
            }
        }
        num = this.zzbdv;
        return num != null ? zzq + zzflk.zzag(6, num.intValue()) : zzq;
    }
}
