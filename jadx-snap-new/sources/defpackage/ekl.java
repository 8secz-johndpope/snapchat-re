package defpackage;

import android.graphics.Point;
import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import defpackage.dnb.g;
import defpackage.dnb.h;
import defpackage.dnb.i;
import defpackage.dva.a;
import defpackage.dva.b;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ekl */
public final class ekl {
    final AtomicReference<Point> a = new AtomicReference();
    final AtomicReference<Object> b = new AtomicReference();
    final AtomicBoolean c = new AtomicBoolean(true);
    final ajei d = new ajei();
    final ajwo<Object> e;
    final ajdp<Object> f;
    final ajdp<Object> g;
    final ekg h;
    private final ajxe i;
    private final ajxe j;
    private final ajxe k;
    private final ajxe l;

    /* renamed from: ekl$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: ekl$i */
    static final class i extends akcs implements akbk<dnb> {
        private /* synthetic */ ajwy a;
        private /* synthetic */ ajwy b;

        i(ajwy ajwy, ajwy ajwy2) {
            this.a = ajwy;
            this.b = ajwy2;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object obj = this.a.get();
            akcr.a(obj, "shouldTrackUnifiedCameraActionTracker.get()");
            return ((Boolean) obj).booleanValue() ? (dnb) this.b.get() : null;
        }
    }

    /* renamed from: ekl$f */
    static final class f<T> implements ajfl<Object> {
        private /* synthetic */ ekl a;

        f(ekl ekl) {
            this.a = ekl;
        }

        public final boolean test(Object obj) {
            akcr.b(obj, "it");
            return this.a.c.get();
        }
    }

    /* renamed from: ekl$e */
    static final class e<T> implements ajfl<Object> {
        private /* synthetic */ ekl a;

        e(ekl ekl) {
            this.a = ekl;
        }

        public final boolean test(Object obj) {
            akcr.b(obj, "it");
            return this.a.c.get();
        }
    }

    /* renamed from: ekl$h */
    static final class h extends akcs implements akbk<ajdp<Object>> {
        final /* synthetic */ ekl a;

        /* renamed from: ekl$h$1 */
        static final class 1<V> implements Callable<Object> {
            private /* synthetic */ h a;

            1(h hVar) {
                this.a = hVar;
            }

            public final Object call() {
                return this.a.a.b.get();
            }
        }

        h(ekl ekl) {
            this.a = ekl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object b = ajdp.b((ajdt) this.a.f, (ajdt) this.a.g);
            akcr.a(b, "Observable.merge(filtere…ttonClicks, externalFlip)");
            return epl.a(b, new 1(this));
        }
    }

    /* renamed from: ekl$d */
    static final class d extends akcs implements akbk<ajdp<Point>> {
        final /* synthetic */ ekl a;
        private /* synthetic */ ajdp b;

        /* renamed from: ekl$d$1 */
        static final class 1<T> implements ajfl<Point> {
            private /* synthetic */ d a;

            1(d dVar) {
                this.a = dVar;
            }

            public final /* synthetic */ boolean test(Object obj) {
                akcr.b((Point) obj, "it");
                return this.a.a.c.get();
            }
        }

        /* renamed from: ekl$d$2 */
        static final class 2<V> implements Callable<Point> {
            private /* synthetic */ d a;

            2(d dVar) {
                this.a = dVar;
            }

            public final /* synthetic */ Object call() {
                return (Point) this.a.a.a.get();
            }
        }

        /* renamed from: ekl$d$3 */
        static final class 3<T> implements ajfb<Point> {
            public static final 3 a = new 3();

            3() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        d(ekl ekl, ajdp ajdp) {
            this.a = ekl;
            this.b = ajdp;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object a = this.b.a((ajfl) new 1(this));
            akcr.a(a, "doubleTapObservable.filt…eractionPermitted.get() }");
            return epl.a(a, new 2(this)).d((ajfb) 3.a);
        }
    }

    /* renamed from: ekl$g */
    static final class g extends akcs implements akbk<ajdp<Boolean>> {
        final /* synthetic */ Supplier a;
        private /* synthetic */ ajdp b;
        private /* synthetic */ ajdp c;

        /* renamed from: ekl$g$1 */
        static final class 1<T> implements ajfl<ebk> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                ebk ebk = (ebk) obj;
                akcr.b(ebk, "it");
                return ebk == ebk.READY;
            }
        }

        /* renamed from: ekl$g$3 */
        static final class 3<T, R> implements ajfc<T, R> {
            public static final 3 a = new 3();

            3() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((ebk) obj, "it");
                return Boolean.TRUE;
            }
        }

        /* renamed from: ekl$g$4 */
        static final class 4<T> implements ajfl<ebk> {
            public static final 4 a = new 4();

            4() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                ebk ebk = (ebk) obj;
                akcr.b(ebk, "it");
                return ebk == ebk.CAPTURING_PICTURE || ebk == ebk.CAPTURING_VIDEO_WITHOUT_SURFACE_RECORDING;
            }
        }

        /* renamed from: ekl$g$5 */
        static final class 5<T, R> implements ajfc<T, R> {
            public static final 5 a = new 5();

            5() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((ebk) obj, "it");
                return Boolean.FALSE;
            }
        }

        /* renamed from: ekl$g$6 */
        static final class 6<T> implements ajfl<ebk> {
            public static final 6 a = new 6();

            6() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                ebk ebk = (ebk) obj;
                akcr.b(ebk, "it");
                return ebk == ebk.PRESENTING_CAPTURE_RESULT;
            }
        }

        /* renamed from: ekl$g$7 */
        static final class 7<T, R> implements ajfc<T, R> {
            public static final 7 a = new 7();

            7() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((ebk) obj, "it");
                return Boolean.FALSE;
            }
        }

        /* renamed from: ekl$g$8 */
        static final class 8<T> implements ajfl<dva> {
            public static final 8 a = new 8();

            8() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                dva dva = (dva) obj;
                akcr.b(dva, "it");
                return (dva instanceof b) || (dva instanceof a);
            }
        }

        /* renamed from: ekl$g$9 */
        static final class 9<T, R> implements ajfc<T, R> {
            public static final 9 a = new 9();

            9() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((dva) obj, "it");
                return Boolean.TRUE;
            }
        }

        /* renamed from: ekl$g$10 */
        static final class 10<T> implements ajfl<ebk> {
            private /* synthetic */ g a;

            10(g gVar) {
                this.a = gVar;
            }

            public final /* synthetic */ boolean test(Object obj) {
                ebk ebk = (ebk) obj;
                akcr.b(ebk, "it");
                return ebk == ebk.REQUESTED && ((eeb) ((Optional) this.a.a.get()).orNull()) == eeb.TIMER;
            }
        }

        /* renamed from: ekl$g$2 */
        static final class 2<T, R> implements ajfc<T, R> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((ebk) obj, "it");
                return Boolean.FALSE;
            }
        }

        g(ajdp ajdp, ajdp ajdp2, Supplier supplier) {
            this.b = ajdp;
            this.c = ajdp2;
            this.a = supplier;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajdp.a((ajdt) this.b.a((ajfl) 1.a).p(3.a), (ajdt) this.b.a((ajfl) 4.a).p(5.a), (ajdt) this.b.a((ajfl) 6.a).p(7.a), (ajdt) this.c.a((ajfl) 8.a).p(9.a)).e((ajdt) this.b.a((ajfl) new 10(this)).p(2.a)).j(ajfu.a);
        }
    }

    /* renamed from: ekl$c */
    static final class c<T> implements ajfb<Object> {
        private /* synthetic */ ekl a;

        c(ekl ekl) {
            this.a = ekl;
        }

        public final void accept(Object obj) {
            this.a.b.set(obj);
            this.a.e.a(obj);
        }
    }

    /* renamed from: ekl$b */
    static final class b<T> implements ajfb<Point> {
        private /* synthetic */ ekl a;

        b(ekl ekl) {
            this.a = ekl;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Point) obj;
            this.a.a.set(obj);
            this.a.e.a(obj);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ekl.class), "unifiedCameraActionTracker", "getUnifiedCameraActionTracker()Lcom/snap/camera/analytics/UnifiedCameraActionTracker;"), new akdc(akde.a(ekl.class), "flipCameraObservable", "getFlipCameraObservable()Lio/reactivex/Observable;"), new akdc(akde.a(ekl.class), "doubleTapObservable", "getDoubleTapObservable()Lio/reactivex/Observable;"), new akdc(akde.a(ekl.class), "flipCameraButtonVisibleObservable", "getFlipCameraButtonVisibleObservable()Lio/reactivex/Observable;")};
        a aVar = new a();
    }

    public ekl(ajdp<Object> ajdp, ekg ekg, Supplier<Optional<eeb>> supplier, ajdp<Point> ajdp2, ajdp<dva> ajdp3, ajdp<ebk> ajdp4, ajwy<Boolean> ajwy, ajwy<dnb> ajwy2) {
        aacw aacw;
        ajej f;
        akcr.b(ajdp, "externalCameraToggle");
        akcr.b(ekg, "flipCameraActivatorView");
        akcr.b(supplier, "cameraModeSelectionSupplier");
        String str = "doubleTapObservable";
        akcr.b(ajdp2, str);
        akcr.b(ajdp3, "pageVisibilityObservable");
        akcr.b(ajdp4, "captureStateObservable");
        akcr.b(ajwy, "shouldTrackUnifiedCameraActionTracker");
        akcr.b(ajwy2, "unifiedCameraActionTrackerProvider");
        this.h = ekg;
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create()");
        this.e = ajwo;
        this.i = ajxh.a(new i(ajwy, ajwy2));
        this.f = this.h.a().a((ajfl) new f(this));
        this.g = ajdp.a((ajfl) new e(this));
        this.j = ajxh.a(new h(this));
        this.k = ajxh.a(new d(this, ajdp2));
        this.l = ajxh.a(new g(ajdp4, ajdp3, supplier));
        dnb a = a();
        if (a != null) {
            ajwo = this.f;
            akcr.a(ajwo, "filteredButtonClicks");
            aacw = aacw.FLIP_BTN;
            akcr.b(ajwo, "clicksObservable");
            akcr.b(aacw, "view");
            f = ajwo.b((ajdw) a.a().l()).a((ajdw) a.a().d()).f((ajfb) new h(a, aacw));
            akcr.a((Object) f, "clicksObservable\n       …eraFps)\n                }");
            if (f != null) {
                ajvv.a(f, this.d);
            }
        }
        a = a();
        if (a != null) {
            ajwo = this.g;
            akcr.a(ajwo, "externalFlip");
            akcr.b(ajwo, "internalSignal");
            f = ajwo.b((ajdw) a.a().l()).a((ajdw) a.a().d()).f((ajfb) new g(a));
            akcr.a((Object) f, "internalSignal\n         …eraFps)\n                }");
            if (f != null) {
                ajvv.a(f, this.d);
            }
        }
        a = a();
        if (a != null) {
            ajdp c = c();
            aacw = aacw.VIEW_FINDER;
            akcr.b(c, str);
            akcr.b(aacw, "cameraUIItem");
            f = c.b((ajdw) a.a().l()).a((ajdw) a.a().d()).f((ajfb) new i(a, aacw));
            akcr.a((Object) f, "doubleTapObservable\n    …      }\n                }");
            if (f != null) {
                ajvv.a(f, this.d);
            }
        }
    }

    public final dnb a() {
        return (dnb) this.i.b();
    }

    public final ajdp<Object> b() {
        return (ajdp) this.j.b();
    }

    public final ajdp<Point> c() {
        return (ajdp) this.k.b();
    }

    public final ajdp<Boolean> d() {
        return (ajdp) this.l.b();
    }
}
