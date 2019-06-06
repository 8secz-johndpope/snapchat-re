package defpackage;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.ggk.d;
import defpackage.ggk.e;
import defpackage.ghx.a;
import java.io.Closeable;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ggw */
public class ggw implements gee {
    private static final String p = p;
    final zfw a = zgb.a(gef.a.callsite(p));
    final ggk b;
    final AtomicBoolean c;
    final aipn<ryw<ryz>> d;
    final aipn<dly> e;
    final ihh f;
    final gfd g;
    private final HashMap<String, ggp> h = new HashMap();
    private final ggt i = new ggt(this.n);
    private final gja j;
    private final gdx k;
    private final ggl l;
    private final gel m;
    private final ajdx<iha> n;
    private final gik o;

    /* renamed from: ggw$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: ggw$q */
    static final class q<T> implements ajea<T> {
        private /* synthetic */ ggw a;
        private /* synthetic */ geg b;

        q(ggw ggw, geg geg) {
            this.a = ggw;
            this.b = geg;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:63:0x0123 in {4, 20, 25, 27, 35, 39, 44, 48, 51, 53, 55, 58, 59, 60, 62} preds:[]
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
        public final void subscribe(defpackage.ajdy<defpackage.gej> r11) {
            /*
            r10 = this;
            r0 = "emitter";
            defpackage.akcr.b(r11, r0);
            r0 = r10.a;
            r7 = r10.b;
            r1 = "request";
            defpackage.akcr.b(r7, r1);
            r1 = "subscriber";
            defpackage.akcr.b(r11, r1);
            r1 = r7.h();
            r2 = defpackage.gdy.IGNORE_WRITE_CACHE;
            r1 = r1.contains(r2);
            if (r1 != 0) goto L_0x0119;
            r1 = r0.c;
            r2 = 0;
            r3 = 1;
            r1 = r1.compareAndSet(r2, r3);
            if (r1 == 0) goto L_0x0034;
            r1 = r0.e;
            r1 = r1.get();
            r1 = (defpackage.dly) r1;
            r1.a();
            r1 = r11.isDisposed();
            if (r1 != 0) goto L_0x0118;
            r1 = r7.a();
            r8 = r0.a(r1);
            if (r8 == 0) goto L_0x00fa;
            r1 = r8.a(r7, r11);
            if (r1 == 0) goto L_0x00fa;
            r11 = new ggw$k;
            r0 = (defpackage.ggw) r0;
            r11.<init>(r0);
            r11 = (defpackage.akbl) r11;
            r1 = new ggw$l;
            r1.<init>(r0);
            r1 = (defpackage.akbw) r1;
            r2 = new ggw$m;
            r2.<init>(r0);
            r2 = (defpackage.akca) r2;
            r0 = "request";
            defpackage.akcr.b(r7, r0);
            r0 = "loadFromCache";
            defpackage.akcr.b(r11, r0);
            r0 = "importFromStream";
            defpackage.akcr.b(r1, r0);
            r0 = "fetchFromServer";
            defpackage.akcr.b(r2, r0);
            monitor-enter(r8);
            r0 = r8.a();	 Catch:{ all -> 0x00f7 }
            if (r0 != 0) goto L_0x00f5;	 Catch:{ all -> 0x00f7 }
            r0 = r8.a;	 Catch:{ all -> 0x00f7 }
            if (r0 != 0) goto L_0x00f5;	 Catch:{ all -> 0x00f7 }
            r0 = r8.c;	 Catch:{ all -> 0x00f7 }
            r0 = r0.isEmpty();	 Catch:{ all -> 0x00f7 }
            if (r0 == 0) goto L_0x0089;	 Catch:{ all -> 0x00f7 }
            goto L_0x00f5;	 Catch:{ all -> 0x00f7 }
            r0 = r8.b;	 Catch:{ all -> 0x00f7 }
            if (r0 == 0) goto L_0x009a;	 Catch:{ all -> 0x00f7 }
            r11 = defpackage.ggu.b(r7);	 Catch:{ all -> 0x00f7 }
            if (r11 == 0) goto L_0x0098;	 Catch:{ all -> 0x00f7 }
            r11 = r8.b;	 Catch:{ all -> 0x00f7 }
            r2.invoke(r8, r11, r7);	 Catch:{ all -> 0x00f7 }
            monitor-exit(r8);
            return;
            r0 = r8.d;	 Catch:{ all -> 0x00f7 }
            r3 = defpackage.gdy.IGNORE_READ_CACHE;	 Catch:{ all -> 0x00f7 }
            r0 = r0.contains(r3);	 Catch:{ all -> 0x00f7 }
            if (r0 != 0) goto L_0x00bd;	 Catch:{ all -> 0x00f7 }
            r11 = r11.invoke(r7);	 Catch:{ all -> 0x00f7 }
            r11 = (defpackage.gej) r11;	 Catch:{ all -> 0x00f7 }
            r0 = r11.f();	 Catch:{ all -> 0x00f7 }
            r0 = r0.e;	 Catch:{ all -> 0x00f7 }
            r8.e = r0;	 Catch:{ all -> 0x00f7 }
            r0 = r11.a();	 Catch:{ all -> 0x00f7 }
            if (r0 == 0) goto L_0x00bd;	 Catch:{ all -> 0x00f7 }
            r8.a(r11);	 Catch:{ all -> 0x00f7 }
            monitor-exit(r8);
            return;
            r11 = r8.g;	 Catch:{ all -> 0x00f7 }
            if (r11 != 0) goto L_0x00c8;	 Catch:{ all -> 0x00f7 }
            r11 = new ifl;	 Catch:{ all -> 0x00f7 }
            r0 = r8.l;	 Catch:{ all -> 0x00f7 }
            r11.<init>(r0);	 Catch:{ all -> 0x00f7 }
            r8.g = r11;	 Catch:{ all -> 0x00f7 }
            r11 = r1.invoke(r7, r8);	 Catch:{ all -> 0x00f7 }
            r11 = (defpackage.ajej) r11;	 Catch:{ all -> 0x00f7 }
            if (r11 == 0) goto L_0x00d6;	 Catch:{ all -> 0x00f7 }
            r8.a = r11;	 Catch:{ all -> 0x00f7 }
            monitor-exit(r8);
            return;
            r11 = r8.f;	 Catch:{ all -> 0x00f7 }
            if (r11 != 0) goto L_0x00e1;	 Catch:{ all -> 0x00f7 }
            r11 = new ifl;	 Catch:{ all -> 0x00f7 }
            r0 = r8.l;	 Catch:{ all -> 0x00f7 }
            r11.<init>(r0);	 Catch:{ all -> 0x00f7 }
            r8.f = r11;	 Catch:{ all -> 0x00f7 }
            r11 = defpackage.ggu.b(r7);	 Catch:{ all -> 0x00f7 }
            if (r11 == 0) goto L_0x00f3;	 Catch:{ all -> 0x00f7 }
            r11 = r8.b;	 Catch:{ all -> 0x00f7 }
            r11 = r2.invoke(r8, r11, r7);	 Catch:{ all -> 0x00f7 }
            r11 = (defpackage.rzb) r11;	 Catch:{ all -> 0x00f7 }
            r8.b = r11;	 Catch:{ all -> 0x00f7 }
            monitor-exit(r8);
            return;
            monitor-exit(r8);
            return;
            r11 = move-exception;
            monitor-exit(r8);
            throw r11;
            r9 = new ggp;
            r3 = r0.d(r7);
            r4 = r7.e();
            r5 = r0.f;
            r1 = new ggw$n;
            r1.<init>(r0);
            r6 = r1;
            r6 = (defpackage.akbl) r6;
            r1 = r9;
            r2 = r7;
            r1.<init>(r2, r3, r4, r5, r6);
            r0.a(r8, r9);
            goto L_0x0034;
            return;
            r11 = new java.lang.UnsupportedOperationException;
            r0 = "CacheAccessControl.IGNORE_WRITE_CACHE is not supported yet";
            r11.<init>(r0);
            r11 = (java.lang.Throwable) r11;
            throw r11;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ggw$q.subscribe(ajdy):void");
        }
    }

    /* renamed from: ggw$r */
    static final class r<T, R> implements ajfc<Throwable, gej> {
        public static final r a = new r();

        r() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "e");
            return a.a(th, new gff(gfc.UNKNOWN, false, 0, null, null, null, null, 254));
        }
    }

    /* renamed from: ggw$s */
    static final class s extends akcs implements akbk<Boolean> {
        private /* synthetic */ ggw a;

        s(ggw ggw) {
            this.a = ggw;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(this.a.g.a());
        }
    }

    /* renamed from: ggw$n */
    static final class n extends akcs implements akbl<ggp, ajxw> {
        private /* synthetic */ ggw a;

        n(ggw ggw) {
            this.a = ggw;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ggp ggp = (ggp) obj;
            akcr.b(ggp, "it");
            this.a.a(ggp);
            return ajxw.a;
        }
    }

    /* renamed from: ggw$e */
    static final class e implements ryw.a {
        private /* synthetic */ ggw a;
        private /* synthetic */ ggp b;

        e(ggw ggw, ggp ggp) {
            this.a = ggw;
            this.b = ggp;
        }

        public final void onComplete(sat<sai> sat) {
            ggk ggk = this.a.b;
            geg geg = this.b.i;
            akcr.a((Object) sat, "networkResult");
            ggk.a(geg, (sat) sat);
            gej a = this.a.a((sat) sat, this.b, null);
            ggk.b(this.b.i, (sat) sat);
            this.b.a(a);
        }
    }

    /* renamed from: ggw$d */
    static final class d<Req extends sak<Object>> implements ryu<ryz> {
        private /* synthetic */ ggw a;
        private /* synthetic */ ryz b;
        private /* synthetic */ ggp c;

        d(ggw ggw, ryz ryz, ggp ggp) {
            this.a = ggw;
            this.b = ryz;
            this.c = ggp;
        }

        public final /* bridge */ /* synthetic */ sak a(sak sak) {
            return this.b;
        }
    }

    /* renamed from: ggw$k */
    static final class k extends akcq implements akbl<geg, gej> {
        k(ggw ggw) {
            super(1, ggw);
        }

        public final String getName() {
            return "loadFromCache";
        }

        public final akej getOwner() {
            return akde.a(ggw.class);
        }

        public final String getSignature() {
            return "loadFromCache(Lcom/snap/core/net/content/api/ContentRequest;)Lcom/snap/core/net/content/api/ContentResult;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            geg geg = (geg) obj;
            akcr.b(geg, "p1");
            return ((ggw) this.receiver).c(geg);
        }
    }

    /* renamed from: ggw$l */
    static final class l extends akcq implements akbw<geg, ggp, ajej> {
        l(ggw ggw) {
            super(2, ggw);
        }

        public final String getName() {
            return "importFromContentResult";
        }

        public final akej getOwner() {
            return akde.a(ggw.class);
        }

        public final String getSignature() {
            return "importFromContentResult(Lcom/snap/core/net/content/api/ContentRequest;Lcom/snap/core/net/content/impl/ContentResultSource;)Lio/reactivex/disposables/Disposable;";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            geg geg = (geg) obj;
            ggp ggp = (ggp) obj2;
            akcr.b(geg, "p1");
            akcr.b(ggp, "p2");
            ggw ggw = (ggw) this.receiver;
            geg.a d = geg.d();
            String str = null;
            if (d == null) {
                return null;
            }
            ggk ggk = ggw.b;
            geg geg2 = ggp.i;
            akcr.b(geg2, "contentRequest");
            ggk.b.b(geg2);
            ggk.a(geg2, (akbk) new e(geg2));
            ajdx a = d.a();
            geg geg3 = ggp.i;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("importFromContentResult");
            stringBuilder.append('[');
            stringBuilder.append(geg3.f().a());
            stringBuilder.append(']');
            String stringBuilder2 = stringBuilder.toString();
            sak b = geg3.b();
            if (b != null) {
                str = b.i();
            }
            str = sbi.a("ContentManager", stringBuilder2, str);
            akcr.a((Object) str, "traceNameOf(\"ContentMana…uest.networkRequest?.url)");
            return gem.a(igs.a(a, str), true).f(new f(ggw, ggp)).g(new g(ggp)).c((ajfb) new h(ggw, ggp)).b((ajdw) ggw.a.g()).c((ajdw) ggw.a.f()).a((ajfb) new ggv(new i(ggp)), (ajfb) j.a);
        }
    }

    /* renamed from: ggw$m */
    static final class m extends akcq implements akca<ggp, rzb<ryz>, geg, rzb<ryz>> {
        m(ggw ggw) {
            super(3, ggw);
        }

        public final String getName() {
            return "fetchFromServer";
        }

        public final akej getOwner() {
            return akde.a(ggw.class);
        }

        public final String getSignature() {
            return "fetchFromServer(Lcom/snap/core/net/content/impl/ContentResultSource;Lcom/snap/network/scheduling/api/RequestController;Lcom/snap/core/net/content/api/ContentRequest;)Lcom/snap/network/scheduling/api/RequestController;";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            ggp ggp = (ggp) obj;
            rzb rzb = (rzb) obj2;
            geg geg = (geg) obj3;
            akcr.b(ggp, "p1");
            akcr.b(geg, "p3");
            ggw ggw = (ggw) this.receiver;
            sak b = geg.b();
            gdw c = geg.c();
            if (b != null) {
                akcr.b(b, "networkRequest");
                String i = b.i();
                akcr.a((Object) i, "networkRequest.url");
                sac k = b.k();
                akcr.a((Object) k, "networkRequest.method");
                Map l = b.l();
                akcr.a((Object) l, "networkRequest.headers");
                ryz a = ggp.a(i, k, l, b.n(), b.m());
                if (rzb == null) {
                    ggk.a(ggp.i, a);
                    obj = ((ryw) ggw.d.get()).a(a, new e(ggw, ggp));
                    akcr.a(obj, "networkManager.get().sub…tentResult)\n            }");
                    return obj;
                }
                rzb.a((ryu) new d(ggw, a, ggp));
                ggk.b(ggp.i, a);
                return rzb;
            } else if (c == null) {
                throw new IllegalArgumentException("fetchFromServer called with no way to obtain content");
            } else if (rzb == null) {
                gge gge = new gge(c, geg, ggp, ggw.e, ggw.d, ggw.a, ggw.f, ggw.b, new c(ggw, ggp));
                gge.a();
                return gge;
            } else {
                rzb.a((ryu) new b(ggw, ggp, c));
                return rzb;
            }
        }
    }

    /* renamed from: ggw$i */
    static final class i extends akcq implements akbl<gej, ajxw> {
        i(ggp ggp) {
            super(1, ggp);
        }

        public final String getName() {
            return "setResult";
        }

        public final akej getOwner() {
            return akde.a(ggp.class);
        }

        public final String getSignature() {
            return "setResult(Lcom/snap/core/net/content/api/ContentResult;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            gej gej = (gej) obj;
            akcr.b(gej, "p1");
            ((ggp) this.receiver).a(gej);
            return ajxw.a;
        }
    }

    /* renamed from: ggw$f */
    static final class f<T, R> implements ajfc<T, R> {
        private /* synthetic */ ggw a;
        private /* synthetic */ ggp b;

        f(ggw ggw, ggp ggp) {
            this.a = ggw;
            this.b = ggp;
        }

        public final /* synthetic */ Object apply(Object obj) {
            gej gej = (gej) obj;
            akcr.b(gej, "inputResult");
            return this.a.a(gej, this.b);
        }
    }

    /* renamed from: ggw$g */
    static final class g<T, R> implements ajfc<Throwable, gej> {
        private /* synthetic */ ggp a;

        g(ggp ggp) {
            this.a = ggp;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "throwable");
            return a.a(th, this.a.a(null));
        }
    }

    /* renamed from: ggw$h */
    static final class h<T> implements ajfb<gej> {
        private /* synthetic */ ggw a;
        private /* synthetic */ ggp b;

        h(ggw ggw, ggp ggp) {
            this.a = ggw;
            this.b = ggp;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (gej) obj;
            geg geg = this.b.i;
            akcr.a(obj, "it");
            akcr.b(geg, "contentRequest");
            akcr.b(obj, "contentResult");
            ggk.a(geg, (akbk) new d(geg, obj));
        }
    }

    /* renamed from: ggw$j */
    static final class j<T> implements ajfb<Throwable> {
        public static final j a = new j();

        j() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: ggw$p */
    static final class p<V> implements Callable<T> {
        private /* synthetic */ ggw a;
        private /* synthetic */ geg b;

        p(ggw ggw, geg geg) {
            this.a = ggw;
            this.b = geg;
        }

        public final /* synthetic */ Object call() {
            return this.a.c(this.b);
        }
    }

    /* renamed from: ggw$o */
    static final class o<V> implements Callable<T> {
        private /* synthetic */ ggw a;
        private /* synthetic */ geg b;

        o(ggw ggw, geg geg) {
            this.a = ggw;
            this.b = geg;
        }

        public final /* synthetic */ Object call() {
            return this.a.b(this.b);
        }
    }

    /* renamed from: ggw$b */
    static final class b<Req extends sak<Object>> implements ryu<ryz> {
        private /* synthetic */ ggw a;
        private /* synthetic */ ggp b;
        private /* synthetic */ gdw c;

        b(ggw ggw, ggp ggp, gdw gdw) {
            this.a = ggw;
            this.b = ggp;
            this.c = gdw;
        }

        public final /* synthetic */ sak a(sak sak) {
            Object obj = (ryz) sak;
            ggp ggp = this.b;
            akcr.a(obj, "networkRequest");
            String i = obj.i();
            akcr.a((Object) i, "networkRequest.url");
            ryz a = ggp.a(i, this.c);
            ggk.b(this.b.i, a);
            return a;
        }
    }

    /* renamed from: ggw$c */
    public static final class c implements gge.a {
        private /* synthetic */ ggw a;
        private /* synthetic */ ggp b;

        c(ggw ggw, ggp ggp) {
            this.a = ggw;
            this.b = ggp;
        }

        public final void a(ryz ryz) {
            akcr.b(ryz, "networkRequest");
            ggk.a(this.b.i, ryz);
        }

        public final void a(sat<sai> sat, gdv gdv) {
            akcr.b(sat, "networkResult");
            akcr.b(gdv, "boltMetrics");
            this.a.b.a(this.b.i, (sat) sat);
            gej a = this.a.a((sat) sat, this.b, gdv);
            ggk.b(this.b.i, (sat) sat);
            this.b.a(a);
        }
    }

    static {
        a aVar = new a();
    }

    public ggw(aipn<ryw<ryz>> aipn, aipn<dly> aipn2, gja gja, gdx gdx, ggl ggl, gel gel, ajdx<iha> ajdx, ihh ihh, gik gik, gfd gfd, zgb zgb, git git) {
        akcr.b(aipn, "networkManager");
        akcr.b(aipn2, "boltResolvers");
        akcr.b(gja, "cachePolicyRepository");
        akcr.b(gdx, "cache");
        akcr.b(ggl, "requestTransformer");
        akcr.b(gel, "resultFactory");
        akcr.b(ajdx, "serializationHelper");
        akcr.b(ihh, "clock");
        akcr.b(gik, "prefetchRequestBlocker");
        akcr.b(gfd, "mainThreadChecker");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(git, "snapContentStatusMonitor");
        this.d = aipn;
        this.e = aipn2;
        this.j = gja;
        this.k = gdx;
        this.l = ggl;
        this.m = gel;
        this.n = ajdx;
        this.f = ihh;
        this.o = gik;
        this.g = gfd;
        this.b = new ggk(git);
        this.c = new AtomicBoolean(false);
    }

    private static gea a(gea gea, Map<String, String> map) {
        if (!gea.d() || map == null) {
            return gea;
        }
        rzt a = gmk.a((Map) map);
        if (!a.d || a.a || a.b || a.e) {
            return gea;
        }
        int i = a.c;
        if (i <= 0) {
            return gea;
        }
        long j = (long) i;
        return j < gea.e() ? new ggu.a(gea, TimeUnit.SECONDS.toMillis(j)) : gea;
    }

    private final gej a(InputStream inputStream, ggp ggp, sat<sai> sat) {
        String str = "result.response";
        ifl ifl = new ifl(this.f);
        int i = 0;
        gej a;
        gej a2;
        try {
            Object a3 = sat.a();
            akcr.a(a3, str);
            Map h = a3.h();
            Object a4 = sat.a();
            akcr.a(a4, str);
            i = a4.a();
            gdx.a aVar = new gdx.a(this.k, ggp.h, ggw.a(ggp.j, h), this.n);
            gfl.a a5 = a(ggp.k);
            a = ggp.k.a(inputStream, aVar, h);
            a2 = this.m.a((gez) a, a5, ggp.a(ggp, (sat) sat, ifl, null, 4), ggp.i.f().a());
            return a2;
        } catch (Exception e) {
            gey gey = new gey(i, e);
            a2 = ggp.a(ggp, (sat) sat, ifl, null, 4);
            a = new ghx(gey, a2);
            return a;
        } finally {
            aklc.a((Closeable) inputStream);
        }
    }

    private final gfl.a a(gfl gfl) {
        gfl.a a = gfl.a();
        return a == null ? this.i : a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x008a  */
    public final defpackage.geh a(defpackage.geg r24) {
        /*
        r23 = this;
        r0 = r23;
        r1 = r24;
        r2 = "request";
        defpackage.akcr.b(r1, r2);
        r3 = r0.l;
        r4 = "contentRequest";
        defpackage.akcr.b(r1, r4);
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = r24.f();
        r6 = r6.a();
        r5.append(r6);
        r6 = 45;
        r5.append(r6);
        r6 = r24.a();
        r5.append(r6);
        r8 = r5.toString();
        r5 = new gew;
        r9 = r24.b();
        r10 = r24.c();
        r11 = r24.d();
        r12 = r24.e();
        r13 = r24.f();
        r14 = r24.g();
        r6 = r24.h();
        r6 = (java.lang.Iterable) r6;
        r15 = defpackage.ajyu.m(r6);
        r6 = r24.i();
        r7 = 0;
        if (r6 != 0) goto L_0x006a;
    L_0x005b:
        r3 = r3.a;
        if (r3 == 0) goto L_0x0066;
    L_0x005f:
        r3 = r3.a(r8);
        r16 = r3;
        goto L_0x006c;
    L_0x0066:
        r3 = r7;
        r16 = r3;
        goto L_0x006d;
    L_0x006a:
        r16 = r6;
    L_0x006c:
        r3 = r7;
    L_0x006d:
        r7 = r5;
        r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16);
        r5 = (defpackage.geg) r5;
        r6 = r0.d(r5);
        r6 = r6.c();
        defpackage.akcr.b(r5, r2);
        r2 = r5.h();
        r7 = defpackage.gdy.CHECK_CACHE_ONLY;
        r2 = r2.contains(r7);
        if (r2 == 0) goto L_0x0096;
    L_0x008a:
        r1 = new ggw$o;
        r1.<init>(r0, r5);
    L_0x008f:
        r1 = (java.util.concurrent.Callable) r1;
        r1 = defpackage.ajdx.c(r1);
        goto L_0x00ea;
    L_0x0096:
        r2 = defpackage.ggu.a(r5);
        if (r2 == 0) goto L_0x00a2;
    L_0x009c:
        r1 = new ggw$p;
        r1.<init>(r0, r5);
        goto L_0x008f;
    L_0x00a2:
        r2 = defpackage.gei.a(r24);
        if (r2 == 0) goto L_0x00df;
    L_0x00a8:
        r2 = r0.o;
        r1 = r2.a(r1);
        if (r1 != 0) goto L_0x00df;
    L_0x00b0:
        r1 = new ghx;
        r2 = new gey;
        r7 = -5;
        r8 = new gex;
        r9 = 2;
        r10 = "Prefetch is not allowed on cellular connection while Data Saver is enabled";
        r8.<init>(r10, r3, r9);
        r8 = (java.lang.Throwable) r8;
        r2.<init>(r7, r8);
        r3 = new gff;
        r10 = defpackage.gfc.UNKNOWN;
        r11 = 0;
        r12 = 0;
        r14 = 0;
        r15 = 0;
        r16 = 0;
        r17 = 0;
        r18 = 254; // 0xfe float:3.56E-43 double:1.255E-321;
        r9 = r3;
        r9.<init>(r10, r11, r12, r14, r15, r16, r17, r18);
        r1.<init>(r2, r3);
        r1 = (defpackage.gej) r1;
        r1 = defpackage.ajdx.b(r1);
        goto L_0x00ea;
    L_0x00df:
        r1 = new ggw$q;
        r1.<init>(r0, r5);
        r1 = (defpackage.ajea) r1;
        r1 = defpackage.ajdx.a(r1);
    L_0x00ea:
        r2 = "if (isCheckCacheOnlyRequ…)\n            }\n        }";
        defpackage.akcr.a(r1, r2);
        r2 = defpackage.ggw.r.a;
        r2 = (defpackage.ajfc) r2;
        r1 = r1.g(r2);
        r2 = "contentResult.onErrorRet…ource.UNKNOWN))\n        }";
        defpackage.akcr.a(r1, r2);
        r2 = new ggw$s;
        r2.<init>(r0);
        r2 = (defpackage.akbk) r2;
        r3 = r0.a;
        r3 = r3.f();
        r3 = (defpackage.ajdw) r3;
        r1 = defpackage.igs.a(r1, r2, r3);
        r2 = r0.b;
        r3 = "keyTransformer";
        defpackage.akcr.a(r6, r3);
        defpackage.akcr.b(r5, r4);
        r4 = "contentResult";
        defpackage.akcr.b(r1, r4);
        defpackage.akcr.b(r6, r3);
        r3 = r5.a();
        r3 = r6.a(r3);
        r4 = r2.a;
        r6 = r4.getAndIncrement();
        r4 = new ggk$k;
        r4.<init>(r5);
        r4 = (defpackage.akbk) r4;
        defpackage.ggk.a(r5, r4);
        r4 = new ggk$l;
        r17 = r4;
        r18 = r2;
        r19 = r6;
        r21 = r5;
        r22 = r3;
        r17.<init>(r18, r19, r21, r22);
        r4 = (defpackage.ajev) r4;
        r1 = r1.c(r4);
        r4 = new ggk$m;
        r17 = r4;
        r17.<init>(r18, r19, r21, r22);
        r4 = (defpackage.ajfb) r4;
        r1 = r1.c(r4);
        r3 = new ggk$n;
        r3.<init>(r2, r5);
        r3 = (defpackage.ajfb) r3;
        r1 = r1.b(r3);
        r2 = "contentResult\n          …Started(contentRequest) }";
        defpackage.akcr.a(r1, r2);
        r2 = r0.a;
        r2 = r2.f();
        r2 = (defpackage.ajdw) r2;
        r1 = r1.c(r2);
        r2 = new giq;
        r3 = defpackage.ajot.a;
        r3 = defpackage.ajvo.a(r3);
        r2.<init>(r1, r3);
        r2 = (defpackage.geh) r2;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ggw.a(geg):geh");
    }

    /* Access modifiers changed, original: final */
    public final gej a(gej gej, ggp ggp) {
        ifl ifl = new ifl(this.f);
        try {
            gdx.a aVar = new gdx.a(this.k, ggp.h, ggw.a(ggp.j, null), this.n);
            gfl.a a = a(ggp.k);
            gej a2 = this.m.a(ggp.k.a(gej, aVar), a, ggp.a(ifl), ggp.i.f().a());
            gej.close();
            return a2;
        } catch (Exception e) {
            throw e;
        } catch (Throwable th) {
            gej.close();
        }
    }

    /* Access modifiers changed, original: final */
    public final gej a(sat<sai> sat, ggp ggp, gdv gdv) {
        Object a = sat.a();
        String str = "result.response";
        akcr.a(a, str);
        a = (sai) a.g();
        if (a == null) {
            return a.a(ggp.i, sat, ggp.a(ggp, (sat) sat, null, gdv, 2));
        }
        akcr.a(a, "result.response.payload\n…ltMetrics = boltMetrics))");
        Closeable closeable = (Closeable) a;
        try {
            gej ghx;
            sai sai = (sai) closeable;
            geg geg = ggp.i;
            gff a2 = ggp.a(ggp, (sat) sat, null, gdv, 2);
            akcr.b(geg, "request");
            akcr.b(sat, "result");
            akcr.b(a2, "metrics");
            Object a3 = sat.a();
            akcr.a(a3, str);
            int a4 = a3.a();
            Object a5 = sat.a();
            akcr.a(a5, str);
            Throwable d = a5.d();
            StringBuilder stringBuilder;
            Throwable gex;
            if (d != null) {
                stringBuilder = new StringBuilder("Network error, status:");
                stringBuilder.append(a4);
                stringBuilder.append(' ');
                stringBuilder.append(ghy.a(geg));
                stringBuilder.append(", caused by ");
                stringBuilder.append(d.getMessage());
                String stringBuilder2 = stringBuilder.toString();
                a5 = sat.a();
                akcr.a(a5, str);
                gex = new gex(stringBuilder2, a5.d());
                Object a6 = sat.a();
                akcr.a(a6, str);
                ghx = new ghx(new gey(a4, gex, a6.e()), a2);
            } else {
                Object a7;
                if (a4 >= Callback.DEFAULT_DRAG_ANIMATION_DURATION) {
                    if (a4 < MapboxConstants.ANIMATION_DURATION) {
                        a7 = sat.a();
                        akcr.a(a7, str);
                        ghx = a7.g() == null ? a.a(geg, sat, a2) : null;
                    }
                }
                a5 = sat.a();
                akcr.a(a5, str);
                sbg.a((sai) a5.g());
                stringBuilder = new StringBuilder("Status code ");
                stringBuilder.append(a4);
                stringBuilder.append(" considered a failure, ");
                stringBuilder.append(ghy.a(geg));
                gex = new gex(stringBuilder.toString(), null, 2);
                a7 = sat.a();
                akcr.a(a7, str);
                ghx = new ghx(new gey(a4, gex, a7.e()), a2);
            }
            if (ghx != null) {
                akax.a(closeable, null);
                return ghx;
            }
            InputStream e = sai.e();
            akcr.a((Object) e, "it.asByteStream()");
            gej a8 = a(e, ggp, (sat) sat);
            akax.a(closeable, null);
            return a8;
        } catch (Throwable th) {
            akax.a(closeable, th);
        }
    }

    /* Access modifiers changed, original: final */
    public final ggp a(String str) {
        ggp ggp;
        synchronized (this.h) {
            ggp = (ggp) this.h.get(str);
        }
        return ggp;
    }

    /* Access modifiers changed, original: final */
    public final boolean a(ggp ggp) {
        synchronized (this.h) {
            if (ggp != ((ggp) this.h.get(ggp.h))) {
                return false;
            }
            this.h.remove(ggp.h);
            return true;
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean a(ggp ggp, ggp ggp2) {
        synchronized (this.h) {
            if (ggp != ((ggp) this.h.get(ggp2.h))) {
                return false;
            }
            this.h.put(ggp2.h, ggp2);
            return true;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:24:0x007a in {7, 8, 17, 18, 21, 23} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    final defpackage.gej b(defpackage.geg r24) {
        /*
        r23 = this;
        r1 = r23;
        r2 = r24;
        r0 = android.os.Looper.myLooper();	 Catch:{ all -> 0x0078 }
        r3 = android.os.Looper.getMainLooper();	 Catch:{ all -> 0x0078 }
        defpackage.akcr.a(r0, r3);	 Catch:{ all -> 0x0078 }
        r3 = new ifl;	 Catch:{ all -> 0x0078 }
        r0 = r1.f;	 Catch:{ all -> 0x0078 }
        r3.<init>(r0);	 Catch:{ all -> 0x0078 }
        defpackage.ggk.a(r24);	 Catch:{ all -> 0x0078 }
        r4 = 0;
        r0 = r1.k;	 Catch:{ Exception -> 0x0065 }
        r5 = r24.a();	 Catch:{ Exception -> 0x0065 }
        r6 = r23.d(r24);	 Catch:{ Exception -> 0x0065 }
        r0 = r0.b(r5, r6);	 Catch:{ Exception -> 0x0065 }
        if (r0 == 0) goto L_0x0055;	 Catch:{ Exception -> 0x0065 }
        r0 = new gfh;	 Catch:{ Exception -> 0x0065 }
        r15 = new gff;	 Catch:{ Exception -> 0x0065 }
        r6 = defpackage.gfc.CACHE;	 Catch:{ Exception -> 0x0065 }
        r7 = 0;	 Catch:{ Exception -> 0x0065 }
        r5 = r1.f;	 Catch:{ Exception -> 0x0065 }
        r8 = defpackage.ifm.a(r5, r3);	 Catch:{ Exception -> 0x0065 }
        r10 = 0;	 Catch:{ Exception -> 0x0065 }
        r11 = new gdz;	 Catch:{ Exception -> 0x0065 }
        r17 = 0;	 Catch:{ Exception -> 0x0065 }
        r19 = 0;	 Catch:{ Exception -> 0x0065 }
        r21 = 1;	 Catch:{ Exception -> 0x0065 }
        r22 = 3;	 Catch:{ Exception -> 0x0065 }
        r16 = r11;	 Catch:{ Exception -> 0x0065 }
        r16.<init>(r17, r19, r21, r22);	 Catch:{ Exception -> 0x0065 }
        r12 = 0;	 Catch:{ Exception -> 0x0065 }
        r13 = 0;	 Catch:{ Exception -> 0x0065 }
        r14 = 234; // 0xea float:3.28E-43 double:1.156E-321;	 Catch:{ Exception -> 0x0065 }
        r5 = r15;	 Catch:{ Exception -> 0x0065 }
        r5.<init>(r6, r7, r8, r10, r11, r12, r13, r14);	 Catch:{ Exception -> 0x0065 }
        r0.<init>(r15);	 Catch:{ Exception -> 0x0065 }
        r0 = (defpackage.gej) r0;	 Catch:{ Exception -> 0x0065 }
        goto L_0x005f;	 Catch:{ Exception -> 0x0065 }
        r0 = r1.f;	 Catch:{ Exception -> 0x0065 }
        r5 = defpackage.ifm.a(r0, r3);	 Catch:{ Exception -> 0x0065 }
        r0 = defpackage.ghx.a.a(r2, r5);	 Catch:{ Exception -> 0x0065 }
        defpackage.ggk.a(r2, r4);	 Catch:{ all -> 0x0078 }
        goto L_0x0073;
        r0 = move-exception;
        goto L_0x0074;
        r0 = move-exception;
        r0 = (java.lang.Throwable) r0;	 Catch:{ all -> 0x0063 }
        r5 = r1.f;	 Catch:{ all -> 0x0063 }
        r5 = defpackage.ifm.a(r5, r3);	 Catch:{ all -> 0x0063 }
        r0 = defpackage.ghx.a.a(r0, r5);	 Catch:{ all -> 0x0063 }
        goto L_0x005f;
        return r0;
        defpackage.ggk.a(r2, r4);	 Catch:{ all -> 0x0078 }
        throw r0;	 Catch:{ all -> 0x0078 }
        r0 = move-exception;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ggw.b(geg):gej");
    }

    /* Access modifiers changed, original: final */
    public final gej c(geg geg) {
        geg geg2 = geg;
        this.g.a();
        ifl ifl = new ifl(this.f);
        ggk.a(geg);
        gej a;
        try {
            gez a2 = this.k.a(geg.a(), d(geg));
            if (a2 != null) {
                gfl e = geg.e();
                String a3 = geg.f().a();
                long a4 = ifm.a(this.f, ifl);
                a = this.m.a(a2, a(e), new gff(gfc.CACHE, false, a4, null, new gdz(a2.b(), a4, true), null, null, 234), a3);
            } else {
                a = a.a(geg2, ifm.a(this.f, ifl));
            }
            ggk.a(geg2, a);
            return a;
        } catch (Exception e2) {
            try {
                a = a.a((Throwable) e2, ifm.a(this.f, ifl));
                return a;
            } finally {
                ggk.a(geg2, null);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final gea d(geg geg) {
        return this.j.a(geg.f());
    }
}
