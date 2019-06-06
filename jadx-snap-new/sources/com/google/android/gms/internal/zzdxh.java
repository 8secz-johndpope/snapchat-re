package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzdxh implements zzdsy {
    private final SecretKey zzmkl;

    public zzdxh(byte[] bArr) {
        this.zzmkl = new SecretKeySpec(bArr, "AES");
    }

    public final byte[] zzd(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[((bArr.length + 12) + 16)];
            byte[] zzgy = zzdyl.zzgy(12);
            System.arraycopy(zzgy, 0, bArr3, 0, 12);
            Cipher cipher = (Cipher) zzdxx.zzmlk.zzoy("AES/GCM/NoPadding");
            cipher.init(1, this.zzmkl, new GCMParameterSpec(128, zzgy));
            cipher.updateAAD(bArr2);
            cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
