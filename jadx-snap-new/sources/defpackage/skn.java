package defpackage;

import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;
import defpackage.sst.k;

/* renamed from: skn */
public final class skn extends skq {
    final ajwm a;
    final sso b;
    final sxd c;

    /* renamed from: skn$c */
    static final class c implements ajev {
        private /* synthetic */ skn a;

        c(skn skn) {
            this.a = skn;
        }

        public final void run() {
            sst sst = this.a.b.d;
            Object c = sst.d.b((fth) suc.ENABLE_BG_WARMUP).b((ajdw) sst.e.j()).c((ajfb) new k(sst)).c();
            akcr.a(c, "experimentConfigProvider…             .subscribe()");
            std.a(c, sst.b);
        }
    }

    /* renamed from: skn$b */
    static final class b implements ajev {
        private /* synthetic */ skn a;

        b(skn skn) {
            this.a = skn;
        }

        public final void run() {
            sxd sxd = this.a.c;
            sxd.a.a();
            sxd.b.dispose();
        }
    }

    /* renamed from: skn$a */
    static final class a implements Runnable {
        private /* synthetic */ skn a;

        a(skn skn) {
            this.a = skn;
        }

        public final void run() {
            this.a.a.a();
        }
    }

    public skn(zgk<b> zgk, sso sso, sxd sxd) {
        akcr.b(zgk, "taskScoper");
        akcr.b(sso, "operaLauncher");
        akcr.b(sxd, "recycler");
        super(zgk);
        this.b = sso;
        this.c = sxd;
        Object ajwm = new ajwm();
        akcr.a(ajwm, "CompletableSubject.create()");
        this.a = ajwm;
    }

    public final ajej a() {
        Object e = ajcx.a((Runnable) new a(this)).e();
        akcr.a(e, "Completable.fromRunnable…            }.subscribe()");
        return e;
    }

    public final ajej b() {
        Object e = this.a.b((ajev) new c(this)).b((ajdb) ajvo.a(ajib.a)).c((ajev) new b(this)).e();
        akcr.a(e, "foregroundCompletable\n  …             .subscribe()");
        return e;
    }
}
