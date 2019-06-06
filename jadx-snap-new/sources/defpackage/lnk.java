package defpackage;

import android.view.Window;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: lnk */
public final class lnk implements nbd {
    final Window a;
    private final zfw b;

    /* renamed from: lnk$a */
    static final class a<T> implements ajdr<T> {
        private /* synthetic */ lnk a;
        private /* synthetic */ AtomicBoolean b;

        a(lnk lnk, AtomicBoolean atomicBoolean) {
            this.a = lnk;
            this.b = atomicBoolean;
        }

        public final void subscribe(ajdq ajdq) {
            akcr.b(ajdq, "it");
            if ((this.a.a.getAttributes().flags & 128) == 0) {
                this.a.a.addFlags(128);
                this.b.set(true);
            }
        }
    }

    /* renamed from: lnk$b */
    static final class b implements ajev {
        private /* synthetic */ lnk a;
        private /* synthetic */ AtomicBoolean b;

        b(lnk lnk, AtomicBoolean atomicBoolean) {
            this.a = lnk;
            this.b = atomicBoolean;
        }

        public final void run() {
            if (this.b.get()) {
                this.a.a.clearFlags(128);
            }
        }
    }

    public lnk(Window window, zfw zfw) {
        akcr.b(window, "window");
        akcr.b(zfw, "qualifiedSchedulers");
        this.a = window;
        this.b = zfw;
    }

    public final ajdp a() {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Object c = ajdp.a((ajdr) new a(this, atomicBoolean)).a((ajev) new b(this, atomicBoolean)).b((ajdw) this.b.l()).c((ajdw) this.b.l());
        akcr.a(c, "Observable.create<Nothin…dSchedulers.mainThread())");
        return c;
    }
}
