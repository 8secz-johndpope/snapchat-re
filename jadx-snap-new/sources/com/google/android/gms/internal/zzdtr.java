package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdwg.zzb;
import java.security.GeneralSecurityException;

final class zzdtr implements zzdtf<zzdyi> {
    zzdtr() {
    }

    private static void zza(zzduu zzduu) {
        if (zzduu.zzboz() < 12 || zzduu.zzboz() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    private final zzdxf zze(zzfgs zzfgs) {
        try {
            zzduq zzl = zzduq.zzl(zzfgs);
            if (zzl instanceof zzduq) {
                zzl = zzl;
                zzdyp.zzw(zzl.getVersion(), 0);
                zzdyp.zzgz(zzl.zzbot().size());
                zza(zzl.zzbos());
                return new zzdxf(zzl.zzbot().toByteArray(), zzl.zzbos().zzboz());
            }
            throw new GeneralSecurityException("expected AesCtrKey proto");
        } catch (zzfie e) {
            throw new GeneralSecurityException("expected serialized AesCtrKey proto", e);
        }
    }

    public final int getVersion() {
        return 0;
    }

    public final zzfjc zzb(zzfgs zzfgs) {
        try {
            return zzb(zzdus.zzn(zzfgs));
        } catch (zzfie e) {
            throw new GeneralSecurityException("expected serialized AesCtrKeyFormat proto", e);
        }
    }

    public final zzfjc zzb(zzfjc zzfjc) {
        if (zzfjc instanceof zzdus) {
            zzdus zzdus = (zzdus) zzfjc;
            zzdyp.zzgz(zzdus.getKeySize());
            zza(zzdus.zzbos());
            return zzduq.zzbou().zzc(zzdus.zzbos()).zzm(zzfgs.zzaz(zzdyl.zzgy(zzdus.getKeySize()))).zzgd(0).zzczx();
        }
        throw new GeneralSecurityException("expected AesCtrKeyFormat proto");
    }

    public final zzdwg zzc(zzfgs zzfgs) {
        return (zzdwg) zzdwg.zzbqx().zzop("type.googleapis.com/google.crypto.tink.AesCtrKey").zzai(((zzduq) zzb(zzfgs)).toByteString()).zzb(zzb.SYMMETRIC).zzczx();
    }
}
