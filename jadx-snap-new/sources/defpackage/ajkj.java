package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajkj */
public final class ajkj<T> extends ajim<T, T> {

    /* renamed from: ajkj$a */
    static final class a<T> extends AtomicInteger implements ajdh<T>, akuy {
        private akux<? super T> a;
        private akuy b;
        private volatile boolean c;
        private Throwable d;
        private volatile boolean e;
        private AtomicLong f = new AtomicLong();
        private AtomicReference<T> g = new AtomicReference();

        a(akux<? super T> akux) {
            this.a = akux;
        }

        private boolean a(boolean z, boolean z2, akux<?> akux, AtomicReference<T> atomicReference) {
            if (this.e) {
                atomicReference.lazySet(null);
                return true;
            }
            if (z) {
                Throwable th = this.d;
                if (th != null) {
                    atomicReference.lazySet(null);
                    akux.a(th);
                    return true;
                } else if (z2) {
                    akux.a();
                    return true;
                }
            }
            return false;
        }

        private void c() {
            if (getAndIncrement() == 0) {
                akux akux = this.a;
                AtomicLong atomicLong = this.f;
                AtomicReference atomicReference = this.g;
                int i = 1;
                do {
                    boolean z;
                    boolean z2;
                    long j = 0;
                    while (true) {
                        z = false;
                        if (j == atomicLong.get()) {
                            break;
                        }
                        z2 = this.c;
                        Object andSet = atomicReference.getAndSet(null);
                        boolean z3 = andSet == null;
                        if (!a(z2, z3, akux, atomicReference)) {
                            if (z3) {
                                break;
                            }
                            akux.a(andSet);
                            j++;
                        } else {
                            return;
                        }
                    }
                    if (j == atomicLong.get()) {
                        z2 = this.c;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (a(z2, z, akux, atomicReference)) {
                            return;
                        }
                    }
                    if (j != 0) {
                        ajum.c(atomicLong, j);
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        public final void a() {
            this.c = true;
            c();
        }

        public final void a(long j) {
            if (ajui.b(j)) {
                ajum.a(this.f, j);
                c();
            }
        }

        public final void a(akuy akuy) {
            if (ajui.a(this.b, akuy)) {
                this.b = akuy;
                this.a.a((akuy) this);
                akuy.a(Long.MAX_VALUE);
            }
        }

        public final void a(T t) {
            this.g.lazySet(t);
            c();
        }

        public final void a(Throwable th) {
            this.d = th;
            this.c = true;
            c();
        }

        public final void b() {
            if (!this.e) {
                this.e = true;
                this.b.b();
                if (getAndIncrement() == 0) {
                    this.g.lazySet(null);
                }
            }
        }
    }

    public ajkj(ajde<T> ajde) {
        super(ajde);
    }

    public final void a_(akux<? super T> akux) {
        this.b.a(new a(akux));
    }
}
