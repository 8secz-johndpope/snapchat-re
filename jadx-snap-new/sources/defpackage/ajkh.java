package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: ajkh */
public final class ajkh<T> extends ajim<T, T> implements ajfb<T> {
    private ajfb<? super T> c;

    /* renamed from: ajkh$a */
    static final class a<T> extends AtomicLong implements ajdh<T>, akuy {
        private akux<? super T> a;
        private ajfb<? super T> b;
        private akuy c;
        private boolean d;

        a(akux<? super T> akux, ajfb<? super T> ajfb) {
            this.a = akux;
            this.b = ajfb;
        }

        public final void a() {
            if (!this.d) {
                this.d = true;
                this.a.a();
            }
        }

        public final void a(long j) {
            if (ajui.b(j)) {
                ajum.a((AtomicLong) this, j);
            }
        }

        public final void a(akuy akuy) {
            if (ajui.a(this.c, akuy)) {
                this.c = akuy;
                this.a.a((akuy) this);
                akuy.a(Long.MAX_VALUE);
            }
        }

        public final void a(T t) {
            if (!this.d) {
                if (get() != 0) {
                    this.a.a((Object) t);
                    ajum.c(this, 1);
                    return;
                }
                try {
                    this.b.accept(t);
                } catch (Throwable th) {
                    ajep.a(th);
                    b();
                    a(th);
                }
            }
        }

        public final void a(Throwable th) {
            if (this.d) {
                ajvo.a(th);
                return;
            }
            this.d = true;
            this.a.a(th);
        }

        public final void b() {
            this.c.b();
        }
    }

    public ajkh(ajde<T> ajde) {
        super(ajde);
        this.c = this;
    }

    public ajkh(ajde<T> ajde, ajfb<? super T> ajfb) {
        super(ajde);
        this.c = ajfb;
    }

    public final void a_(akux<? super T> akux) {
        this.b.a(new a(akux, this.c));
    }

    public final void accept(T t) {
    }
}
