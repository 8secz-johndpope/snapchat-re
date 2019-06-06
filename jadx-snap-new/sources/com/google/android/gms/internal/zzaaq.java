package com.google.android.gms.internal;

import com.brightcove.player.event.Event;
import defpackage.jh;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONObject;

@zzabh
public final class zzaaq implements zzaae<zzpo> {
    private final boolean zzcqf;

    public zzaaq(boolean z) {
        this.zzcqf = z;
    }

    private static <K, V> jh<K, V> zza(jh<K, Future<V>> jhVar) {
        jh jhVar2 = new jh();
        for (int i = 0; i < jhVar.size(); i++) {
            jhVar2.put(jhVar.b(i), ((Future) jhVar.c(i)).get());
        }
        return jhVar2;
    }

    public final /* synthetic */ zzpx zza(zzzy zzzy, JSONObject jSONObject) {
        jh jhVar = new jh();
        jh jhVar2 = new jh();
        zzalt zzg = zzzy.zzg(jSONObject);
        zzalt zzc = zzzy.zzc(jSONObject, Event.VIDEO);
        JSONArray jSONArray = jSONObject.getJSONArray("custom_assets");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString("type");
            String str = "name";
            if ("string".equals(string)) {
                jhVar2.put(jSONObject2.getString(str), jSONObject2.getString("string_value"));
            } else if ("image".equals(string)) {
                jhVar.put(jSONObject2.getString(str), zzzy.zza(jSONObject2, "image_value", this.zzcqf));
            } else {
                String str2 = "Unknown custom asset type: ";
                string = String.valueOf(string);
                zzaky.zzcz(string.length() != 0 ? str2.concat(string) : new String(str2));
            }
        }
        zzaof zzb = zzzy.zzb(zzc);
        return new zzpo(jSONObject.getString("custom_template_id"), zza(jhVar), jhVar2, (zzph) zzg.get(), zzb != null ? zzb.zzth() : null, zzb != null ? zzb.getView() : null);
    }
}
