package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

public final class zzdxq {
    private ECPublicKey zzmku;

    public zzdxq(ECPublicKey eCPublicKey) {
        this.zzmku = eCPublicKey;
    }

    public final zzdxr zza(String str, byte[] bArr, byte[] bArr2, int i, zzdxv zzdxv) {
        KeyPair zza = zzdxs.zza(this.zzmku.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) zza.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) zza.getPrivate();
        ECPublicKey eCPublicKey2 = this.zzmku;
        ECParameterSpec params = eCPublicKey2.getParams();
        ECParameterSpec params2 = eCPrivateKey.getParams();
        if (params.getCurve().equals(params2.getCurve()) && params.getGenerator().equals(params2.getGenerator()) && params.getOrder().equals(params2.getOrder()) && params.getCofactor() == params2.getCofactor()) {
            byte[] bArr3;
            byte[] zza2 = zzdxs.zza(eCPrivateKey, eCPublicKey2.getW());
            EllipticCurve curve = eCPublicKey.getParams().getCurve();
            ECPoint w = eCPublicKey.getW();
            zzdxs.zza(w, curve);
            int zzb = zzdxs.zzb(curve);
            int i2 = zzdxt.zzmkx[zzdxv.ordinal()];
            byte[] bArr4;
            if (i2 == 1) {
                int i3 = (zzb * 2) + 1;
                bArr4 = new byte[i3];
                byte[] toByteArray = w.getAffineX().toByteArray();
                byte[] toByteArray2 = w.getAffineY().toByteArray();
                System.arraycopy(toByteArray2, 0, bArr4, i3 - toByteArray2.length, toByteArray2.length);
                System.arraycopy(toByteArray, 0, bArr4, (zzb + 1) - toByteArray.length, toByteArray.length);
                bArr4[0] = (byte) 4;
                bArr3 = bArr4;
            } else if (i2 == 2) {
                zzb++;
                bArr3 = new byte[zzb];
                bArr4 = w.getAffineX().toByteArray();
                System.arraycopy(bArr4, 0, bArr3, zzb - bArr4.length, bArr4.length);
                bArr3[0] = (byte) (w.getAffineY().testBit(0) ? 3 : 2);
            } else {
                String valueOf = String.valueOf(zzdxv);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 15);
                stringBuilder.append("invalid format:");
                stringBuilder.append(valueOf);
                throw new GeneralSecurityException(stringBuilder.toString());
            }
            return new zzdxr(bArr3, zzdyg.zza(str, zzdxi.zzc(bArr3, zza2), bArr, bArr2, i));
        }
        throw new GeneralSecurityException("invalid public key spec");
    }
}
