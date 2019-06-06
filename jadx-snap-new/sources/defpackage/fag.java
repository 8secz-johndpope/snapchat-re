package defpackage;

import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;

/* renamed from: fag */
public final class fag extends zgi {
    final ajwy<fah> a;

    /* renamed from: fag$a */
    static final class a implements ajev {
        private /* synthetic */ fag a;

        a(fag fag) {
            this.a = fag;
        }

        public final void run() {
            fah fah = (fah) this.a.a.get();
            synchronized (fah) {
                fah.a.clear();
            }
        }
    }

    public fag(ajwy<fah> ajwy, zgk<b> zgk) {
        akcr.b(ajwy, "notificationStateManager");
        akcr.b(zgk, "taskScoper");
        super(zgk);
        this.a = ajwy;
    }

    public final ajej a() {
        Object a = ajek.a((ajev) new a(this));
        akcr.a(a, "Disposables.fromAction { onPause() }");
        return a;
    }
}
