package com.google.android.gms.internal;

public final class zzfma extends zzflm<zzfma> {
    private byte[] zzpwz;
    private byte[] zzpxa;
    private byte[] zzpxb;

    public zzfma() {
        this.zzpwz = null;
        this.zzpxa = null;
        this.zzpxb = null;
        this.zzpvl = null;
        this.zzpnr = -1;
    }

    public final void zza(zzflk zzflk) {
        byte[] bArr = this.zzpwz;
        if (bArr != null) {
            zzflk.zzc(1, bArr);
        }
        bArr = this.zzpxa;
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
        byte[] bArr = this.zzpwz;
        if (bArr != null) {
            zzq += zzflk.zzd(1, bArr);
        }
        bArr = this.zzpxa;
        if (bArr != null) {
            zzq += zzflk.zzd(2, bArr);
        }
        bArr = this.zzpxb;
        return bArr != null ? zzq + zzflk.zzd(3, bArr) : zzq;
    }
}
