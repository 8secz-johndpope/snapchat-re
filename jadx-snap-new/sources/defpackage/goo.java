package defpackage;

import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;
import defpackage.goa.c;

/* renamed from: goo */
public final class goo extends zgi {
    private final ajwy<goa> a;

    public goo(ajwy<goa> ajwy, zgk<b> zgk) {
        akcr.b(ajwy, "backgroundPrefetchActivityObserver");
        akcr.b(zgk, "taskScoper");
        super(zgk);
        this.a = ajwy;
    }

    public final ajej a() {
        goa goa = (goa) this.a.get();
        ajej f = ((ftl) goa.e.get()).p(fxm.BACKGROUND_PREFETCH_EXPOSURE_LOGGING_FOREGROUND).b(goa.a).c(1).f((ajfb) new c(goa));
        akcr.a(ajek.a((ajev) new goa.b(goa)), "Disposables.fromAction {…}\n            }\n        }");
        return new ajei(f, r0);
    }

    public final ajej b() {
        return ((goa) this.a.get()).b;
    }
}
