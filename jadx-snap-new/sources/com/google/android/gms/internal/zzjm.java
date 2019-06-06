package com.google.android.gms.internal;

public final class zzjm extends zzflm<zzjm> {
    private int[] zzbeu;
    private Integer zzbew;

    public zzjm() {
        this.zzbew = null;
        this.zzbeu = zzflv.zzpvy;
        this.zzpvl = null;
        this.zzpnr = -1;
    }

    private final zzjm zzo(zzflj zzflj) {
        int position;
        while (true) {
            int zzcxx = zzflj.zzcxx();
            if (zzcxx == 0) {
                return this;
            }
            int[] iArr;
            if (zzcxx == 8) {
                position = zzflj.getPosition();
                try {
                    this.zzbew = Integer.valueOf(zzjc.zzd(zzflj.zzcym()));
                } catch (IllegalArgumentException unused) {
                    zzflj.zzmw(position);
                    zza(zzflj, zzcxx);
                }
            } else if (zzcxx == 16) {
                zzcxx = zzflv.zzb(zzflj, 16);
                iArr = this.zzbeu;
                position = iArr == null ? 0 : iArr.length;
                int[] iArr2 = new int[(zzcxx + position)];
                if (position != 0) {
                    System.arraycopy(this.zzbeu, 0, iArr2, 0, position);
                }
                while (position < iArr2.length - 1) {
                    iArr2[position] = zzflj.zzcym();
                    zzflj.zzcxx();
                    position++;
                }
                iArr2[position] = zzflj.zzcym();
                this.zzbeu = iArr2;
            } else if (zzcxx == 18) {
                zzcxx = zzflj.zzli(zzflj.zzcym());
                position = zzflj.getPosition();
                int i = 0;
                while (zzflj.zzcyo() > 0) {
                    zzflj.zzcym();
                    i++;
                }
                zzflj.zzmw(position);
                iArr = this.zzbeu;
                position = iArr == null ? 0 : iArr.length;
                int[] iArr3 = new int[(i + position)];
                if (position != 0) {
                    System.arraycopy(this.zzbeu, 0, iArr3, 0, position);
                }
                while (position < iArr3.length) {
                    iArr3[position] = zzflj.zzcym();
                    position++;
                }
                this.zzbeu = iArr3;
                zzflj.zzlj(zzcxx);
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
        int[] iArr = this.zzbeu;
        if (iArr != null && iArr.length > 0) {
            int i = 0;
            while (true) {
                int[] iArr2 = this.zzbeu;
                if (i >= iArr2.length) {
                    break;
                }
                zzflk.zzad(2, iArr2[i]);
                i++;
            }
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
        int[] iArr = this.zzbeu;
        if (iArr == null || iArr.length <= 0) {
            return zzq;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr2 = this.zzbeu;
            if (i >= iArr2.length) {
                return (zzq + i2) + (iArr2.length * 1);
            }
            i2 += zzflk.zzlx(iArr2[i]);
            i++;
        }
    }
}
