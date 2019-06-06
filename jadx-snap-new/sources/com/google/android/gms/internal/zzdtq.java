package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdwg.zzb;
import java.security.GeneralSecurityException;
import java.util.logging.Logger;

class zzdtq implements zzdtf<zzdsy> {
    private static final Logger logger = Logger.getLogger(zzdtq.class.getName());

    zzdtq() {
        zzdtn.zza("type.googleapis.com/google.crypto.tink.AesCtrKey", new zzdtr());
    }

    private final zzdsy zzd(zzfgs zzfgs) {
        try {
            zzdum zzi = zzdum.zzi(zzfgs);
            if (zzi instanceof zzdum) {
                zzi = zzi;
                zzdyp.zzw(zzi.getVersion(), 0);
                return new zzdxw((zzdyi) zzdtn.zzb("type.googleapis.com/google.crypto.tink.AesCtrKey", zzi.zzbol()), (zzdtj) zzdtn.zzb("type.googleapis.com/google.crypto.tink.HmacKey", zzi.zzbom()), zzi.zzbom().zzbqk().zzbqr());
            }
            throw new GeneralSecurityException("expected AesCtrHmacAeadKey proto");
        } catch (zzfie e) {
            throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKey proto", e);
        }
    }

    public final int getVersion() {
        return 0;
    }

    public final zzfjc zzb(zzfgs zzfgs) {
        try {
            return zzb(zzduo.zzj(zzfgs));
        } catch (zzfie e) {
            throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKeyFormat proto", e);
        }
    }

    public final zzfjc zzb(zzfjc zzfjc) {
        if (zzfjc instanceof zzduo) {
            zzduo zzduo = (zzduo) zzfjc;
            zzduq zzduq = (zzduq) zzdtn.zza("type.googleapis.com/google.crypto.tink.AesCtrKey", zzduo.zzbop());
            return zzdum.zzbon().zzb(zzduq).zzb((zzdwa) zzdtn.zza("type.googleapis.com/google.crypto.tink.HmacKey", zzduo.zzboq())).zzgc(0).zzczx();
        }
        throw new GeneralSecurityException("expected AesCtrHmacAeadKeyFormat proto");
    }

    public final zzdwg zzc(zzfgs zzfgs) {
        return (zzdwg) zzdwg.zzbqx().zzop("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey").zzai(((zzdum) zzb(zzfgs)).toByteString()).zzb(zzb.SYMMETRIC).zzczx();
    }
}
