package defpackage;

import defpackage.lqo.b;
import defpackage.lqo.c;
import defpackage.mjn.c.g;
import defpackage.mjn.d;

/* renamed from: mdg */
public final class mdg implements mhi<mha> {
    final ajdp<mmt> a;
    final ajfb<lqo> b;
    final mec c;
    final zfw d;

    /* renamed from: mdg$a */
    public static final class a implements mha {
        final /* synthetic */ mdg a;

        /* renamed from: mdg$a$a */
        static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
            public static final a a = new a();

            /* renamed from: mdg$a$a$a */
            public static final class a<T> implements ajfl<d> {
                public static final a a = new a();

                public final /* synthetic */ boolean test(Object obj) {
                    d dVar = (d) obj;
                    akcr.b(dVar, "it");
                    return akcr.a(dVar.b(), g.a);
                }
            }

            a() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                mmt mmt = (mmt) obj;
                akcr.b(mmt, "it");
                obj = mmt.g().a().a((ajfl) a.a);
                akcr.a(obj, "requests.filter { it.int…eControl.TakeSnapButton }");
                return obj;
            }
        }

        /* renamed from: mdg$a$b */
        static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ a a;

            b(a aVar) {
                this.a = aVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                String str;
                d dVar = (d) obj;
                akcr.b(dVar, "it");
                if (dVar instanceof defpackage.mjn.d.a) {
                    obj = ajdp.b(new defpackage.lqo.b(defpackage.lqo.a.b.a));
                    str = "Observable.just(hideTakeSnapButton)";
                } else if (dVar instanceof defpackage.mjn.d.b) {
                    obj = ajdp.b(new c(defpackage.lqo.a.b.a));
                    str = "Observable.just(showTakeSnapButton)";
                } else {
                    obj = ajvo.a(ajot.a);
                    str = "Observable.empty()";
                }
                akcr.a(obj, str);
                return obj;
            }
        }

        /* renamed from: mdg$a$c */
        static final class c<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ a a;

            c(a aVar) {
                this.a = aVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                String str;
                defpackage.mec.c cVar = (defpackage.mec.c) obj;
                akcr.b(cVar, "it");
                if (cVar instanceof defpackage.mec.c.d) {
                    obj = ajdp.b(new b(defpackage.lqo.a.c.a));
                    str = "Observable.just(hideTooltip)";
                } else if (cVar instanceof defpackage.mec.c.c) {
                    obj = ajdp.b(new defpackage.lqo.c(defpackage.lqo.a.c.a));
                    str = "Observable.just(showTooltip)";
                } else if (cVar instanceof defpackage.mec.c.a) {
                    obj = ajdp.a(new b(defpackage.lqo.a.b.a), new b(defpackage.lqo.a.a.a));
                    str = "Observable.just(hideTakeSnapButton, hideDecor)";
                } else if (cVar instanceof defpackage.mec.c.b) {
                    obj = ajdp.a(new defpackage.lqo.c(defpackage.lqo.a.b.a), new defpackage.lqo.c(defpackage.lqo.a.a.a));
                    str = "Observable.just(showTakeSnapButton, showDecor)";
                } else {
                    obj = ajvo.a(ajot.a);
                    str = "Observable.empty()";
                }
                akcr.a(obj, str);
                return obj;
            }
        }

        /* renamed from: mdg$a$d */
        static final class d implements ajev {
            private /* synthetic */ a a;

            d(a aVar) {
                this.a = aVar;
            }

            public final void run() {
                this.a.a.b.accept(new c(defpackage.lqo.a.b.a));
                this.a.a.b.accept(new c(defpackage.lqo.a.a.a));
            }
        }

        a(mdg mdg) {
            this.a = mdg;
        }

        public final ajej a() {
            return this.a.a.u(a.a).u(new b(this)).e((ajdt) this.a.c.b().u(new c(this))).a((ajev) new d(this)).a((ajdw) this.a.d.l()).c((ajdw) this.a.d.l()).f(this.a.b);
        }

        public final ajdp<Object> b() {
            return defpackage.mha.a.a(this);
        }
    }

    public mdg(ajdp<mmt> ajdp, ajfb<lqo> ajfb, mec mec, zfw zfw) {
        akcr.b(ajdp, "lensCore");
        akcr.b(ajfb, "externalControlAppearanceActionConsumer");
        akcr.b(mec, "useCase");
        akcr.b(zfw, "qualifiedSchedulers");
        this.a = ajdp;
        this.b = ajfb;
        this.c = mec;
        this.d = zfw;
    }

    public final /* synthetic */ Object a() {
        return new a(this);
    }
}
