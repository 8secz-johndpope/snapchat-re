package com.google.android.gms.internal;

public final class zzfly extends zzflm<zzfly> {
    private static volatile zzfly[] zzpwt;
    public byte[] zzosz;
    public byte[] zzpwu;

    public zzfly() {
        this.zzpwu = null;
        this.zzosz = null;
        this.zzpvl = null;
        this.zzpnr = -1;
    }

    public static zzfly[] zzdcs() {
        if (zzpwt == null) {
            synchronized (zzflq.zzpvt) {
                if (zzpwt == null) {
                    zzpwt = new zzfly[0];
                }
            }
        }
        return zzpwt;
    }

    public final void zza(zzflk zzflk) {
        zzflk.zzc(1, this.zzpwu);
        byte[] bArr = this.zzosz;
        if (bArr != null) {
            zzflk.zzc(2, bArr);
        }
        super.zza(zzflk);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzq() {
        int zzq = super.zzq() + zzflk.zzd(1, this.zzpwu);
        byte[] bArr = this.zzosz;
        return bArr != null ? zzq + zzflk.zzd(2, bArr) : zzq;
    }
}
