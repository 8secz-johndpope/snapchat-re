package defpackage;

import defpackage.gpe.a;

/* renamed from: gpi */
public final class gpi extends ablj {
    gpe a;
    private final ajen b = new ajen();
    private final ajwy<ablk> c;

    /* renamed from: gpi$a */
    static final class a<T> implements ajfb<Boolean> {
        private /* synthetic */ gpi a;

        a(gpi gpi) {
            this.a = gpi;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            akcr.a(obj, "shouldMonitor");
            if (obj.booleanValue()) {
                gpe gpe = this.a.a;
                zfn a = ((zfo) gpe.d.get()).a();
                gpg gpg = gpe.b;
                if (gpg != null) {
                    gpe.c = new defpackage.gpe.a(gpg, a);
                }
                gpe.b = null;
                gpe.a = new gpg(true, a);
            }
        }
    }

    public gpi(aipn<zfo> aipn, aipn<gph> aipn2, ajwy<ablk> ajwy) {
        akcr.b(aipn, "cpuStatsLogger");
        akcr.b(aipn2, "cpuEventReporter");
        akcr.b(ajwy, "perfMonitorConfig");
        this.c = ajwy;
        this.a = new gpe(aipn, aipn2);
    }

    public final void e() {
        this.b.a(((ablk) this.c.get()).b(new aaak()).a(ajef.a()).e((ajfb) new a(this)));
    }

    public final void f() {
        this.b.a(null);
        gpe gpe = this.a;
        zfn a = ((zfo) gpe.d.get()).a();
        a aVar = gpe.c;
        if (aVar != null) {
            ((gph) gpe.e.get()).a(aVar.a, aVar.b);
        }
        gpe.c = null;
        gpg gpg = gpe.a;
        if (gpg != null) {
            ((gph) gpe.e.get()).a(gpg, a);
        }
        gpe.a = null;
        gpe.b = new gpg(false, a);
    }
}
