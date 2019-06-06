package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: tni */
public final class tni {
    public static final List<tnm> a(List<? extends fth> list) {
        akcr.b(list, "receiver$0");
        ArrayList arrayList = new ArrayList(list.size());
        for (fth a : list) {
            arrayList.add(tni.a(a));
        }
        return arrayList;
    }

    public static final List<tnm> a(fth[] fthArr) {
        akcr.b(fthArr, "receiver$0");
        ArrayList arrayList = new ArrayList(fthArr.length);
        for (fth a : fthArr) {
            arrayList.add(tni.a(a));
        }
        return arrayList;
    }

    public static final Map<tnm, Object> a(Map<fth, ? extends Object> map) {
        akcr.b(map, "receiver$0");
        HashMap hashMap = new HashMap(map.size());
        for (Entry entry : map.entrySet()) {
            hashMap.put(tni.a((fth) entry.getKey()), entry.getValue());
        }
        return hashMap;
    }

    public static final tnm a(fth fth) {
        akcr.b(fth, "receiver$0");
        Object b = fth.b();
        akcr.a(b, "this.feature");
        return new tnm(b, fth.name());
    }

    public static final Map<tnm, Object> b(Map<fth, ? extends Object> map) {
        akcr.b(map, "receiver$0");
        HashMap hashMap = new HashMap(map.size());
        for (Entry entry : map.entrySet()) {
            hashMap.put(tni.a((fth) entry.getKey()), entry.getValue());
        }
        return hashMap;
    }
}
