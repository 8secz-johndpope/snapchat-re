package defpackage;

import android.os.Handler;
import defpackage.bsk.b;
import defpackage.bsk.c;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: bry */
public abstract class bry<T> extends brv {
    final HashMap<T, b> b = new HashMap();
    blb c;
    Handler d;

    /* renamed from: bry$a */
    final class a implements bsk {
        private final T a = null;
        private defpackage.bsk.a b;
        private /* synthetic */ bry c;

        public a(T t) {
            this.c = t;
            this.b = t.a(null);
        }

        private static c a(c cVar) {
            long j = cVar.f;
            long j2 = cVar.g;
            return (j == cVar.f && j2 == cVar.g) ? cVar : new c(cVar.a, cVar.b, cVar.c, cVar.d, cVar.e, j, j2);
        }

        private boolean d(int i, defpackage.bsj.a aVar) {
            Object aVar2;
            if (aVar2 == null) {
                aVar2 = null;
            } else if (aVar2 == null) {
                return false;
            }
            if (!(this.b.a == i && bzo.a(this.b.b, aVar2))) {
                this.b = this.c.a(i, (defpackage.bsj.a) aVar2);
            }
            return true;
        }

        public final void a(int i, defpackage.bsj.a aVar) {
            if (d(i, aVar)) {
                this.b.a();
            }
        }

        public final void a(int i, defpackage.bsj.a aVar, b bVar, c cVar) {
            if (d(i, aVar)) {
                this.b.a(bVar, a.a(cVar));
            }
        }

        public final void a(int i, defpackage.bsj.a aVar, b bVar, c cVar, IOException iOException, boolean z) {
            if (d(i, aVar)) {
                this.b.a(bVar, a.a(cVar), iOException, z);
            }
        }

        public final void a(int i, defpackage.bsj.a aVar, c cVar) {
            if (d(i, aVar)) {
                this.b.a(a.a(cVar));
            }
        }

        public final void b(int i, defpackage.bsj.a aVar) {
            if (d(i, aVar)) {
                this.b.b();
            }
        }

        public final void b(int i, defpackage.bsj.a aVar, b bVar, c cVar) {
            if (d(i, aVar)) {
                this.b.b(bVar, a.a(cVar));
            }
        }

        public final void b(int i, defpackage.bsj.a aVar, c cVar) {
            if (d(i, aVar)) {
                this.b.b(a.a(cVar));
            }
        }

        public final void c(int i, defpackage.bsj.a aVar) {
            if (d(i, aVar)) {
                this.b.c();
            }
        }

        public final void c(int i, defpackage.bsj.a aVar, b bVar, c cVar) {
            if (d(i, aVar)) {
                this.b.c(bVar, a.a(cVar));
            }
        }
    }

    /* renamed from: bry$1 */
    class 1 implements bsj.b {
        private /* synthetic */ Object a = null;

        1() {
        }

        public final void a(bsj bsj, bly bly, Object obj) {
            bry.this.b(bly, obj);
        }
    }

    /* renamed from: bry$b */
    static final class b {
        public final bsj a;
        public final defpackage.bsj.b b;
        public final bsk c;

        public b(bsj bsj, defpackage.bsj.b bVar, bsk bsk) {
            this.a = bsj;
            this.b = bVar;
            this.c = bsk;
        }
    }

    protected bry() {
    }

    public void a() {
        for (b bVar : this.b.values()) {
            bVar.a.a(bVar.b);
            bVar.a.a(bVar.c);
        }
        this.b.clear();
        this.c = null;
    }

    public void a(blb blb, boolean z) {
        this.c = blb;
        this.d = new Handler();
    }

    public final void b() {
        for (b bVar : this.b.values()) {
            bVar.a.b();
        }
    }

    public abstract void b(bly bly, Object obj);
}
