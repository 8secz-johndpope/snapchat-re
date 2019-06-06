package com.google.android.gms.internal;

public final class zzbg extends zzflm<zzbg> {
    public byte[] zzgk;
    public byte[][] zzgp;
    private Integer zzgq;
    public Integer zzgr;

    public zzbg() {
        this.zzgp = zzflv.zzpwd;
        this.zzgk = null;
        this.zzpnr = -1;
    }

    private final zzbg zzd(zzflj zzflj) {
        while (true) {
            int zzcxx = zzflj.zzcxx();
            if (zzcxx == 0) {
                return this;
            }
            int length;
            int zzcym;
            StringBuilder stringBuilder;
            if (zzcxx == 10) {
                zzcxx = zzflv.zzb(zzflj, 10);
                byte[][] bArr = this.zzgp;
                length = bArr == null ? 0 : bArr.length;
                byte[][] bArr2 = new byte[(zzcxx + length)][];
                if (length != 0) {
                    System.arraycopy(this.zzgp, 0, bArr2, 0, length);
                }
                while (length < bArr2.length - 1) {
                    bArr2[length] = zzflj.readBytes();
                    zzflj.zzcxx();
                    length++;
                }
                bArr2[length] = zzflj.readBytes();
                this.zzgp = bArr2;
            } else if (zzcxx == 18) {
                this.zzgk = zzflj.readBytes();
            } else if (zzcxx == 24) {
                length = zzflj.getPosition();
                zzcym = zzflj.zzcym();
                if (!(zzcym == 0 || zzcym == 1)) {
                    if (zzcym != 2) {
                        stringBuilder = new StringBuilder(41);
                        stringBuilder.append(zzcym);
                        stringBuilder.append(" is not a valid enum ProtoName");
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
                this.zzgq = Integer.valueOf(zzcym);
            } else if (zzcxx == 32) {
                length = zzflj.getPosition();
                try {
                    zzcym = zzflj.zzcym();
                    if (!(zzcym == 0 || zzcym == 1 || zzcym == 2)) {
                        if (zzcym != 3) {
                            stringBuilder = new StringBuilder(48);
                            stringBuilder.append(zzcym);
                            stringBuilder.append(" is not a valid enum EncryptionMethod");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    }
                    this.zzgr = Integer.valueOf(zzcym);
                } catch (IllegalArgumentException unused) {
                    zzflj.zzmw(length);
                    zza(zzflj, zzcxx);
                }
            } else if (!super.zza(zzflj, zzcxx)) {
                return this;
            }
        }
    }

    public final void zza(zzflk zzflk) {
        byte[][] bArr = this.zzgp;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            while (true) {
                byte[][] bArr2 = this.zzgp;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    zzflk.zzc(1, bArr3);
                }
                i++;
            }
        }
        byte[] bArr4 = this.zzgk;
        if (bArr4 != null) {
            zzflk.zzc(2, bArr4);
        }
        Integer num = this.zzgq;
        if (num != null) {
            zzflk.zzad(3, num.intValue());
        }
        num = this.zzgr;
        if (num != null) {
            zzflk.zzad(4, num.intValue());
        }
        super.zza(zzflk);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzq() {
        int zzq = super.zzq();
        byte[][] bArr = this.zzgp;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                byte[][] bArr2 = this.zzgp;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    i3++;
                    i2 += zzflk.zzbg(bArr3);
                }
                i++;
            }
            zzq = (zzq + i2) + (i3 * 1);
        }
        byte[] bArr4 = this.zzgk;
        if (bArr4 != null) {
            zzq += zzflk.zzd(2, bArr4);
        }
        Integer num = this.zzgq;
        if (num != null) {
            zzq += zzflk.zzag(3, num.intValue());
        }
        num = this.zzgr;
        return num != null ? zzq + zzflk.zzag(4, num.intValue()) : zzq;
    }
}
