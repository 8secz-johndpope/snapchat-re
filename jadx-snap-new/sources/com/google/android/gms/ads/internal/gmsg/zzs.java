package com.google.android.gms.ads.internal.gmsg;

import com.brightcove.player.event.EventType;
import com.google.android.gms.internal.zzaof;
import java.util.Map;

final class zzs implements zzt<zzaof> {
    zzs() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzaof zzaof = (zzaof) obj;
        if (map.keySet().contains("start")) {
            zzaof.zzak(true);
        }
        if (map.keySet().contains(EventType.STOP)) {
            zzaof.zzak(false);
        }
    }
}
