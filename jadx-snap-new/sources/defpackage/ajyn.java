package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: ajyn */
public class ajyn extends ajym {
    public static final <T> int a(Iterable<? extends T> iterable, int i) {
        akcr.b(iterable, "receiver$0");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    public static final <T> Integer a(Iterable<? extends T> iterable) {
        akcr.b(iterable, "receiver$0");
        return iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
    }

    public static final <T> Collection<T> a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        akcr.b(iterable, "receiver$0");
        akcr.b(iterable2, "source");
        if (iterable instanceof Set) {
            return (Collection) iterable;
        }
        if (iterable instanceof Collection) {
            if ((iterable2 instanceof Collection) && ((Collection) iterable2).size() < 2) {
                return (Collection) iterable;
            }
            Collection collection = (Collection) iterable;
            if (!ajyn.b(collection)) {
                return collection;
            }
        }
        return ajyu.j(iterable);
    }

    public static final <T> List<T> b(Iterable<? extends Iterable<? extends T>> iterable) {
        akcr.b(iterable, "receiver$0");
        ArrayList arrayList = new ArrayList();
        for (Iterable a : iterable) {
            ajyr.a((Collection) arrayList, a);
        }
        return arrayList;
    }

    public static final <T> boolean b(Collection<? extends T> collection) {
        return collection.size() > 2 && (collection instanceof ArrayList);
    }
}
