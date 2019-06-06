package com.google.android.gms.internal;

import org.opencv.imgproc.Imgproc;

public final class zzjk extends zzflm<zzjk> {
    private Integer zzbei;
    public String zzbej;
    private Integer zzbek;
    private Integer zzbel;
    private zzjv zzbem;
    public long[] zzben;
    public zzji zzbeo;
    private zzjj zzbep;
    private zzjo zzbeq;
    public zzjd zzber;

    public zzjk() {
        this.zzbei = null;
        this.zzbej = null;
        this.zzbek = null;
        this.zzbel = null;
        this.zzbem = null;
        this.zzben = zzflv.zzpvz;
        this.zzbeo = null;
        this.zzbep = null;
        this.zzbeq = null;
        this.zzber = null;
        this.zzpvl = null;
        this.zzpnr = -1;
    }

    private final zzjk zzm(zzflj zzflj) {
        while (true) {
            zzfls zzfls;
            int zzcxx = zzflj.zzcxx();
            long[] jArr;
            int length;
            switch (zzcxx) {
                case 0:
                    return this;
                case 72:
                    this.zzbei = Integer.valueOf(zzflj.zzcym());
                    continue;
                case 82:
                    this.zzbej = zzflj.readString();
                    continue;
                case 88:
                    this.zzbek = Integer.valueOf(zzflj.zzcym());
                    continue;
                case 96:
                    int position = zzflj.getPosition();
                    try {
                        this.zzbel = Integer.valueOf(zzjc.zzd(zzflj.zzcym()));
                        continue;
                    } catch (IllegalArgumentException unused) {
                        zzflj.zzmw(position);
                        zza(zzflj, zzcxx);
                        break;
                    }
                case 106:
                    if (this.zzbem == null) {
                        this.zzbem = new zzjv();
                    }
                    zzfls = this.zzbem;
                    break;
                case 112:
                    zzcxx = zzflv.zzb(zzflj, 112);
                    jArr = this.zzben;
                    length = jArr == null ? 0 : jArr.length;
                    long[] jArr2 = new long[(zzcxx + length)];
                    if (length != 0) {
                        System.arraycopy(this.zzben, 0, jArr2, 0, length);
                    }
                    while (length < jArr2.length - 1) {
                        jArr2[length] = zzflj.zzcyr();
                        zzflj.zzcxx();
                        length++;
                    }
                    jArr2[length] = zzflj.zzcyr();
                    this.zzben = jArr2;
                    continue;
                case 114:
                    zzcxx = zzflj.zzli(zzflj.zzcym());
                    length = zzflj.getPosition();
                    int i = 0;
                    while (zzflj.zzcyo() > 0) {
                        zzflj.zzcyr();
                        i++;
                    }
                    zzflj.zzmw(length);
                    jArr = this.zzben;
                    length = jArr == null ? 0 : jArr.length;
                    long[] jArr3 = new long[(i + length)];
                    if (length != 0) {
                        System.arraycopy(this.zzben, 0, jArr3, 0, length);
                    }
                    while (length < jArr3.length) {
                        jArr3[length] = zzflj.zzcyr();
                        length++;
                    }
                    this.zzben = jArr3;
                    zzflj.zzlj(zzcxx);
                    continue;
                case Imgproc.COLOR_YUV2BGRA_YVYU /*122*/:
                    if (this.zzbeo == null) {
                        this.zzbeo = new zzji();
                    }
                    zzfls = this.zzbeo;
                    break;
                case 130:
                    if (this.zzbep == null) {
                        this.zzbep = new zzjj();
                    }
                    zzfls = this.zzbep;
                    break;
                case 138:
                    if (this.zzbeq == null) {
                        this.zzbeq = new zzjo();
                    }
                    zzfls = this.zzbeq;
                    break;
                case 146:
                    if (this.zzber == null) {
                        this.zzber = new zzjd();
                    }
                    zzfls = this.zzber;
                    break;
                default:
                    if (!super.zza(zzflj, zzcxx)) {
                        return this;
                    }
                    continue;
            }
            zzflj.zza(zzfls);
        }
    }

    public final void zza(zzflk zzflk) {
        Integer num = this.zzbei;
        if (num != null) {
            zzflk.zzad(9, num.intValue());
        }
        String str = this.zzbej;
        if (str != null) {
            zzflk.zzp(10, str);
        }
        num = this.zzbek;
        int i = 0;
        if (num != null) {
            int intValue = num.intValue();
            zzflk.zzac(11, 0);
            zzflk.zzmy(intValue);
        }
        num = this.zzbel;
        if (num != null) {
            zzflk.zzad(12, num.intValue());
        }
        zzfls zzfls = this.zzbem;
        if (zzfls != null) {
            zzflk.zza(13, zzfls);
        }
        long[] jArr = this.zzben;
        if (jArr != null && jArr.length > 0) {
            while (true) {
                jArr = this.zzben;
                if (i >= jArr.length) {
                    break;
                }
                zzflk.zza(14, jArr[i]);
                i++;
            }
        }
        zzfls = this.zzbeo;
        if (zzfls != null) {
            zzflk.zza(15, zzfls);
        }
        zzfls = this.zzbep;
        if (zzfls != null) {
            zzflk.zza(16, zzfls);
        }
        zzfls = this.zzbeq;
        if (zzfls != null) {
            zzflk.zza(17, zzfls);
        }
        zzfls = this.zzber;
        if (zzfls != null) {
            zzflk.zza(18, zzfls);
        }
        super.zza(zzflk);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzq() {
        int zzq = super.zzq();
        Integer num = this.zzbei;
        if (num != null) {
            zzq += zzflk.zzag(9, num.intValue());
        }
        String str = this.zzbej;
        if (str != null) {
            zzq += zzflk.zzq(10, str);
        }
        num = this.zzbek;
        if (num != null) {
            zzq += zzflk.zzlw(11) + zzflk.zzmf(num.intValue());
        }
        num = this.zzbel;
        if (num != null) {
            zzq += zzflk.zzag(12, num.intValue());
        }
        zzfls zzfls = this.zzbem;
        if (zzfls != null) {
            zzq += zzflk.zzb(13, zzfls);
        }
        long[] jArr = this.zzben;
        if (jArr != null && jArr.length > 0) {
            long[] jArr2;
            int i = 0;
            int i2 = 0;
            while (true) {
                jArr2 = this.zzben;
                if (i >= jArr2.length) {
                    break;
                }
                i2 += zzflk.zzdj(jArr2[i]);
                i++;
            }
            zzq = (zzq + i2) + (jArr2.length * 1);
        }
        zzfls = this.zzbeo;
        if (zzfls != null) {
            zzq += zzflk.zzb(15, zzfls);
        }
        zzfls = this.zzbep;
        if (zzfls != null) {
            zzq += zzflk.zzb(16, zzfls);
        }
        zzfls = this.zzbeq;
        if (zzfls != null) {
            zzq += zzflk.zzb(17, zzfls);
        }
        zzfls = this.zzber;
        return zzfls != null ? zzq + zzflk.zzb(18, zzfls) : zzq;
    }
}
