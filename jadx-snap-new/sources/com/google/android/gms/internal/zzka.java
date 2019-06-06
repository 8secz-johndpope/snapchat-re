package com.google.android.gms.internal;

public final class zzka extends zzflm<zzka> {
    private Integer zzbew;
    private Integer zzbgg;
    private Integer zzbgh;
    private zzjy zzbgo;
    private Integer zzbgs;

    public zzka() {
        this.zzbew = null;
        this.zzbgo = null;
        this.zzbgg = null;
        this.zzbgh = null;
        this.zzbgs = null;
        this.zzpvl = null;
        this.zzpnr = -1;
    }

    private final zzka zzx(zzflj zzflj) {
        while (true) {
            int zzcxx = zzflj.zzcxx();
            if (zzcxx == 0) {
                return this;
            }
            if (zzcxx == 8) {
                int position = zzflj.getPosition();
                try {
                    this.zzbew = Integer.valueOf(zzjc.zzd(zzflj.zzcym()));
                } catch (IllegalArgumentException unused) {
                    zzflj.zzmw(position);
                    zza(zzflj, zzcxx);
                }
            } else if (zzcxx == 18) {
                if (this.zzbgo == null) {
                    this.zzbgo = new zzjy();
                }
                zzflj.zza(this.zzbgo);
            } else if (zzcxx == 24) {
                this.zzbgg = Integer.valueOf(zzflj.zzcym());
            } else if (zzcxx == 32) {
                this.zzbgh = Integer.valueOf(zzflj.zzcym());
            } else if (zzcxx == 40) {
                this.zzbgs = Integer.valueOf(zzflj.zzcym());
            } else if (!super.zza(zzflj, zzcxx)) {
                return this;
            }
        }
    }

    public final void zza(zzflk zzflk) {
        Integer num = this.zzbew;
        if (num != null) {
            zzflk.zzad(1, num.intValue());
        }
        zzfls zzfls = this.zzbgo;
        if (zzfls != null) {
            zzflk.zza(2, zzfls);
        }
        num = this.zzbgg;
        if (num != null) {
            zzflk.zzad(3, num.intValue());
        }
        num = this.zzbgh;
        if (num != null) {
            zzflk.zzad(4, num.intValue());
        }
        num = this.zzbgs;
        if (num != null) {
            zzflk.zzad(5, num.intValue());
        }
        super.zza(zzflk);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzq() {
        int zzq = super.zzq();
        Integer num = this.zzbew;
        if (num != null) {
            zzq += zzflk.zzag(1, num.intValue());
        }
        zzfls zzfls = this.zzbgo;
        if (zzfls != null) {
            zzq += zzflk.zzb(2, zzfls);
        }
        num = this.zzbgg;
        if (num != null) {
            zzq += zzflk.zzag(3, num.intValue());
        }
        num = this.zzbgh;
        if (num != null) {
            zzq += zzflk.zzag(4, num.intValue());
        }
        num = this.zzbgs;
        return num != null ? zzq + zzflk.zzag(5, num.intValue()) : zzq;
    }
}
