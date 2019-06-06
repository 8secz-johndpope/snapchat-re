package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdwg.zzb;
import java.security.GeneralSecurityException;

final class zzdtt implements zzdtf<zzdsy> {
    zzdtt() {
    }

    private final zzdsy zzd(zzfgs zzfgs) {
        String str = "expected AesGcmKey proto";
        try {
            zzdvc zzr = zzdvc.zzr(zzfgs);
            if (zzr instanceof zzdvc) {
                zzr = zzr;
                zzdyp.zzw(zzr.getVersion(), 0);
                zzdyp.zzgz(zzr.zzbot().size());
                return new zzdxh(zzr.zzbot().toByteArray());
            }
            throw new GeneralSecurityException(str);
        } catch (zzfie unused) {
            throw new GeneralSecurityException(str);
        }
    }

    public final int getVersion() {
        return 0;
    }

    public final zzfjc zzb(zzfgs zzfgs) {
        try {
            return zzb(zzdve.zzt(zzfgs));
        } catch (zzfie e) {
            throw new GeneralSecurityException("expected serialized AesGcmKeyFormat proto", e);
        }
    }

    public final zzfjc zzb(zzfjc zzfjc) {
        if (zzfjc instanceof zzdve) {
            zzdve zzdve = (zzdve) zzfjc;
            zzdyp.zzgz(zzdve.getKeySize());
            return zzdvc.zzbpi().zzs(zzfgs.zzaz(zzdyl.zzgy(zzdve.getKeySize()))).zzgf(0).zzczx();
        }
        throw new GeneralSecurityException("expected AesGcmKeyFormat proto");
    }

    public final zzdwg zzc(zzfgs zzfgs) {
        return (zzdwg) zzdwg.zzbqx().zzop("type.googleapis.com/google.crypto.tink.AesGcmKey").zzai(((zzdvc) zzb(zzfgs)).toByteString()).zzb(zzb.SYMMETRIC).zzczx();
    }
}
