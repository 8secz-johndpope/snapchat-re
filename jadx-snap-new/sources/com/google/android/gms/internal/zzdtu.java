package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdwg.zzb;
import java.security.GeneralSecurityException;

final class zzdtu implements zzdtf<zzdsy> {
    zzdtu() {
    }

    private static zzdvg zzboj() {
        return (zzdvg) zzdvg.zzbpl().zzgg(0).zzv(zzfgs.zzaz(zzdyl.zzgy(32))).zzczx();
    }

    private final zzdsy zzd(zzfgs zzfgs) {
        try {
            zzdvg zzu = zzdvg.zzu(zzfgs);
            if (zzu instanceof zzdvg) {
                zzu = zzu;
                zzdyp.zzw(zzu.getVersion(), 0);
                if (zzu.zzbot().size() == 32) {
                    return new zzdxl(zzu.zzbot().toByteArray());
                }
                throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
            }
            throw new GeneralSecurityException("expected ChaCha20Poly1305Key proto");
        } catch (zzfie e) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305 key", e);
        }
    }

    public final int getVersion() {
        return 0;
    }

    public final zzfjc zzb(zzfgs zzfgs) {
        return zzboj();
    }

    public final zzfjc zzb(zzfjc zzfjc) {
        return zzboj();
    }

    public final zzdwg zzc(zzfgs zzfgs) {
        return (zzdwg) zzdwg.zzbqx().zzop("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key").zzai(zzboj().toByteString()).zzb(zzb.SYMMETRIC).zzczx();
    }
}
