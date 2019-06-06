package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdwg.zzb;
import java.security.GeneralSecurityException;

final class zzdts implements zzdtf<zzdsy> {
    zzdts() {
    }

    private final zzdsy zzd(zzfgs zzfgs) {
        try {
            zzduw zzo = zzduw.zzo(zzfgs);
            if (zzo instanceof zzduw) {
                zzo = zzo;
                zzdyp.zzw(zzo.getVersion(), 0);
                zzdyp.zzgz(zzo.zzbot().size());
                if (zzo.zzbpc().zzboz() != 12) {
                    if (zzo.zzbpc().zzboz() != 16) {
                        throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                    }
                }
                return new zzdxg(zzo.zzbot().toByteArray(), zzo.zzbpc().zzboz());
            }
            throw new GeneralSecurityException("expected AesEaxKey proto");
        } catch (zzfie e) {
            throw new GeneralSecurityException("expected serialized AesEaxKey proto", e);
        }
    }

    public final int getVersion() {
        return 0;
    }

    public final zzfjc zzb(zzfgs zzfgs) {
        try {
            return zzb(zzduy.zzq(zzfgs));
        } catch (zzfie e) {
            throw new GeneralSecurityException("expected serialized AesEaxKeyFormat proto", e);
        }
    }

    public final zzfjc zzb(zzfjc zzfjc) {
        if (zzfjc instanceof zzduy) {
            zzduy zzduy = (zzduy) zzfjc;
            zzdyp.zzgz(zzduy.getKeySize());
            if (zzduy.zzbpc().zzboz() == 12 || zzduy.zzbpc().zzboz() == 16) {
                return zzduw.zzbpd().zzp(zzfgs.zzaz(zzdyl.zzgy(zzduy.getKeySize()))).zzb(zzduy.zzbpc()).zzge(0).zzczx();
            }
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
        throw new GeneralSecurityException("expected AesEaxKeyFormat proto");
    }

    public final zzdwg zzc(zzfgs zzfgs) {
        return (zzdwg) zzdwg.zzbqx().zzop("type.googleapis.com/google.crypto.tink.AesEaxKey").zzai(((zzduw) zzb(zzfgs)).toByteString()).zzb(zzb.SYMMETRIC).zzczx();
    }
}
