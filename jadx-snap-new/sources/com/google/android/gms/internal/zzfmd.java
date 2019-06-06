package com.google.android.gms.internal;

public final class zzfmd extends zzflm<zzfmd> {
    public String mimeType;
    public Integer zzbdh;
    public byte[] zzpxg;

    public zzfmd() {
        this.zzbdh = null;
        this.mimeType = null;
        this.zzpxg = null;
        this.zzpvl = null;
        this.zzpnr = -1;
    }

    private final zzfmd zzbl(zzflj zzflj) {
        while (true) {
            int zzcxx = zzflj.zzcxx();
            if (zzcxx == 0) {
                return this;
            }
            if (zzcxx == 8) {
                try {
                    int zzcya = zzflj.zzcya();
                    if (zzcya != 0) {
                        if (zzcya != 1) {
                            StringBuilder stringBuilder = new StringBuilder(36);
                            stringBuilder.append(zzcya);
                            stringBuilder.append(" is not a valid enum Type");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    }
                    this.zzbdh = Integer.valueOf(zzcya);
                } catch (IllegalArgumentException unused) {
                    zzflj.zzmw(zzflj.getPosition());
                    zza(zzflj, zzcxx);
                }
            } else if (zzcxx == 18) {
                this.mimeType = zzflj.readString();
            } else if (zzcxx == 26) {
                this.zzpxg = zzflj.readBytes();
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
        String str = this.mimeType;
        if (str != null) {
            zzflk.zzp(2, str);
        }
        byte[] bArr = this.zzpxg;
        if (bArr != null) {
            zzflk.zzc(3, bArr);
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
        String str = this.mimeType;
        if (str != null) {
            zzq += zzflk.zzq(2, str);
        }
        byte[] bArr = this.zzpxg;
        return bArr != null ? zzq + zzflk.zzd(3, bArr) : zzq;
    }
}
