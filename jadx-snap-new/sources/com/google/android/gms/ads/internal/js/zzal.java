package com.google.android.gms.ads.internal.js;

import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzahw;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

@zzabh
public final class zzal implements zzak {
    private final zzaj zzcgj;
    private final HashSet<SimpleEntry<String, zzt<? super zzaj>>> zzcgk = new HashSet();

    public zzal(zzaj zzaj) {
        this.zzcgj = zzaj;
    }

    public final void zza(String str, zzt<? super zzaj> zzt) {
        this.zzcgj.zza(str, zzt);
        this.zzcgk.add(new SimpleEntry(str, zzt));
    }

    public final void zza(String str, Map<String, ?> map) {
        this.zzcgj.zza(str, (Map) map);
    }

    public final void zza(String str, JSONObject jSONObject) {
        this.zzcgj.zza(str, jSONObject);
    }

    public final void zzb(String str, zzt<? super zzaj> zzt) {
        this.zzcgj.zzb(str, zzt);
        this.zzcgk.remove(new SimpleEntry(str, zzt));
    }

    public final void zzb(String str, JSONObject jSONObject) {
        this.zzcgj.zzb(str, jSONObject);
    }

    public final void zzme() {
        Iterator it = this.zzcgk.iterator();
        while (it.hasNext()) {
            SimpleEntry simpleEntry = (SimpleEntry) it.next();
            String str = "Unregistering eventhandler: ";
            String valueOf = String.valueOf(((zzt) simpleEntry.getValue()).toString());
            zzahw.v(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            this.zzcgj.zzb((String) simpleEntry.getKey(), (zzt) simpleEntry.getValue());
        }
        this.zzcgk.clear();
    }
}
