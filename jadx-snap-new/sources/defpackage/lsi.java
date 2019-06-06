package defpackage;

import defpackage.kqe.i;
import defpackage.kqe.s;
import defpackage.lsa.d;
import defpackage.lsa.d.a;
import defpackage.lsd.a.c;
import defpackage.lsd.b;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: lsi */
public final class lsi implements lrz {
    final kqf a;
    final mwa b;
    private final ajdp<lsd> c;
    private final lsa d;
    private final ajdu<b, b> e;
    private final boolean f;
    private final zfw g;

    /* renamed from: lsi$j */
    static final class j<V> implements Callable<ajdt<? extends T>> {
        private /* synthetic */ lsi a;
        private /* synthetic */ mux b;
        private /* synthetic */ boolean c;

        j(lsi lsi, mux mux, boolean z) {
            this.a = lsi;
            this.b = mux;
            this.c = z;
        }

        public final /* synthetic */ Object call() {
            ajdp ajdp = (ajdp) this.a.b.invoke(this.b);
            akbl akbl = lsj.b;
            if (akbl != null) {
                akbl = new lsm(akbl);
            }
            return ajdp.p((ajfc) akbl);
        }
    }

    /* renamed from: lsi$h */
    static final class h<T> implements ajfl<lsc> {
        public static final h a = new h();

        h() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            lsc lsc = (lsc) obj;
            akcr.b(lsc, "<name for destructuring parameter 0>");
            return lsc.c || lsc.b;
        }
    }

    /* renamed from: lsi$i */
    static final class i extends akcs implements akbl<lsc, b> {
        private /* synthetic */ lsi a;
        private /* synthetic */ boolean b;

        i(lsi lsi, boolean z) {
            this.a = lsi;
            this.b = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            b.b a;
            lsc lsc = (lsc) obj;
            akcr.b(lsc, "<name for destructuring parameter 0>");
            d dVar = lsc.a;
            boolean z = lsc.b;
            if (dVar instanceof a) {
                a aVar = (a) dVar;
                List a2 = this.a.a(aVar.c(), aVar.b(), this.b);
                int a3 = dVar instanceof a.b ? lsj.a(a2, ((a.b) dVar).a) : lsj.a(a2);
                boolean z2 = z || aVar.d() == lsa.b.EXTERNAL;
                b.b bVar = new b.b(false, a2, false, z2, null, 109);
                int i = (a3 >= bVar.b.size() || a3 < 0) ? 0 : a3;
                a = b.b.a(bVar, false, null, i, false, false, false, null, 123);
            } else {
                a = b.a.a;
            }
            return a;
        }
    }

    /* renamed from: lsi$c */
    static final class c<T> implements ajfb<ajxm<? extends lsd, ? extends b>> {
        public static final c a = new c();

        c() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            ((lsd) ajxm.a).accept((b) ajxm.b);
        }
    }

    /* renamed from: lsi$d */
    static final class d<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final d a = new d();

        /* renamed from: lsi$d$a */
        public static final class a<T> implements ajfl<Object> {
            public static final a a = new a();

            public final boolean test(Object obj) {
                akcr.b(obj, "it");
                return obj instanceof defpackage.lsd.a.a;
            }
        }

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            lsd lsd = (lsd) obj;
            akcr.b(lsd, "it");
            obj = lsd.a().a((ajfl) a.a).a(lsd.a.a.class);
            akcr.a(obj, "this.filter { it is R }.cast(R::class.java)");
            return obj;
        }
    }

    /* renamed from: lsi$a */
    static final class a<T> implements ajfb<defpackage.lsd.a.a> {
        private /* synthetic */ lsi a;

        a(lsi lsi) {
            this.a = lsi;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a.a(i.b);
        }
    }

    /* renamed from: lsi$e */
    static final class e<T, R> implements ajfc<T, R> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((lsd.a.a) obj, "it");
            return lsa.a.b.a;
        }
    }

    /* renamed from: lsi$f */
    static final class f<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final f a = new f();

        /* renamed from: lsi$f$a */
        public static final class a<T> implements ajfl<Object> {
            public static final a a = new a();

            public final boolean test(Object obj) {
                akcr.b(obj, "it");
                return obj instanceof c;
            }
        }

        f() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            lsd lsd = (lsd) obj;
            akcr.b(lsd, "it");
            obj = lsd.a().a((ajfl) a.a).a(c.class);
            akcr.a(obj, "this.filter { it is R }.cast(R::class.java)");
            return obj;
        }
    }

    /* renamed from: lsi$g */
    static final class g<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final g a = new g();

        g() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            c cVar = (c) obj;
            akcr.b(cVar, "it");
            mhs d = cVar.b.d();
            String str = "just(CarouselUseCase.Act…                       ))";
            if (d instanceof mhs.b) {
                obj = ajdp.b(new lsa.a.a.c((mhs.b) d, lsa.b.INTERNAL));
                akcr.a(obj, str);
                return obj;
            } else if (cVar.b instanceof lrw.a.c) {
                obj = ajdp.b(new lsa.a.a.a(lsa.b.INTERNAL));
                akcr.a(obj, str);
                return obj;
            } else {
                obj = ajvo.a(ajot.a);
                akcr.a(obj, "empty()");
                return obj;
            }
        }
    }

    /* renamed from: lsi$b */
    static final class b<T> implements ajfb<lsa.a.a> {
        private /* synthetic */ lsi a;

        b(lsi lsi) {
            this.a = lsi;
        }

        public final /* synthetic */ void accept(Object obj) {
            lsa.a.a aVar = (lsa.a.a) obj;
            if (aVar instanceof lsa.a.a.c) {
                this.a.a.a(new s(((lsa.a.a.c) aVar).a.a));
            }
        }
    }

    public lsi(ajdp<lsd> ajdp, lsa lsa, ajdu<b, b> ajdu, boolean z, zfw zfw, kqf kqf, mwa mwa) {
        akcr.b(ajdp, "view");
        akcr.b(lsa, "carouselUseCase");
        akcr.b(ajdu, "carouselViewModelTransformer");
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(kqf, "analyticsEventHandler");
        akcr.b(mwa, "lensDownloadStatusProvider");
        this.c = ajdp;
        this.d = lsa;
        this.e = ajdu;
        this.f = z;
        this.g = zfw;
        this.a = kqf;
        this.b = mwa;
    }

    private final lrw.a a(mux mux, boolean z) {
        mhs mhs = mux.a;
        miq miq = mux.f;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(mux.a);
        stringBuilder.append(':');
        stringBuilder.append(mux.k.a());
        String stringBuilder2 = stringBuilder.toString();
        Object a = ajdp.a((Callable) new j(this, mux, z)).a((ajdw) this.g.l());
        akcr.a(a, "Observable.defer {\n     …dSchedulers.mainThread())");
        return new lrw.a.a(mhs, z, miq, stringBuilder2, a);
    }

    public final ajej a() {
        List a = !this.f ? ajyl.a(new lrw.a.c(false, false, 3)) : ajyw.a;
        ajdp b = this.d.b();
        Object lsc = new lsc();
        akbw akbw = lsj.a;
        if (akbw != null) {
            akbw = new lsl(akbw);
        }
        Object a2 = b.b(lsc, (ajex) akbw).b(1).a((ajfl) h.a);
        akcr.a(a2, "carouselUseCase.outputs\n…nChanged || listChanged }");
        a2 = mip.c(a2, "DefaultCarouselPresenter:viewModelTransform").p(new lsm(new i(this, this.f))).h((Object) new b.b(false, a, false, false, null, 125)).a((ajdw) this.g.h()).a(this.e).h(b.a.a);
        ajej[] ajejArr = new ajej[3];
        ajdp ajdp = this.c;
        akcr.a(a2, "viewModels");
        ajejArr[0] = myu.a(ajdp, a2).a((ajdw) this.g.l()).f((ajfb) c.a);
        a2 = this.c.a((ajdw) this.g.l()).u(d.a);
        akcr.a(a2, "view.observeOn(qualified… { it.closeButtonClicks }");
        ajejArr[1] = mip.c(a2, "DefaultCarouselPresenter:closeButtonDownstream").d((ajfb) new a(this)).p(e.a).f(this.d.a());
        a2 = this.c.a((ajdw) this.g.l()).u(f.a);
        akcr.a(a2, "view.observeOn(qualified…Map { it.itemSelections }");
        ajejArr[2] = mip.c(a2, "DefaultCarouselPresenter:itemSelectionsDownstream").u(g.a).d((ajfb) new b(this)).f(this.d.a());
        return new ajei(ajejArr);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x0075 in {3, 4, 8, 12, 14, 16} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    final java.util.List<defpackage.lrw.a> a(java.util.List<defpackage.mux> r6, java.util.List<defpackage.mux> r7, boolean r8) {
        /*
        r5 = this;
        r0 = 0;
        r1 = 1;
        if (r8 != 0) goto L_0x000e;
        r8 = new lrw$a$c;	 Catch:{ all -> 0x0073 }
        r8.<init>(r0, r1, r1);	 Catch:{ all -> 0x0073 }
        r8 = defpackage.ajyl.a(r8);	 Catch:{ all -> 0x0073 }
        goto L_0x0012;	 Catch:{ all -> 0x0073 }
        r8 = defpackage.ajyw.a;	 Catch:{ all -> 0x0073 }
        r8 = (java.util.List) r8;	 Catch:{ all -> 0x0073 }
        r6 = (java.lang.Iterable) r6;	 Catch:{ all -> 0x0073 }
        r2 = new java.util.ArrayList;	 Catch:{ all -> 0x0073 }
        r3 = 10;	 Catch:{ all -> 0x0073 }
        r4 = defpackage.ajyn.a(r6, r3);	 Catch:{ all -> 0x0073 }
        r2.<init>(r4);	 Catch:{ all -> 0x0073 }
        r2 = (java.util.Collection) r2;	 Catch:{ all -> 0x0073 }
        r6 = r6.iterator();	 Catch:{ all -> 0x0073 }
        r4 = r6.hasNext();	 Catch:{ all -> 0x0073 }
        if (r4 == 0) goto L_0x0039;	 Catch:{ all -> 0x0073 }
        r4 = r6.next();	 Catch:{ all -> 0x0073 }
        r4 = (defpackage.mux) r4;	 Catch:{ all -> 0x0073 }
        r4 = r5.a(r4, r1);	 Catch:{ all -> 0x0073 }
        r2.add(r4);	 Catch:{ all -> 0x0073 }
        goto L_0x0025;	 Catch:{ all -> 0x0073 }
        r2 = (java.util.List) r2;	 Catch:{ all -> 0x0073 }
        r7 = (java.lang.Iterable) r7;	 Catch:{ all -> 0x0073 }
        r6 = new java.util.ArrayList;	 Catch:{ all -> 0x0073 }
        r1 = defpackage.ajyn.a(r7, r3);	 Catch:{ all -> 0x0073 }
        r6.<init>(r1);	 Catch:{ all -> 0x0073 }
        r6 = (java.util.Collection) r6;	 Catch:{ all -> 0x0073 }
        r7 = r7.iterator();	 Catch:{ all -> 0x0073 }
        r1 = r7.hasNext();	 Catch:{ all -> 0x0073 }
        if (r1 == 0) goto L_0x0060;	 Catch:{ all -> 0x0073 }
        r1 = r7.next();	 Catch:{ all -> 0x0073 }
        r1 = (defpackage.mux) r1;	 Catch:{ all -> 0x0073 }
        r1 = r5.a(r1, r0);	 Catch:{ all -> 0x0073 }
        r6.add(r1);	 Catch:{ all -> 0x0073 }
        goto L_0x004c;	 Catch:{ all -> 0x0073 }
        r6 = (java.util.List) r6;	 Catch:{ all -> 0x0073 }
        r2 = (java.util.Collection) r2;	 Catch:{ all -> 0x0073 }
        r8 = (java.lang.Iterable) r8;	 Catch:{ all -> 0x0073 }
        r7 = defpackage.ajyu.d(r2, r8);	 Catch:{ all -> 0x0073 }
        r7 = (java.util.Collection) r7;	 Catch:{ all -> 0x0073 }
        r6 = (java.lang.Iterable) r6;	 Catch:{ all -> 0x0073 }
        r6 = defpackage.ajyu.d(r7, r6);	 Catch:{ all -> 0x0073 }
        return r6;
        r6 = move-exception;
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lsi.a(java.util.List, java.util.List, boolean):java.util.List");
    }

    public final ajdp<Object> b() {
        return mha.a.a(this);
    }
}
