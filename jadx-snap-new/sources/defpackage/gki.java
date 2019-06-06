package defpackage;

import defpackage.aggt.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: gki */
public final class gki {
    private final a a = a.ANY;
    private final List<akfr> b;
    private final Map<a, String> c;

    public gki(aggr aggr) {
        akcr.b(aggr, "routingDefinition");
        Object obj = aggr.a;
        akcr.a(obj, "routingDefinition.urlMatchPatterns");
        Iterable<String> iterable = (Iterable) obj;
        Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
        for (String str : iterable) {
            akcr.a((Object) str, "it");
            arrayList.add(new akfr(str));
        }
        this.b = (List) arrayList;
        this.c = a(aggr.c, aggr.b);
    }

    private final EnumMap<a, String> a(List<? extends aggp> list, List<? extends aggt> list2) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            for (aggp aggp : list) {
                Map map = hashMap;
                Object obj = aggp.a;
                akcr.a(obj, "cdnInfo.cdnId");
                Object obj2 = aggp.b;
                akcr.a(obj2, "cdnInfo.host");
                map.put(obj, obj2);
            }
        }
        Map map2 = hashMap;
        EnumMap enumMap = new EnumMap(a.class);
        if (list2 == null) {
            return enumMap;
        }
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            aggt aggt = (aggt) list2.get(i);
            if (aggt != null) {
                String str = aggt.a;
                if (map2.containsKey(str)) {
                    str = (String) map2.get(str);
                    if (i == 0) {
                        enumMap.put(this.a, str);
                    }
                    enumMap.put(aggt.a(), str);
                }
            }
        }
        return enumMap;
    }

    public final String a(String str, a aVar) {
        akcr.b(str, "requestUrl");
        akcr.b(aVar, "reachability");
        for (akfr a : this.b) {
            if (a.a(str)) {
                Map map;
                Object aVar2;
                if (aVar2 == a.WIFI || aVar2 == a.WWAN) {
                    if (this.c.containsKey(aVar2)) {
                        map = this.c;
                    }
                    return null;
                }
                if (this.c.containsKey(this.a)) {
                    map = this.c;
                    aVar2 = this.a;
                }
                return null;
                return (String) map.get(aVar2);
            }
        }
        return null;
    }
}
