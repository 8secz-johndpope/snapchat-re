package com.google.android.gms.internal;

public final class zzji extends zzflm<zzji> {
    public String zzbdw;
    private zzju zzbdx;
    private Integer zzbdy;
    public zzjv zzbdz;
    private Integer zzbea;
    private Integer zzbeb;
    private Integer zzbec;
    private Integer zzbed;

    public zzji() {
        this.zzbdw = null;
        this.zzbdx = null;
        this.zzbdy = null;
        this.zzbdz = null;
        this.zzbea = null;
        this.zzbeb = null;
        this.zzbec = null;
        this.zzbed = null;
        this.zzpvl = null;
        this.zzpnr = -1;
    }

    private final zzji zzk(zzflj zzflj) {
        int position;
        while (true) {
            int zzcxx = zzflj.zzcxx();
            if (zzcxx == 0) {
                return this;
            }
            if (zzcxx != 10) {
                zzfls zzfls;
                if (zzcxx == 18) {
                    if (this.zzbdx == null) {
                        this.zzbdx = new zzju();
                    }
                    zzfls = this.zzbdx;
                } else if (zzcxx == 24) {
                    this.zzbdy = Integer.valueOf(zzflj.zzcym());
                } else if (zzcxx == 34) {
                    if (this.zzbdz == null) {
                        this.zzbdz = new zzjv();
                    }
                    zzfls = this.zzbdz;
                } else if (zzcxx == 40) {
                    this.zzbea = Integer.valueOf(zzflj.zzcym());
                } else if (zzcxx == 48) {
                    position = zzflj.getPosition();
                    this.zzbeb = Integer.valueOf(zzjc.zzd(zzflj.zzcym()));
                } else if (zzcxx == 56) {
                    position = zzflj.getPosition();
                    this.zzbec = Integer.valueOf(zzjc.zzd(zzflj.zzcym()));
                } else if (zzcxx == 64) {
                    position = zzflj.getPosition();
                    try {
                        this.zzbed = Integer.valueOf(zzjc.zzd(zzflj.zzcym()));
                    } catch (IllegalArgumentException unused) {
                        zzflj.zzmw(position);
                        zza(zzflj, zzcxx);
                    }
                } else if (!super.zza(zzflj, zzcxx)) {
                    return this;
                }
                zzflj.zza(zzfls);
            } else {
                this.zzbdw = zzflj.readString();
            }
        }
    }

    public final void zza(zzflk zzflk) {
        String str = this.zzbdw;
        if (str != null) {
            zzflk.zzp(1, str);
        }
        zzfls zzfls = this.zzbdx;
        if (zzfls != null) {
            zzflk.zza(2, zzfls);
        }
        Integer num = this.zzbdy;
        if (num != null) {
            zzflk.zzad(3, num.intValue());
        }
        zzfls = this.zzbdz;
        if (zzfls != null) {
            zzflk.zza(4, zzfls);
        }
        num = this.zzbea;
        if (num != null) {
            zzflk.zzad(5, num.intValue());
        }
        num = this.zzbeb;
        if (num != null) {
            zzflk.zzad(6, num.intValue());
        }
        num = this.zzbec;
        if (num != null) {
            zzflk.zzad(7, num.intValue());
        }
        num = this.zzbed;
        if (num != null) {
            zzflk.zzad(8, num.intValue());
        }
        super.zza(zzflk);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzq() {
        int zzq = super.zzq();
        String str = this.zzbdw;
        if (str != null) {
            zzq += zzflk.zzq(1, str);
        }
        zzfls zzfls = this.zzbdx;
        if (zzfls != null) {
            zzq += zzflk.zzb(2, zzfls);
        }
        Integer num = this.zzbdy;
        if (num != null) {
            zzq += zzflk.zzag(3, num.intValue());
        }
        zzfls = this.zzbdz;
        if (zzfls != null) {
            zzq += zzflk.zzb(4, zzfls);
        }
        num = this.zzbea;
        if (num != null) {
            zzq += zzflk.zzag(5, num.intValue());
        }
        num = this.zzbeb;
        if (num != null) {
            zzq += zzflk.zzag(6, num.intValue());
        }
        num = this.zzbec;
        if (num != null) {
            zzq += zzflk.zzag(7, num.intValue());
        }
        num = this.zzbed;
        return num != null ? zzq + zzflk.zzag(8, num.intValue()) : zzq;
    }
}
