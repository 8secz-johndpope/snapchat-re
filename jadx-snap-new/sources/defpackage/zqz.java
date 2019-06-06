package defpackage;

import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;
import defpackage.zpq.a;

/* renamed from: zqz */
public final class zqz extends zgi {
    final a a;

    /* renamed from: zqz$a */
    static final class a implements ajev {
        private /* synthetic */ zqz a;

        a(zqz zqz) {
            this.a = zqz;
        }

        public final void run() {
            this.a.a.b();
        }
    }

    public zqz(zgk<b> zgk, a aVar) {
        akcr.b(zgk, "taskScoper");
        akcr.b(aVar, "unlockablesCore");
        super(zgk);
        this.a = aVar;
    }

    public final ajej a() {
        this.a.a();
        Object a = ajek.a((ajev) new a(this));
        akcr.a(a, "Disposables.fromAction {…ore.onEnterBackground() }");
        return a;
    }
}
