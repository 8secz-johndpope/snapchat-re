package com.google.android.gms.internal;

public final class zzfmv extends zzflm<zzfmv> {
    public long zzgoc;
    public String zzpzs;
    public String zzpzt;
    public long zzpzu = 0;
    public String zzpzv;
    public long zzpzw;
    public String zzpzx;
    public String zzpzy;
    public String zzpzz;
    public String zzqaa;
    public String zzqab;
    public int zzqac;
    public zzfmu[] zzqad;

    public zzfmv() {
        String str = "";
        this.zzpzs = str;
        this.zzpzt = str;
        this.zzpzv = str;
        this.zzpzw = 0;
        this.zzgoc = 0;
        this.zzpzx = str;
        this.zzpzy = str;
        this.zzpzz = str;
        this.zzqaa = str;
        this.zzqab = str;
        this.zzqac = 0;
        this.zzqad = zzfmu.zzddi();
        this.zzpvl = null;
        this.zzpnr = -1;
    }

    public static zzfmv zzbi(byte[] bArr) {
        return (zzfmv) zzfls.zza(new zzfmv(), bArr);
    }

    public final void zza(zzflk zzflk) {
        String str = this.zzpzs;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            zzflk.zzp(1, this.zzpzs);
        }
        str = this.zzpzt;
        if (!(str == null || str.equals(str2))) {
            zzflk.zzp(2, this.zzpzt);
        }
        long j = this.zzpzu;
        if (j != 0) {
            zzflk.zzf(3, j);
        }
        str = this.zzpzv;
        if (!(str == null || str.equals(str2))) {
            zzflk.zzp(4, this.zzpzv);
        }
        j = this.zzpzw;
        if (j != 0) {
            zzflk.zzf(5, j);
        }
        j = this.zzgoc;
        if (j != 0) {
            zzflk.zzf(6, j);
        }
        str = this.zzpzx;
        if (!(str == null || str.equals(str2))) {
            zzflk.zzp(7, this.zzpzx);
        }
        str = this.zzpzy;
        if (!(str == null || str.equals(str2))) {
            zzflk.zzp(8, this.zzpzy);
        }
        str = this.zzpzz;
        if (!(str == null || str.equals(str2))) {
            zzflk.zzp(9, this.zzpzz);
        }
        str = this.zzqaa;
        if (!(str == null || str.equals(str2))) {
            zzflk.zzp(10, this.zzqaa);
        }
        str = this.zzqab;
        if (!(str == null || str.equals(str2))) {
            zzflk.zzp(11, this.zzqab);
        }
        int i = this.zzqac;
        if (i != 0) {
            zzflk.zzad(12, i);
        }
        zzfmu[] zzfmuArr = this.zzqad;
        if (zzfmuArr != null && zzfmuArr.length > 0) {
            i = 0;
            while (true) {
                zzfmu[] zzfmuArr2 = this.zzqad;
                if (i >= zzfmuArr2.length) {
                    break;
                }
                zzfls zzfls = zzfmuArr2[i];
                if (zzfls != null) {
                    zzflk.zza(13, zzfls);
                }
                i++;
            }
        }
        super.zza(zzflk);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzq() {
        int zzq = super.zzq();
        String str = this.zzpzs;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            zzq += zzflk.zzq(1, this.zzpzs);
        }
        str = this.zzpzt;
        if (!(str == null || str.equals(str2))) {
            zzq += zzflk.zzq(2, this.zzpzt);
        }
        long j = this.zzpzu;
        if (j != 0) {
            zzq += zzflk.zzc(3, j);
        }
        str = this.zzpzv;
        if (!(str == null || str.equals(str2))) {
            zzq += zzflk.zzq(4, this.zzpzv);
        }
        j = this.zzpzw;
        if (j != 0) {
            zzq += zzflk.zzc(5, j);
        }
        j = this.zzgoc;
        if (j != 0) {
            zzq += zzflk.zzc(6, j);
        }
        str = this.zzpzx;
        if (!(str == null || str.equals(str2))) {
            zzq += zzflk.zzq(7, this.zzpzx);
        }
        str = this.zzpzy;
        if (!(str == null || str.equals(str2))) {
            zzq += zzflk.zzq(8, this.zzpzy);
        }
        str = this.zzpzz;
        if (!(str == null || str.equals(str2))) {
            zzq += zzflk.zzq(9, this.zzpzz);
        }
        str = this.zzqaa;
        if (!(str == null || str.equals(str2))) {
            zzq += zzflk.zzq(10, this.zzqaa);
        }
        str = this.zzqab;
        if (!(str == null || str.equals(str2))) {
            zzq += zzflk.zzq(11, this.zzqab);
        }
        int i = this.zzqac;
        if (i != 0) {
            zzq += zzflk.zzag(12, i);
        }
        zzfmu[] zzfmuArr = this.zzqad;
        if (zzfmuArr != null && zzfmuArr.length > 0) {
            i = 0;
            while (true) {
                zzfmu[] zzfmuArr2 = this.zzqad;
                if (i >= zzfmuArr2.length) {
                    break;
                }
                zzfls zzfls = zzfmuArr2[i];
                if (zzfls != null) {
                    zzq += zzflk.zzb(13, zzfls);
                }
                i++;
            }
        }
        return zzq;
    }
}
