package defpackage;

import defpackage.map.a;
import defpackage.map.a.b;
import defpackage.mmi.c;
import defpackage.mmi.c.a.d;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: mak */
public final class mak implements map {
    final ajdp<mmt> a;
    private final ajxe b = ajxh.a(new a(this));

    /* renamed from: mak$a */
    static final class a extends akcs implements akbk<ajdp<defpackage.map.a>> {
        private /* synthetic */ mak a;

        /* renamed from: mak$a$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                final mmt mmt = (mmt) obj;
                akcr.b(mmt, "lensCore");
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                return mmt.a().b().b(defpackage.map.a.a.a, (ajex) new ajex<R, T, R>() {
                    public final /* synthetic */ Object apply(Object obj, Object obj2) {
                        b bVar;
                        defpackage.map.a aVar = (defpackage.map.a) obj;
                        c cVar = (c) obj2;
                        akcr.b(aVar, "previous");
                        akcr.b(cVar, "current");
                        if (cVar instanceof d) {
                            if (atomicBoolean.compareAndSet(false, true)) {
                                mmt.n().a(ajyy.a);
                                bVar = new b(((d) cVar).a);
                            }
                            bVar = defpackage.map.a.a.a;
                        } else if ((cVar instanceof defpackage.mmi.c.a.a) || (cVar instanceof defpackage.mmi.c.a.c)) {
                            if (aVar instanceof b) {
                                if (atomicBoolean.compareAndSet(true, false)) {
                                    mnu.d b = mmt.n().b();
                                    return new defpackage.map.a.c(((b) aVar).a, b.c, b.d, b.b);
                                }
                            } else if (!(aVar instanceof defpackage.map.a.c)) {
                                return aVar;
                            }
                            bVar = defpackage.map.a.a.a;
                        } else {
                            if (!(aVar instanceof defpackage.map.a.c)) {
                                return aVar;
                            }
                            bVar = defpackage.map.a.a.a;
                        }
                        return bVar;
                    }
                }).a((ajev) new ajev() {
                    public final void run() {
                        if (atomicBoolean.compareAndSet(true, false)) {
                            mmt.n().b();
                        }
                    }
                });
            }
        }

        a(mak mak) {
            this.a = mak;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajpy.k(this.a.a.u(1.a)).a();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(mak.class), "outputs", "getOutputs()Lio/reactivex/Observable;");
    }

    public mak(ajdp<mmt> ajdp) {
        akcr.b(ajdp, "lensCore");
        this.a = ajdp;
    }

    public final ajfb a() {
        return myr.a();
    }

    public final ajdp<a> b() {
        return (ajdp) this.b.b();
    }
}
