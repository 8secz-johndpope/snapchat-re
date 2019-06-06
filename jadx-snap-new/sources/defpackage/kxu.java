package defpackage;

import defpackage.dpu.b.a.a;
import defpackage.dpu.b.a.d;
import defpackage.mhs.b;
import defpackage.mhs.c;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* renamed from: kxu */
public final class kxu implements ajdu<dpu, dpu> {
    final kxt a;
    final mwe b;
    final zfw c;
    final long d;
    final TimeUnit e;
    private final ajdp<dpw> f;

    /* renamed from: kxu$c */
    static final class c<T> implements ajfl<dpu> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            dpu dpu = (dpu) obj;
            akcr.b(dpu, "it");
            return !(dpu instanceof d);
        }
    }

    /* renamed from: kxu$d */
    static final class d<T> implements ajfl<dpu> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            dpu dpu = (dpu) obj;
            akcr.b(dpu, "it");
            return !(dpu instanceof a);
        }
    }

    /* renamed from: kxu$a */
    static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
        final /* synthetic */ kxu a;

        /* renamed from: kxu$a$a */
        static final class a<T> implements ajfl<List<? extends mux>> {
            private /* synthetic */ mhs a;

            a(mhs mhs) {
                this.a = mhs;
            }

            public final /* synthetic */ boolean test(Object obj) {
                List list = (List) obj;
                akcr.b(list, "it");
                return (((Collection) list).isEmpty() ^ 1) != 0;
            }
        }

        /* renamed from: kxu$a$b */
        static final class b<T, R> implements ajfc<T, R> {
            private /* synthetic */ defpackage.dpu.b.a.a a;

            b(defpackage.dpu.b.a.a aVar) {
                this.a = aVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((List) obj, "it");
                return this.a;
            }
        }

        /* renamed from: kxu$a$c */
        static final class c<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ a a;

            c(a aVar) {
                this.a = aVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((Long) obj, "it");
                return this.a.a.a(null);
            }
        }

        a(kxu kxu) {
            this.a = kxu;
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (defpackage.dpu.b.a.a) obj;
            akcr.b(obj, "interaction");
            mhs a = defpackage.mhs.a.a(obj.a);
            if (a instanceof b) {
                ajdp a2 = ajpy.k(this.a.b.a(new defpackage.mwe.a.b((b) a)).b((ajfl) new a(a)).h().j().p(new b(obj))).a();
                return a2.h((ajdt) ajdp.a(1, this.a.e, (ajdw) this.a.c.b()).u(new c(this)).j((ajdt) a2));
            } else if (a instanceof c) {
                return ajdp.b(obj);
            } else {
                throw new ajxk();
            }
        }
    }

    /* renamed from: kxu$b */
    static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ kxu a;
        private /* synthetic */ ajdp b;
        private /* synthetic */ ajdp c;
        private /* synthetic */ ajdp d;

        b(kxu kxu, ajdp ajdp, ajdp ajdp2, ajdp ajdp3) {
            this.a = kxu;
            this.b = ajdp;
            this.c = ajdp2;
            this.d = ajdp3;
        }

        public final /* synthetic */ Object apply(Object obj) {
            d dVar = (d) obj;
            akcr.b(dVar, "it");
            return this.a.a(dVar.a).j((ajdt) ajdp.a((ajdt) this.b, (ajdt) this.c, (ajdt) this.d));
        }
    }

    /* renamed from: kxu$e */
    static final class e implements ajev {
        private /* synthetic */ kxu a;
        private /* synthetic */ String b;

        e(kxu kxu, String str) {
            this.a = kxu;
            this.b = str;
        }

        public final void run() {
            kxt kxt = this.a.a;
            String str = this.b;
            mux mux = r3;
            mux mux2 = new mux(kxv.b, miq.b.a, miq.a.b(str), null, null, mvy.d, null, kxv.c, null, null, null, null, 0, 2095836);
            kxt.a(mux);
        }
    }

    /* renamed from: kxu$f */
    static final class f implements ajev {
        private /* synthetic */ kxu a;

        f(kxu kxu) {
            this.a = kxu;
        }

        public final void run() {
            kxt kxt = this.a.a;
            Lock lock = kxt.a;
            lock.lock();
            try {
                Object obj = !((Collection) kxt.c).isEmpty() ? 1 : null;
                kxt.c = ajyw.a;
                if (obj != null) {
                    kxt.b.a(kxt.c);
                }
                lock.unlock();
            } catch (Throwable th) {
                lock.unlock();
            }
        }
    }

    public /* synthetic */ kxu(kxt kxt, mwe mwe, ajdp ajdp, zfw zfw) {
        this(kxt, mwe, ajdp, zfw, TimeUnit.SECONDS);
    }

    private kxu(kxt kxt, mwe mwe, ajdp<dpw> ajdp, zfw zfw, TimeUnit timeUnit) {
        akcr.b(kxt, "placeholderLensRepository");
        akcr.b(mwe, "lensRepository");
        akcr.b(ajdp, "lensesCameraLifecycle");
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(timeUnit, "insertPlaceholderWhenLensNotAvailableDelayTimeUnit");
        this.a = kxt;
        this.b = mwe;
        this.f = ajdp;
        this.c = zfw;
        this.d = 1;
        this.e = timeUnit;
    }

    /* Access modifiers changed, original: final */
    public final ajdp<a> a(String str) {
        ajdp b = ajdp.b(new a(kxv.b.a));
        akcr.a((Object) b, "just(LensesCameraInterac…ACEHOLDER_LENS_ID.value))");
        Object a = ajpy.k(myu.b(b).a((ajdb) ajcx.a((ajev) new e(this, str))).a((ajev) new f(this)).c((ajdw) this.c.b())).a();
        akcr.a(a, "just(LensesCameraInterac…\n                .share()");
        return a;
    }

    public final ajdt<dpu> apply(ajdp<dpu> ajdp) {
        akcr.b(ajdp, "upstream");
        Object a = ajdp.a((ajfl) c.a);
        Object b = ajdp.b(d.class);
        String str = "ofType(R::class.java)";
        akcr.a(b, str);
        akcr.a(a, "noPlaceholder");
        Object b2 = a.b(a.class);
        akcr.a(b2, str);
        ajdp a2 = a.a((ajfl) d.a);
        a = a.b(dpu.b.a.class);
        akcr.a(a, str);
        a = a.a(Object.class);
        String str2 = "cast(R::class.java)";
        akcr.a(a, str2);
        Object b3 = this.f.b(dpw.b.class);
        akcr.a(b3, str);
        Object a3 = b3.a(Object.class);
        akcr.a(a3, str2);
        ajdp u = b2.u(new a(this));
        b = ajdp.a((ajdt) a2, (ajdt) u, (ajdt) b.u(new b(this, a, a3, u)));
        akcr.a(b, "merge(noPlaceholderNoAct…PlaceholderWhenRequested)");
        return (ajdt) b;
    }
}
