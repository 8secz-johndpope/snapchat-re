package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdwp.zzb;
import com.google.android.gms.internal.zzdwr.zza;
import java.security.GeneralSecurityException;

public final class zzdtg {
    private zzdwp zzmet;

    private zzdtg(zzdwp zzdwp) {
        this.zzmet = zzdwp;
    }

    static final zzdtg zza(zzdwp zzdwp) {
        if (zzdwp != null && zzdwp.zzbrl() > 0) {
            return new zzdtg(zzdwp);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    public final String toString() {
        zzdwp zzdwp = this.zzmet;
        zza zzgs = zzdwr.zzbru().zzgs(zzdwp.zzbrj());
        for (zzb zzb : zzdwp.zzbrk()) {
            zzgs.zzb((zzdwr.zzb) zzdwr.zzb.zzbrw().zzov(zzb.zzbro().zzbqu()).zzb(zzb.zzbrp()).zzb(zzb.zzbrr()).zzgu(zzb.zzbrq()).zzczx());
        }
        return ((zzdwr) zzgs.zzczx()).toString();
    }

    /* Access modifiers changed, original: final */
    public final zzdwp zzboe() {
        return this.zzmet;
    }
}
