package defpackage;

import java.util.Comparator;

/* renamed from: akac */
final class akac implements Comparator<Comparable<? super Object>> {
    public static final akac a = new akac();

    private akac() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        akcr.b(comparable, "a");
        akcr.b(comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    public final Comparator<Comparable<Object>> reversed() {
        return akab.a;
    }
}
