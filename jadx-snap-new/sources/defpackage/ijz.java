package defpackage;

import com.google.common.base.Optional;
import com.looksery.sdk.ProfilingSessionReceiver;
import defpackage.ijm.c;
import defpackage.ijy.d;
import defpackage.ijy.e;
import defpackage.ijy.f;
import defpackage.ikb.i;
import defpackage.ikb.j;
import defpackage.ikb.k;
import defpackage.ikb.l;
import defpackage.ikb.m;
import defpackage.ikb.n;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ijz */
public final class ijz implements ijb {
    final ajxe a;
    final ajxe b;
    znh<zmy> c = znk.a;
    final ajxe d;
    final ajxe e;
    final ajxe f;
    int g;
    final ijc h;
    final ajwy<ilv> i;
    final ihh j;
    final ajwy<ftl> k;
    final ajdx<iha> l;
    private final ajxe m;
    private final ajxe n;
    private final ajxe o;
    private final ajxe p = ajxh.a(y.a);
    private final ajxe q = ajxh.a(g.a);
    private final ajxe r = ajxh.a(h.a);
    private final ajxe s = ajxh.a(w.a);
    private final ajxe t = ajxh.a(v.a);

    /* renamed from: ijz$y */
    static final class y extends akcs implements akbk<ajwo<zmy>> {
        public static final y a = new y();

        y() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajwo();
        }
    }

    /* renamed from: ijz$g */
    static final class g extends akcs implements akbk<ajwl<znh<zmy>>> {
        public static final g a = new g();

        g() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajwl();
        }
    }

    /* renamed from: ijz$h */
    static final class h extends akcs implements akbk<ajwo<znh<zmy>>> {
        public static final h a = new h();

        h() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajwo();
        }
    }

    /* renamed from: ijz$w */
    static final class w extends akcs implements akbk<Set<Long>> {
        public static final w a = new w();

        w() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: ijz$v */
    static final class v extends akcs implements akbk<ConcurrentHashMap<String, AtomicInteger>> {
        public static final v a = new v();

        v() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: ijz$e */
    static final class e extends akcs implements akbk<ijy> {
        private /* synthetic */ ajwy a;

        e(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ijy) this.a.get();
        }
    }

    /* renamed from: ijz$k */
    static final class k extends akcs implements akbk<ikb> {
        private /* synthetic */ ajwy a;

        k(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ikb) this.a.get();
        }
    }

    /* renamed from: ijz$c */
    static final class c extends akcs implements akbk<ijv> {
        private /* synthetic */ ajwy a;

        c(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ijv) this.a.get();
        }
    }

    /* renamed from: ijz$d */
    static final class d extends akcs implements akbk<ijx> {
        private /* synthetic */ ajwy a;

        d(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ijx) this.a.get();
        }
    }

    /* renamed from: ijz$a */
    static final class a extends akcs implements akbk<ijm> {
        private /* synthetic */ ajwy a;

        a(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ijm) this.a.get();
        }
    }

    /* renamed from: ijz$x */
    static final class x extends akcs implements akbk<zfw> {
        private /* synthetic */ ajwy a;

        x(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.get();
            return zgb.a(ika.a);
        }
    }

    /* renamed from: ijz$b */
    static final class b extends akcs implements akbk<ajdp<Map<String, ? extends ahyn>>> {
        private /* synthetic */ ijz a;

        b(ijz ijz) {
            this.a = ijz;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.b.b();
            Object obj = this.a.k.get();
            akcr.a(obj, "compositeConfigProvider.get()");
            ftl ftl = (ftl) obj;
            ajdx ajdx = this.a.l;
            zfw zfw = (zfw) this.a.d.b();
            akcr.b(ftl, "configProvider");
            akcr.b(ajdx, "serializationHelper");
            akcr.b(zfw, "schedulers");
            obj = ftl.u(zpt.ORDERED_CAROUSEL_CONFIG).b((ajdw) zfw.b());
            akcr.a(obj, "configProvider.observeSt…schedulers.computation())");
            Object b = ajdx.i().b((ajdw) zfw.b());
            akcr.a(b, "serializationHelper.toOb…schedulers.computation())");
            obj = ajwb.b(obj, (ajdt) b).a((ajdw) zfw.b()).p(c.a).c();
            akcr.a(obj, "configProvider.observeSt…\n                .cache()");
            return obj;
        }
    }

    /* renamed from: ijz$f */
    static final class f extends akcs implements akbk<gqr> {
        private /* synthetic */ ajwy a;

        f(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (gqr) this.a.get();
        }
    }

    /* renamed from: ijz$l */
    static final class l<T> implements ajfb<List<? extends abzy>> {
        private /* synthetic */ akdd.c a;

        l(akdd.c cVar) {
            this.a = cVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            List list = (List) obj;
            this.a.a = list.size();
        }
    }

    /* renamed from: ijz$n */
    static final class n<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final n a = new n();

        n() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return ajdp.b((Iterable) list);
        }
    }

    /* renamed from: ijz$o */
    static final class o<T> implements ajfl<abzy> {
        private /* synthetic */ ijz a;

        o(ijz ijz) {
            this.a = ijz;
        }

        private boolean a(abzy abzy) {
            akcr.b(abzy, "it");
            try {
                Set f = this.a.f();
                Object a = abzy.a();
                akcr.a(a, "it.id");
                return f.contains(Long.valueOf(Long.parseLong(a))) ^ 1;
            } catch (Exception e) {
                ((gqr) this.a.f.b()).a(gqt.NORMAL, e, ika.a);
                return false;
            }
        }

        public final /* synthetic */ boolean test(Object obj) {
            return a((abzy) obj);
        }
    }

    /* renamed from: ijz$p */
    static final class p<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ ijz a;
        private /* synthetic */ ajdp b;

        p(ijz ijz, ajdp ajdp) {
            this.a = ijz;
            this.b = ajdp;
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (abzy) obj;
            akcr.b(obj, "it");
            ijz ijz = this.a;
            ajdp ajdp = this.b;
            akcr.b(obj, ProfilingSessionReceiver.EXTRA_STRING_FIELD_FILTER);
            akcr.b(ajdp, "previewVisibleObservable");
            obj = ajdp.b(obj).k((ajfc) new z(ijz, ajdp)).k((ajfc) new aa(ijz, ajdp)).k((ajfc) new ab(ijz, ajdp)).d((ajfb) new ac(ijz, obj));
            akcr.a(obj, "Observable.just(filter)\n…  }\n                    }");
            return obj;
        }
    }

    /* renamed from: ijz$q */
    static final class q<T> implements ajfl<zmy> {
        public static final q a = new q();

        q() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            zmy zmy = (zmy) obj;
            akcr.b(zmy, "it");
            return zmy instanceof ilj;
        }
    }

    /* renamed from: ijz$r */
    static final class r<T> implements ajfb<zmy> {
        private /* synthetic */ ijz a;
        private /* synthetic */ akdd.c b;
        private /* synthetic */ long c;

        r(ijz ijz, akdd.c cVar, long j) {
            this.a = ijz;
            this.b = cVar;
            this.c = j;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (zmy) obj;
            Set f = this.a.f();
            akcr.a(obj, "it");
            f.add(Long.valueOf(obj.getId()));
            ijz ijz = this.a;
            int i = this.b.a;
            long c = ijz.j.c() - this.c;
            if (ijz.f().size() == 1) {
                ((ilv) ijz.i.get()).a((ily) iod.FIRST_FILTER_PREPARE_TIME, c);
            }
            if (ijz.f().size() == i) {
                ilv ilv = (ilv) ijz.i.get();
                String valueOf = String.valueOf(i);
                akcr.b(valueOf, "geofilterCount");
                ilv.a(iod.GEOFILTER_PREPARE_TIME.a("geofilter_count", valueOf), c);
            }
        }
    }

    /* renamed from: ijz$s */
    static final class s<T, R> implements ajfc<T, R> {
        public static final s a = new s();

        s() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (zmy) obj;
            akcr.b(obj, "it");
            return znk.a(obj);
        }
    }

    /* renamed from: ijz$t */
    static final class t<T, R> implements ajfc<T, ajdt<? extends R>> {
        final /* synthetic */ ijz a;
        final /* synthetic */ String b;

        /* renamed from: ijz$t$a */
        static final class a<T, R> implements ajfc<T, R> {
            private /* synthetic */ t a;
            private /* synthetic */ znh b;

            a(t tVar, znh znh) {
                this.a = tVar;
                this.b = znh;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:70:0x01f8 in {7, 10, 11, 13, 14, 15, 18, 28, 31, 39, 40, 41, 43, 44, 52, 53, 55, 56, 59, 62, 63, 65, 67, 69} preds:[]
                	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
                	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
                	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
                	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
                	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
                	at java.util.ArrayList.forEach(ArrayList.java:1257)
                	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
                	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
                	at java.util.ArrayList.forEach(ArrayList.java:1257)
                	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
                	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
                	at java.util.ArrayList.forEach(ArrayList.java:1257)
                	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
                	at jadx.core.ProcessClass.process(ProcessClass.java:32)
                	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
                	at jadx.api.JavaClass.decompile(JavaClass.java:62)
                	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
                */
            public final /* synthetic */ java.lang.Object apply(java.lang.Object r20) {
                /*
                r19 = this;
                r0 = r19;
                r1 = r20;
                r1 = (java.util.Map) r1;
                r2 = "it";
                defpackage.akcr.b(r1, r2);
                r2 = r0.a;
                r2 = r2.a;
                r2 = r2.c;
                r2 = (java.lang.Iterable) r2;
                r2 = defpackage.ajyu.k(r2);
                r2 = defpackage.znk.a(r2);
                r3 = r0.b;
                r3 = r3.a();
                r4 = 0;
                r5 = 1;
                if (r3 != r5) goto L_0x0077;
                r3 = r2;
                r3 = (java.lang.Iterable) r3;
                r3 = r3.iterator();
                r6 = 0;
                r7 = r3.hasNext();
                r8 = "newFilter[0]";
                if (r7 == 0) goto L_0x0060;
                r7 = r3.next();
                if (r6 >= 0) goto L_0x003e;
                defpackage.ajym.a();
                r7 = (defpackage.zmy) r7;
                r9 = r7.getId();
                r7 = r0.b;
                r7 = r7.a(r4);
                defpackage.akcr.a(r7, r8);
                r7 = (defpackage.zmy) r7;
                r11 = r7.getId();
                r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
                if (r7 != 0) goto L_0x0059;
                r7 = 1;
                goto L_0x005a;
                r7 = 0;
                if (r7 == 0) goto L_0x005d;
                goto L_0x0061;
                r6 = r6 + 1;
                goto L_0x002d;
                r6 = -1;
                if (r6 < 0) goto L_0x0077;
                r1 = new znl;
                r1.<init>(r2);
                r2 = r0.b;
                r2 = r2.a(r4);
                defpackage.akcr.a(r2, r8);
                r1.a(r6, r2);
                r1 = (defpackage.znh) r1;
                return r1;
                r3 = new ijn;
                r6 = new ijp;
                r6.<init>(r1);
                r6 = (java.util.Comparator) r6;
                r7 = new ijr;
                r7.<init>(r1);
                r7 = (java.util.Comparator) r7;
                r3.<init>(r6, r7, r1);
                r2 = (java.lang.Iterable) r2;
                r1 = defpackage.ajyu.m(r2);
                r2 = "null cannot be cast to non-null type kotlin.collections.Set<com.snap.geofilters.ui.viewmodel.GeoFilterPageViewModelBase>";
                if (r1 == 0) goto L_0x01f2;
                r6 = r0.b;
                r7 = "newFilter";
                defpackage.akcr.a(r6, r7);
                r6 = (java.lang.Iterable) r6;
                r6 = defpackage.ajyu.m(r6);
                if (r6 == 0) goto L_0x01ec;
                r2 = r0.a;
                r2 = r2.a;
                r2 = r2.g;
                r7 = r0.a;
                r7 = r7.b;
                r8 = "existingGeofilters";
                defpackage.akcr.b(r1, r8);
                r8 = "newGeofilters";
                defpackage.akcr.b(r6, r8);
                r8 = r3.b;
                r8 = defpackage.ijn.a.a(r1, r8);
                r9 = r3.b;
                r6 = defpackage.ijn.a.a(r6, r9);
                r9 = r3.c;
                r10 = r3.b;
                r11 = new java.util.TreeSet;
                r11.<init>(r10);
                r6 = r6.entrySet();
                r6 = r6.iterator();
                r12 = r6.hasNext();
                if (r12 == 0) goto L_0x01b5;
                r12 = r6.next();
                r12 = (java.util.Map.Entry) r12;
                r13 = r12.getKey();
                r13 = (java.lang.String) r13;
                r12 = r12.getValue();
                r12 = (java.util.TreeSet) r12;
                r14 = r9.get(r13);
                r14 = (defpackage.ahyn) r14;
                if (r14 != 0) goto L_0x00f8;
                r14 = defpackage.ijn.a.a();
                r13 = r8.get(r13);
                r13 = (java.util.TreeSet) r13;
                if (r13 != 0) goto L_0x0105;
                r13 = new java.util.TreeSet;
                r13.<init>(r10);
                r15 = new java.util.TreeSet;
                r4 = r12.comparator();
                r15.<init>(r4);
                r4 = new java.util.TreeSet;
                r5 = r12.comparator();
                r4.<init>(r5);
                r12 = (java.lang.Iterable) r12;
                r5 = new java.util.ArrayList;
                r5.<init>();
                r5 = (java.util.Collection) r5;
                r16 = r12.iterator();
                r17 = r16.hasNext();
                if (r17 == 0) goto L_0x0159;
                r0 = r16.next();
                r17 = r6;
                r6 = r0;
                r6 = (defpackage.ilj) r6;
                r18 = r8;
                r8 = r6.c;
                r8 = r8.r();
                if (r8 != 0) goto L_0x014c;
                r6 = r6.c;
                r6 = r6.a();
                r6 = defpackage.akcr.a(r7, r6);
                if (r6 == 0) goto L_0x014a;
                goto L_0x014c;
                r6 = 0;
                goto L_0x014d;
                r6 = 1;
                if (r6 == 0) goto L_0x0152;
                r5.add(r0);
                r0 = r19;
                r6 = r17;
                r8 = r18;
                goto L_0x0124;
                r17 = r6;
                r18 = r8;
                r5 = (java.util.List) r5;
                r5 = (java.util.Collection) r5;
                r15.addAll(r5);
                r0 = new java.util.ArrayList;
                r0.<init>();
                r0 = (java.util.Collection) r0;
                r5 = r12.iterator();
                r6 = r5.hasNext();
                if (r6 == 0) goto L_0x019b;
                r6 = r5.next();
                r8 = r6;
                r8 = (defpackage.ilj) r8;
                r12 = r8.c;
                r12 = r12.r();
                if (r12 != 0) goto L_0x0194;
                r8 = r8.c;
                r8 = r8.a();
                r8 = defpackage.akcr.a(r7, r8);
                r12 = 1;
                r8 = r8 ^ r12;
                if (r8 == 0) goto L_0x0194;
                r8 = 1;
                goto L_0x0195;
                r8 = 0;
                if (r8 == 0) goto L_0x016f;
                r0.add(r6);
                goto L_0x016f;
                r0 = (java.util.List) r0;
                r0 = (java.util.Collection) r0;
                r4.addAll(r0);
                r0 = defpackage.ijn.a.a(r13, r4, r15, r14);
                r0 = (java.util.Collection) r0;
                r11.addAll(r0);
                r4 = 0;
                r5 = 1;
                r0 = r19;
                r6 = r17;
                r8 = r18;
                goto L_0x00d4;
                r11 = (java.util.Collection) r11;
                r0 = com.google.common.collect.ImmutableSet.copyOf(r11);
                r4 = "ImmutableSet.copyOf<GeoF…ageViewModelBase>(result)";
                defpackage.akcr.a(r0, r4);
                r0 = (java.util.Set) r0;
                if (r2 != 0) goto L_0x01c5;
                goto L_0x01cd;
                r4 = defpackage.ijo.a;
                r5 = 1;
                r2 = r2 - r5;
                r2 = r4[r2];
                if (r2 == r5) goto L_0x01d0;
                r2 = r3.a;
                goto L_0x01d2;
                r2 = r3.b;
                r3 = new java.util.TreeSet;
                r3.<init>(r2);
                r1 = (java.util.Collection) r1;
                r3.addAll(r1);
                r0 = (java.util.Collection) r0;
                r3.addAll(r0);
                r3 = (java.lang.Iterable) r3;
                r0 = defpackage.ajyu.k(r3);
                r0 = defpackage.znk.a(r0);
                return r0;
                r0 = new ajxt;
                r0.<init>(r2);
                throw r0;
                r0 = new ajxt;
                r0.<init>(r2);
                throw r0;
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ijz$t$a.apply(java.lang.Object):java.lang.Object");
            }
        }

        t(ijz ijz, String str) {
            this.a = ijz;
            this.b = str;
        }

        private ajdp<znh<zmy>> a(znh<zmy> znh) {
            akcr.b(znh, "newFilter");
            return ((ajdp) this.a.e.b()).p(new a(this, znh));
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((znh) obj);
        }
    }

    /* renamed from: ijz$u */
    static final class u<T> implements ajfb<znh<zmy>> {
        private /* synthetic */ ijz a;

        u(ijz ijz) {
            this.a = ijz;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (znh) obj;
            ijz ijz = this.a;
            akcr.a(obj, "it");
            ijz.c = obj;
            this.a.e().a(obj);
            this.a.h.a = (long) this.a.c.a();
        }
    }

    /* renamed from: ijz$m */
    static final class m implements ajev {
        private /* synthetic */ ijz a;

        m(ijz ijz) {
            this.a = ijz;
        }

        public final void run() {
            ijz ijz = this.a;
            ilv ilv = (ilv) ijz.i.get();
            for (Entry entry : ijz.g().entrySet()) {
                String str = (String) entry.getKey();
                AtomicInteger atomicInteger = (AtomicInteger) entry.getValue();
                akcr.b(str, "carouselGroup");
                ilv.b(iod.GEOFILTER_LOADED_COUNT.a("carousel_group", str), atomicInteger.longValue());
            }
        }
    }

    /* renamed from: ijz$aa */
    static final class aa<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ ijz a;
        private /* synthetic */ ajdp b;

        aa(ijz ijz, ajdp ajdp) {
            this.a = ijz;
            this.b = ajdp;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:78:0x0176 in {4, 7, 11, 15, 25, 26, 27, 31, 32, 37, 38, 39, 43, 48, 49, 50, 52, 53, 55, 56, 58, 59, 64, 65, 68, 69, 71, 73, 75, 77} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        private defpackage.ajdp<defpackage.abzy> a(defpackage.abzy r11) {
            /*
            r10 = this;
            r0 = "geofilter";
            r1 = "it";
            defpackage.akcr.b(r11, r1);
            r2 = r10.a;	 Catch:{ all -> 0x0174 }
            r2 = r2.d();	 Catch:{ all -> 0x0174 }
            defpackage.akcr.b(r11, r0);	 Catch:{ all -> 0x0174 }
            r3 = r11.g();	 Catch:{ all -> 0x0174 }
            if (r3 != 0) goto L_0x001a;	 Catch:{ all -> 0x0174 }
            r3 = defpackage.ajyw.a;	 Catch:{ all -> 0x0174 }
            r3 = (java.util.List) r3;	 Catch:{ all -> 0x0174 }
            r3 = r3.isEmpty();	 Catch:{ all -> 0x0174 }
            if (r3 == 0) goto L_0x002b;	 Catch:{ all -> 0x0174 }
            r11 = defpackage.ajdp.b(r11);	 Catch:{ all -> 0x0174 }
            r0 = "Observable.just(geofilter)";	 Catch:{ all -> 0x0174 }
            defpackage.akcr.a(r11, r0);	 Catch:{ all -> 0x0174 }
            goto L_0x016d;	 Catch:{ all -> 0x0174 }
            r3 = defpackage.ijd.a;	 Catch:{ all -> 0x0174 }
            r3 = r3.getPage();	 Catch:{ all -> 0x0174 }
            r3 = (defpackage.idl) r3;	 Catch:{ all -> 0x0174 }
            r3 = defpackage.rzg.a.a(r3);	 Catch:{ all -> 0x0174 }
            r4 = r11.g();	 Catch:{ all -> 0x0174 }
            if (r4 != 0) goto L_0x0040;	 Catch:{ all -> 0x0174 }
            defpackage.akcr.a();	 Catch:{ all -> 0x0174 }
            r5 = "geofilter.dynamicContent!!";	 Catch:{ all -> 0x0174 }
            defpackage.akcr.a(r4, r5);	 Catch:{ all -> 0x0174 }
            r4 = (java.lang.Iterable) r4;	 Catch:{ all -> 0x0174 }
            r5 = r4 instanceof java.util.Collection;	 Catch:{ all -> 0x0174 }
            r6 = 1;	 Catch:{ all -> 0x0174 }
            r7 = 0;	 Catch:{ all -> 0x0174 }
            if (r5 == 0) goto L_0x0056;	 Catch:{ all -> 0x0174 }
            r5 = r4;	 Catch:{ all -> 0x0174 }
            r5 = (java.util.Collection) r5;	 Catch:{ all -> 0x0174 }
            r5 = r5.isEmpty();	 Catch:{ all -> 0x0174 }
            if (r5 != 0) goto L_0x00be;	 Catch:{ all -> 0x0174 }
            r4 = r4.iterator();	 Catch:{ all -> 0x0174 }
            r5 = r4.hasNext();	 Catch:{ all -> 0x0174 }
            if (r5 == 0) goto L_0x00be;	 Catch:{ all -> 0x0174 }
            r5 = r4.next();	 Catch:{ all -> 0x0174 }
            r5 = (defpackage.aenn) r5;	 Catch:{ all -> 0x0174 }
            defpackage.akcr.a(r5, r1);	 Catch:{ all -> 0x0174 }
            r8 = "receiver$0";	 Catch:{ all -> 0x0174 }
            defpackage.akcr.b(r5, r8);	 Catch:{ all -> 0x0174 }
            r8 = r5.a();	 Catch:{ all -> 0x0174 }
            r9 = defpackage.aenn.a.TEXT;	 Catch:{ all -> 0x0174 }
            if (r8 != r9) goto L_0x00b9;	 Catch:{ all -> 0x0174 }
            r8 = r5.c;	 Catch:{ all -> 0x0174 }
            r8 = (java.lang.CharSequence) r8;	 Catch:{ all -> 0x0174 }
            if (r8 == 0) goto L_0x0085;	 Catch:{ all -> 0x0174 }
            r8 = r8.length();	 Catch:{ all -> 0x0174 }
            if (r8 != 0) goto L_0x0083;	 Catch:{ all -> 0x0174 }
            goto L_0x0085;	 Catch:{ all -> 0x0174 }
            r8 = 0;	 Catch:{ all -> 0x0174 }
            goto L_0x0086;	 Catch:{ all -> 0x0174 }
            r8 = 1;	 Catch:{ all -> 0x0174 }
            if (r8 != 0) goto L_0x00b9;	 Catch:{ all -> 0x0174 }
            r8 = r5.e;	 Catch:{ all -> 0x0174 }
            r9 = 0;	 Catch:{ all -> 0x0174 }
            if (r8 == 0) goto L_0x0090;	 Catch:{ all -> 0x0174 }
            r8 = r8.d;	 Catch:{ all -> 0x0174 }
            goto L_0x0091;	 Catch:{ all -> 0x0174 }
            r8 = r9;	 Catch:{ all -> 0x0174 }
            r8 = (java.lang.CharSequence) r8;	 Catch:{ all -> 0x0174 }
            if (r8 == 0) goto L_0x009e;	 Catch:{ all -> 0x0174 }
            r8 = r8.length();	 Catch:{ all -> 0x0174 }
            if (r8 != 0) goto L_0x009c;	 Catch:{ all -> 0x0174 }
            goto L_0x009e;	 Catch:{ all -> 0x0174 }
            r8 = 0;	 Catch:{ all -> 0x0174 }
            goto L_0x009f;	 Catch:{ all -> 0x0174 }
            r8 = 1;	 Catch:{ all -> 0x0174 }
            if (r8 == 0) goto L_0x00b9;	 Catch:{ all -> 0x0174 }
            r5 = r5.e;	 Catch:{ all -> 0x0174 }
            if (r5 == 0) goto L_0x00a7;	 Catch:{ all -> 0x0174 }
            r9 = r5.k;	 Catch:{ all -> 0x0174 }
            r9 = (java.lang.CharSequence) r9;	 Catch:{ all -> 0x0174 }
            if (r9 == 0) goto L_0x00b4;	 Catch:{ all -> 0x0174 }
            r5 = r9.length();	 Catch:{ all -> 0x0174 }
            if (r5 != 0) goto L_0x00b2;	 Catch:{ all -> 0x0174 }
            goto L_0x00b4;	 Catch:{ all -> 0x0174 }
            r5 = 0;	 Catch:{ all -> 0x0174 }
            goto L_0x00b5;	 Catch:{ all -> 0x0174 }
            r5 = 1;	 Catch:{ all -> 0x0174 }
            if (r5 == 0) goto L_0x00b9;	 Catch:{ all -> 0x0174 }
            r5 = 1;	 Catch:{ all -> 0x0174 }
            goto L_0x00ba;	 Catch:{ all -> 0x0174 }
            r5 = 0;	 Catch:{ all -> 0x0174 }
            if (r5 == 0) goto L_0x005a;	 Catch:{ all -> 0x0174 }
            r1 = 1;	 Catch:{ all -> 0x0174 }
            goto L_0x00bf;	 Catch:{ all -> 0x0174 }
            r1 = 0;	 Catch:{ all -> 0x0174 }
            if (r1 == 0) goto L_0x00c8;	 Catch:{ all -> 0x0174 }
            r1 = defpackage.gdy.IGNORE_READ_CACHE;	 Catch:{ all -> 0x0174 }
            r1 = defpackage.ajzs.a(r1);	 Catch:{ all -> 0x0174 }
            goto L_0x00cc;	 Catch:{ all -> 0x0174 }
            r1 = defpackage.ajyy.a;	 Catch:{ all -> 0x0174 }
            r1 = (java.util.Set) r1;	 Catch:{ all -> 0x0174 }
            r4 = r2.d;	 Catch:{ all -> 0x0174 }
            r4 = r4.b();	 Catch:{ all -> 0x0174 }
            r4 = (defpackage.ils) r4;	 Catch:{ all -> 0x0174 }
            r5 = r2.c();	 Catch:{ all -> 0x0174 }
            r8 = "filterDataProvider";	 Catch:{ all -> 0x0174 }
            defpackage.akcr.a(r5, r8);	 Catch:{ all -> 0x0174 }
            defpackage.akcr.b(r11, r0);	 Catch:{ all -> 0x0174 }
            r0 = "dynamicFilterDataProvider";	 Catch:{ all -> 0x0174 }
            defpackage.akcr.b(r5, r0);	 Catch:{ all -> 0x0174 }
            r0 = r4.a();	 Catch:{ all -> 0x0174 }
            r8 = r11.a();	 Catch:{ all -> 0x0174 }
            r0 = r0.get(r8);	 Catch:{ all -> 0x0174 }
            r0 = (java.lang.String) r0;	 Catch:{ all -> 0x0174 }
            r8 = r0;	 Catch:{ all -> 0x0174 }
            r8 = (java.lang.CharSequence) r8;	 Catch:{ all -> 0x0174 }
            if (r8 == 0) goto L_0x0100;	 Catch:{ all -> 0x0174 }
            r8 = r8.length();	 Catch:{ all -> 0x0174 }
            if (r8 != 0) goto L_0x00ff;	 Catch:{ all -> 0x0174 }
            goto L_0x0100;	 Catch:{ all -> 0x0174 }
            r6 = 0;	 Catch:{ all -> 0x0174 }
            if (r6 != 0) goto L_0x0111;	 Catch:{ all -> 0x0174 }
            if (r0 != 0) goto L_0x0107;	 Catch:{ all -> 0x0174 }
            defpackage.akcr.a();	 Catch:{ all -> 0x0174 }
            r0 = defpackage.ajdx.b(r0);	 Catch:{ all -> 0x0174 }
            r4 = "Single.just(cachedKey!!)";	 Catch:{ all -> 0x0174 }
            defpackage.akcr.a(r0, r4);	 Catch:{ all -> 0x0174 }
            goto L_0x0121;	 Catch:{ all -> 0x0174 }
            r0 = r4.b;	 Catch:{ all -> 0x0174 }
            r6 = new ils$c;	 Catch:{ all -> 0x0174 }
            r6.<init>(r4, r11, r5);	 Catch:{ all -> 0x0174 }
            r6 = (defpackage.ajfc) r6;	 Catch:{ all -> 0x0174 }
            r0 = r0.f(r6);	 Catch:{ all -> 0x0174 }
            r4 = "serializationHelperSingl…Key\n                    }";	 Catch:{ all -> 0x0174 }
            goto L_0x010d;	 Catch:{ all -> 0x0174 }
            r4 = new ijv$f;	 Catch:{ all -> 0x0174 }
            r4.<init>(r2, r3, r11, r1);	 Catch:{ all -> 0x0174 }
            r4 = (defpackage.ajfc) r4;	 Catch:{ all -> 0x0174 }
            r0 = r0.a(r4);	 Catch:{ all -> 0x0174 }
            r1 = new ijv$g;	 Catch:{ all -> 0x0174 }
            r1.<init>(r11);	 Catch:{ all -> 0x0174 }
            r1 = (defpackage.ajfc) r1;	 Catch:{ all -> 0x0174 }
            r0 = r0.f(r1);	 Catch:{ all -> 0x0174 }
            r1 = new ijv$h;	 Catch:{ all -> 0x0174 }
            r1.<init>(r11);	 Catch:{ all -> 0x0174 }
            r1 = (defpackage.ajfb) r1;	 Catch:{ all -> 0x0174 }
            r0 = r0.c(r1);	 Catch:{ all -> 0x0174 }
            r1 = new ijv$i;	 Catch:{ all -> 0x0174 }
            r1.<init>(r2, r11);	 Catch:{ all -> 0x0174 }
            r1 = (defpackage.ajfb) r1;	 Catch:{ all -> 0x0174 }
            r11 = r0.d(r1);	 Catch:{ all -> 0x0174 }
            r0 = com.google.common.base.Optional.absent();	 Catch:{ all -> 0x0174 }
            r11 = r11.c(r0);	 Catch:{ all -> 0x0174 }
            r11 = r11.i();	 Catch:{ all -> 0x0174 }
            r0 = defpackage.ijv.j.a;	 Catch:{ all -> 0x0174 }
            r0 = (defpackage.ajfl) r0;	 Catch:{ all -> 0x0174 }
            r11 = r11.a(r0);	 Catch:{ all -> 0x0174 }
            r0 = defpackage.ijv.k.a;	 Catch:{ all -> 0x0174 }
            r0 = (defpackage.ajfc) r0;	 Catch:{ all -> 0x0174 }
            r11 = r11.p(r0);	 Catch:{ all -> 0x0174 }
            r0 = "geofilterOverlayCacheKey…        .map { it.get() }";	 Catch:{ all -> 0x0174 }
            goto L_0x0026;
            r0 = r10.b;
            r11 = defpackage.ijz.a(r11, r0);
            return r11;
            r11 = move-exception;
            throw r11;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ijz$aa.a(abzy):ajdp");
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((abzy) obj);
        }
    }

    /* renamed from: ijz$ab */
    static final class ab<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ ijz a;
        private /* synthetic */ ajdp b;

        ab(ijz ijz, ajdp ajdp) {
            this.a = ijz;
            this.b = ajdp;
        }

        private ajdp<zmy> a(abzy abzy) {
            akcr.b(abzy, "it");
            return ijz.a(((ijx) this.a.a.b()).a(abzy), this.b);
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((abzy) obj);
        }
    }

    /* renamed from: ijz$ac */
    static final class ac<T> implements ajfb<zmy> {
        private /* synthetic */ ijz a;
        private /* synthetic */ boolean b = false;
        private /* synthetic */ abzy c;

        ac(ijz ijz, abzy abzy) {
            this.a = ijz;
            this.c = abzy;
        }

        public final /* synthetic */ void accept(Object obj) {
            ahyr h = this.c.h();
            if (h != null) {
                String str = h.a;
                if (str != null) {
                    AtomicInteger atomicInteger = (AtomicInteger) this.a.g().putIfAbsent(str, new AtomicInteger(1));
                    if (atomicInteger != null) {
                        atomicInteger.incrementAndGet();
                    }
                }
            }
        }
    }

    /* renamed from: ijz$i */
    static final class i<T> implements ajfl<Boolean> {
        public static final i a = new i();

        i() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            return bool.booleanValue();
        }
    }

    /* renamed from: ijz$j */
    static final class j<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ ajdp a;

        j(ajdp ajdp) {
            this.a = ajdp;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            if (bool.booleanValue()) {
                return this.a;
            }
            obj = ajvo.a(ajot.a);
            akcr.a(obj, "Observable.empty()");
            return obj;
        }
    }

    /* renamed from: ijz$z */
    static final class z<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ ijz a;
        private /* synthetic */ ajdp b;

        z(ijz ijz, ajdp ajdp) {
            this.a = ijz;
            this.b = ajdp;
        }

        private ajdp<abzy> a(abzy abzy) {
            akcr.b(abzy, "it");
            ikb c = this.a.c();
            akcr.b(abzy, "geofilter");
            Object p = ajdx.b((Object) abzy).c((ajfb) i.a).a((ajfc) new j(c, abzy)).c((ajfb) k.a).d((ajfb) new l(abzy)).c(Optional.absent()).i().a((ajfl) m.a).p(n.a);
            akcr.a(p, "Single.just(geofilter)\n …        .map { it.get() }");
            return ijz.a(p, this.b);
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((abzy) obj);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ijz.class), "eliminationStage", "getEliminationStage()Lcom/snap/geofilters/core/stage/EliminationStage;"), new akdc(akde.a(ijz.class), "prefetchResourcesStage", "getPrefetchResourcesStage()Lcom/snap/geofilters/core/stage/PrefetchResourcesStage;"), new akdc(akde.a(ijz.class), "composeResourcesStage", "getComposeResourcesStage()Lcom/snap/geofilters/core/stage/ComposeResourcesStage;"), new akdc(akde.a(ijz.class), "createViewModelStage", "getCreateViewModelStage()Lcom/snap/geofilters/core/stage/CreateViewModelStage;"), new akdc(akde.a(ijz.class), "carouselConfig", "getCarouselConfig()Lcom/snap/geofilters/core/ordering/CarouselConfigProvider;"), new akdc(akde.a(ijz.class), "singleFilterViewModelUpdateSubject", "getSingleFilterViewModelUpdateSubject$preview_core_release()Lio/reactivex/subjects/PublishSubject;"), new akdc(akde.a(ijz.class), "filterViewModelsUpdateSubject", "getFilterViewModelsUpdateSubject()Lio/reactivex/subjects/BehaviorSubject;"), new akdc(akde.a(ijz.class), "firstSwipeDirectionLockedSubject", "getFirstSwipeDirectionLockedSubject()Lio/reactivex/subjects/PublishSubject;"), new akdc(akde.a(ijz.class), "preparedFiltersIdSet", "getPreparedFiltersIdSet()Ljava/util/Set;"), new akdc(akde.a(ijz.class), "preparedFiltersByType", "getPreparedFiltersByType()Ljava/util/concurrent/ConcurrentHashMap;"), new akdc(akde.a(ijz.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(ijz.class), "carouselConfigMap", "getCarouselConfigMap()Lio/reactivex/Observable;"), new akdc(akde.a(ijz.class), "exceptionTracker", "getExceptionTracker()Lcom/snap/crash/api/exceptiontracker/ExceptionTracker;")};
    }

    public ijz(ajwy<ijy> ajwy, ajwy<ikb> ajwy2, ajwy<ijv> ajwy3, ajwy<ijx> ajwy4, ajwy<ilv> ajwy5, ihh ihh, ajwy<ftl> ajwy6, ajdx<iha> ajdx, ajwy<zgb> ajwy7, ajwy<ijm> ajwy8, ajwy<gqr> ajwy9) {
        akcr.b(ajwy, "eliminationStageProvider");
        akcr.b(ajwy2, "prefetchResourcesStageProvider");
        akcr.b(ajwy3, "composeResourcesStageProvider");
        akcr.b(ajwy4, "createViewModelStageProvider");
        akcr.b(ajwy5, "grapheneProvider");
        akcr.b(ihh, "clock");
        akcr.b(ajwy6, "compositeConfigProvider");
        akcr.b(ajdx, "serializationHelper");
        akcr.b(ajwy7, "schedulersProvider");
        akcr.b(ajwy8, "carouselConfigProvider");
        akcr.b(ajwy9, "exceptionTrackerProvider");
        this.i = ajwy5;
        this.j = ihh;
        this.k = ajwy6;
        this.l = ajdx;
        this.m = ajxh.a(new e(ajwy));
        this.n = ajxh.a(new k(ajwy2));
        this.o = ajxh.a(new c(ajwy3));
        this.a = ajxh.a(new d(ajwy4));
        this.b = ajxh.a(new a(ajwy8));
        this.d = ajxh.a(new x(ajwy7));
        this.e = ajxh.a(new b(this));
        this.f = ajxh.a(new f(ajwy9));
        this.h = new ijc();
    }

    public static final /* synthetic */ ajdp a(ajdp ajdp, ajdp ajdp2) {
        Object d = ajdp2.a((ajfl) i.a).d(Boolean.FALSE).d((ajfc) new j(ajdp));
        akcr.a(d, "gateObservable.filter { …)\n            }\n        }");
        return d;
    }

    private final ajwo<znh<zmy>> h() {
        return (ajwo) this.r.b();
    }

    public final ajdp<znh<zmy>> a(List<? extends abzy> list, ajdp<Boolean> ajdp, String str) {
        akcr.b(list, "filters");
        akcr.b(ajdp, "previewVisibleObservable");
        akdd.c cVar = new akdd.c();
        cVar.a = 0;
        long c = this.j.c();
        ijy ijy = (ijy) this.m.b();
        akcr.b(list, "geofilters");
        Object i = ajdp.b((Iterable) list).a((ajfl) new ijy.c(ijy)).n(new d(ijy)).a((ajfl) e.a).a((Object) ajyw.a, (ajex) f.a).i();
        akcr.a(i, "Observable.fromIterable(…          .toObservable()");
        i = i.d((ajfb) new l(cVar)).k((ajfc) n.a).a((ajfl) new o(this)).k((ajfc) new p(this, ajdp)).a((ajfl) q.a).d((ajfb) new r(this, cVar, c)).e((ajdt) (ajwo) this.p.b()).p(s.a).e((ajdt) h()).k((ajfc) new t(this, str)).d((ajfb) new u(this)).a((ajev) new m(this));
        akcr.a(i, "eliminationStage.elimina…oaded()\n                }");
        return i;
    }

    public final void a() {
        ((ajei) c().c.b()).dispose();
        d().c().e.dispose();
        this.c = znk.a;
        f().clear();
    }

    public final void a(int i) {
        if (this.g == 0 && i != 0) {
            this.g = i > 0 ? 1 : 2;
            ajwo h = h();
            Object e = e();
            akcr.a(e, "filterViewModelsUpdateSubject");
            e = (znh) e.p();
            if (e == null) {
                e = znk.a;
            }
            h.a(e);
        }
    }

    public final ijc b() {
        return this.h;
    }

    /* Access modifiers changed, original: final */
    public final ikb c() {
        return (ikb) this.n.b();
    }

    /* Access modifiers changed, original: final */
    public final ijv d() {
        return (ijv) this.o.b();
    }

    /* Access modifiers changed, original: final */
    public final ajwl<znh<zmy>> e() {
        return (ajwl) this.q.b();
    }

    /* Access modifiers changed, original: final */
    public final Set<Long> f() {
        return (Set) this.s.b();
    }

    /* Access modifiers changed, original: final */
    public final ConcurrentHashMap<String, AtomicInteger> g() {
        return (ConcurrentHashMap) this.t.b();
    }
}
