package defpackage;

import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: ajzk */
class ajzk {
    public static final <K, V> V a(Map<K, ? extends V> map, K k) {
        akcr.b(map, "receiver$0");
        if (map instanceof ajzi) {
            return ((ajzi) map).a();
        }
        Object obj = map.get(k);
        if (obj != null || map.containsKey(k)) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder("Key ");
        stringBuilder.append(k);
        stringBuilder.append(" is missing in the map.");
        throw new NoSuchElementException(stringBuilder.toString());
    }
}
