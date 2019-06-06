package defpackage;

/* renamed from: ajjf */
public final class ajjf<T> extends ajim<T, T> {
    private ajev c;

    /* renamed from: ajjf$b */
    static final class b<T> extends ajuc<T> implements ajdh<T> {
        private akux<? super T> a;
        private ajev b;
        private akuy c;
        private ajgc<T> d;
        private boolean e;

        b(akux<? super T> akux, ajev ajev) {
            this.a = akux;
            this.b = ajev;
        }

        private void c() {
            if (compareAndSet(0, 1)) {
                try {
                    this.b.run();
                } catch (Throwable th) {
                    ajep.a(th);
                    ajvo.a(th);
                }
            }
        }

        public final int a(int i) {
            ajgc ajgc = this.d;
            if (ajgc == null || (i & 4) != 0) {
                return 0;
            }
            i = ajgc.a(i);
            if (i != 0) {
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                this.e = z;
            }
            return i;
        }

        public final void a() {
            this.a.a();
            c();
        }

        public final void a(long j) {
            this.c.a(j);
        }

        public final void a(akuy akuy) {
            if (ajui.a(this.c, akuy)) {
                this.c = akuy;
                if (akuy instanceof ajgc) {
                    this.d = (ajgc) akuy;
                }
                this.a.a((akuy) this);
            }
        }

        public final void a(T t) {
            this.a.a((Object) t);
        }

        public final void a(Throwable th) {
            this.a.a(th);
            c();
        }

        public final void b() {
            this.c.b();
            c();
        }

        public final void clear() {
            this.d.clear();
        }

        public final boolean isEmpty() {
            return this.d.isEmpty();
        }

        public final T poll() {
            Object poll = this.d.poll();
            if (poll == null && this.e) {
                c();
            }
            return poll;
        }
    }

    /* renamed from: ajjf$a */
    static final class a<T> extends ajuc<T> implements ajfw<T> {
        private ajfw<? super T> a;
        private ajev b;
        private akuy c;
        private ajgc<T> d;
        private boolean e;

        a(ajfw<? super T> ajfw, ajev ajev) {
            this.a = ajfw;
            this.b = ajev;
        }

        private void c() {
            if (compareAndSet(0, 1)) {
                try {
                    this.b.run();
                } catch (Throwable th) {
                    ajep.a(th);
                    ajvo.a(th);
                }
            }
        }

        public final int a(int i) {
            ajgc ajgc = this.d;
            if (ajgc == null || (i & 4) != 0) {
                return 0;
            }
            i = ajgc.a(i);
            if (i != 0) {
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                this.e = z;
            }
            return i;
        }

        public final void a() {
            this.a.a();
            c();
        }

        public final void a(long j) {
            this.c.a(j);
        }

        public final void a(akuy akuy) {
            if (ajui.a(this.c, akuy)) {
                this.c = akuy;
                if (akuy instanceof ajgc) {
                    this.d = (ajgc) akuy;
                }
                this.a.a(this);
            }
        }

        public final void a(T t) {
            this.a.a((Object) t);
        }

        public final void a(Throwable th) {
            this.a.a(th);
            c();
        }

        public final void b() {
            this.c.b();
            c();
        }

        public final boolean b(T t) {
            return this.a.b(t);
        }

        public final void clear() {
            this.d.clear();
        }

        public final boolean isEmpty() {
            return this.d.isEmpty();
        }

        public final T poll() {
            Object poll = this.d.poll();
            if (poll == null && this.e) {
                c();
            }
            return poll;
        }
    }

    public ajjf(ajde<T> ajde, ajev ajev) {
        super(ajde);
        this.c = ajev;
    }

    public final void a_(akux<? super T> akux) {
        ajde ajde;
        ajdh aVar;
        if (akux instanceof ajfw) {
            ajde = this.b;
            aVar = new a((ajfw) akux, this.c);
        } else {
            ajde = this.b;
            aVar = new b(akux, this.c);
        }
        ajde.a(aVar);
    }
}
