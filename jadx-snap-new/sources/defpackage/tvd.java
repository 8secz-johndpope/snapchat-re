package defpackage;

import com.brightcove.player.event.Event;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: tvd */
public final class tvd {
    final ajxe a;
    public final ajdx<List<abyi>> b;
    public final Object c;
    public ajdx<List<abyi>> d;
    public ajdx<List<abyi>> e;
    public final ajdp<abbd> f;
    public final ajdp<ajxr<Boolean, String, List<String>>> g;
    public gtt h;
    public String i;
    public tob j;
    public gcn k;
    public tpl l;
    final odu m;
    private final ajxe n;
    private final ajwl<List<abyi>> o;
    private final ajxe p = ajxh.a(e.a);
    private final ajxe q = ajxh.a(c.a);
    private final ajdp<Integer> r;

    /* renamed from: tvd$e */
    static final class e extends akcs implements akbk<ajwl<abbd>> {
        public static final e a = new e();

        e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajwl();
        }
    }

    /* renamed from: tvd$c */
    static final class c extends akcs implements akbk<ajwo<ajxr<? extends Boolean, ? extends String, ? extends List<? extends String>>>> {
        public static final c a = new c();

        c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajwo();
        }
    }

    /* renamed from: tvd$a */
    static final class a extends akcs implements akbk<idd> {
        private /* synthetic */ toc a;

        a(toc toc) {
            this.a = toc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.callsite("PreviewDataSource");
        }
    }

    /* renamed from: tvd$g */
    static final class g extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;
        private /* synthetic */ toc b;

        g(zgb zgb, toc toc) {
            this.a = zgb;
            this.b = toc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(this.b.callsite("PreviewDataSource"));
        }
    }

    /* renamed from: tvd$f */
    static final class f<T, R> implements ajfc<T, R> {
        public static final f a = new f();

        f() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return Integer.valueOf(list.size());
        }
    }

    /* renamed from: tvd$b */
    static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
        final /* synthetic */ tvd a;

        /* renamed from: tvd$b$a */
        static final class a<T, R> implements ajfc<T, R> {
            private /* synthetic */ b a;
            private /* synthetic */ abyi b;
            private /* synthetic */ int c;

            a(b bVar, abyi abyi, int i) {
                this.a = bVar;
                this.b = abyi;
                this.c = i;
            }

            public final /* synthetic */ Object apply(Object obj) {
                List list = (List) obj;
                akcr.b(list, "it");
                ajwo b = this.a.a.b();
                Boolean bool = Boolean.TRUE;
                String str = this.b.b;
                Iterable<abyi> iterable = list;
                Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
                for (abyi abyi : iterable) {
                    arrayList.add(abyi.b);
                }
                b.a(new ajxr(bool, str, (List) arrayList));
                Collection arrayList2 = new ArrayList(ajyn.a((Iterable) iterable, 10));
                for (abyi a : iterable) {
                    arrayList2.add(ajxs.a(Integer.valueOf(this.c), a));
                }
                return (List) arrayList2;
            }
        }

        /* renamed from: tvd$b$b */
        static final class b<T, R> implements ajfc<T, Iterable<? extends U>> {
            public static final b a = new b();

            b() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                List list = (List) obj;
                akcr.b(list, "it");
                return list;
            }
        }

        b(tvd tvd) {
            this.a = tvd;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajzd ajzd = (ajzd) obj;
            akcr.b(ajzd, "indexedPreSplitMediaPackage");
            int i = ajzd.a;
            abyi abyi = (abyi) ajzd.b;
            if (abyi.a().b > 11000) {
                return this.a.m.b(((idd) this.a.n.b()), abyi).i().p(new a(this, abyi, i)).l(b.a);
            }
            this.a.b().a(new ajxr(Boolean.FALSE, null, null));
            return ajdp.b(ajxs.a(Integer.valueOf(i), abyi));
        }
    }

    /* renamed from: tvd$d */
    static final class d<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ tvd a;

        d(tvd tvd) {
            this.a = tvd;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "originalMedia");
            tvd tvd = this.a;
            akcr.b(list, "mediaPackages");
            Object a = ajdp.b(ajyu.n(list)).a((ajfc) new b(tvd)).a(16);
            akcr.a(a, "Observable.fromIterable(…               }.toList()");
            obj = a.d((ajfc) h.a).a((ajfc) new i(this.a, list.size())).a(16);
            akcr.a(obj, "mediaPackageList.flatMap…     }\n        }.toList()");
            ajdx a2 = obj.a();
            this.a.e = a2;
            return a2;
        }
    }

    /* renamed from: tvd$h */
    static final class h<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final h a = new h();

        h() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            final List list = (List) obj;
            akcr.b(list, Event.LIST);
            return ajdp.b(ajyu.n(list)).p(new ajfc<T, R>() {
                public final /* synthetic */ Object apply(Object obj) {
                    ajzd ajzd = (ajzd) obj;
                    akcr.b(ajzd, "it");
                    return ajxs.a(Integer.valueOf(list.size()), ajzd);
                }
            });
        }
    }

    /* renamed from: tvd$i */
    static final class i<T, R> implements ajfc<T, ajdt<? extends R>> {
        final /* synthetic */ int a;
        private /* synthetic */ tvd b;

        i(tvd tvd, int i) {
            this.b = tvd;
            this.a = i;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            final int intValue = ((Number) ajxm.a).intValue();
            ajzd ajzd = (ajzd) ajxm.b;
            final int i = ajzd.a;
            ajxm = (ajxm) ajzd.b;
            final int intValue2 = ((Number) ajxm.a).intValue();
            obj = (abyi) ajxm.b;
            if (!tpn.a(this.b.e())) {
                return ajdp.b(obj);
            }
            final abyo a = obj.a();
            return this.b.m.a(((idd) this.b.n.b()), (abyi) obj).b((ajdw) ((zfw) this.b.a.b()).b()).f(new ajfc<T, R>(this) {
                private /* synthetic */ i a;

                /* JADX WARNING: Missing block: B:9:0x0037, code skipped:
            defpackage.akax.a(r11, r0);
     */
                private defpackage.abyi a(defpackage.odt r11) {
                    /*
                    r10 = this;
                    r0 = "it";
                    defpackage.akcr.b(r11, r0);
                    r11 = (java.io.Closeable) r11;
                    r0 = 0;
                    r1 = r11;
                    r1 = (defpackage.odt) r1;	 Catch:{ Throwable -> 0x0035 }
                    r1 = r1.a();	 Catch:{ Throwable -> 0x0035 }
                    r9 = new abyo;	 Catch:{ Throwable -> 0x0035 }
                    r2 = r3;	 Catch:{ Throwable -> 0x0035 }
                    r3 = r2.a;	 Catch:{ Throwable -> 0x0035 }
                    r2 = r3;	 Catch:{ Throwable -> 0x0035 }
                    r4 = r2.b;	 Catch:{ Throwable -> 0x0035 }
                    r5 = r4;	 Catch:{ Throwable -> 0x0035 }
                    r2 = r10.a;	 Catch:{ Throwable -> 0x0035 }
                    r6 = r2.a;	 Catch:{ Throwable -> 0x0035 }
                    r7 = r5;	 Catch:{ Throwable -> 0x0035 }
                    r8 = r6;	 Catch:{ Throwable -> 0x0035 }
                    r2 = r9;
                    r2.<init>(r3, r4, r5, r6, r7, r8);	 Catch:{ Throwable -> 0x0035 }
                    r1 = r1.a(r9);	 Catch:{ Throwable -> 0x0035 }
                    r1 = r1.e();	 Catch:{ Throwable -> 0x0035 }
                    defpackage.akax.a(r11, r0);
                    return r1;
                L_0x0033:
                    r1 = move-exception;
                    goto L_0x0037;
                L_0x0035:
                    r0 = move-exception;
                    throw r0;	 Catch:{ all -> 0x0033 }
                L_0x0037:
                    defpackage.akax.a(r11, r0);
                    throw r1;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.tvd$i$1.a(odt):abyi");
                }

                public final /* synthetic */ Object apply(Object obj) {
                    return a((odt) obj);
                }
            }).i();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(tvd.class), "attribution", "getAttribution()Lcom/snap/framework/attribution/AttributedCallsite;"), new akdc(akde.a(tvd.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(tvd.class), "mediaOriginSubject", "getMediaOriginSubject()Lio/reactivex/subjects/BehaviorSubject;"), new akdc(akde.a(tvd.class), "autoSplitResultSubject", "getAutoSplitResultSubject()Lio/reactivex/subjects/PublishSubject;")};
    }

    public tvd(odu odu, toc toc, zgb zgb) {
        akcr.b(odu, "mediaPackageManager");
        akcr.b(toc, "previewFeature");
        akcr.b(zgb, "schedulersProvider");
        this.m = odu;
        this.n = ajxh.a(new a(toc));
        this.a = ajxh.a(new g(zgb, toc));
        Object ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create()");
        this.o = ajwl;
        ajwl = this.o.e();
        akcr.a(ajwl, "mediaPackagesSubject.firstOrError()");
        this.b = ajwl;
        this.r = this.o.p(f.a);
        this.c = new Object();
        ajwl = a();
        akcr.a(ajwl, "mediaOriginSubject");
        this.f = (ajdp) ajwl;
        ajwl = b();
        akcr.a(ajwl, "autoSplitResultSubject");
        this.g = (ajdp) ajwl;
        this.j = new tob(null, null, false, 31);
    }

    public final ajwl<abbd> a() {
        return (ajwl) this.p.b();
    }

    public final void a(List<abyi> list) {
        akcr.b(list, "newMediaPackage");
        synchronized (this.c) {
            this.d = null;
            this.e = null;
        }
        this.o.a((Object) list);
    }

    /* Access modifiers changed, original: final */
    public final ajwo<ajxr<Boolean, String, List<String>>> b() {
        return (ajwo) this.q.b();
    }

    public final int c() {
        List list = (List) this.o.p();
        return list != null ? list.size() : 0;
    }

    public final gcn d() {
        gcn gcn = this.k;
        if (gcn == null) {
            akcr.a("sendSessionSource");
        }
        return gcn;
    }

    public final tpl e() {
        tpl tpl = this.l;
        if (tpl == null) {
            akcr.a("previewStartUpConfig");
        }
        return tpl;
    }

    public final ajdx<List<abyi>> f() {
        synchronized (this.c) {
            if (akcr.a(this.b, this.d)) {
                ajdx ajdx = this.e;
                if (ajdx != null) {
                    return ajdx;
                }
            }
            this.d = this.b;
            Object a = this.b.a((ajfc) new d(this));
            akcr.a(a, "mediaPackages.flatMap { …plit = it }\n            }");
            return a;
        }
    }
}
