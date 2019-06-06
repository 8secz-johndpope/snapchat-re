package defpackage;

import defpackage.ajjz.b;
import defpackage.ajjz.c;
import defpackage.ajjz.d;
import defpackage.ajpm.e;
import defpackage.ajpm.f;

/* renamed from: cfb */
public final class cfb<T> implements ajdi<T, T>, ajdu<T, T> {
    private static final cfb<Object> a = new cfb();

    /* renamed from: cfb$a */
    static final class a<T> implements ajdv<T>, akux<T> {
        volatile T a;

        a() {
        }

        public final void a() {
            this.a = null;
        }

        public final void a(ajej ajej) {
        }

        public final void a(akuy akuy) {
        }

        public final void a(T t) {
            this.a = t;
        }

        public final void a(Throwable th) {
            this.a = null;
        }
    }

    /* renamed from: cfb$c */
    static final class c<T> extends ajdp<T> {
        private final ajdp<T> a;
        private final a<T> b;

        c(ajdp<T> ajdp, a<T> aVar) {
            this.a = ajdp;
            this.b = aVar;
        }

        public final void a_(ajdv<? super T> ajdv) {
            this.a.a(new d(ajdv, this.b));
        }
    }

    /* renamed from: cfb$d */
    static final class d<T> implements ajdv<T> {
        private final ajdv<? super T> a;
        private final a<T> b;

        d(ajdv<? super T> ajdv, a<T> aVar) {
            this.a = ajdv;
            this.b = aVar;
        }

        public final void a() {
            this.a.a();
        }

        public final void a(ajej ajej) {
            this.a.a(ajej);
            Object obj = this.b.a;
            if (obj != null && !ajej.isDisposed()) {
                this.a.a(obj);
            }
        }

        public final void a(T t) {
            this.a.a((Object) t);
        }

        public final void a(Throwable th) {
            this.a.a(th);
        }
    }

    /* renamed from: cfb$b */
    static final class b<T> extends ajde<T> {
        private final ajde<T> b;
        private final a<T> c;

        b(ajde<T> ajde, a<T> aVar) {
            this.b = ajde;
            this.c = aVar;
        }

        public final void a_(akux<? super T> akux) {
            this.b.a(new e(akux, this.c));
        }
    }

    /* renamed from: cfb$e */
    static final class e<T> implements akux<T>, akuy {
        private final akux<? super T> a;
        private final a<T> b;
        private akuy c;
        private volatile boolean d;
        private boolean e = true;

        e(akux<? super T> akux, a<T> aVar) {
            this.a = akux;
            this.b = aVar;
        }

        public final void a() {
            this.a.a();
        }

        public final void a(long j) {
            if (j != 0) {
                if (this.e) {
                    this.e = false;
                    Object obj = this.b.a;
                    if (!(obj == null || this.d)) {
                        this.a.a(obj);
                        if (j != Long.MAX_VALUE) {
                            j--;
                            if (j == 0) {
                                return;
                            }
                        }
                    }
                }
                this.c.a(j);
            }
        }

        public final void a(akuy akuy) {
            this.c = akuy;
            this.a.a((akuy) this);
        }

        public final void a(T t) {
            this.a.a((Object) t);
        }

        public final void a(Throwable th) {
            this.a.a(th);
        }

        public final void b() {
            this.d = true;
            this.c.b();
        }
    }

    private cfb() {
    }

    public static <T> cfb<T> a() {
        return a;
    }

    public final /* synthetic */ akuw a(ajde ajde) {
        Object aVar = new a();
        ajfv.a(aVar, "subscriber is null");
        return new b(ajde.a(new d(aVar), new c(aVar), new b(aVar), ajfu.c).g().a(), aVar);
    }

    public final /* synthetic */ ajdt apply(ajdp ajdp) {
        Object aVar = new a();
        ajfv.a(aVar, "observer is null");
        return new c(ajpy.k(ajdp.a(new f(aVar), new e(aVar), new ajpm.d(aVar), ajfu.c)).a(), aVar);
    }
}
