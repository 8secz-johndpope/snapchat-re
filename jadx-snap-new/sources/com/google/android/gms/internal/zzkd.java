package com.google.android.gms.internal;

public final class zzkd extends zzflm<zzkd> {
    private Integer zzbew;
    private zzjy zzbgo;
    private zzju zzbgp;

    public zzkd() {
        this.zzbew = null;
        this.zzbgo = null;
        this.zzbgp = null;
        this.zzpvl = null;
        this.zzpnr = -1;
    }

    private final zzkd zzaa(zzflj zzflj) {
        while (true) {
            int zzcxx = zzflj.zzcxx();
            if (zzcxx == 0) {
                return this;
            }
            if (zzcxx != 8) {
                zzfls zzfls;
                if (zzcxx == 18) {
                    if (this.zzbgo == null) {
                        this.zzbgo = new zzjy();
                    }
                    zzfls = this.zzbgo;
                } else if (zzcxx == 26) {
                    if (this.zzbgp == null) {
                        this.zzbgp = new zzju();
                    }
                    zzfls = this.zzbgp;
                } else if (!super.zza(zzflj, zzcxx)) {
                    return this;
                }
                zzflj.zza(zzfls);
            } else {
                int position = zzflj.getPosition();
                try {
                    this.zzbew = Integer.valueOf(zzjc.zzd(zzflj.zzcym()));
                } catch (IllegalArgumentException unused) {
                    zzflj.zzmw(position);
                    zza(zzflj, zzcxx);
                }
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
        zzfls = this.zzbgp;
        if (zzfls != null) {
            zzflk.zza(3, zzfls);
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
        zzfls = this.zzbgp;
        return zzfls != null ? zzq + zzflk.zzb(3, zzfls) : zzq;
    }
}
