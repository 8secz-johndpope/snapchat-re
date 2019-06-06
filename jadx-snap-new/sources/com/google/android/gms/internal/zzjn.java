package com.google.android.gms.internal;

public final class zzjn extends zzflm<zzjn> {
    private zzju zzbev;
    private Integer zzbew;
    private zzjl zzbex;
    private zzjt[] zzbey;

    public zzjn() {
        this.zzbex = null;
        this.zzbey = zzjt.zzhw();
        this.zzbew = null;
        this.zzbev = null;
        this.zzpvl = null;
        this.zzpnr = -1;
    }

    private final zzjn zzp(zzflj zzflj) {
        while (true) {
            int zzcxx = zzflj.zzcxx();
            if (zzcxx == 0) {
                return this;
            }
            zzfls zzfls;
            int length;
            if (zzcxx == 10) {
                if (this.zzbex == null) {
                    this.zzbex = new zzjl();
                }
                zzfls = this.zzbex;
            } else if (zzcxx == 18) {
                zzcxx = zzflv.zzb(zzflj, 18);
                zzjt[] zzjtArr = this.zzbey;
                length = zzjtArr == null ? 0 : zzjtArr.length;
                zzjt[] zzjtArr2 = new zzjt[(zzcxx + length)];
                if (length != 0) {
                    System.arraycopy(this.zzbey, 0, zzjtArr2, 0, length);
                }
                while (length < zzjtArr2.length - 1) {
                    zzjtArr2[length] = new zzjt();
                    zzflj.zza(zzjtArr2[length]);
                    zzflj.zzcxx();
                    length++;
                }
                zzjtArr2[length] = new zzjt();
                zzflj.zza(zzjtArr2[length]);
                this.zzbey = zzjtArr2;
            } else if (zzcxx == 24) {
                length = zzflj.getPosition();
                try {
                    this.zzbew = Integer.valueOf(zzjc.zzd(zzflj.zzcym()));
                } catch (IllegalArgumentException unused) {
                    zzflj.zzmw(length);
                    zza(zzflj, zzcxx);
                }
            } else if (zzcxx == 34) {
                if (this.zzbev == null) {
                    this.zzbev = new zzju();
                }
                zzfls = this.zzbev;
            } else if (!super.zza(zzflj, zzcxx)) {
                return this;
            }
            zzflj.zza(zzfls);
        }
    }

    public final void zza(zzflk zzflk) {
        zzfls zzfls = this.zzbex;
        if (zzfls != null) {
            zzflk.zza(1, zzfls);
        }
        zzjt[] zzjtArr = this.zzbey;
        if (zzjtArr != null && zzjtArr.length > 0) {
            int i = 0;
            while (true) {
                zzjt[] zzjtArr2 = this.zzbey;
                if (i >= zzjtArr2.length) {
                    break;
                }
                zzfls zzfls2 = zzjtArr2[i];
                if (zzfls2 != null) {
                    zzflk.zza(2, zzfls2);
                }
                i++;
            }
        }
        Integer num = this.zzbew;
        if (num != null) {
            zzflk.zzad(3, num.intValue());
        }
        zzfls = this.zzbev;
        if (zzfls != null) {
            zzflk.zza(4, zzfls);
        }
        super.zza(zzflk);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzq() {
        int zzq = super.zzq();
        zzfls zzfls = this.zzbex;
        if (zzfls != null) {
            zzq += zzflk.zzb(1, zzfls);
        }
        zzjt[] zzjtArr = this.zzbey;
        if (zzjtArr != null && zzjtArr.length > 0) {
            int i = 0;
            while (true) {
                zzjt[] zzjtArr2 = this.zzbey;
                if (i >= zzjtArr2.length) {
                    break;
                }
                zzfls zzfls2 = zzjtArr2[i];
                if (zzfls2 != null) {
                    zzq += zzflk.zzb(2, zzfls2);
                }
                i++;
            }
        }
        Integer num = this.zzbew;
        if (num != null) {
            zzq += zzflk.zzag(3, num.intValue());
        }
        zzfls = this.zzbev;
        return zzfls != null ? zzq + zzflk.zzb(4, zzfls) : zzq;
    }
}
