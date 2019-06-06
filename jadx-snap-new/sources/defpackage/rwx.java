package defpackage;

import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;

/* renamed from: rwx */
public final class rwx extends zgi {
    final rxd a;
    private final zgk<b> b;

    /* renamed from: rwx$a */
    static final class a implements ajev {
        private /* synthetic */ rwx a;

        a(rwx rwx) {
            this.a = rwx;
        }

        public final void run() {
            this.a.a.g();
        }
    }

    public rwx(zgk<b> zgk, rxd rxd) {
        akcr.b(zgk, "taskScoper");
        akcr.b(rxd, "bandwidthClassManager");
        super(zgk);
        this.b = zgk;
        this.a = rxd;
    }

    public final ajej a() {
        this.a.f();
        Object a = ajek.a((ajev) new a(this));
        akcr.a(a, "Disposables.fromAction {…nager.onActivityPause() }");
        return a;
    }
}
