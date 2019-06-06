package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzdxf implements zzdyi {
    private final SecretKeySpec zzmkf;
    private final int zzmkg;
    private final int zzmkh = ((Cipher) zzdxx.zzmlk.zzoy("AES/CTR/NoPadding")).getBlockSize();

    public zzdxf(byte[] bArr, int i) {
        this.zzmkf = new SecretKeySpec(bArr, "AES");
        if (i < 12 || i > this.zzmkh) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.zzmkg = i;
    }

    public final byte[] zzaj(byte[] bArr) {
        int length = bArr.length;
        int i = this.zzmkg;
        if (length <= Integer.MAX_VALUE - i) {
            byte[] bArr2 = new byte[(bArr.length + i)];
            byte[] zzgy = zzdyl.zzgy(i);
            System.arraycopy(zzgy, 0, bArr2, 0, this.zzmkg);
            int length2 = bArr.length;
            int i2 = this.zzmkg;
            Cipher cipher = (Cipher) zzdxx.zzmlk.zzoy("AES/CTR/NoPadding");
            byte[] bArr3 = new byte[this.zzmkh];
            System.arraycopy(zzgy, 0, bArr3, 0, this.zzmkg);
            cipher.init(1, this.zzmkf, new IvParameterSpec(bArr3));
            if (cipher.doFinal(bArr, 0, length2, bArr2, i2) == length2) {
                return bArr2;
            }
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        int i3 = Integer.MAX_VALUE - i;
        StringBuilder stringBuilder = new StringBuilder(43);
        stringBuilder.append("plaintext length can not exceed ");
        stringBuilder.append(i3);
        throw new GeneralSecurityException(stringBuilder.toString());
    }
}
