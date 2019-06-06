package defpackage;

/* renamed from: gps */
public final class gps<T extends gpp> implements aipt, aipu, aipv, aipw {
    private T a;
    private final ajwy<T> b;

    public gps(ajwy<T> ajwy) {
        akcr.b(ajwy, "userComponentProvider");
        this.b = ajwy;
    }

    public final T a() {
        gpp gpp = this.a;
        if (gpp == null || gpp.e().b) {
            this.a = (gpp) this.b.get();
            gpp = this.a;
            if (gpp != null) {
                gpq f = gpp.f();
                if (f != null) {
                    f.a();
                }
            }
        }
        gpp = this.a;
        if (gpp == null) {
            akcr.a();
        }
        return gpp;
    }

    public final /* synthetic */ aipq activityInjector() {
        return a().a();
    }

    public final /* synthetic */ aipq broadcastReceiverInjector() {
        return a().b();
    }

    public final /* synthetic */ aipq contentProviderInjector() {
        return a().c();
    }

    public final /* synthetic */ aipq serviceInjector() {
        return a().d();
    }
}
