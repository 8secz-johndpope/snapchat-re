package com.google.android.gms.internal;

public final class zzbe extends zzflm<zzbe> {
    public byte[] data;
    public byte[] zzgk;
    public byte[] zzgl;
    public byte[] zzgm;

    public zzbe() {
        this.data = null;
        this.zzgk = null;
        this.zzgl = null;
        this.zzgm = null;
        this.zzpnr = -1;
    }

    public final void zza(zzflk zzflk) {
        byte[] bArr = this.data;
        if (bArr != null) {
            zzflk.zzc(1, bArr);
        }
        bArr = this.zzgk;
        if (bArr != null) {
            zzflk.zzc(2, bArr);
        }
        bArr = this.zzgl;
        if (bArr != null) {
            zzflk.zzc(3, bArr);
        }
        bArr = this.zzgm;
        if (bArr != null) {
            zzflk.zzc(4, bArr);
        }
        super.zza(zzflk);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzq() {
        int zzq = super.zzq();
        byte[] bArr = this.data;
        if (bArr != null) {
            zzq += zzflk.zzd(1, bArr);
        }
        bArr = this.zzgk;
        if (bArr != null) {
            zzq += zzflk.zzd(2, bArr);
        }
        bArr = this.zzgl;
        if (bArr != null) {
            zzq += zzflk.zzd(3, bArr);
        }
        bArr = this.zzgm;
        return bArr != null ? zzq + zzflk.zzd(4, bArr) : zzq;
    }
}
