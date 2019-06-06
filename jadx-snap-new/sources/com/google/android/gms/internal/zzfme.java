package com.google.android.gms.internal;

public final class zzfme extends zzflm<zzfme> {
    private static volatile zzfme[] zzpxh;
    public String url;
    public Integer zzjsx;
    public zzflz zzpxi;
    private zzfmb zzpxj;
    private Integer zzpxk;
    private int[] zzpxl;
    private String zzpxm;
    public Integer zzpxn;
    public String[] zzpxo;

    public zzfme() {
        this.zzjsx = null;
        this.url = null;
        this.zzpxi = null;
        this.zzpxj = null;
        this.zzpxk = null;
        this.zzpxl = zzflv.zzpvy;
        this.zzpxm = null;
        this.zzpxn = null;
        this.zzpxo = zzflv.EMPTY_STRING_ARRAY;
        this.zzpvl = null;
        this.zzpnr = -1;
    }

    private final zzfme zzbm(zzflj zzflj) {
        while (true) {
            zzfls zzfls;
            int zzcxx = zzflj.zzcxx();
            int[] iArr;
            int length;
            switch (zzcxx) {
                case 0:
                    return this;
                case 8:
                    this.zzjsx = Integer.valueOf(zzflj.zzcya());
                    continue;
                case 18:
                    this.url = zzflj.readString();
                    continue;
                case 26:
                    if (this.zzpxi == null) {
                        this.zzpxi = new zzflz();
                    }
                    zzfls = this.zzpxi;
                    break;
                case 34:
                    if (this.zzpxj == null) {
                        this.zzpxj = new zzfmb();
                    }
                    zzfls = this.zzpxj;
                    break;
                case 40:
                    this.zzpxk = Integer.valueOf(zzflj.zzcya());
                    continue;
                case 48:
                    zzcxx = zzflv.zzb(zzflj, 48);
                    iArr = this.zzpxl;
                    length = iArr == null ? 0 : iArr.length;
                    int[] iArr2 = new int[(zzcxx + length)];
                    if (length != 0) {
                        System.arraycopy(this.zzpxl, 0, iArr2, 0, length);
                    }
                    while (length < iArr2.length - 1) {
                        iArr2[length] = zzflj.zzcya();
                        zzflj.zzcxx();
                        length++;
                    }
                    iArr2[length] = zzflj.zzcya();
                    this.zzpxl = iArr2;
                    continue;
                case 50:
                    zzcxx = zzflj.zzli(zzflj.zzcym());
                    int position = zzflj.getPosition();
                    length = 0;
                    while (zzflj.zzcyo() > 0) {
                        zzflj.zzcya();
                        length++;
                    }
                    zzflj.zzmw(position);
                    int[] iArr3 = this.zzpxl;
                    position = iArr3 == null ? 0 : iArr3.length;
                    iArr = new int[(length + position)];
                    if (position != 0) {
                        System.arraycopy(this.zzpxl, 0, iArr, 0, position);
                    }
                    while (position < iArr.length) {
                        iArr[position] = zzflj.zzcya();
                        position++;
                    }
                    this.zzpxl = iArr;
                    zzflj.zzlj(zzcxx);
                    continue;
                case 58:
                    this.zzpxm = zzflj.readString();
                    continue;
                case 64:
                    try {
                        length = zzflj.zzcya();
                        if (!(length == 0 || length == 1 || length == 2)) {
                            if (length != 3) {
                                StringBuilder stringBuilder = new StringBuilder(46);
                                stringBuilder.append(length);
                                stringBuilder.append(" is not a valid enum AdResourceType");
                                throw new IllegalArgumentException(stringBuilder.toString());
                            }
                        }
                        this.zzpxn = Integer.valueOf(length);
                        continue;
                    } catch (IllegalArgumentException unused) {
                        zzflj.zzmw(zzflj.getPosition());
                        zza(zzflj, zzcxx);
                        break;
                    }
                case 74:
                    zzcxx = zzflv.zzb(zzflj, 74);
                    String[] strArr = this.zzpxo;
                    length = strArr == null ? 0 : strArr.length;
                    String[] strArr2 = new String[(zzcxx + length)];
                    if (length != 0) {
                        System.arraycopy(this.zzpxo, 0, strArr2, 0, length);
                    }
                    while (length < strArr2.length - 1) {
                        strArr2[length] = zzflj.readString();
                        zzflj.zzcxx();
                        length++;
                    }
                    strArr2[length] = zzflj.readString();
                    this.zzpxo = strArr2;
                    continue;
                default:
                    if (!super.zza(zzflj, zzcxx)) {
                        return this;
                    }
                    continue;
            }
            zzflj.zza(zzfls);
        }
    }

    public static zzfme[] zzdct() {
        if (zzpxh == null) {
            synchronized (zzflq.zzpvt) {
                if (zzpxh == null) {
                    zzpxh = new zzfme[0];
                }
            }
        }
        return zzpxh;
    }

    public final void zza(zzflk zzflk) {
        zzflk.zzad(1, this.zzjsx.intValue());
        String str = this.url;
        if (str != null) {
            zzflk.zzp(2, str);
        }
        zzfls zzfls = this.zzpxi;
        if (zzfls != null) {
            zzflk.zza(3, zzfls);
        }
        zzfls = this.zzpxj;
        if (zzfls != null) {
            zzflk.zza(4, zzfls);
        }
        Integer num = this.zzpxk;
        if (num != null) {
            zzflk.zzad(5, num.intValue());
        }
        int[] iArr = this.zzpxl;
        int i = 0;
        if (iArr != null && iArr.length > 0) {
            int i2 = 0;
            while (true) {
                int[] iArr2 = this.zzpxl;
                if (i2 >= iArr2.length) {
                    break;
                }
                zzflk.zzad(6, iArr2[i2]);
                i2++;
            }
        }
        str = this.zzpxm;
        if (str != null) {
            zzflk.zzp(7, str);
        }
        num = this.zzpxn;
        if (num != null) {
            zzflk.zzad(8, num.intValue());
        }
        String[] strArr = this.zzpxo;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                strArr = this.zzpxo;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    zzflk.zzp(9, str);
                }
                i++;
            }
        }
        super.zza(zzflk);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzq() {
        int i;
        int i2;
        int zzq = super.zzq() + zzflk.zzag(1, this.zzjsx.intValue());
        String str = this.url;
        if (str != null) {
            zzq += zzflk.zzq(2, str);
        }
        zzfls zzfls = this.zzpxi;
        if (zzfls != null) {
            zzq += zzflk.zzb(3, zzfls);
        }
        zzfls = this.zzpxj;
        if (zzfls != null) {
            zzq += zzflk.zzb(4, zzfls);
        }
        Integer num = this.zzpxk;
        if (num != null) {
            zzq += zzflk.zzag(5, num.intValue());
        }
        int[] iArr = this.zzpxl;
        int i3 = 0;
        if (iArr != null && iArr.length > 0) {
            int[] iArr2;
            i = 0;
            i2 = 0;
            while (true) {
                iArr2 = this.zzpxl;
                if (i >= iArr2.length) {
                    break;
                }
                i2 += zzflk.zzlx(iArr2[i]);
                i++;
            }
            zzq = (zzq + i2) + (iArr2.length * 1);
        }
        str = this.zzpxm;
        if (str != null) {
            zzq += zzflk.zzq(7, str);
        }
        num = this.zzpxn;
        if (num != null) {
            zzq += zzflk.zzag(8, num.intValue());
        }
        String[] strArr = this.zzpxo;
        if (strArr == null || strArr.length <= 0) {
            return zzq;
        }
        i = 0;
        i2 = 0;
        while (true) {
            String[] strArr2 = this.zzpxo;
            if (i3 >= strArr2.length) {
                return (zzq + i) + (i2 * 1);
            }
            String str2 = strArr2[i3];
            if (str2 != null) {
                i2++;
                i += zzflk.zztx(str2);
            }
            i3++;
        }
    }
}
