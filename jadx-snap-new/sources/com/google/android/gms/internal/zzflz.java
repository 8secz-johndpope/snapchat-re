package com.google.android.gms.internal;

public final class zzflz extends zzflm<zzflz> {
    private byte[] body;
    private zzfma zzpwv;
    public zzfly[] zzpww;
    private byte[] zzpwx;
    private Integer zzpwy;

    public zzflz() {
        this.zzpwv = null;
        this.zzpww = zzfly.zzdcs();
        this.body = null;
        this.zzpwx = null;
        this.zzpwy = null;
        this.zzpvl = null;
        this.zzpnr = -1;
    }

    public final void zza(zzflk zzflk) {
        zzfls zzfls = this.zzpwv;
        if (zzfls != null) {
            zzflk.zza(1, zzfls);
        }
        zzfly[] zzflyArr = this.zzpww;
        if (zzflyArr != null && zzflyArr.length > 0) {
            int i = 0;
            while (true) {
                zzfly[] zzflyArr2 = this.zzpww;
                if (i >= zzflyArr2.length) {
                    break;
                }
                zzfls zzfls2 = zzflyArr2[i];
                if (zzfls2 != null) {
                    zzflk.zza(2, zzfls2);
                }
                i++;
            }
        }
        byte[] bArr = this.body;
        if (bArr != null) {
            zzflk.zzc(3, bArr);
        }
        bArr = this.zzpwx;
        if (bArr != null) {
            zzflk.zzc(4, bArr);
        }
        Integer num = this.zzpwy;
        if (num != null) {
            zzflk.zzad(5, num.intValue());
        }
        super.zza(zzflk);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzq() {
        int zzq = super.zzq();
        zzfls zzfls = this.zzpwv;
        if (zzfls != null) {
            zzq += zzflk.zzb(1, zzfls);
        }
        zzfly[] zzflyArr = this.zzpww;
        if (zzflyArr != null && zzflyArr.length > 0) {
            int i = 0;
            while (true) {
                zzfly[] zzflyArr2 = this.zzpww;
                if (i >= zzflyArr2.length) {
                    break;
                }
                zzfls zzfls2 = zzflyArr2[i];
                if (zzfls2 != null) {
                    zzq += zzflk.zzb(2, zzfls2);
                }
                i++;
            }
        }
        byte[] bArr = this.body;
        if (bArr != null) {
            zzq += zzflk.zzd(3, bArr);
        }
        bArr = this.zzpwx;
        if (bArr != null) {
            zzq += zzflk.zzd(4, bArr);
        }
        Integer num = this.zzpwy;
        return num != null ? zzq + zzflk.zzag(5, num.intValue()) : zzq;
    }
}
