package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajvu */
public final class ajvu<T> extends ajvq<T> {
    final ajtb<T> b;
    final AtomicReference<akux<? super T>> c;
    volatile boolean d;
    final ajuc<T> e;
    final AtomicLong f;
    boolean g;
    private AtomicReference<Runnable> h;
    private boolean i;
    private volatile boolean j;
    private Throwable k;
    private AtomicBoolean l;

    /* renamed from: ajvu$a */
    final class a extends ajuc<T> {
        a() {
        }

        public final int a(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            ajvu.this.g = true;
            return 2;
        }

        public final void a(long j) {
            if (ajui.b(j)) {
                ajum.a(ajvu.this.f, j);
                ajvu.this.o();
            }
        }

        public final void b() {
            if (!ajvu.this.d) {
                ajvu ajvu = ajvu.this;
                ajvu.d = true;
                ajvu.n();
                if (!ajvu.this.g && ajvu.this.e.getAndIncrement() == 0) {
                    ajvu.this.b.clear();
                    ajvu.this.c.lazySet(null);
                }
            }
        }

        public final void clear() {
            ajvu.this.b.clear();
        }

        public final boolean isEmpty() {
            return ajvu.this.b.isEmpty();
        }

        public final T poll() {
            return ajvu.this.b.poll();
        }
    }

    private ajvu(int i) {
        this(i, (byte) 0);
    }

    private ajvu(int i, byte b) {
        this.b = new ajtb(ajfv.a(i, "capacityHint"));
        this.h = new AtomicReference(null);
        this.i = true;
        this.c = new AtomicReference();
        this.l = new AtomicBoolean();
        this.e = new a();
        this.f = new AtomicLong();
    }

    private boolean a(boolean z, boolean z2, boolean z3, akux<? super T> akux, ajtb<T> ajtb) {
        if (this.d) {
            ajtb.clear();
            this.c.lazySet(null);
            return true;
        }
        if (z2) {
            if (z && this.k != null) {
                ajtb.clear();
                this.c.lazySet(null);
                akux.a(this.k);
                return true;
            } else if (z3) {
                Throwable th = this.k;
                this.c.lazySet(null);
                if (th != null) {
                    akux.a(th);
                } else {
                    akux.a();
                }
                return true;
            }
        }
        return false;
    }

    public static <T> ajvu<T> l() {
        return new ajvu(ajde.a);
    }

    public static <T> ajvu<T> m() {
        return new ajvu(8);
    }

    public final void a() {
        if (!this.j && !this.d) {
            this.j = true;
            n();
            o();
        }
    }

    public final void a(akuy akuy) {
        if (this.j || this.d) {
            akuy.b();
        } else {
            akuy.a(Long.MAX_VALUE);
        }
    }

    public final void a(T t) {
        ajfv.a((Object) t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.j && !this.d) {
            this.b.offer(t);
            o();
        }
    }

    public final void a(Throwable th) {
        ajfv.a((Object) th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.j || this.d) {
            ajvo.a(th);
            return;
        }
        this.k = th;
        this.j = true;
        n();
        o();
    }

    public final void a_(akux<? super T> akux) {
        if (this.l.get() || !this.l.compareAndSet(false, true)) {
            ajuf.a(new IllegalStateException("This processor allows only a single Subscriber"), akux);
            return;
        }
        akux.a(this.e);
        this.c.set(akux);
        if (this.d) {
            this.c.lazySet(null);
        } else {
            o();
        }
    }

    /* Access modifiers changed, original: final */
    public final void n() {
        Runnable runnable = (Runnable) this.h.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* Access modifiers changed, original: final */
    public final void o() {
        if (this.e.getAndIncrement() == 0) {
            int i = 1;
            akux akux = (akux) this.c.get();
            int i2 = 1;
            while (akux == null) {
                i2 = this.e.addAndGet(-i2);
                if (i2 != 0) {
                    akux = (akux) this.c.get();
                    i = 1;
                } else {
                    return;
                }
            }
            boolean z;
            if (this.g) {
                ajtb ajtb = this.b;
                int i3 = this.i ^ i;
                while (!this.d) {
                    z = this.j;
                    if (i3 == 0 || !z || this.k == null) {
                        akux.a(null);
                        if (z) {
                            this.c.lazySet(null);
                            Throwable th = this.k;
                            if (th != null) {
                                akux.a(th);
                                return;
                            } else {
                                akux.a();
                                return;
                            }
                        }
                        i = this.e.addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                    ajtb.clear();
                    this.c.lazySet(null);
                    akux.a(this.k);
                    return;
                }
                ajtb.clear();
                this.c.lazySet(null);
                return;
            }
            ajtb ajtb2 = this.b;
            boolean z2 = this.i ^ 1;
            int i4 = 1;
            loop2:
            while (true) {
                long j;
                long j2 = this.f.get();
                long j3 = 0;
                while (j2 != j3) {
                    z = this.j;
                    Object poll = ajtb2.poll();
                    boolean z3 = poll == null;
                    Object obj = poll;
                    j = j3;
                    if (!a(z2, z, z3, akux, ajtb2)) {
                        if (z3) {
                            break;
                        }
                        akux.a(obj);
                        j3 = j + 1;
                    } else {
                        break loop2;
                    }
                }
                j = j3;
                if (j2 == j) {
                    if (a(z2, this.j, ajtb2.isEmpty(), akux, ajtb2)) {
                        break;
                    }
                }
                if (!(j == 0 || j2 == Long.MAX_VALUE)) {
                    this.f.addAndGet(-j);
                }
                i4 = this.e.addAndGet(-i4);
                if (i4 == 0) {
                    break;
                }
            }
        }
    }
}
