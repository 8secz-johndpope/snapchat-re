package com.google.android.gms.internal;

public final class zzjf extends zzflm<zzjf> {
    private String zzatx;
    private zzje[] zzbdj;
    private Integer zzbdk;

    public zzjf() {
        this.zzatx = null;
        this.zzbdj = zzje.zzhv();
        this.zzbdk = null;
        this.zzpvl = null;
        this.zzpnr = -1;
    }

    private final zzjf zzi(zzflj zzflj) {
        while (true) {
            int zzcxx = zzflj.zzcxx();
            if (zzcxx == 0) {
                return this;
            }
            int length;
            if (zzcxx == 10) {
                this.zzatx = zzflj.readString();
            } else if (zzcxx == 18) {
                zzcxx = zzflv.zzb(zzflj, 18);
                zzje[] zzjeArr = this.zzbdj;
                length = zzjeArr == null ? 0 : zzjeArr.length;
                zzje[] zzjeArr2 = new zzje[(zzcxx + length)];
                if (length != 0) {
                    System.arraycopy(this.zzbdj, 0, zzjeArr2, 0, length);
                }
                while (length < zzjeArr2.length - 1) {
                    zzjeArr2[length] = new zzje();
                    zzflj.zza(zzjeArr2[length]);
                    zzflj.zzcxx();
                    length++;
                }
                zzjeArr2[length] = new zzje();
                zzflj.zza(zzjeArr2[length]);
                this.zzbdj = zzjeArr2;
            } else if (zzcxx == 24) {
                length = zzflj.getPosition();
                try {
                    this.zzbdk = Integer.valueOf(zzjc.zzd(zzflj.zzcym()));
                } catch (IllegalArgumentException unused) {
                    zzflj.zzmw(length);
                    zza(zzflj, zzcxx);
                }
            } else if (!super.zza(zzflj, zzcxx)) {
                return this;
            }
        }
    }

    public final void zza(zzflk zzflk) {
        String str = this.zzatx;
        if (str != null) {
            zzflk.zzp(1, str);
        }
        zzje[] zzjeArr = this.zzbdj;
        if (zzjeArr != null && zzjeArr.length > 0) {
            int i = 0;
            while (true) {
                zzje[] zzjeArr2 = this.zzbdj;
                if (i >= zzjeArr2.length) {
                    break;
                }
                zzfls zzfls = zzjeArr2[i];
                if (zzfls != null) {
                    zzflk.zza(2, zzfls);
                }
                i++;
            }
        }
        Integer num = this.zzbdk;
        if (num != null) {
            zzflk.zzad(3, num.intValue());
        }
        super.zza(zzflk);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzq() {
        int zzq = super.zzq();
        String str = this.zzatx;
        if (str != null) {
            zzq += zzflk.zzq(1, str);
        }
        zzje[] zzjeArr = this.zzbdj;
        if (zzjeArr != null && zzjeArr.length > 0) {
            int i = 0;
            while (true) {
                zzje[] zzjeArr2 = this.zzbdj;
                if (i >= zzjeArr2.length) {
                    break;
                }
                zzfls zzfls = zzjeArr2[i];
                if (zzfls != null) {
                    zzq += zzflk.zzb(2, zzfls);
                }
                i++;
            }
        }
        Integer num = this.zzbdk;
        return num != null ? zzq + zzflk.zzag(3, num.intValue()) : zzq;
    }
}
