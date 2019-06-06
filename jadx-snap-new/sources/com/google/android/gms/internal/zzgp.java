package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.ads.internal.js.zzaj;
import java.util.Map;

final class zzgp implements zzt<zzaj> {
    private /* synthetic */ zzgh zzaxf;

    zzgp(zzgh zzgh) {
        this.zzaxf = zzgh;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzaj zzaj = (zzaj) obj;
        if (this.zzaxf.zzawv.zze(map)) {
            this.zzaxf.zzaxb.zza(zzaj, map);
        }
    }
}
