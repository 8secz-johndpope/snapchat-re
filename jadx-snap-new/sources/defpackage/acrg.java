package defpackage;

import android.location.Location;
import android.text.TextUtils;
import com.google.common.geometry.S2CellId;
import com.google.common.geometry.S2LatLng;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import com.mapbox.services.android.telemetry.constants.TelemetryConstants;
import defpackage.nbo.a;
import defpackage.nbo.c;
import defpackage.nbo.d;
import defpackage.nct.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: acrg */
public final class acrg implements nbo {
    final Object a;
    final acri b;
    boolean c;
    long d;
    int e;
    boolean f;
    Map<String, alhq> g;
    List<alhm> h;
    Map<String, alhm> i;
    alhm j;
    alhq k;
    long l;
    final a m;
    @Deprecated
    private final c n;
    private final nbp o;
    private final abss p;
    private final acqt q;
    private final nct r;
    private boolean s;
    private int t;
    private abml u;
    private final d v;
    private final a w;
    private final b x;
    private final abpt<c> y;

    /* renamed from: acrg$1 */
    class 1 implements a {
        1() {
        }

        public final int a() {
            int i;
            synchronized (acrg.this) {
                i = acrg.this.e;
            }
            return i;
        }
    }

    /* renamed from: acrg$b */
    class b implements Runnable {
        private final a a;

        public b(a aVar) {
            this.a = aVar;
        }

        public final void run() {
            synchronized (acrg.this) {
                if (acrg.this.c) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = currentTimeMillis - acrg.this.d;
                    if (j < ((long) this.a.a())) {
                        return;
                    } else if (!acrg.this.f || j >= 60000) {
                        acrg.this.d = currentTimeMillis;
                        acrg.this.f = true;
                        acrg.this.b.a(acrg.this.m);
                        return;
                    } else {
                        return;
                    }
                }
                acrg.this.j();
            }
        }
    }

    /* renamed from: acrg$a */
    class a implements acrj {
        private a() {
        }

        /* synthetic */ a(acrg acrg, byte b) {
            this();
        }

        /* JADX WARNING: Missing block: B:13:0x0028, code skipped:
            if (r5 != null) goto L_0x002b;
     */
        /* JADX WARNING: Missing block: B:14:0x002a, code skipped:
            return;
     */
        /* JADX WARNING: Missing block: B:15:0x002b, code skipped:
            r3.a.a((java.util.List) r5, r6);
     */
        /* JADX WARNING: Missing block: B:16:0x0030, code skipped:
            return;
     */
        public final void a(defpackage.acrd r4, java.util.List<defpackage.alhm> r5, double r6) {
            /*
            r3 = this;
            r0 = defpackage.acrg.this;
            monitor-enter(r0);
            r1 = defpackage.acrg.this;	 Catch:{ all -> 0x0031 }
            r2 = 0;
            r1.f = r2;	 Catch:{ all -> 0x0031 }
            r1 = r4.b;	 Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x0010;
        L_0x000c:
            r1 = r4.a;	 Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x0014;
        L_0x0010:
            r4 = r4.c;	 Catch:{ all -> 0x0031 }
            if (r4 == 0) goto L_0x0027;
        L_0x0014:
            r4 = defpackage.acrg.this;	 Catch:{ all -> 0x0031 }
            r5 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
            r6 = defpackage.acrg.this;	 Catch:{ all -> 0x0031 }
            r6 = r6.e;	 Catch:{ all -> 0x0031 }
            r6 = r6 << 1;
            r5 = java.lang.Math.min(r5, r6);	 Catch:{ all -> 0x0031 }
            r4.e = r5;	 Catch:{ all -> 0x0031 }
            monitor-exit(r0);	 Catch:{ all -> 0x0031 }
            return;
        L_0x0027:
            monitor-exit(r0);	 Catch:{ all -> 0x0031 }
            if (r5 != 0) goto L_0x002b;
        L_0x002a:
            return;
        L_0x002b:
            r4 = defpackage.acrg.this;
            r4.a(r5, r6);
            return;
        L_0x0031:
            r4 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x0031 }
            throw r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.acrg$a.a(acrd, java.util.List, double):void");
        }
    }

    /* renamed from: acrg$2 */
    class 2 implements b {
        2() {
        }

        public final void a(alhq alhq) {
            acrg acrg = acrg.this;
            synchronized (acrg.a) {
                if (acrg.k == null) {
                    acrg.k = new alhq();
                }
                acrg.k.i = alhq.i;
                acrg.k.j = alhq.j;
                acrg.k.l = alhq.l;
            }
            acrg.h();
        }
    }

    /* renamed from: acrg$3 */
    class 3 implements ajej {
        3() {
        }

        public final void dispose() {
            acrg acrg = acrg.this;
            acrg.j();
            synchronized (acrg.a) {
                acrg.g.clear();
                acrg.h.clear();
                acrg.i.clear();
                acrg.j = null;
                acrg.k = null;
                acrg.l = 0;
            }
            synchronized (acrg) {
                acrg.d = 0;
                acrg.f = false;
                acrg.e = 300000;
            }
        }

        public final boolean isDisposed() {
            return false;
        }
    }

    /* renamed from: acrg$5 */
    class 5 implements Comparator<alhq> {
        5() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            alhq alhq = (alhq) obj;
            alhq alhq2 = (alhq) obj2;
            if (alhq.f() && !alhq2.f()) {
                return -1;
            }
            if (alhq.f() || !alhq2.f()) {
                if (alhq.d > alhq2.d) {
                    return -1;
                }
                if (alhq.d == alhq2.d) {
                    return 0;
                }
            }
            return 1;
        }
    }

    /* renamed from: acrg$6 */
    static /* synthetic */ class 6 {
        static final /* synthetic */ int[] a = new int[nbo.b.a().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|5|6|7|8|10) */
        /* JADX WARNING: Missing block: B:11:?, code skipped:
            return;
     */
        static {
            /*
            r0 = defpackage.nbo.b.a();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = 1;
            r1 = a;	 Catch:{ NoSuchFieldError -> 0x000f }
            r2 = 0;
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x000f }
        L_0x000f:
            r1 = 2;
            r2 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2[r0] = r1;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.acrg$6.<clinit>():void");
        }
    }

    /* renamed from: acrg$c */
    static class c implements Comparator<alhq> {
        private Map<alhq, Double> a;
        private boolean b = false;

        public c(Map<alhq, Double> map) {
            this.a = map;
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((Double) this.a.get((alhq) obj)).doubleValue() >= ((Double) this.a.get((alhq) obj2)).doubleValue() ? -1 : 1;
        }
    }

    /* renamed from: acrg$4 */
    class 4 implements a {
        private /* synthetic */ int a = 1800000;

        4() {
        }

        public final int a() {
            return this.a;
        }
    }

    public acrg(ajei ajei, d dVar, nct nct, acri acri, nbp nbp, abss abss, nbl nbl, acqt acqt) {
        this(ajei, dVar, nct, acri, nbp, abss, nbl, acqt, (byte) 0);
    }

    private acrg(ajei ajei, d dVar, nct nct, acri acri, nbp nbp, abss abss, nbl nbl, acqt acqt, byte b) {
        this.a = new Object();
        this.s = false;
        this.t = 1;
        this.w = new 1();
        this.x = new b(this.w);
        this.y = new abpt();
        this.m = new a(this, (byte) 0);
        this.n = null;
        this.v = dVar;
        this.r = nct;
        this.g = new HashMap();
        this.h = new ArrayList();
        this.i = new HashMap();
        this.b = acri;
        this.o = nbp;
        this.p = abss;
        this.q = acqt;
        nct.a(new 2());
        if (ajei != null) {
            ajei.a(new 3());
            ajei.a(nbl.c().d().b((ajdw) zgb.a(adcw.b.callsite("FriendLocationManagerImpl")).b()).a(new -$$Lambda$acrg$S9O01BDHTdy-EnMXCc6Mw0QUJ4w(this), -$$Lambda$acrg$wA0CToYr_qsVJVVBzVxT4C2Hod8.INSTANCE));
        }
    }

    private static double a(alhq alhq, alhm alhm) {
        return adbu.a((double) alhq.b, (double) alhq.c, (double) alhm.c, (double) alhm.d) * 1000.0d;
    }

    private static boolean a(double d) {
        return d < 60.0d;
    }

    private boolean a(alhq alhq) {
        String a = this.v.a();
        Location a2 = this.r.a();
        abss.a();
        if (a2 == null || TextUtils.isEmpty(a)) {
            return false;
        }
        alhq.a((float) a2.getLatitude());
        alhq.b((float) a2.getLongitude());
        alhq.b(S2CellId.fromLatLng(S2LatLng.fromDegrees(a2.getLatitude(), a2.getLongitude())).id());
        alhq.a(a2.getTime());
        alhq.a(a);
        if (!(acrg.a(alhq, a2) || alhq.g == null)) {
            alhq.g.b("DEFAULT");
            String str = "10220700";
            alhq.g.a(str);
            alhq.g.c(str);
            alhq.g.d(str);
            alhq.g.e("10220701");
            alhq.g.b();
        }
        return true;
    }

    private static boolean a(alhq alhq, alhq alhq2) {
        return (alhq.g == null || alhq2.g == null) ? false : TextUtils.equals(alhq.g.a, alhq2.g.a);
    }

    /* JADX WARNING: Missing block: B:17:0x004b, code skipped:
            return true;
     */
    private static boolean a(defpackage.alhq r10, android.location.Location r11) {
        /*
        r0 = r10.g;
        r1 = 1;
        if (r0 != 0) goto L_0x0006;
    L_0x0005:
        return r1;
    L_0x0006:
        r0 = r10.g;
        r0 = r0.i;
        if (r0 != 0) goto L_0x000d;
    L_0x000c:
        return r1;
    L_0x000d:
        r0 = r10.g;
        r0 = r0.c();
        if (r0 == 0) goto L_0x004b;
    L_0x0015:
        r0 = r10.g;
        r0 = r0.d();
        if (r0 == 0) goto L_0x004b;
    L_0x001d:
        r0 = r10.g;
        r0 = r0.e();
        if (r0 != 0) goto L_0x0026;
    L_0x0025:
        goto L_0x004b;
    L_0x0026:
        r2 = r11.getLatitude();
        r4 = r11.getLongitude();
        r11 = r10.g;
        r11 = r11.f;
        r6 = (double) r11;
        r11 = r10.g;
        r11 = r11.g;
        r8 = (double) r11;
        r2 = defpackage.adbu.a(r2, r4, r6, r8);
        r11 = (float) r2;
        r0 = 1148846080; // 0x447a0000 float:1000.0 double:5.676053805E-315;
        r11 = r11 * r0;
        r10 = r10.g;
        r10 = r10.h;
        r10 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1));
        if (r10 >= 0) goto L_0x0049;
    L_0x0048:
        return r1;
    L_0x0049:
        r10 = 0;
        return r10;
    L_0x004b:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acrg.a(alhq, android.location.Location):boolean");
    }

    private static alhq b(alhq alhq) {
        if (alhq != null) {
            try {
                return (alhq) MessageNano.mergeFrom(new alhq(), MessageNano.toByteArray(alhq));
            } catch (InvalidProtocolBufferNanoException e) {
                new StringBuilder("Cannot copy self location ").append(e);
            }
        }
        return new alhq();
    }

    /* JADX WARNING: Missing block: B:11:0x0017, code skipped:
            return;
     */
    private synchronized void d(int r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r2.t = r3;	 Catch:{ all -> 0x0025 }
        r0 = defpackage.acrg.6.a;	 Catch:{ all -> 0x0025 }
        r1 = 1;
        r3 = r3 - r1;
        r3 = r0[r3];	 Catch:{ all -> 0x0025 }
        if (r3 == r1) goto L_0x001f;
    L_0x000b:
        r0 = 2;
        if (r3 == r0) goto L_0x0018;
    L_0x000e:
        r0 = 3;
        if (r3 == r0) goto L_0x0012;
    L_0x0011:
        goto L_0x0016;
    L_0x0012:
        r3 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r2.e = r3;	 Catch:{ all -> 0x0025 }
    L_0x0016:
        monitor-exit(r2);
        return;
    L_0x0018:
        r3 = 300000; // 0x493e0 float:4.2039E-40 double:1.482197E-318;
        r2.e = r3;	 Catch:{ all -> 0x0025 }
        monitor-exit(r2);
        return;
    L_0x001f:
        r3 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        r2.e = r3;	 Catch:{ all -> 0x0025 }
        monitor-exit(r2);
        return;
    L_0x0025:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acrg.d(int):void");
    }

    private long p() {
        long j;
        synchronized (this.a) {
            j = this.l;
        }
        return j;
    }

    public final alhq a(String str) {
        alhq alhq;
        synchronized (this.a) {
            alhq = (alhq) this.g.get(str);
        }
        return alhq;
    }

    public final List<alhm> a(List<alhq> list) {
        ArrayList arrayList = new ArrayList();
        for (alhq alhq : list) {
            alhm b = b(alhq.a);
            if (!(b == null || arrayList.contains(b))) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }

    public final Map<String, alhq> a() {
        HashMap hashMap;
        synchronized (this.a) {
            hashMap = new HashMap(this.g);
        }
        return hashMap;
    }

    public final void a(int i) {
        a(2, this.w);
    }

    public final void a(int i, a aVar) {
        d(i);
        this.v.b(new b(aVar));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:42:0x00e2 in {2, 10, 11, 12, 25, 26, 27, 32, 33, 37, 41} preds:[]
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
    public final void a(java.util.List<defpackage.alhm> r17, double r18) {
        /*
        r16 = this;
        r1 = r16;
        r0 = r1.v;
        r0 = r0.a();
        r2 = android.text.TextUtils.isEmpty(r0);
        if (r2 == 0) goto L_0x000f;
        return;
        r2 = new java.util.HashMap;
        r2.<init>();
        r3 = new java.util.HashMap;
        r3.<init>();
        r4 = new java.util.HashMap;
        r4.<init>();
        r5 = new java.util.ArrayList;
        r5.<init>();
        r6 = r17.iterator();
        r7 = 0;
        r8 = r7;
        r9 = r6.hasNext();
        if (r9 == 0) goto L_0x007c;
        r9 = r6.next();
        r9 = (defpackage.alhm) r9;
        r10 = r1.q;
        r11 = "friendCluster";
        defpackage.akcr.b(r9, r11);
        r11 = "selfUserId";
        defpackage.akcr.b(r0, r11);
        r11 = "mapStatusDataFetcher";
        defpackage.akcr.b(r10, r11);
        r11 = "statusDataTextHashMap";
        defpackage.akcr.b(r4, r11);
        r11 = r9.e;
        r12 = new acrf$a$a;
        r12.<init>(r4, r10, r0);
        r12 = (java.util.Comparator) r12;
        java.util.Arrays.sort(r11, r12);
        r10 = r9.e;
        r11 = r10.length;
        r12 = 0;
        if (r12 >= r11) goto L_0x0078;
        r13 = r10[r12];
        r14 = r13.a;
        r15 = android.text.TextUtils.equals(r14, r0);
        if (r15 == 0) goto L_0x006f;
        r7 = defpackage.acrg.b(r13);
        r1.a(r13);
        r8 = r9;
        r2.put(r14, r13);
        r3.put(r14, r9);
        r12 = r12 + 1;
        goto L_0x005b;
        r5.add(r9);
        goto L_0x0029;
        r0 = r1.r;
        r0 = r0.a();
        defpackage.acre.a(r0, r7, r5);
        r9 = java.lang.System.currentTimeMillis();
        r4 = r1.a;
        monitor-enter(r4);
        r1.g = r2;	 Catch:{ all -> 0x00df }
        r1.h = r5;	 Catch:{ all -> 0x00df }
        r1.j = r8;	 Catch:{ all -> 0x00df }
        r1.k = r7;	 Catch:{ all -> 0x00df }
        r1.i = r3;	 Catch:{ all -> 0x00df }
        r1.l = r9;	 Catch:{ all -> 0x00df }
        monitor-exit(r4);	 Catch:{ all -> 0x00df }
        r16.h();
        monitor-enter(r16);
        r0 = r1.t;	 Catch:{ all -> 0x00dc }
        r3 = 1;	 Catch:{ all -> 0x00dc }
        if (r0 != r3) goto L_0x00bf;	 Catch:{ all -> 0x00dc }
        r3 = 4591870180066957722; // 0x3fb999999999999a float:-1.5881868E-23 double:0.1;	 Catch:{ all -> 0x00dc }
        r0 = (r18 > r3 ? 1 : (r18 == r3 ? 0 : -1));	 Catch:{ all -> 0x00dc }
        if (r0 <= 0) goto L_0x00ba;	 Catch:{ all -> 0x00dc }
        r3 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;	 Catch:{ all -> 0x00dc }
        r3 = r3 * r18;	 Catch:{ all -> 0x00dc }
        r3 = java.lang.Math.round(r3);	 Catch:{ all -> 0x00dc }
        r0 = (int) r3;	 Catch:{ all -> 0x00dc }
        r1.e = r0;	 Catch:{ all -> 0x00dc }
        goto L_0x00c4;	 Catch:{ all -> 0x00dc }
        r0 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;	 Catch:{ all -> 0x00dc }
        r1.e = r0;	 Catch:{ all -> 0x00dc }
        goto L_0x00c4;	 Catch:{ all -> 0x00dc }
        r0 = 300000; // 0x493e0 float:4.2039E-40 double:1.482197E-318;	 Catch:{ all -> 0x00dc }
        r1.e = r0;	 Catch:{ all -> 0x00dc }
        monitor-exit(r16);	 Catch:{ all -> 0x00dc }
        r0 = r1.y;
        r0 = r0.iterator();
        r3 = r0.hasNext();
        if (r3 == 0) goto L_0x00db;
        r3 = r0.next();
        r3 = (defpackage.nbo.c) r3;
        r3.a(r2);
        goto L_0x00cb;
        return;
        r0 = move-exception;
        monitor-exit(r16);	 Catch:{ all -> 0x00dc }
        throw r0;
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x00df }
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acrg.a(java.util.List, double):void");
    }

    public final void a(c cVar) {
        this.y.c(cVar);
    }

    public final synchronized void a(boolean z) {
        this.c = z;
    }

    public final boolean a(long j) {
        return System.currentTimeMillis() - p() < j;
    }

    public final int b() {
        int size;
        synchronized (this.a) {
            size = this.g.size();
        }
        return size;
    }

    public final alhm b(String str) {
        alhm alhm;
        synchronized (this.a) {
            alhm = (alhm) this.i.get(str);
        }
        return alhm;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:42:0x011b in {7, 12, 13, 16, 17, 24, 25, 31, 33, 35, 38, 41} preds:[]
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
    public final java.util.List<defpackage.alhq> b(int r20) {
        /*
        r19 = this;
        r1 = r19;
        r2 = r1.a;
        monitor-enter(r2);
        r0 = r1.r;	 Catch:{ all -> 0x0118 }
        r0 = r0.a();	 Catch:{ all -> 0x0118 }
        r3 = r1.v;	 Catch:{ all -> 0x0118 }
        r3 = r3.a();	 Catch:{ all -> 0x0118 }
        r4 = android.text.TextUtils.isEmpty(r3);	 Catch:{ all -> 0x0118 }
        if (r4 == 0) goto L_0x001e;	 Catch:{ all -> 0x0118 }
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0118 }
        r0.<init>();	 Catch:{ all -> 0x0118 }
        monitor-exit(r2);	 Catch:{ all -> 0x0118 }
        return r0;	 Catch:{ all -> 0x0118 }
        r4 = 0;	 Catch:{ all -> 0x0118 }
        if (r0 == 0) goto L_0x0074;	 Catch:{ all -> 0x0118 }
        r5 = r0.getLatitude();	 Catch:{ all -> 0x0118 }
        r5 = java.lang.Double.valueOf(r5);	 Catch:{ all -> 0x0118 }
        r6 = r0.getLongitude();	 Catch:{ all -> 0x0118 }
        r0 = java.lang.Double.valueOf(r6);	 Catch:{ all -> 0x0118 }
        r6 = r1.g;	 Catch:{ all -> 0x0118 }
        r6 = r6.get(r3);	 Catch:{ all -> 0x0118 }
        r6 = (defpackage.alhq) r6;	 Catch:{ all -> 0x0118 }
        if (r6 != 0) goto L_0x005e;	 Catch:{ all -> 0x0118 }
        r6 = new alhq;	 Catch:{ all -> 0x0118 }
        r6.<init>();	 Catch:{ all -> 0x0118 }
        r7 = r5.floatValue();	 Catch:{ all -> 0x0118 }
        r6.a(r7);	 Catch:{ all -> 0x0118 }
        r7 = r0.floatValue();	 Catch:{ all -> 0x0118 }
        r6.b(r7);	 Catch:{ all -> 0x0118 }
        r7 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x0118 }
        r6.a(r7);	 Catch:{ all -> 0x0118 }
        r6.a(r3);	 Catch:{ all -> 0x0118 }
        r7 = r1.g;	 Catch:{ all -> 0x0118 }
        r7.put(r3, r6);	 Catch:{ all -> 0x0118 }
        goto L_0x008f;	 Catch:{ all -> 0x0118 }
        r7 = r5.floatValue();	 Catch:{ all -> 0x0118 }
        r6.a(r7);	 Catch:{ all -> 0x0118 }
        r7 = r0.floatValue();	 Catch:{ all -> 0x0118 }
        r6.b(r7);	 Catch:{ all -> 0x0118 }
        r7 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x0118 }
        r6.a(r7);	 Catch:{ all -> 0x0118 }
        goto L_0x008f;	 Catch:{ all -> 0x0118 }
        r0 = r1.g;	 Catch:{ all -> 0x0118 }
        r0 = r0.get(r3);	 Catch:{ all -> 0x0118 }
        r0 = (defpackage.alhq) r0;	 Catch:{ all -> 0x0118 }
        if (r0 == 0) goto L_0x008d;	 Catch:{ all -> 0x0118 }
        r5 = r0.b;	 Catch:{ all -> 0x0118 }
        r5 = (double) r5;	 Catch:{ all -> 0x0118 }
        r5 = java.lang.Double.valueOf(r5);	 Catch:{ all -> 0x0118 }
        r0 = r0.c;	 Catch:{ all -> 0x0118 }
        r6 = (double) r0;	 Catch:{ all -> 0x0118 }
        r0 = java.lang.Double.valueOf(r6);	 Catch:{ all -> 0x0118 }
        goto L_0x008f;	 Catch:{ all -> 0x0118 }
        r0 = r4;	 Catch:{ all -> 0x0118 }
        r5 = r0;	 Catch:{ all -> 0x0118 }
        if (r5 == 0) goto L_0x0111;	 Catch:{ all -> 0x0118 }
        r6 = new java.util.HashMap;	 Catch:{ all -> 0x0118 }
        r6.<init>();	 Catch:{ all -> 0x0118 }
        r7 = r1.g;	 Catch:{ all -> 0x0118 }
        r7 = r7.values();	 Catch:{ all -> 0x0118 }
        r7 = r7.iterator();	 Catch:{ all -> 0x0118 }
        r8 = r7.hasNext();	 Catch:{ all -> 0x0118 }
        if (r8 == 0) goto L_0x00d8;	 Catch:{ all -> 0x0118 }
        r8 = r7.next();	 Catch:{ all -> 0x0118 }
        r8 = (defpackage.alhq) r8;	 Catch:{ all -> 0x0118 }
        r9 = r8.a;	 Catch:{ all -> 0x0118 }
        r9 = r9.equals(r3);	 Catch:{ all -> 0x0118 }
        if (r9 == 0) goto L_0x00b6;	 Catch:{ all -> 0x0118 }
        r4 = r8;	 Catch:{ all -> 0x0118 }
        goto L_0x00a0;	 Catch:{ all -> 0x0118 }
        r10 = r5.doubleValue();	 Catch:{ all -> 0x0118 }
        r12 = r0.doubleValue();	 Catch:{ all -> 0x0118 }
        r9 = r8.b;	 Catch:{ all -> 0x0118 }
        r14 = (double) r9;	 Catch:{ all -> 0x0118 }
        r9 = r8.c;	 Catch:{ all -> 0x0118 }
        r18 = r0;	 Catch:{ all -> 0x0118 }
        r0 = (double) r9;	 Catch:{ all -> 0x0118 }
        r16 = r0;	 Catch:{ all -> 0x0118 }
        r0 = defpackage.adbu.a(r10, r12, r14, r16);	 Catch:{ all -> 0x0118 }
        r0 = java.lang.Double.valueOf(r0);	 Catch:{ all -> 0x0118 }
        r6.put(r8, r0);	 Catch:{ all -> 0x0118 }
        r1 = r19;	 Catch:{ all -> 0x0118 }
        r0 = r18;	 Catch:{ all -> 0x0118 }
        goto L_0x00a0;	 Catch:{ all -> 0x0118 }
        r0 = new java.util.TreeMap;	 Catch:{ all -> 0x0118 }
        r1 = new acrg$c;	 Catch:{ all -> 0x0118 }
        r1.<init>(r6);	 Catch:{ all -> 0x0118 }
        r0.<init>(r1);	 Catch:{ all -> 0x0118 }
        r0.putAll(r6);	 Catch:{ all -> 0x0118 }
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x0118 }
        r1.<init>();	 Catch:{ all -> 0x0118 }
        r0 = r0.descendingKeySet();	 Catch:{ all -> 0x0118 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0118 }
        r3 = 0;	 Catch:{ all -> 0x0118 }
        r5 = 0;	 Catch:{ all -> 0x0118 }
        r6 = r0.hasNext();	 Catch:{ all -> 0x0118 }
        if (r6 == 0) goto L_0x010a;	 Catch:{ all -> 0x0118 }
        r6 = r0.next();	 Catch:{ all -> 0x0118 }
        r6 = (defpackage.alhq) r6;	 Catch:{ all -> 0x0118 }
        r7 = r20;	 Catch:{ all -> 0x0118 }
        if (r5 >= r7) goto L_0x010a;	 Catch:{ all -> 0x0118 }
        r1.add(r6);	 Catch:{ all -> 0x0118 }
        r5 = r5 + 1;	 Catch:{ all -> 0x0118 }
        goto L_0x00f4;	 Catch:{ all -> 0x0118 }
        if (r4 == 0) goto L_0x010f;	 Catch:{ all -> 0x0118 }
        r1.add(r3, r4);	 Catch:{ all -> 0x0118 }
        monitor-exit(r2);	 Catch:{ all -> 0x0118 }
        return r1;	 Catch:{ all -> 0x0118 }
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0118 }
        r0.<init>();	 Catch:{ all -> 0x0118 }
        monitor-exit(r2);	 Catch:{ all -> 0x0118 }
        return r0;	 Catch:{ all -> 0x0118 }
        r0 = move-exception;	 Catch:{ all -> 0x0118 }
        monitor-exit(r2);	 Catch:{ all -> 0x0118 }
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acrg.b(int):java.util.List");
    }

    public final void b(c cVar) {
        this.y.d(cVar);
    }

    public final synchronized long c() {
        return this.d;
    }

    /* JADX WARNING: Missing block: B:14:0x0024, code skipped:
            return;
     */
    public final synchronized void c(int r4) {
        /*
        r3 = this;
        monitor-enter(r3);
        r4 = r3.s;	 Catch:{ all -> 0x0025 }
        r0 = 1;
        if (r4 == 0) goto L_0x000c;
    L_0x0006:
        r4 = r3.t;	 Catch:{ all -> 0x0025 }
        if (r0 != r4) goto L_0x000c;
    L_0x000a:
        monitor-exit(r3);
        return;
    L_0x000c:
        r1 = 0;
        r3.d = r1;	 Catch:{ all -> 0x0025 }
        r3.d(r0);	 Catch:{ all -> 0x0025 }
        r4 = r3.s;	 Catch:{ all -> 0x0025 }
        if (r4 != 0) goto L_0x0023;
    L_0x0017:
        r3.s = r0;	 Catch:{ all -> 0x0025 }
        r4 = r3.v;	 Catch:{ all -> 0x0025 }
        r0 = r3.x;	 Catch:{ all -> 0x0025 }
        r4 = r4.a(r0);	 Catch:{ all -> 0x0025 }
        r3.u = r4;	 Catch:{ all -> 0x0025 }
    L_0x0023:
        monitor-exit(r3);
        return;
    L_0x0025:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acrg.c(int):void");
    }

    public final void d() {
        a(2, new 4());
    }

    public final alhq e() {
        alhq alhq;
        synchronized (this.a) {
            alhq = this.k;
        }
        return alhq;
    }

    public final List<alhq> f() {
        ArrayList arrayList;
        synchronized (this.a) {
            arrayList = new ArrayList(this.g.values());
        }
        return arrayList;
    }

    public final List<alhq> g() {
        ArrayList arrayList;
        synchronized (this.a) {
            arrayList = new ArrayList(this.g.values());
        }
        Collections.sort(arrayList, new 5());
        return arrayList;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:139:0x01c0 in {2, 9, 21, 25, 38, 39, 44, 45, 54, 55, 58, 59, 68, 69, 72, 73, 84, 85, 86, 87, 91, 92, 93, 98, 99, 103, 104, 105, 108, 112, 117, 118, 119, 121, 122, 123, 127, 132, 133, 135, 138} preds:[]
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
    public final defpackage.alhq h() {
        /*
        r20 = this;
        r1 = r20;
        r0 = r1.v;
        r0 = r0.a();
        r2 = android.text.TextUtils.isEmpty(r0);
        r3 = 0;
        if (r2 == 0) goto L_0x0010;
        return r3;
        r2 = r1.a;
        monitor-enter(r2);
        r4 = r1.k;	 Catch:{ all -> 0x01bd }
        r4 = defpackage.acrg.b(r4);	 Catch:{ all -> 0x01bd }
        r5 = r1.a(r4);	 Catch:{ all -> 0x01bd }
        if (r5 != 0) goto L_0x0021;	 Catch:{ all -> 0x01bd }
        monitor-exit(r2);	 Catch:{ all -> 0x01bd }
        return r3;	 Catch:{ all -> 0x01bd }
        r5 = r1.g;	 Catch:{ all -> 0x01bd }
        r5.put(r0, r4);	 Catch:{ all -> 0x01bd }
        r0 = r1.v;	 Catch:{ all -> 0x01bd }
        r0 = r0.a();	 Catch:{ all -> 0x01bd }
        r5 = android.text.TextUtils.isEmpty(r0);	 Catch:{ all -> 0x01bd }
        if (r5 != 0) goto L_0x01b9;	 Catch:{ all -> 0x01bd }
        r5 = r1.a;	 Catch:{ all -> 0x01bd }
        monitor-enter(r5);	 Catch:{ all -> 0x01bd }
        r6 = r1.g;	 Catch:{ all -> 0x01b6 }
        r0 = r6.get(r0);	 Catch:{ all -> 0x01b6 }
        r0 = (defpackage.alhq) r0;	 Catch:{ all -> 0x01b6 }
        r6 = r1.j;	 Catch:{ all -> 0x01b6 }
        monitor-exit(r5);	 Catch:{ all -> 0x01b6 }
        if (r0 == 0) goto L_0x01b9;
        if (r6 == 0) goto L_0x004e;
        r5 = defpackage.acrg.a(r0, r6);	 Catch:{ all -> 0x01bd }
        r5 = defpackage.acrg.a(r5);	 Catch:{ all -> 0x01bd }
        if (r5 != 0) goto L_0x01b9;	 Catch:{ all -> 0x01bd }
        r5 = r0.a;	 Catch:{ all -> 0x01bd }
        if (r5 != 0) goto L_0x005a;	 Catch:{ all -> 0x01bd }
        r5 = r1.v;	 Catch:{ all -> 0x01bd }
        r5 = r5.a();	 Catch:{ all -> 0x01bd }
        if (r5 == 0) goto L_0x01b9;	 Catch:{ all -> 0x01bd }
        r6 = 9218868437227405311; // 0x7fefffffffffffff float:NaN double:1.7976931348623157E308;	 Catch:{ all -> 0x01bd }
        r8 = r1.a;	 Catch:{ all -> 0x01bd }
        monitor-enter(r8);	 Catch:{ all -> 0x01bd }
        r9 = r1.j;	 Catch:{ all -> 0x01b3 }
        r11 = r6;	 Catch:{ all -> 0x01b3 }
        r7 = 0;	 Catch:{ all -> 0x01b3 }
        r6 = r3;	 Catch:{ all -> 0x01b3 }
        r3 = 0;	 Catch:{ all -> 0x01b3 }
        r13 = r1.h;	 Catch:{ all -> 0x01b3 }
        r13 = r13.size();	 Catch:{ all -> 0x01b3 }
        r14 = 1;	 Catch:{ all -> 0x01b3 }
        if (r3 >= r13) goto L_0x0127;	 Catch:{ all -> 0x01b3 }
        r13 = r1.h;	 Catch:{ all -> 0x01b3 }
        r13 = r13.get(r3);	 Catch:{ all -> 0x01b3 }
        r13 = (defpackage.alhm) r13;	 Catch:{ all -> 0x01b3 }
        if (r13 == 0) goto L_0x011f;	 Catch:{ all -> 0x01b3 }
        r15 = r13.e;	 Catch:{ all -> 0x01b3 }
        r15 = r15.length;	 Catch:{ all -> 0x01b3 }
        if (r15 == 0) goto L_0x011f;	 Catch:{ all -> 0x01b3 }
        r15 = r0.g;	 Catch:{ all -> 0x01b3 }
        if (r15 == 0) goto L_0x0087;	 Catch:{ all -> 0x01b3 }
        r15 = r15.e;	 Catch:{ all -> 0x01b3 }
        goto L_0x0088;	 Catch:{ all -> 0x01b3 }
        r15 = 0;	 Catch:{ all -> 0x01b3 }
        r10 = 2;	 Catch:{ all -> 0x01b3 }
        r16 = r4;	 Catch:{ all -> 0x01b3 }
        r4 = 3;	 Catch:{ all -> 0x01b3 }
        if (r15 == r14) goto L_0x0096;	 Catch:{ all -> 0x01b3 }
        if (r15 == r10) goto L_0x00c2;	 Catch:{ all -> 0x01b3 }
        if (r15 == r4) goto L_0x0093;	 Catch:{ all -> 0x01b3 }
        goto L_0x00ed;	 Catch:{ all -> 0x01b3 }
        r17 = 0;	 Catch:{ all -> 0x01b3 }
        goto L_0x0111;	 Catch:{ all -> 0x01b3 }
        r15 = r13.e;	 Catch:{ all -> 0x01b3 }
        r14 = r15.length;	 Catch:{ all -> 0x01b3 }
        r10 = 0;	 Catch:{ all -> 0x01b3 }
        if (r10 >= r14) goto L_0x00c2;	 Catch:{ all -> 0x01b3 }
        r4 = r15[r10];	 Catch:{ all -> 0x01b3 }
        r18 = r14;	 Catch:{ all -> 0x01b3 }
        r14 = r4.g;	 Catch:{ all -> 0x01b3 }
        if (r14 == 0) goto L_0x00b1;	 Catch:{ all -> 0x01b3 }
        r14 = r4.g;	 Catch:{ all -> 0x01b3 }
        r14 = r14.e;	 Catch:{ all -> 0x01b3 }
        r19 = r15;	 Catch:{ all -> 0x01b3 }
        r15 = 3;	 Catch:{ all -> 0x01b3 }
        if (r14 == r15) goto L_0x0093;	 Catch:{ all -> 0x01b3 }
        r15 = 2;	 Catch:{ all -> 0x01b3 }
        if (r14 != r15) goto L_0x00b3;	 Catch:{ all -> 0x01b3 }
        goto L_0x0093;	 Catch:{ all -> 0x01b3 }
        r19 = r15;	 Catch:{ all -> 0x01b3 }
        r4 = defpackage.acrg.a(r0, r4);	 Catch:{ all -> 0x01b3 }
        if (r4 != 0) goto L_0x00ba;	 Catch:{ all -> 0x01b3 }
        goto L_0x0093;	 Catch:{ all -> 0x01b3 }
        r10 = r10 + 1;	 Catch:{ all -> 0x01b3 }
        r14 = r18;	 Catch:{ all -> 0x01b3 }
        r15 = r19;	 Catch:{ all -> 0x01b3 }
        r4 = 3;	 Catch:{ all -> 0x01b3 }
        goto L_0x009a;	 Catch:{ all -> 0x01b3 }
        r4 = r13.e;	 Catch:{ all -> 0x01b3 }
        r10 = r4.length;	 Catch:{ all -> 0x01b3 }
        r14 = 0;	 Catch:{ all -> 0x01b3 }
        if (r14 >= r10) goto L_0x00ed;	 Catch:{ all -> 0x01b3 }
        r15 = r4[r14];	 Catch:{ all -> 0x01b3 }
        r18 = r4;	 Catch:{ all -> 0x01b3 }
        r4 = r15.g;	 Catch:{ all -> 0x01b3 }
        if (r4 == 0) goto L_0x00dd;	 Catch:{ all -> 0x01b3 }
        r4 = r15.g;	 Catch:{ all -> 0x01b3 }
        r4 = r4.e;	 Catch:{ all -> 0x01b3 }
        r19 = r10;	 Catch:{ all -> 0x01b3 }
        r10 = 3;	 Catch:{ all -> 0x01b3 }
        if (r4 == r10) goto L_0x0093;	 Catch:{ all -> 0x01b3 }
        r10 = 1;	 Catch:{ all -> 0x01b3 }
        if (r4 != r10) goto L_0x00df;	 Catch:{ all -> 0x01b3 }
        goto L_0x0093;	 Catch:{ all -> 0x01b3 }
        r19 = r10;	 Catch:{ all -> 0x01b3 }
        r4 = defpackage.acrg.a(r0, r15);	 Catch:{ all -> 0x01b3 }
        if (r4 == 0) goto L_0x00e6;	 Catch:{ all -> 0x01b3 }
        goto L_0x0093;	 Catch:{ all -> 0x01b3 }
        r14 = r14 + 1;	 Catch:{ all -> 0x01b3 }
        r4 = r18;	 Catch:{ all -> 0x01b3 }
        r10 = r19;	 Catch:{ all -> 0x01b3 }
        goto L_0x00c6;	 Catch:{ all -> 0x01b3 }
        r4 = r13.e;	 Catch:{ all -> 0x01b3 }
        r10 = r4.length;	 Catch:{ all -> 0x01b3 }
        r14 = 0;	 Catch:{ all -> 0x01b3 }
        if (r14 >= r10) goto L_0x010f;	 Catch:{ all -> 0x01b3 }
        r15 = r4[r14];	 Catch:{ all -> 0x01b3 }
        r18 = r4;	 Catch:{ all -> 0x01b3 }
        r4 = r15.g;	 Catch:{ all -> 0x01b3 }
        if (r4 == 0) goto L_0x0109;	 Catch:{ all -> 0x01b3 }
        r4 = r15.g;	 Catch:{ all -> 0x01b3 }
        r4 = r4.e;	 Catch:{ all -> 0x01b3 }
        r15 = 3;	 Catch:{ all -> 0x01b3 }
        if (r4 == r15) goto L_0x0093;	 Catch:{ all -> 0x01b3 }
        r15 = 1;	 Catch:{ all -> 0x01b3 }
        if (r4 == r15) goto L_0x0093;	 Catch:{ all -> 0x01b3 }
        r15 = 2;	 Catch:{ all -> 0x01b3 }
        if (r4 != r15) goto L_0x010a;	 Catch:{ all -> 0x01b3 }
        goto L_0x0093;	 Catch:{ all -> 0x01b3 }
        r15 = 2;	 Catch:{ all -> 0x01b3 }
        r14 = r14 + 1;	 Catch:{ all -> 0x01b3 }
        r4 = r18;	 Catch:{ all -> 0x01b3 }
        goto L_0x00f1;	 Catch:{ all -> 0x01b3 }
        r17 = 1;	 Catch:{ all -> 0x01b3 }
        if (r17 == 0) goto L_0x0121;	 Catch:{ all -> 0x01b3 }
        r14 = defpackage.acrg.a(r0, r13);	 Catch:{ all -> 0x01b3 }
        r4 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1));	 Catch:{ all -> 0x01b3 }
        if (r4 >= 0) goto L_0x0121;	 Catch:{ all -> 0x01b3 }
        r7 = r3;	 Catch:{ all -> 0x01b3 }
        r6 = r13;	 Catch:{ all -> 0x01b3 }
        r11 = r14;	 Catch:{ all -> 0x01b3 }
        goto L_0x0121;	 Catch:{ all -> 0x01b3 }
        r16 = r4;	 Catch:{ all -> 0x01b3 }
        r3 = r3 + 1;	 Catch:{ all -> 0x01b3 }
        r4 = r16;	 Catch:{ all -> 0x01b3 }
        goto L_0x0068;	 Catch:{ all -> 0x01b3 }
        r16 = r4;	 Catch:{ all -> 0x01b3 }
        if (r6 == 0) goto L_0x0134;	 Catch:{ all -> 0x01b3 }
        r3 = defpackage.acrg.a(r11);	 Catch:{ all -> 0x01b3 }
        if (r3 != 0) goto L_0x0132;	 Catch:{ all -> 0x01b3 }
        goto L_0x0134;	 Catch:{ all -> 0x01b3 }
        r10 = 0;	 Catch:{ all -> 0x01b3 }
        goto L_0x015d;	 Catch:{ all -> 0x01b3 }
        if (r9 == 0) goto L_0x0144;	 Catch:{ all -> 0x01b3 }
        r3 = r9.e;	 Catch:{ all -> 0x01b3 }
        r3 = r3.length;	 Catch:{ all -> 0x01b3 }
        r4 = 1;	 Catch:{ all -> 0x01b3 }
        if (r3 != r4) goto L_0x0144;	 Catch:{ all -> 0x01b3 }
        r3 = r9.e;	 Catch:{ all -> 0x01b3 }
        r4 = 0;	 Catch:{ all -> 0x01b3 }
        r3[r4] = r0;	 Catch:{ all -> 0x01b3 }
        r6 = r9;	 Catch:{ all -> 0x01b3 }
        r10 = 0;	 Catch:{ all -> 0x01b3 }
        goto L_0x0153;	 Catch:{ all -> 0x01b3 }
        r3 = new alhm;	 Catch:{ all -> 0x01b3 }
        r3.<init>();	 Catch:{ all -> 0x01b3 }
        r4 = 1;	 Catch:{ all -> 0x01b3 }
        r6 = new defpackage.alhq[r4];	 Catch:{ all -> 0x01b3 }
        r4 = 0;	 Catch:{ all -> 0x01b3 }
        r6[r4] = r0;	 Catch:{ all -> 0x01b3 }
        r3.e = r6;	 Catch:{ all -> 0x01b3 }
        r6 = r3;	 Catch:{ all -> 0x01b3 }
        r10 = 1;	 Catch:{ all -> 0x01b3 }
        r3 = r0.b;	 Catch:{ all -> 0x01b3 }
        r6.a(r3);	 Catch:{ all -> 0x01b3 }
        r3 = r0.c;	 Catch:{ all -> 0x01b3 }
        r6.b(r3);	 Catch:{ all -> 0x01b3 }
        if (r9 != r6) goto L_0x0161;	 Catch:{ all -> 0x01b3 }
        monitor-exit(r8);	 Catch:{ all -> 0x01b3 }
        goto L_0x01bb;	 Catch:{ all -> 0x01b3 }
        if (r9 == 0) goto L_0x018f;	 Catch:{ all -> 0x01b3 }
        r3 = r9.e;	 Catch:{ all -> 0x01b3 }
        r3 = r3.length;	 Catch:{ all -> 0x01b3 }
        r4 = 1;	 Catch:{ all -> 0x01b3 }
        if (r3 != r4) goto L_0x016f;	 Catch:{ all -> 0x01b3 }
        r3 = r1.h;	 Catch:{ all -> 0x01b3 }
        r3.remove(r9);	 Catch:{ all -> 0x01b3 }
        goto L_0x018f;	 Catch:{ all -> 0x01b3 }
        r3 = r9.e;	 Catch:{ all -> 0x01b3 }
        r4 = r3.length;	 Catch:{ all -> 0x01b3 }
        r11 = 1;	 Catch:{ all -> 0x01b3 }
        r4 = r4 - r11;	 Catch:{ all -> 0x01b3 }
        r4 = new defpackage.alhq[r4];	 Catch:{ all -> 0x01b3 }
        r11 = r3.length;	 Catch:{ all -> 0x01b3 }
        r12 = 0;	 Catch:{ all -> 0x01b3 }
        r13 = 0;	 Catch:{ all -> 0x01b3 }
        if (r12 >= r11) goto L_0x018d;	 Catch:{ all -> 0x01b3 }
        r14 = r3[r12];	 Catch:{ all -> 0x01b3 }
        r15 = r14.a;	 Catch:{ all -> 0x01b3 }
        r15 = android.text.TextUtils.equals(r15, r5);	 Catch:{ all -> 0x01b3 }
        if (r15 != 0) goto L_0x018a;	 Catch:{ all -> 0x01b3 }
        r15 = r13 + 1;	 Catch:{ all -> 0x01b3 }
        r4[r13] = r14;	 Catch:{ all -> 0x01b3 }
        r13 = r15;	 Catch:{ all -> 0x01b3 }
        r12 = r12 + 1;	 Catch:{ all -> 0x01b3 }
        goto L_0x0179;	 Catch:{ all -> 0x01b3 }
        r9.e = r4;	 Catch:{ all -> 0x01b3 }
        if (r10 == 0) goto L_0x0197;	 Catch:{ all -> 0x01b3 }
        r0 = r1.h;	 Catch:{ all -> 0x01b3 }
        r0.add(r7, r6);	 Catch:{ all -> 0x01b3 }
        goto L_0x01ab;	 Catch:{ all -> 0x01b3 }
        r3 = r6.e;	 Catch:{ all -> 0x01b3 }
        r3 = r3.length;	 Catch:{ all -> 0x01b3 }
        r4 = 1;	 Catch:{ all -> 0x01b3 }
        r3 = r3 + r4;	 Catch:{ all -> 0x01b3 }
        r3 = new defpackage.alhq[r3];	 Catch:{ all -> 0x01b3 }
        r7 = 0;	 Catch:{ all -> 0x01b3 }
        r3[r7] = r0;	 Catch:{ all -> 0x01b3 }
        r0 = r6.e;	 Catch:{ all -> 0x01b3 }
        r9 = r6.e;	 Catch:{ all -> 0x01b3 }
        r9 = r9.length;	 Catch:{ all -> 0x01b3 }
        java.lang.System.arraycopy(r0, r7, r3, r4, r9);	 Catch:{ all -> 0x01b3 }
        r6.e = r3;	 Catch:{ all -> 0x01b3 }
        r0 = r1.i;	 Catch:{ all -> 0x01b3 }
        r0.put(r5, r6);	 Catch:{ all -> 0x01b3 }
        r1.j = r6;	 Catch:{ all -> 0x01b3 }
        goto L_0x015f;	 Catch:{ all -> 0x01b3 }
        r0 = move-exception;	 Catch:{ all -> 0x01b3 }
        monitor-exit(r8);	 Catch:{ all -> 0x01b3 }
        throw r0;	 Catch:{ all -> 0x01bd }
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x01b6 }
        throw r0;	 Catch:{ all -> 0x01bd }
        r16 = r4;	 Catch:{ all -> 0x01bd }
        monitor-exit(r2);	 Catch:{ all -> 0x01bd }
        return r16;	 Catch:{ all -> 0x01bd }
        r0 = move-exception;	 Catch:{ all -> 0x01bd }
        monitor-exit(r2);	 Catch:{ all -> 0x01bd }
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acrg.h():alhq");
    }

    public final List<alhm> i() {
        ArrayList arrayList;
        synchronized (this.a) {
            arrayList = new ArrayList(this.h);
        }
        return arrayList;
    }

    public final synchronized void j() {
        if (this.u != null) {
            this.u.a();
            this.u = null;
        }
        this.b.a();
        this.s = false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x0033 in {8, 10, 13} preds:[]
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
    public final java.util.List<java.lang.String> k() {
        /*
        r5 = this;
        r0 = r5.a;
        monitor-enter(r0);
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x0030 }
        r1.<init>();	 Catch:{ all -> 0x0030 }
        r2 = r5.g;	 Catch:{ all -> 0x0030 }
        r2 = r2.keySet();	 Catch:{ all -> 0x0030 }
        r2 = r2.iterator();	 Catch:{ all -> 0x0030 }
        r3 = r2.hasNext();	 Catch:{ all -> 0x0030 }
        if (r3 == 0) goto L_0x002e;	 Catch:{ all -> 0x0030 }
        r3 = r2.next();	 Catch:{ all -> 0x0030 }
        r3 = (java.lang.String) r3;	 Catch:{ all -> 0x0030 }
        r4 = r5.v;	 Catch:{ all -> 0x0030 }
        r4 = r4.a();	 Catch:{ all -> 0x0030 }
        r4 = java.util.Objects.equals(r3, r4);	 Catch:{ all -> 0x0030 }
        if (r4 != 0) goto L_0x0012;	 Catch:{ all -> 0x0030 }
        r1.add(r3);	 Catch:{ all -> 0x0030 }
        goto L_0x0012;	 Catch:{ all -> 0x0030 }
        monitor-exit(r0);	 Catch:{ all -> 0x0030 }
        return r1;	 Catch:{ all -> 0x0030 }
        r1 = move-exception;	 Catch:{ all -> 0x0030 }
        monitor-exit(r0);	 Catch:{ all -> 0x0030 }
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acrg.k():java.util.List");
    }

    public final ajdp<Map<String, alhq>> l() {
        return new acrk(this, this.p);
    }

    public final ajdp<Map<String, alhq>> m() {
        return new acrc(this, 0).i();
    }

    public final ajdp<Map<String, alhq>> n() {
        return new acrc(this, TelemetryConstants.FLUSH_DELAY_MS).i();
    }

    public final acri o() {
        return this.b;
    }
}
