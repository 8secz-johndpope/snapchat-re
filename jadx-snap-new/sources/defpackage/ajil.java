package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ajil */
public final class ajil<T> extends ajdx<T> {
    final Callable<? extends T> a;
    final T b;
    private ajdb c;

    /* renamed from: ajil$a */
    final class a implements ajcz {
        private final ajdz<? super T> a;

        a(ajdz<? super T> ajdz) {
            this.a = ajdz;
        }

        public final void a() {
            Object call;
            if (ajil.this.a != null) {
                try {
                    call = ajil.this.a.call();
                } catch (Throwable th) {
                    ajep.a(th);
                    this.a.a(th);
                    return;
                }
            }
            call = ajil.this.b;
            if (call == null) {
                this.a.a(new NullPointerException("The value supplied is null"));
            } else {
                this.a.b_(call);
            }
        }

        public final void a(ajej ajej) {
            this.a.a(ajej);
        }

        public final void a(Throwable th) {
            this.a.a(th);
        }
    }

    public ajil(ajdb ajdb, Callable<? extends T> callable, T t) {
        this.c = ajdb;
        this.b = t;
        this.a = callable;
    }

    public final void b(ajdz<? super T> ajdz) {
        this.c.a(new a(ajdz));
    }
}
