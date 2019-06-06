package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: ajzu */
public class ajzu extends ajzt {
    public static final <T> Set<T> a(Set<? extends T> set, Iterable<? extends T> iterable) {
        akcr.b(set, "receiver$0");
        akcr.b(iterable, "elements");
        Iterable iterable2 = set;
        Collection a = ajyn.a((Iterable) iterable, iterable2);
        if (a.isEmpty()) {
            return ajyu.m(iterable2);
        }
        if (a instanceof Set) {
            Collection linkedHashSet = new LinkedHashSet();
            for (Object next : iterable2) {
                if (!a.contains(next)) {
                    linkedHashSet.add(next);
                }
            }
            return (Set) linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(a);
        return linkedHashSet2;
    }

    public static final <T> Set<T> a(Set<? extends T> set, T t) {
        akcr.b(set, "receiver$0");
        LinkedHashSet linkedHashSet = new LinkedHashSet(ajzm.a(set.size()));
        Object obj = null;
        for (Object next : set) {
            Object obj2 = 1;
            if (obj == null && akcr.a(next, (Object) t)) {
                obj = 1;
                obj2 = null;
            }
            if (obj2 != null) {
                linkedHashSet.add(next);
            }
        }
        return linkedHashSet;
    }

    public static final <T> Set<T> b(Set<? extends T> set, Iterable<? extends T> iterable) {
        int size;
        akcr.b(set, "receiver$0");
        akcr.b(iterable, "elements");
        Integer a = ajyn.a(iterable);
        if (a != null) {
            size = set.size() + a.intValue();
        } else {
            size = set.size() << 1;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(ajzm.a(size));
        linkedHashSet.addAll(set);
        ajyr.a((Collection) linkedHashSet, (Iterable) iterable);
        return linkedHashSet;
    }

    public static final <T> Set<T> b(Set<? extends T> set, T t) {
        akcr.b(set, "receiver$0");
        LinkedHashSet linkedHashSet = new LinkedHashSet(ajzm.a(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t);
        return linkedHashSet;
    }
}
