package defpackage;

import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;

/* renamed from: rru */
public final class rru extends zgi {
    final rrv a;

    /* renamed from: rru$a */
    static final class a implements ajev {
        private /* synthetic */ rru a;

        a(rru rru) {
            this.a = rru;
        }

        public final void run() {
            this.a.a.c = false;
        }
    }

    public rru(zgk<b> zgk, rrv rrv) {
        akcr.b(zgk, "taskScoper");
        akcr.b(rrv, "lockScreenNotificationController");
        super(zgk);
        this.a = rrv;
    }

    public final ajej a() {
        this.a.c = true;
        Object a = ajek.a((ajev) new a(this));
        akcr.a(a, "Disposables.fromAction {…ntroller.onBackground() }");
        return a;
    }
}
