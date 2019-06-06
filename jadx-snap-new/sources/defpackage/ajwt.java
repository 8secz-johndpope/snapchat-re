package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajwt */
public final class ajwt<T> extends ajws<T> {
    final ajtb<T> a;
    final AtomicReference<ajdv<? super T>> b = new AtomicReference();
    volatile boolean c;
    final ajgh<T> d = new a();
    boolean e;
    private AtomicReference<Runnable> f = new AtomicReference();
    private boolean g = true;
    private volatile boolean h;
    private Throwable i;
    private AtomicBoolean j = new AtomicBoolean();

    /* renamed from: ajwt$a */
    final class a extends ajgh<T> {
        a() {
        }

        public final int a(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            ajwt.this.e = true;
            return 2;
        }

        public final void clear() {
            ajwt.this.a.clear();
        }

        public final void dispose() {
            if (!ajwt.this.c) {
                ajwt ajwt = ajwt.this;
                ajwt.c = true;
                ajwt.q();
                ajwt.this.b.lazySet(null);
                if (ajwt.this.d.getAndIncrement() == 0) {
                    ajwt.this.b.lazySet(null);
                    ajwt.this.a.clear();
                }
            }
        }

        public final boolean isDisposed() {
            return ajwt.this.c;
        }

        public final boolean isEmpty() {
            return ajwt.this.a.isEmpty();
        }

        public final T poll() {
            return ajwt.this.a.poll();
        }
    }

    private ajwt(int i) {
        this.a = new ajtb(ajfv.a(i, "capacityHint"));
    }

    private boolean a(ajgf<T> ajgf, ajdv<? super T> ajdv) {
        Throwable th = this.i;
        if (th == null) {
            return false;
        }
        this.b.lazySet(null);
        ajgf.clear();
        ajdv.a(th);
        return true;
    }

    public static <T> ajwt<T> b(int i) {
        return new ajwt(i);
    }

    private void b(ajdv<? super T> ajdv) {
        ajtb ajtb = this.a;
        int i = this.g ^ 1;
        Object obj = 1;
        int i2 = 1;
        while (!this.c) {
            boolean z = this.h;
            Object poll = this.a.poll();
            Object obj2 = poll == null ? 1 : null;
            if (z) {
                if (!(i == 0 || obj == null)) {
                    if (!a(ajtb, ajdv)) {
                        obj = null;
                    } else {
                        return;
                    }
                }
                if (obj2 != null) {
                    e(ajdv);
                    return;
                }
            }
            if (obj2 == null) {
                ajdv.a(poll);
            } else {
                i2 = this.d.addAndGet(-i2);
                if (i2 == 0) {
                    return;
                }
            }
        }
        this.b.lazySet(null);
        ajtb.clear();
    }

    private void d(ajdv<? super T> ajdv) {
        ajtb ajtb = this.a;
        int i = 1;
        int i2 = this.g ^ 1;
        while (!this.c) {
            boolean z = this.h;
            if (i2 == 0 || !z || !a(ajtb, ajdv)) {
                ajdv.a(null);
                if (z) {
                    e(ajdv);
                    return;
                }
                i = this.d.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
            return;
        }
        this.b.lazySet(null);
        ajtb.clear();
    }

    private void e(ajdv<? super T> ajdv) {
        this.b.lazySet(null);
        Throwable th = this.i;
        if (th != null) {
            ajdv.a(th);
        } else {
            ajdv.a();
        }
    }

    public static <T> ajwt<T> p() {
        return new ajwt(ajde.a);
    }

    private void s() {
        if (this.d.getAndIncrement() == 0) {
            ajdv ajdv = (ajdv) this.b.get();
            int i = 1;
            while (ajdv == null) {
                i = this.d.addAndGet(-i);
                if (i != 0) {
                    ajdv = (ajdv) this.b.get();
                } else {
                    return;
                }
            }
            if (this.e) {
                d(ajdv);
            } else {
                b(ajdv);
            }
        }
    }

    public final void a() {
        if (!this.h && !this.c) {
            this.h = true;
            q();
            s();
        }
    }

    public final void a(ajej ajej) {
        if (this.h || this.c) {
            ajej.dispose();
        }
    }

    public final void a(T t) {
        ajfv.a((Object) t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.h && !this.c) {
            this.a.offer(t);
            s();
        }
    }

    public final void a(Throwable th) {
        ajfv.a((Object) th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.h || this.c) {
            ajvo.a(th);
            return;
        }
        this.i = th;
        this.h = true;
        q();
        s();
    }

    public final void a_(ajdv<? super T> ajdv) {
        if (this.j.get() || !this.j.compareAndSet(false, true)) {
            ajfq.a(new IllegalStateException("Only a single observer allowed."), (ajdv) ajdv);
            return;
        }
        ajdv.a(this.d);
        this.b.lazySet(ajdv);
        if (this.c) {
            this.b.lazySet(null);
        } else {
            s();
        }
    }

    public final boolean n() {
        return this.b.get() != null;
    }

    public final boolean o() {
        return this.h && this.i == null;
    }

    /* Access modifiers changed, original: final */
    public final void q() {
        Runnable runnable = (Runnable) this.f.get();
        if (runnable != null && this.f.compareAndSet(runnable, null)) {
            runnable.run();
        }
    }
}
