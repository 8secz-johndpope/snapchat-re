package defpackage;

import com.snapchat.map.egghunt.EggHuntHttpInterface;
import java.util.concurrent.Callable;

/* renamed from: adeq */
public final class adeq {

    /* renamed from: adeq$a */
    public static final class a {

        /* renamed from: adeq$a$a */
        static final class a<V> implements Callable<T> {
            private /* synthetic */ aipn a;

            a(aipn aipn) {
                this.a = aipn;
            }

            public final /* synthetic */ Object call() {
                return (acni) this.a.get();
            }
        }

        /* renamed from: adeq$a$b */
        static final class b<V> implements Callable<T> {
            private /* synthetic */ gcy a;

            b(gcy gcy) {
                this.a = gcy;
            }

            public final /* synthetic */ Object call() {
                return (EggHuntHttpInterface) this.a.a(EggHuntHttpInterface.class);
            }
        }

        public static ajdx<fts> a(aipn<acni> aipn) {
            akcr.b(aipn, "handler");
            Object a = ajdx.c((Callable) new a(aipn)).a();
            akcr.a(a, "Single.fromCallable<UriO…{ handler.get() }.cache()");
            return a;
        }

        public static ajdx<EggHuntHttpInterface> a(gcy gcy) {
            akcr.b(gcy, "serviceFactory");
            Object a = ajdx.c((Callable) new b(gcy)).a();
            akcr.a(a, "Single.fromCallable { se…ce::class.java) }.cache()");
            return a;
        }
    }
}
