package com.snap.media.rendering;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import defpackage.aipp;
import defpackage.ajcx;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajeb;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajev;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajfu;
import defpackage.ajhn;
import defpackage.ajvo;
import defpackage.ajvv;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxm;
import defpackage.ajxs;
import defpackage.ajxt;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.idd;
import defpackage.ide;
import defpackage.idi;
import defpackage.iig;
import defpackage.odl;
import defpackage.odu;
import defpackage.oes;
import defpackage.oew;
import defpackage.oil;
import defpackage.oip;
import defpackage.vjc;
import defpackage.vjd;
import defpackage.vje;
import defpackage.vjf;
import defpackage.vjg;
import defpackage.vji;
import defpackage.vjj;
import defpackage.vjm;
import defpackage.zfg;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zgd;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public final class MediaExportService extends Service {
    public ajwy<zgb> a;
    public ajwy<vji> b;
    public ajwy<odu> c;
    public ajwy<oew> d;
    public ajwy<oil> e;
    public Set<oes> f;
    final AtomicInteger g = new AtomicInteger();
    final ajei h = new ajei();
    vjg i;
    private final ajxe j = ajxh.a(new k(this));
    private NotificationManager k;
    private final ajxe l = ajxh.a(d.a);
    private final ajxe m = ajxh.a(new l(this));
    private final ajxe n = ajxh.a(new e(this));

    public static final class a {

        static final class a extends ide {
            public static final a a = new a();

            private a() {
                super("MediaExportService", idi.APP_PLATFORM);
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class b<V> implements Callable<T> {
        private /* synthetic */ MediaExportService a;
        private /* synthetic */ Intent b;

        b(MediaExportService mediaExportService, Intent intent) {
            this.a = mediaExportService;
            this.b = intent;
        }

        public final /* synthetic */ Object call() {
            Intent intent = this.b;
            Bundle extras = intent != null ? intent.getExtras() : null;
            String str = "Required value was null.";
            if (extras != null) {
                String string = extras.getString("extra_media_package_session_id");
                if (string != null) {
                    Object string2 = extras.getString("extra_export_destination");
                    akcr.a(string2, "extras.getString(EXTRA_EXPORT_DESTINATION)");
                    vjj valueOf = vjj.valueOf(string2);
                    string2 = extras.getString("extra_export_type");
                    akcr.a(string2, "extras.getString(EXTRA_EXPORT_TYPE)");
                    return new oip(MediaExportService.a(this.b), string, valueOf, vjm.valueOf(string2), extras.getString("extra_filename"), extras.getBoolean("extra_show_in_app_notification"), extras.getBoolean("extra_should_notify_listeners"), extras.getString("extra_export_id"));
                }
                throw new IllegalStateException(str.toString());
            }
            throw new IllegalStateException(str.toString());
        }
    }

    public static final class c extends ide {
        private /* synthetic */ List a;

        c(List list, String str, idi idi) {
            this.a = list;
            super(str, idi);
        }
    }

    static final class f<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ MediaExportService a;

        f(MediaExportService mediaExportService) {
            this.a = mediaExportService;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final oip oip = (oip) obj;
            akcr.b(oip, "params");
            ajwy ajwy = this.a.c;
            if (ajwy == null) {
                akcr.a("mediaPackageManager");
            }
            return ((odu) ajwy.get()).b(oip.a, oip.b).f(new ajfc<T, R>(this) {
                private /* synthetic */ f a;

                /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x006c in {3, 7, 9} preds:[]
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
                public final /* synthetic */ java.lang.Object apply(java.lang.Object r8) {
                    /*
                    r7 = this;
                    r8 = (com.google.common.base.Optional) r8;
                    r0 = "session";
                    defpackage.akcr.b(r8, r0);
                    r0 = r8.isPresent();
                    if (r0 == 0) goto L_0x001e;
                    r0 = r4;
                    r8 = r8.get();
                    r8 = (defpackage.abyk) r8;
                    r8 = r8.c();
                    r8 = defpackage.ajxs.a(r0, r8);
                    return r8;
                    r8 = new java.lang.IllegalStateException;
                    r0 = new java.lang.StringBuilder;
                    r1 = "Failed to lookup media package session ";
                    r0.<init>(r1);
                    r1 = r4;
                    r0.append(r1);
                    r1 = ".mediaPackageSessionId";
                    r0.append(r1);
                    r0 = r0.toString();
                    r8.<init>(r0);
                    r0 = r7.a;
                    r0 = r0.a;
                    r0 = r0.b();
                    r0 = (java.lang.Iterable) r0;
                    r0 = r0.iterator();
                    r1 = r0.hasNext();
                    if (r1 == 0) goto L_0x0069;
                    r1 = r0.next();
                    r1 = (defpackage.oes) r1;
                    r2 = new vjc;
                    r3 = r4;
                    r3 = r3.h;
                    r4 = r4;
                    r4 = r4.a;
                    r5 = 0;
                    r6 = r8;
                    r6 = (java.lang.Throwable) r6;
                    r2.<init>(r3, r4, r5, r6);
                    r2 = (defpackage.vjg) r2;
                    r1.a(r2);
                    goto L_0x0046;
                    r8 = (java.lang.Throwable) r8;
                    throw r8;
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.snap.media.rendering.MediaExportService$f$AnonymousClass1.apply(java.lang.Object):java.lang.Object");
                }
            });
        }
    }

    static final class g<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ MediaExportService a;

        g(MediaExportService mediaExportService) {
            this.a = mediaExportService;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            final oip oip = (oip) ajxm.a;
            final List list = (List) ajxm.b;
            vjg vjg = this.a.i;
            if (vjg == null) {
                vjg = new vjf(oip.h, oip.a, list.size());
            }
            for (oes a : this.a.b()) {
                a.a(vjg);
            }
            return ((oew) this.a.n.b()).a(oip.a, vjg, this.a.g.incrementAndGet()).f(new ajfc<T, R>(this) {
                private /* synthetic */ g a;

                public final /* synthetic */ Object apply(Object obj) {
                    Notification notification = (Notification) obj;
                    akcr.b(notification, "notification");
                    this.a.a.startForeground(1163415636, notification);
                    if (oip.g) {
                        ((oil) this.a.a.a().get()).a(vjg);
                    }
                    return ajxs.a(oip, list);
                }
            });
        }
    }

    static final class h<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ MediaExportService a;

        h(MediaExportService mediaExportService) {
            this.a = mediaExportService;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            final oip oip = (oip) ajxm.a;
            final List list = (List) ajxm.b;
            final vjd vjd = new vjd(oip.h, oip.a, list.size());
            return ((oew) this.a.n.b()).a(oip.a, vjd, this.a.g.decrementAndGet()).f(new ajfc<T, R>(this) {
                private /* synthetic */ h a;

                public final /* synthetic */ Object apply(Object obj) {
                    Notification notification = (Notification) obj;
                    akcr.b(notification, "notification");
                    this.a.a.c().notify(1163415636, notification);
                    this.a.a.i = vjd;
                    return ajxs.a(oip, list);
                }
            });
        }
    }

    static final class i<T, R> implements ajfc<T, R> {
        final /* synthetic */ MediaExportService a;

        i(MediaExportService mediaExportService) {
            this.a = mediaExportService;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            final oip oip = (oip) ajxm.a;
            final List list = (List) ajxm.b;
            ajwy ajwy = this.a.b;
            if (ajwy == null) {
                akcr.a("mediaExportController");
            }
            return (vje) ((vji) ajwy.get()).a(oip.a, list, oip.c, oip.d, oip.e, oip.h).c((ajfb) new ajfb<vje>(this) {
                final /* synthetic */ i a;

                /* renamed from: com.snap.media.rendering.MediaExportService$i$1$1 */
                static final class AnonymousClass1<T> implements ajfb<Notification> {
                    private /* synthetic */ AnonymousClass1 a;

                    AnonymousClass1(AnonymousClass1 anonymousClass1) {
                        this.a = anonymousClass1;
                    }

                    public final /* synthetic */ void accept(Object obj) {
                        this.a.a.a.c().notify(iig.a().toString().hashCode(), (Notification) obj);
                    }
                }

                public final /* synthetic */ void accept(Object obj) {
                    String str;
                    obj = (vje) obj;
                    this.a.a.i = null;
                    Iterator it = this.a.a.b().iterator();
                    while (true) {
                        str = "result";
                        if (!it.hasNext()) {
                            break;
                        }
                        oes oes = (oes) it.next();
                        akcr.a(obj, str);
                        oes.a((vjg) obj);
                    }
                    if (oip.f) {
                        oil oil = (oil) this.a.a.a().get();
                        akcr.a(obj, str);
                        oil.a((vjg) obj);
                    }
                    if (oip.g) {
                        oew a = ((oew) this.a.a.n.b());
                        idd idd = oip.a;
                        akcr.a(obj, str);
                        ajej c = a.a(idd, (vjg) obj, 0).c((ajfb) new AnonymousClass1(this)).c();
                        akcr.a((Object) c, "notificationProvider.get…             .subscribe()");
                        ajvv.a(c, this.a.a.h);
                    }
                }
            }).d((ajfb) new ajfb<Throwable>(this) {
                final /* synthetic */ i a;

                /* renamed from: com.snap.media.rendering.MediaExportService$i$2$1 */
                static final class AnonymousClass1<T> implements ajfb<Notification> {
                    private /* synthetic */ AnonymousClass2 a;

                    AnonymousClass1(AnonymousClass2 anonymousClass2) {
                        this.a = anonymousClass2;
                    }

                    public final /* synthetic */ void accept(Object obj) {
                        this.a.a.a.c().notify(iig.a().toString().hashCode(), (Notification) obj);
                    }
                }

                public final /* synthetic */ void accept(Object obj) {
                    vjc vjc = new vjc(oip.h, oip.a, list.size(), (Throwable) obj);
                    for (oes a : this.a.a.b()) {
                        a.a(vjc);
                    }
                    if (oip.f) {
                        ((oil) this.a.a.a().get()).a(vjc);
                    }
                    if (oip.g) {
                        ajej c = ((oew) this.a.a.n.b()).a(oip.a, vjc, 0).c((ajfb) new AnonymousClass1(this)).c();
                        akcr.a((Object) c, "notificationProvider.get…             .subscribe()");
                        ajvv.a(c, this.a.a.h);
                    }
                }
            }).b();
        }
    }

    static final class j implements ajev {
        final /* synthetic */ MediaExportService a;
        final /* synthetic */ int b;
        private /* synthetic */ Intent c;

        /* renamed from: com.snap.media.rendering.MediaExportService$j$1 */
        static final class AnonymousClass1 implements ajev {
            private /* synthetic */ j a;

            AnonymousClass1(j jVar) {
                this.a = jVar;
            }

            public final void run() {
                this.a.a.stopSelfResult(this.a.b);
            }
        }

        j(MediaExportService mediaExportService, Intent intent, int i) {
            this.a = mediaExportService;
            this.c = intent;
            this.b = i;
        }

        public final void run() {
            ajcx c;
            ajej e;
            MediaExportService mediaExportService = this.a;
            Intent intent = this.c;
            if (!(intent == null || intent.getExtras() == null)) {
                String string = intent.getExtras().getString("extra_media_package_session_id");
                if (string != null) {
                    ajwy ajwy = mediaExportService.c;
                    if (ajwy == null) {
                        akcr.a("mediaPackageManager");
                    }
                    c = ((odu) ajwy.get()).c(MediaExportService.a(intent), string);
                    e = c.b((ajdw) this.a.e()).f(new AnonymousClass1(this)).a(ajfu.g).e();
                    akcr.a((Object) e, "releaseMediaPackages(int…             .subscribe()");
                    ajvv.a(e, this.a.h);
                }
            }
            c = ajvo.a(ajhn.a);
            akcr.a((Object) c, "Completable.complete()");
            e = c.b((ajdw) this.a.e()).f(new AnonymousClass1(this)).a(ajfu.g).e();
            akcr.a((Object) e, "releaseMediaPackages(int…             .subscribe()");
            ajvv.a(e, this.a.h);
        }
    }

    static final class d extends akcs implements akbk<HandlerThread> {
        public static final d a = new d();

        d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            final HandlerThread handlerThread = new HandlerThread("MediaExportService", 10);
            zgd.a((Runnable) new Runnable() {
                public final void run() {
                    handlerThread.start();
                }
            });
            return handlerThread;
        }
    }

    static final class e extends akcs implements akbk<oew> {
        private /* synthetic */ MediaExportService a;

        e(MediaExportService mediaExportService) {
            this.a = mediaExportService;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ajwy ajwy = this.a.d;
            if (ajwy == null) {
                akcr.a("notificationProviderLazy");
            }
            return (oew) ajwy.get();
        }
    }

    static final class k extends akcs implements akbk<zfw> {
        private /* synthetic */ MediaExportService a;

        k(MediaExportService mediaExportService) {
            this.a = mediaExportService;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ajwy ajwy = this.a.a;
            if (ajwy == null) {
                akcr.a("schedulersProvider");
            }
            ajwy.get();
            return zgb.a(a.a, "MediaExportService");
        }
    }

    static final class l extends akcs implements akbk<zfg> {
        private /* synthetic */ MediaExportService a;

        l(MediaExportService mediaExportService) {
            this.a = mediaExportService;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return defpackage.zfw.a.a(new Handler(this.a.d().getLooper()), new odl().callsite("MediaExportService"));
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(MediaExportService.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(MediaExportService.class), "handlerThread", "getHandlerThread()Landroid/os/HandlerThread;"), new akdc(akde.a(MediaExportService.class), "serialScheduler", "getSerialScheduler()Lcom/snap/taskexecution/scheduling/AttributedHandlerScheduler;"), new akdc(akde.a(MediaExportService.class), "notificationProvider", "getNotificationProvider()Lcom/snap/media/api/rendering/MediaExportServiceNotificationProvider;")};
        a aVar = new a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    static defpackage.idd a(android.content.Intent r3) {
        /*
        r0 = 46;
        r0 = com.google.common.base.Splitter.on(r0);
        if (r3 == 0) goto L_0x0015;
    L_0x0008:
        r3 = r3.getExtras();
        if (r3 == 0) goto L_0x0015;
    L_0x000e:
        r1 = "extra_caller";
        r3 = r3.getString(r1);
        goto L_0x0016;
    L_0x0015:
        r3 = 0;
    L_0x0016:
        r3 = (java.lang.CharSequence) r3;
        r3 = r0.splitToList(r3);
        if (r3 == 0) goto L_0x0042;
    L_0x001e:
        r0 = new com.snap.media.rendering.MediaExportService$c;
        r1 = 0;
        r1 = r3.get(r1);
        r2 = "callerString[0]";
        defpackage.akcr.a(r1, r2);
        r1 = (java.lang.String) r1;
        r2 = defpackage.idi.APP_PLATFORM;
        r0.<init>(r3, r1, r2);
        r1 = 1;
        r3 = r3.get(r1);
        r1 = "callerString[1]";
        defpackage.akcr.a(r3, r1);
        r3 = (java.lang.String) r3;
        r3 = r0.callsite(r3);
        return r3;
    L_0x0042:
        r3 = new java.lang.IllegalStateException;
        r0 = "Required value was null.";
        r0 = r0.toString();
        r3.<init>(r0);
        r3 = (java.lang.Throwable) r3;
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.media.rendering.MediaExportService.a(android.content.Intent):idd");
    }

    public final ajwy<oil> a() {
        ajwy ajwy = this.e;
        if (ajwy == null) {
            akcr.a("exportStatusPublisher");
        }
        return ajwy;
    }

    public final Set<oes> b() {
        Set set = this.f;
        if (set == null) {
            akcr.a("exportAnalytics");
        }
        return set;
    }

    public final NotificationManager c() {
        NotificationManager notificationManager = this.k;
        if (notificationManager == null) {
            akcr.a("notificationManager");
        }
        return notificationManager;
    }

    public final HandlerThread d() {
        return (HandlerThread) this.l.b();
    }

    /* Access modifiers changed, original: final */
    public final zfg e() {
        return (zfg) this.m.b();
    }

    public final /* synthetic */ IBinder onBind(Intent intent) {
        akcr.b(intent, "intent");
        return null;
    }

    public final void onCreate() {
        aipp.a((Service) this);
        Object systemService = getSystemService("notification");
        if (systemService != null) {
            this.k = (NotificationManager) systemService;
            return;
        }
        throw new ajxt("null cannot be cast to non-null type android.app.NotificationManager");
    }

    public final void onDestroy() {
        super.onDestroy();
        this.h.a();
        stopForeground(true);
        d().quit();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        Object b = ajdx.c((Callable) new b(this, intent)).b((ajdw) ((zfw) this.j.b()).b());
        akcr.a(b, "Single.fromCallable<Para…schedulers.computation())");
        ajej e = b.a((ajfc) new f(this)).a((ajfc) new g(this)).a((ajdw) e()).a((ajfc) new h(this)).f(new i(this)).b((ajev) new j(this, intent, i2)).e().a(ajfu.g).e();
        akcr.a((Object) e, "extractParams(intent)\n  …             .subscribe()");
        ajvv.a(e, this.h);
        return 2;
    }
}
