package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: ajzs */
public class ajzs {
    public static final <T> Set<T> a(T t) {
        Object singleton = Collections.singleton(t);
        akcr.a(singleton, "java.util.Collections.singleton(element)");
        return singleton;
    }

    public static final <T> TreeSet<T> a(Comparator<? super T> comparator, T... tArr) {
        akcr.b(comparator, "comparator");
        akcr.b(tArr, "elements");
        return (TreeSet) ajyi.b((Object[]) tArr, (Collection) new TreeSet(comparator));
    }
}
