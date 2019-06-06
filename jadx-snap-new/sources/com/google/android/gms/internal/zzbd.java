package com.google.android.gms.internal;

public final class zzbd extends zzflm<zzbd> {
    private Long zzgf;
    private Integer zzgg;
    private Boolean zzgh;
    private int[] zzgi;
    private Long zzgj;

    public zzbd() {
        this.zzgf = null;
        this.zzgg = null;
        this.zzgh = null;
        this.zzgi = zzflv.zzpvy;
        this.zzgj = null;
        this.zzpnr = -1;
    }

    public final void zza(zzflk zzflk) {
        Long l = this.zzgf;
        if (l != null) {
            zzflk.zzf(1, l.longValue());
        }
        Integer num = this.zzgg;
        if (num != null) {
            zzflk.zzad(2, num.intValue());
        }
        Boolean bool = this.zzgh;
        if (bool != null) {
            zzflk.zzl(3, bool.booleanValue());
        }
        int[] iArr = this.zzgi;
        if (iArr != null && iArr.length > 0) {
            int i = 0;
            while (true) {
                int[] iArr2 = this.zzgi;
                if (i >= iArr2.length) {
                    break;
                }
                zzflk.zzad(4, iArr2[i]);
                i++;
            }
        }
        l = this.zzgj;
        if (l != null) {
            zzflk.zza(5, l.longValue());
        }
        super.zza(zzflk);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzq() {
        int zzq = super.zzq();
        Long l = this.zzgf;
        if (l != null) {
            zzq += zzflk.zzc(1, l.longValue());
        }
        Integer num = this.zzgg;
        if (num != null) {
            zzq += zzflk.zzag(2, num.intValue());
        }
        Boolean bool = this.zzgh;
        if (bool != null) {
            bool.booleanValue();
            zzq += zzflk.zzlw(3) + 1;
        }
        int[] iArr = this.zzgi;
        if (iArr != null && iArr.length > 0) {
            int[] iArr2;
            int i = 0;
            int i2 = 0;
            while (true) {
                iArr2 = this.zzgi;
                if (i >= iArr2.length) {
                    break;
                }
                i2 += zzflk.zzlx(iArr2[i]);
                i++;
            }
            zzq = (zzq + i2) + (iArr2.length * 1);
        }
        l = this.zzgj;
        if (l == null) {
            return zzq;
        }
        return zzq + (zzflk.zzlw(5) + zzflk.zzdj(l.longValue()));
    }
}
