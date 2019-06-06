package com.google.android.gms.internal;

public final class zzjg extends zzflm<zzjg> {
    private String zzbdl;
    private zzje[] zzbdm;
    private Integer zzbdn;
    private Integer zzbdo;
    private Integer zzbdp;

    public zzjg() {
        this.zzbdl = null;
        this.zzbdm = zzje.zzhv();
        this.zzbdn = null;
        this.zzbdo = null;
        this.zzbdp = null;
        this.zzpvl = null;
        this.zzpnr = -1;
    }

    private final zzjg zzj(zzflj zzflj) {
        while (true) {
            int zzcxx = zzflj.zzcxx();
            if (zzcxx == 0) {
                return this;
            }
            int length;
            if (zzcxx == 10) {
                this.zzbdl = zzflj.readString();
            } else if (zzcxx == 18) {
                zzcxx = zzflv.zzb(zzflj, 18);
                zzje[] zzjeArr = this.zzbdm;
                length = zzjeArr == null ? 0 : zzjeArr.length;
                zzje[] zzjeArr2 = new zzje[(zzcxx + length)];
                if (length != 0) {
                    System.arraycopy(this.zzbdm, 0, zzjeArr2, 0, length);
                }
                while (length < zzjeArr2.length - 1) {
                    zzjeArr2[length] = new zzje();
                    zzflj.zza(zzjeArr2[length]);
                    zzflj.zzcxx();
                    length++;
                }
                zzjeArr2[length] = new zzje();
                zzflj.zza(zzjeArr2[length]);
                this.zzbdm = zzjeArr2;
            } else if (zzcxx == 24) {
                length = zzflj.getPosition();
                this.zzbdn = Integer.valueOf(zzjc.zzd(zzflj.zzcym()));
            } else if (zzcxx == 32) {
                length = zzflj.getPosition();
                this.zzbdo = Integer.valueOf(zzjc.zzd(zzflj.zzcym()));
            } else if (zzcxx == 40) {
                length = zzflj.getPosition();
                try {
                    this.zzbdp = Integer.valueOf(zzjc.zzd(zzflj.zzcym()));
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
        String str = this.zzbdl;
        if (str != null) {
            zzflk.zzp(1, str);
        }
        zzje[] zzjeArr = this.zzbdm;
        if (zzjeArr != null && zzjeArr.length > 0) {
            int i = 0;
            while (true) {
                zzje[] zzjeArr2 = this.zzbdm;
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
        Integer num = this.zzbdn;
        if (num != null) {
            zzflk.zzad(3, num.intValue());
        }
        num = this.zzbdo;
        if (num != null) {
            zzflk.zzad(4, num.intValue());
        }
        num = this.zzbdp;
        if (num != null) {
            zzflk.zzad(5, num.intValue());
        }
        super.zza(zzflk);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzq() {
        int zzq = super.zzq();
        String str = this.zzbdl;
        if (str != null) {
            zzq += zzflk.zzq(1, str);
        }
        zzje[] zzjeArr = this.zzbdm;
        if (zzjeArr != null && zzjeArr.length > 0) {
            int i = 0;
            while (true) {
                zzje[] zzjeArr2 = this.zzbdm;
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
        Integer num = this.zzbdn;
        if (num != null) {
            zzq += zzflk.zzag(3, num.intValue());
        }
        num = this.zzbdo;
        if (num != null) {
            zzq += zzflk.zzag(4, num.intValue());
        }
        num = this.zzbdp;
        return num != null ? zzq + zzflk.zzag(5, num.intValue()) : zzq;
    }
}
