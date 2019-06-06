package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Supplier;
import defpackage.aiuk.a;
import defpackage.aivl.d;
import defpackage.aivl.e;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: aiwn */
public final class aiwn {
    static final Logger a = Logger.getLogger(aiwn.class.getName());
    static final b b = new b();
    final ajbr c;
    final ajbh d;
    final Supplier<Stopwatch> e;
    final e<ajbn> f;
    final boolean g;

    /* renamed from: aiwn$b */
    static final class b extends aiuk {
        private static final AtomicLongFieldUpdater<b> g;
        private static final AtomicLongFieldUpdater<b> h;
        private static final AtomicLongFieldUpdater<b> i;
        private static final AtomicLongFieldUpdater<b> j;
        private static final AtomicLongFieldUpdater<b> k;
        private static final AtomicLongFieldUpdater<b> l;
        volatile long a;
        volatile long b;
        volatile long c;
        volatile long d;
        volatile long e;
        volatile long f;

        static {
            AtomicLongFieldUpdater newUpdater;
            AtomicLongFieldUpdater newUpdater2;
            AtomicLongFieldUpdater newUpdater3;
            AtomicLongFieldUpdater newUpdater4;
            AtomicLongFieldUpdater newUpdater5;
            AtomicLongFieldUpdater atomicLongFieldUpdater = null;
            try {
                newUpdater = AtomicLongFieldUpdater.newUpdater(b.class, "a");
                newUpdater2 = AtomicLongFieldUpdater.newUpdater(b.class, "b");
                newUpdater3 = AtomicLongFieldUpdater.newUpdater(b.class, "c");
                newUpdater4 = AtomicLongFieldUpdater.newUpdater(b.class, "d");
                newUpdater5 = AtomicLongFieldUpdater.newUpdater(b.class, "e");
                atomicLongFieldUpdater = AtomicLongFieldUpdater.newUpdater(b.class, "f");
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = newUpdater;
                newUpdater = atomicLongFieldUpdater;
                atomicLongFieldUpdater = atomicLongFieldUpdater2;
            } catch (Throwable th) {
                aiwn.a.log(Level.SEVERE, "Creating atomic field updaters failed", th);
                newUpdater = atomicLongFieldUpdater;
                newUpdater2 = newUpdater;
                newUpdater3 = newUpdater2;
                newUpdater4 = newUpdater3;
                newUpdater5 = newUpdater4;
            }
            g = atomicLongFieldUpdater;
            h = newUpdater2;
            i = newUpdater3;
            j = newUpdater4;
            k = newUpdater5;
            l = newUpdater;
        }

        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }

        public final void a() {
            AtomicLongFieldUpdater atomicLongFieldUpdater = g;
            if (atomicLongFieldUpdater != null) {
                atomicLongFieldUpdater.getAndIncrement(this);
            } else {
                this.a++;
            }
        }

        public final void a(long j) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = i;
            if (atomicLongFieldUpdater != null) {
                atomicLongFieldUpdater.getAndAdd(this, j);
            } else {
                this.c += j;
            }
        }

        public final void b() {
            AtomicLongFieldUpdater atomicLongFieldUpdater = h;
            if (atomicLongFieldUpdater != null) {
                atomicLongFieldUpdater.getAndIncrement(this);
            } else {
                this.b++;
            }
        }

        public final void b(long j) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = k;
            if (atomicLongFieldUpdater != null) {
                atomicLongFieldUpdater.getAndAdd(this, j);
            } else {
                this.e += j;
            }
        }

        public final void c(long j) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = j;
            if (atomicLongFieldUpdater != null) {
                atomicLongFieldUpdater.getAndAdd(this, j);
            } else {
                this.d += j;
            }
        }

        public final void d(long j) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = l;
            if (atomicLongFieldUpdater != null) {
                atomicLongFieldUpdater.getAndAdd(this, j);
            } else {
                this.f += j;
            }
        }
    }

    /* renamed from: aiwn$a */
    static final class a extends defpackage.aiuk.a {
        static final AtomicIntegerFieldUpdater<a> a;
        private static final AtomicReferenceFieldUpdater<a, b> h;
        final aiwn b;
        final Stopwatch c;
        volatile b d;
        volatile int e;
        final ajbn f;
        final boolean g;
        private final ajbn i;

        static {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = null;
            try {
                AtomicReferenceFieldUpdater newUpdater = AtomicReferenceFieldUpdater.newUpdater(a.class, b.class, "d");
                atomicReferenceFieldUpdater = AtomicIntegerFieldUpdater.newUpdater(a.class, "e");
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = newUpdater;
                atomicIntegerFieldUpdater = atomicReferenceFieldUpdater;
                atomicReferenceFieldUpdater = atomicReferenceFieldUpdater2;
            } catch (Throwable th) {
                aiwn.a.log(Level.SEVERE, "Creating atomic field updaters failed", th);
                atomicIntegerFieldUpdater = atomicReferenceFieldUpdater;
            }
            h = atomicReferenceFieldUpdater;
            a = atomicIntegerFieldUpdater;
        }

        a(aiwn aiwn, ajbn ajbn, String str, boolean z, boolean z2) {
            this.b = aiwn;
            this.i = (ajbn) Preconditions.checkNotNull(ajbn);
            this.f = aiwn.c.a(ajbn).a(ajax.b, ajbq.a(str)).a();
            this.c = ((Stopwatch) aiwn.e.get()).start();
            this.g = z2;
            if (z) {
                aiwn.d.a().b().a(this.f);
            }
        }

        public final aiuk a(aivl aivl) {
            boolean z = false;
            b bVar = new b();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            String str = "Are you creating multiple streams per call? This class doesn't yet support this case";
            if (atomicReferenceFieldUpdater != null) {
                Preconditions.checkState(atomicReferenceFieldUpdater.compareAndSet(this, null, bVar), str);
            } else {
                if (this.d == null) {
                    z = true;
                }
                Preconditions.checkState(z, str);
                this.d = bVar;
            }
            aivl.b(this.b.f);
            if (!this.b.c.a().equals(this.i)) {
                aivl.a(this.b.f, this.i);
            }
            return bVar;
        }
    }

    /* renamed from: aiwn$c */
    final class c implements aiui {
        private final boolean a;
        private final boolean b;

        c(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final <ReqT, RespT> aiuh<ReqT, RespT> a(aivm<ReqT, RespT> aivm, aiuf aiuf, aiug aiug) {
            final a aVar = new a(aiwn.this, aiwn.this.c.b(), aivm.b, this.a, this.b);
            return new aiux.a<ReqT, RespT>(aiug.a(aivm, aiuf.a(aVar))) {
                public final void a(aiuh.a<RespT> aVar, aivl aivl) {
                    this.a.a(new aiuy.a<RespT>(aVar) {
                        /* JADX WARNING: Missing block: B:3:0x000f, code skipped:
            if (defpackage.aiwn.a.a.getAndSet(r0, 1) != 0) goto L_0x0083;
     */
                        public final void a(defpackage.aivw r6, defpackage.aivl r7) {
                            /*
                            r5 = this;
                            r0 = defpackage.aiwn.c.1.this;
                            r0 = r1;
                            r1 = defpackage.aiwn.a.a;
                            r2 = 1;
                            if (r1 == 0) goto L_0x0012;
                        L_0x0009:
                            r1 = defpackage.aiwn.a.a;
                            r1 = r1.getAndSet(r0, r2);
                            if (r1 == 0) goto L_0x0018;
                        L_0x0011:
                            goto L_0x0083;
                        L_0x0012:
                            r1 = r0.e;
                            if (r1 != 0) goto L_0x0083;
                        L_0x0016:
                            r0.e = r2;
                        L_0x0018:
                            r1 = r0.g;
                            if (r1 == 0) goto L_0x0083;
                        L_0x001c:
                            r1 = r0.c;
                            r1.stop();
                            r1 = r0.c;
                            r2 = java.util.concurrent.TimeUnit.NANOSECONDS;
                            r1.elapsed(r2);
                            r1 = r0.d;
                            if (r1 != 0) goto L_0x002e;
                        L_0x002c:
                            r1 = defpackage.aiwn.b;
                        L_0x002e:
                            r2 = r0.b;
                            r2 = r2.d;
                            r2 = r2.a();
                            r2 = r2.b();
                            r2 = r2.a();
                            r3 = r1.a;
                            r2 = r2.b();
                            r3 = r1.b;
                            r2 = r2.b();
                            r3 = r1.c;
                            r2 = r2.a();
                            r3 = r1.d;
                            r2 = r2.a();
                            r3 = r1.e;
                            r2 = r2.a();
                            r3 = r1.f;
                            r1 = r2.a();
                            r2 = r0.b;
                            r2 = r2.c;
                            r0 = r0.f;
                            r0 = r2.a(r0);
                            r2 = defpackage.ajax.a;
                            r3 = r6.m;
                            r3 = r3.toString();
                            r3 = defpackage.ajbq.a(r3);
                            r0 = r0.a(r2, r3);
                            r0 = r0.a();
                            r1.a(r0);
                        L_0x0083:
                            super.a(r6, r7);
                            return;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.aiwn$c$1$1.a(aivw, aivl):void");
                        }
                    }, aivl);
                }
            };
        }
    }

    static {
        TimeUnit.MILLISECONDS.toNanos(1);
    }

    private aiwn(final ajbr ajbr, final ajbu ajbu, ajbh ajbh, Supplier<Stopwatch> supplier) {
        this.c = (ajbr) Preconditions.checkNotNull(ajbr, "tagger");
        this.d = (ajbh) Preconditions.checkNotNull(ajbh, "statsRecorder");
        Preconditions.checkNotNull(ajbu, "tagCtxSerializer");
        this.e = (Supplier) Preconditions.checkNotNull(supplier, "stopwatchSupplier");
        this.g = true;
        this.f = e.a("grpc-tags-bin", new d<ajbn>() {
            private byte[] a(ajbn ajbn) {
                try {
                    return ajbu.a(ajbn);
                } catch (ajbw e) {
                    throw new RuntimeException(e);
                }
            }

            private ajbn b(byte[] bArr) {
                try {
                    return ajbu.a(bArr);
                } catch (Exception e) {
                    aiwn.a.log(Level.FINE, "Failed to parse stats header", e);
                    return ajbr.a();
                }
            }
        });
    }

    aiwn(Supplier<Stopwatch> supplier) {
        this(ajbs.a.a(), ajbs.a.b().a(), ajbf.a.a(), supplier);
    }
}
