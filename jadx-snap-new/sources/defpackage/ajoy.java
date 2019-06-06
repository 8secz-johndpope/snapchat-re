package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajoy */
public final class ajoy<T> extends ajcx implements ajfz<T> {
    private ajdt<T> a;
    private ajfc<? super T, ? extends ajdb> b;
    private boolean c;

    /* renamed from: ajoy$a */
    static final class a<T> extends AtomicInteger implements ajdv<T>, ajej {
        private ajcz a;
        private ajul b = new ajul();
        private ajfc<? super T, ? extends ajdb> c;
        private boolean d;
        private ajei e = new ajei();
        private ajej f;
        private volatile boolean g;

        /* renamed from: ajoy$a$a */
        final class a extends AtomicReference<ajej> implements ajcz, ajej {
            a() {
            }

            public final void a() {
                a.this.a(this);
            }

            public final void a(ajej ajej) {
                ajfp.b(this, ajej);
            }

            public final void a(Throwable th) {
                a.this.a(this, th);
            }

            public final void dispose() {
                ajfp.a((AtomicReference) this);
            }

            public final boolean isDisposed() {
                return ajfp.a((ajej) get());
            }
        }

        a(ajcz ajcz, ajfc<? super T, ? extends ajdb> ajfc, boolean z) {
            this.a = ajcz;
            this.c = ajfc;
            this.d = z;
            lazySet(1);
        }

        public final void a() {
            if (decrementAndGet() == 0) {
                Throwable a = ajur.a(this.b);
                if (a != null) {
                    this.a.a(a);
                    return;
                }
                this.a.a();
            }
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.f, ajej)) {
                this.f = ajej;
                this.a.a((ajej) this);
            }
        }

        /* Access modifiers changed, original: final */
        public final void a(a aVar) {
            this.e.c(aVar);
            a();
        }

        /* Access modifiers changed, original: final */
        public final void a(a aVar, Throwable th) {
            this.e.c(aVar);
            a(th);
        }

        public final void a(T t) {
            try {
                ajdb ajdb = (ajdb) ajfv.a(this.c.apply(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                ajej aVar = new a();
                if (!this.g && this.e.a(aVar)) {
                    ajdb.a(aVar);
                }
            } catch (Throwable th) {
                ajep.a(th);
                this.f.dispose();
                a(th);
            }
        }

        /* JADX WARNING: Missing block: B:5:0x0010, code skipped:
            if (decrementAndGet() == 0) goto L_0x0012;
     */
        /* JADX WARNING: Missing block: B:9:0x0026, code skipped:
            if (getAndSet(0) > 0) goto L_0x0012;
     */
        public final void a(java.lang.Throwable r2) {
            /*
            r1 = this;
            r0 = r1.b;
            r0 = defpackage.ajur.a(r0, r2);
            if (r0 == 0) goto L_0x0029;
        L_0x0008:
            r2 = r1.d;
            if (r2 == 0) goto L_0x001e;
        L_0x000c:
            r2 = r1.decrementAndGet();
            if (r2 != 0) goto L_0x002c;
        L_0x0012:
            r2 = r1.b;
            r2 = defpackage.ajur.a(r2);
            r0 = r1.a;
            r0.a(r2);
            return;
        L_0x001e:
            r1.dispose();
            r2 = 0;
            r2 = r1.getAndSet(r2);
            if (r2 <= 0) goto L_0x002c;
        L_0x0028:
            goto L_0x0012;
        L_0x0029:
            defpackage.ajvo.a(r2);
        L_0x002c:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ajoy$a.a(java.lang.Throwable):void");
        }

        public final void dispose() {
            this.g = true;
            this.f.dispose();
            this.e.dispose();
        }

        public final boolean isDisposed() {
            return this.f.isDisposed();
        }
    }

    public ajoy(ajdt<T> ajdt, ajfc<? super T, ? extends ajdb> ajfc, boolean z) {
        this.a = ajdt;
        this.b = ajfc;
        this.c = z;
    }

    public final ajdp<T> ap_() {
        return ajvo.a(new ajox(this.a, this.b, this.c));
    }

    public final void b(ajcz ajcz) {
        this.a.a(new a(ajcz, this.b, this.c));
    }
}
