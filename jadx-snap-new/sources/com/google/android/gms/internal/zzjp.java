package com.google.android.gms.internal;

public final class zzjp extends zzflm<zzjp> {
    private Integer zzbfa;
    private zzju zzbfb;

    public zzjp() {
        this.zzbfa = null;
        this.zzbfb = null;
        this.zzpvl = null;
        this.zzpnr = -1;
    }

    private final zzjp zzr(zzflj zzflj) {
        while (true) {
            int zzcxx = zzflj.zzcxx();
            if (zzcxx == 0) {
                return this;
            }
            if (zzcxx == 8) {
                int position = zzflj.getPosition();
                try {
                    this.zzbfa = Integer.valueOf(zzjc.zzd(zzflj.zzcym()));
                } catch (IllegalArgumentException unused) {
                    zzflj.zzmw(position);
                    zza(zzflj, zzcxx);
                }
            } else if (zzcxx == 18) {
                if (this.zzbfb == null) {
                    this.zzbfb = new zzju();
                }
                zzflj.zza(this.zzbfb);
            } else if (!super.zza(zzflj, zzcxx)) {
                return this;
            }
        }
    }

    public final void zza(zzflk zzflk) {
        Integer num = this.zzbfa;
        if (num != null) {
            zzflk.zzad(1, num.intValue());
        }
        zzfls zzfls = this.zzbfb;
        if (zzfls != null) {
            zzflk.zza(2, zzfls);
        }
        super.zza(zzflk);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzq() {
        int zzq = super.zzq();
        Integer num = this.zzbfa;
        if (num != null) {
            zzq += zzflk.zzag(1, num.intValue());
        }
        zzfls zzfls = this.zzbfb;
        return zzfls != null ? zzq + zzflk.zzb(2, zzfls) : zzq;
    }
}
