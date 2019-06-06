package defpackage;

import android.util.Log;
import defpackage.jf.a;
import defpackage.jf.c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ahn */
public final class ahn {
    private static final d<Object> a = new 1();

    /* renamed from: ahn$a */
    public interface a<T> {
        T a();
    }

    /* renamed from: ahn$c */
    public interface c {
        aho b_();
    }

    /* renamed from: ahn$d */
    public interface d<T> {
        void a(T t);
    }

    /* renamed from: ahn$1 */
    class 1 implements d<Object> {
        1() {
        }

        public final void a(Object obj) {
        }
    }

    /* renamed from: ahn$2 */
    public class 2 implements a<List<T>> {
        public final /* synthetic */ Object a() {
            return new ArrayList();
        }
    }

    /* renamed from: ahn$3 */
    public class 3 implements d<List<T>> {
        public final /* synthetic */ void a(Object obj) {
            ((List) obj).clear();
        }
    }

    /* renamed from: ahn$b */
    static final class b<T> implements a<T> {
        private final a<T> a;
        private final d<T> b;
        private final a<T> c;

        b(a<T> aVar, a<T> aVar2, d<T> dVar) {
            this.c = aVar;
            this.a = aVar2;
            this.b = dVar;
        }

        public final T a() {
            T a = this.c.a();
            if (a == null) {
                a = this.a.a();
                String str = "FactoryPools";
                if (Log.isLoggable(str, 2)) {
                    StringBuilder stringBuilder = new StringBuilder("Created new ");
                    stringBuilder.append(a.getClass());
                    Log.v(str, stringBuilder.toString());
                }
            }
            if (a instanceof c) {
                ((c) a).b_().a(false);
            }
            return a;
        }

        public final boolean a(T t) {
            if (t instanceof c) {
                ((c) t).b_().a(true);
            }
            this.b.a(t);
            return this.c.a(t);
        }
    }

    public static <T extends c> a<T> a(int i, a<T> aVar) {
        return ahn.a(new c(i), (a) aVar);
    }

    private static <T extends c> a<T> a(a<T> aVar, a<T> aVar2) {
        return ahn.a(aVar, aVar2, a);
    }

    public static <T> a<T> a(a<T> aVar, a<T> aVar2, d<T> dVar) {
        return new b(aVar, aVar2, dVar);
    }
}
