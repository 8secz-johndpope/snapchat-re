package defpackage;

import defpackage.tpl.b.b;
import defpackage.twy.a.a;

/* renamed from: twx */
public final class twx implements tpw {
    final ajei a;
    final tvd b;
    final aipn<tyb> c;
    private final String d = "MultiSnapActivator";
    private final ajxe e;
    private final ajxe f;
    private final tpv g;
    private final tpl h;
    private final a i;

    /* renamed from: twx$a */
    static final class a extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;
        private /* synthetic */ toc b;

        a(zgb zgb, toc toc) {
            this.a = zgb;
            this.b = toc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(this.b.callsite("MultiSnapActivator"));
        }
    }

    /* renamed from: twx$b */
    static final class b extends akcs implements akbk<tyb> {
        private /* synthetic */ twx a;

        b(twx twx) {
            this.a = twx;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (tyb) this.a.c.get();
        }
    }

    /* renamed from: twx$c */
    static final class c extends akcs implements akbl<tpq, ajxw> {
        final /* synthetic */ twx a;

        /* renamed from: twx$c$1 */
        static final class 1<T> implements ajfb<String> {
            private /* synthetic */ c a;

            1(c cVar) {
                this.a = cVar;
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                tvd tvd = this.a.a.b;
                if (tvd.d != null) {
                    synchronized (tvd.c) {
                        tvd.d = null;
                        tvd.e = null;
                    }
                }
            }
        }

        /* renamed from: twx$c$2 */
        static final class 2<T> implements ajfb<Throwable> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        c(twx twx) {
            this.a = twx;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            tpq tpq = (tpq) obj;
            akcr.b(tpq, "saveableTool");
            ajej a = tpq.b().b((ajdw) ((zfw) this.a.e.b()).b()).a((ajdw) ((zfw) this.a.e.b()).h()).a((ajfb) new 1(this), (ajfb) 2.a);
            akcr.a((Object) a, "saveableTool.observeEdit…\")\n                    })");
            ajvv.a(a, this.a.a);
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(twx.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(twx.class), "segmentManager", "getSegmentManager()Lcom/snap/preview/segment/SegmentManager;")};
    }

    public twx(tvd tvd, tpv tpv, tpl tpl, a aVar, aipn<tyb> aipn, zgb zgb, toc toc) {
        akcr.b(tvd, "previewDataSource");
        akcr.b(tpv, "toolsProvider");
        akcr.b(tpl, "previewStartUpConfig");
        akcr.b(aVar, "builder");
        akcr.b(aipn, "segmentManagerLazy");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(toc, "previewFeature");
        this.b = tvd;
        this.g = tpv;
        this.h = tpl;
        this.i = aVar;
        this.c = aipn;
        this.e = ajxh.a(new a(zgb, toc));
        this.f = ajxh.a(new b(this));
        this.a = new ajei();
    }

    public final String a() {
        return this.d;
    }

    public final ajej start() {
        if (tpn.a(this.h)) {
            this.g.a(tpq.class, (akbl) new c(this));
            this.a.a(((tyb) this.f.b()).start());
            tpl tpl = this.h;
            akcr.b(tpl, "receiver$0");
            if (!(tpl.b instanceof b)) {
                ajvv.a(this.i.a().a().start(), this.a);
            }
        }
        return this.a;
    }
}
