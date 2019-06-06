package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajsg */
public final class ajsg<T, R> extends ajde<R> {
    private ajeb<T> b;
    private ajfc<? super T, ? extends akuw<? extends R>> c;

    /* renamed from: ajsg$a */
    static final class a<S, T> extends AtomicLong implements ajdh<T>, ajdz<S>, akuy {
        private akux<? super T> a;
        private ajfc<? super S, ? extends akuw<? extends T>> b;
        private AtomicReference<akuy> c = new AtomicReference();
        private ajej d;

        a(akux<? super T> akux, ajfc<? super S, ? extends akuw<? extends T>> ajfc) {
            this.a = akux;
            this.b = ajfc;
        }

        public final void a() {
            this.a.a();
        }

        public final void a(long j) {
            ajui.a(this.c, (AtomicLong) this, j);
        }

        public final void a(ajej ajej) {
            this.d = ajej;
            this.a.a((akuy) this);
        }

        public final void a(akuy akuy) {
            ajui.a(this.c, (AtomicLong) this, akuy);
        }

        public final void a(T t) {
            this.a.a((Object) t);
        }

        public final void a(Throwable th) {
            this.a.a(th);
        }

        public final void b() {
            this.d.dispose();
            ajui.a(this.c);
        }

        public final void b_(S s) {
            try {
                ((akuw) ajfv.a(this.b.apply(s), "the mapper returned a null Publisher")).a(this);
            } catch (Throwable th) {
                ajep.a(th);
                this.a.a(th);
            }
        }
    }

    public ajsg(ajeb<T> ajeb, ajfc<? super T, ? extends akuw<? extends R>> ajfc) {
        this.b = ajeb;
        this.c = ajfc;
    }

    public final void a_(akux<? super R> akux) {
        this.b.a(new a(akux, this.c));
    }
}
