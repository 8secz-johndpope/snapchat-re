package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzamd;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

@zzabh
public final class zzy implements zzt<Object> {
    private HashMap<String, zzamd<JSONObject>> zzccl = new HashMap();

    public final void zza(Object obj, Map<String, String> map) {
        String str = (String) map.get("request_id");
        String str2 = (String) map.get("fetched_ad");
        zzaky.zzby("Received ad from the cache.");
        zzamd zzamd = (zzamd) this.zzccl.get(str);
        if (zzamd == null) {
            zzaky.e("Could not find the ad request for the corresponding ad response.");
            return;
        }
        try {
            zzamd.set(new JSONObject(str2));
        } catch (JSONException e) {
            zzaky.zzb("Failed constructing JSON object from value passed from javascript", e);
            zzamd.set(null);
        } finally {
            this.zzccl.remove(str);
        }
    }

    public final Future<JSONObject> zzas(String str) {
        zzamd zzamd = new zzamd();
        this.zzccl.put(str, zzamd);
        return zzamd;
    }

    public final void zzat(String str) {
        zzamd zzamd = (zzamd) this.zzccl.get(str);
        if (zzamd == null) {
            zzaky.e("Could not find the ad request for the corresponding ad response.");
            return;
        }
        if (!zzamd.isDone()) {
            zzamd.cancel(true);
        }
        this.zzccl.remove(str);
    }
}
