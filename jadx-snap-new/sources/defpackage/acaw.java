package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Process;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.acaz.c;
import defpackage.acaz.d;
import defpackage.acaz.e;
import defpackage.acaz.f;
import defpackage.acaz.g;
import defpackage.acaz.h;
import defpackage.acaz.i;
import defpackage.adgw.a;
import defpackage.adkg.b;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: acaw */
public final class acaw implements acay, b {
    private adko A;
    private c B;
    private c C;
    private ListenableFuture<?> D;
    private volatile Uri E;
    private final adnj F;
    private final dib G;
    private final ilv H;
    private final adge I;
    final Object a;
    final ajxe b;
    final ajwo<Boolean> c;
    final AtomicReference<f> d;
    adiv e;
    adie f;
    adfh g;
    f h;
    i i;
    volatile adgw j;
    volatile int k;
    volatile int l;
    volatile long m;
    volatile boolean n;
    volatile boolean o;
    volatile boolean p;
    private final ajxe q = ajxh.a(g.a);
    private final ajxe r;
    private final ajxe s;
    private final ajei t;
    private final ajei u;
    private final ajxe v;
    private final ajxe w;
    private final ajxe x;
    private final ajxe y;
    private final ajwo<Boolean> z;

    /* renamed from: acaw$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: acaw$e */
    final class e implements ThreadFactory {
        private final ThreadFactory a = Executors.defaultThreadFactory();

        /* renamed from: acaw$e$a */
        static final class a implements UncaughtExceptionHandler {
            public static final a a = new a();

            a() {
            }

            public final void uncaughtException(Thread thread, Throwable th) {
            }
        }

        /* renamed from: acaw$e$b */
        static final class b implements Runnable {
            private /* synthetic */ Runnable a;

            b(Runnable runnable) {
                this.a = runnable;
            }

            public final void run() {
                Process.setThreadPriority(-1);
                this.a.run();
            }
        }

        public final Thread newThread(Runnable runnable) {
            akcr.b(runnable, "runnable");
            Object newThread = this.a.newThread(new b(runnable));
            akcr.a(newThread, "thread");
            newThread.setName("AdvancedScMediaPlayer");
            newThread.setUncaughtExceptionHandler(a.a);
            return newThread;
        }
    }

    /* renamed from: acaw$f */
    public enum f {
        INVALID,
        CONFIGURED,
        PREPARING,
        PREPARED,
        PLAYING,
        PAUSED,
        STOPPED,
        RELEASED
    }

    /* renamed from: acaw$a */
    public static final class a<T1, T2, R> implements ajex<T1, T2, R> {
        public final R apply(T1 t1, T2 t2) {
            Object obj = (Boolean) t2;
            boolean booleanValue = ((Boolean) t1).booleanValue();
            akcr.a(obj, "mediaSourceReady");
            return Boolean.valueOf(booleanValue & obj.booleanValue());
        }
    }

    /* renamed from: acaw$c */
    final class c extends adma {
        private final Object a = new Object();

        public c() {
            super(null, null);
        }

        private final void b() {
            try {
                synchronized (acaw.this.a) {
                    acaw.a(acaw.this).a(acaw.b(acaw.this));
                    acaw.a(acaw.this).a(acaw.this.p);
                    acaw.a(acaw.this).d();
                }
                acaw.this.s().a();
                acaw.a(acaw.this).j();
                acaw.this.s().b();
            } catch (Throwable th) {
                acaw.this.s().b();
            }
        }

        public final defpackage.adma.c a() {
            synchronized (this.a) {
                a(defpackage.adma.c.ABORTED);
            }
            synchronized (acaw.this.a) {
                acaw.a(acaw.this).c(acaw.this.n);
            }
            return defpackage.adma.c.RUNNING;
        }

        public final void a(adma.b bVar) {
            try {
                synchronized (this.a) {
                    if (g() != defpackage.adma.c.ABORTED) {
                        a(defpackage.adma.c.RUNNING);
                        b();
                        return;
                    }
                }
            } catch (adkc e) {
                acaw.this.c(4);
                throw new adkc("Unexpected exception during playback.", e);
            }
        }
    }

    /* renamed from: acaw$d */
    final class d implements admb {
        private final ListeningExecutorService a;

        public d() {
            Object listeningDecorator = MoreExecutors.listeningDecorator(Executors.newSingleThreadExecutor(new e()));
            akcr.a(listeningDecorator, "MoreExecutors.listeningD…r(RenderThreadFactory()))");
            this.a = listeningDecorator;
        }

        public final <T extends adma> ListenableFuture<T> a(T t) {
            akcr.b(t, "task");
            Object submit = this.a.submit((Runnable) t, t);
            akcr.a(submit, "mExecutorService.submit(task, task)");
            return submit;
        }

        public final void b(adma adma) {
            akcr.b(adma, "task");
            try {
                adma.a();
            } catch (RuntimeException e) {
                throw new adkc(e.toString(), e);
            }
        }
    }

    /* renamed from: acaw$i */
    static final class i<T> implements ajfb<Boolean> {
        private /* synthetic */ acaw a;
        private /* synthetic */ boolean b = true;
        private /* synthetic */ boolean c = false;
        private /* synthetic */ boolean d = false;

        i(acaw acaw, boolean z, boolean z2, boolean z3) {
            this.a = acaw;
        }

        /* JADX WARNING: Missing block: B:12:0x001e, code skipped:
            return;
     */
        public final /* synthetic */ void accept(java.lang.Object r5) {
            /*
            r4 = this;
            r5 = r4.a;
            r0 = r5.a;
            monitor-enter(r0);
            r1 = r5.d;	 Catch:{ all -> 0x001f }
            r2 = defpackage.acaw.f.PREPARING;	 Catch:{ all -> 0x001f }
            r3 = defpackage.acaw.f.PREPARED;	 Catch:{ all -> 0x001f }
            r1 = r1.compareAndSet(r2, r3);	 Catch:{ all -> 0x001f }
            if (r1 != 0) goto L_0x0013;
        L_0x0011:
            monitor-exit(r0);
            return;
        L_0x0013:
            r1 = r5.o;	 Catch:{ all -> 0x001f }
            if (r1 == 0) goto L_0x001d;
        L_0x0017:
            r1 = 0;
            r5.o = r1;	 Catch:{ all -> 0x001f }
            r5.z();	 Catch:{ all -> 0x001f }
        L_0x001d:
            monitor-exit(r0);
            return;
        L_0x001f:
            r5 = move-exception;
            monitor-exit(r0);
            throw r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.acaw$i.accept(java.lang.Object):void");
        }
    }

    /* renamed from: acaw$j */
    static final class j<T> implements ajfl<Boolean> {
        public static final j a = new j();

        j() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "ready");
            return bool.booleanValue();
        }
    }

    /* renamed from: acaw$n */
    static final class n<T, R> implements ajfc<T, ajdt<? extends R>> {
        final /* synthetic */ acaw a;

        /* renamed from: acaw$n$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ n a;

            1(n nVar) {
                this.a = nVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((Boolean) obj, "it");
                return ajdp.b(acaw.b(this.a.a));
            }
        }

        /* renamed from: acaw$n$2 */
        static final class 2<T, R> implements ajfc<T, ajdt<? extends R>> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((Boolean) obj, "it");
                return ajvo.a(ajot.a);
            }
        }

        n(acaw acaw) {
            this.a = acaw;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajdp ajdp;
            1 1;
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "ready");
            if (bool.booleanValue()) {
                ajdp = this.a.c;
                1 = new 1(this);
            } else {
                ajdp = this.a.c;
                1 = 2.a;
            }
            return ajdp.k((ajfc) 1);
        }
    }

    /* renamed from: acaw$p */
    static final class p implements ajev {
        private /* synthetic */ acaw a;

        p(acaw acaw) {
            this.a = acaw;
        }

        public final void run() {
            f fVar = this.a.h;
            if (fVar != null) {
                fVar.onPrepared(this.a);
            }
            i iVar = this.a.i;
            if (iVar != null) {
                acaw acaw = this.a;
                iVar.b(acaw, acaw.k, this.a.l);
            }
            abyd.a.incrementAndGet();
        }
    }

    /* renamed from: acaw$q */
    static final class q<T> implements ajfb<Throwable> {
        private /* synthetic */ acaw a;

        q(acaw acaw) {
            this.a = acaw;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Throwable) obj;
            acaw acaw = this.a;
            akcr.a(obj, "it");
            acaw.c(3);
        }
    }

    /* renamed from: acaw$r */
    static final class r<T> implements ajfb<adgw> {
        private /* synthetic */ acaw a;

        r(acaw acaw) {
            this.a = acaw;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (adgw) obj;
            acaw acaw = this.a;
            akcr.a(obj, "videoFileMediaSource");
            acaw.j = obj;
            this.a.c.a(Boolean.TRUE);
        }
    }

    /* renamed from: acaw$s */
    static final class s<T> implements ajfb<Throwable> {
        private /* synthetic */ acaw a;

        s(acaw acaw) {
            this.a = acaw;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Throwable) obj;
            acaw acaw = this.a;
            akcr.a(obj, "it");
            acaw.c(2);
        }
    }

    /* renamed from: acaw$t */
    static final class t<T> implements ajea<T> {
        private /* synthetic */ acaw a;

        t(acaw acaw) {
            this.a = acaw;
        }

        public final void subscribe(ajdy<adgw> ajdy) {
            akcr.b(ajdy, "singleEmitter");
            if (!ajdy.isDisposed()) {
                if (acaw.c(this.a) == null) {
                    if (!ajdy.isDisposed()) {
                        ajdy.a((Throwable) new IllegalArgumentException("Video uri is null"));
                    }
                    return;
                }
                if (this.a.e == null) {
                    this.a.e = new adii();
                }
                if (this.a.f == null) {
                    this.a.f = new adie();
                }
                acaw acaw = this.a;
                Uri c = acaw.c(acaw);
                adie adie = this.a.f;
                if (adie == null) {
                    akcr.a();
                }
                adiv adiv = this.a.e;
                if (adiv == null) {
                    akcr.a();
                }
                akcr.b(c, MessageMediaRefModel.URI);
                akcr.b(adie, "transformation");
                akcr.b(adiv, "renderPass");
                boolean d = acaw.t().d(c);
                String path = c.getPath();
                ajdy.a((Object) new adgw(path, adie, adiv, adgw.b.ORIGINAL, d ? a.ORIGINAL : a.DISABLED, ((adnv) acaw.b.b()).a(path, adno.ADVANCED_SC_MEDIA_PLAYER), acaw.g));
            }
        }
    }

    /* renamed from: acaw$u */
    static final class u implements ajda {
        private /* synthetic */ acaw a;

        u(acaw acaw) {
            this.a = acaw;
        }

        public final void subscribe(ajcy ajcy) {
            akcr.b(ajcy, "completableEmitter");
            if (!ajcy.isDisposed()) {
                if (acaw.c(this.a) == null) {
                    if (!ajcy.isDisposed()) {
                        ajcy.a((Throwable) new IllegalStateException("Video uri is null"));
                    }
                    return;
                }
                abtl b = this.a.t().b(acaw.c(this.a));
                akcr.a((Object) b, "metadataFetcher.getResolution(videoUri)");
                int c = this.a.t().c(acaw.c(this.a));
                if (c == 90 || c == 270) {
                    b = b.a();
                    akcr.a((Object) b, "videoResolution.transpose()");
                }
                this.a.k = b.b();
                this.a.l = b.c();
                acaw acaw = this.a;
                acaw.m = (long) acaw.t().a(acaw.c(this.a));
                ajcy.a();
            }
        }
    }

    /* renamed from: acaw$g */
    static final class g extends akcs implements akbk<adfa> {
        public static final g a = new g();

        g() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return adfa.a;
        }
    }

    /* renamed from: acaw$h */
    static final class h extends akcs implements akbk<kpc> {
        private /* synthetic */ ajwy a;

        h(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (kpc) this.a.get();
        }
    }

    /* renamed from: acaw$k */
    static final class k extends akcs implements akbk<adkg> {
        private /* synthetic */ acaw a;

        k(acaw acaw) {
            this.a = acaw;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            acaw acaw = this.a;
            return new adkg(acaw, acaw.r());
        }
    }

    /* renamed from: acaw$l */
    static final class l extends akcs implements akbk<adhi> {
        private /* synthetic */ abss a;

        l(abss abss) {
            this.a = abss;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new adhi(this.a.c());
        }
    }

    /* renamed from: acaw$m */
    static final class m extends akcs implements akbk<acbl> {
        private /* synthetic */ ajwy a;

        m(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (acbl) this.a.get();
        }
    }

    /* renamed from: acaw$o */
    static final class o extends akcs implements akbl<Integer, abyh> {
        static {
            o oVar = new o();
        }

        o() {
            super(1);
        }

        public static abyh a(int i) {
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? abyh.MEDIA_ERROR_PLAYBACK : abyh.MEDIA_ERROR_RUNTIME : abyh.MEDIA_ERROR_RENDERER : abyh.MEDIA_ERROR_SOURCE : abyh.MEDIA_ERROR_SOURCE : abyh.MEDIA_ERROR_PLAYBACK;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return o.a(((Number) obj).intValue());
        }
    }

    /* renamed from: acaw$v */
    static final class v extends akcs implements akbk<adnv> {
        private /* synthetic */ ajwy a;

        v(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (adnv) this.a.get();
        }
    }

    /* renamed from: acaw$w */
    static final class w extends akcs implements akbk<zfw> {
        private /* synthetic */ acaw a;
        private /* synthetic */ zgb b;

        w(acaw acaw, zgb zgb) {
            this.a = acaw;
            this.b = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(this.a.q().callsite("AdvancedScMediaPlayer"));
        }
    }

    /* renamed from: acaw$x */
    static final class x extends akcs implements akbk<d> {
        private /* synthetic */ acaw a;

        x(acaw acaw) {
            this.a = acaw;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new d();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(acaw.class), "attributedFeature", "getAttributedFeature()Lcom/snap/framework/attribution/AttributedFeature;"), new akdc(akde.a(acaw.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(acaw.class), "egl14Wrapper", "getEgl14Wrapper()Lcom/snapchat/mediaengine/opengl/EGL14Wrapper;"), new akdc(akde.a(acaw.class), "deadlockDetector", "getDeadlockDetector()Lcom/snapchat/mediaengine/player/DeadlockDetector;"), new akdc(akde.a(acaw.class), "taskExecutor", "getTaskExecutor()Lcom/snapchat/mediaengine/task/TaskExecutor;"), new akdc(akde.a(acaw.class), "metadataFetcher", "getMetadataFetcher()Lcom/snapchat/android/media/video/VideoMetadataFetcher;"), new akdc(akde.a(acaw.class), "codecLeasingEngine", "getCodecLeasingEngine()Lcom/snap/leasingengine/engine/CodecLeasingEngine;"), new akdc(akde.a(acaw.class), "rewindVideoCapabilityDetector", "getRewindVideoCapabilityDetector()Lcom/snapchat/mediaengine/utils/RewindVideoCapabilityDetector;")};
        b bVar = new b();
    }

    public acaw(adnj adnj, dib dib, ilv ilv, adge adge, zgb zgb, abss abss, ajwy<acbl> ajwy, ajwy<adnv> ajwy2, ajwy<kpc> ajwy3) {
        akcr.b(adnj, "mediaEngineResources");
        akcr.b(dib, "blizzardEventLogger");
        akcr.b(ilv, "graphene");
        akcr.b(adge, "mediaEngineConfiguration");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(abss, "releaseManager");
        akcr.b(ajwy, "androidVideoMetadataFetcher");
        akcr.b(ajwy2, "rewindVideoCapabilityDetector");
        akcr.b(ajwy3, "codecLeasingEngineProvider");
        this.F = adnj;
        this.G = dib;
        this.H = ilv;
        this.I = adge;
        this.r = ajxh.a(new w(this, zgb));
        this.s = ajxh.a(new l(abss));
        this.t = new ajei();
        this.u = new ajei();
        this.a = new Object();
        this.v = ajxh.a(new k(this));
        this.w = ajxh.a(new x(this));
        this.x = ajxh.a(new m(ajwy));
        this.y = ajxh.a(new h(ajwy3));
        this.b = ajxh.a(new v(ajwy2));
        Object ajwo = new ajwo();
        String str = "PublishSubject.create<Boolean>()";
        akcr.a(ajwo, str);
        this.c = ajwo;
        ajwo = new ajwo();
        akcr.a(ajwo, str);
        this.z = ajwo;
        this.d = new AtomicReference(f.INVALID);
    }

    private final admb A() {
        return (admb) this.w.b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032 A:{Catch:{ CancellationException | ExecutionException -> 0x0044, TimeoutException -> 0x003c }} */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002a A:{SYNTHETIC, Splitter:B:14:0x002a} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003c */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|8|(2:12|(2:14|15)(1:16))) */
    private final void a(long r4, boolean r6) {
        /*
        r3 = this;
        r0 = r3.a;
        monitor-enter(r0);
        r1 = r3.u;	 Catch:{ all -> 0x004d }
        r1.a();	 Catch:{ all -> 0x004d }
        r1 = 0;
        r3.o = r1;	 Catch:{ all -> 0x004d }
        r3.n = r6;	 Catch:{ all -> 0x004d }
        r6 = r3.C;	 Catch:{ all -> 0x004d }
        if (r6 == 0) goto L_0x0044;
    L_0x0011:
        r6 = r3.A();	 Catch:{ adkc -> 0x001c }
        r1 = r3.C;	 Catch:{ adkc -> 0x001c }
        r1 = (defpackage.adma) r1;	 Catch:{ adkc -> 0x001c }
        r6.b(r1);	 Catch:{ adkc -> 0x001c }
    L_0x001c:
        r6 = r3.D;	 Catch:{ all -> 0x004d }
        if (r6 == 0) goto L_0x0044;
    L_0x0020:
        r1 = 0;
        r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1));
        if (r6 == 0) goto L_0x0044;
    L_0x0026:
        r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1));
        if (r6 >= 0) goto L_0x0032;
    L_0x002a:
        r4 = r3.D;	 Catch:{ CancellationException | ExecutionException -> 0x0044, CancellationException | ExecutionException -> 0x0044, TimeoutException -> 0x003c }
        r4 = (java.util.concurrent.Future) r4;	 Catch:{ CancellationException | ExecutionException -> 0x0044, CancellationException | ExecutionException -> 0x0044, TimeoutException -> 0x003c }
        com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(r4);	 Catch:{ CancellationException | ExecutionException -> 0x0044, CancellationException | ExecutionException -> 0x0044, TimeoutException -> 0x003c }
        goto L_0x0044;
    L_0x0032:
        r6 = r3.D;	 Catch:{ CancellationException | ExecutionException -> 0x0044, CancellationException | ExecutionException -> 0x0044, TimeoutException -> 0x003c }
        r6 = (java.util.concurrent.Future) r6;	 Catch:{ CancellationException | ExecutionException -> 0x0044, CancellationException | ExecutionException -> 0x0044, TimeoutException -> 0x003c }
        r1 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ CancellationException | ExecutionException -> 0x0044, CancellationException | ExecutionException -> 0x0044, TimeoutException -> 0x003c }
        com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(r6, r4, r1);	 Catch:{ CancellationException | ExecutionException -> 0x0044, CancellationException | ExecutionException -> 0x0044, TimeoutException -> 0x003c }
        goto L_0x0044;
    L_0x003c:
        r4 = r3.D;	 Catch:{ all -> 0x004d }
        if (r4 == 0) goto L_0x0044;
    L_0x0040:
        r5 = 1;
        r4.cancel(r5);	 Catch:{ all -> 0x004d }
    L_0x0044:
        r4 = r3.d;	 Catch:{ all -> 0x004d }
        r5 = defpackage.acaw.f.STOPPED;	 Catch:{ all -> 0x004d }
        r4.set(r5);	 Catch:{ all -> 0x004d }
        monitor-exit(r0);
        return;
    L_0x004d:
        r4 = move-exception;
        monitor-exit(r0);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acaw.a(long, boolean):void");
    }

    public final void a() {
        f fVar = (f) this.d.get();
        if (fVar != null) {
            int i = acax.a[fVar.ordinal()];
            if (i == 1) {
                this.o = true;
                return;
            } else if (i == 2) {
                z();
                return;
            } else if (i == 3) {
                synchronized (this.a) {
                    adko adko = this.A;
                    if (adko == null) {
                        akcr.a("mediaPlayer");
                    }
                    if (adko.i()) {
                        adko = this.A;
                        if (adko == null) {
                            akcr.a("mediaPlayer");
                        }
                        adko.g();
                        this.d.set(f.PLAYING);
                    }
                }
                return;
            } else if (i == 4) {
                return;
            }
        }
        StringBuilder stringBuilder = new StringBuilder("The player can't get start in ");
        stringBuilder.append((f) this.d.get());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final void a(double d) {
        synchronized (this.a) {
            adko adko = this.A;
            if (adko == null) {
                akcr.a("mediaPlayer");
            }
            adko.a(d);
        }
    }

    public final void a(float f, float f2) {
        synchronized (this.a) {
            f = (f + f2) / 2.0f;
            adko adko = this.A;
            if (adko == null) {
                akcr.a("mediaPlayer");
            }
            adko.a(f);
        }
    }

    public final void a(int i) {
        synchronized (this.a) {
            adko adko = this.A;
            if (adko == null) {
                akcr.a("mediaPlayer");
            }
            adko.b(i);
        }
    }

    public final void a(acaz.a aVar) {
        akcr.b(aVar, "listener");
        throw new UnsupportedOperationException();
    }

    public final void a(acaz.b bVar) {
        akcr.b(bVar, "listener");
        throw new UnsupportedOperationException();
    }

    public final void a(c cVar) {
        this.B = cVar;
    }

    public final void a(d dVar) {
        akcr.b(dVar, "listener");
        throw new UnsupportedOperationException();
    }

    public final void a(e eVar) {
        akcr.b(eVar, "listener");
        throw new UnsupportedOperationException();
    }

    public final void a(f fVar) {
        this.h = fVar;
    }

    public final void a(g gVar) {
        akcr.b(gVar, "listener");
        throw new UnsupportedOperationException();
    }

    public final void a(h hVar) {
        akcr.b(hVar, "listener");
        throw new UnsupportedOperationException();
    }

    public final void a(i iVar) {
        akcr.b(iVar, "listener");
        this.i = iVar;
    }

    public final void a(adfh adfh) {
        akcr.b(adfh, "audioFrameProcessingPass");
        this.g = adfh;
    }

    public final void a(adie adie) {
        akcr.b(adie, "transformationMatrix");
        this.f = adie;
    }

    public final void a(adiv adiv) {
        akcr.b(adiv, "renderPass");
        this.e = adiv;
    }

    public final void a(adkn adkn) {
        synchronized (this.a) {
            adko adko = this.A;
            if (adko == null) {
                akcr.a("mediaPlayer");
            }
            adko.a(adkn);
        }
    }

    public final void a(Context context, Uri uri, Map<String, String> map) {
        akcr.b(context, "context");
        akcr.b(uri, MessageMediaRefModel.URI);
        this.E = uri;
        this.c.a(Boolean.FALSE);
    }

    public final void a(Surface surface) {
        akcr.b(surface, "surface");
        adko adko = this.A;
        if (adko == null) {
            akcr.a("mediaPlayer");
        }
        adko.a(surface);
        this.z.a(Boolean.TRUE);
    }

    public final void a(boolean z) {
        synchronized (this.a) {
            adko adko = this.A;
            if (adko == null) {
                akcr.a("mediaPlayer");
            }
            adko.b(z);
        }
    }

    public final void b() {
        synchronized (this.a) {
            adko adko = this.A;
            if (adko == null) {
                akcr.a("mediaPlayer");
            }
            adko.f();
            this.d.set(f.PAUSED);
        }
    }

    public final void b(int i) {
        throw new UnsupportedOperationException();
    }

    public final void b(boolean z) {
        this.p = z;
    }

    public final void c() {
        synchronized (this.a) {
            ajei ajei = this.u;
            Object b = ajcx.a((ajda) new u(this)).b((ajdw) r().f());
            akcr.a(b, "Completable.create { com…scribeOn(schedulers.io())");
            ajei.a(b.a((ajdw) r().l()).a((ajev) new p(this), (ajfb) new q(this)));
            ajei = this.u;
            b = ajdx.a((ajea) new t(this)).b((ajdw) r().h());
            akcr.a(b, "Single.create { singleEm…dulers.userInteractive())");
            ajei.a(b.a((ajdw) r().h()).a((ajfb) new r(this), (ajfb) new s(this)));
            if (this.d.compareAndSet(f.CONFIGURED, f.PREPARING)) {
            } else {
                StringBuilder stringBuilder = new StringBuilder("prepareAsync error, current state: ");
                stringBuilder.append((f) this.d.get());
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void c(int i) {
        synchronized (this.a) {
            if (i == 2) {
                this.d.compareAndSet(f.PREPARING, f.CONFIGURED);
            }
            c cVar = this.B;
            if (cVar != null) {
                Boolean.valueOf(cVar.a(this, o.a(i)));
            }
        }
    }

    public final void c(boolean z) {
        a(3000, z);
    }

    public final void d() {
        synchronized (this.a) {
            this.l = 0;
            this.k = 0;
            this.m = 0;
            this.o = false;
            this.u.dispose();
            this.t.dispose();
            this.B = null;
            this.h = null;
            this.i = null;
            this.g = null;
            this.e = null;
            this.f = null;
            this.d.set(f.RELEASED);
            abyd.a.decrementAndGet();
        }
    }

    public final void e() {
        synchronized (this.a) {
            c(false);
            this.d.set(f.CONFIGURED);
        }
    }

    public final void f() {
        a(0, false);
    }

    public final int g() {
        return this.k;
    }

    public final int h() {
        return this.l;
    }

    public final boolean i() {
        boolean h;
        synchronized (this.a) {
            adko adko = this.A;
            if (adko == null) {
                akcr.a("mediaPlayer");
            }
            h = adko.h();
        }
        return h;
    }

    public final int j() {
        return (int) this.m;
    }

    public final int k() {
        int a;
        synchronized (this.a) {
            adko adko = this.A;
            if (adko == null) {
                akcr.a("mediaPlayer");
            }
            a = adko.a(1);
        }
        return a;
    }

    public final int l() {
        throw new UnsupportedOperationException();
    }

    public final void m() {
        throw new UnsupportedOperationException();
    }

    public final void n() {
        throw new UnsupportedOperationException();
    }

    public final boolean o() {
        throw new UnsupportedOperationException();
    }

    public final aaun p() {
        return aaun.ADVANCED_SC_MEDIA_PLAYER;
    }

    /* Access modifiers changed, original: final */
    public final ide q() {
        return (ide) this.q.b();
    }

    /* Access modifiers changed, original: final */
    public final zfw r() {
        return (zfw) this.r.b();
    }

    /* Access modifiers changed, original: final */
    public final adkg s() {
        return (adkg) this.v.b();
    }

    /* Access modifiers changed, original: final */
    public final acbl t() {
        return (acbl) this.x.b();
    }

    public final void u() {
        synchronized (this.a) {
            this.A = new adko(q(), this.F, true, false, false, s(), adhl.GLES20, (adhi) this.s.b(), r(), this.H, this.G, (kpc) this.y.b(), this.I);
            adko adko = this.A;
            if (adko == null) {
                akcr.a("mediaPlayer");
            }
            adko.e();
            adko = this.A;
            if (adko == null) {
                akcr.a("mediaPlayer");
            }
            adko.a(1.0f);
            ajei ajei = this.t;
            Object j = this.z.j(ajfu.a);
            akcr.a(j, "isSurfaceReady.distinctUntilChanged()");
            Object j2 = this.c.j(ajfu.a);
            akcr.a(j2, "isMediaSourceReady.distinctUntilChanged()");
            ajdp a = ajdp.a((ajdt) j, (ajdt) j2, (ajex) new a());
            if (a == null) {
                akcr.a();
            }
            ajei.a(a.a((ajfl) j.a).f((ajfb) new i(this, true, false, false)));
            if (this.d.compareAndSet(f.INVALID, f.CONFIGURED)) {
            } else {
                StringBuilder stringBuilder = new StringBuilder("Config player error in ");
                stringBuilder.append((f) this.d.get());
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    public final List<Long> v() {
        List m;
        synchronized (this.a) {
            adko adko = this.A;
            if (adko == null) {
                akcr.a("mediaPlayer");
            }
            m = adko.m();
        }
        return m;
    }

    public final void w() {
        IllegalStateException illegalStateException = new IllegalStateException("Deadlock Detected");
        c(5);
        d();
    }

    public final ajdp<adgw> x() {
        Object k = this.c.k((ajfc) new n(this));
        akcr.a(k, "isMediaSourceReady.flatM…}\n            }\n        }");
        return k;
    }

    public final void y() {
    }

    /* Access modifiers changed, original: final */
    public final void z() {
        synchronized (this.a) {
            adko adko = this.A;
            if (adko == null) {
                akcr.a("mediaPlayer");
            }
            if (!adko.h()) {
                this.C = new c();
                this.D = A().a(this.C);
                this.d.set(f.PLAYING);
            }
        }
    }
}
