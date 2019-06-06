package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.zzt;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

final class zzqg implements zzt<Object> {
    private /* synthetic */ zzaan zzbze;
    private /* synthetic */ zzqb zzbzf;

    zzqg(zzqb zzqb, zzaan zzaan) {
        this.zzbzf = zzqb;
        this.zzbze = zzaan;
    }

    public final void zza(Object obj, Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : map.keySet()) {
                jSONObject.put(str, map.get(str));
            }
            jSONObject.put("id", this.zzbzf.zzbzd);
            this.zzbze.zza("sendMessageToNativeJs", jSONObject);
        } catch (JSONException e) {
            zzaky.zzb("Unable to dispatch sendMessageToNativeJs event", e);
        }
    }
}
