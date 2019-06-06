package com.google.android.gms.internal;

public final class zzjt extends zzflm<zzjt> {
    private static volatile zzjt[] zzbfr;
    private String zzbes;
    private Integer zzbet;
    private zzju zzbev;

    public zzjt() {
        this.zzbes = null;
        this.zzbet = null;
        this.zzbev = null;
        this.zzpvl = null;
        this.zzpnr = -1;
    }

    public static zzjt[] zzhw() {
        if (zzbfr == null) {
            synchronized (zzflq.zzpvt) {
                if (zzbfr == null) {
                    zzbfr = new zzjt[0];
                }
            }
        }
        return zzbfr;
    }

    private final zzjt zzt(zzflj zzflj) {
        while (true) {
            int zzcxx = zzflj.zzcxx();
            if (zzcxx == 0) {
                return this;
            }
            if (zzcxx == 10) {
                this.zzbes = zzflj.readString();
            } else if (zzcxx == 16) {
                int position = zzflj.getPosition();
                try {
                    this.zzbet = Integer.valueOf(zzjc.zzd(zzflj.zzcym()));
                } catch (IllegalArgumentException unused) {
                    zzflj.zzmw(position);
                    zza(zzflj, zzcxx);
                }
            } else if (zzcxx == 26) {
                if (this.zzbev == null) {
                    this.zzbev = new zzju();
                }
                zzflj.zza(this.zzbev);
            } else if (!super.zza(zzflj, zzcxx)) {
                return this;
            }
        }
    }

    public final void zza(zzflk zzflk) {
        String str = this.zzbes;
        if (str != null) {
            zzflk.zzp(1, str);
        }
        Integer num = this.zzbet;
        if (num != null) {
            zzflk.zzad(2, num.intValue());
        }
        zzfls zzfls = this.zzbev;
        if (zzfls != null) {
            zzflk.zza(3, zzfls);
        }
        super.zza(zzflk);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzq() {
        int zzq = super.zzq();
        String str = this.zzbes;
        if (str != null) {
            zzq += zzflk.zzq(1, str);
        }
        Integer num = this.zzbet;
        if (num != null) {
            zzq += zzflk.zzag(2, num.intValue());
        }
        zzfls zzfls = this.zzbev;
        return zzfls != null ? zzq + zzflk.zzb(3, zzfls) : zzq;
    }
}
