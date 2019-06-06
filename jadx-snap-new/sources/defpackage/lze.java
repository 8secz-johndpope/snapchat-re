package defpackage;

import defpackage.lzp.a;
import defpackage.lzp.a.c;
import defpackage.lzp.b;
import java.util.concurrent.TimeUnit;

/* renamed from: lze */
public final class lze implements lzp {
    final ajws<a> a;
    final ajxe b = ajxh.a(new d(this));
    final ajxe c = ajxh.a(new c(this));
    final lzo d;
    final zfw e;
    private final ajxe f = ajxh.a(new b(this));

    /* renamed from: lze$a */
    static final class a extends akcq implements akbl<defpackage.lzp.a, ajxw> {
        a(ajws ajws) {
            super(1, ajws);
        }

        public final String getName() {
            return "onNext";
        }

        public final akej getOwner() {
            return akde.a(ajws.class);
        }

        public final String getSignature() {
            return "onNext(Ljava/lang/Object;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            defpackage.lzp.a aVar = (defpackage.lzp.a) obj;
            akcr.b(aVar, "p1");
            ((ajws) this.receiver).a((Object) aVar);
            return ajxw.a;
        }
    }

    /* renamed from: lze$b */
    static final class b extends akcs implements akbk<ajdp<defpackage.lzp.b>> {
        final /* synthetic */ lze a;

        /* renamed from: lze$b$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ b a;

            1(b bVar) {
                this.a = bVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                ajxm ajxm = (ajxm) obj;
                akcr.b(ajxm, "<name for destructuring parameter 0>");
                a aVar = (a) ajxm.a;
                if (((Boolean) ajxm.b).booleanValue()) {
                    if (aVar instanceof c) {
                        return (ajdp) this.a.a.b.b();
                    }
                    if (aVar instanceof defpackage.lzp.a.b) {
                        return (ajdp) this.a.a.c.b();
                    }
                    if (!(aVar instanceof a.a)) {
                        throw new ajxk();
                    }
                }
                obj = ajdp.b(defpackage.lzp.b.a.a);
                akcr.a(obj, "just(Result.Hidden)");
                return obj;
            }
        }

        b(lze lze) {
            this.a = lze;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajpy.k(myu.a(this.a.a, this.a.d.a()).u(new 1(this))).a();
        }
    }

    /* renamed from: lze$d */
    static final class d extends akcs implements akbk<ajdp<b>> {
        final /* synthetic */ lze a;

        /* renamed from: lze$d$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ d a;

            /* renamed from: lze$d$1$1 */
            static final class 1<T, R> implements ajfc<T, R> {
                public static final 1 a = new 1();

                1() {
                }

                public final /* synthetic */ Object apply(Object obj) {
                    akcr.b((Long) obj, "it");
                    return b.a.a;
                }
            }

            1(d dVar) {
                this.a = dVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                Boolean bool = (Boolean) obj;
                akcr.b(bool, "notExhausted");
                return bool.booleanValue() ? ajdp.a(3000, TimeUnit.MILLISECONDS, (ajdw) this.a.a.e.b()).p(1.a).h(b.b.a) : ajvo.a(ajot.a);
            }
        }

        d(lze lze) {
            this.a = lze;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.d.c().u(new 1(this));
        }
    }

    /* renamed from: lze$c */
    static final class c extends akcs implements akbk<ajdp<b.a>> {
        private /* synthetic */ lze a;

        /* renamed from: lze$c$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((b) obj, "it");
                return ajdp.b(b.a.a);
            }
        }

        c(lze lze) {
            this.a = lze;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.d.b().h().u(1.a);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(lze.class), "outputs", "getOutputs()Lio/reactivex/Observable;"), new akdc(akde.a(lze.class), "resultTooltipShown", "getResultTooltipShown()Lio/reactivex/Observable;"), new akdc(akde.a(lze.class), "resultTooltipDisabled", "getResultTooltipDisabled()Lio/reactivex/Observable;")};
    }

    public lze(lzo lzo, zfw zfw) {
        akcr.b(lzo, "tooltipSettings");
        akcr.b(zfw, "qualifiedSchedulers");
        this.d = lzo;
        this.e = zfw;
        Object r = new ajwo().r();
        akcr.a(r, "PublishSubject.create<Ex….Action>().toSerialized()");
        this.a = r;
    }

    public final ajfb<a> a() {
        return new lzf(new a(this.a));
    }

    public final ajdp<b> b() {
        return (ajdp) this.f.b();
    }
}
