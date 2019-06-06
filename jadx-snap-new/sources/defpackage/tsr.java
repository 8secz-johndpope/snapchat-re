package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.snap.ui.view.ViewFinder;
import com.snapchat.android.R;
import defpackage.tst.a.a;

/* renamed from: tsr */
public final class tsr implements tpw {
    final ajei a = new ajei();
    final Object b = new Object();
    final ajxe c = ajxh.a(new a(this));
    final a d;
    private final String e = "BasicToolsActivator";
    private ViewGroup f;
    private zfw g;
    private final zgb h;
    private final toc i;
    private final zkq j;
    private final ajdp<Boolean> k;
    private final ajdp<Boolean> l;
    private final ajdp<tpd> m;
    private final ViewFinder n;

    /* renamed from: tsr$a */
    static final class a extends akcs implements akbk<tsq> {
        private /* synthetic */ tsr a;

        a(tsr tsr) {
            this.a = tsr;
            super(0);
        }

        private tsq a() {
            tsq a;
            synchronized (this.a.b) {
                a = this.a.d.a().a();
                ajvv.a(a.start(), this.a.a);
            }
            return a;
        }

        public final /* synthetic */ Object invoke() {
            return a();
        }
    }

    /* renamed from: tsr$b */
    static final class b<T> implements ajfb<tpd> {
        private /* synthetic */ tsr a;

        b(tsr tsr) {
            this.a = tsr;
        }

        public final /* synthetic */ void accept(Object obj) {
            tpd tpd = (tpd) obj;
            if (tpd != null) {
                int i = tss.a[tpd.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        this.a.b().setVisibility(0);
                    }
                    return;
                }
                this.a.b().setVisibility(8);
            }
        }
    }

    /* renamed from: tsr$c */
    static final class c<T> implements ajfb<Rect> {
        private /* synthetic */ tsr a;

        c(tsr tsr) {
            this.a = tsr;
        }

        public final /* synthetic */ void accept(Object obj) {
            Rect rect = (Rect) obj;
            LayoutParams layoutParams = this.a.b().getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = rect.bottom;
                marginLayoutParams.topMargin = rect.top;
                this.a.b().setLayoutParams(marginLayoutParams);
                return;
            }
            throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: tsr$d */
    static final class d<T> implements ajfb<Boolean> {
        private /* synthetic */ tsr a;

        d(tsr tsr) {
            this.a = tsr;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            tsq tsq = (tsq) this.a.c.b();
            akcr.a(obj, "it");
            String str = "animator";
            zin zin;
            if (obj.booleanValue()) {
                zin = tsq.a;
                if (zin == null) {
                    akcr.a(str);
                }
                zin.a();
                return;
            }
            zin = tsq.a;
            if (zin == null) {
                akcr.a(str);
            }
            zin.b();
        }
    }

    /* renamed from: tsr$e */
    static final class e<T> implements ajfb<Boolean> {
        private /* synthetic */ tsr a;

        e(tsr tsr) {
            this.a = tsr;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            ViewGroup b = this.a.b();
            akcr.a(obj, "it");
            b.setVisibility(obj.booleanValue() ? 8 : 0);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(tsr.class), "basicToolsPresenter", "getBasicToolsPresenter()Lcom/snap/preview/basictools/BasicToolsPresenter;");
    }

    public tsr(a aVar, zgb zgb, toc toc, zkq zkq, ajdp<Boolean> ajdp, ajdp<Boolean> ajdp2, ajdp<tpd> ajdp3, ViewFinder viewFinder) {
        akcr.b(aVar, "builder");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(toc, "previewFeature");
        akcr.b(zkq, "insetsDetector");
        akcr.b(ajdp, "animationFadeInOutObservable");
        akcr.b(ajdp2, "hideSendAndDiscardButtonsEventObservable");
        akcr.b(ajdp3, "previewControlEventObservable");
        akcr.b(viewFinder, "viewFinder");
        this.d = aVar;
        this.h = zgb;
        this.i = toc;
        this.j = zkq;
        this.k = ajdp;
        this.l = ajdp2;
        this.m = ajdp3;
        this.n = viewFinder;
    }

    public final String a() {
        return this.e;
    }

    public final ViewGroup b() {
        ViewGroup viewGroup = this.f;
        if (viewGroup == null) {
            akcr.a("parentView");
        }
        return viewGroup;
    }

    public final ajej start() {
        this.g = zgb.a(this.i.callsite("BasicToolsActivator"));
        View findViewById = this.n.findViewById(R.id.chrome);
        if (findViewById == null) {
            akcr.a();
        }
        this.f = (ViewGroup) findViewById;
        ajej f = this.m.f((ajfb) new b(this));
        akcr.a((Object) f, "previewControlEventObser…E\n            }\n        }");
        ajvv.a(f, this.a);
        f = this.j.a().f((ajfb) new c(this));
        akcr.a((Object) f, "insetsDetector.windowRec…youtParams = lp\n        }");
        ajvv.a(f, this.a);
        f = this.k.f((ajfb) new d(this));
        akcr.a((Object) f, "animationFadeInOutObserv…utAnimation(it)\n        }");
        ajvv.a(f, this.a);
        f = this.l.f((ajfb) new e(this));
        akcr.a((Object) f, "hideSendAndDiscardButton…se View.VISIBLE\n        }");
        ajvv.a(f, this.a);
        return this.a;
    }
}
