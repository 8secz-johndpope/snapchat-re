package defpackage;

import defpackage.mjn.c.e;
import defpackage.mjn.d;
import defpackage.mjn.d.c;
import defpackage.mmi.c.a.b;

/* renamed from: nbc */
public final class nbc implements nbg {
    final ajdp<mmt> a;
    final nbd b;
    private final ajxe c = ajxh.a(new a(this));

    /* renamed from: nbc$a */
    static final class a extends akcs implements akbk<ajdp> {
        final /* synthetic */ nbc a;

        /* renamed from: nbc$a$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            public static final 1 a = new 1();

            /* renamed from: nbc$a$1$a */
            public static final class a<T> implements ajfl<d> {
                public static final a a = new a();

                public final /* synthetic */ boolean test(Object obj) {
                    d dVar = (d) obj;
                    akcr.b(dVar, "it");
                    return dVar.b() instanceof e;
                }
            }

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                mmt mmt = (mmt) obj;
                akcr.b(mmt, "it");
                obj = mmt.g().a().a((ajfl) a.a);
                akcr.a(obj, "requests.filter { it.int…InterfaceControl.Screen }");
                return obj;
            }
        }

        /* renamed from: nbc$a$2 */
        static final class 2<T, R> implements ajfc<T, ajdt<? extends R>> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                mmt mmt = (mmt) obj;
                akcr.b(mmt, "it");
                return mmt.a().b();
            }
        }

        /* renamed from: nbc$a$3 */
        static final class 3<T, R> implements ajfc<T, R> {
            public static final 3 a = new 3();

            3() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                b bVar = (b) obj;
                akcr.b(bVar, "it");
                return bVar.a;
            }
        }

        /* renamed from: nbc$a$4 */
        static final class 4<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ a a;

            4(a aVar) {
                this.a = aVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                ajxm ajxm = (ajxm) obj;
                akcr.b(ajxm, "<name for destructuring parameter 0>");
                d dVar = (d) ajxm.a;
                obj = (mhs.b) ajxm.b;
                String str = "Observable.empty()";
                if (dVar instanceof c) {
                    mjn.c b = dVar.b();
                    if (b == null) {
                        throw new ajxt("null cannot be cast to non-null type com.snap.lenses.core.ClientInterfaceProcessor.InterfaceControl.Screen");
                    } else if (!((e) b).a && akcr.a(dVar.a(), obj)) {
                        return this.a.a.b.a();
                    } else {
                        obj = ajvo.a(ajot.a);
                        akcr.a(obj, str);
                        return obj;
                    }
                }
                obj = ajvo.a(ajot.a);
                akcr.a(obj, str);
                return obj;
            }
        }

        a(nbc nbc) {
            this.a = nbc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object u = this.a.a.u(1.a);
            akcr.a(u, "lensCore.switchMap { it.…rocessor.screenRequests }");
            Object u2 = this.a.a.u(2.a);
            akcr.a(u2, "lensCore.switchMap { it.…licator.filterLifecycle }");
            u2 = u2.b(b.class);
            akcr.a(u2, "ofType(R::class.java)");
            u2 = u2.p(3.a);
            akcr.a(u2, "lensCore.switchMap { it.…           .map { it.id }");
            return ajpy.k(ajwa.a(u, u2).u(new 4(this))).a();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(nbc.class), "outputs", "getOutputs()Lio/reactivex/Observable;");
    }

    public nbc(ajdp<mmt> ajdp, nbd nbd) {
        akcr.b(ajdp, "lensCore");
        akcr.b(nbd, "wakeLock");
        this.a = ajdp;
        this.b = nbd;
    }

    public final ajfb a() {
        return myr.a();
    }

    public final ajdp b() {
        return (ajdp) this.c.b();
    }
}
