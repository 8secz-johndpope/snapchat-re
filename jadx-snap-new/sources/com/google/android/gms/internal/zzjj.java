package com.google.android.gms.internal;

public final class zzjj extends zzflm<zzjj> {
    private Integer zzbee;
    private zzjv zzbef;
    private String zzbeg;
    private String zzbeh;

    public zzjj() {
        this.zzbee = null;
        this.zzbef = null;
        this.zzbeg = null;
        this.zzbeh = null;
        this.zzpvl = null;
        this.zzpnr = -1;
    }

    private final zzjj zzl(zzflj zzflj) {
        while (true) {
            int zzcxx = zzflj.zzcxx();
            if (zzcxx == 0) {
                return this;
            }
            if (zzcxx == 40) {
                try {
                    int zzcym = zzflj.zzcym();
                    if (!(zzcym == 0 || zzcym == 1)) {
                        if (zzcym != 2) {
                            StringBuilder stringBuilder = new StringBuilder(40);
                            stringBuilder.append(zzcym);
                            stringBuilder.append(" is not a valid enum Platform");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    }
                    this.zzbee = Integer.valueOf(zzcym);
                } catch (IllegalArgumentException unused) {
                    zzflj.zzmw(zzflj.getPosition());
                    zza(zzflj, zzcxx);
                }
            } else if (zzcxx == 50) {
                if (this.zzbef == null) {
                    this.zzbef = new zzjv();
                }
                zzflj.zza(this.zzbef);
            } else if (zzcxx == 58) {
                this.zzbeg = zzflj.readString();
            } else if (zzcxx == 66) {
                this.zzbeh = zzflj.readString();
            } else if (!super.zza(zzflj, zzcxx)) {
                return this;
            }
        }
    }

    public final void zza(zzflk zzflk) {
        Integer num = this.zzbee;
        if (num != null) {
            zzflk.zzad(5, num.intValue());
        }
        zzfls zzfls = this.zzbef;
        if (zzfls != null) {
            zzflk.zza(6, zzfls);
        }
        String str = this.zzbeg;
        if (str != null) {
            zzflk.zzp(7, str);
        }
        str = this.zzbeh;
        if (str != null) {
            zzflk.zzp(8, str);
        }
        super.zza(zzflk);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzq() {
        int zzq = super.zzq();
        Integer num = this.zzbee;
        if (num != null) {
            zzq += zzflk.zzag(5, num.intValue());
        }
        zzfls zzfls = this.zzbef;
        if (zzfls != null) {
            zzq += zzflk.zzb(6, zzfls);
        }
        String str = this.zzbeg;
        if (str != null) {
            zzq += zzflk.zzq(7, str);
        }
        str = this.zzbeh;
        return str != null ? zzq + zzflk.zzq(8, str) : zzq;
    }
}
