package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.view.KeyEvent.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import com.brightcove.player.event.Event;
import com.looksery.sdk.ProfilingSessionReceiver;
import com.snap.hova.api.HovaNavView;
import com.snap.hova.api.HovaNavView.c;
import com.snap.mushroom.base.StartupInitDagger.StartupInitComponent;
import com.snap.mushroom.base.StartupInitDagger.StartupInitComponent.Builder;
import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;
import com.snap.tweaks.ui.TweaksUITapDetector;
import com.snapchat.android.R;
import com.snapchat.deck.views.DeckView;
import defpackage.iib.a;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Set;

/* renamed from: rso */
public final class rso {
    public ajwy<ablp> A;
    public ajwy<iib> B;
    public aipn<ihe> C;
    public aipn<Set<ihf>> D;
    public aipn<Set<igx>> E;
    public ajwy<zjo> F;
    public ajwy<fxh> G;
    public ftl H;
    public ajwy<Builder> I;
    final ajxe J = ajxh.a(new n(this));
    final ajxe K = ajxh.a(new b(this));
    public boolean L;
    public boolean M;
    public DeckView N;
    public long O = -1;
    public boolean P;
    public boolean Q = true;
    public boolean R;
    public WeakReference<ablv> S = new WeakReference(null);
    public WeakReference<ablv> T = new WeakReference(null);
    ViewStub U;
    boolean V;
    private final ajxe W = ajxh.a(new o(this));
    private final String X = getClass().getName();
    private boolean Y;
    private zfw Z;
    public Activity a;
    private final ajxe aa = ajxh.a(new e(this));
    public zgk<b> b;
    public aipr<fv> c;
    public achb<zjm, zjk> d;
    public zlh e;
    public zjt f;
    public ipt g;
    public zgb h;
    public aipn<zlb> i;
    public zkq j;
    public aipn<ifs> k;
    public ablx l;
    public zlj m;
    public dnl n;
    public ajei o;
    public aipn<ifa> p;
    public aipn<TweaksUITapDetector> q;
    public gvl r;
    public ajwy<zjw> s;
    public ajwy<Set<zgi>> t;
    public aipn<nbl> u;
    public ajwy<fxi> v;
    public aipn<rsm> w;
    public tmp x;
    public Callback y;
    public wqz z;

    /* renamed from: rso$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: rso$o */
    static final class o extends akcs implements akbk<StartupInitComponent> {
        private /* synthetic */ rso a;

        o(rso rso) {
            this.a = rso;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ajwy ajwy = this.a.I;
            if (ajwy == null) {
                akcr.a("startupInitBuilder");
            }
            return ((Builder) ajwy.get()).build();
        }
    }

    /* renamed from: rso$n */
    static final class n extends akcs implements akbk<rwm> {
        private /* synthetic */ rso a;

        n(rso rso) {
            this.a = rso;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((StartupInitComponent) this.a.W.b()).syncer();
        }
    }

    /* renamed from: rso$b */
    static final class b extends akcs implements akbk<rwn> {
        private /* synthetic */ rso a;

        b(rso rso) {
            this.a = rso;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((StartupInitComponent) this.a.W.b()).hovaController();
        }
    }

    /* renamed from: rso$e */
    static final class e extends akcs implements akbk<ajdx<Collection<zgi>>> {
        final /* synthetic */ rso a;

        /* renamed from: rso$e$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            private /* synthetic */ e a;

            1(e eVar) {
                this.a = eVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                fxv fxv = (fxv) obj;
                akcr.b(fxv, ProfilingSessionReceiver.EXTRA_STRING_FIELD_MODE);
                fxv = fxv;
                obj = (fxv == fxv.ALL || fxv == fxv.NO_NETWORK_SYNC) ? 1 : null;
                if (obj != null) {
                    ajwy ajwy = this.a.a.t;
                    if (ajwy == null) {
                        akcr.a("lifecycleObserversProvider");
                    }
                    obj = ajwy.get();
                } else {
                    aipn aipn = this.a.a.q;
                    if (aipn == null) {
                        akcr.a("tweaksUITapDetector");
                    }
                    obj = aipn.get();
                    akcr.a(obj, "tweaksUITapDetector.get()");
                    obj = ajyl.a(obj);
                }
                return (Collection) obj;
            }
        }

        e(rso rso) {
            this.a = rso;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ftl ftl = this.a.H;
            if (ftl == null) {
                akcr.a("configurationProvider");
            }
            return ftl.m(fxs.STARTUP_MODE).f(new 1(this)).b((ajdw) rso.b(this.a).b()).a();
        }
    }

    /* renamed from: rso$j */
    static final class j<T> implements ajfl<ajxm<? extends a, ? extends Rect>> {
        public static final j a = new j();

        j() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "it");
            obj = ((a) ajxm.a).b;
            akcr.a(obj, "it.first.fullscreenResolution");
            return obj.c();
        }
    }

    /* renamed from: rso$k */
    static final class k<T> implements ajfb<ajxm<? extends a, ? extends Rect>> {
        private /* synthetic */ rso a;

        k(rso rso) {
            this.a = rso;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            ViewStub viewStub = this.a.U;
            if (viewStub != null) {
                viewStub.setVisibility(0);
                LayoutParams layoutParams = viewStub.getLayoutParams();
                layoutParams.height = ((Rect) ajxm.b).bottom;
                viewStub.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: rso$c */
    static final class c implements Runnable {
        private /* synthetic */ rso a;

        c(rso rso) {
            this.a = rso;
        }

        public final void run() {
            ablx ablx = this.a.l;
            if (ablx == null) {
                akcr.a("launchTracker");
            }
            Activity activity = this.a.a;
            if (activity == null) {
                akcr.a(Event.ACTIVITY);
            }
            ablx.a(activity.getApplicationContext());
        }
    }

    /* renamed from: rso$d */
    static final class d<T> implements ajfb<Boolean> {
        private /* synthetic */ rso a;

        d(rso rso) {
            this.a = rso;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            rso rso = this.a;
            akcr.a(obj, "finishActivityOnBack");
            rso.V = obj.booleanValue();
        }
    }

    /* renamed from: rso$h */
    public static final class h implements Runnable {
        final /* synthetic */ rso a;

        /* renamed from: rso$h$1 */
        static final class 1<T> implements ajfb<Collection<zgi>> {
            private /* synthetic */ h a;

            1(h hVar) {
                this.a = hVar;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:28:0x0063 in {8, 11, 14, 20, 22, 25, 27} preds:[]
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
                	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
                	at java.lang.Iterable.forEach(Iterable.java:75)
                	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
                	at jadx.core.ProcessClass.process(ProcessClass.java:37)
                	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
                	at jadx.api.JavaClass.decompile(JavaClass.java:62)
                	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
                */
            public final /* synthetic */ void accept(java.lang.Object r4) {
                /*
                r3 = this;
                r4 = (java.util.Collection) r4;
                r4 = r4.iterator();	 Catch:{ all -> 0x0061 }
                r0 = r4.hasNext();	 Catch:{ all -> 0x0061 }
                if (r0 == 0) goto L_0x0025;	 Catch:{ all -> 0x0061 }
                r0 = r4.next();	 Catch:{ all -> 0x0061 }
                r0 = (defpackage.zgi) r0;	 Catch:{ all -> 0x0061 }
                r1 = r0.getClass();	 Catch:{ all -> 0x0061 }
                r1 = defpackage.abpm.a(r1);	 Catch:{ all -> 0x0061 }
                r2 = "ClassUtils.getName(observer.javaClass)";	 Catch:{ all -> 0x0061 }
                defpackage.akcr.a(r1, r2);	 Catch:{ all -> 0x0061 }
                r0.h();	 Catch:{ all -> 0x0023 }
                goto L_0x0006;
                r4 = move-exception;
                throw r4;	 Catch:{ all -> 0x0061 }
                r4 = r3.a;	 Catch:{ all -> 0x0061 }
                r4 = r4.a;	 Catch:{ all -> 0x0061 }
                r4 = r4.x;	 Catch:{ all -> 0x0061 }
                if (r4 != 0) goto L_0x0032;	 Catch:{ all -> 0x0061 }
                r0 = "permissionsPresenter";	 Catch:{ all -> 0x0061 }
                defpackage.akcr.a(r0);	 Catch:{ all -> 0x0061 }
                r0 = r4.d;	 Catch:{ all -> 0x0061 }
                if (r0 == 0) goto L_0x0059;	 Catch:{ all -> 0x0061 }
                r0 = (android.app.Activity) r0;	 Catch:{ all -> 0x0061 }
                r1 = 2131428195; // 0x7f0b0363 float:1.8478028E38 double:1.0530654477E-314;	 Catch:{ all -> 0x0061 }
                r0 = r0.findViewById(r1);	 Catch:{ all -> 0x0061 }
                r4.a(r0);	 Catch:{ all -> 0x0061 }
                r4 = r3.a;
                r4 = r4.a;
                r4 = r4.L;
                if (r4 == 0) goto L_0x0051;
                r4 = r3.a;
                r4 = r4.a;
                r4.c();
                r4 = r3.a;
                r4 = r4.a;
                r0 = 1;
                r4.R = r0;
                return;
                r4 = new ajxt;	 Catch:{ all -> 0x0061 }
                r0 = "null cannot be cast to non-null type android.app.Activity";	 Catch:{ all -> 0x0061 }
                r4.<init>(r0);	 Catch:{ all -> 0x0061 }
                throw r4;	 Catch:{ all -> 0x0061 }
                r4 = move-exception;
                throw r4;
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.rso$h$1.accept(java.lang.Object):void");
            }
        }

        public h(rso rso) {
            this.a = rso;
        }

        public final void run() {
            ajej e = ((ajdx) this.a.aa.b()).a((ajdw) rso.b(this.a).l()).e((ajfb) new 1(this));
            ajei ajei = this.a.o;
            if (ajei == null) {
                akcr.a("disposable");
            }
            igk.a(e, ajei);
        }
    }

    /* renamed from: rso$f */
    public static final class f implements Runnable {
        private /* synthetic */ Runnable a;

        public f(Runnable runnable) {
            this.a = runnable;
        }

        public final void run() {
            this.a.run();
        }
    }

    /* renamed from: rso$g */
    public static final class g implements ajev {
        private /* synthetic */ rso a;

        public g(rso rso) {
            this.a = rso;
        }

        public final void run() {
            ablv ablv = (ablv) this.a.T.get();
            if (ablv != null) {
                ablv.a();
            }
        }
    }

    /* renamed from: rso$p */
    static final class p implements Runnable {
        private /* synthetic */ rso a;
        private /* synthetic */ boolean b;

        p(rso rso, boolean z) {
            this.a = rso;
            this.b = z;
        }

        public final void run() {
            rso.a(this.a, ((rwm) this.a.J.b()).a(this.b), null, null, 6);
            rso.a(this.a, ((rwn) this.a.K.b()).a(), null, null, 6);
        }
    }

    /* renamed from: rso$m */
    static final class m implements Runnable {
        final /* synthetic */ rso a;

        /* renamed from: rso$m$1 */
        static final class 1<T> implements ajfb<Collection<zgi>> {
            private /* synthetic */ m a;

            1(m mVar) {
                this.a = mVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                Collection<zgi> collection = (Collection) obj;
                if (this.a.a.L) {
                    for (zgi zgi : collection) {
                        akcr.a(abpm.a(zgi.getClass()), "ClassUtils.getName(observer.javaClass)");
                        zgi.i();
                    }
                }
            }
        }

        m(rso rso) {
            this.a = rso;
        }

        public final void run() {
            rso rso = this.a;
            rso.a(rso, ((ajdx) rso.aa.b()).a((ajdw) rso.b(this.a).l()).e((ajfb) new 1(this)), null, null, 6);
        }
    }

    /* renamed from: rso$l */
    static final class l implements Runnable {
        private /* synthetic */ rso a;
        private /* synthetic */ Runnable b;

        l(rso rso, Runnable runnable) {
            this.a = rso;
            this.b = runnable;
        }

        public final void run() {
            if (this.a.L) {
                this.b.run();
            }
        }
    }

    /* renamed from: rso$i */
    static final class i<T> implements ajfb<achg> {
        private /* synthetic */ rso a;

        i(rso rso) {
            this.a = rso;
        }

        public final /* synthetic */ void accept(Object obj) {
            rso rso = this.a;
            if (rso.L) {
                rso.a(false);
            }
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(rso.class), "startupInit", "getStartupInit()Lcom/snap/mushroom/base/StartupInitDagger$StartupInitComponent;"), new akdc(akde.a(rso.class), "startupDataSyncer", "getStartupDataSyncer()Lcom/snap/mushroom/sync/StartupDataSyncer;"), new akdc(akde.a(rso.class), "appHovaController", "getAppHovaController()Lcom/snap/mushroom/ui/AppHovaController;"), new akdc(akde.a(rso.class), "lifecycleObservers", "getLifecycleObservers()Lio/reactivex/Single;")};
        a aVar = new a();
    }

    private final <D extends ajej> D a(D d, b bVar, String str) {
        zgk zgk = this.b;
        if (zgk == null) {
            akcr.a("taskScoper");
        }
        Object a = zgk.a(d, bVar, str);
        akcr.a(a, "taskScoper.bind(disposable, event, disposableName)");
        return a;
    }

    static /* synthetic */ ajej a(rso rso, ajej ajej, b bVar, String str, int i) {
        if ((i & 2) != 0) {
            bVar = b.ON_PAUSE;
        }
        if ((i & 4) != 0) {
            str = rso.X;
            akcr.a((Object) str, "defaultName");
        }
        return rso.a(ajej, bVar, str);
    }

    public static final /* synthetic */ zfw b(rso rso) {
        zfw zfw = rso.Z;
        if (zfw == null) {
            akcr.a("schedulers");
        }
        return zfw;
    }

    private final void e() {
        boolean z = this.Y;
        zfw zfw = this.Z;
        if (zfw == null) {
            akcr.a("schedulers");
        }
        zfw.f().a((Runnable) new p(this, z));
    }

    public final ajej a() {
        String str = "insetsDetector.windowRectObservable";
        this.Y = true;
        ajwy ajwy = this.A;
        if (ajwy == null) {
            akcr.a("startupContext");
        }
        ((ablp) ajwy.get()).a(SystemClock.elapsedRealtimeNanos());
        if (this.h == null) {
            akcr.a("schedulersProvider");
        }
        this.Z = zgb.a(zgu.a.callsite("UserActivityHandler"));
        Activity activity = this.a;
        String str2 = Event.ACTIVITY;
        if (activity == null) {
            akcr.a(str2);
        }
        this.N = (DeckView) activity.findViewById(R.id.base_open_view);
        activity = this.a;
        if (activity == null) {
            akcr.a(str2);
        }
        Object obj = (HovaNavView) activity.findViewById(R.id.hova_nav_view);
        ipt ipt = this.g;
        String str3 = "hovaController";
        if (ipt == null) {
            akcr.a(str3);
        }
        akcr.a(obj, "hovaNavView");
        ipt.a((View) obj);
        Activity activity2 = this.a;
        if (activity2 == null) {
            akcr.a(str2);
        }
        Object intent = activity2.getIntent();
        akcr.a(intent, "activity.intent");
        if (!gvl.a.c(intent)) {
            ipt = this.g;
            if (ipt == null) {
                akcr.a(str3);
            }
            ipt.a(dnh.a);
        }
        activity2 = this.a;
        if (activity2 == null) {
            akcr.a(str2);
        }
        activity2.getWindow().addFlags(67108864);
        zkq zkq = this.j;
        str3 = "insetsDetector";
        if (zkq == null) {
            akcr.a(str3);
        }
        Activity activity3 = this.a;
        if (activity3 == null) {
            akcr.a(str2);
        }
        rso.a(this, zkq.a(activity3), b.ON_DESTROY, null, 4);
        activity2 = this.a;
        if (activity2 == null) {
            akcr.a(str2);
        }
        this.U = (ViewStub) activity2.findViewById(R.id.tall_device_nav_bar_view_stub);
        ajwy ajwy2 = this.B;
        if (ajwy2 == null) {
            akcr.a("screenParameterProvider");
        }
        Object i = ((iib) ajwy2.get()).b().i();
        akcr.a(i, "screenParameterProvider.…rameters().toObservable()");
        zkq = this.j;
        if (zkq == null) {
            akcr.a(str3);
        }
        intent = zkq.a();
        akcr.a(intent, str);
        ajdp a = ajwa.a(i, intent);
        zfw zfw = this.Z;
        String str4 = "schedulers";
        if (zfw == null) {
            akcr.a(str4);
        }
        a = a.b((ajdw) zfw.b());
        zfw = this.Z;
        if (zfw == null) {
            akcr.a(str4);
        }
        rso.a(this, a.a((ajdw) zfw.l()).a((ajfl) j.a).f((ajfb) new k(this)), b.ON_DESTROY, null, 4);
        zkq zkq2 = this.j;
        if (zkq2 == null) {
            akcr.a(str3);
        }
        i = zkq2.a();
        akcr.a(i, str);
        ajwy ajwy3 = this.v;
        if (ajwy3 == null) {
            akcr.a("deviceConfiguration");
        }
        boolean z = ((fxi) ajwy3.get()).b;
        akcr.b(i, "insetObservable");
        obj.a.a(i.a((ajfl) HovaNavView.a.a).f((ajfb) new HovaNavView.b(obj)));
        obj.a.a(i.f((ajfb) new c(obj, z)));
        zfw zfw2 = this.Z;
        if (zfw2 == null) {
            akcr.a(str4);
        }
        zfw2.a().submit(new c(this));
        ftl ftl = this.H;
        if (ftl == null) {
            akcr.a("configurationProvider");
        }
        ajdx b = ftl.b((fth) fxs.FINISH_ACTIVITY_ON_BACK);
        zfw zfw3 = this.Z;
        if (zfw3 == null) {
            akcr.a(str4);
        }
        b = b.b((ajdw) zfw3.h());
        zfw3 = this.Z;
        if (zfw3 == null) {
            akcr.a(str4);
        }
        ajej e = b.a((ajdw) zfw3.l()).e((ajfb) new d(this));
        ajei ajei = this.o;
        if (ajei == null) {
            akcr.a("disposable");
        }
        return igk.a(e, ajei);
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        abmr.a();
        if (this.L) {
            Runnable mVar = new m(this);
            if (z) {
                this.S = new WeakReference(ablv.a(new l(this, mVar)));
                return;
            }
            mVar.run();
        }
    }

    public final boolean a(MotionEvent motionEvent) {
        akcr.b(motionEvent, "event");
        aipn aipn = this.q;
        if (aipn == null) {
            akcr.a("tweaksUITapDetector");
        }
        aipn.get();
        return false;
    }

    public final boolean b() {
        String str = Event.ACTIVITY;
        achb achb = this.d;
        if (achb == null) {
            akcr.a("navigationHost");
        }
        boolean z = true;
        if (achb.e()) {
            return true;
        }
        if (this.V) {
            return false;
        }
        Activity activity;
        try {
            activity = this.a;
            if (activity == null) {
                akcr.a(str);
            }
            z = activity.moveTaskToBack(false);
        } catch (NullPointerException e) {
            if (VERSION.SDK_INT == 24 || VERSION.SDK_INT == 25) {
                activity = this.a;
                if (activity == null) {
                    akcr.a(str);
                }
                activity.finish();
            } else {
                throw e;
            }
        }
        return z;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:123:0x01ff in {5, 10, 15, 18, 19, 22, 23, 24, 27, 30, 33, 38, 39, 42, 49, 50, 53, 56, 57, 62, 65, 66, 69, 72, 73, 76, 79, 80, 86, 92, 93, 96, 102, 103, 106, 111, 114, 115, 118, 120, 122} preds:[]
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
    public final void c() {
        /*
        r10 = this;
        r0 = r10.d;	 Catch:{ all -> 0x01fd }
        r1 = "navigationHost";
        if (r0 != 0) goto L_0x0009;
        defpackage.akcr.a(r1);	 Catch:{ all -> 0x01fd }
        r0 = r0.c;	 Catch:{ all -> 0x01fd }
        r2 = 0;	 Catch:{ all -> 0x01fd }
        r3 = 1;	 Catch:{ all -> 0x01fd }
        r4 = 0;	 Catch:{ all -> 0x01fd }
        if (r0 == 0) goto L_0x003d;	 Catch:{ all -> 0x01fd }
        r0 = r10.d;	 Catch:{ all -> 0x01fd }
        if (r0 != 0) goto L_0x0017;	 Catch:{ all -> 0x01fd }
        defpackage.akcr.a(r1);	 Catch:{ all -> 0x01fd }
        r0 = r0.h();	 Catch:{ all -> 0x01fd }
        if (r0 == 0) goto L_0x003d;	 Catch:{ all -> 0x01fd }
        r0 = r10.d;	 Catch:{ all -> 0x01fd }
        if (r0 != 0) goto L_0x0024;	 Catch:{ all -> 0x01fd }
        defpackage.akcr.a(r1);	 Catch:{ all -> 0x01fd }
        r0 = r0.h();	 Catch:{ all -> 0x01fd }
        r0 = (defpackage.zjm) r0;	 Catch:{ all -> 0x01fd }
        if (r0 == 0) goto L_0x0031;	 Catch:{ all -> 0x01fd }
        r0 = r0.b();	 Catch:{ all -> 0x01fd }
        goto L_0x0032;	 Catch:{ all -> 0x01fd }
        r0 = r4;	 Catch:{ all -> 0x01fd }
        r5 = "Camera";	 Catch:{ all -> 0x01fd }
        r0 = defpackage.akcr.a(r0, r5);	 Catch:{ all -> 0x01fd }
        if (r0 == 0) goto L_0x003b;	 Catch:{ all -> 0x01fd }
        goto L_0x003d;	 Catch:{ all -> 0x01fd }
        r0 = 0;	 Catch:{ all -> 0x01fd }
        goto L_0x003e;	 Catch:{ all -> 0x01fd }
        r0 = 1;	 Catch:{ all -> 0x01fd }
        r5 = r10.n;	 Catch:{ all -> 0x01fd }
        if (r5 != 0) goto L_0x0047;	 Catch:{ all -> 0x01fd }
        r6 = "cameraPreparer";	 Catch:{ all -> 0x01fd }
        defpackage.akcr.a(r6);	 Catch:{ all -> 0x01fd }
        r6 = r10.Y;	 Catch:{ all -> 0x01fd }
        r7 = defpackage.dnh.f;	 Catch:{ all -> 0x01fd }
        r8 = "UserActivityHandler";	 Catch:{ all -> 0x01fd }
        r7 = r7.callsite(r8);	 Catch:{ all -> 0x01fd }
        r0 = r5.a(r6, r7, r0);	 Catch:{ all -> 0x01fd }
        r5 = 6;	 Catch:{ all -> 0x01fd }
        defpackage.rso.a(r10, r0, r4, r4, r5);	 Catch:{ all -> 0x01fd }
        r0 = r10.F;	 Catch:{ all -> 0x01fd }
        if (r0 != 0) goto L_0x0062;	 Catch:{ all -> 0x01fd }
        r6 = "onPausePagePopper";	 Catch:{ all -> 0x01fd }
        defpackage.akcr.a(r6);	 Catch:{ all -> 0x01fd }
        r0 = r0.get();	 Catch:{ all -> 0x01fd }
        r0 = (defpackage.zjo) r0;	 Catch:{ all -> 0x01fd }
        r0 = r0.a;	 Catch:{ all -> 0x01fd }
        r0.a();	 Catch:{ all -> 0x01fd }
        r0 = r10.G;	 Catch:{ all -> 0x01fd }
        if (r0 != 0) goto L_0x0076;	 Catch:{ all -> 0x01fd }
        r6 = "deckAppStateManagementConfiguration";	 Catch:{ all -> 0x01fd }
        defpackage.akcr.a(r6);	 Catch:{ all -> 0x01fd }
        r0 = r0.get();	 Catch:{ all -> 0x01fd }
        r0 = (defpackage.fxh) r0;	 Catch:{ all -> 0x01fd }
        r0 = r0.a();	 Catch:{ all -> 0x01fd }
        if (r0 == 0) goto L_0x008c;	 Catch:{ all -> 0x01fd }
        r0 = r10.d;	 Catch:{ all -> 0x01fd }
        if (r0 != 0) goto L_0x0089;	 Catch:{ all -> 0x01fd }
        defpackage.akcr.a(r1);	 Catch:{ all -> 0x01fd }
        r0.b();	 Catch:{ all -> 0x01fd }
        r0 = r10;	 Catch:{ all -> 0x01fd }
        r0 = (defpackage.rso) r0;	 Catch:{ all -> 0x01fd }
        r6 = r0.C;	 Catch:{ all -> 0x01fd }
        if (r6 != 0) goto L_0x0098;	 Catch:{ all -> 0x01fd }
        r7 = "startupInterceptor";	 Catch:{ all -> 0x01fd }
        defpackage.akcr.a(r7);	 Catch:{ all -> 0x01fd }
        r6 = r6.get();	 Catch:{ all -> 0x01fd }
        r6 = (defpackage.ihe) r6;	 Catch:{ all -> 0x01fd }
        r7 = r0.Y;	 Catch:{ all -> 0x01fd }
        r6 = r6.a(r7);	 Catch:{ all -> 0x01fd }
        r7 = "disposable";
        if (r6 == 0) goto L_0x00b8;
        r0 = r0.o;	 Catch:{ all -> 0x01fd }
        if (r0 != 0) goto L_0x00af;	 Catch:{ all -> 0x01fd }
        defpackage.akcr.a(r7);	 Catch:{ all -> 0x01fd }
        r6 = r6.e();	 Catch:{ all -> 0x01fd }
        r0.a(r6);	 Catch:{ all -> 0x01fd }
        r0 = 1;	 Catch:{ all -> 0x01fd }
        goto L_0x00e1;	 Catch:{ all -> 0x01fd }
        r6 = r0.r;	 Catch:{ all -> 0x01fd }
        if (r6 != 0) goto L_0x00c1;	 Catch:{ all -> 0x01fd }
        r8 = "deepLinkDispatcher";	 Catch:{ all -> 0x01fd }
        defpackage.akcr.a(r8);	 Catch:{ all -> 0x01fd }
        r8 = r0.a;	 Catch:{ all -> 0x01fd }
        if (r8 != 0) goto L_0x00ca;	 Catch:{ all -> 0x01fd }
        r9 = "activity";	 Catch:{ all -> 0x01fd }
        defpackage.akcr.a(r9);	 Catch:{ all -> 0x01fd }
        r8 = r8.getIntent();	 Catch:{ all -> 0x01fd }
        r9 = "activity.intent";	 Catch:{ all -> 0x01fd }
        defpackage.akcr.a(r8, r9);	 Catch:{ all -> 0x01fd }
        r6 = r6.a(r8);	 Catch:{ all -> 0x01fd }
        r8 = r6;	 Catch:{ all -> 0x01fd }
        r8 = (defpackage.ajej) r8;	 Catch:{ all -> 0x01fd }
        defpackage.rso.a(r0, r8, r4, r4, r5);	 Catch:{ all -> 0x01fd }
        r0.M = r3;	 Catch:{ all -> 0x01fd }
        r0 = r6.a;	 Catch:{ all -> 0x01fd }
        r6 = r10.Y;	 Catch:{ all -> 0x01fd }
        if (r6 == 0) goto L_0x0105;	 Catch:{ all -> 0x01fd }
        r4 = r10.i;	 Catch:{ all -> 0x01fd }
        if (r4 != 0) goto L_0x00ee;	 Catch:{ all -> 0x01fd }
        r5 = "globalNavTrackerLazy";	 Catch:{ all -> 0x01fd }
        defpackage.akcr.a(r5);	 Catch:{ all -> 0x01fd }
        r4 = r4.get();	 Catch:{ all -> 0x01fd }
        r4 = (defpackage.zlb) r4;	 Catch:{ all -> 0x01fd }
        r5 = r10.d;	 Catch:{ all -> 0x01fd }
        if (r5 != 0) goto L_0x00fb;	 Catch:{ all -> 0x01fd }
        defpackage.akcr.a(r1);	 Catch:{ all -> 0x01fd }
        r4.a(r5);	 Catch:{ all -> 0x01fd }
        r10.e();	 Catch:{ all -> 0x01fd }
        r10.a(r3);	 Catch:{ all -> 0x01fd }
        goto L_0x0148;	 Catch:{ all -> 0x01fd }
        r6 = r10.d;	 Catch:{ all -> 0x01fd }
        if (r6 != 0) goto L_0x010c;	 Catch:{ all -> 0x01fd }
        defpackage.akcr.a(r1);	 Catch:{ all -> 0x01fd }
        r6 = r6.i();	 Catch:{ all -> 0x01fd }
        if (r6 == 0) goto L_0x0119;	 Catch:{ all -> 0x01fd }
        r6 = r6.e();	 Catch:{ all -> 0x01fd }
        r6 = (defpackage.zjm) r6;	 Catch:{ all -> 0x01fd }
        goto L_0x011a;	 Catch:{ all -> 0x01fd }
        r6 = r4;	 Catch:{ all -> 0x01fd }
        r8 = defpackage.dnh.a;	 Catch:{ all -> 0x01fd }
        r6 = defpackage.akcr.a(r6, r8);	 Catch:{ all -> 0x01fd }
        r3 = r3 ^ r6;	 Catch:{ all -> 0x01fd }
        if (r3 == 0) goto L_0x0127;	 Catch:{ all -> 0x01fd }
        r10.a(r2);	 Catch:{ all -> 0x01fd }
        goto L_0x0148;	 Catch:{ all -> 0x01fd }
        r3 = r10.e;	 Catch:{ all -> 0x01fd }
        if (r3 != 0) goto L_0x0130;	 Catch:{ all -> 0x01fd }
        r6 = "pageReadyController";	 Catch:{ all -> 0x01fd }
        defpackage.akcr.a(r6);	 Catch:{ all -> 0x01fd }
        r3 = r3.a;	 Catch:{ all -> 0x01fd }
        r3 = (defpackage.ajdp) r3;	 Catch:{ all -> 0x01fd }
        r8 = 1;	 Catch:{ all -> 0x01fd }
        r3 = r3.c(r8);	 Catch:{ all -> 0x01fd }
        r6 = new rso$i;	 Catch:{ all -> 0x01fd }
        r6.<init>(r10);	 Catch:{ all -> 0x01fd }
        r6 = (defpackage.ajfb) r6;	 Catch:{ all -> 0x01fd }
        r3 = r3.f(r6);	 Catch:{ all -> 0x01fd }
        defpackage.rso.a(r10, r3, r4, r4, r5);	 Catch:{ all -> 0x01fd }
        r3 = "startupListeners.get()";
        r4 = "startupListeners";
        if (r0 != 0) goto L_0x0188;
        r10.d();	 Catch:{ all -> 0x01fd }
        r0 = r10.D;	 Catch:{ all -> 0x01fd }
        if (r0 != 0) goto L_0x0158;	 Catch:{ all -> 0x01fd }
        defpackage.akcr.a(r4);	 Catch:{ all -> 0x01fd }
        r0 = r0.get();	 Catch:{ all -> 0x01fd }
        defpackage.akcr.a(r0, r3);	 Catch:{ all -> 0x01fd }
        r0 = (java.lang.Iterable) r0;	 Catch:{ all -> 0x01fd }
        r0 = r0.iterator();	 Catch:{ all -> 0x01fd }
        r1 = r0.hasNext();	 Catch:{ all -> 0x01fd }
        if (r1 == 0) goto L_0x01ee;	 Catch:{ all -> 0x01fd }
        r1 = r0.next();	 Catch:{ all -> 0x01fd }
        r1 = (defpackage.ihf) r1;	 Catch:{ all -> 0x01fd }
        r3 = r10.Y;	 Catch:{ all -> 0x01fd }
        r1 = r1.a(r3);	 Catch:{ all -> 0x01fd }
        r1 = r1.e();	 Catch:{ all -> 0x01fd }
        r3 = r10.o;	 Catch:{ all -> 0x01fd }
        if (r3 != 0) goto L_0x0182;	 Catch:{ all -> 0x01fd }
        defpackage.akcr.a(r7);	 Catch:{ all -> 0x01fd }
        r3 = (defpackage.ajfo) r3;	 Catch:{ all -> 0x01fd }
        defpackage.igk.a(r1, r3);	 Catch:{ all -> 0x01fd }
        goto L_0x0165;	 Catch:{ all -> 0x01fd }
        r0 = r10.D;	 Catch:{ all -> 0x01fd }
        if (r0 != 0) goto L_0x018f;	 Catch:{ all -> 0x01fd }
        defpackage.akcr.a(r4);	 Catch:{ all -> 0x01fd }
        r0 = r0.get();	 Catch:{ all -> 0x01fd }
        defpackage.akcr.a(r0, r3);	 Catch:{ all -> 0x01fd }
        r0 = (java.lang.Iterable) r0;	 Catch:{ all -> 0x01fd }
        r0 = r0.iterator();	 Catch:{ all -> 0x01fd }
        r3 = r0.hasNext();	 Catch:{ all -> 0x01fd }
        if (r3 == 0) goto L_0x01bf;	 Catch:{ all -> 0x01fd }
        r3 = r0.next();	 Catch:{ all -> 0x01fd }
        r3 = (defpackage.ihf) r3;	 Catch:{ all -> 0x01fd }
        r4 = r10.Y;	 Catch:{ all -> 0x01fd }
        r3 = r3.b(r4);	 Catch:{ all -> 0x01fd }
        r3 = r3.e();	 Catch:{ all -> 0x01fd }
        r4 = r10.o;	 Catch:{ all -> 0x01fd }
        if (r4 != 0) goto L_0x01b9;	 Catch:{ all -> 0x01fd }
        defpackage.akcr.a(r7);	 Catch:{ all -> 0x01fd }
        r4 = (defpackage.ajfo) r4;	 Catch:{ all -> 0x01fd }
        defpackage.igk.a(r3, r4);	 Catch:{ all -> 0x01fd }
        goto L_0x019c;	 Catch:{ all -> 0x01fd }
        r0 = r10.d;	 Catch:{ all -> 0x01fd }
        if (r0 != 0) goto L_0x01c6;	 Catch:{ all -> 0x01fd }
        defpackage.akcr.a(r1);	 Catch:{ all -> 0x01fd }
        r0 = r0.c;	 Catch:{ all -> 0x01fd }
        if (r0 != 0) goto L_0x01ee;	 Catch:{ all -> 0x01fd }
        r0 = r10.s;	 Catch:{ all -> 0x01fd }
        if (r0 != 0) goto L_0x01d3;	 Catch:{ all -> 0x01fd }
        r3 = "deepLinkNavigatorProvider";	 Catch:{ all -> 0x01fd }
        defpackage.akcr.a(r3);	 Catch:{ all -> 0x01fd }
        r0 = r0.get();	 Catch:{ all -> 0x01fd }
        r0 = (defpackage.zjw) r0;	 Catch:{ all -> 0x01fd }
        r3 = r10.d;	 Catch:{ all -> 0x01fd }
        if (r3 != 0) goto L_0x01e0;	 Catch:{ all -> 0x01fd }
        defpackage.akcr.a(r1);	 Catch:{ all -> 0x01fd }
        r1 = r0.a;	 Catch:{ all -> 0x01fd }
        r1 = (defpackage.achg) r1;	 Catch:{ all -> 0x01fd }
        r4 = r0.b;	 Catch:{ all -> 0x01fd }
        r5 = r0.c;	 Catch:{ all -> 0x01fd }
        r3.a(r1, r4, r5);	 Catch:{ all -> 0x01fd }
        r0.a();	 Catch:{ all -> 0x01fd }
        r0 = r10.x;	 Catch:{ all -> 0x01fd }
        if (r0 != 0) goto L_0x01f7;	 Catch:{ all -> 0x01fd }
        r1 = "permissionsPresenter";	 Catch:{ all -> 0x01fd }
        defpackage.akcr.a(r1);	 Catch:{ all -> 0x01fd }
        r0.d();	 Catch:{ all -> 0x01fd }
        r10.Y = r2;	 Catch:{ all -> 0x01fd }
        return;
        r0 = move-exception;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rso.c():void");
    }

    public final void d() {
        achb achb = this.d;
        String str = "navigationHost";
        if (achb == null) {
            akcr.a(str);
        }
        if (!achb.c) {
            achb = this.d;
            if (achb == null) {
                akcr.a(str);
            }
            achb.a(null, null, null);
            ajwy ajwy = this.s;
            if (ajwy == null) {
                akcr.a("deepLinkNavigatorProvider");
            }
            ((zjw) ajwy.get()).a();
        }
    }
}
