package defpackage;

import defpackage.mgu.a;
import defpackage.mgu.a.b;
import defpackage.mmi.c;
import defpackage.mmi.c.a.d;
import java.util.List;

/* renamed from: mgo */
public final class mgo implements mgu {
    final ajxe a = ajxh.a(new a(this));
    final ajdp<mmt> b;
    final mwe c;
    final ajdp<Boolean> d;
    private final ajxe e = ajxh.a(new b(this));

    /* renamed from: mgo$b */
    static final class b extends akcs implements akbk<ajdp<a>> {
        final /* synthetic */ mgo a;

        /* renamed from: mgo$b$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            final /* synthetic */ b a;

            /* renamed from: mgo$b$1$1 */
            static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
                private /* synthetic */ 1 a;

                1(1 1) {
                    this.a = 1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    String str;
                    c cVar = (c) obj;
                    akcr.b(cVar, "it");
                    if (cVar instanceof d) {
                        obj = this.a.a.a.c.a(new defpackage.mwe.a.b(((d) cVar).b.a)).j().p(c.a);
                        str = "lensRepository.query(Len…  }\n                    }";
                    } else {
                        obj = ajdp.b(a.a.a);
                        str = "Observable.just(Upcoming…ageUseCase.Result.Hidden)";
                    }
                    akcr.a(obj, str);
                    return obj;
                }
            }

            1(b bVar) {
                this.a = bVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                Boolean bool = (Boolean) obj;
                akcr.b(bool, "canShow");
                return bool.booleanValue() ? ((ajdp) this.a.a.a.b()).u(new 1(this)) : ajvo.a(ajot.a);
            }
        }

        b(mgo mgo) {
            this.a = mgo;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajpy.k(this.a.d.u(new 1(this))).a();
        }
    }

    /* renamed from: mgo$a */
    static final class a extends akcs implements akbk<ajdp<c>> {
        private /* synthetic */ mgo a;

        /* renamed from: mgo$a$1 */
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

        /* renamed from: mgo$a$2 */
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

        a(mgo mgo) {
            this.a = mgo;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.b.u(1.a).a((ajfl) 2.a);
        }
    }

    /* renamed from: mgo$c */
    static final class c<T, R> implements ajfc<T, R> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "lenses");
            if (!list.isEmpty()) {
                akrm akrm = ((mux) ajyu.f(list)).q;
                if (akrm != null) {
                    akty a;
                    if (19 >= aktx.a.length()) {
                        a = aktx.a();
                    } else {
                        a = (akty) aktx.a.get(19);
                        if (a == null) {
                            a = aktx.a();
                            if (!aktx.a.compareAndSet(19, null, a)) {
                                a = (akty) aktx.a.get(19);
                            }
                        }
                    }
                    obj = akrm.a(a);
                    akcr.a(obj, "it.toString(DateTimeFormat.shortDate())");
                    return new b(obj);
                }
            }
            return a.a.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(mgo.class), "outputs", "getOutputs()Lio/reactivex/Observable;"), new akdc(akde.a(mgo.class), "lensCoreResults", "getLensCoreResults()Lio/reactivex/Observable;")};
    }

    public mgo(ajdp<mmt> ajdp, mwe mwe, ajdp<Boolean> ajdp2) {
        akcr.b(ajdp, "lensCore");
        akcr.b(mwe, "lensRepository");
        akcr.b(ajdp2, "upcomingMessageEnabled");
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
