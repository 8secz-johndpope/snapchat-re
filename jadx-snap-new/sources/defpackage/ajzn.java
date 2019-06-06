package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: ajzn */
public class ajzn extends ajzm {
    public static final <K, V> List<ajxm<K, V>> f(Map<? extends K, ? extends V> map) {
        akcr.b(map, "receiver$0");
        if (map.size() == 0) {
            return ajyw.a;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return ajyw.a;
        }
        Entry entry = (Entry) it.next();
        if (!it.hasNext()) {
            return ajyl.a(new ajxm(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new ajxm(entry.getKey(), entry.getValue()));
        do {
            Entry entry2 = (Entry) it.next();
            arrayList.add(new ajxm(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
