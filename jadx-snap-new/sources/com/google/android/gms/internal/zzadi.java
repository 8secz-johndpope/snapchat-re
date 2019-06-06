package com.google.android.gms.internal;

import com.brightcove.player.event.Event;
import com.google.android.gms.ads.internal.gmsg.zzt;
import java.util.Map;

public final class zzadi implements zzt<Object> {
    public final void zza(Object obj, Map<String, String> map) {
        String str = (String) map.get("request_id");
        String valueOf = String.valueOf((String) map.get(Event.ERRORS));
        String str2 = "Invalid request: ";
        zzaky.zzcz(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        zzada.zzcvb.zzat(str);
    }
}
