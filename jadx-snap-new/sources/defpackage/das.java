package defpackage;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: das */
public abstract class das<T extends das<T>> implements Serializable {

    /* renamed from: das$a */
    public interface a<K extends das<K>> {
        K createEmpty();
    }

    public static <I extends das<I>> Map<String, I> a(Map<String, I> map, Map<String, I> map2) {
        Map map22;
        if (map22 == null) {
            map22 = new HashMap();
        }
        map22.clear();
        if (map == null) {
            return map22;
        }
        for (Entry entry : map.entrySet()) {
            map22.put(entry.getKey(), ((das) entry.getValue()).b(null, null));
        }
        return map22;
    }

    public static <I extends das<I>> Map<String, I> a(Map<String, I> map, Map<String, I> map2, a<I> aVar) {
        Map hashMap = new HashMap();
        das.a((Map) map, hashMap);
        if (map2 != null) {
            for (Entry entry : map2.entrySet()) {
                das das = (das) hashMap.get(entry.getKey());
                Object key = entry.getKey();
                if (das == null) {
                    das = aVar.createEmpty();
                }
                hashMap.put(key, das.a((das) entry.getValue(), null));
            }
        }
        return hashMap;
    }

    public static <I extends das<I>> Map<String, I> b(Map<String, I> map, Map<String, I> map2) {
        Map hashMap = new HashMap();
        if (map == null && map2 == null) {
            hashMap.clear();
            return hashMap;
        }
        if (map == null) {
            das.a((Map) map2, hashMap);
        } else if (map2 == null) {
            das.a((Map) map, hashMap);
        } else {
            das.a((Map) map, hashMap);
            for (Entry entry : map2.entrySet()) {
                hashMap.put(entry.getKey(), ((das) entry.getValue()).b((das) hashMap.get(entry.getKey()), null));
            }
        }
        return hashMap;
    }

    public abstract T a(T t);

    public abstract T a(T t, T t2);

    public abstract T b(T t, T t2);
}
