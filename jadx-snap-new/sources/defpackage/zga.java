package defpackage;

import defpackage.ajdw.c;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: zga */
public class zga extends ajdw implements ajej {
    static final ajej a = new g();
    static final ajej b = ajfq.INSTANCE;
    private final ajdw d;
    private final ajvq<ajde<ajcx>> e = ajvu.l().k();
    private ajej f;

    /* renamed from: zga$d */
    static class d implements Runnable {
        final Runnable a;
        private ajcz b;

        d(Runnable runnable, ajcz ajcz) {
            this.a = runnable;
            this.b = ajcz;
        }

        public final void run() {
            try {
                this.a.run();
            } finally {
                this.b.a();
            }
        }
    }

    /* renamed from: zga$g */
    static final class g implements ajej {
        g() {
        }

        public final void dispose() {
        }

        public final boolean isDisposed() {
            return false;
        }
    }

    /* renamed from: zga$a */
    static final class a implements ajej, ajfc<f, ajcx> {
        final c a;
        private ajei b = new ajei();

        /* renamed from: zga$a$a */
        static final class a implements ajcz {
            private ajcz a;
            private ajei b;
            private ajej c = ajek.a(new -$$Lambda$zga$a$a$Yahu9LeXK8tdq84sJBFnSXVvynQ(this));
            private AtomicBoolean d = new AtomicBoolean(false);

            public a(ajcz ajcz, ajei ajei) {
                this.a = ajcz;
                this.b = ajei;
            }

            private void b() {
                if (this.d.compareAndSet(false, true)) {
                    this.a.a();
                }
            }

            public final void a() {
                this.b.b(this.c);
                b();
            }

            public final void a(ajej ajej) {
                this.b.a(this.c);
                this.a.a(ajej);
            }

            public final void a(Throwable th) {
                this.b.b(this.c);
                this.a.a(th);
            }
        }

        /* renamed from: zga$a$b */
        final class b extends ajcx {
            private f a;
            private ajei b;

            b(f fVar, ajei ajei) {
                this.a = fVar;
                this.b = ajei;
            }

            public final void b(ajcz ajcz) {
                a aVar = new a(ajcz, this.b);
                aVar.a(this.a);
                this.a.b(a.this.a, aVar);
            }
        }

        a(c cVar) {
            this.a = cVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            return new b((f) obj, this.b);
        }

        public final void dispose() {
            this.b.dispose();
        }

        public final boolean isDisposed() {
            return this.b.isDisposed();
        }
    }

    /* renamed from: zga$e */
    static final class e extends c {
        private final AtomicBoolean a = new AtomicBoolean();
        private final ajvq<f> b;
        private final c c;
        private final a d;

        e(ajvq<f> ajvq, c cVar, a aVar) {
            this.b = ajvq;
            this.c = cVar;
            this.d = aVar;
        }

        public final ajej a(Runnable runnable) {
            c cVar = new c(runnable);
            this.b.a((Object) cVar);
            return cVar;
        }

        public final ajej a(Runnable runnable, long j, TimeUnit timeUnit) {
            b bVar = new b(runnable, j, timeUnit);
            this.b.a((Object) bVar);
            return bVar;
        }

        public final void dispose() {
            if (this.a.compareAndSet(false, true)) {
                this.b.a();
                this.d.dispose();
                this.c.dispose();
            }
        }

        public final boolean isDisposed() {
            return this.a.get();
        }
    }

    /* renamed from: zga$b */
    static class b extends f {
        private final Runnable a;
        private final long b;
        private final TimeUnit c;

        b(Runnable runnable, long j, TimeUnit timeUnit) {
            this.a = runnable;
            this.b = j;
            this.c = timeUnit;
        }

        /* Access modifiers changed, original: protected|final */
        public final ajej a(c cVar, ajcz ajcz) {
            return cVar.a(new d(this.a, ajcz), this.b, this.c);
        }
    }

    /* renamed from: zga$f */
    static abstract class f extends AtomicReference<ajej> implements ajej {
        f() {
            super(zga.a);
        }

        public abstract ajej a(c cVar, ajcz ajcz);

        /* Access modifiers changed, original: final */
        public final void b(c cVar, ajcz ajcz) {
            ajej ajej = (ajej) get();
            if (ajej != zga.b && ajej == zga.a) {
                ajej a = a(cVar, ajcz);
                if (!compareAndSet(zga.a, a)) {
                    a.dispose();
                }
            }
        }

        public void dispose() {
            ajej ajej;
            ajej ajej2 = zga.b;
            do {
                ajej = (ajej) get();
                if (ajej == zga.b) {
                    return;
                }
            } while (!compareAndSet(ajej, ajej2));
            if (ajej != zga.a) {
                ajej.dispose();
            }
        }

        public boolean isDisposed() {
            return ((ajej) get()).isDisposed();
        }
    }

    /* renamed from: zga$c */
    static class c extends f {
        private final Runnable a;

        c(Runnable runnable) {
            this.a = runnable;
        }

        /* Access modifiers changed, original: protected|final */
        public final ajej a(defpackage.ajdw.c cVar, ajcz ajcz) {
            return cVar.a(new d(this.a, ajcz));
        }
    }

    public zga(ajfc<ajde<ajde<ajcx>>, ajcx> ajfc, ajdw ajdw) {
        this.d = ajdw;
        try {
            this.f = ((ajcx) ajfc.apply(this.e)).e();
        } catch (Throwable th) {
            RuntimeException a = ajur.a(th);
        }
    }

    public final c b() {
        c b = this.d.b();
        ajvq k = ajvu.l().k();
        a aVar = new a(b);
        ajde d = k.d((ajfc) aVar);
        e eVar = new e(k, b, aVar);
        this.e.a((Object) d);
        return eVar;
    }

    public void dispose() {
        this.f.dispose();
    }

    public boolean isDisposed() {
        return this.f.isDisposed();
    }
}
