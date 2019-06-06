package defpackage;

import com.brightcove.player.event.Event;
import defpackage.mpf.a;
import java.io.File;

/* renamed from: mpe */
public final class mpe {

    /* renamed from: mpe$b */
    public static final class b implements mpf {
        final ajxe a = ajxh.a(new a(this));
        final /* synthetic */ mpc b;
        final /* synthetic */ zfw c;
        private /* synthetic */ mpf d;

        /* renamed from: mpe$b$a */
        static final class a extends akcs implements akbk<ajcx> {
            final /* synthetic */ b a;

            /* renamed from: mpe$b$a$a */
            static final class a implements ajev {
                private /* synthetic */ a a;

                a(a aVar) {
                    this.a = aVar;
                }

                public final void run() {
                    File a = this.a.a.b.a();
                    if (!mhr.a(a)) {
                        a = null;
                    }
                    if (a != null) {
                        akbf.c(a);
                    }
                }
            }

            a(b bVar) {
                this.a = bVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                final Object a = ajek.a((ajev) new a(this));
                akcr.a(a, "Disposables.fromAction {…y()\n                    }");
                return ajcx.a((ajda) new ajda() {
                    public final void subscribe(ajcy ajcy) {
                        akcr.b(ajcy, Event.EMITTER);
                        if (!ajcy.isDisposed()) {
                            if (!a.isDisposed()) {
                                a.dispose();
                            }
                            if (!ajcy.isDisposed()) {
                                ajcy.a();
                            }
                        }
                    }
                }).b((ajdw) this.a.c.f());
            }
        }

        /* renamed from: mpe$b$b */
        static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ b a;

            b(b bVar) {
                this.a = bVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                obj = (miq) obj;
                akcr.b(obj, "it");
                ajcx ajcx = (ajcx) this.a.a.b();
                obj = ajdp.b(obj);
                ajfv.a(obj, "other is null");
                return obj.c(ajcx.h());
            }
        }

        static {
            new aken[1][0] = new akdc(akde.a(b.class), "cleanupCompletable", "getCleanupCompletable()Lio/reactivex/Completable;");
        }

        b(mpf mpf, mpc mpc, zfw zfw) {
            this.d = mpf;
            this.b = mpc;
            this.c = zfw;
        }

        public final ajdp<miq> a(a aVar) {
            akcr.b(aVar, "queryCriteria");
            return this.d.a(aVar).u(new b(this));
        }
    }

    /* renamed from: mpe$a */
    public static final class a implements mpf {
        private /* synthetic */ mpf a;
        private /* synthetic */ mpf b;

        a(mpf mpf, mpf mpf2) {
            this.a = mpf;
            this.b = mpf2;
        }

        public final ajdp<miq> a(defpackage.mpf.a aVar) {
            akcr.b(aVar, "queryCriteria");
            return this.a.a(aVar).i((ajdt) this.b.a(aVar));
        }
    }

    static {
        mpe mpe = new mpe();
    }

    private mpe() {
    }

    public static final mpf a(mpf mpf, mpf mpf2) {
        akcr.b(mpf, "localRepository");
        akcr.b(mpf2, "remoteRepository");
        return new a(mpf, mpf2);
    }
}
