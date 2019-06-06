package com.google.android.gms.internal;

public final class zzke extends zzflm<zzke> {
    private Integer zzbew;
    private zzjy zzbgo;

    public zzke() {
        this.zzbew = null;
        this.zzbgo = null;
        this.zzpvl = null;
        this.zzpnr = -1;
    }

    private final zzke zzab(zzflj zzflj) {
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
        return zzfls != null ? zzq + zzflk.zzb(2, zzfls) : zzq;
    }
}
