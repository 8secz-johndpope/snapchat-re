package defpackage;

/* renamed from: zid */
public final class zid extends ablj implements achk<zjm, zjk> {
    zia a;
    zia b;
    boolean c;
    final ajwy<achb<zjm, zjk>> d;
    private final ajen e = new ajen();
    private final ajwy<ablk> f;

    /* renamed from: zid$a */
    static final class a<T> implements ajfb<Boolean> {
        private /* synthetic */ zid a;

        a(zid zid) {
            this.a = zid;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            akcr.a(obj, "shouldMonitor");
            if (obj.booleanValue()) {
                zid zid = this.a;
                ((achb) zid.d.get()).a((achk) zid);
                zid.c = ((achb) zid.d.get()).c;
                if (zid.c) {
                    aciv i = ((achb) zid.d.get()).i();
                    if (i != null) {
                        zjm zjm = (zjm) i.e();
                        if (zjm != null) {
                            String d = zjm.d();
                            if (d != null) {
                                zid.a.a(null, d);
                            }
                        }
                    }
                }
                zid.b.a(null, "UNDEFINED");
            }
        }
    }

    public zid(ajwy<zhx> ajwy, ajwy<achb<zjm, zjk>> ajwy2, ajwy<icu> ajwy3, ajwy<ablk> ajwy4) {
        akcr.b(ajwy, "badFrameMonitor");
        akcr.b(ajwy2, "navigationHost");
        akcr.b(ajwy3, "badFrameMetricReporter");
        akcr.b(ajwy4, "perfMonitorConfig");
        this.d = ajwy2;
        this.f = ajwy4;
        this.a = new zia(zij.PAGE_VIEW, ajwy, ajwy3);
        this.b = new zia(zij.APP_SESSION, ajwy, ajwy3);
    }

    public final void a(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        if (achi.l) {
            this.a.a("UNDEFINED");
        }
    }

    public final void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        this.a.a(((zjm) achi.e.e()).d(), ((zjm) achi.f.e()).d());
    }

    public final void c(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        this.a.a(((zjm) achi.e.e()).d(), ((zjm) achi.e.e()).d());
    }

    public final void e() {
        this.e.a(((ablk) this.f.get()).b(new aaag()).a(ajef.a()).e((ajfb) new a(this)));
    }

    public final void f() {
        this.e.a(null);
        ((achb) this.d.get()).b((achk) this);
        String str = "UNDEFINED";
        this.a.a(str);
        this.b.a(str);
    }
}
