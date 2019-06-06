package com.google.android.gms.internal;

public final class zzbf extends zzflm<zzbf> {
    public Long zzgf;
    private String zzgn;
    private byte[] zzgo;

    public zzbf() {
        this.zzgf = null;
        this.zzgn = null;
        this.zzgo = null;
        this.zzpnr = -1;
    }

    public final void zza(zzflk zzflk) {
        Long l = this.zzgf;
        if (l != null) {
            zzflk.zzf(1, l.longValue());
        }
        String str = this.zzgn;
        if (str != null) {
            zzflk.zzp(3, str);
        }
        byte[] bArr = this.zzgo;
        if (bArr != null) {
            zzflk.zzc(4, bArr);
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
        String str = this.zzgn;
        if (str != null) {
            zzq += zzflk.zzq(3, str);
        }
        byte[] bArr = this.zzgo;
        return bArr != null ? zzq + zzflk.zzd(4, bArr) : zzq;
    }
}
