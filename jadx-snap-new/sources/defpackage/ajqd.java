package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajqd */
public final class ajqd<T> extends ajdp<T> {
    final ajva<T> a;
    final long b;
    final TimeUnit c;
    final ajdw d;
    a e;
    private int f;

    /* renamed from: ajqd$b */
    static final class b<T> extends AtomicBoolean implements ajdv<T>, ajej {
        private ajdv<? super T> a;
        private ajqd<T> b;
        private a c;
        private ajej d;

        b(ajdv<? super T> ajdv, ajqd<T> ajqd, a aVar) {
            this.a = ajdv;
            this.b = ajqd;
            this.c = aVar;
        }

        public final void a() {
            if (compareAndSet(false, true)) {
                this.b.a(this.c);
                this.a.a();
            }
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.d, ajej)) {
                this.d = ajej;
                this.a.a((ajej) this);
            }
        }

        public final void a(T t) {
            this.a.a((Object) t);
        }

        public final void a(Throwable th) {
            if (compareAndSet(false, true)) {
                this.b.a(this.c);
                this.a.a(th);
                return;
            }
            ajvo.a(th);
        }

        /* JADX WARNING: Missing block: B:22:0x0040, code skipped:
            defpackage.ajfp.c(r2, r0.d.a(r1, r0.b, r0.c));
     */
        /* JADX WARNING: Missing block: B:27:0x0051, code skipped:
            return;
     */
        public final void dispose() {
            /*
            r7 = this;
            r0 = r7.d;
            r0.dispose();
            r0 = 0;
            r1 = 1;
            r0 = r7.compareAndSet(r0, r1);
            if (r0 == 0) goto L_0x0055;
        L_0x000d:
            r0 = r7.b;
            r1 = r7.c;
            monitor-enter(r0);
            r2 = r0.e;	 Catch:{ all -> 0x0052 }
            if (r2 == 0) goto L_0x0050;
        L_0x0016:
            r2 = r0.e;	 Catch:{ all -> 0x0052 }
            if (r2 == r1) goto L_0x001b;
        L_0x001a:
            goto L_0x0050;
        L_0x001b:
            r2 = r1.b;	 Catch:{ all -> 0x0052 }
            r4 = 1;
            r2 = r2 - r4;
            r1.b = r2;	 Catch:{ all -> 0x0052 }
            r4 = 0;
            r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
            if (r6 != 0) goto L_0x004e;
        L_0x0028:
            r2 = r1.c;	 Catch:{ all -> 0x0052 }
            if (r2 != 0) goto L_0x002d;
        L_0x002c:
            goto L_0x004e;
        L_0x002d:
            r2 = r0.b;	 Catch:{ all -> 0x0052 }
            r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
            if (r6 != 0) goto L_0x0038;
        L_0x0033:
            r0.b(r1);	 Catch:{ all -> 0x0052 }
            monitor-exit(r0);	 Catch:{ all -> 0x0052 }
            return;
        L_0x0038:
            r2 = new ajft;	 Catch:{ all -> 0x0052 }
            r2.<init>();	 Catch:{ all -> 0x0052 }
            r1.a = r2;	 Catch:{ all -> 0x0052 }
            monitor-exit(r0);	 Catch:{ all -> 0x0052 }
            r3 = r0.d;
            r4 = r0.b;
            r0 = r0.c;
            r0 = r3.a(r1, r4, r0);
            defpackage.ajfp.c(r2, r0);
            goto L_0x0055;
        L_0x004e:
            monitor-exit(r0);	 Catch:{ all -> 0x0052 }
            return;
        L_0x0050:
            monitor-exit(r0);	 Catch:{ all -> 0x0052 }
            return;
        L_0x0052:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x0052 }
            throw r1;
        L_0x0055:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ajqd$b.dispose():void");
        }

        public final boolean isDisposed() {
            return this.d.isDisposed();
        }
    }

    /* renamed from: ajqd$a */
    static final class a extends AtomicReference<ajej> implements ajfb<ajej>, Runnable {
        ajej a;
        long b;
        boolean c;
        boolean d;
        private ajqd<?> e;

        a(ajqd<?> ajqd) {
            this.e = ajqd;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajej ajej = (ajej) obj;
            ajfp.c(this, ajej);
            synchronized (this.e) {
                if (this.d) {
                    ((ajfs) this.e.a).a(ajej);
                }
            }
        }

        public final void run() {
            this.e.b(this);
        }
    }

    public ajqd(ajva<T> ajva) {
        this(ajva, 0, TimeUnit.NANOSECONDS, ajwh.d);
    }

    public ajqd(ajva<T> ajva, long j, TimeUnit timeUnit, ajdw ajdw) {
        this.a = ajva;
        this.f = 1;
        this.b = j;
        this.c = timeUnit;
        this.d = ajdw;
    }

    /* Access modifiers changed, original: final */
    public final void a(a aVar) {
        synchronized (this) {
            if (this.e != null && this.e == aVar) {
                this.e = null;
                if (aVar.a != null) {
                    aVar.a.dispose();
                }
            }
            long j = aVar.b - 1;
            aVar.b = j;
            if (j == 0) {
                if (this.a instanceof ajej) {
                    ((ajej) this.a).dispose();
                } else if (this.a instanceof ajfs) {
                    ((ajfs) this.a).a((ajej) aVar.get());
                }
            }
        }
    }

    public final void a_(ajdv<? super T> ajdv) {
        a aVar;
        boolean z;
        synchronized (this) {
            aVar = this.e;
            if (aVar == null) {
                aVar = new a(this);
                this.e = aVar;
            }
            long j = aVar.b;
            if (j == 0 && aVar.a != null) {
                aVar.a.dispose();
            }
            j++;
            aVar.b = j;
            z = true;
            if (aVar.c || j != ((long) this.f)) {
                z = false;
            } else {
                aVar.c = true;
            }
        }
        this.a.a((ajdv) new b(ajdv, this, aVar));
        if (z) {
            this.a.a(aVar);
        }
    }

    /* Access modifiers changed, original: final */
    public final void b(a aVar) {
        synchronized (this) {
            if (aVar.b == 0 && aVar == this.e) {
                this.e = null;
                ajej ajej = (ajej) aVar.get();
                ajfp.a((AtomicReference) aVar);
                if (this.a instanceof ajej) {
                    ((ajej) this.a).dispose();
                } else if (this.a instanceof ajfs) {
                    if (ajej == null) {
                        aVar.d = true;
                    } else {
                        ((ajfs) this.a).a(ajej);
                    }
                }
            }
        }
    }
}
