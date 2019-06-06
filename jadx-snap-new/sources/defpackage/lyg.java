package defpackage;

import defpackage.lyw.a;
import defpackage.lyw.a.c;
import defpackage.lyw.b;
import defpackage.lyw.b.d;

/* renamed from: lyg */
public final class lyg implements lyw {
    final ajws<a> a;
    final mqt b;
    private final ajxe c = ajxh.a(new a(this));
    private final ajxe d = ajxh.a(new b(this));

    /* renamed from: lyg$a */
    static final class a extends akcs implements akbk<ajfb<defpackage.lyw.a>> {
        private /* synthetic */ lyg a;

        a(lyg lyg) {
            this.a = lyg;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new lyi(new akbl<defpackage.lyw.a, ajxw>(this.a.a) {
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
                    defpackage.lyw.a aVar = (defpackage.lyw.a) obj;
                    akcr.b(aVar, "p1");
                    ((ajws) this.receiver).a((Object) aVar);
                    return ajxw.a;
                }
            });
        }
    }

    /* renamed from: lyg$b */
    static final class b extends akcs implements akbk<ajdp<defpackage.lyw.b>> {
        final /* synthetic */ lyg a;

        /* renamed from: lyg$b$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ b a;

            1(b bVar) {
                this.a = bVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                a aVar = (a) obj;
                akcr.b(aVar, "action");
                if (aVar instanceof c) {
                    return ajdp.b(d.a);
                }
                if (aVar instanceof defpackage.lyw.a.b) {
                    ajdp a = this.a.a.b.a();
                    akbl akbl = lyh.a;
                    if (akbl != null) {
                        akbl = new lyj(akbl);
                    }
                    return a.u((ajfc) akbl);
                } else if (aVar instanceof a.a) {
                    return ajdp.b(defpackage.lyw.b.b.a);
                } else {
                    throw new ajxk();
                }
            }
        }

        b(lyg lyg) {
            this.a = lyg;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.f().u(new 1(this)).i().a();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(lyg.class), "inputs", "getInputs()Lio/reactivex/functions/Consumer;"), new akdc(akde.a(lyg.class), "outputs", "getOutputs()Lio/reactivex/Observable;")};
    }

    public lyg(mqt mqt) {
        akcr.b(mqt, "lensExplorerController");
        this.b = mqt;
        Object r = new ajwo().r();
        akcr.a(r, "PublishSubject.create<Ex….Action>().toSerialized()");
        this.a = r;
    }

    public final ajfb<a> a() {
        return (ajfb) this.c.b();
    }

    public final ajdp<b> b() {
        return (ajdp) this.d.b();
    }
}
