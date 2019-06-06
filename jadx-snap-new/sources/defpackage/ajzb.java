package defpackage;

import defpackage.akdd.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: ajzb */
public class ajzb {
    public static final <T, K> Map<K, Integer> a(ajyz<T, ? extends K> ajyz) {
        akcr.b(ajyz, "receiver$0");
        Map linkedHashMap = new LinkedHashMap();
        Iterator a = ajyz.a();
        while (a.hasNext()) {
            Object a2 = ajyz.a(a.next());
            c cVar = linkedHashMap.get(a2);
            Object obj = (cVar != null || linkedHashMap.containsKey(a2)) ? null : 1;
            if (obj != null) {
                cVar = new c();
            }
            cVar = cVar;
            cVar.a++;
            linkedHashMap.put(a2, cVar);
        }
        for (Entry entry : linkedHashMap.entrySet()) {
            if (entry != null) {
                akdg.e(entry).setValue(Integer.valueOf(((c) entry.getValue()).a));
            } else {
                throw new ajxt("null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K, R>");
            }
        }
        return akdg.d(linkedHashMap);
    }
}
