package defpackage;

import defpackage.mmi.c;
import defpackage.mmi.c.a;
import defpackage.mmi.c.a.d;
import defpackage.mmi.c.b;

/* renamed from: lqz */
public final class lqz implements lqw {
    final ajdp<mmt> a;
    final ajdp<lqf> b;
    final akbl<mji, ajcx> c;
    final zfw d;
    private final ajxe e = ajxh.a(new a(this));

    /* renamed from: lqz$a */
    static final class a extends akcs implements akbk<ajdp<defpackage.lqw.a>> {
        final /* synthetic */ lqz a;

        /* renamed from: lqz$a$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            final /* synthetic */ a a;

            /* renamed from: lqz$a$1$1 */
            static final class 1<T1, T2, R> implements ajex<R, T, R> {
                private /* synthetic */ 1 a;

                1(1 1) {
                    this.a = 1;
                }

                public final /* synthetic */ Object apply(Object obj, Object obj2) {
                    Boolean bool = (Boolean) obj;
                    ajxm ajxm = (ajxm) obj2;
                    akcr.b(bool, "activated");
                    akcr.b(ajxm, "lifecycles");
                    c cVar = (c) ajxm.a;
                    obj2 = (Boolean) ajxm.b;
                    String str = "isVideoRecording";
                    boolean z;
                    defpackage.mmi.c.a aVar;
                    if (bool.booleanValue()) {
                        if ((cVar instanceof b) || (cVar instanceof defpackage.mmi.c.a.c)) {
                            z = false;
                        } else if (cVar instanceof defpackage.mmi.c.a) {
                            aVar = (defpackage.mmi.c.a) cVar;
                            akcr.a(obj2, str);
                            z = lqz.a(aVar, obj2.booleanValue());
                        } else {
                            z = bool.booleanValue();
                        }
                        return Boolean.valueOf(z);
                    }
                    if (cVar instanceof defpackage.mmi.c.a) {
                        aVar = (defpackage.mmi.c.a) cVar;
                        akcr.a(obj2, str);
                        z = lqz.a(aVar, obj2.booleanValue());
                    } else {
                        z = bool.booleanValue();
                    }
                    return Boolean.valueOf(z);
                }
            }

            1(a aVar) {
                this.a = aVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                final mmt mmt = (mmt) obj;
                akcr.b(mmt, "lensCore");
                ajdp b = mmt.a().b();
                Object h = lqg.a(this.a.a.b, this.a.a.d).h(Boolean.FALSE);
                akcr.a(h, "cameraLifecycle.recordin…edulers).startWith(false)");
                return ajwa.a(b, h).b(Boolean.FALSE, (ajex) new 1(this)).j(ajfu.a).u(new ajfc<T, ajdt<? extends R>>(this) {
                    private /* synthetic */ 1 a;

                    public final /* synthetic */ Object apply(Object obj) {
                        Boolean bool = (Boolean) obj;
                        akcr.b(bool, "activated");
                        if (!bool.booleanValue()) {
                            return ajdp.b(defpackage.lqw.a.b.a);
                        }
                        obj = ((ajcx) this.a.a.a.c.invoke(mmt.d())).b((ajdw) this.a.a.a.d.b());
                        akcr.a(obj, "audioProcessorAttachment…Schedulers.computation())");
                        return mhz.a(obj, "DefaultAudioProcessingUseCase", null, 4).a(ajfu.g).h().h(defpackage.lqw.a.a.a);
                    }
                });
            }
        }

        a(lqz lqz) {
            this.a = lqz;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object u = this.a.a.u(new 1(this));
            akcr.a(u, "lensCore\n               …      }\n                }");
            return ajpy.k(u).a();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(lqz.class), "outputs", "getOutputs()Lio/reactivex/Observable;");
    }

    public lqz(ajdp<mmt> ajdp, ajdp<lqf> ajdp2, akbl<? super mji, ? extends ajcx> akbl, zfw zfw) {
        akcr.b(ajdp, "lensCore");
        akcr.b(ajdp2, "cameraLifecycle");
        akcr.b(akbl, "audioProcessorAttachment");
        akcr.b(zfw, "qualifiedSchedulers");
        this.a = ajdp;
        this.b = ajdp2;
        this.c = akbl;
        this.d = zfw;
    }

    public static final /* synthetic */ boolean a(a aVar, boolean z) {
        mmi.b bVar;
        if (aVar instanceof d) {
            d dVar = (d) aVar;
            if (dVar.b.g || dVar.b.f) {
                bVar = dVar.b;
                if (!bVar.f || bVar.g) {
                    z = bVar.g;
                }
                if (z) {
                    return true;
                }
            }
            return false;
        } else if (aVar instanceof a.b) {
            a.b bVar2 = (a.b) aVar;
            if (bVar2.b.g || bVar2.b.f) {
                bVar = bVar2.b;
                if (!bVar.f || bVar.g) {
                    z = bVar.g;
                }
                if (z) {
                    return true;
                }
            }
            return false;
        } else {
            if (aVar instanceof a.c) {
                a.c cVar = (a.c) aVar;
                if (cVar.b.g || cVar.b.f) {
                    bVar = cVar.b;
                    if (!bVar.f || bVar.g) {
                        z = bVar.g;
                    }
                    if (z) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public final ajfb a() {
        return myr.a();
    }

    public final ajdp<lqw.a> b() {
        return (ajdp) this.e.b();
    }
}
