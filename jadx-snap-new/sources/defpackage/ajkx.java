package defpackage;

import java.util.NoSuchElementException;

/* renamed from: ajkx */
public final class ajkx<T> extends ajdx<T> implements ajfx<T> {
    private ajde<T> a;
    private T b = null;

    /* renamed from: ajkx$a */
    static final class a<T> implements ajdh<T>, ajej {
        private ajdz<? super T> a;
        private T b = null;
        private akuy c;
        private boolean d;
        private T e;

        a(ajdz<? super T> ajdz, T t) {
            this.a = ajdz;
        }

        public final void a() {
            if (!this.d) {
                this.d = true;
                this.c = ajui.CANCELLED;
                Object obj = this.e;
                this.e = null;
                if (obj == null) {
                    obj = this.b;
                }
                if (obj != null) {
                    this.a.b_(obj);
                } else {
                    this.a.a(new NoSuchElementException());
                }
            }
        }

        public final void a(akuy akuy) {
            if (ajui.a(this.c, akuy)) {
                this.c = akuy;
                this.a.a((ajej) this);
                akuy.a(Long.MAX_VALUE);
            }
        }

        public final void a(T t) {
            if (!this.d) {
                if (this.e != null) {
                    this.d = true;
                    this.c.b();
                    this.c = ajui.CANCELLED;
                    this.a.a(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.e = t;
            }
        }

        public final void a(Throwable th) {
            if (this.d) {
                ajvo.a(th);
                return;
            }
            this.d = true;
            this.c = ajui.CANCELLED;
            this.a.a(th);
        }

        public final void dispose() {
            this.c.b();
            this.c = ajui.CANCELLED;
        }

        public final boolean isDisposed() {
            return this.c == ajui.CANCELLED;
        }
    }

    public ajkx(ajde<T> ajde) {
        this.a = ajde;
    }

    public final ajde<T> an_() {
        return ajvo.a(new ajkw(this.a, null));
    }

    public final void b(ajdz<? super T> ajdz) {
        this.a.a(new a(ajdz, null));
    }
}
