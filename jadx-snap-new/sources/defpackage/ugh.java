package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout.LayoutParams;
import defpackage.abyy.a;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ugh */
public abstract class ugh implements tyw {
    private final ajxe a = ajxh.a(e.a);
    private final ajxe b = ajxh.a(c.a);
    private final ajxe c = ajxh.a(d.a);
    private final ajxe d = ajxh.a(b.a);
    private final ajxe e = ajxh.a(a.a);
    private final ajxe f = ajxh.a(f.a);
    private uac g;
    private tyy h;
    private FrameLayout i;
    private FrameLayout j;
    private tyx k;
    private ajdv<tqd> l;
    private ajdv<tzk> m;
    private ajdv<Boolean> n;
    public boolean o;
    public final AtomicBoolean p = new AtomicBoolean(false);
    public boolean q;
    protected ajdv<String> r;
    protected ajdp<tpk> s;
    protected ajdp<Set<String>> t;
    private ajdp<MotionEvent> u;
    private ajdp<ajxw> v;

    /* renamed from: ugh$a */
    static final class a extends akcs implements akbk<ajwo<String>> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajwo();
        }
    }

    /* renamed from: ugh$b */
    static final class b extends akcs implements akbk<ajwo<tzu>> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajwo();
        }
    }

    /* renamed from: ugh$c */
    static final class c extends akcs implements akbk<ajwo<Object>> {
        public static final c a = new c();

        c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajwo();
        }
    }

    /* renamed from: ugh$d */
    static final class d extends akcs implements akbk<ajwo<tzv>> {
        public static final d a = new d();

        d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajwo();
        }
    }

    /* renamed from: ugh$e */
    static final class e extends akcs implements akbk<ajwo<tzh>> {
        public static final e a = new e();

        e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajwo();
        }
    }

    /* renamed from: ugh$f */
    static final class f extends akcs implements akbk<ajei> {
        public static final f a = new f();

        f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajei();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ugh.class), "statusPublishSubject", "getStatusPublishSubject()Lio/reactivex/subjects/PublishSubject;"), new akdc(akde.a(ugh.class), "requestPreviewExitSubject", "getRequestPreviewExitSubject()Lio/reactivex/subjects/PublishSubject;"), new akdc(akde.a(ugh.class), "requestSendToPageSubject", "getRequestSendToPageSubject()Lio/reactivex/subjects/PublishSubject;"), new akdc(akde.a(ugh.class), "requestPostToStorySubject", "getRequestPostToStorySubject()Lio/reactivex/subjects/PublishSubject;"), new akdc(akde.a(ugh.class), "editsChangedSubject", "getEditsChangedSubject()Lio/reactivex/subjects/PublishSubject;"), new akdc(akde.a(ugh.class), "toolDisposal", "getToolDisposal()Lio/reactivex/disposables/CompositeDisposable;")};
    }

    public static ImageView a(Context context, int i, int i2) {
        akcr.b(context, "context");
        ImageView imageView = new ImageView(context);
        LayoutParams layoutParams = new LayoutParams(i, i);
        layoutParams.gravity = 17;
        imageView.setScaleType(ScaleType.FIT_XY);
        imageView.setLayoutParams(layoutParams);
        imageView.setImageResource(i2);
        return imageView;
    }

    public final tyx A() {
        tyx tyx = this.k;
        if (tyx == null) {
            akcr.a("apiProvider");
        }
        return tyx;
    }

    public final ajdv<tqd> B() {
        ajdv ajdv = this.l;
        if (ajdv == null) {
            akcr.a("mediaPlayerEventObserver");
        }
        return ajdv;
    }

    public final ajdv<tzk> C() {
        ajdv ajdv = this.m;
        if (ajdv == null) {
            akcr.a("overlayEventObserver");
        }
        return ajdv;
    }

    public final ajdv<Boolean> D() {
        ajdv ajdv = this.n;
        if (ajdv == null) {
            akcr.a("blockPreviewExitObserver");
        }
        return ajdv;
    }

    public final ajdp<MotionEvent> E() {
        ajdp ajdp = this.u;
        if (ajdp == null) {
            akcr.a("previewTouchObservable");
        }
        return ajdp;
    }

    public final ajdp<ajxw> F() {
        ajdp ajdp = this.v;
        if (ajdp == null) {
            akcr.a("appIsPausedObservable");
        }
        return ajdp;
    }

    public final uac G() {
        uac uac = this.g;
        if (uac == null) {
            akcr.a("toolButton");
        }
        return uac;
    }

    public ajcx a(a aVar, int i, int i2) {
        akcr.b(aVar, "editsBuilder");
        if (this.o) {
            Object a = ajvo.a(ajhn.a);
            akcr.a(a, "Completable.complete()");
            return a;
        }
        throw new IllegalStateException("Edits must be locked before calling provideEdits");
    }

    public ajcx a(abyy abyy, boolean z) {
        Object a = ajvo.a(ajhn.a);
        akcr.a(a, "Completable.complete()");
        return a;
    }

    public uac a(Context context, tzj tzj, tzx tzx) {
        akcr.b(context, "context");
        akcr.b(tzj, "loadedDataForActivation");
        akcr.b(tzx, "clickDelegate");
        abmr.a();
        int a = ubb.a.a(context, d().d());
        FrameLayout frameLayout = tzj.b;
        View view = tzj.a;
        View a2 = ubb.a.a(context, a, d().b());
        abtc abtc = tzj.c;
        tzl d = d();
        d();
        this.g = new uac(context, frameLayout, view, a2, abtc, tzx, d, d().f(), d().g());
        uac uac = this.g;
        if (uac == null) {
            akcr.a("toolButton");
        }
        return uac;
    }

    public void a(tyz tyz) {
        akcr.b(tyz, "target");
        this.i = tyz.a();
        this.j = tyz.b();
        this.h = tyz.d();
        this.k = tyz.c();
        this.r = tyz.f();
        this.l = tyz.g();
        this.m = tyz.h();
        this.n = tyz.i();
        this.u = tyz.j();
        this.s = tyz.k();
        this.v = tyz.l();
        this.t = tyz.m();
        tyz.e().a(this);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(uac uac) {
        akcr.b(uac, "<set-?>");
        this.g = uac;
    }

    public final void a(boolean z) {
        this.o = z;
    }

    public boolean a(abyy abyy) {
        return false;
    }

    public void a_(ajdp<txr> ajdp) {
        akcr.b(ajdp, "observable");
    }

    public void c(ajdp<txr> ajdp) {
        akcr.b(ajdp, "observable");
    }

    public final ajdp<Object> e() {
        return (ajwo) this.b.b();
    }

    public final ajdp<tzv> f() {
        return s();
    }

    public final ajdp<tzu> g() {
        return t();
    }

    public boolean h() {
        return false;
    }

    public int j() {
        return 0;
    }

    public boolean k() {
        return false;
    }

    public boolean l() {
        return false;
    }

    public boolean m() {
        return false;
    }

    public final ajdp<tzh> n() {
        return r();
    }

    public final ajwo<tzh> r() {
        return (ajwo) this.a.b();
    }

    public final ajwo<tzv> s() {
        return (ajwo) this.c.b();
    }

    public final ajwo<tzu> t() {
        return (ajwo) this.d.b();
    }

    public final ajwo<String> u() {
        return (ajwo) this.e.b();
    }

    public final ajei v() {
        return (ajei) this.f.b();
    }

    public final uac w() {
        uac uac = this.g;
        if (uac == null) {
            akcr.a("toolButton");
        }
        return uac;
    }

    public final tyy x() {
        tyy tyy = this.h;
        if (tyy == null) {
            akcr.a("previewToolConfig");
        }
        return tyy;
    }

    public final FrameLayout y() {
        FrameLayout frameLayout = this.i;
        if (frameLayout == null) {
            akcr.a("layerLayout");
        }
        return frameLayout;
    }

    public final FrameLayout z() {
        FrameLayout frameLayout = this.j;
        if (frameLayout == null) {
            akcr.a("toolLayout");
        }
        return frameLayout;
    }
}
