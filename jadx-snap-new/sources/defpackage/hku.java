package defpackage;

import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;

/* renamed from: hku */
public final class hku extends zgi {
    final hkp a;
    private final ajwy<tnj> b;

    /* renamed from: hku$a */
    static final class a implements ajev {
        private /* synthetic */ hku a;

        a(hku hku) {
            this.a = hku;
        }

        public final void run() {
            this.a.a.b = true;
        }
    }

    public hku(ajwy<tnj> ajwy, hkp hkp, zgk<b> zgk) {
        akcr.b(ajwy, "preferences");
        akcr.b(hkp, "optInNotificationHandler");
        akcr.b(zgk, "taskScoper");
        super(zgk);
        this.b = ajwy;
        this.a = hkp;
    }

    public final ajej a() {
        ajei ajei = new ajei();
        this.a.b = false;
        ajej a = ajek.a((ajev) new a(this));
        akcr.a((Object) a, "Disposables.fromAction {….appInBackground = true }");
        ajvv.a(a, ajei);
        a = ((tnj) this.b.get()).b().a((fth) gvt.OPT_IN_NOTIFICATIONS_SHOWN_BETWEEN_APP_SESSION, Integer.valueOf(0)).b();
        akcr.a((Object) a, "preferences\n            …\n                .apply()");
        ajvv.a(a, ajei);
        return ajei;
    }
}
