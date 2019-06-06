package defpackage;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;
import defpackage.ncn.a;
import defpackage.ncn.b;
import defpackage.ncn.c;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: nge */
public final class nge implements ncn {
    private static final Map<nch, aapt> f = ImmutableMap.of(nch.FRIENDS, aapt.ALL_FRIENDS, nch.CUSTOM, aapt.CUSTOM_FRIENDS, nch.BLACKLIST, aapt.BLACKLIST_MODE);
    private static final ImmutableBiMap<Integer, nch> g = ImmutableBiMap.of(Integer.valueOf(1), nch.FRIENDS, Integer.valueOf(3), nch.CUSTOM, Integer.valueOf(4), nch.BLACKLIST);
    private static final nch h = nch.CUSTOM;
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private aapt F;
    private nch G;
    private boolean H;
    private boolean I;
    private ngf J;
    private long K;
    private b L;
    private Handler M;
    final CopyOnWriteArrayList<a> a = new CopyOnWriteArrayList();
    final WeakReference<Resources> b;
    final nft c;
    volatile nbr d;
    final abpt<c> e = new abpt();
    private final nce i;
    private final a j;
    private final nga k;
    private final Set<String> l;
    private final ajwo<Set<String>> m;
    private final ihh n;
    private final UUID o;
    private final dis p;
    private final ngh q;
    private final ngk r;
    private ngj s;
    private final Set<String> t;
    private final ajwo<Set<String>> u;
    private final ajei v;
    private final ajwl<Boolean> w;
    private final ajwo<alkf> x;
    private final ajwo<nga.c> y;
    private boolean z;

    /* renamed from: nge$a */
    static class a implements defpackage.nbr.a {
        private final WeakReference<nge> a;

        private a(nge nge) {
            this.a = new WeakReference(nge);
        }

        /* synthetic */ a(nge nge, byte b) {
            this(nge);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:23:0x005e in {2, 8, 14, 17, 18, 22} preds:[]
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
        public final void a(java.lang.String r5) {
            /*
            r4 = this;
            r0 = r4.a;
            r0 = r0.get();
            r0 = (defpackage.nge) r0;
            if (r0 != 0) goto L_0x000b;
            return;
            monitor-enter(r0);
            r1 = r0.d;	 Catch:{ all -> 0x005b }
            r1 = r1.e();	 Catch:{ all -> 0x005b }
            r1 = r5.equals(r1);	 Catch:{ all -> 0x005b }
            if (r1 != 0) goto L_0x001a;	 Catch:{ all -> 0x005b }
            monitor-exit(r0);	 Catch:{ all -> 0x005b }
            return;	 Catch:{ all -> 0x005b }
            r1 = new nca;	 Catch:{ all -> 0x005b }
            r2 = 0;	 Catch:{ all -> 0x005b }
            r3 = defpackage.aapu.GHOST_MODE_TIMER_EXPIRED;	 Catch:{ all -> 0x005b }
            r1.<init>(r2, r3);	 Catch:{ all -> 0x005b }
            r2 = 0;	 Catch:{ all -> 0x005b }
            r0.a(r1, r2);	 Catch:{ all -> 0x005b }
            monitor-exit(r0);	 Catch:{ all -> 0x005b }
            r1 = r0.a;
            r1 = r1.iterator();
            r2 = r1.hasNext();
            if (r2 == 0) goto L_0x003d;
            r2 = r1.next();
            r2 = (defpackage.ncn.a) r2;
            r2.a();
            goto L_0x002d;
            r1 = r0.b;
            r1 = r1.get();
            r1 = (android.content.res.Resources) r1;
            if (r1 == 0) goto L_0x005a;
            r2 = 2131888668; // 0x7f120a1c float:1.9411978E38 double:1.0532929516E-314;
            r2 = r1.getString(r2);
            r3 = 2131888667; // 0x7f120a1b float:1.9411976E38 double:1.053292951E-314;
            r1 = r1.getString(r3);
            r0 = r0.c;
            r0.a(r5, r2, r1);
            return;
            r5 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x005b }
            throw r5;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.nge$a.a(java.lang.String):void");
        }
    }

    /* renamed from: nge$1 */
    class 1 implements ajej {
        1() {
        }

        public final void dispose() {
            nge.this.x();
        }

        public final boolean isDisposed() {
            return false;
        }
    }

    /* renamed from: nge$b */
    static class b implements defpackage.ngf.b {
        private final WeakReference<nge> a;

        public b(nge nge) {
            this.a = new WeakReference(nge);
        }

        public final void a(ngf ngf, long j, int i) {
            nge nge = (nge) this.a.get();
            if (nge != null) {
                nge.a(ngf, j, i);
            }
        }

        public final void a(ngf ngf, long j, boolean z, alkf alkf, long j2) {
            nge nge = (nge) this.a.get();
            if (nge != null) {
                nge.a(ngf, j, z, alkf, j2);
            }
        }

        public final void a(ngf ngf, ncp ncp) {
            nge nge = (nge) this.a.get();
            if (nge != null) {
                nge.a(ngf, ncp);
            }
        }
    }

    /* renamed from: nge$3 */
    class 3 implements Runnable {
        3() {
        }

        public final void run() {
            Iterator it = nge.this.e.iterator();
            while (it.hasNext()) {
                ((c) it.next()).b();
            }
        }
    }

    /* renamed from: nge$4 */
    class 4 implements Runnable {
        4() {
        }

        public final void run() {
            Iterator it = nge.this.e.iterator();
            while (it.hasNext()) {
                ((c) it.next()).a();
            }
        }
    }

    /* renamed from: nge$5 */
    static /* synthetic */ class 5 {
        static final /* synthetic */ int[] a = new int[nch.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        static {
            /*
            r0 = defpackage.nch.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = defpackage.nch.FRIENDS;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = defpackage.nch.CUSTOM;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = defpackage.nch.BLACKLIST;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = defpackage.nch.NONE;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.nge$5.<clinit>():void");
        }
    }

    public nge(ajei ajei, ngh ngh, ngk ngk, nga nga, nce nce, ngj ngj, UUID uuid, nft nft, Resources resources, nbr nbr, ngc ngc, ihh ihh, dis dis) {
        this.v = ajei;
        this.i = nce;
        this.o = uuid;
        this.s = ngj;
        this.q = ngh;
        this.r = ngk;
        this.k = nga;
        this.c = nft;
        this.c.a();
        this.b = new WeakReference(resources);
        boolean z = false;
        this.j = new a(this, (byte) 0);
        this.n = ihh;
        Object ajwo = new ajwo();
        String str = "PublishSubject.create()";
        akcr.a(ajwo, str);
        this.m = ajwo;
        ajwo = new ajwo();
        akcr.a(ajwo, str);
        this.u = ajwo;
        ajwo = new ajwo();
        akcr.a(ajwo, str);
        this.x = ajwo;
        ajwo = new ajwo();
        akcr.a(ajwo, str);
        this.y = ajwo;
        this.v.a(this.i.J().a(new -$$Lambda$nge$pRXaxkxv2Q0bFVLrrOZHIlJ4F2c(this), -$$Lambda$nge$NKX48ugSjPXIwLYAXjkzbACJnjQ.INSTANCE));
        this.z = this.i.a();
        this.A = this.i.b();
        this.B = this.i.c();
        this.G = this.i.d();
        ajwo = ajwl.i(Boolean.valueOf(this.A));
        akcr.a(ajwo, "BehaviorSubject.createDefault(default)");
        this.w = ajwo;
        this.l = this.i.e();
        this.t = this.i.f();
        this.D = this.i.k();
        this.v.a(this.i.N().a(new -$$Lambda$nge$ptsTcrmqCEwuf6HDS9Ai02nGXPs(this), -$$Lambda$nge$9J5VPZgsplks4fT9Oz9gXecL0Ow.INSTANCE));
        this.C = this.i.l();
        boolean z2 = this.A && this.B;
        this.H = z2;
        this.d = nbr;
        this.d.a(this.j);
        this.J = new ngf(this.i, this.k, new b(this), ajei);
        this.K = 0;
        if (n() && this.i.j()) {
            z = true;
        }
        this.E = z;
        this.L = ngc;
        this.p = dis;
        ajei.a(new 1());
    }

    private void A() {
        w().post(new 4());
    }

    private synchronized ncp B() {
        alkf alkf = new alkf();
        alkf.b = this.A;
        alkf.a |= 1;
        alkf.g = this.E;
        alkf.a |= 8;
        if (this.G == null) {
            return null;
        }
        Integer num = (Integer) g.inverse().get(this.G);
        if (num != null) {
            alkf.d = num.intValue();
            alkf.a |= 4;
        }
        alkf.c = 2;
        alkf.a = 2 | alkf.a;
        alkf.e = b(this.l);
        alkf.f = b(this.t);
        return new ncp(alkf, this.d);
    }

    private synchronized long C() {
        return this.K;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x0017 in {4, 6, 10, 11, 14} preds:[]
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
    private synchronized int D() {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.y();	 Catch:{ all -> 0x0014 }
        if (r0 == 0) goto L_0x000a;
        r0 = 0;
        monitor-exit(r1);
        return r0;
        r0 = r1.e();	 Catch:{ all -> 0x0014 }
        if (r0 == 0) goto L_0x0012;
        r0 = 1;
        goto L_0x0008;
        r0 = 2;
        goto L_0x0008;
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nge.D():int");
    }

    private void E() {
        if (!b()) {
            a(true);
        }
        if (e()) {
            a(false, 0);
        }
    }

    private aapt F() {
        return this.A ? aapt.GHOST_MODE : (aapt) f.get(this.G);
    }

    private /* synthetic */ nch G() {
        if (e()) {
            return nch.NONE;
        }
        nch m = m();
        if (m == null) {
            m = nch.NONE;
        }
        return m;
    }

    private synchronized void a(abbd abbd, nch nch, Set<String> set) {
        a(nch, (Set) set, new nca(abbd, aapu.USER_UPDATE));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:31:0x00dc in {7, 8, 11, 14, 19, 24, 27, 30} preds:[]
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
    private synchronized void a(defpackage.alkf r7, long r8) {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = 1;
        r6.z = r0;	 Catch:{ all -> 0x00d9 }
        r1 = r6.F();	 Catch:{ all -> 0x00d9 }
        r6.F = r1;	 Catch:{ all -> 0x00d9 }
        r1 = r7.b;	 Catch:{ all -> 0x00d9 }
        r6.A = r1;	 Catch:{ all -> 0x00d9 }
        r1 = r6.i;	 Catch:{ all -> 0x00d9 }
        r2 = r6.A;	 Catch:{ all -> 0x00d9 }
        r1.a(r2);	 Catch:{ all -> 0x00d9 }
        r1 = r6.w;	 Catch:{ all -> 0x00d9 }
        r2 = r6.A;	 Catch:{ all -> 0x00d9 }
        r2 = java.lang.Boolean.valueOf(r2);	 Catch:{ all -> 0x00d9 }
        r1.a(r2);	 Catch:{ all -> 0x00d9 }
        r1 = r7.g;	 Catch:{ all -> 0x00d9 }
        r6.E = r1;	 Catch:{ all -> 0x00d9 }
        r1 = r6.i;	 Catch:{ all -> 0x00d9 }
        r2 = r6.E;	 Catch:{ all -> 0x00d9 }
        r1.e(r2);	 Catch:{ all -> 0x00d9 }
        r1 = r6.A;	 Catch:{ all -> 0x00d9 }
        r2 = 0;	 Catch:{ all -> 0x00d9 }
        if (r1 == 0) goto L_0x0037;	 Catch:{ all -> 0x00d9 }
        r3 = 0;	 Catch:{ all -> 0x00d9 }
        r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1));	 Catch:{ all -> 0x00d9 }
        if (r1 == 0) goto L_0x0037;	 Catch:{ all -> 0x00d9 }
        goto L_0x0038;	 Catch:{ all -> 0x00d9 }
        r0 = 0;	 Catch:{ all -> 0x00d9 }
        r6.B = r0;	 Catch:{ all -> 0x00d9 }
        r0 = r6.i;	 Catch:{ all -> 0x00d9 }
        r1 = r6.B;	 Catch:{ all -> 0x00d9 }
        r0.c(r1);	 Catch:{ all -> 0x00d9 }
        r0 = new nfu;	 Catch:{ all -> 0x00d9 }
        r1 = r6.i;	 Catch:{ all -> 0x00d9 }
        r3 = r6.o;	 Catch:{ all -> 0x00d9 }
        r4 = r6.j;	 Catch:{ all -> 0x00d9 }
        r0.<init>(r1, r3, r4);	 Catch:{ all -> 0x00d9 }
        r6.d = r0;	 Catch:{ all -> 0x00d9 }
        r6.H = r2;	 Catch:{ all -> 0x00d9 }
        r0 = r6.B;	 Catch:{ all -> 0x00d9 }
        if (r0 == 0) goto L_0x005b;	 Catch:{ all -> 0x00d9 }
        r0 = r6.d;	 Catch:{ all -> 0x00d9 }
        r1 = r6.I;	 Catch:{ all -> 0x00d9 }
        r0.a(r8, r1);	 Catch:{ all -> 0x00d9 }
        r0 = r7.d;	 Catch:{ all -> 0x00d9 }
        r1 = g;	 Catch:{ all -> 0x00d9 }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ all -> 0x00d9 }
        r0 = r1.get(r0);	 Catch:{ all -> 0x00d9 }
        r0 = (defpackage.nch) r0;	 Catch:{ all -> 0x00d9 }
        r6.G = r0;	 Catch:{ all -> 0x00d9 }
        r0 = r6.G;	 Catch:{ all -> 0x00d9 }
        if (r0 == 0) goto L_0x0076;	 Catch:{ all -> 0x00d9 }
        r0 = r6.i;	 Catch:{ all -> 0x00d9 }
        r1 = r6.G;	 Catch:{ all -> 0x00d9 }
        r0.a(r1);	 Catch:{ all -> 0x00d9 }
        r0 = r7.e;	 Catch:{ all -> 0x00d9 }
        if (r0 == 0) goto L_0x008c;	 Catch:{ all -> 0x00d9 }
        r0 = r7.e;	 Catch:{ all -> 0x00d9 }
        r1 = r0.length;	 Catch:{ all -> 0x00d9 }
        r3 = 0;	 Catch:{ all -> 0x00d9 }
        if (r3 >= r1) goto L_0x008c;	 Catch:{ all -> 0x00d9 }
        r4 = r0[r3];	 Catch:{ all -> 0x00d9 }
        r4 = r4.b;	 Catch:{ all -> 0x00d9 }
        r5 = r6.l;	 Catch:{ all -> 0x00d9 }
        r5.add(r4);	 Catch:{ all -> 0x00d9 }
        r3 = r3 + 1;	 Catch:{ all -> 0x00d9 }
        goto L_0x007e;	 Catch:{ all -> 0x00d9 }
        r0 = r6.m;	 Catch:{ all -> 0x00d9 }
        r1 = r6.l;	 Catch:{ all -> 0x00d9 }
        r0.a(r1);	 Catch:{ all -> 0x00d9 }
        r0 = r6.i;	 Catch:{ all -> 0x00d9 }
        r1 = r6.l;	 Catch:{ all -> 0x00d9 }
        r0.a(r1);	 Catch:{ all -> 0x00d9 }
        r0 = r7.f;	 Catch:{ all -> 0x00d9 }
        if (r0 == 0) goto L_0x00af;	 Catch:{ all -> 0x00d9 }
        r7 = r7.f;	 Catch:{ all -> 0x00d9 }
        r0 = r7.length;	 Catch:{ all -> 0x00d9 }
        if (r2 >= r0) goto L_0x00af;	 Catch:{ all -> 0x00d9 }
        r1 = r7[r2];	 Catch:{ all -> 0x00d9 }
        r1 = r1.b;	 Catch:{ all -> 0x00d9 }
        r3 = r6.t;	 Catch:{ all -> 0x00d9 }
        r3.add(r1);	 Catch:{ all -> 0x00d9 }
        r2 = r2 + 1;	 Catch:{ all -> 0x00d9 }
        goto L_0x00a1;	 Catch:{ all -> 0x00d9 }
        r7 = r6.u;	 Catch:{ all -> 0x00d9 }
        r0 = r6.t;	 Catch:{ all -> 0x00d9 }
        r7.a(r0);	 Catch:{ all -> 0x00d9 }
        r7 = r6.i;	 Catch:{ all -> 0x00d9 }
        r0 = r6.t;	 Catch:{ all -> 0x00d9 }
        r7.b(r0);	 Catch:{ all -> 0x00d9 }
        r7 = r6.i;	 Catch:{ all -> 0x00d9 }
        r7.H();	 Catch:{ all -> 0x00d9 }
        r7 = r6.i;	 Catch:{ all -> 0x00d9 }
        r7.M();	 Catch:{ all -> 0x00d9 }
        r7 = r6.L;	 Catch:{ all -> 0x00d9 }
        r0 = new nca;	 Catch:{ all -> 0x00d9 }
        r1 = 0;	 Catch:{ all -> 0x00d9 }
        r2 = defpackage.aapu.PERIODIC_SYNC;	 Catch:{ all -> 0x00d9 }
        r0.<init>(r1, r2);	 Catch:{ all -> 0x00d9 }
        r7.a(r6, r0, r8);	 Catch:{ all -> 0x00d9 }
        r6.A();	 Catch:{ all -> 0x00d9 }
        monitor-exit(r6);
        return;
        r7 = move-exception;
        monitor-exit(r6);
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nge.a(alkf, long):void");
    }

    private synchronized void a(nca nca) {
        this.K = this.n.c();
        this.J.a((ncn) this, B(), this.L, nca);
        A();
    }

    private synchronized void a(nca nca, nch nch) {
        aapt F = F();
        Object obj = nch != this.G ? 1 : null;
        this.G = nch;
        this.i.a(this.G);
        this.i.H();
        boolean a = a(false, 0);
        if (obj != null || a) {
            this.F = F;
            z();
            a(nca);
        }
    }

    /* JADX WARNING: Missing block: B:13:0x001e, code skipped:
            return;
     */
    private synchronized void a(defpackage.nch r2, java.util.Set<java.lang.String> r3, defpackage.nca r4) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = 0;
        r3.remove(r0);	 Catch:{ all -> 0x001f }
        r0 = "";
        r3.remove(r0);	 Catch:{ all -> 0x001f }
        r1.a(r4, r2);	 Catch:{ all -> 0x001f }
        r0 = defpackage.nch.CUSTOM;	 Catch:{ all -> 0x001f }
        if (r2 != r0) goto L_0x0016;
    L_0x0011:
        r1.a(r3, r4);	 Catch:{ all -> 0x001f }
        monitor-exit(r1);
        return;
    L_0x0016:
        r0 = defpackage.nch.BLACKLIST;	 Catch:{ all -> 0x001f }
        if (r2 != r0) goto L_0x001d;
    L_0x001a:
        r1.b(r3, r4);	 Catch:{ all -> 0x001f }
    L_0x001d:
        monitor-exit(r1);
        return;
    L_0x001f:
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nge.a(nch, java.util.Set, nca):void");
    }

    private synchronized boolean a(Set<String> set) {
        return (this.t.equals(set) && this.G == nch.BLACKLIST && !a(false, 0)) ? false : true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0035  */
    private synchronized boolean a(boolean r10, long r11) {
        /*
        r9 = this;
        monitor-enter(r9);
        r0 = r9.A;	 Catch:{ all -> 0x0067 }
        r1 = 0;
        r2 = 1;
        r3 = 0;
        if (r0 != r10) goto L_0x0018;
    L_0x0009:
        r0 = r9.B;	 Catch:{ all -> 0x0067 }
        if (r0 == 0) goto L_0x0011;
    L_0x000d:
        r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1));
        if (r0 == 0) goto L_0x0018;
    L_0x0011:
        r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1));
        if (r0 <= 0) goto L_0x0016;
    L_0x0015:
        goto L_0x0018;
    L_0x0016:
        r0 = 0;
        goto L_0x0019;
    L_0x0018:
        r0 = 1;
    L_0x0019:
        r5 = r9.w;	 Catch:{ all -> 0x0067 }
        r6 = java.lang.Boolean.valueOf(r10);	 Catch:{ all -> 0x0067 }
        r5.a(r6);	 Catch:{ all -> 0x0067 }
        r5 = r9.F();	 Catch:{ all -> 0x0067 }
        r9.F = r5;	 Catch:{ all -> 0x0067 }
        r9.A = r10;	 Catch:{ all -> 0x0067 }
        if (r10 == 0) goto L_0x0031;
    L_0x002c:
        r5 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1));
        if (r5 <= 0) goto L_0x0031;
    L_0x0030:
        r1 = 1;
    L_0x0031:
        r9.B = r1;	 Catch:{ all -> 0x0067 }
        if (r0 == 0) goto L_0x0054;
    L_0x0035:
        if (r10 == 0) goto L_0x0047;
    L_0x0037:
        r1 = new nfu;	 Catch:{ all -> 0x0067 }
        r3 = r9.i;	 Catch:{ all -> 0x0067 }
        r4 = r9.o;	 Catch:{ all -> 0x0067 }
        r7 = r9.j;	 Catch:{ all -> 0x0067 }
        r8 = r9.I;	 Catch:{ all -> 0x0067 }
        r2 = r1;
        r5 = r11;
        r2.<init>(r3, r4, r5, r7, r8);	 Catch:{ all -> 0x0067 }
        goto L_0x0052;
    L_0x0047:
        r1 = new nfu;	 Catch:{ all -> 0x0067 }
        r11 = r9.i;	 Catch:{ all -> 0x0067 }
        r12 = r9.o;	 Catch:{ all -> 0x0067 }
        r2 = r9.j;	 Catch:{ all -> 0x0067 }
        r1.<init>(r11, r12, r2);	 Catch:{ all -> 0x0067 }
    L_0x0052:
        r9.d = r1;	 Catch:{ all -> 0x0067 }
    L_0x0054:
        r11 = r9.i;	 Catch:{ all -> 0x0067 }
        r11.a(r10);	 Catch:{ all -> 0x0067 }
        r10 = r9.i;	 Catch:{ all -> 0x0067 }
        r11 = r9.B;	 Catch:{ all -> 0x0067 }
        r10.c(r11);	 Catch:{ all -> 0x0067 }
        r10 = r9.i;	 Catch:{ all -> 0x0067 }
        r10.H();	 Catch:{ all -> 0x0067 }
        monitor-exit(r9);
        return r0;
    L_0x0067:
        r10 = move-exception;
        monitor-exit(r9);
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nge.a(boolean, long):boolean");
    }

    private synchronized void b(nca nca, boolean z) {
        if (b(z)) {
            a(nca);
        }
    }

    private synchronized boolean b(boolean z) {
        boolean z2;
        z2 = this.E != z;
        this.E = z;
        this.i.e(this.E);
        this.i.H();
        return z2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x0043 in {8, 10, 12, 15} preds:[]
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
    private synchronized defpackage.alju[] b(java.util.Set<java.lang.String> r6) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = 0;
        r1 = r6.size();	 Catch:{ all -> 0x0040 }
        r1 = new defpackage.alju[r1];	 Catch:{ all -> 0x0040 }
        r6 = r6.iterator();	 Catch:{ all -> 0x0040 }
        r2 = r6.hasNext();	 Catch:{ all -> 0x0040 }
        if (r2 == 0) goto L_0x003e;	 Catch:{ all -> 0x0040 }
        r2 = r6.next();	 Catch:{ all -> 0x0040 }
        r2 = (java.lang.String) r2;	 Catch:{ all -> 0x0040 }
        r3 = new alju;	 Catch:{ all -> 0x0040 }
        r3.<init>();	 Catch:{ all -> 0x0040 }
        r1[r0] = r3;	 Catch:{ all -> 0x0040 }
        r3 = r1[r0];	 Catch:{ all -> 0x0040 }
        if (r2 == 0) goto L_0x0038;	 Catch:{ all -> 0x0040 }
        r3.b = r2;	 Catch:{ all -> 0x0040 }
        r2 = r3.a;	 Catch:{ all -> 0x0040 }
        r2 = r2 | 1;	 Catch:{ all -> 0x0040 }
        r3.a = r2;	 Catch:{ all -> 0x0040 }
        r2 = r1[r0];	 Catch:{ all -> 0x0040 }
        r3 = 2;	 Catch:{ all -> 0x0040 }
        r2.c = r3;	 Catch:{ all -> 0x0040 }
        r4 = r2.a;	 Catch:{ all -> 0x0040 }
        r3 = r3 | r4;	 Catch:{ all -> 0x0040 }
        r2.a = r3;	 Catch:{ all -> 0x0040 }
        r0 = r0 + 1;	 Catch:{ all -> 0x0040 }
        goto L_0x000c;	 Catch:{ all -> 0x0040 }
        r6 = new java.lang.NullPointerException;	 Catch:{ all -> 0x0040 }
        r6.<init>();	 Catch:{ all -> 0x0040 }
        throw r6;	 Catch:{ all -> 0x0040 }
        monitor-exit(r5);
        return r1;
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nge.b(java.util.Set):alju[]");
    }

    private synchronized boolean y() {
        return this.H;
    }

    private synchronized void z() {
        this.C = false;
        this.i.f(false);
        this.i.H();
    }

    public final ajdp<Set<String>> a(ajdw ajdw) {
        return this.m.a(ajdw);
    }

    public final ajdp<Boolean> a(ajdw ajdw, String str) {
        return ajdp.b(new -$$Lambda$nge$jBF6M_RTKFuRve9lk-RFqoeRd2c(this)).k(new -$$Lambda$nge$mBLXBWyoPPFMaeBE0V5hf8r6s1A(this, str, ajdw));
    }

    public final synchronized alht a(ncs ncs) {
        alht alht;
        alht = new alht();
        alht.c = D();
        alht.a |= 2;
        alht.b = ncs.a();
        alht.a |= 1;
        String b = ncs.b();
        if (b != null) {
            if (b != null) {
                alht.d = b;
                alht.a |= 8;
            } else {
                throw new NullPointerException();
            }
        }
        return alht;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f A:{RETURN} */
    public final java.util.List<java.lang.String> a(defpackage.nch r3) {
        /*
        r2 = this;
        r0 = defpackage.nge.5.a;
        r3 = r3.ordinal();
        r3 = r0[r3];
        r0 = 1;
        r1 = 0;
        if (r3 == r0) goto L_0x0012;
    L_0x000c:
        r0 = 2;
        if (r3 == r0) goto L_0x0019;
    L_0x000f:
        r0 = 3;
        if (r3 == r0) goto L_0x0014;
    L_0x0012:
        r3 = r1;
        goto L_0x001d;
    L_0x0014:
        r3 = r2.g();
        goto L_0x001d;
    L_0x0019:
        r3 = r2.f();
    L_0x001d:
        if (r3 != 0) goto L_0x0020;
    L_0x001f:
        return r1;
    L_0x0020:
        r0 = r2.q;
        r3 = r0.a(r3);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nge.a(nch):java.util.List");
    }

    public final synchronized void a() {
        this.C = true;
        this.i.f(true);
        this.i.H();
    }

    public final void a(abbd abbd) {
        E();
        a(abbd, aapu.USER_UPDATE, nch.FRIENDS);
        a(new nca(null, aapu.USER_UPDATE));
    }

    public final synchronized void a(abbd abbd, aapu aapu, nch nch) {
        a(new nca(abbd, aapu), nch);
    }

    public final synchronized void a(abbd abbd, aapu aapu, boolean z) {
        a(new nca(abbd, aapu), z);
    }

    public final synchronized void a(final Runnable runnable, final Runnable runnable2) {
        x();
        this.k.a(new nga.a<alhe>() {
            public final void a() {
                if (runnable2 != null) {
                    nge.this.w().post(runnable2);
                }
            }

            public final /* synthetic */ void a(Object obj) {
                if (runnable != null) {
                    nge.this.w().post(runnable);
                }
            }
        });
    }

    public final void a(Set<String> set, abbd abbd) {
        E();
        a(abbd, nch.CUSTOM, (Set) set);
        a(new nca(null, aapu.USER_UPDATE));
    }

    public final synchronized void a(Set<String> set, nca nca) {
        aapt F = F();
        boolean z = true;
        if (set.isEmpty()) {
            a();
            a(true, 0);
        } else {
            z = a(false, 0);
            z();
        }
        if (!(this.l.equals(set) && this.G == nch.CUSTOM && !z)) {
            this.F = F;
            this.G = nch.CUSTOM;
            this.i.a(this.G);
            this.l.clear();
            this.l.addAll(set);
            this.m.a(this.l);
            this.i.a(this.l);
            this.i.H();
            a(nca);
        }
    }

    public final synchronized void a(nca nca, boolean z) {
        boolean a = a(z, 0);
        if (a) {
            a(nca);
        }
        if (a && !z) {
            w().post(new 3());
        }
    }

    public final synchronized void a(nca nca, boolean z, long j) {
        if (a(z, j)) {
            a(nca);
        }
    }

    public final void a(a aVar) {
        this.a.add(aVar);
    }

    public final synchronized void a(b bVar) {
        this.L = bVar;
    }

    public final void a(c cVar) {
        this.e.c(cVar);
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(ngf ngf, long j, int i) {
        if (!this.J.equals(ngf)) {
            return;
        }
        if (d()) {
            long a = nga.b.a(i, new Random());
            if (this.n.c() - j > 30000) {
                this.y.a(nga.c.a);
            }
            w().postDelayed(new -$$Lambda$nge$X4gE940H5pWWGL-L3AbEDiR-Pyg(ngf, j, i), a);
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    /* JADX WARNING: Missing block: B:24:0x0038, code skipped:
            return;
     */
    public final synchronized void a(defpackage.ngf r3, long r4, boolean r6, defpackage.alkf r7, long r8) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.i;	 Catch:{ all -> 0x0039 }
        r0 = r0.m();	 Catch:{ all -> 0x0039 }
        if (r0 == 0) goto L_0x000b;
    L_0x0009:
        monitor-exit(r2);
        return;
    L_0x000b:
        r0 = r2.J;	 Catch:{ all -> 0x0039 }
        r3 = r0.equals(r3);	 Catch:{ all -> 0x0039 }
        if (r3 != 0) goto L_0x0015;
    L_0x0013:
        monitor-exit(r2);
        return;
    L_0x0015:
        r2.a(r6);	 Catch:{ all -> 0x0039 }
        r3 = r2.d();	 Catch:{ all -> 0x0039 }
        if (r3 != 0) goto L_0x0028;
    L_0x001e:
        r0 = r2.C();	 Catch:{ all -> 0x0039 }
        r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r6 <= 0) goto L_0x0028;
    L_0x0026:
        monitor-exit(r2);
        return;
    L_0x0028:
        r2.a(r7, r8);	 Catch:{ all -> 0x0039 }
        r4 = r2.i;	 Catch:{ all -> 0x0039 }
        r4.H();	 Catch:{ all -> 0x0039 }
        if (r3 == 0) goto L_0x0037;
    L_0x0032:
        r3 = r2.L;	 Catch:{ all -> 0x0039 }
        r3.a(r2, r8);	 Catch:{ all -> 0x0039 }
    L_0x0037:
        monitor-exit(r2);
        return;
    L_0x0039:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nge.a(ngf, long, boolean, alkf, long):void");
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(ngf ngf, ncp ncp) {
        if (this.J.equals(ngf)) {
            ncp.b.a(this.I);
            this.x.a(ncp.a);
        }
    }

    public final synchronized void a(boolean z) {
        this.D = z;
        this.i.d(z);
        this.i.H();
    }

    /* JADX WARNING: Missing block: B:41:0x0058, code skipped:
            return false;
     */
    public final synchronized boolean a(java.lang.String r5) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.r;	 Catch:{ all -> 0x0059 }
        r0 = r0.a();	 Catch:{ all -> 0x0059 }
        r0 = r5.equals(r0);	 Catch:{ all -> 0x0059 }
        r1 = 1;
        if (r0 == 0) goto L_0x0010;
    L_0x000e:
        monitor-exit(r4);
        return r1;
    L_0x0010:
        r0 = r4.q;	 Catch:{ all -> 0x0059 }
        r0 = r0.b(r5);	 Catch:{ all -> 0x0059 }
        r2 = 0;
        if (r0 == 0) goto L_0x0057;
    L_0x0019:
        r3 = r4.q;	 Catch:{ all -> 0x0059 }
        r5 = r3.a(r5);	 Catch:{ all -> 0x0059 }
        if (r5 == 0) goto L_0x0057;
    L_0x0021:
        r5 = r4.e();	 Catch:{ all -> 0x0059 }
        if (r5 == 0) goto L_0x0029;
    L_0x0027:
        monitor-exit(r4);
        return r2;
    L_0x0029:
        r5 = defpackage.nge.5.a;	 Catch:{ all -> 0x0059 }
        r3 = r4.G;	 Catch:{ all -> 0x0059 }
        r3 = r3.ordinal();	 Catch:{ all -> 0x0059 }
        r5 = r5[r3];	 Catch:{ all -> 0x0059 }
        if (r5 == r1) goto L_0x0055;
    L_0x0035:
        r3 = 2;
        if (r5 == r3) goto L_0x004d;
    L_0x0038:
        r3 = 3;
        if (r5 == r3) goto L_0x0041;
    L_0x003b:
        r0 = 4;
        if (r5 == r0) goto L_0x003f;
    L_0x003e:
        goto L_0x0057;
    L_0x003f:
        monitor-exit(r4);
        return r2;
    L_0x0041:
        r5 = r4.t;	 Catch:{ all -> 0x0059 }
        r5 = r5.contains(r0);	 Catch:{ all -> 0x0059 }
        if (r5 != 0) goto L_0x004b;
    L_0x0049:
        monitor-exit(r4);
        return r1;
    L_0x004b:
        monitor-exit(r4);
        return r2;
    L_0x004d:
        r5 = r4.l;	 Catch:{ all -> 0x0059 }
        r5 = r5.contains(r0);	 Catch:{ all -> 0x0059 }
        monitor-exit(r4);
        return r5;
    L_0x0055:
        monitor-exit(r4);
        return r1;
    L_0x0057:
        monitor-exit(r4);
        return r2;
    L_0x0059:
        r5 = move-exception;
        monitor-exit(r4);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nge.a(java.lang.String):boolean");
    }

    public final ajdp<Set<String>> b(ajdw ajdw) {
        return this.u.a(ajdw);
    }

    public final synchronized void b(abbd abbd, aapu aapu, boolean z) {
        b(new nca(abbd, aapu), z);
    }

    public final void b(Set<String> set, abbd abbd) {
        E();
        a(abbd, nch.BLACKLIST, (Set) set);
        a(new nca(null, aapu.USER_UPDATE));
    }

    /* JADX WARNING: Missing block: B:12:0x0049, code skipped:
            return;
     */
    public final synchronized void b(java.util.Set<java.lang.String> r3, defpackage.nca r4) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.F();	 Catch:{ all -> 0x004a }
        r2.z();	 Catch:{ all -> 0x004a }
        r1 = r2.a(r3);	 Catch:{ all -> 0x004a }
        if (r1 == 0) goto L_0x0048;
    L_0x000e:
        r2.F = r0;	 Catch:{ all -> 0x004a }
        r0 = defpackage.nch.BLACKLIST;	 Catch:{ all -> 0x004a }
        r2.G = r0;	 Catch:{ all -> 0x004a }
        r0 = r2.i;	 Catch:{ all -> 0x004a }
        r1 = r2.G;	 Catch:{ all -> 0x004a }
        r0.a(r1);	 Catch:{ all -> 0x004a }
        r0 = r2.t;	 Catch:{ all -> 0x004a }
        r0.clear();	 Catch:{ all -> 0x004a }
        r0 = r2.t;	 Catch:{ all -> 0x004a }
        r0.addAll(r3);	 Catch:{ all -> 0x004a }
        r0 = r2.u;	 Catch:{ all -> 0x004a }
        r1 = r2.t;	 Catch:{ all -> 0x004a }
        r0.a(r1);	 Catch:{ all -> 0x004a }
        r0 = r2.i;	 Catch:{ all -> 0x004a }
        r1 = r2.t;	 Catch:{ all -> 0x004a }
        r0.b(r1);	 Catch:{ all -> 0x004a }
        r0 = r2.i;	 Catch:{ all -> 0x004a }
        r0.H();	 Catch:{ all -> 0x004a }
        r3 = r3.isEmpty();	 Catch:{ all -> 0x004a }
        if (r3 == 0) goto L_0x0045;
    L_0x003e:
        r3 = defpackage.nch.FRIENDS;	 Catch:{ all -> 0x004a }
        r2.a(r4, r3);	 Catch:{ all -> 0x004a }
        monitor-exit(r2);
        return;
    L_0x0045:
        r2.a(r4);	 Catch:{ all -> 0x004a }
    L_0x0048:
        monitor-exit(r2);
        return;
    L_0x004a:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nge.b(java.util.Set, nca):void");
    }

    public final void b(a aVar) {
        this.a.remove(aVar);
    }

    public final void b(c cVar) {
        this.e.d(cVar);
    }

    public final synchronized boolean b() {
        return this.D;
    }

    public final synchronized boolean c() {
        return this.E;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x000d in {4, 6, 7, 10} preds:[]
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
    public final synchronized boolean d() {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.z;	 Catch:{ all -> 0x000a }
        if (r0 != 0) goto L_0x0008;
        r0 = 1;
        monitor-exit(r1);
        return r0;
        r0 = 0;
        goto L_0x0006;
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nge.d():boolean");
    }

    public final synchronized boolean e() {
        return this.A;
    }

    public final synchronized Set<String> f() {
        return new HashSet(this.l);
    }

    public final synchronized Set<String> g() {
        return new HashSet(this.t);
    }

    public final ajdp<alkf> h() {
        return this.x;
    }

    public final ajdp<nga.c> i() {
        return this.y;
    }

    public final ajdp<Boolean> j() {
        return this.w.j(ajfu.a);
    }

    public final synchronized aapt k() {
        return this.F;
    }

    public final synchronized aapt l() {
        if (!this.A) {
            if (this.G != null) {
                aapt aapt = (aapt) f.get(this.G);
                if (aapt != null) {
                    return aapt;
                }
                return aapt.GHOST_MODE;
            }
        }
        return aapt.GHOST_MODE;
    }

    public final synchronized nch m() {
        return this.G;
    }

    /* JADX WARNING: Missing block: B:16:0x0031, code skipped:
            return true;
     */
    public final synchronized boolean n() {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.A;	 Catch:{ all -> 0x0035 }
        if (r0 != 0) goto L_0x0032;
    L_0x0005:
        r0 = r3.b();	 Catch:{ all -> 0x0035 }
        if (r0 == 0) goto L_0x0032;
    L_0x000b:
        r0 = r3.G;	 Catch:{ all -> 0x0035 }
        r1 = defpackage.nch.CUSTOM;	 Catch:{ all -> 0x0035 }
        if (r0 != r1) goto L_0x0019;
    L_0x0011:
        r0 = r3.l;	 Catch:{ all -> 0x0035 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0035 }
        if (r0 != 0) goto L_0x0032;
    L_0x0019:
        r0 = r3.G;	 Catch:{ all -> 0x0035 }
        r1 = defpackage.nch.BLACKLIST;	 Catch:{ all -> 0x0035 }
        r2 = 1;
        if (r0 != r1) goto L_0x0030;
    L_0x0020:
        r0 = r3.t;	 Catch:{ all -> 0x0035 }
        r0 = r0.size();	 Catch:{ all -> 0x0035 }
        r1 = r3.q;	 Catch:{ all -> 0x0035 }
        r1 = r1.a();	 Catch:{ all -> 0x0035 }
        r1 = r1 - r2;
        r1 = r1 - r2;
        if (r0 >= r1) goto L_0x0032;
    L_0x0030:
        monitor-exit(r3);
        return r2;
    L_0x0032:
        r0 = 0;
        monitor-exit(r3);
        return r0;
    L_0x0035:
        r0 = move-exception;
        monitor-exit(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nge.n():boolean");
    }

    public final synchronized void o() {
        this.L = new ngc(0, this.p);
    }

    public final synchronized boolean p() {
        return this.J.c();
    }

    public final synchronized boolean q() {
        return this.C;
    }

    public final synchronized nbr r() {
        if (!this.A || !this.B) {
            return null;
        }
        return this.d;
    }

    public final synchronized void s() {
        this.d.c();
        this.I = true;
    }

    public final synchronized void t() {
        this.d.d();
        this.I = false;
    }

    public final synchronized void u() {
        boolean z;
        if (!d()) {
            if (!y()) {
                z = false;
                this.J.a((ncn) this, z, B(), this.L);
            }
        }
        z = true;
        this.J.a((ncn) this, z, B(), this.L);
    }

    public final synchronized void v() {
        if (this.J.b()) {
            this.L.a(this, new nca(null, aapu.USER_UPDATE), 0);
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized Handler w() {
        if (this.M == null) {
            this.M = new Handler(Looper.getMainLooper());
        }
        return this.M;
    }

    public final synchronized void x() {
        this.d = new nfu(this.i, this.o, this.j);
        nfu nfu = (nfu) nfu.a.getAndSet(null);
        if (nfu != null) {
            nfu.f();
        }
        this.J.d();
        this.J = new ngf(this.i, this.k, new b(this), this.v);
        this.K = 0;
        this.z = false;
        this.A = true;
        this.E = false;
        this.B = false;
        this.C = false;
        this.D = false;
        this.G = h;
        this.l.clear();
        this.m.a(this.l);
        this.t.clear();
        this.u.a(this.t);
        this.H = false;
        this.i.t();
        this.i.u();
        this.i.v();
        this.i.w();
        this.i.x();
        this.i.s();
        this.i.y();
        this.i.z();
        this.i.F();
    }
}
