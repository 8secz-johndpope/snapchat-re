package com.google.android.gms.internal;

public final class zzfmc extends zzflm<zzfmc> {
    private byte[] zzpxb;
    private Integer zzpxe;
    private byte[] zzpxf;

    public zzfmc() {
        this.zzpxe = null;
        this.zzpxf = null;
        this.zzpxb = null;
        this.zzpvl = null;
        this.zzpnr = -1;
    }

    public final void zza(zzflk zzflk) {
        Integer num = this.zzpxe;
        if (num != null) {
            zzflk.zzad(1, num.intValue());
        }
        byte[] bArr = this.zzpxf;
        if (bArr != null) {
            zzflk.zzc(2, bArr);
        }
        bArr = this.zzpxb;
        if (bArr != null) {
            zzflk.zzc(3, bArr);
        }
        super.zza(zzflk);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzq() {
        int zzq = super.zzq();
        Integer num = this.zzpxe;
        if (num != null) {
            zzq += zzflk.zzag(1, num.intValue());
        }
        byte[] bArr = this.zzpxf;
        if (bArr != null) {
            zzq += zzflk.zzd(2, bArr);
        }
        bArr = this.zzpxb;
        return bArr != null ? zzq + zzflk.zzd(3, bArr) : zzq;
    }
}
