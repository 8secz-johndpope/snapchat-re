package defpackage;

import defpackage.ajdw.c;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajnw */
public final class ajnw<T, U extends Collection<? super T>> extends ajnp<T, U> {
    private long b;
    private long c;
    private TimeUnit d;
    private ajdw e;
    private Callable<U> f;
    private int g;
    private boolean h = false;

    /* renamed from: ajnw$a */
    static final class a<T, U extends Collection<? super T>> extends ajgw<T, U, U> implements ajej, Runnable {
        private Callable<U> g;
        private long h;
        private TimeUnit i;
        private int j;
        private boolean k;
        private c l;
        private U m;
        private ajej n;
        private ajej o;
        private long p;
        private long q;

        a(ajdv<? super U> ajdv, Callable<U> callable, long j, TimeUnit timeUnit, int i, boolean z, c cVar) {
            super(ajdv, new ajsz());
            this.g = callable;
            this.h = j;
            this.i = timeUnit;
            this.j = i;
            this.k = z;
            this.l = cVar;
        }

        public final void a() {
            Collection collection;
            this.l.dispose();
            synchronized (this) {
                collection = this.m;
                this.m = null;
            }
            this.b.offer(collection);
            this.d = true;
            if (d()) {
                ajuz.a(this.b, this.a, false, (ajej) this, (ajuv) this);
            }
        }

        public final /* bridge */ /* synthetic */ void a(ajdv ajdv, Object obj) {
            ajdv.a((Collection) obj);
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.o, ajej)) {
                this.o = ajej;
                try {
                    this.m = (Collection) ajfv.a(this.g.call(), "The buffer supplied is null");
                    this.a.a((ajej) this);
                    c cVar = this.l;
                    long j = this.h;
                    this.n = cVar.a(this, j, j, this.i);
                } catch (Throwable th) {
                    ajep.a(th);
                    ajej.dispose();
                    ajfq.a(th, this.a);
                    this.l.dispose();
                }
            }
        }

        /* JADX WARNING: Missing block: B:13:0x0021, code skipped:
            if (r7.k == false) goto L_0x0028;
     */
        /* JADX WARNING: Missing block: B:14:0x0023, code skipped:
            r7.n.dispose();
     */
        /* JADX WARNING: Missing block: B:15:0x0028, code skipped:
            b(r0, r7);
     */
        /* JADX WARNING: Missing block: B:17:?, code skipped:
            r8 = (java.util.Collection) defpackage.ajfv.a(r7.g.call(), "The buffer supplied is null");
     */
        /* JADX WARNING: Missing block: B:18:0x0039, code skipped:
            monitor-enter(r7);
     */
        /* JADX WARNING: Missing block: B:20:?, code skipped:
            r7.m = r8;
            r7.q++;
     */
        /* JADX WARNING: Missing block: B:21:0x0041, code skipped:
            monitor-exit(r7);
     */
        /* JADX WARNING: Missing block: B:23:0x0044, code skipped:
            if (r7.k == false) goto L_0x0054;
     */
        /* JADX WARNING: Missing block: B:24:0x0046, code skipped:
            r0 = r7.l;
            r4 = r7.h;
            r7.n = r0.a(r7, r4, r4, r7.i);
     */
        /* JADX WARNING: Missing block: B:25:0x0054, code skipped:
            return;
     */
        /* JADX WARNING: Missing block: B:30:0x0058, code skipped:
            r8 = move-exception;
     */
        /* JADX WARNING: Missing block: B:31:0x0059, code skipped:
            defpackage.ajep.a(r8);
            r7.a.a(r8);
            dispose();
     */
        /* JADX WARNING: Missing block: B:32:0x0064, code skipped:
            return;
     */
        public final void a(T r8) {
            /*
            r7 = this;
            monitor-enter(r7);
            r0 = r7.m;	 Catch:{ all -> 0x0065 }
            if (r0 != 0) goto L_0x0007;
        L_0x0005:
            monitor-exit(r7);	 Catch:{ all -> 0x0065 }
            return;
        L_0x0007:
            r0.add(r8);	 Catch:{ all -> 0x0065 }
            r8 = r0.size();	 Catch:{ all -> 0x0065 }
            r1 = r7.j;	 Catch:{ all -> 0x0065 }
            if (r8 >= r1) goto L_0x0014;
        L_0x0012:
            monitor-exit(r7);	 Catch:{ all -> 0x0065 }
            return;
        L_0x0014:
            r8 = 0;
            r7.m = r8;	 Catch:{ all -> 0x0065 }
            r1 = r7.p;	 Catch:{ all -> 0x0065 }
            r3 = 1;
            r1 = r1 + r3;
            r7.p = r1;	 Catch:{ all -> 0x0065 }
            monitor-exit(r7);	 Catch:{ all -> 0x0065 }
            r8 = r7.k;
            if (r8 == 0) goto L_0x0028;
        L_0x0023:
            r8 = r7.n;
            r8.dispose();
        L_0x0028:
            r7.b(r0, r7);
            r8 = r7.g;	 Catch:{ Throwable -> 0x0058 }
            r8 = r8.call();	 Catch:{ Throwable -> 0x0058 }
            r0 = "The buffer supplied is null";
            r8 = defpackage.ajfv.a(r8, r0);	 Catch:{ Throwable -> 0x0058 }
            r8 = (java.util.Collection) r8;	 Catch:{ Throwable -> 0x0058 }
            monitor-enter(r7);
            r7.m = r8;	 Catch:{ all -> 0x0055 }
            r0 = r7.q;	 Catch:{ all -> 0x0055 }
            r0 = r0 + r3;
            r7.q = r0;	 Catch:{ all -> 0x0055 }
            monitor-exit(r7);	 Catch:{ all -> 0x0055 }
            r8 = r7.k;
            if (r8 == 0) goto L_0x0054;
        L_0x0046:
            r0 = r7.l;
            r4 = r7.h;
            r6 = r7.i;
            r1 = r7;
            r2 = r4;
            r8 = r0.a(r1, r2, r4, r6);
            r7.n = r8;
        L_0x0054:
            return;
        L_0x0055:
            r8 = move-exception;
            monitor-exit(r7);	 Catch:{ all -> 0x0055 }
            throw r8;
        L_0x0058:
            r8 = move-exception;
            defpackage.ajep.a(r8);
            r0 = r7.a;
            r0.a(r8);
            r7.dispose();
            return;
        L_0x0065:
            r8 = move-exception;
            monitor-exit(r7);	 Catch:{ all -> 0x0065 }
            throw r8;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ajnw$a.a(java.lang.Object):void");
        }

        public final void a(Throwable th) {
            synchronized (this) {
                this.m = null;
            }
            this.a.a(th);
            this.l.dispose();
        }

        public final void dispose() {
            if (!this.c) {
                this.c = true;
                this.o.dispose();
                this.l.dispose();
                synchronized (this) {
                    this.m = null;
                }
            }
        }

        public final boolean isDisposed() {
            return this.c;
        }

        public final void run() {
            try {
                Collection collection = (Collection) ajfv.a(this.g.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    Collection collection2 = this.m;
                    if (collection2 != null) {
                        if (this.p == this.q) {
                            this.m = collection;
                            b(collection2, this);
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                ajep.a(th);
                dispose();
                this.a.a(th);
            }
        }
    }

    /* renamed from: ajnw$b */
    static final class b<T, U extends Collection<? super T>> extends ajgw<T, U, U> implements ajej, Runnable {
        private Callable<U> g;
        private long h;
        private TimeUnit i;
        private ajdw j;
        private ajej k;
        private U l;
        private AtomicReference<ajej> m = new AtomicReference();

        b(ajdv<? super U> ajdv, Callable<U> callable, long j, TimeUnit timeUnit, ajdw ajdw) {
            super(ajdv, new ajsz());
            this.g = callable;
            this.h = j;
            this.i = timeUnit;
            this.j = ajdw;
        }

        public final void a() {
            Collection collection;
            synchronized (this) {
                collection = this.l;
                this.l = null;
            }
            if (collection != null) {
                this.b.offer(collection);
                this.d = true;
                if (d()) {
                    ajuz.a(this.b, this.a, false, null, (ajuv) this);
                }
            }
            ajfp.a(this.m);
        }

        public final /* bridge */ /* synthetic */ void a(ajdv ajdv, Object obj) {
            this.a.a((Collection) obj);
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.k, ajej)) {
                this.k = ajej;
                try {
                    this.l = (Collection) ajfv.a(this.g.call(), "The buffer supplied is null");
                    this.a.a((ajej) this);
                    if (!this.c) {
                        ajdw ajdw = this.j;
                        long j = this.h;
                        ajej = ajdw.a(this, j, j, this.i);
                        if (!this.m.compareAndSet(null, ajej)) {
                            ajej.dispose();
                        }
                    }
                } catch (Throwable th) {
                    ajep.a(th);
                    dispose();
                    ajfq.a(th, this.a);
                }
            }
        }

        public final void a(T t) {
            synchronized (this) {
                Collection collection = this.l;
                if (collection == null) {
                    return;
                }
                collection.add(t);
            }
        }

        public final void a(Throwable th) {
            synchronized (this) {
                this.l = null;
            }
            this.a.a(th);
            ajfp.a(this.m);
        }

        public final void dispose() {
            ajfp.a(this.m);
            this.k.dispose();
        }

        public final boolean isDisposed() {
            return this.m.get() == ajfp.DISPOSED;
        }

        public final void run() {
            try {
                Collection collection;
                Collection collection2 = (Collection) ajfv.a(this.g.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    collection = this.l;
                    if (collection != null) {
                        this.l = collection2;
                    }
                }
                if (collection == null) {
                    ajfp.a(this.m);
                } else {
                    a((Object) collection, (ajej) this);
                }
            } catch (Throwable th) {
                ajep.a(th);
                this.a.a(th);
                dispose();
            }
        }
    }

    /* renamed from: ajnw$c */
    static final class c<T, U extends Collection<? super T>> extends ajgw<T, U, U> implements ajej, Runnable {
        final defpackage.ajdw.c g;
        final List<U> h = new LinkedList();
        private Callable<U> i;
        private long j;
        private long k;
        private TimeUnit l;
        private ajej m;

        /* renamed from: ajnw$c$a */
        final class a implements Runnable {
            private final U a;

            a(U u) {
                this.a = u;
            }

            public final void run() {
                synchronized (c.this) {
                    c.this.h.remove(this.a);
                }
                c cVar = c.this;
                cVar.b(this.a, cVar.g);
            }
        }

        /* renamed from: ajnw$c$b */
        final class b implements Runnable {
            private final U a;

            b(U u) {
                this.a = u;
            }

            public final void run() {
                synchronized (c.this) {
                    c.this.h.remove(this.a);
                }
                c cVar = c.this;
                cVar.b(this.a, cVar.g);
            }
        }

        c(ajdv<? super U> ajdv, Callable<U> callable, long j, long j2, TimeUnit timeUnit, defpackage.ajdw.c cVar) {
            super(ajdv, new ajsz());
            this.i = callable;
            this.j = j;
            this.k = j2;
            this.l = timeUnit;
            this.g = cVar;
        }

        private void g() {
            synchronized (this) {
                this.h.clear();
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x003b in {7, 10, 11, 15} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final void a() {
            /*
            r4 = this;
            monitor-enter(r4);
            r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0038 }
            r1 = r4.h;	 Catch:{ all -> 0x0038 }
            r0.<init>(r1);	 Catch:{ all -> 0x0038 }
            r1 = r4.h;	 Catch:{ all -> 0x0038 }
            r1.clear();	 Catch:{ all -> 0x0038 }
            monitor-exit(r4);	 Catch:{ all -> 0x0038 }
            r0 = r0.iterator();
            r1 = r0.hasNext();
            if (r1 == 0) goto L_0x0024;
            r1 = r0.next();
            r1 = (java.util.Collection) r1;
            r2 = r4.b;
            r2.offer(r1);
            goto L_0x0012;
            r0 = 1;
            r4.d = r0;
            r0 = r4.d();
            if (r0 == 0) goto L_0x0037;
            r0 = r4.b;
            r1 = r4.a;
            r2 = 0;
            r3 = r4.g;
            defpackage.ajuz.a(r0, r1, r2, r3, r4);
            return;
            r0 = move-exception;
            monitor-exit(r4);	 Catch:{ all -> 0x0038 }
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ajnw$c.a():void");
        }

        public final /* bridge */ /* synthetic */ void a(ajdv ajdv, Object obj) {
            ajdv.a((Collection) obj);
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.m, ajej)) {
                this.m = ajej;
                try {
                    Collection collection = (Collection) ajfv.a(this.i.call(), "The buffer supplied is null");
                    this.h.add(collection);
                    this.a.a((ajej) this);
                    defpackage.ajdw.c cVar = this.g;
                    long j = this.k;
                    cVar.a(this, j, j, this.l);
                    this.g.a(new b(collection), this.j, this.l);
                } catch (Throwable th) {
                    ajep.a(th);
                    ajej.dispose();
                    ajfq.a(th, this.a);
                    this.g.dispose();
                }
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x001c in {5, 7, 10} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final void a(T r3) {
            /*
            r2 = this;
            monitor-enter(r2);
            r0 = r2.h;	 Catch:{ all -> 0x0019 }
            r0 = r0.iterator();	 Catch:{ all -> 0x0019 }
            r1 = r0.hasNext();	 Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x0017;	 Catch:{ all -> 0x0019 }
            r1 = r0.next();	 Catch:{ all -> 0x0019 }
            r1 = (java.util.Collection) r1;	 Catch:{ all -> 0x0019 }
            r1.add(r3);	 Catch:{ all -> 0x0019 }
            goto L_0x0007;	 Catch:{ all -> 0x0019 }
            monitor-exit(r2);	 Catch:{ all -> 0x0019 }
            return;	 Catch:{ all -> 0x0019 }
            r3 = move-exception;	 Catch:{ all -> 0x0019 }
            monitor-exit(r2);	 Catch:{ all -> 0x0019 }
            throw r3;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ajnw$c.a(java.lang.Object):void");
        }

        public final void a(Throwable th) {
            this.d = true;
            g();
            this.a.a(th);
            this.g.dispose();
        }

        public final void dispose() {
            if (!this.c) {
                this.c = true;
                g();
                this.m.dispose();
                this.g.dispose();
            }
        }

        public final boolean isDisposed() {
            return this.c;
        }

        public final void run() {
            if (!this.c) {
                try {
                    Collection collection = (Collection) ajfv.a(this.i.call(), "The bufferSupplier returned a null buffer");
                    synchronized (this) {
                        if (this.c) {
                            return;
                        }
                        this.h.add(collection);
                        this.g.a(new a(collection), this.j, this.l);
                    }
                } catch (Throwable th) {
                    ajep.a(th);
                    this.a.a(th);
                    dispose();
                }
            }
        }
    }

    public ajnw(ajdt<T> ajdt, long j, long j2, TimeUnit timeUnit, ajdw ajdw, Callable<U> callable, int i) {
        super(ajdt);
        this.b = j;
        this.c = j2;
        this.d = timeUnit;
        this.e = ajdw;
        this.f = callable;
        this.g = i;
    }

    public final void a_(ajdv<? super U> ajdv) {
        if (this.b == this.c && this.g == Integer.MAX_VALUE) {
            this.a.a(new b(new ajvm(ajdv), this.f, this.b, this.d, this.e));
            return;
        }
        c b = this.e.b();
        if (this.b == this.c) {
            this.a.a(new a(new ajvm(ajdv), this.f, this.b, this.d, this.g, false, b));
        } else {
            this.a.a(new c(new ajvm(ajdv), this.f, this.b, this.c, this.d, b));
        }
    }
}
