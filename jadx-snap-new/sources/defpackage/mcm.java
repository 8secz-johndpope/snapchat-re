package defpackage;

import defpackage.mcn.a;
import defpackage.mmi.c;
import defpackage.mmi.c.a.b;

/* renamed from: mcm */
public final class mcm implements mch {
    final ajxe a = ajxh.a(new e(this));
    final ajxe b = ajxh.a(new f(this));
    final ajxe c = ajxh.a(new i(this));
    final ajxe d = ajxh.a(new d(this));
    final ajxe e = ajxh.a(new h(this));
    final ajdp<mmt> f;
    final mcg g;
    final ajdp<lqf> h;
    private final ajxe i = ajxh.a(new a(this));
    private final ajxe j = ajxh.a(new g(this));

    /* renamed from: mcm$a */
    static final class a extends akcs implements akbk<ajdp<c>> {
        private /* synthetic */ mcm a;

        /* renamed from: mcm$a$1 */
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

        a(mcm mcm) {
            this.a = mcm;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object u = this.a.f.u(1.a);
            akcr.a(u, "lensCore.switchMap { it.…licator.filterLifecycle }");
            return ajpy.k(u).a();
        }
    }

    /* renamed from: mcm$e */
    static final class e extends akcs implements akbk<ajdp<mcn>> {
        private /* synthetic */ mcm a;

        /* renamed from: mcm$e$1 */
        static final class 1<T> implements ajfl<c> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                c cVar = (c) obj;
                akcr.b(cVar, "it");
                return cVar instanceof b;
            }
        }

        /* renamed from: mcm$e$2 */
        static final class 2<T, R> implements ajfc<T, R> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((c) obj, "it");
                return a.a;
            }
        }

        e(mcm mcm) {
            this.a = mcm;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((ajdp) this.a.i.b()).a((ajfl) 1.a).p(2.a);
        }
    }

    /* renamed from: mcm$f */
    static final class f extends akcs implements akbk<ajdp<mcn>> {
        private /* synthetic */ mcm a;

        /* renamed from: mcm$f$1 */
        static final class 1<T> implements ajfl<c> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                c cVar = (c) obj;
                akcr.b(cVar, "it");
                return cVar == c.b.a;
            }
        }

        /* renamed from: mcm$f$2 */
        static final class 2<T, R> implements ajfc<T, R> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((c) obj, "it");
                return mcn.b.a;
            }
        }

        f(mcm mcm) {
            this.a = mcm;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((ajdp) this.a.i.b()).a((ajfl) 1.a).p(2.a);
        }
    }

    /* renamed from: mcm$i */
    static final class i extends akcs implements akbk<ajdp<mcn.c>> {
        private /* synthetic */ mcm a;

        /* renamed from: mcm$i$1 */
        static final class 1<T> implements ajfl<lqf> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                lqf lqf = (lqf) obj;
                akcr.b(lqf, "it");
                return (lqf instanceof lqf.b.b.a) || (lqf instanceof lqf.b.b.c);
            }
        }

        /* renamed from: mcm$i$2 */
        static final class 2<T, R> implements ajfc<T, R> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((lqf) obj, "it");
                return mcn.c.a;
            }
        }

        i(mcm mcm) {
            this.a = mcm;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.h.a((ajfl) 1.a).p(2.a);
        }
    }

    /* renamed from: mcm$d */
    static final class d extends akcs implements akbk<ajdp<mcn>> {
        private /* synthetic */ mcm a;

        d(mcm mcm) {
            this.a = mcm;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajdp.a((ajdt) (ajdp) this.a.c.b(), (ajdt) (ajdp) this.a.a.b(), (ajdt) (ajdp) this.a.b.b());
        }
    }

    /* renamed from: mcm$h */
    static final class h extends akcs implements akbk<ajdx<mco>> {
        private /* synthetic */ mcm a;

        /* renamed from: mcm$h$a */
        public static final class a<T1, T2, T3, R> implements ajfd<T1, T2, T3, R> {
            public final R apply(T1 t1, T2 t2, T3 t3) {
                Object obj = (Boolean) t3;
                Object obj2 = (Boolean) t2;
                Object obj3 = (Boolean) t1;
                akcr.a(obj3, "isOnboardingTooltipEnabled");
                boolean booleanValue = obj3.booleanValue();
                akcr.a(obj2, "isSwipeTipCompleted");
                boolean booleanValue2 = obj2.booleanValue();
                akcr.a(obj, "isSnapCaptureTipCompleted");
                return new mco(booleanValue, booleanValue2, obj.booleanValue());
            }
        }

        h(mcm mcm) {
            this.a = mcm;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object a = ajdx.a((ajeb) this.a.g.c(), (ajeb) this.a.g.a(), (ajeb) this.a.g.b(), (ajfd) new a());
            akcr.a(a, "Single.zip(s1, s2, s3, F…per.invoke(t1, t2, t3) })");
            return a;
        }
    }

    /* renamed from: mcm$g */
    static final class g extends akcs implements akbk<ajdp<mch.a>> {
        final /* synthetic */ mcm a;

        /* renamed from: mcm$g$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ g a;

            1(g gVar) {
                this.a = gVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                mco mco = (mco) obj;
                akcr.b(mco, "it");
                mcm mcm = this.a.a;
                mcp.a aVar = (mco.a && !mco.c) ? mco.b ? mcp.b.b.a : mcp.c.a.a : mcp.a.a;
                return ((ajdp) mcm.d.b()).b((Object) aVar, (ajex) new b(mcm)).u(new c(mcm)).j(ajfu.a);
            }
        }

        g(mcm mcm) {
            this.a = mcm;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((ajdx) this.a.e.b()).d((ajfc) new 1(this));
        }
    }

    /* renamed from: mcm$b */
    static final class b<T1, T2, R> implements ajex<R, T, R> {
        private /* synthetic */ mcm a;

        b(mcm mcm) {
            this.a = mcm;
        }

        /* JADX WARNING: Missing block: B:7:0x0025, code skipped:
            if ((r2 instanceof defpackage.mcp.b.b) != false) goto L_0x0027;
     */
        /* JADX WARNING: Missing block: B:11:0x002c, code skipped:
            r2 = defpackage.mcp.a.a;
     */
        /* JADX WARNING: Missing block: B:31:0x0069, code skipped:
            if (defpackage.akcr.a(r2, defpackage.mcp.b.b.a) != false) goto L_0x0027;
     */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r2, java.lang.Object r3) {
            /*
            r1 = this;
            r2 = (defpackage.mcp) r2;
            r3 = (defpackage.mcn) r3;
            r0 = "state";
            defpackage.akcr.b(r2, r0);
            r0 = "action";
            defpackage.akcr.b(r3, r0);
            r0 = defpackage.mcn.b.a;
            r0 = defpackage.akcr.a(r3, r0);
            if (r0 == 0) goto L_0x0032;
        L_0x0016:
            r3 = r2 instanceof defpackage.mcp.c.b;
            if (r3 != 0) goto L_0x002f;
        L_0x001a:
            r3 = defpackage.mcp.c.a.a;
            r3 = defpackage.akcr.a(r2, r3);
            if (r3 == 0) goto L_0x0023;
        L_0x0022:
            goto L_0x002f;
        L_0x0023:
            r2 = r2 instanceof defpackage.mcp.b.b;
            if (r2 == 0) goto L_0x002c;
        L_0x0027:
            r2 = defpackage.mcp.b.b.a;
        L_0x0029:
            r2 = (defpackage.mcp) r2;
            return r2;
        L_0x002c:
            r2 = defpackage.mcp.a.a;
            goto L_0x0029;
        L_0x002f:
            r2 = defpackage.mcp.c.a.a;
            goto L_0x0029;
        L_0x0032:
            r0 = defpackage.mcn.a.a;
            if (r3 != r0) goto L_0x0041;
        L_0x0036:
            r0 = defpackage.mcp.c.a.a;
            r0 = defpackage.akcr.a(r2, r0);
            if (r0 == 0) goto L_0x0041;
        L_0x003e:
            r2 = defpackage.mcp.c.b.a;
            goto L_0x0029;
        L_0x0041:
            r0 = defpackage.mcn.a.a;
            if (r3 != r0) goto L_0x004e;
        L_0x0045:
            r0 = defpackage.mcp.c.b.a;
            r0 = defpackage.akcr.a(r2, r0);
            if (r0 == 0) goto L_0x004e;
        L_0x004d:
            goto L_0x0027;
        L_0x004e:
            r0 = defpackage.mcn.c.a;
            r3 = defpackage.akcr.a(r3, r0);
            if (r3 == 0) goto L_0x0063;
        L_0x0056:
            r3 = r2 instanceof defpackage.mcp.c.b;
            if (r3 == 0) goto L_0x005b;
        L_0x005a:
            goto L_0x003e;
        L_0x005b:
            r3 = r2 instanceof defpackage.mcp.b.b;
            if (r3 == 0) goto L_0x0062;
        L_0x005f:
            r2 = defpackage.mcp.b.a.a;
            goto L_0x0029;
        L_0x0062:
            return r2;
        L_0x0063:
            r3 = defpackage.mcp.b.b.a;
            r2 = defpackage.akcr.a(r2, r3);
            if (r2 == 0) goto L_0x002c;
        L_0x006b:
            goto L_0x0027;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mcm$b.apply(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: mcm$c */
    static final class c<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ mcm a;

        c(mcm mcm) {
            this.a = mcm;
        }

        public final /* synthetic */ Object apply(Object obj) {
            mch.a.b.b bVar;
            ajdp i;
            mcp mcp = (mcp) obj;
            akcr.b(mcp, "state");
            if (mcp instanceof defpackage.mcp.c.b) {
                bVar = mch.a.b.b.a;
            } else {
                ajcx d;
                Object obj2;
                if (mcp instanceof mcp.b.b) {
                    d = this.a.g.d();
                    obj2 = mch.a.b.a.a;
                } else if (mcp instanceof mcp.b.a) {
                    d = this.a.g.e();
                    obj2 = mch.a.a.a;
                } else {
                    bVar = mch.a.a.a;
                }
                i = d.a(obj2).i();
                return i;
            }
            i = mcm.a((mch.a) bVar);
            return i;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(mcm.class), "filterLifecycle", "getFilterLifecycle()Lio/reactivex/Observable;"), new akdc(akde.a(mcm.class), "lensApplied", "getLensApplied()Lio/reactivex/Observable;"), new akdc(akde.a(mcm.class), "lensesClosed", "getLensesClosed()Lio/reactivex/Observable;"), new akdc(akde.a(mcm.class), "snapCaptured", "getSnapCaptured()Lio/reactivex/Observable;"), new akdc(akde.a(mcm.class), "internalActions", "getInternalActions()Lio/reactivex/Observable;"), new akdc(akde.a(mcm.class), "readTooltipsCompletions", "getReadTooltipsCompletions()Lio/reactivex/Single;"), new akdc(akde.a(mcm.class), "outputs", "getOutputs()Lio/reactivex/Observable;")};
    }

    public mcm(ajdp<mmt> ajdp, mcg mcg, ajdp<lqf> ajdp2) {
        akcr.b(ajdp, "lensCore");
        akcr.b(mcg, "carouselTooltipSettings");
        akcr.b(ajdp2, "cameraLifecycle");
        this.f = ajdp;
        this.g = mcg;
        this.h = ajdp2;
    }

    static <T extends mch.a> ajdp<T> a(T t) {
        Object b = ajdp.b((Object) t);
        akcr.a(b, "Observable.just(value)");
        return b;
    }

    public final ajfb a() {
        return myr.a();
    }

    public final ajdp<mch.a> b() {
        return (ajdp) this.j.b();
    }
}
