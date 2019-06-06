package defpackage;

import java.util.Comparator;

/* renamed from: ajzy */
public class ajzy {

    /* renamed from: ajzy$a */
    static final class a<T> implements Comparator<T> {
        private /* synthetic */ akbl[] a;

        a(akbl[] akblArr) {
            this.a = akblArr;
        }

        public final int compare(T t, T t2) {
            for (akbl akbl : this.a) {
                int a = ajzy.a((Comparable) akbl.invoke(t), (Comparable) akbl.invoke(t2));
                if (a != 0) {
                    return a;
                }
            }
            return 0;
        }
    }

    /* renamed from: ajzy$b */
    public static final class b<T> implements Comparator<T> {
        private /* synthetic */ Comparator a;

        public b(Comparator comparator) {
            this.a = comparator;
        }

        public final int compare(T t, T t2) {
            return t == t2 ? 0 : t == null ? 1 : t2 == null ? -1 : this.a.compare(t, t2);
        }
    }

    public static final <T extends Comparable<?>> int a(T t, T t2) {
        return t == t2 ? 0 : t == null ? -1 : t2 == null ? 1 : t.compareTo(t2);
    }

    public static final <T> Comparator<T> a(akbl<? super T, ? extends Comparable<?>>... akblArr) {
        akcr.b(akblArr, "selectors");
        if ((akblArr.length > 0 ? 1 : null) != null) {
            return new a(akblArr);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
