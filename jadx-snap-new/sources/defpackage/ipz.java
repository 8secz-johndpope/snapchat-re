package defpackage;

import com.snap.identity.job.PermissionSettingsReporterDurableJob;
import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;

/* renamed from: ipz */
public final class ipz extends zgi {
    final zfw a = zgb.a(irc.t, "PermissionSettingsReporterTask");
    final ajei b = new ajei();
    final aipn<hwl> c;

    /* renamed from: ipz$a */
    static final class a implements ajev {
        final /* synthetic */ ipz a;

        /* renamed from: ipz$a$1 */
        static final class 1 implements Runnable {
            private /* synthetic */ a a;

            1(a aVar) {
                this.a = aVar;
            }

            public final void run() {
                ajej e = ((hwl) this.a.a.c.get()).a((hwg) new PermissionSettingsReporterDurableJob(new iya())).e();
                akcr.a((Object) e, "durableJobManager.get()\n…             .subscribe()");
                ajvv.a(e, this.a.a.b);
            }
        }

        a(ipz ipz) {
            this.a = ipz;
        }

        public final void run() {
            ajej a = this.a.a.j().a((Runnable) new 1(this));
            akcr.a((Object) a, "schedulers.idle().schedu…isposables)\n            }");
            ajvv.a(a, this.a.b);
        }
    }

    public ipz(zgb zgb, aipn<hwl> aipn, zgk<b> zgk) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(aipn, "durableJobManager");
        akcr.b(zgk, "taskScoper");
        super(zgk);
        this.c = aipn;
    }

    public final ajej a() {
        this.b.a();
        Object a = ajek.a((ajev) new a(this));
        akcr.a(a, "Disposables.fromAction {…To(disposables)\n        }");
        return a;
    }
}
