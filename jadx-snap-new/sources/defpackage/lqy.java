package defpackage;

import defpackage.lqv.a;
import defpackage.lqv.a.a.b;
import defpackage.mmi.c;

/* renamed from: lqy */
public final class lqy implements lqv {
    final ajdp<mmt> a;
    final ajdp<lqf> b;
    private final ajxe c = ajxh.a(new a(this));

    /* renamed from: lqy$a */
    static final class a extends akcs implements akbk<ajdp<defpackage.lqv.a>> {
        final /* synthetic */ lqy a;

        /* renamed from: lqy$a$b */
        static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
            public static final b a = new b();

            b() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                final mmt mmt = (mmt) obj;
                akcr.b(mmt, "lensCore");
                return mmt.a().b().u(new ajfc<T, ajdt<? extends R>>() {

                    /* renamed from: lqy$a$b$1$1 */
                    static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
                        public static final 1 a = new 1();

                        1() {
                        }

                        public final /* synthetic */ Object apply(Object obj) {
                            akcr.b((ajxw) obj, "it");
                            return ajdp.b(defpackage.lqv.a.a.b.a);
                        }
                    }

                    /* renamed from: lqy$a$b$1$2 */
                    static final class 2<T, R> implements ajfc<T, ajdt<? extends R>> {
                        public static final 2 a = new 2();

                        2() {
                        }

                        public final /* synthetic */ Object apply(Object obj) {
                            akcr.b((ajxw) obj, "it");
                            return ajdp.b(defpackage.lqv.a.b.a);
                        }
                    }

                    public final /* synthetic */ Object apply(Object obj) {
                        String str;
                        c cVar = (c) obj;
                        akcr.b(cVar, "it");
                        if (cVar instanceof defpackage.mmi.c.a.a) {
                            obj = mmt.c().b().b(defpackage.mjh.a.b.a.c).d((ajfc) 1.a);
                            str = "lensCore.audioPlayer.vol…                        }";
                        } else if (cVar instanceof defpackage.mmi.c.b) {
                            obj = mie.a(mmt.c().a()).d((ajfc) 2.a);
                            str = "lensCore.audioPlayer.sto…                        }";
                        } else {
                            obj = ajvo.a(ajot.a);
                            str = "empty()";
                        }
                        akcr.a(obj, str);
                        return obj;
                    }
                });
            }
        }

        /* renamed from: lqy$a$a */
        static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ a a;

            a(a aVar) {
                this.a = aVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                final mmt mmt = (mmt) obj;
                akcr.b(mmt, "lensCore");
                return this.a.a.b.u(new ajfc<T, ajdt<? extends R>>() {

                    /* renamed from: lqy$a$a$1$2 */
                    static final class 2<T, R> implements ajfc<T, ajdt<? extends R>> {
                        public static final 2 a = new 2();

                        2() {
                        }

                        public final /* synthetic */ Object apply(Object obj) {
                            akcr.b((ajxw) obj, "it");
                            return ajdp.b(b.a);
                        }
                    }

                    /* renamed from: lqy$a$a$1$1 */
                    static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
                        public static final 1 a = new 1();

                        1() {
                        }

                        public final /* synthetic */ Object apply(Object obj) {
                            akcr.b((ajxw) obj, "it");
                            return ajdp.b(defpackage.lqv.a.a.a.a);
                        }
                    }

                    /* renamed from: lqy$a$a$1$3 */
                    static final class 3<T, R> implements ajfc<T, ajdt<? extends R>> {
                        public static final 3 a = new 3();

                        3() {
                        }

                        public final /* synthetic */ Object apply(Object obj) {
                            akcr.b((ajxw) obj, "it");
                            return ajdp.b(defpackage.lqv.a.b.a);
                        }
                    }

                    public final /* synthetic */ Object apply(Object obj) {
                        lqf lqf = (lqf) obj;
                        akcr.b(lqf, "cameraLifecycle");
                        String str = "lensCore.audioPlayer.vol…                        }";
                        if (lqf instanceof defpackage.lqf.b.a) {
                            obj = mmt.c().b().b(defpackage.mjh.a.a.a.c).d((ajfc) 1.a);
                            akcr.a(obj, str);
                            return obj;
                        } else if (lqf instanceof lqf.b.b) {
                            obj = mmt.c().b().b(defpackage.mjh.a.b.a.c).d((ajfc) 2.a);
                            akcr.a(obj, str);
                            return obj;
                        } else if (lqf instanceof defpackage.lqf.a) {
                            obj = mie.a(mmt.c().a()).d((ajfc) 3.a);
                            akcr.a(obj, "lensCore.audioPlayer.sto…                        }");
                            return obj;
                        } else {
                            throw new ajxk();
                        }
                    }
                });
            }
        }

        a(lqy lqy) {
            this.a = lqy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajpy.k(ajdp.b((ajdt) this.a.a.u(b.a), (ajdt) this.a.a.u(new a(this)))).a();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(lqy.class), "outputs", "getOutputs()Lio/reactivex/Observable;");
    }

    public lqy(ajdp<mmt> ajdp, ajdp<lqf> ajdp2) {
        akcr.b(ajdp, "lensCore");
        akcr.b(ajdp2, "cameraLifecycle");
        this.a = ajdp;
        this.b = ajdp2;
    }

    public final ajfb a() {
        return myr.a();
    }

    public final ajdp<a> b() {
        return (ajdp) this.c.b();
    }
}
