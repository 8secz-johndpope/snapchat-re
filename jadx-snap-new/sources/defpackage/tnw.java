package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: tnw */
public final class tnw {
    final ImmutableMap<tno, ConcurrentHashMap<tnm, ajwl<Optional<Object>>>> a;

    public tnw() {
        Object of = ImmutableMap.of(tno.TWEAK, new ConcurrentHashMap(), tno.SERVER, new ConcurrentHashMap(), tno.EXPERIMENT, new ConcurrentHashMap(), tno.SETTING, new ConcurrentHashMap(), tno.FEATURE, new ConcurrentHashMap());
        akcr.a(of, "ImmutableMap.of(\n       …ConcurrentHashMap()\n    )");
        this.a = of;
    }

    public final ajdp<Optional<Object>> a(tnm tnm, tno tno, akbk<? extends Object> akbk) {
        akcr.b(tnm, "key");
        akcr.b(tno, "setting");
        akcr.b(akbk, "value");
        Object obj = this.a.get(tno);
        if (obj == null) {
            akcr.a();
        }
        akcr.a(obj, "observables[setting]!!");
        Object obj2 = null;
        ConcurrentMap concurrentMap = (ConcurrentHashMap) obj;
        Object obj3 = concurrentMap.get(tnm);
        if (obj3 == null) {
            obj2 = new ajwl();
            obj3 = concurrentMap.putIfAbsent(tnm, obj2);
            if (obj3 == null) {
                obj3 = obj2;
            }
        }
        obj3 = (ajwl) obj3;
        if ((akcr.a(obj3, obj2) ^ 1) != 0) {
            akcr.a(obj3, "possibleSubject");
            return (ajdp) obj3;
        }
        if (obj2 == null) {
            akcr.a();
        }
        obj2.a(Optional.fromNullable(akbk.invoke()));
        if (obj2 == null) {
            akcr.a();
        }
        return (ajdp) obj2;
    }

    public final void a(ftg ftg, tno tno) {
        akcr.b(ftg, "feature");
        akcr.b(tno, "setting");
        Object obj = this.a.get(tno);
        if (obj == null) {
            akcr.a();
        }
        akcr.a(obj, "observables[setting]!!");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj;
        Map map = concurrentHashMap;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Entry entry : map.entrySet()) {
            if ((((tnm) entry.getKey()).a == ftg ? 1 : null) != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Entry key : linkedHashMap.entrySet()) {
            ajwl ajwl = (ajwl) concurrentHashMap.get((tnm) key.getKey());
            if (ajwl != null && ajwl.q()) {
                ajwl.a(Optional.absent());
            }
        }
    }

    public final <T extends tnm> void a(Map<T, ? extends Object> map, tno tno) {
        akcr.b(map, "values");
        akcr.b(tno, "setting");
        Object obj = this.a.get(tno);
        if (obj == null) {
            akcr.a();
        }
        akcr.a(obj, "observables[setting]!!");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj;
        Collection arrayList = new ArrayList(map.size());
        for (Entry entry : map.entrySet()) {
            tnm tnm = (tnm) entry.getKey();
            Object value = entry.getValue();
            ajwl ajwl = (ajwl) concurrentHashMap.get(tnm);
            if (ajwl != null) {
                if (ajwl.q()) {
                    ajwl.a(Optional.fromNullable(value));
                }
                value = ajxw.a;
            } else {
                value = null;
            }
            arrayList.add(value);
        }
    }
}
