package defpackage;

import android.os.Handler;
import defpackage.j.a;

/* renamed from: v */
public final class v {
    public final m a;
    private final Handler b = new Handler();
    private a c;

    /* renamed from: v$a */
    static class a implements Runnable {
        private final m a;
        private defpackage.j.a b;
        private boolean c = false;

        a(m mVar, defpackage.j.a aVar) {
            this.a = mVar;
            this.b = aVar;
        }

        public final void run() {
            if (!this.c) {
                this.a.a(this.b);
                this.c = true;
            }
        }
    }

    public v(l lVar) {
        this.a = new m(lVar);
    }

    public final void a(a aVar) {
        a aVar2 = this.c;
        if (aVar2 != null) {
            aVar2.run();
        }
        this.c = new a(this.a, aVar);
        this.b.postAtFrontOfQueue(this.c);
    }
}
