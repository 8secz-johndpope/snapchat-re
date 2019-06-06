package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzaof;
import java.util.Map;

final class zzl implements zzt<zzaof> {
    zzl() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzaof zzaof = (zzaof) obj;
        zzd zztw = zzaof.zztw();
        if (zztw != null) {
            zztw.close();
            return;
        }
        zzd zztx = zzaof.zztx();
        if (zztx != null) {
            zztx.close();
        } else {
            zzaky.zzcz("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
