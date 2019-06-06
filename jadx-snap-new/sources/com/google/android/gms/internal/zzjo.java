package com.google.android.gms.internal;

public final class zzjo extends zzflm<zzjo> {
    private Integer zzbdh;
    private Integer zzbez;

    public zzjo() {
        this.zzbdh = null;
        this.zzbez = null;
        this.zzpvl = null;
        this.zzpnr = -1;
    }

    private final zzjo zzq(zzflj zzflj) {
        int position;
        while (true) {
            int zzcxx = zzflj.zzcxx();
            if (zzcxx == 0) {
                return this;
            }
            int zzcym;
            StringBuilder stringBuilder;
            if (zzcxx == 8) {
                position = zzflj.getPosition();
                zzcym = zzflj.zzcym();
                if (!(zzcym == 0 || zzcym == 1)) {
                    if (zzcym != 2) {
                        stringBuilder = new StringBuilder(43);
                        stringBuilder.append(zzcym);
                        stringBuilder.append(" is not a valid enum NetworkType");
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
                this.zzbdh = Integer.valueOf(zzcym);
            } else if (zzcxx == 16) {
                position = zzflj.getPosition();
                try {
                    zzcym = zzflj.zzcym();
                    if (!(zzcym == 0 || zzcym == 1 || zzcym == 2)) {
                        if (zzcym != 4) {
                            stringBuilder = new StringBuilder(51);
                            stringBuilder.append(zzcym);
                            stringBuilder.append(" is not a valid enum CellularNetworkType");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    }
                    this.zzbez = Integer.valueOf(zzcym);
                } catch (IllegalArgumentException unused) {
                    zzflj.zzmw(position);
                    zza(zzflj, zzcxx);
                }
            } else if (!super.zza(zzflj, zzcxx)) {
                return this;
            }
        }
    }

    public final void zza(zzflk zzflk) {
        Integer num = this.zzbdh;
        if (num != null) {
            zzflk.zzad(1, num.intValue());
        }
        num = this.zzbez;
        if (num != null) {
            zzflk.zzad(2, num.intValue());
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
        num = this.zzbez;
        return num != null ? zzq + zzflk.zzag(2, num.intValue()) : zzq;
    }
}
