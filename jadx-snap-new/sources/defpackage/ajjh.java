package defpackage;

/* renamed from: ajjh */
public final class ajjh<T> extends ajim<T, T> {
    private final ajfb<? super akuy> c;
    private final ajfk d;
    private final ajev e;

    /* renamed from: ajjh$a */
    static final class a<T> implements ajdh<T>, akuy {
        private akux<? super T> a;
        private ajfb<? super akuy> b;
        private ajfk c;
        private ajev d;
        private akuy e;

        a(akux<? super T> akux, ajfb<? super akuy> ajfb, ajfk ajfk, ajev ajev) {
            this.a = akux;
            this.b = ajfb;
            this.d = ajev;
            this.c = ajfk;
        }

        public final void a() {
            if (this.e != ajui.CANCELLED) {
                this.a.a();
            }
        }

        public final void a(long j) {
            this.e.a(j);
        }

        public final void a(akuy akuy) {
            try {
                this.b.accept(akuy);
                if (ajui.a(this.e, akuy)) {
                    this.e = akuy;
                    this.a.a((akuy) this);
                }
            } catch (Throwable th) {
                ajep.a(th);
                akuy.b();
                this.e = ajui.CANCELLED;
                ajuf.a(th, this.a);
            }
        }

        public final void a(T t) {
            this.a.a((Object) t);
        }

        public final void a(Throwable th) {
            if (this.e != ajui.CANCELLED) {
                this.a.a(th);
            } else {
                ajvo.a(th);
            }
        }

        public final void b() {
            akuy akuy = this.e;
            if (akuy != ajui.CANCELLED) {
                this.e = ajui.CANCELLED;
                try {
                    this.d.run();
                } catch (Throwable th) {
                    ajep.a(th);
                    ajvo.a(th);
                }
                akuy.b();
            }
        }
    }

    public ajjh(ajde<T> ajde, ajfb<? super akuy> ajfb, ajfk ajfk, ajev ajev) {
        super(ajde);
        this.c = ajfb;
        this.d = ajfk;
        this.e = ajev;
    }

    public final void a_(akux<? super T> akux) {
        this.b.a(new a(akux, this.c, this.d, this.e));
    }
}
