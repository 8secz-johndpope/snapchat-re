package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdwg.zzb;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;

final class zzdty implements zzdtf<zzdtd> {
    zzdty() {
    }

    private final zzdtd zzf(zzfgs zzfgs) {
        try {
            zzdvq zzx = zzdvq.zzx(zzfgs);
            if (zzx instanceof zzdvq) {
                zzx = zzx;
                zzdyp.zzw(zzx.getVersion(), 0);
                zzduf.zza(zzx.zzbpx().zzbpq());
                zzdvo zzbpq = zzx.zzbpx().zzbpq();
                zzdvu zzbps = zzbpq.zzbps();
                zzdxu zza = zzduf.zza(zzbps.zzbqf());
                byte[] toByteArray = zzx.zzbot().toByteArray();
                return new zzdxn((ECPrivateKey) ((KeyFactory) zzdxx.zzmlq.zzoy("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, toByteArray), zzdxs.zza(zza))), zzbps.zzbqh().toByteArray(), zzduf.zza(zzbps.zzbqg()), zzduf.zza(zzbpq.zzbpu()), new zzduh(zzbpq.zzbpt().zzbpn()));
            }
            throw new GeneralSecurityException("expected EciesAeadHkdfPrivateKey proto");
        } catch (zzfie e) {
            throw new GeneralSecurityException("expected serialized EciesAeadHkdfPrivateKey proto", e);
        }
    }

    public final int getVersion() {
        return 0;
    }

    public final zzfjc zzb(zzfgs zzfgs) {
        try {
            return zzb(zzdvm.zzw(zzfgs));
        } catch (zzfie e) {
            throw new GeneralSecurityException("invalid EciesAeadHkdf key format", e);
        }
    }

    public final zzfjc zzb(zzfjc zzfjc) {
        if (zzfjc instanceof zzdvm) {
            zzdvm zzdvm = (zzdvm) zzfjc;
            zzduf.zza(zzdvm.zzbpq());
            KeyPair zza = zzdxs.zza(zzdxs.zza(zzduf.zza(zzdvm.zzbpq().zzbps().zzbqf())));
            ECPublicKey eCPublicKey = (ECPublicKey) zza.getPublic();
            ECPrivateKey eCPrivateKey = (ECPrivateKey) zza.getPrivate();
            ECPoint w = eCPublicKey.getW();
            return zzdvq.zzbpy().zzgi(0).zzb((zzdvs) zzdvs.zzbqc().zzgj(0).zzc(zzdvm.zzbpq()).zzac(zzfgs.zzaz(w.getAffineX().toByteArray())).zzad(zzfgs.zzaz(w.getAffineY().toByteArray())).zzczx()).zzy(zzfgs.zzaz(eCPrivateKey.getS().toByteArray())).zzczx();
        }
        throw new GeneralSecurityException("expected EciesAeadHkdfKeyFormat proto");
    }

    public final zzdwg zzc(zzfgs zzfgs) {
        return (zzdwg) zzdwg.zzbqx().zzop("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").zzai(((zzdvq) zzb(zzfgs)).toByteString()).zzb(zzb.ASYMMETRIC_PRIVATE).zzczx();
    }
}
