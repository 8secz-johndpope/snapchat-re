package defpackage;

import java.util.Collection;
import java.util.concurrent.Callable;

/* renamed from: ajnv */
public final class ajnv<T, U extends Collection<? super T>, B> extends ajnp<T, U> {
    private ajdt<B> b;
    private Callable<U> c;

    /* renamed from: ajnv$b */
    static final class b<T, U extends Collection<? super T>, B> extends ajgw<T, U, U> implements ajdv<T>, ajej {
        private Callable<U> g;
        private ajdt<B> h;
        private ajej i;
        private ajej j;
        private U k;

        b(ajdv<? super U> ajdv, Callable<U> callable, ajdt<B> ajdt) {
            super(ajdv, new ajsz());
            this.g = callable;
            this.h = ajdt;
        }

        /* JADX WARNING: Missing block: B:8:0x000b, code skipped:
            r3.b.offer(r0);
            r3.d = true;
     */
        /* JADX WARNING: Missing block: B:9:0x0017, code skipped:
            if (d() == false) goto L_0x0021;
     */
        /* JADX WARNING: Missing block: B:10:0x0019, code skipped:
            defpackage.ajuz.a(r3.b, r3.a, false, (defpackage.ajej) r3, (defpackage.ajuv) r3);
     */
        /* JADX WARNING: Missing block: B:11:0x0021, code skipped:
            return;
     */
        public final void a() {
            /*
            r3 = this;
            monitor-enter(r3);
            r0 = r3.k;	 Catch:{ all -> 0x0022 }
            if (r0 != 0) goto L_0x0007;
        L_0x0005:
            monitor-exit(r3);	 Catch:{ all -> 0x0022 }
            return;
        L_0x0007:
            r1 = 0;
            r3.k = r1;	 Catch:{ all -> 0x0022 }
            monitor-exit(r3);	 Catch:{ all -> 0x0022 }
            r1 = r3.b;
            r1.offer(r0);
            r0 = 1;
            r3.d = r0;
            r0 = r3.d();
            if (r0 == 0) goto L_0x0021;
        L_0x0019:
            r0 = r3.b;
            r1 = r3.a;
            r2 = 0;
            defpackage.ajuz.a(r0, r1, r2, r3, r3);
        L_0x0021:
            return;
        L_0x0022:
            r0 = move-exception;
            monitor-exit(r3);	 Catch:{ all -> 0x0022 }
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ajnv$b.a():void");
        }

        public final /* bridge */ /* synthetic */ void a(ajdv ajdv, Object obj) {
            this.a.a((Collection) obj);
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.i, ajej)) {
                this.i = ajej;
                try {
                    this.k = (Collection) ajfv.a(this.g.call(), "The buffer supplied is null");
                    a aVar = new a(this);
                    this.j = aVar;
                    this.a.a((ajej) this);
                    if (!this.c) {
                        this.h.a(aVar);
                    }
                } catch (Throwable th) {
                    ajep.a(th);
                    this.c = true;
                    ajej.dispose();
                    ajfq.a(th, this.a);
                }
            }
        }

        public final void a(T t) {
            synchronized (this) {
                Collection collection = this.k;
                if (collection == null) {
                    return;
                }
                collection.add(t);
            }
        }

        public final void a(Throwable th) {
            dispose();
            this.a.a(th);
        }

        public final void dispose() {
            if (!this.c) {
                this.c = true;
                this.j.dispose();
                this.i.dispose();
                if (d()) {
                    this.b.clear();
                }
            }
        }

        /* Access modifiers changed, original: final */
        public final void g() {
            try {
                Collection collection = (Collection) ajfv.a(this.g.call(), "The buffer supplied is null");
                synchronized (this) {
                    Collection collection2 = this.k;
                    if (collection2 == null) {
                        return;
                    }
                    this.k = collection;
                    a((Object) collection2, (ajej) this);
                }
            } catch (Throwable th) {
                ajep.a(th);
                dispose();
                this.a.a(th);
            }
        }

        public final boolean isDisposed() {
            return this.c;
        }
    }

    /* renamed from: ajnv$a */
    static final class a<T, U extends Collection<? super T>, B> extends ajvf<B> {
        private b<T, U, B> a;

        a(b<T, U, B> bVar) {
            this.a = bVar;
        }

        public final void a() {
            this.a.a();
        }

        public final void a(B b) {
            this.a.g();
        }

        public final void a(Throwable th) {
            this.a.a(th);
        }
    }

    public ajnv(ajdt<T> ajdt, ajdt<B> ajdt2, Callable<U> callable) {
        super(ajdt);
        this.b = ajdt2;
        this.c = callable;
    }

    public final void a_(ajdv<? super U> ajdv) {
        this.a.a(new b(new ajvm(ajdv), this.c, this.b));
    }
}
