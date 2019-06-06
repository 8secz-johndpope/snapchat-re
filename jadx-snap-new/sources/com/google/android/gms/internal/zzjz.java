package com.google.android.gms.internal;

public final class zzjz extends zzflm<zzjz> {
    private Integer zzbew;
    private zzjy zzbgo;
    private zzju zzbgp;
    private zzjv zzbgr;

    public zzjz() {
        this.zzbgr = null;
        this.zzbew = null;
        this.zzbgo = null;
        this.zzbgp = null;
        this.zzpvl = null;
        this.zzpnr = -1;
    }

    private final zzjz zzw(zzflj zzflj) {
        while (true) {
            int zzcxx = zzflj.zzcxx();
            if (zzcxx == 0) {
                return this;
            }
            zzfls zzfls;
            if (zzcxx == 10) {
                if (this.zzbgr == null) {
                    this.zzbgr = new zzjv();
                }
                zzfls = this.zzbgr;
            } else if (zzcxx == 16) {
                int position = zzflj.getPosition();
                try {
                    this.zzbew = Integer.valueOf(zzjc.zzd(zzflj.zzcym()));
                } catch (IllegalArgumentException unused) {
                    zzflj.zzmw(position);
                    zza(zzflj, zzcxx);
                }
            } else if (zzcxx == 26) {
                if (this.zzbgo == null) {
                    this.zzbgo = new zzjy();
                }
                zzfls = this.zzbgo;
            } else if (zzcxx == 34) {
                if (this.zzbgp == null) {
                    this.zzbgp = new zzju();
                }
                zzfls = this.zzbgp;
            } else if (!super.zza(zzflj, zzcxx)) {
                return this;
            }
            zzflj.zza(zzfls);
        }
    }

    public final void zza(zzflk zzflk) {
        zzfls zzfls = this.zzbgr;
        if (zzfls != null) {
            zzflk.zza(1, zzfls);
        }
        Integer num = this.zzbew;
        if (num != null) {
            zzflk.zzad(2, num.intValue());
        }
        zzfls = this.zzbgo;
        if (zzfls != null) {
            zzflk.zza(3, zzfls);
        }
        zzfls = this.zzbgp;
        if (zzfls != null) {
            zzflk.zza(4, zzfls);
        }
        super.zza(zzflk);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzq() {
        int zzq = super.zzq();
        zzfls zzfls = this.zzbgr;
        if (zzfls != null) {
            zzq += zzflk.zzb(1, zzfls);
        }
        Integer num = this.zzbew;
        if (num != null) {
            zzq += zzflk.zzag(2, num.intValue());
        }
        zzfls = this.zzbgo;
        if (zzfls != null) {
            zzq += zzflk.zzb(3, zzfls);
        }
        zzfls = this.zzbgp;
        return zzfls != null ? zzq + zzflk.zzb(4, zzfls) : zzq;
    }
}
