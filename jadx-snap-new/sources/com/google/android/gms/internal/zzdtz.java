package com.google.android.gms.internal;

import java.security.GeneralSecurityException;

final class zzdtz implements zzdtf<zzdte> {
    zzdtz() {
    }

    private final zzdte zzg(zzfgs zzfgs) {
        try {
            zzdvs zzab = zzdvs.zzab(zzfgs);
            if (zzab instanceof zzdvs) {
                zzab = zzab;
                zzdyp.zzw(zzab.getVersion(), 0);
                zzduf.zza(zzab.zzbpq());
                zzdvo zzbpq = zzab.zzbpq();
                zzdvu zzbps = zzbpq.zzbps();
                return new zzdxo(zzdxs.zza(zzduf.zza(zzbps.zzbqf()), zzab.zzbqa().toByteArray(), zzab.zzbqb().toByteArray()), zzbps.zzbqh().toByteArray(), zzduf.zza(zzbps.zzbqg()), zzduf.zza(zzbpq.zzbpu()), new zzduh(zzbpq.zzbpt().zzbpn()));
            }
            throw new GeneralSecurityException("expected EciesAeadHkdfPublicKey proto");
        } catch (zzfie e) {
            throw new GeneralSecurityException("expected serialized EciesAeadHkdfPublicKey proto", e);
        }
    }

    public final int getVersion() {
        return 0;
    }

    public final zzfjc zzb(zzfgs zzfgs) {
        throw new GeneralSecurityException("Not implemented.");
    }

    public final zzfjc zzb(zzfjc zzfjc) {
        throw new GeneralSecurityException("Not implemented.");
    }

    public final zzdwg zzc(zzfgs zzfgs) {
        throw new GeneralSecurityException("Not implemented.");
    }
}
