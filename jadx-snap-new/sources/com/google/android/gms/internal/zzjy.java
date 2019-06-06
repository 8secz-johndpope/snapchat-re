package com.google.android.gms.internal;

public final class zzjy extends zzflm<zzjy> {
    private Integer zzbgq;

    public zzjy() {
        this.zzbgq = null;
        this.zzpvl = null;
        this.zzpnr = -1;
    }

    private final zzjy zzv(zzflj zzflj) {
        while (true) {
            int zzcxx = zzflj.zzcxx();
            if (zzcxx == 0) {
                return this;
            }
            if (zzcxx == 8) {
                try {
                    int zzcym = zzflj.zzcym();
                    if (!(zzcym == 0 || zzcym == 1 || zzcym == 2)) {
                        if (zzcym != 3) {
                            StringBuilder stringBuilder = new StringBuilder(46);
                            stringBuilder.append(zzcym);
                            stringBuilder.append(" is not a valid enum VideoErrorCode");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    }
                    this.zzbgq = Integer.valueOf(zzcym);
                } catch (IllegalArgumentException unused) {
                    zzflj.zzmw(zzflj.getPosition());
                    zza(zzflj, zzcxx);
                }
            } else if (!super.zza(zzflj, zzcxx)) {
                return this;
            }
        }
    }

    public final void zza(zzflk zzflk) {
        Integer num = this.zzbgq;
        if (num != null) {
            zzflk.zzad(1, num.intValue());
        }
        super.zza(zzflk);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzq() {
        int zzq = super.zzq();
        Integer num = this.zzbgq;
        return num != null ? zzq + zzflk.zzag(1, num.intValue()) : zzq;
    }
}
