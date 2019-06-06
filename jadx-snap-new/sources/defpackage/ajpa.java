package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajpa */
public final class ajpa<T, R> extends ajnp<T, R> {
    private ajfc<? super T, ? extends ajeb<? extends R>> b;
    private boolean c = false;

    /* renamed from: ajpa$a */
    static final class a<T, R> extends AtomicInteger implements ajdv<T>, ajej {
        final ajdv<? super R> a;
        final boolean b;
        final ajei c = new ajei();
        final AtomicInteger d = new AtomicInteger(1);
        final ajul e = new ajul();
        final AtomicReference<ajtb<R>> f = new AtomicReference();
        ajej g;
        private ajfc<? super T, ? extends ajeb<? extends R>> h;
        private volatile boolean i;

        /* renamed from: ajpa$a$a */
        final class a extends AtomicReference<ajej> implements ajdz<R>, ajej {
            a() {
            }

            public final void a(ajej ajej) {
                ajfp.b(this, ajej);
            }

            public final void a(Throwable th) {
                a aVar = a.this;
                aVar.c.c(this);
                if (ajur.a(aVar.e, th)) {
                    if (!aVar.b) {
                        aVar.g.dispose();
                        aVar.c.dispose();
                    }
                    aVar.d.decrementAndGet();
                    aVar.b();
                    return;
                }
                ajvo.a(th);
            }

            /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:39:0x0083 in {6, 7, 12, 16, 18, 21, 24, 26, 32, 33, 34, 38} preds:[]
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
                	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
                	at java.util.ArrayList.forEach(ArrayList.java:1257)
                	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
                	at jadx.core.ProcessClass.process(ProcessClass.java:32)
                	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
                	at jadx.api.JavaClass.decompile(JavaClass.java:62)
                	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
                */
            public final void b_(R r5) {
                /*
                r4 = this;
                r0 = defpackage.ajpa.a.this;
                r1 = r0.c;
                r1.c(r4);
                r1 = r0.get();
                if (r1 != 0) goto L_0x0051;
                r1 = 1;
                r2 = 0;
                r3 = r0.compareAndSet(r2, r1);
                if (r3 == 0) goto L_0x0051;
                r3 = r0.a;
                r3.a(r5);
                r5 = r0.d;
                r5 = r5.decrementAndGet();
                if (r5 != 0) goto L_0x0023;
                goto L_0x0024;
                r1 = 0;
                r5 = r0.f;
                r5 = r5.get();
                r5 = (defpackage.ajtb) r5;
                if (r1 == 0) goto L_0x004a;
                if (r5 == 0) goto L_0x0036;
                r5 = r5.isEmpty();
                if (r5 == 0) goto L_0x004a;
                r5 = r0.e;
                r5 = defpackage.ajur.a(r5);
                if (r5 == 0) goto L_0x0044;
                r0 = r0.a;
                r0.a(r5);
                return;
                r5 = r0.a;
                r5.a();
                return;
                r5 = r0.decrementAndGet();
                if (r5 == 0) goto L_0x007f;
                goto L_0x007c;
                r1 = r0.f;
                r1 = r1.get();
                r1 = (defpackage.ajtb) r1;
                if (r1 == 0) goto L_0x005c;
                goto L_0x006c;
                r1 = new ajtb;
                r2 = defpackage.ajde.a;
                r1.<init>(r2);
                r2 = r0.f;
                r3 = 0;
                r2 = r2.compareAndSet(r3, r1);
                if (r2 == 0) goto L_0x0051;
                monitor-enter(r1);
                r1.offer(r5);	 Catch:{ all -> 0x0080 }
                monitor-exit(r1);	 Catch:{ all -> 0x0080 }
                r5 = r0.d;
                r5.decrementAndGet();
                r5 = r0.getAndIncrement();
                if (r5 != 0) goto L_0x007f;
                r0.c();
                return;
                r5 = move-exception;
                monitor-exit(r1);	 Catch:{ all -> 0x0080 }
                throw r5;
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ajpa$a$a.b_(java.lang.Object):void");
            }

            public final void dispose() {
                ajfp.a((AtomicReference) this);
            }

            public final boolean isDisposed() {
                return ajfp.a((ajej) get());
            }
        }

        a(ajdv<? super R> ajdv, ajfc<? super T, ? extends ajeb<? extends R>> ajfc, boolean z) {
            this.a = ajdv;
            this.h = ajfc;
            this.b = z;
        }

        private void d() {
            ajtb ajtb = (ajtb) this.f.get();
            if (ajtb != null) {
                ajtb.clear();
            }
        }

        public final void a() {
            this.d.decrementAndGet();
            b();
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.g, ajej)) {
                this.g = ajej;
                this.a.a((ajej) this);
            }
        }

        public final void a(T t) {
            try {
                ajeb ajeb = (ajeb) ajfv.a(this.h.apply(t), "The mapper returned a null SingleSource");
                this.d.getAndIncrement();
                ajej aVar = new a();
                if (!this.i && this.c.a(aVar)) {
                    ajeb.a(aVar);
                }
            } catch (Throwable th) {
                ajep.a(th);
                this.g.dispose();
                a(th);
            }
        }

        public final void a(Throwable th) {
            this.d.decrementAndGet();
            if (ajur.a(this.e, th)) {
                if (!this.b) {
                    this.c.dispose();
                }
                b();
                return;
            }
            ajvo.a(th);
        }

        /* Access modifiers changed, original: final */
        public final void b() {
            if (getAndIncrement() == 0) {
                c();
            }
        }

        /* Access modifiers changed, original: final */
        public final void c() {
            ajdv ajdv = this.a;
            AtomicInteger atomicInteger = this.d;
            AtomicReference atomicReference = this.f;
            int i = 1;
            while (!this.i) {
                Throwable a;
                if (this.b || ((Throwable) this.e.get()) == null) {
                    Object obj = null;
                    Object obj2 = atomicInteger.get() == 0 ? 1 : null;
                    ajtb ajtb = (ajtb) atomicReference.get();
                    Object poll = ajtb != null ? ajtb.poll() : null;
                    if (poll == null) {
                        obj = 1;
                    }
                    if (obj2 != null && obj != null) {
                        a = ajur.a(this.e);
                        if (a != null) {
                            ajdv.a(a);
                            return;
                        } else {
                            ajdv.a();
                            return;
                        }
                    } else if (obj == null) {
                        ajdv.a(poll);
                    } else {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                } else {
                    a = ajur.a(this.e);
                    d();
                    ajdv.a(a);
                    return;
                }
            }
            d();
        }

        public final void dispose() {
            this.i = true;
            this.g.dispose();
            this.c.dispose();
        }

        public final boolean isDisposed() {
            return this.i;
        }
    }

    public ajpa(ajdt<T> ajdt, ajfc<? super T, ? extends ajeb<? extends R>> ajfc) {
        super(ajdt);
        this.b = ajfc;
    }

    public final void a_(ajdv<? super R> ajdv) {
        this.a.a(new a(ajdv, this.b, false));
    }
}
