package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: ajzl */
public class ajzl extends ajzk {
    public static final <K, V> Map<K, V> a(ajxm<? extends K, ? extends V> ajxm) {
        akcr.b(ajxm, "pair");
        Object singletonMap = Collections.singletonMap(ajxm.a, ajxm.b);
        akcr.a(singletonMap, "java.util.Collections.si…(pair.first, pair.second)");
        return singletonMap;
    }

    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> a(Map<? extends K, ? extends V> map) {
        akcr.b(map, "receiver$0");
        return new TreeMap(map);
    }

    public static final <K, V> SortedMap<K, V> a(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        akcr.b(map, "receiver$0");
        akcr.b(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }

    public static final <K, V> Map<K, V> b(Map<? extends K, ? extends V> map) {
        akcr.b(map, "receiver$0");
        Entry entry = (Entry) map.entrySet().iterator().next();
        Object singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        akcr.a(singletonMap, "java.util.Collections.singletonMap(key, value)");
        akcr.a(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
