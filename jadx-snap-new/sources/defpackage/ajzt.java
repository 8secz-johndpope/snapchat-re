package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: ajzt */
public class ajzt extends ajzs {
    public static final <T> Set<T> a(Set<? extends T> set) {
        akcr.b(set, "receiver$0");
        int size = set.size();
        return size != 0 ? size != 1 ? set : ajzs.a(set.iterator().next()) : ajyy.a;
    }

    public static final <T> Set<T> a(T... tArr) {
        akcr.b(tArr, "elements");
        return tArr.length > 0 ? ajyi.k(tArr) : ajyy.a;
    }

    public static final <T> Set<T> b(T... tArr) {
        akcr.b(tArr, "elements");
        return (Set) ajyi.b((Object[]) tArr, (Collection) new LinkedHashSet(ajzm.a(tArr.length)));
    }

    public static final <T> HashSet<T> c(T... tArr) {
        akcr.b(tArr, "elements");
        return (HashSet) ajyi.b((Object[]) tArr, (Collection) new HashSet(ajzm.a(tArr.length)));
    }

    public static final <T> LinkedHashSet<T> d(T... tArr) {
        akcr.b(tArr, "elements");
        return (LinkedHashSet) ajyi.b((Object[]) tArr, (Collection) new LinkedHashSet(ajzm.a(tArr.length)));
    }
}
