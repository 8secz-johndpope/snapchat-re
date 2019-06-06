package defpackage;

import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;
import defpackage.gog.d;
import defpackage.gos.c;
import defpackage.gos.e;
import java.util.concurrent.Callable;

/* renamed from: gok */
public final class gok extends zgi {
    private final gos a;
    private final gog b;

    public gok(gos gos, zgk<b> zgk, gog gog) {
        akcr.b(gos, "prefetcher");
        akcr.b(zgk, "taskScoper");
        akcr.b(gog, "prefetchScheduler");
        super(zgk);
        this.a = gos;
        this.b = gog;
    }

    public final ajej a() {
        gog gog = this.b;
        gog.a.a(Boolean.TRUE);
        Object a = ajek.a((Runnable) new d(gog));
        akcr.a(a, "Disposables.fromRunnable…t.onNext(false)\n        }");
        return a;
    }

    public final ajej b() {
        ajei ajei = new ajei();
        gos gos = this.a;
        ajei ajei2 = new ajei();
        ajej l = ajdp.b((Callable) new c(gos)).b((ajdw) gos.a.b()).a((ajfl) gos.d.a).p(new e(gos, ajei2)).l();
        akcr.a((Object) l, "Observable.fromCallable …             .subscribe()");
        ajvv.a(l, ajei2);
        ajei.a((ajej) ajei2);
        return ajei;
    }
}
