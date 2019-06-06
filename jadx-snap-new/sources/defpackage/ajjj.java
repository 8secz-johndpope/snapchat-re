package defpackage;

/* renamed from: ajjj */
public final class ajjj<T> extends ajdj<T> implements ajfx<T> {
    private ajde<T> a;
    private long b = 0;

    /* renamed from: ajjj$a */
    static final class a<T> implements ajdh<T>, ajej {
        private ajdl<? super T> a;
        private long b;
        private akuy c;
        private long d;
        private boolean e;

        a(ajdl<? super T> ajdl, long j) {
            this.a = ajdl;
            this.b = j;
        }

        public final void a() {
            this.c = ajui.CANCELLED;
            if (!this.e) {
                this.e = true;
                this.a.a();
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
            if (!this.e) {
                long j = this.d;
                if (j == this.b) {
                    this.e = true;
                    this.c.b();
                    this.c = ajui.CANCELLED;
                    this.a.b_(t);
                    return;
                }
                this.d = j + 1;
            }
        }

        public final void a(Throwable th) {
            if (this.e) {
                ajvo.a(th);
                return;
            }
            this.e = true;
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

    public ajjj(ajde<T> ajde) {
        this.a = ajde;
    }

    public final void a(ajdl<? super T> ajdl) {
        this.a.a(new a(ajdl, 0));
    }

    public final ajde<T> an_() {
        return ajvo.a(new ajji(this.a, 0, null, false));
    }
}
