package defpackage;

/* renamed from: gtl */
public final class gtl implements gqj {
    private final ajwy<gto> a;
    private final ajwy<gtr> b;
    private final ajwy<abss> c;

    public gtl(ajwy<gto> ajwy, ajwy<gtr> ajwy2, ajwy<abss> ajwy3) {
        akcr.b(ajwy, "crashlyticsNonFatalEventReporter");
        akcr.b(ajwy2, "crashlyticsGateKeeper");
        akcr.b(ajwy3, "releaseManager");
        this.a = ajwy;
        this.b = ajwy2;
        this.c = ajwy3;
    }

    public final void a(gqi gqi) {
        akcr.b(gqi, "anrException");
        Object b = ((gtr) this.b.get()).a().b();
        akcr.a(b, "crashlyticsGateKeeper.ge…ashlytics().blockingGet()");
        if (((Boolean) b).booleanValue()) {
            int i = gtm.a[gqi.c.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    b = this.c.get();
                    akcr.a(b, "releaseManager.get()");
                    if (!((abss) b).l()) {
                        return;
                    }
                } else if (i != 3) {
                    return;
                }
            } else if (!((abss) this.c.get()).g()) {
                return;
            }
            idd idd = gqi.b;
            ((gto) this.a.get()).a(idd != null ? new zfd(idd, (Throwable) gqi, null, 12) : gqi, gqi.c.name(), gqi.d);
        }
    }
}
