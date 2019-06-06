package defpackage;

import android.graphics.Point;
import com.google.common.collect.ImmutableList;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: dnb */
public final class dnb {
    static final DecimalFormat f = new DecimalFormat("#.###");
    final ArrayList<String> a = new ArrayList();
    volatile boolean b;
    volatile boolean c;
    abgt d;
    final ihh e;
    private final ArrayList<ajxm<String, Long>> g = new ArrayList();
    private final ajei h = new ajei();
    private dmz i;
    private final ajxe j;
    private final dug k;
    private final ajdx<iha> l;
    private final icv m;
    private final ajdp<Double> n;
    private final dvm o;

    /* renamed from: dnb$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: dnb$c */
    public static final class c<T, R> implements ajfc<T, R> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "it");
            return new ajxm(str, Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* renamed from: dnb$d */
    public static final class d<T> implements ajfb<ajxm<? extends String, ? extends Long>> {
        private /* synthetic */ dnb a;

        public d(dnb dnb) {
            this.a = dnb;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (ajxm) obj;
            dnb dnb = this.a;
            akcr.a(obj, "it");
            dnb.a(dnb, obj);
        }
    }

    /* renamed from: dnb$e */
    static final class e<T> implements ajfb<Double> {
        private /* synthetic */ dnb a;

        e(dnb dnb) {
            this.a = dnb;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Double) obj;
            ArrayList arrayList = this.a.a;
            DecimalFormat decimalFormat = dnb.f;
            akcr.a(obj, "it");
            arrayList.add(decimalFormat.format(obj.doubleValue()));
        }
    }

    /* renamed from: dnb$f */
    static final class f implements ajev {
        private /* synthetic */ dnb a;

        f(dnb dnb) {
            this.a = dnb;
        }

        public final void run() {
            this.a.a.clear();
        }
    }

    /* renamed from: dnb$g */
    public static final class g<T> implements ajfb<Object> {
        private /* synthetic */ dnb a;
        private /* synthetic */ boolean b = true;
        private /* synthetic */ boolean c = false;

        public g(dnb dnb) {
            this.a = dnb;
        }

        public final void accept(Object obj) {
            dnb.a(this.a, null, null, this.b, false);
        }
    }

    /* renamed from: dnb$h */
    public static final class h<T> implements ajfb<Object> {
        private /* synthetic */ dnb a;
        private /* synthetic */ aacw b;
        private /* synthetic */ boolean c = true;
        private /* synthetic */ boolean d = false;

        public h(dnb dnb, aacw aacw) {
            this.a = dnb;
            this.b = aacw;
        }

        public final void accept(Object obj) {
            dnb.a(this.a, zyr.TAP, this.b, this.c, false);
        }
    }

    /* renamed from: dnb$i */
    public static final class i<T> implements ajfb<Point> {
        private /* synthetic */ dnb a;
        private /* synthetic */ aacw b;
        private /* synthetic */ boolean c = true;
        private /* synthetic */ boolean d = false;

        public i(dnb dnb, aacw aacw) {
            this.a = dnb;
            this.b = aacw;
        }

        public final /* synthetic */ void accept(Object obj) {
            Point point = (Point) obj;
            abgt a = dnb.a(this.a, zyr.DOUBLE_TAP, this.b, this.c, false);
            a.d(Long.valueOf((long) point.x));
            a.e(Long.valueOf((long) point.y));
        }
    }

    /* renamed from: dnb$j */
    public static final class j<T, R> implements ajfc<T, R> {
        private /* synthetic */ dnb a;

        public j(dnb dnb) {
            this.a = dnb;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ebs ebs = (ebs) obj;
            akcr.b(ebs, "state");
            return new ajxm(ebs.a, Long.valueOf(this.a.e.a()));
        }
    }

    /* renamed from: dnb$k */
    public static final class k<T> implements ajfb<ajxm<? extends String, ? extends Long>> {
        private /* synthetic */ dnb a;

        public k(dnb dnb) {
            this.a = dnb;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (ajxm) obj;
            dnb dnb = this.a;
            akcr.a(obj, "it");
            dnb.a(dnb, obj);
        }
    }

    /* renamed from: dnb$l */
    public static final class l<T, R> implements ajfc<T, ajdn<? extends R>> {
        final /* synthetic */ dnb a;

        /* renamed from: dnb$l$1 */
        static final class 1<V> implements Callable<T> {
            private /* synthetic */ l a;

            1(l lVar) {
                this.a = lVar;
            }

            public final /* bridge */ /* synthetic */ Object call() {
                return this.a.a.d;
            }
        }

        public l(dnb dnb) {
            this.a = dnb;
        }

        public final /* synthetic */ Object apply(Object obj) {
            return ajdj.b((Callable) new 1(this));
        }
    }

    /* renamed from: dnb$m */
    public static final class m<T> implements ajfb<abgt> {
        private /* synthetic */ dnb a;

        public m(dnb dnb) {
            this.a = dnb;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (abgt) obj;
            dnb dnb = this.a;
            akcr.a(obj, "it");
            dna a = dnb.a(obj, this.a.b, this.a.c);
            this.a.b();
            a.a();
        }
    }

    /* renamed from: dnb$b */
    static final class b extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        b(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(dnh.f.callsite("UnifiedCameraActionTracker"));
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(dnb.class), "qualifiedSchedulers", "getQualifiedSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
        a aVar = new a();
    }

    public dnb(zgb zgb, dug dug, ajdx<iha> ajdx, icv icv, ajdp<Double> ajdp, dvm dvm, ihh ihh) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(dug, "cameraTelemetry");
        akcr.b(ajdx, "serializationHelper");
        akcr.b(icv, "frameRateAnalytics");
        akcr.b(ajdp, "cameraFpsObservable");
        akcr.b(dvm, "cameraFpsDispatcher");
        akcr.b(ihh, "clock");
        this.k = dug;
        this.l = ajdx;
        this.m = icv;
        this.n = ajdp;
        this.o = dvm;
        this.e = ihh;
        this.j = ajxh.a(new b(zgb));
    }

    public static final /* synthetic */ abgt a(dnb dnb, zyr zyr, aacw aacw, boolean z, boolean z2) {
        abgt abgt = dnb.d;
        dna a = abgt != null ? dnb.a(abgt, z2, z) : null;
        dnb.b();
        abgt abgt2 = new abgt();
        abgt2.a(Long.valueOf(dnb.e.a()));
        abgt2.a(zyr);
        abgt2.a(aacw);
        dnb.d = abgt2;
        if (z) {
            dnb.c = true;
            dnb.m.a();
        }
        if (z2) {
            dnb.b = true;
            dnb.h.a(dnb.n.b((ajdw) dnb.a().l()).e(1, TimeUnit.SECONDS, dnb.a().d()).a((ajdw) dnb.a().d()).f((ajfb) new e(dnb)));
            dnb.h.a(ajek.a((ajev) new f(dnb)));
            dnb.i = new dmz();
            dvm dvm = dnb.o;
            dmz dmz = dnb.i;
            if (dmz == null) {
                akcr.a();
            }
            dvm.a(dmz);
        }
        if (a != null) {
            a.a();
        }
        return abgt2;
    }

    public static final /* synthetic */ void a(dnb dnb, ajxm ajxm) {
        if (dnb.d != null) {
            dnb.g.add(ajxm);
        }
    }

    /* Access modifiers changed, original: final */
    public final dna a(abgt abgt, boolean z, boolean z2) {
        List k = ajyu.k(this.g);
        dug dug = this.k;
        dmz dmz = this.i;
        double c = this.m.c();
        int d = this.m.d();
        int e = this.m.e();
        Object copyOf = ImmutableList.copyOf((Collection) this.a);
        akcr.a(copyOf, "ImmutableList.copyOf(cameraFpsList)");
        List list = (List) copyOf;
        copyOf = this.l.b();
        akcr.a(copyOf, "serializationHelper.blockingGet()");
        return new dna(abgt, k, dug, dmz, z, z2, c, d, e, list, (iha) copyOf);
    }

    public final zfw a() {
        return (zfw) this.j.b();
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        this.g.clear();
        this.b = false;
        if (this.c) {
            this.c = false;
            this.m.b();
        }
        dmz dmz = this.i;
        if (dmz != null) {
            this.o.b(dmz);
        }
        this.i = null;
        this.h.a();
        this.d = null;
    }
}
