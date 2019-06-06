package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.mapbox.mapboxsdk.style.layers.Property;
import com.snapchat.android.R;
import defpackage.ablu.e;
import defpackage.absz.a;
import defpackage.txi.n;
import defpackage.txi.o;
import defpackage.txi.p;
import defpackage.txi.q;
import defpackage.txi.r;
import defpackage.txi.s;
import defpackage.txi.t;
import defpackage.txi.u;
import defpackage.txi.v;
import defpackage.txl.b;
import defpackage.txl.c;
import defpackage.txl.d;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: txe */
public final class txe implements zgj {
    final ajei a = new ajei();
    final AtomicBoolean b = new AtomicBoolean(false);
    final AtomicBoolean c = new AtomicBoolean(false);
    public zfw d;
    txi e;
    boolean f;
    boolean g;
    final tvd h;
    final ajdv<ajxw> i;
    final ajdv<ajxw> j;
    final Context k;
    private final ajxe l;
    private final ajwy<txi> m;
    private final zgb n;
    private final toc o;
    private final tpj p;
    private final ajdp<Boolean> q;
    private final ajdp<Boolean> r;

    /* renamed from: txe$b */
    static final class b extends akcs implements akbk<txo> {
        private /* synthetic */ twd a;

        b(twd twd) {
            this.a = twd;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new txo(this.a);
        }
    }

    /* renamed from: txe$c */
    static final class c extends akcq implements akbl<Throwable, ajxw> {
        c(txe txe) {
            super(1, txe);
        }

        public final String getName() {
            return "onPreviewPlayerError";
        }

        public final akej getOwner() {
            return akde.a(txe.class);
        }

        public final String getSignature() {
            return "onPreviewPlayerError(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "p1");
            txe.a((txe) this.receiver);
            return ajxw.a;
        }
    }

    /* renamed from: txe$d */
    static final class d extends akcq implements akbl<txd, ajxw> {
        d(txe txe) {
            super(1, txe);
        }

        public final String getName() {
            return "onPlaybackState";
        }

        public final akej getOwner() {
            return akde.a(txe.class);
        }

        public final String getSignature() {
            return "onPlaybackState(Lcom/snap/preview/player/PlaybackState;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            txd txd = (txd) obj;
            akcr.b(txd, "p1");
            txe txe = (txe) this.receiver;
            if (!txe.f && txd == txd.FIRST_FRAME) {
                txe.i.a(ajxw.a);
                txe.f = true;
            }
            txo a = txe.a();
            akcr.b(txd, "playbackState");
            switch (txp.a[txd.ordinal()]) {
                case 1:
                    a.a++;
                    break;
                case 2:
                    a.b++;
                    break;
                case 3:
                    a.c = Long.valueOf(System.currentTimeMillis());
                    twd.a(a.e, twb.PLAYER_START, null, 6);
                    break;
                case 4:
                    Long l = a.c;
                    if (l != null) {
                        long currentTimeMillis = System.currentTimeMillis() - l.longValue();
                        twd twd = a.e;
                        long j = a.a;
                        long j2 = a.b;
                        if (currentTimeMillis > 0) {
                            ilv ilv = twd.a;
                            ily ily = ipc.MEDIA_PLAYER_FPS;
                            double d = (double) j;
                            double a2 = abqq.a(currentTimeMillis);
                            Double.isNaN(d);
                            ilv.b(ily, (long) (d / a2));
                        }
                        j += j2;
                        if (j > 0) {
                            twd.a.b((ily) ipc.MEDIA_PLAYER_FRAME_DROP_RATE, (j2 * 100) / j);
                        }
                    }
                    twd.a(a.e, twb.PLAYER_STOP, null, 6);
                    a.a = 0;
                    a.b = 0;
                    a.c = null;
                    break;
                case 5:
                    if (!a.d && txd == txd.FIRST_FRAME) {
                        a.e.b.a(e.PREVIEW_PLAYER_FIRST_FRAME);
                        a.d = true;
                        break;
                    }
                case 6:
                    a.e.b.a(e.PREVIEW_MEDIA_READY);
                    break;
            }
            if (!(a.d || txd == txd.FIRST_FRAME)) {
                a.e.a(txd.name());
            }
            return ajxw.a;
        }
    }

    /* renamed from: txe$j */
    static final class j extends akcq implements akbl<Throwable, ajxw> {
        j(txe txe) {
            super(1, txe);
        }

        public final String getName() {
            return "onPreviewPlayerError";
        }

        public final akej getOwner() {
            return akde.a(txe.class);
        }

        public final String getSignature() {
            return "onPreviewPlayerError(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "p1");
            txe.a((txe) this.receiver);
            return ajxw.a;
        }
    }

    /* renamed from: txe$g */
    static final class g extends akcq implements akbk<ajxw> {
        g(txe txe) {
            super(0, txe);
        }

        public final String getName() {
            return "onDisposed";
        }

        public final akej getOwner() {
            return akde.a(txe.class);
        }

        public final String getSignature() {
            return "onDisposed()V";
        }

        public final /* synthetic */ Object invoke() {
            txe txe = (txe) this.receiver;
            synchronized (txe.c) {
                txe.c.set(true);
            }
            txi txi = txe.e;
            if (txi == null) {
                akcr.a("previewMediaPlayer");
            }
            txi.c.dispose();
            txi.b.dispose();
            txi.a((a) txl.a.RELEASE, absy.VOID);
            return ajxw.a;
        }
    }

    /* renamed from: txe$e */
    static final class e<T> implements ajfb<Boolean> {
        private /* synthetic */ txe a;

        e(txe txe) {
            this.a = txe;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            synchronized (this.a.b) {
                AtomicBoolean atomicBoolean = this.a.b;
                akcr.a(obj, Property.VISIBLE);
                atomicBoolean.set(obj.booleanValue());
                if (obj.booleanValue()) {
                    txe txe = this.a;
                    ajdx ajdx = txe.h.b;
                    zfw zfw = txe.d;
                    if (zfw == null) {
                        akcr.a("schedulers");
                    }
                    ajej a = ajdx.a((ajdw) zfw.h()).e((ajfc) new h(txe)).a((ajev) i.a, (ajfb) new txg(new j(txe)));
                    akcr.a((Object) a, "previewDataSource.mediaP…is::onPreviewPlayerError)");
                    ajvv.a(a, txe.a);
                } else {
                    this.a.b().a((a) b.STOP, Boolean.valueOf(this.a.g));
                }
            }
        }
    }

    /* renamed from: txe$h */
    static final class h<T, R> implements ajfc<List<? extends abyi>, ajdb> {
        final /* synthetic */ txe a;

        /* renamed from: txe$h$1 */
        static final class 1<T, R> implements ajfc<ajxm<? extends List<? extends abyi>, ? extends abbd>, ajdb> {
            final /* synthetic */ h a;

            1(h hVar) {
                this.a = hVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                ajxm ajxm = (ajxm) obj;
                akcr.b(ajxm, "<name for destructuring parameter 0>");
                final List list = (List) ajxm.a;
                return ajcx.b((Callable) new Callable<Object>(this) {
                    private /* synthetic */ 1 a;

                    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:41:0x00ed in {10, 14, 17, 18, 21, 24, 27, 28, 30, 34, 38, 40} preds:[]
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
                    public final /* synthetic */ java.lang.Object call() {
                        /*
                        r6 = this;
                        r0 = r6.a;	 Catch:{ all -> 0x00eb }
                        r0 = r0.a;	 Catch:{ all -> 0x00eb }
                        r0 = r0.a;	 Catch:{ all -> 0x00eb }
                        r0 = r0.b;	 Catch:{ all -> 0x00eb }
                        monitor-enter(r0);	 Catch:{ all -> 0x00eb }
                        r1 = r6.a;	 Catch:{ all -> 0x00e8 }
                        r1 = r1.a;	 Catch:{ all -> 0x00e8 }
                        r1 = r1.a;	 Catch:{ all -> 0x00e8 }
                        r1 = r1.b;	 Catch:{ all -> 0x00e8 }
                        r1 = r1.get();	 Catch:{ all -> 0x00e8 }
                        if (r1 == 0) goto L_0x00e4;	 Catch:{ all -> 0x00e8 }
                        r1 = r6.a;	 Catch:{ all -> 0x00e8 }
                        r1 = r1.a;	 Catch:{ all -> 0x00e8 }
                        r1 = r1.a;	 Catch:{ all -> 0x00e8 }
                        r1 = r1.b();	 Catch:{ all -> 0x00e8 }
                        r2 = r2;	 Catch:{ all -> 0x00e8 }
                        r3 = "media";	 Catch:{ all -> 0x00e8 }
                        defpackage.akcr.a(r2, r3);	 Catch:{ all -> 0x00e8 }
                        r3 = r6.a;	 Catch:{ all -> 0x00e8 }
                        r3 = r3.a;	 Catch:{ all -> 0x00e8 }
                        r3 = r3.a;	 Catch:{ all -> 0x00e8 }
                        r3 = r3.h;	 Catch:{ all -> 0x00e8 }
                        r3 = r3.e();	 Catch:{ all -> 0x00e8 }
                        r4 = "mediaPackageList";	 Catch:{ all -> 0x00e8 }
                        defpackage.akcr.b(r2, r4);	 Catch:{ all -> 0x00e8 }
                        r4 = "startUpConfig";	 Catch:{ all -> 0x00e8 }
                        defpackage.akcr.b(r3, r4);	 Catch:{ all -> 0x00e8 }
                        r4 = r2;	 Catch:{ all -> 0x00e8 }
                        r4 = (java.util.Collection) r4;	 Catch:{ all -> 0x00e8 }
                        r4 = r4.isEmpty();	 Catch:{ all -> 0x00e8 }
                        r5 = 1;	 Catch:{ all -> 0x00e8 }
                        r4 = r4 ^ r5;	 Catch:{ all -> 0x00e8 }
                        if (r4 == 0) goto L_0x00d6;	 Catch:{ all -> 0x00e8 }
                        r1.r = r3;	 Catch:{ all -> 0x00e8 }
                        r1.t = r2;	 Catch:{ all -> 0x00e8 }
                        r2 = r1.t;	 Catch:{ all -> 0x00e8 }
                        if (r2 != 0) goto L_0x0056;	 Catch:{ all -> 0x00e8 }
                        r3 = "playList";	 Catch:{ all -> 0x00e8 }
                        defpackage.akcr.a(r3);	 Catch:{ all -> 0x00e8 }
                        r2 = (java.lang.Iterable) r2;	 Catch:{ all -> 0x00e8 }
                        r3 = new java.util.ArrayList;	 Catch:{ all -> 0x00e8 }
                        r4 = 10;	 Catch:{ all -> 0x00e8 }
                        r4 = defpackage.ajyn.a(r2, r4);	 Catch:{ all -> 0x00e8 }
                        r3.<init>(r4);	 Catch:{ all -> 0x00e8 }
                        r3 = (java.util.Collection) r3;	 Catch:{ all -> 0x00e8 }
                        r2 = r2.iterator();	 Catch:{ all -> 0x00e8 }
                        r4 = r2.hasNext();	 Catch:{ all -> 0x00e8 }
                        if (r4 == 0) goto L_0x007b;	 Catch:{ all -> 0x00e8 }
                        r4 = r2.next();	 Catch:{ all -> 0x00e8 }
                        r4 = (defpackage.abyi) r4;	 Catch:{ all -> 0x00e8 }
                        r4 = r4.d;	 Catch:{ all -> 0x00e8 }
                        r3.add(r4);	 Catch:{ all -> 0x00e8 }
                        goto L_0x0069;	 Catch:{ all -> 0x00e8 }
                        r3 = (java.util.List) r3;	 Catch:{ all -> 0x00e8 }
                        r3 = (java.lang.Iterable) r3;	 Catch:{ all -> 0x00e8 }
                        r2 = defpackage.ajyu.m(r3);	 Catch:{ all -> 0x00e8 }
                        r2 = r2.size();	 Catch:{ all -> 0x00e8 }
                        r3 = 0;	 Catch:{ all -> 0x00e8 }
                        if (r2 <= r5) goto L_0x008b;	 Catch:{ all -> 0x00e8 }
                        goto L_0x008c;	 Catch:{ all -> 0x00e8 }
                        r5 = 0;	 Catch:{ all -> 0x00e8 }
                        r1.w = r5;	 Catch:{ all -> 0x00e8 }
                        r2 = r1.t;	 Catch:{ all -> 0x00e8 }
                        if (r2 != 0) goto L_0x0097;	 Catch:{ all -> 0x00e8 }
                        r4 = "playList";	 Catch:{ all -> 0x00e8 }
                        defpackage.akcr.a(r4);	 Catch:{ all -> 0x00e8 }
                        r2 = r2.get(r3);	 Catch:{ all -> 0x00e8 }
                        r2 = (defpackage.abyi) r2;	 Catch:{ all -> 0x00e8 }
                        r2 = r2.b;	 Catch:{ all -> 0x00e8 }
                        r1.u = r2;	 Catch:{ all -> 0x00e8 }
                        r2 = r1.t;	 Catch:{ all -> 0x00e8 }
                        if (r2 != 0) goto L_0x00aa;	 Catch:{ all -> 0x00e8 }
                        r4 = "playList";	 Catch:{ all -> 0x00e8 }
                        defpackage.akcr.a(r4);	 Catch:{ all -> 0x00e8 }
                        r2 = r2.get(r3);	 Catch:{ all -> 0x00e8 }
                        r2 = (defpackage.abyi) r2;	 Catch:{ all -> 0x00e8 }
                        r2 = r2.d;	 Catch:{ all -> 0x00e8 }
                        r1.v = r2;	 Catch:{ all -> 0x00e8 }
                        r2 = defpackage.txl.c.START;	 Catch:{ all -> 0x00e8 }
                        r2 = (defpackage.absz.a) r2;	 Catch:{ all -> 0x00e8 }
                        r4 = r1.t;	 Catch:{ all -> 0x00e8 }
                        if (r4 != 0) goto L_0x00c1;	 Catch:{ all -> 0x00e8 }
                        r5 = "playList";	 Catch:{ all -> 0x00e8 }
                        defpackage.akcr.a(r5);	 Catch:{ all -> 0x00e8 }
                        r3 = r4.get(r3);	 Catch:{ all -> 0x00e8 }
                        r1.a(r2, r3);	 Catch:{ all -> 0x00e8 }
                        r1 = r6.a;	 Catch:{ all -> 0x00e8 }
                        r1 = r1.a;	 Catch:{ all -> 0x00e8 }
                        r1 = r1.a;	 Catch:{ all -> 0x00e8 }
                        r1 = r1.b();	 Catch:{ all -> 0x00e8 }
                        r1.n();	 Catch:{ all -> 0x00e8 }
                        goto L_0x00e4;	 Catch:{ all -> 0x00e8 }
                        r1 = "Check failed.";	 Catch:{ all -> 0x00e8 }
                        r2 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x00e8 }
                        r1 = r1.toString();	 Catch:{ all -> 0x00e8 }
                        r2.<init>(r1);	 Catch:{ all -> 0x00e8 }
                        r2 = (java.lang.Throwable) r2;	 Catch:{ all -> 0x00e8 }
                        throw r2;	 Catch:{ all -> 0x00e8 }
                        monitor-exit(r0);	 Catch:{ all -> 0x00eb }
                        r0 = defpackage.ajxw.a;
                        return r0;
                        r1 = move-exception;
                        monitor-exit(r0);	 Catch:{ all -> 0x00eb }
                        throw r1;	 Catch:{ all -> 0x00eb }
                        r0 = move-exception;
                        throw r0;
                        return;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.txe$h$1$1.call():java.lang.Object");
                    }
                });
            }
        }

        h(txe txe) {
            this.a = txe;
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (List) obj;
            akcr.b(obj, "media");
            obj = ajdx.b(obj);
            akcr.a(obj, "Single.just(media)");
            Object e = this.a.h.f.e();
            akcr.a(e, "previewDataSource.mediaO…Observable.firstOrError()");
            return ajwd.a(obj, (ajeb) e).e((ajfc) new 1(this));
        }
    }

    /* renamed from: txe$i */
    static final class i implements ajev {
        public static final i a = new i();

        i() {
        }

        public final void run() {
        }
    }

    /* renamed from: txe$f */
    static final class f<T> implements ajfb<Boolean> {
        private /* synthetic */ txe a;

        f(txe txe) {
            this.a = txe;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            txe txe = this.a;
            akcr.a(obj, "it");
            txe.g = obj.booleanValue();
        }
    }

    /* renamed from: txe$a */
    static final class a<V> implements Callable<Object> {
        private /* synthetic */ txe a;

        a(txe txe) {
            this.a = txe;
        }

        public final /* synthetic */ Object call() {
            Toast.makeText(this.a.k, R.string.snap_failed, 1).show();
            this.a.j.a(ajxw.a);
            return ajxw.a;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(txe.class), "previewPlayerMetricsPlugin", "getPreviewPlayerMetricsPlugin()Lcom/snap/preview/player/PreviewPlayerMetricsPlugin;");
    }

    public txe(ajwy<txi> ajwy, tvd tvd, twd twd, zgb zgb, toc toc, tpj tpj, ajdv<ajxw> ajdv, ajdp<Boolean> ajdp, ajdp<Boolean> ajdp2, ajdv<ajxw> ajdv2, Context context) {
        akcr.b(ajwy, "previewMediaPlayerLazy");
        akcr.b(tvd, "previewDataSource");
        akcr.b(twd, "previewMetricsPlugin");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(toc, "previewFeature");
        akcr.b(tpj, "previewPreloadedConfigs");
        akcr.b(ajdv, "playerFirstFrameObserver");
        akcr.b(ajdp, "previewVisibleObservable");
        akcr.b(ajdp2, "navigatingToNonCameraPageObservable");
        akcr.b(ajdv2, "exitPreviewRequestObserver");
        akcr.b(context, "context");
        this.m = ajwy;
        this.h = tvd;
        this.n = zgb;
        this.o = toc;
        this.p = tpj;
        this.i = ajdv;
        this.q = ajdp;
        this.r = ajdp2;
        this.j = ajdv2;
        this.k = context;
        this.l = ajxh.a(new b(twd));
    }

    public static final /* synthetic */ void a(txe txe) {
        ajei ajei = txe.a;
        ajcx b = ajcx.b((Callable) new a(txe));
        zfw zfw = txe.d;
        if (zfw == null) {
            akcr.a("schedulers");
        }
        ajei.a(b.b((ajdw) zfw.l()).e());
    }

    /* Access modifiers changed, original: final */
    public final txo a() {
        return (txo) this.l.b();
    }

    public final txi b() {
        txi txi = this.e;
        if (txi == null) {
            akcr.a("previewMediaPlayer");
        }
        return txi;
    }

    public final ajej start() {
        this.d = zgb.a(this.o.callsite("PlayerActivator"));
        Object obj = this.m.get();
        akcr.a(obj, "previewMediaPlayerLazy.get()");
        this.e = (txi) obj;
        txi txi = this.e;
        String str = "previewMediaPlayer";
        if (txi == null) {
            akcr.a(str);
        }
        Context context = this.k;
        tpj tpj = this.p;
        txo a = a();
        txe txe = this;
        akbl cVar = new c(txe);
        akcr.b(context, "context");
        akcr.b(tpj, "previewPreloadedConfigs");
        akcr.b(a, "previewPlayerMetricsPlugin");
        akcr.b(cVar, "errorHandler");
        txi.g = context;
        txi.h = cVar;
        txi.i = a;
        txi.s = tpj;
        abta.b.a nVar = new n(txi);
        ajfb oVar = new o(txi, a);
        Runnable pVar = new p(txi, a);
        Runnable qVar = new q(txi, a);
        Runnable rVar = new r(txi, a);
        Runnable sVar = new s(txi, a);
        ajfb tVar = new t(txi, a);
        Runnable uVar = new u(txi, a);
        akcr.b(nVar, "disposableRegisterer");
        akcr.b(oVar, "onStartConsumer");
        akcr.b(pVar, "onPendingPlayRunnable");
        akcr.b(qVar, "onReadyRunnable");
        akcr.b(rVar, "onPlayRunnable");
        akcr.b(sVar, "onPauseRunnable");
        akcr.b(tVar, "onStopConsumer");
        akcr.b(uVar, "onReleaseRunnable");
        abta.a a2 = abta.a(d.IDLE, nVar);
        a2.a(d.IDLE, (a) c.START, d.PREPARING).a(oVar);
        a2.a(d.PREPARING, (a) txl.a.PLAY, d.PENDING_TO_PLAY).a(pVar);
        a2.a(d.PREPARING, (a) txl.a.PREPARE_COMPLETE, d.READY).a(qVar);
        a2.a(d.PREPARING, (a) b.STOP, d.STOPPED).a(tVar);
        a2.a(d.PENDING_TO_PLAY, (a) txl.a.PREPARE_COMPLETE, d.PLAYING).a(rVar);
        a2.a(d.PENDING_TO_PLAY, (a) b.STOP, d.STOPPED).a(tVar);
        a2.a(d.READY, (a) txl.a.PLAY, d.PLAYING).a(rVar);
        a2.a(d.READY, (a) b.STOP, d.STOPPED).a(tVar);
        a2.a(d.PLAYING, (a) txl.a.PAUSE, d.READY).a(sVar);
        a2.a(d.PLAYING, (a) b.STOP, d.STOPPED).a(tVar);
        a2.a(d.STOPPED, (a) c.START, d.PREPARING).a(oVar);
        a2.a(d.STOPPED, (a) txl.a.RELEASE, d.RELEASED).a(uVar);
        Object a3 = a2.a("PreviewMediaPlayerStateMachineBuilder");
        akcr.a(a3, "builder.build(TAG)");
        txi.H = a3;
        txi.c().h().a((Runnable) new v(txi));
        txi = this.e;
        if (txi == null) {
            akcr.a(str);
        }
        ajej f = txi.p.f((ajfb) new txg(new d(txe)));
        akcr.a((Object) f, "previewMediaPlayer.getPl…be(this::onPlaybackState)");
        ajvv.a(f, this.a);
        f = this.q.j(ajfu.a).f((ajfb) new e(this));
        akcr.a((Object) f, "previewVisibleObservable…\n\n            }\n        }");
        ajvv.a(f, this.a);
        f = this.r.f((ajfb) new f(this));
        akcr.a((Object) f, "navigatingToNonCameraPag…ingToNonCameraPage = it }");
        ajvv.a(f, this.a);
        this.a.a(ajek.a((ajev) new txf(new g(txe))));
        a().e.a("PLAYER_ACTIVATOR_LOADED");
        return this.a;
    }
}
