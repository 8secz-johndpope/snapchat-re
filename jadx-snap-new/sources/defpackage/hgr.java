package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSet;
import defpackage.hfu.e;
import defpackage.hfu.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: hgr */
public final class hgr {
    public final ConcurrentHashMap<a, hfu> a = new ConcurrentHashMap();
    final ajei b;
    final ajxe c;
    final ajxe d;
    final ajxe e;
    final ajxe f;
    final ajxe g;
    final ajxe h;
    final Set<hka> i;
    public final ajwo<hjx> j;
    final ajwy<gwd> k;
    private final ajxe l;
    private final AtomicBoolean m;
    private final ajxe n;

    /* renamed from: hgr$j */
    static final class j extends akcq implements akbk<zfw> {
        j(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (zfw) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: hgr$g */
    static final class g extends akcq implements akbk<hcc> {
        g(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (hcc) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: hgr$c */
    static final class c extends akcq implements akbk<hoy> {
        c(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (hoy) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: hgr$q */
    static final class q extends akcq implements akbk<yut> {
        q(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (yut) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: hgr$f */
    static final class f extends akcq implements akbk<yum> {
        f(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (yum) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: hgr$d */
    static final class d extends akcq implements akbk<hhc> {
        d(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (hhc) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: hgr$l */
    static final class l extends akcq implements akbk<hia> {
        l(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (hia) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: hgr$k */
    static final class k extends akcq implements akbk<khf> {
        k(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (khf) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: hgr$a */
    public static final class a {
        final hjd a;

        public a(hjd hjd) {
            akcr.b(hjd, "discoverFeedSection");
            this.a = hjd;
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.hgr.a) r2).a) != false) goto L_0x0015;
     */
        public final boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof defpackage.hgr.a;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (defpackage.hgr.a) r2;
            r0 = r1.a;
            r2 = r2.a;
            r2 = defpackage.akcr.a(r0, r2);
            if (r2 == 0) goto L_0x0013;
        L_0x0012:
            goto L_0x0015;
        L_0x0013:
            r2 = 0;
            return r2;
        L_0x0015:
            r2 = 1;
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.hgr$a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            hjd hjd = this.a;
            return hjd != null ? hjd.hashCode() : 0;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("QueryKey(discoverFeedSection=");
            stringBuilder.append(this.a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: hgr$b */
    static final class b<T1, T2, R> implements ajex<znh<hjx>, znh<hjx>, znh<hjx>> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            znh znh = (znh) obj;
            znh znh2 = (znh) obj2;
            akcr.b(znh, "t1");
            akcr.b(znh2, "t2");
            return znk.a(znh, znh2);
        }
    }

    /* renamed from: hgr$e */
    static final class e implements ajev {
        final /* synthetic */ hgr a;

        /* renamed from: hgr$e$1 */
        static final class 1<T> implements ajfl<yur> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                yur yur = (yur) obj;
                akcr.b(yur, "it");
                return !yur.d;
            }
        }

        /* renamed from: hgr$e$2 */
        static final class 2<T> implements ajfb<yur> {
            private /* synthetic */ e a;

            2(e eVar) {
                this.a = eVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                yur yur = (yur) obj;
                int i = hgs.a[yur.c.ordinal()];
                hgr hgr;
                String str;
                if (i == 1) {
                    hgr = this.a.a;
                    long parseLong = Long.parseLong(yur.a);
                    hgr.a((akbl) new y(parseLong), yur.b);
                } else if (i != 2) {
                    hgr = this.a.a;
                    str = yur.a;
                    hgr.a((akbl) new aa(str), yur.b);
                } else {
                    hgr = this.a.a;
                    str = yur.a;
                    hgr.a((akbl) new v(str), yur.b);
                }
            }
        }

        /* renamed from: hgr$e$3 */
        static final class 3<T> implements ajfl<yuq> {
            public static final 3 a = new 3();

            3() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                yuq yuq = (yuq) obj;
                akcr.b(yuq, "it");
                return !yuq.d;
            }
        }

        /* renamed from: hgr$e$4 */
        static final class 4<T> implements ajfb<yuq> {
            private /* synthetic */ e a;

            4(e eVar) {
                this.a = eVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                yuq yuq = (yuq) obj;
                String str = "updateAndReturn(toOptInN…             .subscribe()";
                hgr hgr;
                ajej c;
                if (yuq.c == hbj.PUBLISHER_STORY_CARD) {
                    hgr = this.a.a;
                    long parseLong = Long.parseLong(yuq.a);
                    c = hgr.b(hgr.b(new x(parseLong), yuq.b)).c();
                    akcr.a((Object) c, str);
                    ajvv.a(c, hgr.b);
                    return;
                }
                if (yuq.c == hbj.PUBLIC_USER_STORY_CARD) {
                    hgr = this.a.a;
                    String str2 = yuq.a;
                    c = hgr.b(hgr.b(new ab(str2), yuq.b)).c();
                    akcr.a((Object) c, str);
                    ajvv.a(c, hgr.b);
                }
            }
        }

        /* renamed from: hgr$e$5 */
        static final class 5<T> implements ajfb<Long> {
            private /* synthetic */ e a;

            5(e eVar) {
                this.a = eVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                obj = (Long) obj;
                hgr hgr = this.a.a;
                akcr.a(obj, "it");
                hgr.a((akbl) new w(obj.longValue()));
            }
        }

        /* renamed from: hgr$e$6 */
        static final class 6<T> implements ajfb<hbk> {
            private /* synthetic */ e a;

            6(e eVar) {
                this.a = eVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                obj = (hbk) obj;
                hgr hgr = this.a.a;
                akcr.a(obj, "it");
                hgr.a((akbl) new u(obj));
            }
        }

        /* renamed from: hgr$e$7 */
        static final class 7<T> implements ajfb<hhz> {
            private /* synthetic */ e a;

            7(e eVar) {
                this.a = eVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                hhz hhz = (hhz) obj;
                int i = hgs.b[hhz.a - 1];
                Set set;
                if (i != 1) {
                    if (i == 2) {
                        hgr hgr = this.a.a;
                        Object copyOf = ImmutableSet.copyOf((Collection) this.a.a.i);
                        akcr.a(copyOf, "ImmutableSet.copyOf(viewedStoryIds)");
                        set = (Set) copyOf;
                        Object values = hgr.a.values();
                        akcr.a(values, "sectionRepoMap.values");
                        for (hfu hfu : (Iterable) values) {
                            akbl zVar = new z(hgr, set);
                            akcr.b(zVar, "predicate");
                            ajej e = hfu.b(zVar).e().e();
                            akcr.a((Object) e, "updateAndReturn(predicat…             .subscribe()");
                            ajvv.a(e, hfu.d);
                        }
                        this.a.a.i.clear();
                    }
                    return;
                }
                hio hio = hhz.b;
                if (hio != null) {
                    set = this.a.a.i;
                    obj = hio.af();
                    akcr.a(obj, "it.storyId()");
                    set.add(obj);
                }
            }
        }

        e(hgr hgr) {
            this.a = hgr;
        }

        public final void run() {
            ajej f = ((yut) this.a.e.b()).a().a((ajfl) 1.a).a((ajdw) this.a.a().h()).f((ajfb) new 2(this));
            akcr.a((Object) f, "subscriptionDataSource.g…  }\n                    }");
            ajvv.a(f, this.a.b);
            f = ((yum) this.a.f.b()).a().a((ajfl) 3.a).a((ajdw) this.a.a().h()).f((ajfb) new 4(this));
            akcr.a((Object) f, "optInNotificationDataSou…  }\n                    }");
            ajvv.a(f, this.a.b);
            f = ((hhc) this.a.n.b()).d.a((ajdw) this.a.a().h()).f((ajfb) new 5(this));
            akcr.a((Object) f, "hiddenCardsStore.getPubl…PublisherHideStatus(it) }");
            ajvv.a(f, this.a.b);
            f = ((hhc) this.a.n.b()).e.a((ajdw) this.a.a().h()).f((ajfb) new 6(this));
            akcr.a((Object) f, "hiddenCardsStore.getNonP…PublisherHideStatus(it) }");
            ajvv.a(f, this.a.b);
            ((hia) this.a.g.b()).a().a((ajdw) this.a.a().h()).f((ajfb) new 7(this));
        }
    }

    /* renamed from: hgr$h */
    static final class h implements ajev {
        private /* synthetic */ hgr a;
        private /* synthetic */ hjd b;
        private /* synthetic */ hjx c;

        h(hgr hgr, hjd hjd, hjx hjx) {
            this.a = hgr;
            this.b = hjd;
            this.c = hjx;
        }

        public final void run() {
            hfu a = this.a.a(new a(this.b));
            hjx hjx = this.c;
            akcr.b(hjx, "toPrepend");
            a.c.a(Optional.of(hjx));
        }
    }

    /* renamed from: hgr$i */
    public static final class i<T1, T2, R> implements ajex<znh<hjx>, znh<hjx>, znh<hjx>> {
        public static final i a = new i();

        i() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            znh znh = (znh) obj;
            znh znh2 = (znh) obj2;
            akcr.b(znh, "t1");
            akcr.b(znh2, "t2");
            return znk.a(znh, znh2);
        }
    }

    /* renamed from: hgr$m */
    static final class m<T> implements ajfl<znh<hjx>> {
        public static final m a = new m();

        m() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            znh znh = (znh) obj;
            akcr.b(znh, "it");
            return znh.a() > 0;
        }
    }

    /* renamed from: hgr$n */
    static final class n<T, R> implements ajfc<T, R> {
        public static final n a = new n();

        n() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            znh znh = (znh) obj;
            akcr.b(znh, "it");
            return (hjx) znh.a(0);
        }
    }

    /* renamed from: hgr$o */
    static final class o<T, R> implements ajfc<hjx, ajdb> {
        final /* synthetic */ hgr a;
        private /* synthetic */ boolean b;
        private /* synthetic */ akbl c;

        o(hgr hgr, boolean z, akbl akbl) {
            this.a = hgr;
            this.b = z;
            this.c = akbl;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajcx b;
            obj = (hjx) obj;
            akcr.b(obj, "dataModel");
            if (this.b) {
                Iterable<hfu> a = hgr.a(this.a);
                Collection arrayList = new ArrayList(ajyn.a((Iterable) a, 10));
                for (hfu a2 : a) {
                    arrayList.add(a2.a(znk.a(obj), true));
                }
                b = ajcx.a((Iterable) (List) arrayList).b((ajev) new ajev(this) {
                    private /* synthetic */ o a;

                    public final void run() {
                        hgr hgr = this.a.a;
                        Object obj = obj;
                        akcr.a(obj, "dataModel");
                        hgr.j.a(obj);
                    }
                });
            } else {
                Iterable<hfu> a3 = hgr.a(this.a);
                Collection arrayList2 = new ArrayList(ajyn.a((Iterable) a3, 10));
                for (hfu a22 : a3) {
                    arrayList2.add(a22.c(this.c).e());
                }
                b = ajcx.a((Iterable) (List) arrayList2);
            }
            return b;
        }
    }

    /* renamed from: hgr$p */
    static final class p<T> implements ajfb<Throwable> {
        public static final p a = new p();

        p() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: hgr$t */
    static final class t<T1, T2, R> implements ajex<znh<hjx>, znh<hjx>, znh<hjx>> {
        public static final t a = new t();

        t() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            znh znh = (znh) obj;
            znh znh2 = (znh) obj2;
            akcr.b(znh, "t1");
            akcr.b(znh2, "t2");
            return znk.a(znh, znh2);
        }
    }

    /* renamed from: hgr$aa */
    static final class aa extends akcs implements akbl<hjx, Boolean> {
        private /* synthetic */ String a;

        aa(String str) {
            this.a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            hjx hjx = (hjx) obj;
            akcr.b(hjx, "it");
            return Boolean.valueOf(akcr.a(hjx.a().b().b(), this.a));
        }
    }

    /* renamed from: hgr$ab */
    static final class ab extends akcs implements akbl<hjx, Boolean> {
        private /* synthetic */ String a;

        ab(String str) {
            this.a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            hjx hjx = (hjx) obj;
            akcr.b(hjx, "it");
            if (hjx.a() instanceof hjg) {
                hio a = hjx.a();
                if (a == null) {
                    throw new ajxt("null cannot be cast to non-null type com.snap.discoverfeed.model.DynamicStoryData");
                } else if (akcr.a(((hjg) a).C(), this.a)) {
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: hgr$r */
    static final class r extends akcs implements akbl<hjx, hjx> {
        private /* synthetic */ akbl a;
        private /* synthetic */ boolean b;

        r(akbl akbl, boolean z) {
            this.a = akbl;
            this.b = z;
            super(1);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:25:0x006f in {6, 9, 14, 16, 18, 20, 22, 24} preds:[]
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
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r3) {
            /*
            r2 = this;
            r3 = (defpackage.hjx) r3;
            r0 = "it";
            defpackage.akcr.b(r3, r0);
            r0 = r2.a;
            r0 = r0.invoke(r3);
            r0 = (java.lang.Boolean) r0;
            r0 = r0.booleanValue();
            r1 = 1;
            if (r0 != r1) goto L_0x0066;
            r0 = r3.a();
            r1 = r0 instanceof defpackage.hjf;
            if (r1 == 0) goto L_0x0037;
            r0 = r3.a();
            if (r0 == 0) goto L_0x002f;
            r0 = (defpackage.hjf) r0;
            r1 = r2.b;
            r0 = r0.d(r1);
            r0 = (defpackage.hio) r0;
            goto L_0x004a;
            r3 = new ajxt;
            r0 = "null cannot be cast to non-null type com.snap.discoverfeed.model.DiscoverStoryData";
            r3.<init>(r0);
            throw r3;
            r0 = r0 instanceof defpackage.hjg;
            if (r0 == 0) goto L_0x005c;
            r0 = r3.a();
            if (r0 == 0) goto L_0x0054;
            r0 = (defpackage.hjg) r0;
            r1 = r2.b;
            r0 = r0.c(r1);
            goto L_0x002c;
            r1 = new hjx;
            r3 = r3.b();
            r1.<init>(r0, r3);
            return r1;
            r3 = new ajxt;
            r0 = "null cannot be cast to non-null type com.snap.discoverfeed.model.DynamicStoryData";
            r3.<init>(r0);
            throw r3;
            r3 = new java.lang.IllegalStateException;
            r0 = "data type not supported for opt in notification";
            r3.<init>(r0);
            r3 = (java.lang.Throwable) r3;
            throw r3;
            if (r0 != 0) goto L_0x0069;
            return r3;
            r3 = new ajxk;
            r3.<init>();
            throw r3;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.hgr$r.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: hgr$s */
    static final class s extends akcs implements akbl<hjx, hjx> {
        private /* synthetic */ akbl a;
        private /* synthetic */ boolean b;

        s(akbl akbl, boolean z) {
            this.a = akbl;
            this.b = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            hjx hjx = (hjx) obj;
            akcr.b(hjx, "it");
            boolean booleanValue = ((Boolean) this.a.invoke(hjx)).booleanValue();
            if (booleanValue) {
                return new hjx(hjx.a().a(this.b), hjx.b());
            }
            if (!booleanValue) {
                return hjx;
            }
            throw new ajxk();
        }
    }

    /* renamed from: hgr$u */
    static final class u extends akcs implements akbl<hjx, Boolean> {
        private /* synthetic */ hbk a;

        u(hbk hbk) {
            this.a = hbk;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            hjx hjx = (hjx) obj;
            akcr.b(hjx, "it");
            return Boolean.valueOf(akcr.a(hjx.a().b(), this.a));
        }
    }

    /* renamed from: hgr$v */
    static final class v extends akcs implements akbl<hjx, Boolean> {
        private /* synthetic */ String a;

        v(String str) {
            this.a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            hjx hjx = (hjx) obj;
            akcr.b(hjx, "it");
            if (hjx.a() instanceof hjg) {
                hio a = hjx.a();
                if (a == null) {
                    throw new ajxt("null cannot be cast to non-null type com.snap.discoverfeed.model.DynamicStoryData");
                } else if (akcr.a(((hjg) a).C(), this.a)) {
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: hgr$w */
    static final class w extends akcs implements akbl<hjx, Boolean> {
        private /* synthetic */ long a;

        w(long j) {
            this.a = j;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            hjx hjx = (hjx) obj;
            akcr.b(hjx, "it");
            if (hjx.a().d() == hbj.PUBLISHER_STORY_CARD) {
                obj = hjx.c();
                if (obj != null) {
                    Long A = ((hjf) obj).A();
                    if (A != null && A.longValue() == this.a) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                throw new ajxt("null cannot be cast to non-null type com.snap.discoverfeed.model.DiscoverStoryData");
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: hgr$x */
    static final class x extends akcs implements akbl<hjx, Boolean> {
        private /* synthetic */ long a;

        x(long j) {
            this.a = j;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            hjx hjx = (hjx) obj;
            akcr.b(hjx, "it");
            if (hjx.a() instanceof hjf) {
                hio a = hjx.a();
                if (a != null) {
                    Long A = ((hjf) a).A();
                    if (A != null && A.longValue() == this.a) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                throw new ajxt("null cannot be cast to non-null type com.snap.discoverfeed.model.DiscoverStoryData");
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: hgr$y */
    static final class y extends akcs implements akbl<hjx, Boolean> {
        private /* synthetic */ long a;

        y(long j) {
            this.a = j;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            hjx hjx = (hjx) obj;
            akcr.b(hjx, "it");
            if (hjx.a() instanceof hjf) {
                hio a = hjx.a();
                if (a != null) {
                    Long A = ((hjf) a).A();
                    if (A != null && A.longValue() == this.a) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                throw new ajxt("null cannot be cast to non-null type com.snap.discoverfeed.model.DiscoverStoryData");
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: hgr$z */
    static final class z extends akcs implements akbl<hjx, hjx> {
        private /* synthetic */ hgr a;
        private /* synthetic */ Set b;

        z(hgr hgr, Set set) {
            this.a = hgr;
            this.b = set;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            hjx hjx = (hjx) obj;
            akcr.b(hjx, "it");
            boolean contains = this.b.contains(hjx.a().af());
            if (contains) {
                hcc hcc = (hcc) this.a.c.b();
                this.a.d.b();
                hjx a = hpk.a(hjx, hcc, (gwd) this.a.k.get(), (khf) this.a.h.b());
                return a == null ? hjx : a;
            } else if (!contains) {
                return hjx;
            } else {
                throw new ajxk();
            }
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(hgr.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(hgr.class), "playStateStore", "getPlayStateStore()Lcom/snap/discoverfeed/api/StoriesPlayStateStore;"), new akdc(akde.a(hgr.class), "dfFeatureFlagManager", "getDfFeatureFlagManager()Lcom/snap/discoverfeed/shared/experiments/common/DiscoverFeedFeatureFlagManager;"), new akdc(akde.a(hgr.class), "subscriptionDataSource", "getSubscriptionDataSource()Lcom/snap/subscription/api/SubscriptionDataSource;"), new akdc(akde.a(hgr.class), "optInNotificationDataSource", "getOptInNotificationDataSource()Lcom/snap/subscription/api/OptInNotificationDataSource;"), new akdc(akde.a(hgr.class), "hiddenCardsStore", "getHiddenCardsStore()Lcom/snap/discoverfeed/data/store/HiddenCardsStore;"), new akdc(akde.a(hgr.class), "storyViewedEventListener", "getStoryViewedEventListener()Lcom/snap/discoverfeed/dependency/StoryViewedEventListener;"), new akdc(akde.a(hgr.class), "showsWatchStateStore", "getShowsWatchStateStore()Lcom/snap/impala/model/shows/ShowsWatchStateStore;")};
    }

    public hgr(ajwy<zfw> ajwy, ajwy<hcc> ajwy2, ajwy<hoy> ajwy3, gpu gpu, ajwy<yut> ajwy4, ajwy<yum> ajwy5, ajwy<hhc> ajwy6, ajwy<hia> ajwy7, ajwy<khf> ajwy8, ajwy<gwd> ajwy9) {
        akcr.b(ajwy, "schedulersProvider");
        akcr.b(ajwy2, "playStateStoreProvider");
        akcr.b(ajwy3, "featureFlagManagerProvider");
        akcr.b(gpu, "userSession");
        akcr.b(ajwy4, "subscriptionDataSource");
        akcr.b(ajwy5, "optInNotificationDataSource");
        akcr.b(ajwy6, "hiddenCardsStoreProvider");
        akcr.b(ajwy7, "storyViewedEventListenerProvider");
        akcr.b(ajwy8, "showsWatchStateStoreProvider");
        akcr.b(ajwy9, "publisherSnapRepoProvider");
        this.k = ajwy9;
        ajei ajei = new ajei();
        gpu.a.a((ajej) ajei);
        this.b = ajei;
        this.l = ajxh.a(new j(ajwy));
        this.c = ajxh.a(new g(ajwy2));
        this.d = ajxh.a(new c(ajwy3));
        this.m = new AtomicBoolean(false);
        this.e = ajxh.a(new q(ajwy4));
        this.f = ajxh.a(new f(ajwy5));
        this.n = ajxh.a(new d(ajwy6));
        this.g = ajxh.a(new l(ajwy7));
        this.h = ajxh.a(new k(ajwy8));
        this.i = new LinkedHashSet();
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create()");
        this.j = ajwo;
    }

    static akbl<hjx, hjx> b(akbl<? super hjx, Boolean> akbl, boolean z) {
        return new r(akbl, z);
    }

    public final ajcx a(hjd hjd, hjx hjx) {
        akcr.b(hjd, "discoverFeedSection");
        akcr.b(hjx, "storyCardClientDataModel");
        Object a = ajcx.a((ajev) new h(this, hjd, hjx));
        akcr.a(a, "Completable.fromAction {…lientDataModel)\n        }");
        return a;
    }

    public final ajdx<znh<hjx>> a(hjd hjd) {
        akcr.b(hjd, "discoverFeedSection");
        return a(new a(hjd)).a();
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized hfu a(a aVar) {
        Object obj;
        if (!this.a.containsKey(aVar)) {
            Map map = this.a;
            hfu hfu = new hfu(a().f(), aVar.a);
            this.b.a((ajej) hfu);
            map.put(aVar, hfu);
        }
        obj = this.a.get(aVar);
        if (obj == null) {
            akcr.a();
        }
        return (hfu) obj;
    }

    /* Access modifiers changed, original: final */
    public final zfw a() {
        return (zfw) this.l.b();
    }

    public final void a(akbl<? super hjx, Boolean> akbl) {
        String str = "predicate";
        akcr.b(akbl, str);
        akcr.b(akbl, str);
        ajeb b = ajdx.b((Object) znk.a);
        akcr.a((Object) b, "Single.just(Seekables.empty())");
        Object values = this.a.values();
        akcr.a(values, "sectionRepoMap.values");
        for (hfu c : (Iterable) values) {
            Object b2 = ajdx.a(b2, (ajeb) c.c(akbl), (ajex) b.a);
            akcr.a(b2, "single.zipWith(\n        …t(t1, t2) }\n            )");
        }
        ajej c2 = b2.c();
        akcr.a((Object) c2, "hideAndReturn(predicate).subscribe()");
        ajvv.a(c2, this.b);
    }

    /* Access modifiers changed, original: final */
    public final void a(akbl<? super hjx, Boolean> akbl, boolean z) {
        ajej e = b((akbl) new s(akbl, z)).a((ajfl) m.a).f(n.a).e(new o(this, z, akbl)).a((ajfb) p.a).e();
        akcr.a((Object) e, "updateAndReturn(toSubscr…             .subscribe()");
        ajvv.a(e, this.b);
    }

    public final void a(Optional<hkm> optional) {
        akcr.b(optional, "optional");
        if (optional.isPresent()) {
            hkm hkm = (hkm) optional.get();
            hkk hkk = hkm.b;
            Object obj = hkm.a;
            akcr.a(obj, "response.contents");
            for (Entry entry : ((Map) obj).entrySet()) {
                Object obj2 = (hjd) entry.getKey();
                hkl hkl = (hkl) entry.getValue();
                akcr.a(obj2, "discoverFeedSection");
                hfu a = a(new a(obj2));
                znh znh = hkl.b;
                if (znh != null) {
                    ajej e;
                    String str;
                    String str2 = "newData";
                    if (hkj.a(hkk, obj2)) {
                        akcr.b(znh, str2);
                        akcr.b(znh, str2);
                        Object b = ajcx.a((ajev) new g(a, znh)).b(a.e);
                        akcr.a(b, "Completable.fromAction {… }.subscribeOn(scheduler)");
                        e = b.e();
                        str = "setDataCompletable(newDa…             .subscribe()";
                    } else {
                        akcr.b(znh, str2);
                        e = a.a(znh, false).e();
                        str = "appendDataCompletable(ne…             .subscribe()";
                    }
                    akcr.a((Object) e, str);
                    ajvv.a(e, a.d);
                }
            }
            if (!this.m.getAndSet(true)) {
                ajej e2 = ajcx.a((ajev) new e(this)).b((ajdw) a().b()).e();
                akcr.a((Object) e2, "Completable.fromAction {…             .subscribe()");
                ajvv.a(e2, this.b);
            }
        }
    }

    public final ajdp<znh<hjx>> b(hjd hjd) {
        akcr.b(hjd, "discoverFeedSection");
        hfu a = a(new a(hjd));
        Object p = a.b.p(new hfv(new e(a)));
        akcr.a(p, "backingDataModels\n      …exAndDiscoverFeedSection)");
        return p;
    }

    /* Access modifiers changed, original: final */
    public final ajdx<znh<hjx>> b(akbl<? super hjx, ? extends hjx> akbl) {
        ajeb b = ajdx.b((Object) znk.a);
        akcr.a((Object) b, "Single.just(Seekables.empty())");
        Object values = this.a.values();
        akcr.a(values, "sectionRepoMap.values");
        for (hfu b2 : (Iterable) values) {
            Object b3 = ajdx.a(b3, (ajeb) b2.b(akbl), (ajex) t.a);
            akcr.a(b3, "single.zipWith(\n        …t(t1, t2) }\n            )");
        }
        return b3;
    }
}
