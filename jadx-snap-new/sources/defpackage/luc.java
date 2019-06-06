package defpackage;

import defpackage.ajfu.t;
import defpackage.lul.a;
import defpackage.mhs.b;
import defpackage.mmi.c;
import java.util.Collection;
import java.util.List;

/* renamed from: luc */
public final class luc implements lul {
    final ajwo<a> a;
    final mwe b;
    final myv c;
    final ajdp<Boolean> d;
    private final ajfb<a> e = new lud(new a(this.a));
    private final ajxe f;

    /* renamed from: luc$a */
    static final class a extends akcq implements akbl<defpackage.lul.a, ajxw> {
        a(ajwo ajwo) {
            super(1, ajwo);
        }

        public final String getName() {
            return "onNext";
        }

        public final akej getOwner() {
            return akde.a(ajwo.class);
        }

        public final String getSignature() {
            return "onNext(Ljava/lang/Object;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            obj = (defpackage.lul.a) obj;
            akcr.b(obj, "p1");
            ((ajwo) this.receiver).a(obj);
            return ajxw.a;
        }
    }

    /* renamed from: luc$b */
    static final class b extends akcs implements akbk<ajdp<defpackage.lul.b>> {
        final /* synthetic */ luc a;
        private /* synthetic */ ajdp b;

        /* renamed from: luc$b$b */
        static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
            final /* synthetic */ b a;

            /* renamed from: luc$b$b$1 */
            static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
                private /* synthetic */ b a;

                1(b bVar) {
                    this.a = bVar;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    final c cVar = (c) obj;
                    akcr.b(cVar, "filterEvent");
                    if (!(cVar instanceof defpackage.mmi.c.a.b)) {
                        return ajdp.b(defpackage.lul.b.b.a);
                    }
                    luc luc = this.a.a.a;
                    Object u = luc.d.u(new c(luc, ((defpackage.mmi.c.a.b) cVar).a));
                    akcr.a(u, "showButtonForAnyLens.swi…)\n            }\n        }");
                    return u.p(new ajfc<T, R>() {
                        public final /* synthetic */ Object apply(Object obj) {
                            Boolean bool = (Boolean) obj;
                            akcr.b(bool, "shouldShow");
                            return bool.booleanValue() ? new defpackage.lul.b.a(((defpackage.mmi.c.a.b) cVar).a) : defpackage.lul.b.b.a;
                        }
                    });
                }
            }

            b(b bVar) {
                this.a = bVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                mmt mmt = (mmt) obj;
                akcr.b(mmt, "it");
                return mmt.a().b().u(new 1(this));
            }
        }

        /* renamed from: luc$b$a */
        static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
            final /* synthetic */ b a;

            /* renamed from: luc$b$a$1 */
            static final class 1<T> implements ajfl<List<? extends mux>> {
                public static final 1 a = new 1();

                1() {
                }

                public final /* synthetic */ boolean test(Object obj) {
                    List list = (List) obj;
                    akcr.b(list, "it");
                    return ((((Collection) list).isEmpty() ^ 1) == 0 || ((mux) ajyu.f(list)).o.b == null) ? false : true;
                }
            }

            /* renamed from: luc$b$a$2 */
            static final class 2<T, R> implements ajfc<T, R> {
                public static final 2 a = new 2();

                2() {
                }

                public final /* synthetic */ Object apply(Object obj) {
                    List list = (List) obj;
                    akcr.b(list, "it");
                    return ((mux) ajyu.f(list)).o.b;
                }
            }

            /* renamed from: luc$b$a$3 */
            static final class 3<T, R> implements ajfc<T, ajdt<? extends R>> {
                private /* synthetic */ a a;

                3(a aVar) {
                    this.a = aVar;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    String str = (String) obj;
                    akcr.b(str, "it");
                    return this.a.a.a.c.a(new defpackage.myv.a(str, (byte) 0));
                }
            }

            /* renamed from: luc$b$a$4 */
            static final class 4<T, R> implements ajfc<T, ajdt<? extends R>> {
                public static final 4 a = new 4();

                4() {
                }

                public final /* synthetic */ Object apply(Object obj) {
                    akcr.b(obj, "it");
                    return ajvo.a(ajot.a);
                }
            }

            a(b bVar) {
                this.a = bVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                defpackage.lul.a aVar = (defpackage.lul.a) obj;
                akcr.b(aVar, "action");
                if (aVar instanceof defpackage.lul.a.a) {
                    return this.a.a.b.a(new defpackage.mwe.a.b(((defpackage.lul.a.a) aVar).a)).j().a((ajfl) 1.a).p(2.a).c(1).u(new 3(this)).u(4.a);
                }
                throw new ajxk();
            }
        }

        b(luc luc, ajdp ajdp) {
            this.a = luc;
            this.b = ajdp;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ajdp a = ajpy.k(this.b.u(new b(this))).a();
            Object u = this.a.a.u(new a(this));
            akcr.a(u, "actionRelay.switchMap { …}\n            }\n        }");
            return ajdp.b((ajdt) a, (ajdt) ajpy.k(u).a());
        }
    }

    /* renamed from: luc$c */
    static final class c<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ luc a;
        private /* synthetic */ b b;

        /* renamed from: luc$c$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            public static final 1 a = new 1();

            1() {
            }

            /* JADX WARNING: Missing block: B:8:0x0027, code skipped:
            if (r4 == null) goto L_0x002b;
     */
            public final /* synthetic */ java.lang.Object apply(java.lang.Object r4) {
                /*
                r3 = this;
                r4 = (java.util.List) r4;
                r0 = "lenses";
                defpackage.akcr.b(r4, r0);
                r0 = r4.isEmpty();
                r1 = 1;
                r2 = 0;
                if (r0 != 0) goto L_0x002a;
            L_0x000f:
                r4 = defpackage.ajyu.f(r4);
                r4 = (defpackage.mux) r4;
                r4 = r4.o;
                r4 = r4.a;
                r4 = (java.lang.CharSequence) r4;
                if (r4 == 0) goto L_0x0026;
            L_0x001d:
                r4 = r4.length();
                if (r4 != 0) goto L_0x0024;
            L_0x0023:
                goto L_0x0026;
            L_0x0024:
                r4 = 0;
                goto L_0x0027;
            L_0x0026:
                r4 = 1;
            L_0x0027:
                if (r4 != 0) goto L_0x002a;
            L_0x0029:
                goto L_0x002b;
            L_0x002a:
                r1 = 0;
            L_0x002b:
                r4 = java.lang.Boolean.valueOf(r1);
                return r4;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.luc$c$1.apply(java.lang.Object):java.lang.Object");
            }
        }

        c(luc luc, b bVar) {
            this.a = luc;
            this.b = bVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "showForAny");
            if (bool.booleanValue()) {
                return ajdp.b(Boolean.TRUE);
            }
            ajde d = this.a.b.a(new mwe.a.b(this.b)).d((ajfc) 1.a);
            Object obj2 = ajfu.a;
            Object obj3 = t.INSTANCE;
            ajfv.a(obj2, "keySelector is null");
            ajfv.a(obj3, "collectionSupplier is null");
            return ajvo.a(new ajjc(d, obj2, obj3)).j();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(luc.class), "outputs", "getOutputs()Lio/reactivex/Observable;");
    }

    public luc(ajdp<mmt> ajdp, mwe mwe, myv myv, ajdp<Boolean> ajdp2) {
        akcr.b(ajdp, "lensCore");
        akcr.b(mwe, "lensRepository");
        akcr.b(myv, "scanCardsInteractor");
        akcr.b(ajdp2, "showButtonForAnyLens");
        this.b = mwe;
        this.c = myv;
        this.d = ajdp2;
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create<InfoButtonUseCase.Action>()");
        this.a = ajwo;
        this.f = ajxh.a(new b(this, ajdp));
    }

    public final ajfb<a> a() {
        return this.e;
    }

    public final ajdp<lul.b> b() {
        return (ajdp) this.f.b();
    }
}
