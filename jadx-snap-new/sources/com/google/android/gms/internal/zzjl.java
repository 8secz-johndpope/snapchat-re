package com.google.android.gms.internal;

public final class zzjl extends zzflm<zzjl> {
    private String zzbes;
    private Integer zzbet;
    private int[] zzbeu;
    private zzju zzbev;

    public zzjl() {
        this.zzbes = null;
        this.zzbet = null;
        this.zzbeu = zzflv.zzpvy;
        this.zzbev = null;
        this.zzpvl = null;
        this.zzpnr = -1;
    }

    private final zzjl zzn(zzflj zzflj) {
        int position;
        while (true) {
            int zzcxx = zzflj.zzcxx();
            if (zzcxx == 0) {
                return this;
            }
            int[] iArr;
            if (zzcxx == 10) {
                this.zzbes = zzflj.readString();
            } else if (zzcxx == 16) {
                position = zzflj.getPosition();
                try {
                    this.zzbet = Integer.valueOf(zzjc.zzd(zzflj.zzcym()));
                } catch (IllegalArgumentException unused) {
                    zzflj.zzmw(position);
                    zza(zzflj, zzcxx);
                }
            } else if (zzcxx == 24) {
                zzcxx = zzflv.zzb(zzflj, 24);
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
            } else if (zzcxx == 26) {
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
            } else if (zzcxx == 34) {
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
        int[] iArr = this.zzbeu;
        if (iArr != null && iArr.length > 0) {
            int i = 0;
            while (true) {
                int[] iArr2 = this.zzbeu;
                if (i >= iArr2.length) {
                    break;
                }
                zzflk.zzad(3, iArr2[i]);
                i++;
            }
        }
        zzfls zzfls = this.zzbev;
        if (zzfls != null) {
            zzflk.zza(4, zzfls);
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
        int[] iArr = this.zzbeu;
        if (iArr != null && iArr.length > 0) {
            int[] iArr2;
            int i = 0;
            int i2 = 0;
            while (true) {
                iArr2 = this.zzbeu;
                if (i >= iArr2.length) {
                    break;
                }
                i2 += zzflk.zzlx(iArr2[i]);
                i++;
            }
            zzq = (zzq + i2) + (iArr2.length * 1);
        }
        zzfls zzfls = this.zzbev;
        return zzfls != null ? zzq + zzflk.zzb(4, zzfls) : zzq;
    }
}
