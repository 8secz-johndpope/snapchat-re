package defpackage;

import java.util.Comparator;

/* renamed from: akab */
public final class akab implements Comparator<Comparable<? super Object>> {
    public static final akab a = new akab();

    private akab() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        akcr.b(comparable, "a");
        akcr.b(comparable2, "b");
        return comparable.compareTo(comparable2);
    }

    public final Comparator<Comparable<Object>> reversed() {
        return akac.a;
    }
}
