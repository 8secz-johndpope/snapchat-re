package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdwg.zzb;
import java.security.GeneralSecurityException;

final class zzdtx implements zzdtf<zzdsy> {
    zzdtx() {
    }

    private final zzdsy zzd(zzfgs zzfgs) {
        try {
            zzdwx zzal = zzdwx.zzal(zzfgs);
            if (zzal instanceof zzdwx) {
                zzal = zzal;
                zzdyp.zzw(zzal.getVersion(), 0);
                String zzbsi = zzal.zzbsf().zzbsi();
                return new zzdtw(zzal.zzbsf().zzbsj(), zzdti.zzol(zzbsi).zzok(zzbsi));
            }
            throw new GeneralSecurityException("expected KmsEnvelopeAeadKey proto");
        } catch (zzfie e) {
            throw new GeneralSecurityException("expected serialized KmSEnvelopeAeadKey proto", e);
        }
    }

    public final int getVersion() {
        return 0;
    }

    public final zzfjc zzb(zzfgs zzfgs) {
        try {
            return zzb(zzdwz.zzam(zzfgs));
        } catch (zzfie e) {
            throw new GeneralSecurityException("expected serialized KmsEnvelopeAeadKeyFormat proto", e);
        }
    }

    public final zzfjc zzb(zzfjc zzfjc) {
        if (zzfjc instanceof zzdwz) {
            return zzdwx.zzbsg().zzb((zzdwz) zzfjc).zzgw(0).zzczx();
        }
        throw new GeneralSecurityException("expected KmsEnvelopeAeadKeyFormat proto");
    }

    public final zzdwg zzc(zzfgs zzfgs) {
        return (zzdwg) zzdwg.zzbqx().zzop("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey").zzai(((zzdwx) zzb(zzfgs)).toByteString()).zzb(zzb.REMOTE).zzczx();
    }
}
