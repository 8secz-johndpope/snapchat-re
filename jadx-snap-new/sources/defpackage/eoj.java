package defpackage;

import com.brightcove.player.event.Event;
import defpackage.eoq.a.a;

/* renamed from: eoj */
public final class eoj implements dno {
    final a a;
    final ajdp<ebn> b;
    final ftl c;
    private final ajxe d;

    /* renamed from: eoj$a */
    static final class a extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        a(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(dnh.f.callsite("ScanActivator"));
        }
    }

    /* renamed from: eoj$b */
    static final class b<T> implements ajea<Boolean> {
        private /* synthetic */ eoj a;

        b(eoj eoj) {
            this.a = eoj;
        }

        public final void subscribe(ajdy<Boolean> ajdy) {
            akcr.b(ajdy, "it");
            if (!ajdy.isDisposed()) {
                ajdy.a(Boolean.valueOf(this.a.c.a((fth) dnd.SCAN_ENABLED)));
            }
        }
    }

    /* renamed from: eoj$c */
    static final class c<T> implements ajfl<Boolean> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "shouldEnableFeature");
            return bool.booleanValue();
        }
    }

    /* renamed from: eoj$d */
    static final class d<T, R> implements ajfc<T, ajdn<? extends R>> {
        private /* synthetic */ eoj a;

        /* renamed from: eoj$d$1 */
        static final class 1<T> implements ajfl<ebn> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                ebn ebn = (ebn) obj;
                akcr.b(ebn, "it");
                return ebn.a == ebn.a.START;
            }
        }

        d(eoj eoj) {
            this.a = eoj;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Boolean) obj, "it");
            return this.a.b.a((ajfl) 1.a).d();
        }
    }

    /* renamed from: eoj$e */
    static final class e<T, R> implements ajfc<T, ajdn<? extends R>> {
        final /* synthetic */ eoj a;

        e(eoj eoj) {
            this.a = eoj;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final ebn ebn = (ebn) obj;
            akcr.b(ebn, "longPressStart");
            return ajdj.a((ajdm) new ajdm<T>(this) {
                private /* synthetic */ e a;

                public final void a(ajdk<Object> ajdk) {
                    akcr.b(ajdk, Event.EMITTER);
                    if (!ajdk.isDisposed()) {
                        eop.a a = this.a.a.a.a().a();
                        ajdk.a(a.start());
                        a.a(ebn.b);
                    }
                }
            });
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(eoj.class), "qualifiedSchedulers", "getQualifiedSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
    }

    public eoj(zgb zgb, a aVar, ajdp<ebn> ajdp, ftl ftl) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(aVar, "scanBuilder");
        akcr.b(ajdp, "longPressObservable");
        akcr.b(ftl, "configProvider");
        this.a = aVar;
        this.b = ajdp;
        this.c = ftl;
        this.d = ajxh.a(new a(zgb));
    }

    private final zfw a() {
        return (zfw) this.d.b();
    }

    public final ajej start() {
        Object i = ajdx.a((ajea) new b(this)).b((ajdw) a().f()).a((ajdw) a().l()).a((ajfl) c.a).a((ajfc) new d(this)).a((ajfc) new e(this)).i();
        akcr.a(i, "Single.create(\n         …             .subscribe()");
        return i;
    }
}
