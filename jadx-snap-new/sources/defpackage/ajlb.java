package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajlb */
public final class ajlb<T, R> extends ajim<T, R> {
    private ajfc<? super T, ? extends akuw<? extends R>> c;
    private int d;
    private boolean e = false;

    /* renamed from: ajlb$a */
    static final class a<T, R> extends AtomicReference<akuy> implements ajdh<R> {
        volatile ajgf<R> a;
        volatile boolean b;
        private b<T, R> c;
        private long d;
        private int e;
        private int f;

        a(b<T, R> bVar, long j, int i) {
            this.c = bVar;
            this.d = j;
            this.e = i;
        }

        public final void a() {
            b bVar = this.c;
            if (this.d == bVar.d) {
                this.b = true;
                bVar.c();
            }
        }

        public final void a(akuy akuy) {
            if (ajui.a((AtomicReference) this, akuy)) {
                if (akuy instanceof ajgc) {
                    ajgc ajgc = (ajgc) akuy;
                    int a = ajgc.a(7);
                    if (a == 1) {
                        this.f = a;
                        this.a = ajgc;
                        this.b = true;
                        this.c.c();
                        return;
                    } else if (a == 2) {
                        this.f = a;
                        this.a = ajgc;
                        akuy.a((long) this.e);
                        return;
                    }
                }
                this.a = new ajta(this.e);
                akuy.a((long) this.e);
            }
        }

        public final void a(R r) {
            b bVar = this.c;
            if (this.d == bVar.d) {
                if (this.f != 0 || this.a.offer(r)) {
                    bVar.c();
                } else {
                    a(new ajeq("Queue full?!"));
                }
            }
        }

        public final void a(Throwable th) {
            b bVar = this.c;
            if (this.d == bVar.d && ajur.a(bVar.b, th)) {
                if (!bVar.a) {
                    bVar.c.b();
                }
                this.b = true;
                bVar.c();
                return;
            }
            ajvo.a(th);
        }
    }

    /* renamed from: ajlb$b */
    static final class b<T, R> extends AtomicInteger implements ajdh<T>, akuy {
        private static a<Object, Object> l;
        final boolean a;
        final ajul b;
        akuy c;
        volatile long d;
        private akux<? super R> e;
        private ajfc<? super T, ? extends akuw<? extends R>> f;
        private int g;
        private volatile boolean h;
        private volatile boolean i;
        private AtomicReference<a<T, R>> j = new AtomicReference();
        private AtomicLong k = new AtomicLong();

        static {
            AtomicReference aVar = new a(null, -1, 1);
            l = aVar;
            ajui.a(aVar);
        }

        b(akux<? super R> akux, ajfc<? super T, ? extends akuw<? extends R>> ajfc, int i, boolean z) {
            this.e = akux;
            this.f = ajfc;
            this.g = i;
            this.a = z;
            this.b = new ajul();
        }

        private void d() {
            a aVar = (a) this.j.get();
            a aVar2 = l;
            if (aVar != aVar2) {
                AtomicReference atomicReference = (a) this.j.getAndSet(aVar2);
                if (atomicReference != l && atomicReference != null) {
                    ajui.a(atomicReference);
                }
            }
        }

        public final void a() {
            if (!this.h) {
                this.h = true;
                c();
            }
        }

        public final void a(long j) {
            if (ajui.b(j)) {
                ajum.a(this.k, j);
                if (this.d == 0) {
                    this.c.a(Long.MAX_VALUE);
                    return;
                }
                c();
            }
        }

        public final void a(akuy akuy) {
            if (ajui.a(this.c, akuy)) {
                this.c = akuy;
                this.e.a((akuy) this);
            }
        }

        public final void a(T t) {
            if (!this.h) {
                long j = this.d + 1;
                this.d = j;
                AtomicReference atomicReference = (a) this.j.get();
                if (atomicReference != null) {
                    ajui.a(atomicReference);
                }
                try {
                    akuw akuw = (akuw) ajfv.a(this.f.apply(t), "The publisher returned is null");
                    a aVar = new a(this, j, this.g);
                    a aVar2;
                    do {
                        aVar2 = (a) this.j.get();
                        if (aVar2 == l) {
                            break;
                        }
                    } while (!this.j.compareAndSet(aVar2, aVar));
                    akuw.a(aVar);
                } catch (Throwable th) {
                    ajep.a(th);
                    this.c.b();
                    a(th);
                }
            }
        }

        public final void a(Throwable th) {
            if (this.h || !ajur.a(this.b, th)) {
                ajvo.a(th);
                return;
            }
            if (!this.a) {
                d();
            }
            this.h = true;
            c();
        }

        public final void b() {
            if (!this.i) {
                this.i = true;
                this.c.b();
                d();
            }
        }

        /* Access modifiers changed, original: final */
        /* JADX WARNING: Missing block: B:42:0x0097, code skipped:
            if (r7.isEmpty() != false) goto L_0x00a0;
     */
        /* JADX WARNING: Missing block: B:44:0x009e, code skipped:
            if (r7.isEmpty() != false) goto L_0x00a0;
     */
        public final void c() {
            /*
            r17 = this;
            r1 = r17;
            r0 = r17.getAndIncrement();
            if (r0 == 0) goto L_0x0009;
        L_0x0008:
            return;
        L_0x0009:
            r2 = r1.e;
            r4 = 1;
        L_0x000c:
            r0 = r1.i;
            r5 = 0;
            if (r0 == 0) goto L_0x0017;
        L_0x0011:
            r0 = r1.j;
            r0.lazySet(r5);
            return;
        L_0x0017:
            r0 = r1.h;
            if (r0 == 0) goto L_0x0062;
        L_0x001b:
            r0 = r1.a;
            if (r0 == 0) goto L_0x003f;
        L_0x001f:
            r0 = r1.j;
            r0 = r0.get();
            if (r0 != 0) goto L_0x0062;
        L_0x0027:
            r0 = r1.b;
            r0 = r0.get();
            r0 = (java.lang.Throwable) r0;
            if (r0 == 0) goto L_0x003b;
        L_0x0031:
            r0 = r1.b;
            r0 = defpackage.ajur.a(r0);
            r2.a(r0);
            return;
        L_0x003b:
            r2.a();
            return;
        L_0x003f:
            r0 = r1.b;
            r0 = r0.get();
            r0 = (java.lang.Throwable) r0;
            if (r0 == 0) goto L_0x0056;
        L_0x0049:
            r17.d();
            r0 = r1.b;
            r0 = defpackage.ajur.a(r0);
            r2.a(r0);
            return;
        L_0x0056:
            r0 = r1.j;
            r0 = r0.get();
            if (r0 != 0) goto L_0x0062;
        L_0x005e:
            r2.a();
            return;
        L_0x0062:
            r0 = r1.j;
            r0 = r0.get();
            r6 = r0;
            r6 = (defpackage.ajlb.a) r6;
            if (r6 == 0) goto L_0x0071;
        L_0x006d:
            r0 = r6.a;
            r7 = r0;
            goto L_0x0072;
        L_0x0071:
            r7 = r5;
        L_0x0072:
            if (r7 == 0) goto L_0x0131;
        L_0x0074:
            r0 = r6.b;
            if (r0 == 0) goto L_0x00a7;
        L_0x0078:
            r0 = r1.a;
            if (r0 != 0) goto L_0x009a;
        L_0x007c:
            r0 = r1.b;
            r0 = r0.get();
            r0 = (java.lang.Throwable) r0;
            if (r0 == 0) goto L_0x0093;
        L_0x0086:
            r17.d();
            r0 = r1.b;
            r0 = defpackage.ajur.a(r0);
            r2.a(r0);
            return;
        L_0x0093:
            r0 = r7.isEmpty();
            if (r0 == 0) goto L_0x00a7;
        L_0x0099:
            goto L_0x00a0;
        L_0x009a:
            r0 = r7.isEmpty();
            if (r0 == 0) goto L_0x00a7;
        L_0x00a0:
            r0 = r1.j;
            r0.compareAndSet(r6, r5);
            goto L_0x000c;
        L_0x00a7:
            r0 = r1.k;
            r8 = r0.get();
            r10 = 0;
            r12 = r10;
        L_0x00b0:
            r14 = 0;
            r0 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1));
            if (r0 == 0) goto L_0x010f;
        L_0x00b5:
            r0 = r1.i;
            if (r0 == 0) goto L_0x00ba;
        L_0x00b9:
            return;
        L_0x00ba:
            r0 = r6.b;
            r15 = r7.poll();	 Catch:{ Throwable -> 0x00c1 }
            goto L_0x00d0;
        L_0x00c1:
            r0 = move-exception;
            r15 = r0;
            defpackage.ajep.a(r15);
            defpackage.ajui.a(r6);
            r0 = r1.b;
            defpackage.ajur.a(r0, r15);
            r15 = r5;
            r0 = 1;
        L_0x00d0:
            if (r15 != 0) goto L_0x00d5;
        L_0x00d2:
            r16 = 1;
            goto L_0x00d7;
        L_0x00d5:
            r16 = 0;
        L_0x00d7:
            r3 = r1.j;
            r3 = r3.get();
            if (r6 == r3) goto L_0x00e1;
        L_0x00df:
            r14 = 1;
            goto L_0x010f;
        L_0x00e1:
            if (r0 == 0) goto L_0x0106;
        L_0x00e3:
            r0 = r1.a;
            if (r0 != 0) goto L_0x00fe;
        L_0x00e7:
            r0 = r1.b;
            r0 = r0.get();
            r0 = (java.lang.Throwable) r0;
            if (r0 == 0) goto L_0x00fb;
        L_0x00f1:
            r0 = r1.b;
            r0 = defpackage.ajur.a(r0);
            r2.a(r0);
            return;
        L_0x00fb:
            if (r16 == 0) goto L_0x0106;
        L_0x00fd:
            goto L_0x0100;
        L_0x00fe:
            if (r16 == 0) goto L_0x0106;
        L_0x0100:
            r0 = r1.j;
            r0.compareAndSet(r6, r5);
            goto L_0x00df;
        L_0x0106:
            if (r16 != 0) goto L_0x010f;
        L_0x0108:
            r2.a(r15);
            r14 = 1;
            r12 = r12 + r14;
            goto L_0x00b0;
        L_0x010f:
            r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1));
            if (r0 == 0) goto L_0x012f;
        L_0x0113:
            r0 = r1.i;
            if (r0 != 0) goto L_0x012f;
        L_0x0117:
            r10 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
            r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
            if (r0 == 0) goto L_0x0126;
        L_0x0120:
            r0 = r1.k;
            r7 = -r12;
            r0.addAndGet(r7);
        L_0x0126:
            r0 = r6.get();
            r0 = (defpackage.akuy) r0;
            r0.a(r12);
        L_0x012f:
            if (r14 != 0) goto L_0x000c;
        L_0x0131:
            r0 = -r4;
            r4 = r1.addAndGet(r0);
            if (r4 != 0) goto L_0x000c;
        L_0x0138:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ajlb$b.c():void");
        }
    }

    public ajlb(ajde<T> ajde, ajfc<? super T, ? extends akuw<? extends R>> ajfc, int i) {
        super(ajde);
        this.c = ajfc;
        this.d = i;
    }

    public final void a_(akux<? super R> akux) {
        if (!ajkv.a(this.b, akux, this.c)) {
            this.b.a(new b(akux, this.c, this.d, false));
        }
    }
}
