package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: zfz */
public final class zfz {
    public final Map<zfm, Long> a;

    public zfz(Map<zfm, Long> map) {
        akcr.b(map, "runTimeMap");
        this.a = map;
    }

    public static Map<zfm, Long> a(Map<zfm, Long> map, Map<zfm, Long> map2) {
        HashMap hashMap = new HashMap();
        for (Entry entry : map.entrySet()) {
            zfm zfm = (zfm) entry.getKey();
            long longValue = ((Number) entry.getValue()).longValue();
            if (map2.get(zfm) != null) {
                Object obj = map2.get(zfm);
                if (obj == null) {
                    akcr.a();
                }
                longValue = Math.max(longValue - ((Number) obj).longValue(), 0);
                if (longValue == 0) {
                }
            }
            hashMap.put(zfm, Long.valueOf(longValue));
        }
        return hashMap;
    }
}
