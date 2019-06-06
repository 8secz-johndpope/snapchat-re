package defpackage;

import com.snap.core.db.record.DiscoverStorySnapModel;
import defpackage.lwo.d;
import defpackage.mhs.b;
import java.util.Collection;
import java.util.List;

/* renamed from: kwy */
public final class kwy implements mhi<mha> {
    final mwe a;
    final ajfb<lwo> b;
    private final ajdp<lqf> c;
    private final ajdp<b> d;

    /* renamed from: kwy$b */
    static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ kwy a;

        /* renamed from: kwy$b$1 */
        static final class 1<T> implements ajfl<List<? extends mux>> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                List list = (List) obj;
                akcr.b(list, "result");
                return !((Collection) list).isEmpty();
            }
        }

        /* renamed from: kwy$b$2 */
        static final class 2<T, R> implements ajfc<T, R> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                List list = (List) obj;
                akcr.b(list, "result");
                return (mux) ajyu.f(list);
            }
        }

        b(kwy kwy) {
            this.a = kwy;
        }

        public final /* synthetic */ Object apply(Object obj) {
            defpackage.mhs.b bVar = (defpackage.mhs.b) obj;
            akcr.b(bVar, DiscoverStorySnapModel.LENSID);
            return this.a.a.a(new defpackage.mwe.a.b(bVar)).b((ajfl) 1.a).h().d((ajfc) 2.a).j();
        }
    }

    /* renamed from: kwy$a */
    public static final class a implements mha {
        final /* synthetic */ kwy a;
        private /* synthetic */ ajdp b;
        private /* synthetic */ ajdp c;

        /* renamed from: kwy$a$a */
        static final class a<T> implements ajfl<ajxm<? extends mux, ? extends lqf.b>> {
            public static final a a = new a();

            a() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                ajxm ajxm = (ajxm) obj;
                akcr.b(ajxm, "<name for destructuring parameter 0>");
                mux mux = (mux) ajxm.a;
                lqf.b bVar = (lqf.b) ajxm.b;
                Object obj2 = (mux.j == muy.REAR && bVar.a() == lqe.FRONT) ? 1 : null;
                obj = (mux.j == muy.FRONT && bVar.a() == lqe.BACK) ? 1 : null;
                return (obj2 == null && obj == null) ? false : true;
            }
        }

        /* renamed from: kwy$a$b */
        static final class b<T> implements ajfb<ajxm<? extends mux, ? extends defpackage.lqf.b>> {
            private /* synthetic */ a a;

            b(a aVar) {
                this.a = aVar;
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                this.a.a.b.accept(d.a);
            }
        }

        a(kwy kwy, ajdp ajdp, ajdp ajdp2) {
            this.a = kwy;
            this.b = ajdp;
            this.c = ajdp2;
        }

        public final ajej a() {
            Object a = ajwb.a(this.b, this.c).a((ajfl) a.a);
            akcr.a(a, "lenses.withLatestFrom(ca…ont\n                    }");
            a = a.f((ajfb) new b(this));
            akcr.a(a, "lenses.withLatestFrom(ca…ntrolAction.ToggleFlip) }");
            return a;
        }

        public final ajdp<Object> b() {
            return defpackage.mha.a.a(this);
        }
    }

    public kwy(mwe mwe, ajdp<lqf> ajdp, ajdp<b> ajdp2, ajfb<lwo> ajfb) {
        akcr.b(mwe, "lensRepository");
        akcr.b(ajdp, "cameraLifecycle");
        akcr.b(ajdp2, "externalLensSelection");
        akcr.b(ajfb, "cameraFlipConsumer");
        this.a = mwe;
        this.c = ajdp;
        this.d = ajdp2;
        this.b = ajfb;
    }

    public final /* synthetic */ Object a() {
        Object b = this.c.b(lqf.b.class);
        akcr.a(b, "ofType(R::class.java)");
        Object u = this.d.u(new b(this));
        akcr.a(u, "externalLensSelection\n  …vable()\n                }");
        return new a(this, u, b);
    }
}
