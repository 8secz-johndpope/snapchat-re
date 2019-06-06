package defpackage;

import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;

/* renamed from: hyd */
public final class hyd extends zgi {
    final ajwy<hxz> a;

    /* renamed from: hyd$a */
    static final class a implements ajev {
        private /* synthetic */ hyd a;

        a(hyd hyd) {
            this.a = hyd;
        }

        public final void run() {
            ((hxz) this.a.a.get()).a();
        }
    }

    public hyd(ajwy<hxz> ajwy, zgk<b> zgk) {
        akcr.b(ajwy, "preloadManager");
        akcr.b(zgk, "taskScoper");
        super(zgk);
        this.a = ajwy;
    }

    public final ajej a() {
        Object e = ajcx.a((ajev) new a(this)).e();
        akcr.a(e, "Completable.fromAction {…t()\n        }.subscribe()");
        return e;
    }
}
