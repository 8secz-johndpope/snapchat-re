package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ajzm */
public class ajzm extends ajzl {
    public static final int a(int i) {
        return i < 3 ? i + 1 : i < AudioPlayer.INFINITY_LOOP_COUNT ? i + (i / 3) : Integer.MAX_VALUE;
    }

    public static final <K, V> Map<K, V> a(akez<? extends ajxm<? extends K, ? extends V>> akez) {
        akcr.b(akez, "receiver$0");
        return ajzm.e(ajzm.a((akez) akez, (Map) new LinkedHashMap()));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M a(akez<? extends ajxm<? extends K, ? extends V>> akez, M m) {
        akcr.b(akez, "receiver$0");
        akcr.b(m, "destination");
        ajzm.a((Map) m, (akez) akez);
        return m;
    }

    public static final <K, V> Map<K, V> a(Iterable<? extends ajxm<? extends K, ? extends V>> iterable) {
        akcr.b(iterable, "receiver$0");
        if (!(iterable instanceof Collection)) {
            return ajzm.e(ajzm.a((Iterable) iterable, (Map) new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return ajyx.a;
        }
        if (size != 1) {
            return ajzm.a((Iterable) iterable, (Map) new LinkedHashMap(ajzm.a(collection.size())));
        }
        return ajzl.a((ajxm) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M a(Iterable<? extends ajxm<? extends K, ? extends V>> iterable, M m) {
        akcr.b(iterable, "receiver$0");
        akcr.b(m, "destination");
        ajzm.a((Map) m, (Iterable) iterable);
        return m;
    }

    public static final <K, V> Map<K, V> a(Map<? extends K, ? extends V> map, ajxm<? extends K, ? extends V> ajxm) {
        akcr.b(map, "receiver$0");
        akcr.b(ajxm, "pair");
        if (map.isEmpty()) {
            return ajzl.a((ajxm) ajxm);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(ajxm.a, ajxm.b);
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> a(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        akcr.b(map, "receiver$0");
        akcr.b(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> a(ajxm<? extends K, ? extends V>... ajxmArr) {
        akcr.b(ajxmArr, "pairs");
        return ajxmArr.length > 0 ? ajzm.a((ajxm[]) ajxmArr, (Map) new LinkedHashMap(ajzm.a(ajxmArr.length))) : ajyx.a;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M a(ajxm<? extends K, ? extends V>[] ajxmArr, M m) {
        akcr.b(ajxmArr, "receiver$0");
        akcr.b(m, "destination");
        ajzm.a((Map) m, (ajxm[]) ajxmArr);
        return m;
    }

    public static final <K, V> void a(Map<? super K, ? super V> map, akez<? extends ajxm<? extends K, ? extends V>> akez) {
        akcr.b(map, "receiver$0");
        akcr.b(akez, "pairs");
        for (ajxm ajxm : akez) {
            map.put(ajxm.a, ajxm.b);
        }
    }

    public static final <K, V> void a(Map<? super K, ? super V> map, Iterable<? extends ajxm<? extends K, ? extends V>> iterable) {
        akcr.b(map, "receiver$0");
        akcr.b(iterable, "pairs");
        for (ajxm ajxm : iterable) {
            map.put(ajxm.a, ajxm.b);
        }
    }

    public static final <K, V> void a(Map<? super K, ? super V> map, ajxm<? extends K, ? extends V>[] ajxmArr) {
        akcr.b(map, "receiver$0");
        akcr.b(ajxmArr, "pairs");
        for (ajxm ajxm : ajxmArr) {
            map.put(ajxm.a, ajxm.b);
        }
    }

    public static final <K, V> V b(Map<K, ? extends V> map, K k) {
        akcr.b(map, "receiver$0");
        return ajzk.a(map, k);
    }

    public static final <K, V> Map<K, V> b(ajxm<? extends K, ? extends V>... ajxmArr) {
        akcr.b(ajxmArr, "pairs");
        Map linkedHashMap = new LinkedHashMap(ajzm.a(ajxmArr.length));
        ajzm.a(linkedHashMap, (ajxm[]) ajxmArr);
        return linkedHashMap;
    }

    public static final <K, V> HashMap<K, V> c(ajxm<? extends K, ? extends V>... ajxmArr) {
        akcr.b(ajxmArr, "pairs");
        HashMap hashMap = new HashMap(ajzm.a(ajxmArr.length));
        ajzm.a((Map) hashMap, (ajxm[]) ajxmArr);
        return hashMap;
    }

    public static final <K, V> Map<K, V> c(Map<? extends K, ? extends V> map) {
        akcr.b(map, "receiver$0");
        int size = map.size();
        return size != 0 ? size != 1 ? ajzm.d(map) : ajzl.b(map) : ajyx.a;
    }

    public static final <K, V> Map<K, V> d(Map<? extends K, ? extends V> map) {
        akcr.b(map, "receiver$0");
        return new LinkedHashMap(map);
    }

    public static final <K, V> Map<K, V> e(Map<K, ? extends V> map) {
        akcr.b(map, "receiver$0");
        int size = map.size();
        return size != 0 ? size != 1 ? map : ajzl.b(map) : ajyx.a;
    }
}
