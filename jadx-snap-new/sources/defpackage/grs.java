package defpackage;

import android.os.Build.VERSION;
import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;
import defpackage.gsb.h;
import java.util.Set;

/* renamed from: grs */
public final class grs extends zgi {
    final ajwy<gsi> a;
    final ajwy<gpz> b;
    private final ajwy<Set<gsb>> c;
    private final ajwy<grt> d;
    private final ajwy<Set<gqc>> e;
    private final ajwy<Set<gqd>> f;

    /* renamed from: grs$a */
    static final class a implements ajev {
        private /* synthetic */ grs a;

        a(grs grs) {
            this.a = grs;
        }

        public final void run() {
            grs grs = this.a;
            ((gsi) grs.a.get()).a = null;
            ((gpz) grs.b.get()).b = null;
        }
    }

    public grs(zgk<b> zgk, ajwy<Set<gsb>> ajwy, ajwy<grt> ajwy2, ajwy<gsi> ajwy3, ajwy<gpz> ajwy4, ajwy<Set<gqc>> ajwy5, ajwy<Set<gqd>> ajwy6) {
        akcr.b(zgk, "taskScoper");
        akcr.b(ajwy, "anrWatchDogs");
        akcr.b(ajwy2, "crashAnalyticsHelper");
        akcr.b(ajwy3, "crashMetadataProvidersFactory");
        akcr.b(ajwy4, "crashBreadcrumbProvidersFactory");
        akcr.b(ajwy5, "crashMetadataProviders");
        akcr.b(ajwy6, "crashBreadcrumbDataProviders");
        super(zgk);
        this.c = ajwy;
        this.d = ajwy2;
        this.a = ajwy3;
        this.b = ajwy4;
        this.e = ajwy5;
        this.f = ajwy6;
    }

    public final ajej a() {
        ilv ilv = (ilv) ((grt) this.d.get()).a.get();
        iot iot = iot.APP_OPEN;
        String str = VERSION.RELEASE;
        akcr.a((Object) str, "Build.VERSION.RELEASE");
        ilv.c(iot.a("os_version", str), 1);
        ajei ajei = new ajei();
        for (gsb gsb : (Set) this.c.get()) {
            if (gsb.b) {
                gsb.b = false;
                gsb.a();
            }
            ajej a = ajek.a((Runnable) new h(gsb));
            akcr.a((Object) a, "Disposables.fromRunnable { stop() }");
            ajvv.a(a, ajei);
        }
        return ajei;
    }

    public final ajej b() {
        gsi gsi = (gsi) this.a.get();
        ajwy ajwy = this.e;
        akcr.b(ajwy, "activityScopeCrashMetadataProviders");
        gsi.a = ajwy;
        gpz gpz = (gpz) this.b.get();
        ajwy = this.f;
        akcr.b(ajwy, "crashBreadcrumbProviders");
        gpz.b = ajwy;
        Object a = ajek.a((ajev) new a(this));
        akcr.a(a, "Disposables.fromAction { dispose() }");
        return a;
    }
}
