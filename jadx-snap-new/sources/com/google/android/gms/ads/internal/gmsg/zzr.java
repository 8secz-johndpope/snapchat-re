package com.google.android.gms.ads.internal.gmsg;

import com.brightcove.player.event.EventType;
import com.google.android.gms.internal.zzaof;
import java.util.Map;

final class zzr implements zzt<zzaof> {
    zzr() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzaof zzaof = (zzaof) obj;
        if (map.keySet().contains("start")) {
            zzaof.zzua().zzuu();
        } else if (map.keySet().contains(EventType.STOP)) {
            zzaof.zzua().zzuv();
        } else {
            if (map.keySet().contains("cancel")) {
                zzaof.zzua().zzuw();
            }
        }
    }
}
