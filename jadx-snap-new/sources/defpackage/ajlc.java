package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ajlc */
public final class ajlc<T> extends ajim<T, T> {
    private long c = 1;

    /* renamed from: ajlc$a */
    static final class a<T> extends AtomicBoolean implements ajdh<T>, akuy {
        private akux<? super T> a;
        private long b;
        private boolean c;
        private akuy d;
        private long e;

        a(akux<? super T> akux, long j) {
            this.a = akux;
            this.b = j;
            this.e = j;
        }

        public final void a() {
            if (!this.c) {
                this.c = true;
                this.a.a();
            }
        }

        public final void a(long j) {
            if (!ajui.b(j)) {
                return;
            }
            if (get() || !compareAndSet(false, true) || j < this.b) {
                this.d.a(j);
            } else {
                this.d.a(Long.MAX_VALUE);
            }
        }

        public final void a(akuy akuy) {
            if (ajui.a(this.d, akuy)) {
                this.d = akuy;
                if (this.b == 0) {
                    akuy.b();
                    this.c = true;
                    ajuf.a(this.a);
                    return;
                }
                this.a.a((akuy) this);
            }
        }

        public final void a(T t) {
            if (!this.c) {
                long j = this.e;
                this.e = j - 1;
                if (j > 0) {
                    Object obj = this.e == 0 ? 1 : null;
                    this.a.a((Object) t);
                    if (obj != null) {
                        this.d.b();
                        a();
                    }
                }
            }
        }

        public final void a(Throwable th) {
            if (this.c) {
                ajvo.a(th);
                return;
            }
            this.c = true;
            this.d.b();
            this.a.a(th);
        }

        public final void b() {
            this.d.b();
        }
    }

    public ajlc(ajde<T> ajde) {
        super(ajde);
    }

    public final void a_(akux<? super T> akux) {
        this.b.a(new a(akux, this.c));
    }
}
