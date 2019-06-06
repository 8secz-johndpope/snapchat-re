package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: twz */
public final class twz implements ajej {
    public akbl<? super Throwable, ajxw> a;
    final odu b;
    private final ajxe c;
    private final ajxe d;
    private final ajxe e = ajxh.a(b.a);
    private final ajxe f = ajxh.a(f.a);
    private final ajxe g = ajxh.a(j.a);

    /* renamed from: twz$b */
    static final class b extends akcs implements akbk<ajei> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajei();
        }
    }

    /* renamed from: twz$f */
    static final class f extends akcs implements akbk<ConcurrentHashMap<abyi, ajcx>> {
        public static final f a = new f();

        f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: twz$j */
    static final class j extends akcs implements akbk<ConcurrentHashMap<abyi, ajdx<odx>>> {
        public static final j a = new j();

        j() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: twz$a */
    static final class a extends akcs implements akbk<idd> {
        private /* synthetic */ toc a;

        a(toc toc) {
            this.a = toc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.callsite("PreviewMediaReaderManager");
        }
    }

    /* renamed from: twz$k */
    static final class k extends akcs implements akbk<zfw> {
        private /* synthetic */ twz a;
        private /* synthetic */ zgb b;

        k(twz twz, zgb zgb) {
            this.a = twz;
            this.b = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(this.a.a());
        }
    }

    /* renamed from: twz$g */
    static final class g<T> implements ajfb<ajej> {
        public static final g a = new g();

        g() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: twz$h */
    static final class h<T> implements ajfb<odx> {
        public static final h a = new h();

        h() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: twz$i */
    static final class i<T, R> implements ajfc<T, R> {
        private /* synthetic */ twz a;
        private /* synthetic */ abyi b;

        /* renamed from: twz$i$a */
        static final class a implements ajev {
            private /* synthetic */ odx a;

            a(odx odx) {
                this.a = odx;
            }

            public final void run() {
                this.a.close();
            }
        }

        i(twz twz, abyi abyi) {
            this.a = twz;
            this.b = abyi;
        }

        private odx a(odx odx) {
            akcr.b(odx, "it");
            odx = odx.a();
            Map d = this.a.d();
            abyi abyi = this.b;
            twz twz = this.a;
            Object d2 = twz.b.a(this.b).b((ajdw) twz.b().f()).d();
            ajej a = d2.b((ajdw) twz.b().f()).a((ajev) d.a, (ajfb) new c(twz));
            akcr.a((Object) a, "subscribeOn(schedulers.i…                       })");
            ajvv.a(a, twz.c());
            akcr.a(d2, "mediaPackageManager.ensu…le)\n                    }");
            d.put(abyi, d2);
            ajej a2 = ajek.a((ajev) new a(odx));
            akcr.a((Object) a2, "Disposables.fromAction { it.close() }");
            ajvv.a(a2, this.a.c());
            return odx;
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((odx) obj);
        }
    }

    /* renamed from: twz$d */
    static final class d implements ajev {
        public static final d a = new d();

        d() {
        }

        public final void run() {
        }
    }

    /* renamed from: twz$c */
    static final class c<T> implements ajfb<Throwable> {
        private /* synthetic */ twz a;

        c(twz twz) {
            this.a = twz;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Throwable) obj;
            if (this.a.a != null) {
                akbl akbl = this.a.a;
                if (akbl == null) {
                    akcr.a("errorHandler");
                }
                akcr.a(obj, "it");
                akbl.invoke(obj);
            }
        }
    }

    /* renamed from: twz$e */
    static final class e<T, R> implements ajfc<odx, ajdb> {
        private /* synthetic */ twz a;
        private /* synthetic */ abyi b;

        e(twz twz, abyi abyi) {
            this.a = twz;
            this.b = abyi;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((odx) obj, "it");
            ajcx ajcx = (ajcx) this.a.d().get(this.b);
            if (ajcx != null) {
                return ajcx;
            }
            throw new IllegalStateException("media package not ensured after open");
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(twz.class), "attribution", "getAttribution()Lcom/snap/framework/attribution/AttributedCallsite;"), new akdc(akde.a(twz.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(twz.class), "compositeDisposable", "getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;"), new akdc(akde.a(twz.class), "ensuredMediaPackages", "getEnsuredMediaPackages()Ljava/util/concurrent/ConcurrentHashMap;"), new akdc(akde.a(twz.class), "mediaPackageReaders", "getMediaPackageReaders()Ljava/util/concurrent/ConcurrentHashMap;")};
    }

    public twz(odu odu, toc toc, zgb zgb) {
        akcr.b(odu, "mediaPackageManager");
        akcr.b(toc, "previewFeature");
        akcr.b(zgb, "schedulersProvider");
        this.b = odu;
        this.c = ajxh.a(new a(toc));
        this.d = ajxh.a(new k(this, zgb));
    }

    private final ajdx<odx> c(abyi abyi) {
        Object a = this.b.c(a(), abyi).b((ajfb) g.a).c((ajfb) h.a).b((ajdw) b().f()).f(new i(this, abyi)).a();
        akcr.a(a, "mediaPackageManager.crea…                }.cache()");
        return a;
    }

    private final ConcurrentHashMap<abyi, ajdx<odx>> e() {
        return (ConcurrentHashMap) this.g.b();
    }

    public final ajdx<odx> a(abyi abyi) {
        akcr.b(abyi, "mediaPackage");
        ConcurrentMap e = e();
        Object obj = e.get(abyi);
        if (obj == null) {
            obj = c(abyi);
            Object putIfAbsent = e.putIfAbsent(abyi, obj);
            if (putIfAbsent != null) {
                obj = putIfAbsent;
            }
        }
        akcr.a(obj, "mediaPackageReaders.getO…Internal(mediaPackage) })");
        return (ajdx) obj;
    }

    /* Access modifiers changed, original: final */
    public final idd a() {
        return (idd) this.c.b();
    }

    public final ajcx b(abyi abyi) {
        akcr.b(abyi, "mediaPackage");
        ajcx ajcx = (ajcx) d().get(abyi);
        if (ajcx != null) {
            return ajcx;
        }
        Object e = a(abyi).e((ajfc) new e(this, abyi));
        akcr.a(e, "getMediaPackageReader(me… open\")\n                }");
        return e;
    }

    /* Access modifiers changed, original: final */
    public final zfw b() {
        return (zfw) this.d.b();
    }

    /* Access modifiers changed, original: final */
    public final ajei c() {
        return (ajei) this.e.b();
    }

    /* Access modifiers changed, original: final */
    public final ConcurrentHashMap<abyi, ajcx> d() {
        return (ConcurrentHashMap) this.f.b();
    }

    public final void dispose() {
        c().dispose();
        e().clear();
        d().clear();
    }

    public final boolean isDisposed() {
        return c().isDisposed();
    }
}
