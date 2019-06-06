package defpackage;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import defpackage.hwx.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: hxb */
public final class hxb {
    private final Map<Class<?>, hww> a;
    private final Map<String, Map<String, List<fth>>> b = hxb.b(this.c);
    private final Map<fth, hxh> c = hxb.a(this.a);
    private final Set<String> d = ImmutableSet.copyOf(this.b.keySet());
    private final Map<String, Set<String>> e = Maps.newHashMap();
    private final Map<String, ftg> f;

    public hxb(Map<Class<?>, hww> map, Map<String, ftg> map2) {
        this.a = map;
        for (String str : this.d) {
            this.e.put(str, ImmutableSet.copyOf(((Map) this.b.get(str)).keySet()));
        }
        this.f = map2;
    }

    private static Map<fth, hxh> a(Map<Class<?>, hww> map) {
        HashMap newHashMap = Maps.newHashMap();
        for (Entry value : map.entrySet()) {
            newHashMap.putAll(((hww) value.getValue()).a());
        }
        return newHashMap;
    }

    private static Map<String, Map<String, List<fth>>> b(Map<fth, hxh> map) {
        HashMap newHashMap = Maps.newHashMap();
        for (Entry entry : map.entrySet()) {
            Map map2 = (Map) newHashMap.get(((hxh) entry.getValue()).a);
            if (map2 == null) {
                map2 = Maps.newHashMap();
                newHashMap.put(((hxh) entry.getValue()).a, map2);
            }
            List list = (List) map2.get(((hxh) entry.getValue()).b);
            if (list == null) {
                map2.put(((hxh) entry.getValue()).b, Lists.newArrayList((fth) entry.getKey()));
            } else {
                list.add(entry.getKey());
            }
        }
        for (Entry entry2 : newHashMap.entrySet()) {
            HashMap newHashMap2 = Maps.newHashMap();
            Object[] objArr = new fth[]{new hxe((String) entry2.getKey())};
            newHashMap2.put("experimentId", Lists.newArrayList(objArr));
            ((Map) entry2.getValue()).putAll(newHashMap2);
        }
        return newHashMap;
    }

    public final hxh a(fth fth) {
        if (!(fth instanceof hwx)) {
            return (hxh) this.c.get(fth);
        }
        hwx hwx = (hwx) fth;
        return new hxh(hwx.a, hwx.b, true);
    }

    public final List<fth> a(String str, String str2) {
        Object obj;
        for (String str3 : this.f.keySet()) {
            if (str.startsWith(str3)) {
                obj = (ftg) this.f.get(str3);
                break;
            }
        }
        obj = null;
        if (obj == null) {
            Map map = (Map) this.b.get(str);
            if (map == null) {
                return Collections.emptyList();
            }
            List<fth> list = (List) map.get(str2);
            if (list == null) {
                list = Collections.emptyList();
            }
            return list;
        } else if (str2.equals("experimentId")) {
            return Lists.newArrayList(new hxe(str));
        } else {
            Object[] objArr = new fth[1];
            akcr.b(obj, "feature");
            akcr.b(str, "studyName");
            akcr.b(str2, "variableName");
            objArr[0] = a.a(obj, str, str2, "");
            return Lists.newArrayList(objArr);
        }
    }

    public final Set<String> a() {
        return this.d;
    }

    public final Set<String> a(String str) {
        Set set = (Set) this.e.get(str);
        return set == null ? Sets.newHashSetWithExpectedSize(0) : set;
    }

    public final List<fth> b(String str) {
        Map map = (Map) this.b.get(str);
        if (map == null) {
            return Collections.emptyList();
        }
        ArrayList newArrayList = Lists.newArrayList();
        for (List addAll : map.values()) {
            newArrayList.addAll(addAll);
        }
        return newArrayList;
    }
}
