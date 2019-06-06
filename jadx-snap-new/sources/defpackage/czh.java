package defpackage;

import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;

/* renamed from: czh */
public final class czh extends zgi {
    final ftl a;
    private final zfw b = zgb.a(czg.a.callsite("observer"));

    /* renamed from: czh$a */
    static final class a implements Runnable {
        private /* synthetic */ czh a;

        a(czh czh) {
            this.a = czh;
        }

        public final void run() {
            this.a.a.f(cze.DUM_AB_VARIABLE);
            this.a.a.j(defpackage.hwx.a.a(ftg.AB_PLATFORM, "DUM_AND", "b", "2"));
            this.a.a.w(cze.DUM_AB_VARIABLE);
        }
    }

    public czh(ftl ftl, zgk<b> zgk, zgb zgb) {
        akcr.b(ftl, "configProvider");
        akcr.b(zgk, "taskScoper");
        akcr.b(zgb, "schedulersProvider");
        super(zgk);
        this.a = ftl;
    }

    public final ajej a() {
        Object a = this.b.b().a((Runnable) new a(this));
        akcr.a(a, "schedulers.computation()…UM_AB_VARIABLE)\n        }");
        return a;
    }
}
