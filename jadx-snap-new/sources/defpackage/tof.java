package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: tof */
public final class tof {
    public final ajei a = new ajei();
    Object b;
    String c;
    public tpl d;
    private final ajxe e;
    private final ajxe f;
    private final ajxe g;
    private final ajxe h;
    private final ajxe i;
    private final ajxe j;
    private aeew k;
    private final toi l;
    private final tvd m;

    /* renamed from: tof$c */
    static final class c extends akcs implements akbk<ConcurrentHashMap<String, iip>> {
        public static final c a = new c();

        c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: tof$d */
    static final class d extends akcs implements akbk<iip> {
        public static final d a = new d();

        d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new iip();
        }
    }

    /* renamed from: tof$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        static double a(aama aama) {
            if (aama != null) {
                int i = tog.a[aama.ordinal()];
                if (i == 1) {
                    return 2.0d;
                }
                if (i == 2) {
                    return 4.0d;
                }
                if (i == 3) {
                    return 0.5d;
                }
            }
            return 1.0d;
        }
    }

    /* renamed from: tof$f */
    static final class f extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        f(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(toc.d.callsite("AnalyticsComposer"));
        }
    }

    /* renamed from: tof$g */
    static final class g extends akcs implements akbk<tyb> {
        private /* synthetic */ ajwy a;

        g(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (tyb) this.a.get();
        }
    }

    /* renamed from: tof$e */
    static final class e extends akcs implements akbk<abss> {
        private /* synthetic */ ajwy a;

        e(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (abss) this.a.get();
        }
    }

    /* renamed from: tof$b */
    static final class b extends akcs implements akbk<gqr> {
        private /* synthetic */ ajwy a;

        b(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (gqr) this.a.get();
        }
    }

    /* renamed from: tof$h */
    static final class h extends akcs implements akbl<aail, String> {
        public static final h a = new h();

        h() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            aail aail = (aail) obj;
            akcr.b(aail, "it");
            obj = aail.al();
            akcr.a(obj, "it.magicToolSelectType");
            return obj;
        }
    }

    /* renamed from: tof$i */
    static final class i extends akcs implements akbl<aail, Boolean> {
        public static final i a = new i();

        i() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            aail aail = (aail) obj;
            akcr.b(aail, "it");
            return Boolean.valueOf(aail.l() != null);
        }
    }

    /* renamed from: tof$j */
    static final class j extends akcs implements akbl<aail, String> {
        public static final j a = new j();

        j() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            aail aail = (aail) obj;
            akcr.b(aail, "it");
            obj = aail.l();
            akcr.a(obj, "it.captionPlacePositions");
            return obj;
        }
    }

    /* renamed from: tof$k */
    static final class k extends akcs implements akbl<aail, Boolean> {
        public static final k a = new k();

        k() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            aail aail = (aail) obj;
            akcr.b(aail, "it");
            return Boolean.valueOf(aail.n() != null);
        }
    }

    /* renamed from: tof$l */
    static final class l extends akcs implements akbl<aail, String> {
        public static final l a = new l();

        l() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            aail aail = (aail) obj;
            akcr.b(aail, "it");
            obj = aail.n();
            akcr.a(obj, "it.captionScales");
            return obj;
        }
    }

    /* renamed from: tof$m */
    static final class m extends akcs implements akbl<aail, Boolean> {
        public static final m a = new m();

        m() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            aail aail = (aail) obj;
            akcr.b(aail, "it");
            return Boolean.valueOf(aail.m() != null);
        }
    }

    /* renamed from: tof$n */
    static final class n extends akcs implements akbl<aail, String> {
        public static final n a = new n();

        n() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            aail aail = (aail) obj;
            akcr.b(aail, "it");
            obj = aail.m();
            akcr.a(obj, "it.captionWithTagPlacePositions");
            return obj;
        }
    }

    /* renamed from: tof$o */
    static final class o extends akcs implements akbl<aail, Boolean> {
        public static final o a = new o();

        o() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            aail aail = (aail) obj;
            akcr.b(aail, "it");
            return Boolean.valueOf(aail.ae() != null);
        }
    }

    /* renamed from: tof$p */
    static final class p extends akcs implements akbl<aail, String> {
        public static final p a = new p();

        p() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            aail aail = (aail) obj;
            akcr.b(aail, "it");
            obj = aail.ae();
            akcr.a(obj, "it.stickerPlacePositions");
            return obj;
        }
    }

    /* renamed from: tof$q */
    static final class q extends akcs implements akbl<aail, Boolean> {
        public static final q a = new q();

        q() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            aail aail = (aail) obj;
            akcr.b(aail, "it");
            return Boolean.valueOf(aail.v() != null);
        }
    }

    /* renamed from: tof$r */
    static final class r extends akcs implements akbl<aail, String> {
        public static final r a = new r();

        r() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            aail aail = (aail) obj;
            akcr.b(aail, "it");
            obj = aail.v();
            akcr.a(obj, "it.drawingStartPositions");
            return obj;
        }
    }

    /* renamed from: tof$s */
    static final class s extends akcs implements akbl<aail, Boolean> {
        public static final s a = new s();

        s() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            aail aail = (aail) obj;
            akcr.b(aail, "it");
            return Boolean.valueOf(aail.t() != null);
        }
    }

    /* renamed from: tof$t */
    static final class t extends akcs implements akbl<aail, String> {
        public static final t a = new t();

        t() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            aail aail = (aail) obj;
            akcr.b(aail, "it");
            obj = aail.t();
            akcr.a(obj, "it.drawToolColor");
            return obj;
        }
    }

    /* renamed from: tof$u */
    static final class u extends akcs implements akbl<aail, Long> {
        public static final u a = new u();

        u() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            aail aail = (aail) obj;
            akcr.b(aail, "it");
            return aail.u();
        }
    }

    /* renamed from: tof$v */
    static final class v extends akcs implements akbl<aail, Boolean> {
        public static final v a = new v();

        v() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            aail aail = (aail) obj;
            akcr.b(aail, "it");
            return Boolean.valueOf(aail.al() != null);
        }
    }

    /* renamed from: tof$w */
    public static final class w extends akcs implements akbl<Throwable, ajxw> {
        private /* synthetic */ tof a;

        public w(tof tof) {
            this.a = tof;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "it");
            IllegalStateException illegalStateException = new IllegalStateException("Error subscribeToSegmentSwitchEvent - initialSegmentKey", th);
            obj = ((abss) this.a.i.b());
            akcr.a(obj, "releaseManager");
            if (obj.l()) {
                throw illegalStateException;
            }
            ((gqr) this.a.j.b()).a(gqt.HIGH, illegalStateException, toc.d.callsite("AnalyticsComposer"));
            return ajxw.a;
        }
    }

    /* renamed from: tof$x */
    public static final class x extends akcs implements akbl<String, ajxw> {
        private /* synthetic */ tof a;

        public x(tof tof) {
            this.a = tof;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            akcr.b(str, "it");
            synchronized (this.a.b) {
                if (this.a.c == null) {
                    this.a.c = str;
                }
            }
            return ajxw.a;
        }
    }

    /* renamed from: tof$y */
    public static final class y extends akcs implements akbl<Throwable, ajxw> {
        private /* synthetic */ tof a;

        public y(tof tof) {
            this.a = tof;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "it");
            IllegalStateException illegalStateException = new IllegalStateException("Error subscribeToSegmentSwitchEvent - SegmentSwitchEvent", th);
            obj = ((abss) this.a.i.b());
            akcr.a(obj, "releaseManager");
            if (obj.l()) {
                throw illegalStateException;
            }
            ((gqr) this.a.j.b()).a(gqt.HIGH, illegalStateException, toc.d.callsite("AnalyticsComposer"));
            return ajxw.a;
        }
    }

    /* renamed from: tof$z */
    public static final class z extends akcs implements akbl<tps, ajxw> {
        private /* synthetic */ tof a;

        public z(tof tof) {
            this.a = tof;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            tps tps = (tps) obj;
            String str = this.a.c;
            if (str != null) {
                iip iip = (iip) this.a.b().get(str);
                if (iip == null) {
                    this.a.a(new iip(), str);
                } else {
                    this.a.a(iip, str);
                }
            }
            synchronized (this.a.b) {
                this.a.c = tps.a;
            }
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(tof.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(tof.class), "previewAnalyticsBuilderMap", "getPreviewAnalyticsBuilderMap()Ljava/util/concurrent/ConcurrentHashMap;"), new akdc(akde.a(tof.class), "segmentManager", "getSegmentManager()Lcom/snap/preview/segment/SegmentManager;"), new akdc(akde.a(tof.class), "previewAnalyticsWrapper", "getPreviewAnalyticsWrapper()Lcom/snap/geofilters/analytics/PreviewAnalyticsWrapper;"), new akdc(akde.a(tof.class), "releaseManager", "getReleaseManager()Lcom/snapchat/android/framework/release/ReleaseManager;"), new akdc(akde.a(tof.class), "exceptionTracker", "getExceptionTracker()Lcom/snap/crash/api/exceptiontracker/ExceptionTracker;")};
        a aVar = new a();
    }

    public tof(toi toi, tvd tvd, ajwy<tyb> ajwy, zgb zgb, ajwy<abss> ajwy2, ajwy<gqr> ajwy3) {
        akcr.b(toi, "analyticsProviderStorage");
        akcr.b(tvd, "previewDataSource");
        akcr.b(ajwy, "segmentManagerProvider");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy2, "releaseManagerProvider");
        akcr.b(ajwy3, "exceptionTrackerProvider");
        this.l = toi;
        this.m = tvd;
        this.e = ajxh.a(new f(zgb));
        this.f = ajxh.a(c.a);
        this.g = ajxh.a(new g(ajwy));
        this.h = ajxh.a(d.a);
        this.i = ajxh.a(new e(ajwy2));
        this.j = ajxh.a(new b(ajwy3));
        this.b = new Object();
    }

    private final double a(aaim aaim) {
        Double valueOf = Double.valueOf(0.0d);
        aeew aeew = this.k;
        if (aeew != null) {
            Double y;
            Object obj = aeew.a;
            akcr.a(obj, "this.mediaType");
            if (abyp.c(obj.intValue())) {
                y = aaim.y();
            } else {
                double longValue = (double) aeew.u.longValue();
                Double.isNaN(longValue);
                y = Double.valueOf((longValue / 1000.0d) / a.a(aaim.ag()));
            }
            valueOf = y;
        }
        return valueOf != null ? valueOf.doubleValue() : 0.0d;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:173:0x051a in {2, 10, 12, 16, 27, 28, 29, 37, 43, 44, 50, 51, 57, 58, 64, 65, 71, 72, 78, 79, 85, 86, 92, 93, 99, 100, 106, 107, 110, 113, 121, 122, 124, 128, 131, 134, 135, 138, 139, 142, 145, 152, 158, 162, 165, 169, 172} preds:[]
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
    private final void i() {
        /*
        r16 = this;
        r0 = r16.b();
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x000b;
        return;
        r0 = r16.b();
        r0 = r0.entrySet();
        r1 = "previewAnalyticsBuilderMap.entries";
        defpackage.akcr.a(r0, r1);
        r0 = (java.lang.Iterable) r0;
        r1 = new java.util.ArrayList;
        r1.<init>();
        r1 = (java.util.Collection) r1;
        r0 = r0.iterator();
        r2 = r0.hasNext();
        r3 = 0;
        r4 = 1;
        if (r2 == 0) goto L_0x0056;
        r2 = r0.next();
        r5 = r2;
        r5 = (java.util.Map.Entry) r5;
        r6 = r16.c();
        r5 = r5.getKey();
        r7 = "it.key";
        defpackage.akcr.a(r5, r7);
        r5 = (java.lang.String) r5;
        r5 = r6.b(r5);
        if (r5 == 0) goto L_0x0050;
        r5 = r5.g();
        if (r5 != 0) goto L_0x0050;
        r3 = 1;
        if (r3 == 0) goto L_0x0025;
        r1.add(r2);
        goto L_0x0025;
        r1 = (java.util.List) r1;
        r1 = (java.lang.Iterable) r1;
        r0 = new java.util.ArrayList;
        r2 = 10;
        r5 = defpackage.ajyn.a(r1, r2);
        r0.<init>(r5);
        r0 = (java.util.Collection) r0;
        r1 = r1.iterator();
        r5 = r1.hasNext();
        if (r5 == 0) goto L_0x0083;
        r5 = r1.next();
        r5 = (java.util.Map.Entry) r5;
        r5 = r5.getValue();
        r5 = (defpackage.iip) r5;
        r5 = r5.b;
        r0.add(r5);
        goto L_0x006b;
        r0 = (java.util.List) r0;
        r0 = (java.lang.Iterable) r0;
        r1 = defpackage.ajyu.v(r0);
        r0 = r16.d();
        r0 = r0.a();
        r0 = (java.lang.Iterable) r0;
        r0 = r0.iterator();
        r5 = r0.hasNext();
        r6 = 0;
        if (r5 == 0) goto L_0x03b6;
        r5 = r0.next();
        r5 = (defpackage.aaim) r5;
        r7 = r16.c();
        r7 = r7.d();
        r7 = (long) r7;
        r7 = java.lang.Long.valueOf(r7);
        r5.f(r7);
        r7 = r16.c();
        r7 = r7.e();
        r8 = r7;
        r8 = (java.lang.Iterable) r8;
        r9 = 0;
        r7 = "{";
        r10 = r7;
        r10 = (java.lang.CharSequence) r10;
        r7 = "}";
        r11 = r7;
        r11 = (java.lang.CharSequence) r11;
        r12 = 0;
        r13 = 0;
        r14 = 0;
        r15 = 57;
        r7 = defpackage.ajyu.a(r8, r9, r10, r11, r12, r13, r14, r15);
        r5.e(r7);
        r7 = r16.c();
        r7 = r7.h();
        r7 = (java.lang.Iterable) r7;
        r8 = new java.util.ArrayList;
        r9 = defpackage.ajyn.a(r7, r2);
        r8.<init>(r9);
        r8 = (java.util.Collection) r8;
        r7 = r7.iterator();
        r9 = r7.hasNext();
        if (r9 == 0) goto L_0x0134;
        r9 = r7.next();
        r9 = (defpackage.ajxm) r9;
        r10 = r16.b();
        r11 = r9.a;
        r10 = r10.get(r11);
        r10 = (defpackage.iip) r10;
        if (r10 == 0) goto L_0x0114;
        r10 = r10.b;
        if (r10 == 0) goto L_0x0114;
        r10 = r10.ag();
        goto L_0x0115;
        r10 = r6;
        r9 = r9.b;
        r9 = (java.lang.Number) r9;
        r9 = r9.intValue();
        r11 = (double) r9;
        r13 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        java.lang.Double.isNaN(r11);
        r11 = r11 / r13;
        r9 = defpackage.tof.a.a(r10);
        r11 = r11 / r9;
        r9 = java.lang.Double.valueOf(r11);
        r8.add(r9);
        goto L_0x00f1;
        r8 = (java.util.List) r8;
        r8 = (java.lang.Iterable) r8;
        r6 = defpackage.ajyu.y(r8);
        r6 = java.lang.Double.valueOf(r6);
        r5.a(r6);
        monitor-enter(r1);
        r7 = r16;
        r6 = r7.l;	 Catch:{ all -> 0x03b3 }
        r6 = r6.a;	 Catch:{ all -> 0x03b3 }
        r6 = (java.lang.Iterable) r6;	 Catch:{ all -> 0x03b3 }
        r6 = r6.iterator();	 Catch:{ all -> 0x03b3 }
        r8 = r6.hasNext();	 Catch:{ all -> 0x03b3 }
        if (r8 == 0) goto L_0x0160;	 Catch:{ all -> 0x03b3 }
        r8 = r6.next();	 Catch:{ all -> 0x03b3 }
        r8 = (defpackage.toh) r8;	 Catch:{ all -> 0x03b3 }
        r8.a(r5, r1);	 Catch:{ all -> 0x03b3 }
        goto L_0x0150;	 Catch:{ all -> 0x03b3 }
        r6 = r1.iterator();	 Catch:{ all -> 0x03b3 }
        r8 = r6.hasNext();	 Catch:{ all -> 0x03b3 }
        if (r8 == 0) goto L_0x017e;	 Catch:{ all -> 0x03b3 }
        r8 = r6.next();	 Catch:{ all -> 0x03b3 }
        r8 = (defpackage.aail) r8;	 Catch:{ all -> 0x03b3 }
        r8 = r8.q();	 Catch:{ all -> 0x03b3 }
        r9 = java.lang.Boolean.TRUE;	 Catch:{ all -> 0x03b3 }
        r8 = defpackage.akcr.a(r8, r9);	 Catch:{ all -> 0x03b3 }
        if (r8 == 0) goto L_0x0164;	 Catch:{ all -> 0x03b3 }
        r6 = 1;	 Catch:{ all -> 0x03b3 }
        goto L_0x017f;	 Catch:{ all -> 0x03b3 }
        r6 = 0;	 Catch:{ all -> 0x03b3 }
        r6 = java.lang.Boolean.valueOf(r6);	 Catch:{ all -> 0x03b3 }
        r5.h(r6);	 Catch:{ all -> 0x03b3 }
        r6 = r1.iterator();	 Catch:{ all -> 0x03b3 }
        r8 = r6.hasNext();	 Catch:{ all -> 0x03b3 }
        if (r8 == 0) goto L_0x01a4;	 Catch:{ all -> 0x03b3 }
        r8 = r6.next();	 Catch:{ all -> 0x03b3 }
        r8 = (defpackage.aail) r8;	 Catch:{ all -> 0x03b3 }
        r8 = r8.r();	 Catch:{ all -> 0x03b3 }
        r9 = java.lang.Boolean.TRUE;	 Catch:{ all -> 0x03b3 }
        r8 = defpackage.akcr.a(r8, r9);	 Catch:{ all -> 0x03b3 }
        if (r8 == 0) goto L_0x018a;	 Catch:{ all -> 0x03b3 }
        r6 = 1;	 Catch:{ all -> 0x03b3 }
        goto L_0x01a5;	 Catch:{ all -> 0x03b3 }
        r6 = 0;	 Catch:{ all -> 0x03b3 }
        r6 = java.lang.Boolean.valueOf(r6);	 Catch:{ all -> 0x03b3 }
        r5.i(r6);	 Catch:{ all -> 0x03b3 }
        r6 = r1.iterator();	 Catch:{ all -> 0x03b3 }
        r8 = r6.hasNext();	 Catch:{ all -> 0x03b3 }
        if (r8 == 0) goto L_0x01ca;	 Catch:{ all -> 0x03b3 }
        r8 = r6.next();	 Catch:{ all -> 0x03b3 }
        r8 = (defpackage.aail) r8;	 Catch:{ all -> 0x03b3 }
        r8 = r8.s();	 Catch:{ all -> 0x03b3 }
        r9 = java.lang.Boolean.TRUE;	 Catch:{ all -> 0x03b3 }
        r8 = defpackage.akcr.a(r8, r9);	 Catch:{ all -> 0x03b3 }
        if (r8 == 0) goto L_0x01b0;	 Catch:{ all -> 0x03b3 }
        r6 = 1;	 Catch:{ all -> 0x03b3 }
        goto L_0x01cb;	 Catch:{ all -> 0x03b3 }
        r6 = 0;	 Catch:{ all -> 0x03b3 }
        r6 = java.lang.Boolean.valueOf(r6);	 Catch:{ all -> 0x03b3 }
        r5.j(r6);	 Catch:{ all -> 0x03b3 }
        r6 = defpackage.tof.s.a;	 Catch:{ all -> 0x03b3 }
        r6 = (defpackage.akbl) r6;	 Catch:{ all -> 0x03b3 }
        r8 = defpackage.akfh.a(r1, r6);	 Catch:{ all -> 0x03b3 }
        r9 = 0;	 Catch:{ all -> 0x03b3 }
        r10 = 0;	 Catch:{ all -> 0x03b3 }
        r11 = 0;	 Catch:{ all -> 0x03b3 }
        r12 = 0;	 Catch:{ all -> 0x03b3 }
        r13 = 0;	 Catch:{ all -> 0x03b3 }
        r6 = defpackage.tof.t.a;	 Catch:{ all -> 0x03b3 }
        r14 = r6;	 Catch:{ all -> 0x03b3 }
        r14 = (defpackage.akbl) r14;	 Catch:{ all -> 0x03b3 }
        r15 = 31;	 Catch:{ all -> 0x03b3 }
        r6 = defpackage.akfh.a(r8, r9, r10, r11, r12, r13, r14, r15);	 Catch:{ all -> 0x03b3 }
        r5.i(r6);	 Catch:{ all -> 0x03b3 }
        r6 = defpackage.tof.u.a;	 Catch:{ all -> 0x03b3 }
        r6 = (defpackage.akbl) r6;	 Catch:{ all -> 0x03b3 }
        r6 = defpackage.akfh.c(r1, r6);	 Catch:{ all -> 0x03b3 }
        r6 = defpackage.akfh.c(r6);	 Catch:{ all -> 0x03b3 }
        r8 = defpackage.akfh.k(r6);	 Catch:{ all -> 0x03b3 }
        r6 = java.lang.Long.valueOf(r8);	 Catch:{ all -> 0x03b3 }
        r5.k(r6);	 Catch:{ all -> 0x03b3 }
        r6 = r1.iterator();	 Catch:{ all -> 0x03b3 }
        r8 = r6.hasNext();	 Catch:{ all -> 0x03b3 }
        if (r8 == 0) goto L_0x0222;	 Catch:{ all -> 0x03b3 }
        r8 = r6.next();	 Catch:{ all -> 0x03b3 }
        r8 = (defpackage.aail) r8;	 Catch:{ all -> 0x03b3 }
        r8 = r8.ak();	 Catch:{ all -> 0x03b3 }
        r9 = java.lang.Boolean.TRUE;	 Catch:{ all -> 0x03b3 }
        r8 = defpackage.akcr.a(r8, r9);	 Catch:{ all -> 0x03b3 }
        if (r8 == 0) goto L_0x0208;	 Catch:{ all -> 0x03b3 }
        r6 = 1;	 Catch:{ all -> 0x03b3 }
        goto L_0x0223;	 Catch:{ all -> 0x03b3 }
        r6 = 0;	 Catch:{ all -> 0x03b3 }
        r6 = java.lang.Boolean.valueOf(r6);	 Catch:{ all -> 0x03b3 }
        r5.o(r6);	 Catch:{ all -> 0x03b3 }
        r6 = defpackage.tof.v.a;	 Catch:{ all -> 0x03b3 }
        r6 = (defpackage.akbl) r6;	 Catch:{ all -> 0x03b3 }
        r8 = defpackage.akfh.a(r1, r6);	 Catch:{ all -> 0x03b3 }
        r9 = 0;	 Catch:{ all -> 0x03b3 }
        r10 = 0;	 Catch:{ all -> 0x03b3 }
        r11 = 0;	 Catch:{ all -> 0x03b3 }
        r12 = 0;	 Catch:{ all -> 0x03b3 }
        r13 = 0;	 Catch:{ all -> 0x03b3 }
        r6 = defpackage.tof.h.a;	 Catch:{ all -> 0x03b3 }
        r14 = r6;	 Catch:{ all -> 0x03b3 }
        r14 = (defpackage.akbl) r14;	 Catch:{ all -> 0x03b3 }
        r15 = 31;	 Catch:{ all -> 0x03b3 }
        r6 = defpackage.akfh.a(r8, r9, r10, r11, r12, r13, r14, r15);	 Catch:{ all -> 0x03b3 }
        r5.u(r6);	 Catch:{ all -> 0x03b3 }
        r6 = r1.iterator();	 Catch:{ all -> 0x03b3 }
        r8 = r6.hasNext();	 Catch:{ all -> 0x03b3 }
        if (r8 == 0) goto L_0x0263;	 Catch:{ all -> 0x03b3 }
        r8 = r6.next();	 Catch:{ all -> 0x03b3 }
        r8 = (defpackage.aail) r8;	 Catch:{ all -> 0x03b3 }
        r8 = r8.aD();	 Catch:{ all -> 0x03b3 }
        r9 = java.lang.Boolean.TRUE;	 Catch:{ all -> 0x03b3 }
        r8 = defpackage.akcr.a(r8, r9);	 Catch:{ all -> 0x03b3 }
        if (r8 == 0) goto L_0x0249;	 Catch:{ all -> 0x03b3 }
        r6 = 1;	 Catch:{ all -> 0x03b3 }
        goto L_0x0264;	 Catch:{ all -> 0x03b3 }
        r6 = 0;	 Catch:{ all -> 0x03b3 }
        r6 = java.lang.Boolean.valueOf(r6);	 Catch:{ all -> 0x03b3 }
        r5.w(r6);	 Catch:{ all -> 0x03b3 }
        r6 = r1.iterator();	 Catch:{ all -> 0x03b3 }
        r8 = r6.hasNext();	 Catch:{ all -> 0x03b3 }
        if (r8 == 0) goto L_0x0289;	 Catch:{ all -> 0x03b3 }
        r8 = r6.next();	 Catch:{ all -> 0x03b3 }
        r8 = (defpackage.aail) r8;	 Catch:{ all -> 0x03b3 }
        r8 = r8.aE();	 Catch:{ all -> 0x03b3 }
        r9 = java.lang.Boolean.TRUE;	 Catch:{ all -> 0x03b3 }
        r8 = defpackage.akcr.a(r8, r9);	 Catch:{ all -> 0x03b3 }
        if (r8 == 0) goto L_0x026f;	 Catch:{ all -> 0x03b3 }
        r6 = 1;	 Catch:{ all -> 0x03b3 }
        goto L_0x028a;	 Catch:{ all -> 0x03b3 }
        r6 = 0;	 Catch:{ all -> 0x03b3 }
        r6 = java.lang.Boolean.valueOf(r6);	 Catch:{ all -> 0x03b3 }
        r5.x(r6);	 Catch:{ all -> 0x03b3 }
        r6 = r1.iterator();	 Catch:{ all -> 0x03b3 }
        r8 = r6.hasNext();	 Catch:{ all -> 0x03b3 }
        if (r8 == 0) goto L_0x02af;	 Catch:{ all -> 0x03b3 }
        r8 = r6.next();	 Catch:{ all -> 0x03b3 }
        r8 = (defpackage.aail) r8;	 Catch:{ all -> 0x03b3 }
        r8 = r8.aF();	 Catch:{ all -> 0x03b3 }
        r9 = java.lang.Boolean.TRUE;	 Catch:{ all -> 0x03b3 }
        r8 = defpackage.akcr.a(r8, r9);	 Catch:{ all -> 0x03b3 }
        if (r8 == 0) goto L_0x0295;	 Catch:{ all -> 0x03b3 }
        r6 = 1;	 Catch:{ all -> 0x03b3 }
        goto L_0x02b0;	 Catch:{ all -> 0x03b3 }
        r6 = 0;	 Catch:{ all -> 0x03b3 }
        r6 = java.lang.Boolean.valueOf(r6);	 Catch:{ all -> 0x03b3 }
        r5.y(r6);	 Catch:{ all -> 0x03b3 }
        r6 = r1.iterator();	 Catch:{ all -> 0x03b3 }
        r8 = r6.hasNext();	 Catch:{ all -> 0x03b3 }
        if (r8 == 0) goto L_0x02d5;	 Catch:{ all -> 0x03b3 }
        r8 = r6.next();	 Catch:{ all -> 0x03b3 }
        r8 = (defpackage.aail) r8;	 Catch:{ all -> 0x03b3 }
        r8 = r8.aG();	 Catch:{ all -> 0x03b3 }
        r9 = java.lang.Boolean.TRUE;	 Catch:{ all -> 0x03b3 }
        r8 = defpackage.akcr.a(r8, r9);	 Catch:{ all -> 0x03b3 }
        if (r8 == 0) goto L_0x02bb;	 Catch:{ all -> 0x03b3 }
        r6 = 1;	 Catch:{ all -> 0x03b3 }
        goto L_0x02d6;	 Catch:{ all -> 0x03b3 }
        r6 = 0;	 Catch:{ all -> 0x03b3 }
        r6 = java.lang.Boolean.valueOf(r6);	 Catch:{ all -> 0x03b3 }
        r5.z(r6);	 Catch:{ all -> 0x03b3 }
        r6 = defpackage.tof.i.a;	 Catch:{ all -> 0x03b3 }
        r6 = (defpackage.akbl) r6;	 Catch:{ all -> 0x03b3 }
        r8 = defpackage.akfh.a(r1, r6);	 Catch:{ all -> 0x03b3 }
        r9 = 0;	 Catch:{ all -> 0x03b3 }
        r10 = 0;	 Catch:{ all -> 0x03b3 }
        r11 = 0;	 Catch:{ all -> 0x03b3 }
        r12 = 0;	 Catch:{ all -> 0x03b3 }
        r13 = 0;	 Catch:{ all -> 0x03b3 }
        r6 = defpackage.tof.j.a;	 Catch:{ all -> 0x03b3 }
        r14 = r6;	 Catch:{ all -> 0x03b3 }
        r14 = (defpackage.akbl) r14;	 Catch:{ all -> 0x03b3 }
        r15 = 31;	 Catch:{ all -> 0x03b3 }
        r6 = defpackage.akfh.a(r8, r9, r10, r11, r12, r13, r14, r15);	 Catch:{ all -> 0x03b3 }
        r5.f(r6);	 Catch:{ all -> 0x03b3 }
        r6 = defpackage.tof.k.a;	 Catch:{ all -> 0x03b3 }
        r6 = (defpackage.akbl) r6;	 Catch:{ all -> 0x03b3 }
        r8 = defpackage.akfh.a(r1, r6);	 Catch:{ all -> 0x03b3 }
        r9 = 0;	 Catch:{ all -> 0x03b3 }
        r10 = 0;	 Catch:{ all -> 0x03b3 }
        r11 = 0;	 Catch:{ all -> 0x03b3 }
        r12 = 0;	 Catch:{ all -> 0x03b3 }
        r13 = 0;	 Catch:{ all -> 0x03b3 }
        r6 = defpackage.tof.l.a;	 Catch:{ all -> 0x03b3 }
        r14 = r6;	 Catch:{ all -> 0x03b3 }
        r14 = (defpackage.akbl) r14;	 Catch:{ all -> 0x03b3 }
        r15 = 31;	 Catch:{ all -> 0x03b3 }
        r6 = defpackage.akfh.a(r8, r9, r10, r11, r12, r13, r14, r15);	 Catch:{ all -> 0x03b3 }
        r5.h(r6);	 Catch:{ all -> 0x03b3 }
        r6 = defpackage.tof.m.a;	 Catch:{ all -> 0x03b3 }
        r6 = (defpackage.akbl) r6;	 Catch:{ all -> 0x03b3 }
        r8 = defpackage.akfh.a(r1, r6);	 Catch:{ all -> 0x03b3 }
        r9 = 0;	 Catch:{ all -> 0x03b3 }
        r10 = 0;	 Catch:{ all -> 0x03b3 }
        r11 = 0;	 Catch:{ all -> 0x03b3 }
        r12 = 0;	 Catch:{ all -> 0x03b3 }
        r13 = 0;	 Catch:{ all -> 0x03b3 }
        r6 = defpackage.tof.n.a;	 Catch:{ all -> 0x03b3 }
        r14 = r6;	 Catch:{ all -> 0x03b3 }
        r14 = (defpackage.akbl) r14;	 Catch:{ all -> 0x03b3 }
        r15 = 31;	 Catch:{ all -> 0x03b3 }
        r6 = defpackage.akfh.a(r8, r9, r10, r11, r12, r13, r14, r15);	 Catch:{ all -> 0x03b3 }
        r5.g(r6);	 Catch:{ all -> 0x03b3 }
        r6 = defpackage.tof.o.a;	 Catch:{ all -> 0x03b3 }
        r6 = (defpackage.akbl) r6;	 Catch:{ all -> 0x03b3 }
        r8 = defpackage.akfh.a(r1, r6);	 Catch:{ all -> 0x03b3 }
        r9 = 0;	 Catch:{ all -> 0x03b3 }
        r10 = 0;	 Catch:{ all -> 0x03b3 }
        r11 = 0;	 Catch:{ all -> 0x03b3 }
        r12 = 0;	 Catch:{ all -> 0x03b3 }
        r13 = 0;	 Catch:{ all -> 0x03b3 }
        r6 = defpackage.tof.p.a;	 Catch:{ all -> 0x03b3 }
        r14 = r6;	 Catch:{ all -> 0x03b3 }
        r14 = (defpackage.akbl) r14;	 Catch:{ all -> 0x03b3 }
        r15 = 31;	 Catch:{ all -> 0x03b3 }
        r6 = defpackage.akfh.a(r8, r9, r10, r11, r12, r13, r14, r15);	 Catch:{ all -> 0x03b3 }
        r5.r(r6);	 Catch:{ all -> 0x03b3 }
        r6 = defpackage.tof.q.a;	 Catch:{ all -> 0x03b3 }
        r6 = (defpackage.akbl) r6;	 Catch:{ all -> 0x03b3 }
        r8 = defpackage.akfh.a(r1, r6);	 Catch:{ all -> 0x03b3 }
        r9 = 0;	 Catch:{ all -> 0x03b3 }
        r10 = 0;	 Catch:{ all -> 0x03b3 }
        r11 = 0;	 Catch:{ all -> 0x03b3 }
        r12 = 0;	 Catch:{ all -> 0x03b3 }
        r13 = 0;	 Catch:{ all -> 0x03b3 }
        r6 = defpackage.tof.r.a;	 Catch:{ all -> 0x03b3 }
        r14 = r6;	 Catch:{ all -> 0x03b3 }
        r14 = (defpackage.akbl) r14;	 Catch:{ all -> 0x03b3 }
        r15 = 31;	 Catch:{ all -> 0x03b3 }
        r6 = defpackage.akfh.a(r8, r9, r10, r11, r12, r13, r14, r15);	 Catch:{ all -> 0x03b3 }
        r5.j(r6);	 Catch:{ all -> 0x03b3 }
        r6 = r1.iterator();	 Catch:{ all -> 0x03b3 }
        r8 = r6.hasNext();	 Catch:{ all -> 0x03b3 }
        if (r8 == 0) goto L_0x0382;	 Catch:{ all -> 0x03b3 }
        r8 = r6.next();	 Catch:{ all -> 0x03b3 }
        r8 = (defpackage.aail) r8;	 Catch:{ all -> 0x03b3 }
        r8 = r8.aJ();	 Catch:{ all -> 0x03b3 }
        r9 = java.lang.Boolean.TRUE;	 Catch:{ all -> 0x03b3 }
        r8 = defpackage.akcr.a(r8, r9);	 Catch:{ all -> 0x03b3 }
        if (r8 == 0) goto L_0x0368;	 Catch:{ all -> 0x03b3 }
        r6 = 1;	 Catch:{ all -> 0x03b3 }
        goto L_0x0383;	 Catch:{ all -> 0x03b3 }
        r6 = 0;	 Catch:{ all -> 0x03b3 }
        r6 = java.lang.Boolean.valueOf(r6);	 Catch:{ all -> 0x03b3 }
        r5.C(r6);	 Catch:{ all -> 0x03b3 }
        r6 = r1.iterator();	 Catch:{ all -> 0x03b3 }
        r8 = r6.hasNext();	 Catch:{ all -> 0x03b3 }
        if (r8 == 0) goto L_0x03a8;	 Catch:{ all -> 0x03b3 }
        r8 = r6.next();	 Catch:{ all -> 0x03b3 }
        r8 = (defpackage.aail) r8;	 Catch:{ all -> 0x03b3 }
        r8 = r8.aK();	 Catch:{ all -> 0x03b3 }
        r9 = java.lang.Boolean.TRUE;	 Catch:{ all -> 0x03b3 }
        r8 = defpackage.akcr.a(r8, r9);	 Catch:{ all -> 0x03b3 }
        if (r8 == 0) goto L_0x038e;	 Catch:{ all -> 0x03b3 }
        r6 = 1;	 Catch:{ all -> 0x03b3 }
        goto L_0x03a9;	 Catch:{ all -> 0x03b3 }
        r6 = 0;	 Catch:{ all -> 0x03b3 }
        r6 = java.lang.Boolean.valueOf(r6);	 Catch:{ all -> 0x03b3 }
        r5.D(r6);	 Catch:{ all -> 0x03b3 }
        monitor-exit(r1);
        goto L_0x0099;
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
        r7 = r16;
        r0 = r16.b();
        r0 = r0.entrySet();
        r1 = "previewAnalyticsBuilderMap.entries";
        defpackage.akcr.a(r0, r1);
        r0 = (java.lang.Iterable) r0;
        r1 = new java.util.ArrayList;
        r1.<init>();
        r1 = (java.util.Collection) r1;
        r0 = r0.iterator();
        r5 = r0.hasNext();
        if (r5 == 0) goto L_0x0403;
        r5 = r0.next();
        r8 = r5;
        r8 = (java.util.Map.Entry) r8;
        r9 = r16.c();
        r8 = r8.getKey();
        r10 = "it.key";
        defpackage.akcr.a(r8, r10);
        r8 = (java.lang.String) r8;
        r8 = r9.b(r8);
        if (r8 == 0) goto L_0x03fc;
        r8 = r8.g();
        if (r8 != 0) goto L_0x03fc;
        r8 = 1;
        goto L_0x03fd;
        r8 = 0;
        if (r8 == 0) goto L_0x03d2;
        r1.add(r5);
        goto L_0x03d2;
        r1 = (java.util.List) r1;
        r1 = (java.lang.Iterable) r1;
        r0 = new java.util.ArrayList;
        r3 = defpackage.ajyn.a(r1, r2);
        r0.<init>(r3);
        r0 = (java.util.Collection) r0;
        r1 = r1.iterator();
        r3 = r1.hasNext();
        if (r3 == 0) goto L_0x042e;
        r3 = r1.next();
        r3 = (java.util.Map.Entry) r3;
        r3 = r3.getValue();
        r3 = (defpackage.iip) r3;
        r3 = r3.d;
        r0.add(r3);
        goto L_0x0416;
        r1 = r0;
        r1 = (java.util.List) r1;
        r0 = r16.d();
        r0 = r0.d;
        r3 = r16.d();
        r3 = r3.b;
        r5 = r3.a();
        if (r5 != 0) goto L_0x0445;
        r5 = "";
        r0.a(r5);
        r5 = r3.y();
        r8 = 0;
        if (r5 == 0) goto L_0x0456;
        r10 = r5.doubleValue();
        r10 = (long) r10;
        goto L_0x0457;
        r10 = r8;
        r12 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r10 = r10 * r12;
        r0.d = r10;
        r5 = r3.B();
        if (r5 == 0) goto L_0x0468;
        r10 = r5.doubleValue();
        r10 = (long) r10;
        goto L_0x0469;
        r10 = r8;
        r10 = r10 * r12;
        r0.c = r10;
        r5 = r3.o();
        if (r5 == 0) goto L_0x0476;
        r8 = r5.longValue();
        r0.f = r8;
        r3 = r3.A();
        if (r3 == 0) goto L_0x0482;
        r6 = r3.name();
        r0.m = r6;
        monitor-enter(r1);
        r3 = r1;	 Catch:{ all -> 0x0517 }
        r3 = (java.lang.Iterable) r3;	 Catch:{ all -> 0x0517 }
        r5 = new java.util.ArrayList;	 Catch:{ all -> 0x0517 }
        r5.<init>();	 Catch:{ all -> 0x0517 }
        r5 = (java.util.Collection) r5;	 Catch:{ all -> 0x0517 }
        r3 = r3.iterator();	 Catch:{ all -> 0x0517 }
        r6 = r3.hasNext();	 Catch:{ all -> 0x0517 }
        if (r6 == 0) goto L_0x04a7;	 Catch:{ all -> 0x0517 }
        r6 = r3.next();	 Catch:{ all -> 0x0517 }
        r6 = (defpackage.iiq) r6;	 Catch:{ all -> 0x0517 }
        r6 = r6.o;	 Catch:{ all -> 0x0517 }
        r6 = (java.lang.Iterable) r6;	 Catch:{ all -> 0x0517 }
        defpackage.ajyr.a(r5, r6);	 Catch:{ all -> 0x0517 }
        goto L_0x0493;	 Catch:{ all -> 0x0517 }
        r5 = (java.util.List) r5;	 Catch:{ all -> 0x0517 }
        r0.a(r5);	 Catch:{ all -> 0x0517 }
        r3 = r1;	 Catch:{ all -> 0x0517 }
        r3 = (java.lang.Iterable) r3;	 Catch:{ all -> 0x0517 }
        r5 = new java.util.ArrayList;	 Catch:{ all -> 0x0517 }
        r5.<init>();	 Catch:{ all -> 0x0517 }
        r5 = (java.util.Collection) r5;	 Catch:{ all -> 0x0517 }
        r3 = r3.iterator();	 Catch:{ all -> 0x0517 }
        r6 = r3.hasNext();	 Catch:{ all -> 0x0517 }
        if (r6 == 0) goto L_0x04d4;	 Catch:{ all -> 0x0517 }
        r6 = r3.next();	 Catch:{ all -> 0x0517 }
        r8 = r6;	 Catch:{ all -> 0x0517 }
        r8 = (defpackage.iiq) r8;	 Catch:{ all -> 0x0517 }
        r8 = r8.n;	 Catch:{ all -> 0x0517 }
        r8 = r8.isEmpty();	 Catch:{ all -> 0x0517 }
        r8 = r8 ^ r4;	 Catch:{ all -> 0x0517 }
        if (r8 == 0) goto L_0x04ba;	 Catch:{ all -> 0x0517 }
        r5.add(r6);	 Catch:{ all -> 0x0517 }
        goto L_0x04ba;	 Catch:{ all -> 0x0517 }
        r5 = (java.util.List) r5;	 Catch:{ all -> 0x0517 }
        r5 = (java.lang.Iterable) r5;	 Catch:{ all -> 0x0517 }
        r3 = new java.util.ArrayList;	 Catch:{ all -> 0x0517 }
        r2 = defpackage.ajyn.a(r5, r2);	 Catch:{ all -> 0x0517 }
        r3.<init>(r2);	 Catch:{ all -> 0x0517 }
        r3 = (java.util.Collection) r3;	 Catch:{ all -> 0x0517 }
        r2 = r5.iterator();	 Catch:{ all -> 0x0517 }
        r4 = r2.hasNext();	 Catch:{ all -> 0x0517 }
        if (r4 == 0) goto L_0x04f9;	 Catch:{ all -> 0x0517 }
        r4 = r2.next();	 Catch:{ all -> 0x0517 }
        r4 = (defpackage.iiq) r4;	 Catch:{ all -> 0x0517 }
        r4 = r4.n;	 Catch:{ all -> 0x0517 }
        r3.add(r4);	 Catch:{ all -> 0x0517 }
        goto L_0x04e7;	 Catch:{ all -> 0x0517 }
        r3 = (java.util.List) r3;	 Catch:{ all -> 0x0517 }
        r2 = defpackage.ajyu.g(r3);	 Catch:{ all -> 0x0517 }
        r2 = (java.util.Map) r2;	 Catch:{ all -> 0x0517 }
        if (r2 != 0) goto L_0x0507;	 Catch:{ all -> 0x0517 }
        r2 = defpackage.ajyx.a;	 Catch:{ all -> 0x0517 }
        r2 = (java.util.Map) r2;	 Catch:{ all -> 0x0517 }
        r0.a(r2);	 Catch:{ all -> 0x0517 }
        monitor-exit(r1);
        r0 = r16.d();
        r0 = r0.f;
        r1 = java.lang.Boolean.TRUE;
        r0.b(r1);
        return;
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tof.i():void");
    }

    public final zfw a() {
        return (zfw) this.e.b();
    }

    public final void a(aauu aauu) {
        if (aauu != aauu.SYSTEM_BACK || d().b.c() != aauu.EXIT_BUTTON) {
            for (aaim a : d().a()) {
                a.a(aauu);
            }
            if (aauu == aauu.EXIT_BUTTON || aauu == aauu.SYSTEM_BACK) {
                a(new tpk(null, null, null, null, 0, 0, false, false, 1023));
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(iip iip, String str) {
        for (toh a : this.l.a) {
            a.a(iip);
        }
        if (str != null) {
            b().put(str, iip);
        }
    }

    public final void a(String str, aeew aeew, abaw abaw) {
        akcr.b(str, "sessionId");
        if (aeew != null) {
            aapp aapp;
            Boolean valueOf;
            this.k = aeew;
            for (aaim aaim : d().a()) {
                aaim.k(aeew.j);
                aaim.A(aeew.f);
                aaim.m(aeew.l);
                aaim.a(tpu.a(aeew));
                aaim.a(abaw);
                aepx aepx = aeew.w;
                if (aepx != null) {
                    aaim.C(aepx.h);
                    aaim.O(aepx.i);
                    aaim.N(aepx.j);
                    aaim.Q(aepx.e);
                    aaim.P(aepx.d);
                    aaim.B(aepx.f);
                }
            }
            aail aail = d().b;
            aail.c(str);
            aail.d(aeew.h);
            String str2 = aeew.n;
            String str3 = null;
            aail.a(str2 != null ? aaqd.valueOf(str2) : null);
            aail.j(abyj.a(aeew));
            aepx aepx2 = aeew.w;
            if (aepx2 != null) {
                aail.a(aepx2.a);
                for (aapp aapp2 : aapp.values()) {
                    if (akcr.a(aapp2.name(), aeew.w.c)) {
                        break;
                    }
                }
                aapp2 = null;
                aail.a(aapp2);
                aail.b(aepx2.b);
            }
            aann aann = d().c;
            aann.d(str);
            aann.F(aeew.h);
            aepx aepx3 = aeew.w;
            boolean z = true;
            if (aepx3 != null) {
                aann.b(aepx3.a);
                for (aapp aapp22 : aapp.values()) {
                    if (akcr.a(aapp22.name(), aeew.w.c)) {
                        break;
                    }
                }
                aapp22 = null;
                aann.a(aapp22);
                aann.c(aepx3.b);
                Object obj = aepx3.k;
                akcr.a(obj, "it.isGeo");
                if (obj.booleanValue()) {
                    d().g = true;
                }
            }
            aaij aaij = d().e;
            aaij.a(aeew.h);
            String str4 = aeew.n;
            aaij.a(str4 != null ? aaqd.valueOf(str4) : null);
            aaij.a(aeew.j);
            aaij.b(aeew.k);
            str4 = aeew.t;
            aaij.a(str4 != null ? abgd.valueOf(str4) : null);
            Integer num = aeew.m;
            aaij.a(num != null ? Long.valueOf((long) num.intValue()) : null);
            str4 = aeew.f;
            aaij.a(str4 != null ? aabv.valueOf(str4) : null);
            aaij.a(abaw);
            aaij.c(aeew.l);
            aars aars = new aars();
            aaxu aaxu = new aaxu();
            Integer num2 = aeew.q;
            aaxu.b(num2 != null ? Long.valueOf((long) num2.intValue()) : null);
            num2 = aeew.p;
            aaxu.a(num2 != null ? Long.valueOf((long) num2.intValue()) : null);
            aars.a(aaxu);
            aasc a = tpu.a(aeew);
            aars.a(a != null ? a.toString() : null);
            aaij.a(aars);
            aaij = d().e;
            aepx aepx4 = aeew.w;
            if (aepx4 != null) {
                aaij.b(aepx4.a);
                aaij.c(aepx4.i);
                aaij.b(aepx4.j);
            }
            aahr aahr = d().f;
            aeew aeew2 = this.k;
            if (aeew2 != null) {
                if (tpu.a(aeew2) != aasc.VIDEO) {
                    z = false;
                }
                valueOf = Boolean.valueOf(z);
            } else {
                valueOf = null;
            }
            aahr.e(valueOf);
            aepx aepx5 = aeew.w;
            if (aepx5 != null) {
                str3 = aepx5.a;
            }
            aahr.b(str3);
        }
    }

    public final void a(tpk tpk) {
        akcr.b(tpk, "previewSendToData");
        iiq iiq = d().d;
        iiq.h = (long) tpk.d;
        iiq.j = (long) tpk.e;
        for (aaim aaim : d().a()) {
            aaim.s(Boolean.valueOf(tpk.f));
            aaim.t(Boolean.valueOf(tpk.g));
        }
    }

    /* Access modifiers changed, original: final */
    public final ConcurrentHashMap<String, iip> b() {
        return (ConcurrentHashMap) this.f.b();
    }

    public final tyb c() {
        return (tyb) this.g.b();
    }

    public final iip d() {
        return (iip) this.h.b();
    }

    public final iip e() {
        f();
        return d();
    }

    public final void f() {
        String str = this.c;
        if (str != null) {
            iip iip = (iip) b().get(str);
            if (iip == null) {
                iip = new iip();
            }
            a(iip, str);
        } else {
            a(d(), this.c);
        }
        tpl tpl = this.d;
        if (tpl == null) {
            akcr.a("previewStartUpConfig");
        }
        if (tpn.a(tpl)) {
            i();
        } else {
            for (aaim aaim : d().a()) {
                aaim.a(Double.valueOf(a(aaim)));
            }
        }
        for (aaim aaim2 : d().a()) {
            Boolean bool;
            boolean z = false;
            boolean z2 = (aaim2.e() != null && aaim2.e().longValue() > 0) || (aaim2.d() != null && aaim2.d().longValue() > 0);
            aaim2.a(Boolean.valueOf(z2));
            if (b().isEmpty()) {
                bool = Boolean.FALSE;
            } else {
                Boolean valueOf;
                Object entrySet = b().entrySet();
                akcr.a(entrySet, "previewAnalyticsBuilderMap.entries");
                Collection arrayList = new ArrayList();
                for (Object next : (Iterable) entrySet) {
                    Entry entry = (Entry) next;
                    tyb c = c();
                    Object key = entry.getKey();
                    akcr.a(key, "it.key");
                    tya b = c.b((String) key);
                    key = (b == null || b.g()) ? null : 1;
                    if (key != null) {
                        arrayList.add(next);
                    }
                }
                Iterable<Entry> iterable = (List) arrayList;
                Collection arrayList2 = new ArrayList(ajyn.a((Iterable) iterable, 10));
                for (Entry value : iterable) {
                    arrayList2.add(((iip) value.getValue()).b);
                }
                List list = (List) arrayList2;
                synchronized (list) {
                    if (ajyu.k(ajyu.o(list)).size() > 1) {
                        z = true;
                    }
                    valueOf = Boolean.valueOf(z);
                }
                bool = valueOf;
            }
            aaim2.d(bool);
            aaim2.B(Boolean.valueOf(this.m.j.c));
        }
        d().b.a(d().a);
    }

    public final aauu g() {
        return d().b.c();
    }

    public final boolean h() {
        return akcr.a(d().b.ax(), Boolean.TRUE);
    }
}
