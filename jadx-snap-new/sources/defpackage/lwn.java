package defpackage;

import defpackage.lwj.a;
import defpackage.lwj.a.b;
import defpackage.mmi.c;
import defpackage.mmi.c.a.d;
import java.util.List;

/* renamed from: lwn */
public final class lwn implements lwj {
    final ajxe a = ajxh.a(new a(this));
    final ajdp<mmt> b;
    final mwe c;
    final ajdp<Boolean> d;
    private final ajxe e = ajxh.a(new b(this));

    /* renamed from: lwn$b */
    static final class b extends akcs implements akbk<ajdp<a>> {
        final /* synthetic */ lwn a;

        /* renamed from: lwn$b$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            final /* synthetic */ b a;

            /* renamed from: lwn$b$1$1 */
            static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
                private /* synthetic */ 1 a;

                1(1 1) {
                    this.a = 1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    c cVar = (c) obj;
                    akcr.b(cVar, "it");
                    if (cVar instanceof d) {
                        return this.a.a.a.c.a(new defpackage.mwe.a.b(((d) cVar).b.a)).j().p(c.a);
                    }
                    obj = ajdp.b(a.a.a);
                    akcr.a(obj, "Observable.just(Confiden…belUseCase.Result.Hidden)");
                    return obj;
                }
            }

            1(b bVar) {
                this.a = bVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                Boolean bool = (Boolean) obj;
                akcr.b(bool, "censoredPromptEnabled");
                return bool.booleanValue() ? ((ajdp) this.a.a.a.b()).u(new 1(this)) : ajvo.a(ajot.a);
            }
        }

        b(lwn lwn) {
            this.a = lwn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajpy.k(this.a.d.u(new 1(this))).a();
        }
    }

    /* renamed from: lwn$a */
    static final class a extends akcs implements akbk<ajdp<c>> {
        private /* synthetic */ lwn a;

        /* renamed from: lwn$a$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                mmt mmt = (mmt) obj;
                akcr.b(mmt, "it");
                return mmt.a().b();
            }
        }

        /* renamed from: lwn$a$2 */
        static final class 2<T> implements ajfl<c> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                c cVar = (c) obj;
                akcr.b(cVar, "it");
                return (cVar instanceof d) || (cVar instanceof defpackage.mmi.c.a.c);
            }
        }

        a(lwn lwn) {
            this.a = lwn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.b.u(1.a).a((ajfl) 2.a);
        }
    }

    /* renamed from: lwn$c */
    static final class c<T, R> implements ajfc<T, R> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "lenses");
            if (!list.isEmpty()) {
                mue mue = ((mux) ajyu.f(list)).r;
                if (mue != null) {
                    return new b(mue);
                }
            }
            return a.a.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(lwn.class), "outputs", "getOutputs()Lio/reactivex/Observable;"), new akdc(akde.a(lwn.class), "lensCoreResults", "getLensCoreResults()Lio/reactivex/Observable;")};
    }

    public lwn(ajdp<mmt> ajdp, mwe mwe, ajdp<Boolean> ajdp2) {
        akcr.b(ajdp, "lensCore");
        akcr.b(mwe, "lensRepository");
        akcr.b(ajdp2, "showCensoredPrompt");
        this.b = ajdp;
        this.c = mwe;
        this.d = ajdp2;
    }

    public final ajfb a() {
        return myr.a();
    }

    public final ajdp<a> b() {
        return (ajdp) this.e.b();
    }
}
