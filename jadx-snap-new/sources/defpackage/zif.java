package defpackage;

/* renamed from: zif */
public final class zif extends ablj implements achk<zjm, zjk> {
    final ajwy<achb<zjm, zjk>> a;
    private zia b;
    private zia c;
    private final ajen d = new ajen();
    private final ajwy<ablk> e;

    /* renamed from: zif$a */
    static final class a<T> implements ajfb<Boolean> {
        private /* synthetic */ zif a;

        a(zif zif) {
            this.a = zif;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            akcr.a(obj, "shouldMonitor");
            if (obj.booleanValue()) {
                zif zif = this.a;
                ((achb) zif.a.get()).a((achk) zif);
            }
        }
    }

    public zif(ajwy<zhx> ajwy, ajwy<achb<zjm, zjk>> ajwy2, ajwy<icu> ajwy3, ajwy<ablk> ajwy4) {
        akcr.b(ajwy, "badFrameMonitor");
        akcr.b(ajwy2, "navigationHost");
        akcr.b(ajwy3, "badFrameMetricReporter");
        akcr.b(ajwy4, "perfMonitorConfig");
        this.a = ajwy2;
        this.e = ajwy4;
        this.b = new zia(zij.PAGE_TRANSITION, ajwy, ajwy3);
        this.c = new zia(zij.PAGE_SWIPE, ajwy, ajwy3);
    }

    public final void a(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        if (achi.l) {
            if (achi.g == achj.DRAGGING) {
                this.c.a(((zjm) achi.e.e()).d(), ((zjm) achi.f.e()).d());
                return;
            }
            this.b.a(((zjm) achi.e.e()).d(), ((zjm) achi.f.e()).d());
        }
    }

    public final void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        String str = "UNDEFINED";
        this.b.a(str);
        this.c.a(str);
    }

    public final void c(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        String str = "UNDEFINED";
        this.b.a(str);
        this.c.a(str);
    }

    public final void e() {
        this.d.a(((ablk) this.e.get()).b(new aaag()).a(ajef.a()).e((ajfb) new a(this)));
    }

    public final void f() {
        this.d.a(null);
        ((achb) this.a.get()).b((achk) this);
    }
}
