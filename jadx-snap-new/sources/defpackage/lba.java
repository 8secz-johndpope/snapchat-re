package defpackage;

import android.opengl.EGL14;
import android.os.Looper;
import android.util.DisplayMetrics;
import com.google.common.base.Predicate;
import com.google.common.base.Supplier;
import defpackage.dpw.a;
import defpackage.ebs.d;
import defpackage.kxc.c;
import defpackage.mov.b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: lba */
public final class lba implements ajdt<mmt>, ebf {
    private final akbk<ajdw> A;
    final AtomicReference<kxx> a;
    final Predicate<Void> b;
    final Predicate<Void> c;
    public volatile kxc d;
    public volatile boolean e;
    public volatile String f;
    public volatile String g;
    public volatile boolean h;
    public volatile int i;
    ebs j;
    b k;
    final ajdp<dpw> l;
    final ajdp<Float> m;
    final dnr n;
    final zfw o;
    private final ajei p;
    private final ajws<mmt> q;
    private final ajxe r;
    private volatile boolean s;
    private final Supplier<mmf> t;
    private final ajws<lqf> u;
    private final ajdp<ebs> v;
    private final ajdp<ebk> w;
    private final boolean x;
    private final Supplier<iib> y;
    private final ajdp<mih> z;

    /* renamed from: lba$s */
    static final class s<T> implements Predicate<Void> {
        private /* synthetic */ lba a;

        s(lba lba) {
            this.a = lba;
        }

        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return this.a.e;
        }
    }

    /* renamed from: lba$a */
    static final class a<T> implements Predicate<Void> {
        private /* synthetic */ lba a;

        a(lba lba) {
            this.a = lba;
        }

        public final /* synthetic */ boolean apply(Object obj) {
            mmf mmf = ((kxx) this.a.a.get()).a;
            Boolean valueOf = !mmf.isDisposed() ? Boolean.valueOf(mmf.s().a() ^ 1) : null;
            return valueOf != null ? valueOf.booleanValue() : true;
        }
    }

    /* renamed from: lba$1 */
    static final class 1 extends akcs implements akbk<ajdw> {
        public static final 1 a = new 1();

        1() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object a = ajef.a(Looper.myLooper());
            akcr.a(a, "AndroidSchedulers.from(Looper.myLooper())");
            return a;
        }
    }

    /* renamed from: lba$2 */
    static final class 2 extends akcs implements akbk<abse> {
        public static final 2 a = new 2();

        2() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new abse();
        }
    }

    /* renamed from: lba$b */
    static final class b implements ajev {
        private /* synthetic */ lba a;

        b(lba lba) {
            this.a = lba;
        }

        public final void run() {
            this.a.e = true;
        }
    }

    /* renamed from: lba$e */
    static final class e<T> implements ajfb<dpw> {
        private /* synthetic */ lba a;

        e(lba lba) {
            this.a = lba;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (dpw) obj;
            this.a.e = akcr.a(obj, dpw.b.a);
        }
    }

    /* renamed from: lba$f */
    static final class f<T> implements ajfb<dpw> {
        private /* synthetic */ lba a;

        f(lba lba) {
            this.a = lba;
        }

        public final /* synthetic */ void accept(Object obj) {
            dpw dpw = (dpw) obj;
            String str = null;
            lba lba;
            if (dpw instanceof a) {
                lba lba2 = this.a;
                lba2.h = true;
                if (dpw instanceof a.b) {
                    str = ((a.b) dpw).a;
                }
                lba2.f = str;
                lba = this.a;
                lba.b(lba.k);
                return;
            }
            if (dpw instanceof dpw.b) {
                lba = this.a;
                lba.f = null;
                lba.g = null;
                lba.h = false;
                lba.j();
            }
        }
    }

    /* renamed from: lba$g */
    static final class g<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ lba a;

        g(lba lba) {
            this.a = lba;
        }

        public final /* synthetic */ Object apply(Object obj) {
            dpw dpw = (dpw) obj;
            akcr.b(dpw, "it");
            if (dpw instanceof a) {
                return this.a.m;
            }
            if (dpw instanceof dpw.b) {
                obj = ajvo.a(ajot.a);
                akcr.a(obj, "empty()");
                return obj;
            }
            throw new ajxk();
        }
    }

    /* renamed from: lba$h */
    static final class h<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ lba a;

        h(lba lba) {
            this.a = lba;
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (ebs) obj;
            akcr.b(obj, "it");
            return ((obj instanceof ebs.a) && ((ebs.a) obj).b == edk.SURFACE_UPDATE) ? ajdp.b(obj).c(500, TimeUnit.MILLISECONDS, this.a.o.b()) : ajdp.b(obj);
        }
    }

    /* renamed from: lba$i */
    static final class i<T> implements ajfb<ebs> {
        private /* synthetic */ lba a;

        i(lba lba) {
            this.a = lba;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (ebs) obj;
            lba lba = this.a;
            akcr.a(obj, "it");
            lba.j = obj;
            lba.i();
        }
    }

    /* renamed from: lba$q */
    static final class q<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ ajdw a;

        q(ajdw ajdw) {
            this.a = ajdw;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            return ((ebs) ajxm.a) instanceof ebs.a ? ((dpw) ajxm.b) instanceof a ? ajdp.a(0, 1, TimeUnit.SECONDS, this.a) : ajvo.a(ajot.a) : ajvo.a(ajot.a);
        }
    }

    /* renamed from: lba$j */
    static final class j<T> implements ajfb<Long> {
        private /* synthetic */ lba a;

        j(lba lba) {
            this.a = lba;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.d();
        }
    }

    /* renamed from: lba$m */
    static final class m<T> implements ajfl<dpw> {
        public static final m a = new m();

        m() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            dpw dpw = (dpw) obj;
            akcr.b(dpw, "it");
            return dpw instanceof a.b;
        }
    }

    /* renamed from: lba$k */
    static final class k<T, R> implements ajfc<ajdp<Object>, ajdt<?>> {
        private /* synthetic */ lba a;

        k(lba lba) {
            this.a = lba;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((ajdp) obj, "<anonymous parameter 0>");
            return this.a.l.a((ajfl) lbc.a);
        }
    }

    /* renamed from: lba$n */
    static final class n<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final n a = new n();

        n() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ebk ebk = (ebk) obj;
            akcr.b(ebk, "it");
            switch (lbb.a[ebk.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    return ajdp.b(b.VIDEO_RECORDING);
                case 5:
                    return ajdp.b(b.PHOTO_CAPTURE);
                case 6:
                case 7:
                case 8:
                    return ajvo.a(ajot.a);
                default:
                    throw new ajxk();
            }
        }
    }

    /* renamed from: lba$l */
    static final class l<T> implements ajfb<b> {
        private /* synthetic */ lba a;

        l(lba lba) {
            this.a = lba;
        }

        public final /* synthetic */ void accept(Object obj) {
            b bVar = (b) obj;
            lba lba = this.a;
            akcr.a((Object) bVar, "it");
            lba.a(bVar);
        }
    }

    /* renamed from: lba$p */
    static final class p extends akcq implements akbl<Float, ajxw> {
        p(lba lba) {
            super(1, lba);
        }

        public final String getName() {
            return "updateZoomRatio";
        }

        public final akej getOwner() {
            return akde.a(lba.class);
        }

        public final String getSignature() {
            return "updateZoomRatio(F)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            float floatValue = ((Number) obj).floatValue();
            lba lba = (lba) this.receiver;
            kxc.a a = kxd.a(lba.d);
            a.e = Float.valueOf(floatValue);
            lba.d = a.a();
            return ajxw.a;
        }
    }

    /* renamed from: lba$o */
    static final class o<T, R> implements ajfc<T, R> {
        public static final o a = new o();

        o() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            mih mih = (mih) ajxm.a;
            obj = ((iib.a) ajxm.b).b;
            akcr.a(obj, "param.fullscreenResolution");
            return Integer.valueOf(obj.c() ? mih.d : 0);
        }
    }

    /* renamed from: lba$c */
    static final class c<T> implements ajfb<Integer> {
        private /* synthetic */ lba a;

        c(lba lba) {
            this.a = lba;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Integer) obj;
            lba lba = this.a;
            akcr.a(obj, "it");
            lba.i = obj.intValue();
        }
    }

    /* renamed from: lba$d */
    static final class d implements Runnable {
        private /* synthetic */ lba a;

        d(lba lba) {
            this.a = lba;
        }

        public final void run() {
            String str = "LensesFeatureProcessingCoreSub";
            this.a.n.a(this.a.c, str);
            this.a.n.b(this.a.b, str);
        }
    }

    /* renamed from: lba$r */
    static final class r implements Runnable {
        private /* synthetic */ lba a;

        r(lba lba) {
            this.a = lba;
        }

        public final void run() {
            this.a.n.a(this.a.c);
            this.a.n.a(this.a.b);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(lba.class), "displayMetrics", "getDisplayMetrics()Landroid/util/DisplayMetrics;");
    }

    public /* synthetic */ lba(Supplier supplier, ajdp ajdp, ajws ajws, ajdp ajdp2, ajdp ajdp3, ajdp ajdp4, dnr dnr, zfw zfw, boolean z, Supplier supplier2, ajdp ajdp5) {
        this(supplier, ajdp, ajws, ajdp2, ajdp3, ajdp4, dnr, zfw, z, supplier2, ajdp5, 1.a, 2.a);
    }

    private lba(Supplier<mmf> supplier, ajdp<dpw> ajdp, ajws<lqf> ajws, ajdp<ebs> ajdp2, ajdp<ebk> ajdp3, ajdp<Float> ajdp4, dnr dnr, zfw zfw, boolean z, Supplier<iib> supplier2, ajdp<mih> ajdp5, akbk<? extends ajdw> akbk, akbk<? extends DisplayMetrics> akbk2) {
        akcr.b(supplier, "lensCoreSupplier");
        akcr.b(ajdp, "lensesLifecycle");
        akcr.b(ajws, "cameraLifecycleSubject");
        akcr.b(ajdp2, "streamingStateObservable");
        akcr.b(ajdp3, "captureStateObservable");
        akcr.b(ajdp4, "zoomObservable");
        akcr.b(dnr, "navigator");
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(supplier2, "screenParameterSupplier");
        akcr.b(ajdp5, "windowRect");
        akcr.b(akbk, "androidSchedulerProvider");
        akcr.b(akbk2, "displayMetricsProvider");
        this.t = supplier;
        this.l = ajdp;
        this.u = ajws;
        this.v = ajdp2;
        this.w = ajdp3;
        this.m = ajdp4;
        this.n = dnr;
        this.o = zfw;
        this.x = z;
        this.y = supplier2;
        this.z = ajdp5;
        this.A = akbk;
        this.p = new ajei();
        this.a = new AtomicReference(kxx.c);
        Object r = new ajwl().r();
        akcr.a(r, "BehaviorSubject.create<LensCore>().toSerialized()");
        this.q = r;
        this.r = ajxh.a(akbk2);
        this.b = new s(this);
        this.c = new a(this);
        this.d = new c();
        this.e = true;
        this.j = ebs.c.b;
        this.k = b.PREVIEW;
    }

    private final DisplayMetrics k() {
        return (DisplayMetrics) this.r.b();
    }

    private final ajdp<mmt> l() {
        while (true) {
            kxx kxx = (kxx) this.a.get();
            if (!kxx.a.isDisposed()) {
                break;
            }
            mmf mmf = (mmf) this.t.get();
            akcr.a((Object) mmf, "newLensCore");
            if (this.a.compareAndSet(kxx, new kxx(mmf, 2))) {
                this.q.a((Object) mmf);
                break;
            }
            mmf.dispose();
        }
        return this.q;
    }

    private final void m() {
        kxx kxx;
        do {
            kxx = (kxx) this.a.get();
            if (!kxx.b || kxx.a.isDisposed()) {
                return;
            }
        } while (!this.a.compareAndSet(kxx, kxx.c));
        kxx.a.dispose();
        this.q.a((Object) kxx.c.a);
    }

    public final int a(ebf.a aVar, boolean z) {
        akcr.b(aVar, "resultTextureType");
        if (this.d instanceof kxc.b) {
            mmf mmf = ((kxx) this.a.get()).a;
            if (!mmf.isDisposed()) {
                return ((Number) mmf.r().b().a(new ajxm(Integer.valueOf(aVar.ordinal()), Boolean.valueOf(z)))).intValue();
            }
        }
        return 0;
    }

    public final void a() {
        this.p.a(this.l.b((ajev) new b(this)).f((ajfb) new e(this)));
        this.p.a(this.l.h(dpw.b.a).j(ajfu.a).b(1).f((ajfb) new f(this)));
        this.p.a(this.l.u(new g(this)).j(ajfu.a).f((ajfb) new lbd(new p(this))));
        ajdw ajdw = (ajdw) this.A.invoke();
        this.p.a(this.v.u(new h(this)).a(ajdw).f((ajfb) new i(this)));
        this.p.a(myu.a(this.v, this.l).u(new q(ajdw)).f((ajfb) new j(this)));
        this.p.a(this.w.a(ajdw).j((ajdt) this.l.a((ajfl) m.a)).t(new k(this)).u(n.a).f((ajfb) new l(this)));
        ajei ajei = this.p;
        ajdp ajdp = this.z;
        Object i = ((iib) this.y.get()).b().i();
        akcr.a(i, "screenParameterSupplier.…rameters().toObservable()");
        ajei.a(myu.b(ajdp, i).b((ajdw) this.o.b()).p(o.a).f((ajfb) new c(this)));
        this.o.l().a((Runnable) new d(this));
        this.d = new c();
        this.s = true;
    }

    public final void a(int i) {
        if (this.s) {
            kxc.a a = kxd.a(this.d);
            a.a = Integer.valueOf(i);
            this.d = a.a();
            i();
            return;
        }
        throw new IllegalStateException("LensesFeatureProcessingCoreSub must be initialized first".toString());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:24:0x00a0 in {4, 5, 6, 10, 14, 15, 20, 21, 23} preds:[]
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
    public final void a(int r19, int r20, long r21, float[] r23, float[] r24, boolean r25, boolean r26, boolean r27) {
        /*
        r18 = this;
        r0 = r18;
        r1 = "inputTextureTransformation";
        r6 = r23;
        defpackage.akcr.b(r6, r1);
        r1 = "floats";
        r7 = r24;
        defpackage.akcr.b(r7, r1);
        r1 = r0.s;
        if (r1 == 0) goto L_0x0092;
        r18.m();
        if (r26 != 0) goto L_0x001b;
        if (r25 == 0) goto L_0x0020;
        if (r27 != 0) goto L_0x0020;
        r1 = defpackage.mov.b.VIDEO_RECORDING;
        goto L_0x0032;
        if (r26 == 0) goto L_0x0027;
        if (r27 == 0) goto L_0x0027;
        if (r25 != 0) goto L_0x0027;
        goto L_0x001d;
        if (r27 == 0) goto L_0x0030;
        if (r25 != 0) goto L_0x0030;
        if (r26 != 0) goto L_0x0030;
        r1 = defpackage.mov.b.PHOTO_CAPTURE;
        goto L_0x0032;
        r1 = defpackage.mov.b.PREVIEW;
        r0.a(r1);
        r1 = r0.d;
        r2 = r1 instanceof defpackage.kxc.b;
        if (r2 == 0) goto L_0x0091;
        r1 = (defpackage.kxc.b) r1;
        r2 = r0.a;
        r2 = r2.get();
        r2 = (defpackage.kxx) r2;
        r2 = r2.a;
        r3 = r2.isDisposed();
        if (r3 != 0) goto L_0x0091;
        r17 = r2;
        r17 = (defpackage.mmt) r17;
        r2 = r1.c;
        r8 = r2.a();
        r2 = r1.c;
        r9 = r2.b();
        r2 = r1.d;
        r10 = r2.a();
        r2 = r1.d;
        r11 = r2.b();
        r12 = r1.e;
        r13 = r1.f;
        r14 = r1.a;
        r15 = r1.b;
        r1 = r0.k;
        r2 = r19;
        r3 = r20;
        r4 = r21;
        r6 = r23;
        r7 = r24;
        r16 = r1;
        r1 = defpackage.mox.a(r2, r3, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16);
        r2 = r17.r();
        r2 = r2.a();
        r2.a(r1);
        r1.o();
        return;
        r1 = new java.lang.IllegalStateException;
        r2 = "LensesFeatureProcessingCoreSub must be initialized first";
        r2 = r2.toString();
        r1.<init>(r2);
        r1 = (java.lang.Throwable) r1;
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lba.a(int, int, long, float[], float[], boolean, boolean, boolean):void");
    }

    public final void a(abtl abtl, float f, float f2) {
        akcr.b(abtl, "previewSize");
        if (this.s) {
            kxc.a a = kxd.a(this.d);
            a.c = new abpq(abtl.b(), abtl.c());
            a.d = new abpq(k().widthPixels, k().heightPixels - this.i);
            a.f = Float.valueOf(f);
            a.g = Float.valueOf(f2);
            this.d = a.a();
            i();
            return;
        }
        throw new IllegalStateException("LensesFeatureProcessingCoreSub must be initialized first".toString());
    }

    public final void a(ajdv<? super mmt> ajdv) {
        akcr.b(ajdv, "observer");
        l().a((ajdv) ajdv);
    }

    public final void a(dpa dpa) {
        akcr.b(dpa, "pictureCallback");
        throw new UnsupportedOperationException("Unsupported method");
    }

    public final void a(ebf.a aVar, float[] fArr, boolean z, boolean z2) {
        akcr.b(aVar, "resultTextureType");
        akcr.b(fArr, "transformationMatrixArray");
        if (this.d instanceof kxc.b) {
            mmf mmf = ((kxx) this.a.get()).a;
            if (!mmf.isDisposed()) {
                mmt mmt = mmf;
                mov.c a = moz.a(aVar.ordinal(), fArr, z, z2);
                mmt.r().c().a(a);
                a.e();
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(b bVar) {
        if (this.k != bVar) {
            this.k = bVar;
            b(bVar);
            i();
        }
    }

    public final void a(boolean z) {
        if (this.s) {
            kxc.a a = kxd.a(this.d);
            a.b = Boolean.valueOf(z);
            a.e = Float.valueOf(1.0f);
            this.d = a.a();
            i();
            return;
        }
        throw new IllegalStateException("LensesFeatureProcessingCoreSub must be initialized first".toString());
    }

    public final void b() {
        if (this.s) {
            this.s = false;
            this.u.a((Object) lqf.a.a);
            this.p.a();
            this.o.l().a((Runnable) new r(this));
            j();
            m();
            return;
        }
        throw new IllegalStateException("LensesFeatureProcessingCoreSub must be initialized first".toString());
    }

    /* Access modifiers changed, original: final */
    public final void b(b bVar) {
        String stringBuilder;
        String str = this.f;
        if (str != null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append(bVar.name());
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = null;
        }
        this.g = stringBuilder;
    }

    public final String c() {
        return this.g;
    }

    public final void d() {
        mmf mmf = ((kxx) this.a.get()).a;
        if (!mmf.isDisposed()) {
            mmt mmt = mmf;
            if (akcr.a(EGL14.EGL_NO_CONTEXT, EGL14.eglGetCurrentContext())) {
                if (this.x) {
                    this.q.a((Throwable) new IllegalStateException("Core can not be created with no active EGL context."));
                }
                return;
            }
            mmt.a().c().a(ajxw.a);
        }
    }

    public final boolean e() {
        return true;
    }

    public final boolean f() {
        return true;
    }

    public final boolean g() {
        return this.h && h();
    }

    public final boolean h() {
        return !((kxx) this.a.get()).a.isDisposed();
    }

    /* Access modifiers changed, original: final */
    public final void i() {
        kxc kxc = this.d;
        if (kxc instanceof kxc.b) {
            Object obj;
            kxc.b bVar = (kxc.b) kxc;
            lqe lqe = bVar.b ? lqe.FRONT : lqe.BACK;
            if (akcr.a(this.j, d.b)) {
                lqf.b.b.c bVar2;
                int i = lbb.b[this.k.ordinal()];
                if (i == 1) {
                    bVar2 = new lqf.b.b.b(lqe, bVar.c, bVar.d);
                } else if (i == 2) {
                    bVar2 = new lqf.b.b.a(lqe, bVar.c, bVar.d);
                } else if (i == 3) {
                    bVar2 = new lqf.b.b.c(lqe, bVar.c, bVar.d);
                } else {
                    throw new ajxk();
                }
                obj = bVar2;
            } else {
                obj = new lqf.b.a(lqe);
            }
            this.u.a(obj);
            m();
        }
    }

    /* Access modifiers changed, original: final */
    public final void j() {
        kxx kxx;
        do {
            kxx = (kxx) this.a.get();
            if (!kxx.b && !kxx.a.isDisposed()) {
            } else {
                return;
            }
        } while (!this.a.compareAndSet(kxx, new kxx(kxx.a, true)));
    }
}
