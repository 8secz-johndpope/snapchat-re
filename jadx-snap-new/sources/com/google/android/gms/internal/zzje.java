package com.google.android.gms.internal;

public final class zzje extends zzflm<zzje> {
    private static volatile zzje[] zzbdg;
    private Integer zzbdh;
    private zzjs zzbdi;

    public zzje() {
        this.zzbdh = null;
        this.zzbdi = null;
        this.zzpvl = null;
        this.zzpnr = -1;
    }

    private final zzje zzh(zzflj zzflj) {
        while (true) {
            int zzcxx = zzflj.zzcxx();
            if (zzcxx == 0) {
                return this;
            }
            if (zzcxx == 8) {
                try {
                    int zzcym = zzflj.zzcym();
                    switch (zzcym) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            this.zzbdh = Integer.valueOf(zzcym);
                            break;
                        default:
                            StringBuilder stringBuilder = new StringBuilder(44);
                            stringBuilder.append(zzcym);
                            stringBuilder.append(" is not a valid enum AdFormatType");
                            throw new IllegalArgumentException(stringBuilder.toString());
                    }
                } catch (IllegalArgumentException unused) {
                    zzflj.zzmw(zzflj.getPosition());
                    zza(zzflj, zzcxx);
                }
            } else if (zzcxx == 18) {
                if (this.zzbdi == null) {
                    this.zzbdi = new zzjs();
                }
                zzflj.zza(this.zzbdi);
            } else if (!super.zza(zzflj, zzcxx)) {
                return this;
            }
        }
    }

    public static zzje[] zzhv() {
        if (zzbdg == null) {
            synchronized (zzflq.zzpvt) {
                if (zzbdg == null) {
                    zzbdg = new zzje[0];
                }
            }
        }
        return zzbdg;
    }

    public final void zza(zzflk zzflk) {
        Integer num = this.zzbdh;
        if (num != null) {
            zzflk.zzad(1, num.intValue());
        }
        zzfls zzfls = this.zzbdi;
        if (zzfls != null) {
            zzflk.zza(2, zzfls);
        }
        super.zza(zzflk);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzq() {
        int zzq = super.zzq();
        Integer num = this.zzbdh;
        if (num != null) {
            zzq += zzflk.zzag(1, num.intValue());
        }
        zzfls zzfls = this.zzbdi;
        return zzfls != null ? zzq + zzflk.zzb(2, zzfls) : zzq;
    }
}
