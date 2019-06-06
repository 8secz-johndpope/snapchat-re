package defpackage;

/* renamed from: dlh */
public final class dlh implements dlg {
    final dii a;

    /* renamed from: dlh$a */
    static final class a implements Runnable {
        private /* synthetic */ dlh a;

        a(dlh dlh) {
            this.a = dlh;
        }

        public final void run() {
            this.a.a.a(null);
        }
    }

    public dlh(dii dii) {
        akcr.b(dii, "bzdPropertiesProvider");
        this.a = dii;
    }

    public final synchronized ajcx a() {
        Object a;
        a = ajcx.a((Runnable) new a(this));
        akcr.a(a, "Completable.fromRunnable…vider.setUserInfo(null) }");
        return a;
    }

    public final synchronized void a(dli dli) {
        akcr.b(dli, "userInfo");
        this.a.a(dli);
    }
}
