package defpackage;

/* renamed from: ajsp */
public final class ajsp<T> extends ajdx<T> {
    final ajfc<? super Throwable, ? extends T> a;
    final T b;
    private ajeb<? extends T> c;

    /* renamed from: ajsp$a */
    final class a implements ajdz<T> {
        private final ajdz<? super T> a;

        a(ajdz<? super T> ajdz) {
            this.a = ajdz;
        }

        public final void a(ajej ajej) {
            this.a.a(ajej);
        }

        public final void a(Throwable th) {
            Object apply;
            Throwable th2;
            if (ajsp.this.a != null) {
                try {
                    apply = ajsp.this.a.apply(th);
                } catch (Throwable th22) {
                    ajep.a(th22);
                    this.a.a(new ajeo(th, th22));
                    return;
                }
            }
            apply = ajsp.this.b;
            if (apply == null) {
                th22 = new NullPointerException("Value supplied was null");
                th22.initCause(th);
                this.a.a(th22);
                return;
            }
            this.a.b_(apply);
        }

        public final void b_(T t) {
            this.a.b_(t);
        }
    }

    public ajsp(ajeb<? extends T> ajeb, ajfc<? super Throwable, ? extends T> ajfc, T t) {
        this.c = ajeb;
        this.a = ajfc;
        this.b = t;
    }

    public final void b(ajdz<? super T> ajdz) {
        this.c.a(new a(ajdz));
    }
}
