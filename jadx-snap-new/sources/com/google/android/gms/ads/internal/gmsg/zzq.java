package com.google.android.gms.ads.internal.gmsg;

import com.brightcove.player.event.EventType;
import com.google.android.gms.internal.zzaof;
import java.util.Map;

final class zzq implements zzt<zzaof> {
    zzq() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzaof zzaof = (zzaof) obj;
        String str = (String) map.get("action");
        if (EventType.PAUSE.equals(str)) {
            zzaof.zzcp();
            return;
        }
        if ("resume".equals(str)) {
            zzaof.zzcq();
        }
    }
}
