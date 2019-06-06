package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.ui.view.ViewFinder;
import com.snapchat.android.R;
import defpackage.akdd.a;

/* renamed from: eld */
public final class eld {
    final ajxe a = ajxh.a(ajxj.PUBLICATION, h.a);
    final ajxe b = ajxh.a(ajxj.PUBLICATION, g.a);
    final ajxe c = ajxh.a(ajxj.PUBLICATION, e.a);
    final ajxe d = ajxh.a(ajxj.PUBLICATION, f.a);
    final abur<ViewGroup> e;
    final ViewFinder f;
    private final ajxe g = ajxh.a(ajxj.PUBLICATION, new i(this));
    private final ajxe h = ajxh.a(ajxj.PUBLICATION, new d(this));

    /* renamed from: eld$h */
    static final class h extends akcs implements akbk<DecelerateInterpolator> {
        public static final h a = new h();

        h() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new DecelerateInterpolator(2.0f);
        }
    }

    /* renamed from: eld$g */
    static final class g extends akcs implements akbk<DecelerateInterpolator> {
        public static final g a = new g();

        g() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new DecelerateInterpolator(1.0f);
        }
    }

    /* renamed from: eld$e */
    static final class e extends akcs implements akbk<DecelerateInterpolator> {
        public static final e a = new e();

        e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new DecelerateInterpolator(2.0f);
        }
    }

    /* renamed from: eld$f */
    static final class f extends akcs implements akbk<DecelerateInterpolator> {
        public static final f a = new f();

        f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new DecelerateInterpolator(1.0f);
        }
    }

    /* renamed from: eld$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: eld$i */
    static final class i extends akcs implements akbk<Float> {
        private /* synthetic */ eld a;

        i(eld eld) {
            this.a = eld;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object a = this.a.e.a();
            akcr.a(a, "tooltipView.get()");
            a = ((ViewGroup) a).getContext();
            akcr.a(a, "tooltipView.get().context");
            return Float.valueOf(((float) a.getResources().getDimensionPixelOffset(R.dimen.map_tooltip_height)) * 2.0f);
        }
    }

    /* renamed from: eld$d */
    static final class d extends akcs implements akbk<Float> {
        private /* synthetic */ eld a;

        d(eld eld) {
            this.a = eld;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object a = this.a.e.a();
            akcr.a(a, "tooltipView.get()");
            a = ((ViewGroup) a).getContext();
            akcr.a(a, "tooltipView.get().context");
            return Float.valueOf((float) a.getResources().getDimensionPixelOffset(R.dimen.map_tooltip_arrow_travel_distance));
        }
    }

    /* renamed from: eld$c */
    public static final class c extends AnimatorListenerAdapter {
        private /* synthetic */ Animator a;
        private /* synthetic */ a b;
        private /* synthetic */ eld c;

        public c(Animator animator, a aVar, eld eld) {
            this.a = animator;
            this.b = aVar;
            this.c = eld;
        }

        public final void onAnimationCancel(Animator animator) {
            this.b.a = true;
        }

        public final void onAnimationEnd(Animator animator) {
            akcr.b(animator, "animation");
            if (!this.b.a) {
                this.c.e.a(8);
            }
        }
    }

    /* renamed from: eld$b */
    static final class b implements ajfa {
        private /* synthetic */ Animator a;
        private /* synthetic */ Animator b;

        b(Animator animator, Animator animator2) {
            this.a = animator;
            this.b = animator2;
        }

        public final void cancel() {
            this.a.cancel();
            this.b.cancel();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(eld.class), "tooltipRiseInterpolator", "getTooltipRiseInterpolator()Landroid/view/animation/DecelerateInterpolator;"), new akdc(akde.a(eld.class), "tooltipDescentInterpolator", "getTooltipDescentInterpolator()Landroid/view/animation/DecelerateInterpolator;"), new akdc(akde.a(eld.class), "headerDescentInterpolator", "getHeaderDescentInterpolator()Landroid/view/animation/DecelerateInterpolator;"), new akdc(akde.a(eld.class), "headerRiseInterpolator", "getHeaderRiseInterpolator()Landroid/view/animation/DecelerateInterpolator;"), new akdc(akde.a(eld.class), "translationDistance", "getTranslationDistance()F"), new akdc(akde.a(eld.class), "arrowTravelDistance", "getArrowTravelDistance()F")};
        a aVar = new a();
    }

    public eld(abur<ViewGroup> abur, ViewFinder viewFinder) {
        akcr.b(abur, "tooltipView");
        akcr.b(viewFinder, "viewFinder");
        this.e = abur;
        this.f = viewFinder;
    }

    private final Animator a(View view, long j) {
        AnimatorSet animatorSet = new AnimatorSet();
        Object ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f, MapboxConstants.MINIMUM_ZOOM});
        Object ofFloat2 = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{MapboxConstants.MINIMUM_ZOOM, c()});
        akcr.a(ofFloat, "alpha");
        ofFloat.setRepeatCount(-1);
        akcr.a(ofFloat2, "translation");
        ofFloat2.setRepeatCount(-1);
        animatorSet.setDuration(1000);
        animatorSet.playTogether(new Animator[]{(Animator) ofFloat, (Animator) ofFloat2});
        animatorSet.setStartDelay(j);
        animatorSet.start();
        return animatorSet;
    }

    private final float c() {
        return ((Number) this.h.b()).floatValue();
    }

    /* Access modifiers changed, original: final */
    public final float a() {
        return ((Number) this.g.b()).floatValue();
    }

    public final ajfa b() {
        View findViewById = ((ViewGroup) this.e.a()).findViewById(R.id.map_pulldown_tooltip_arrow2);
        View findViewById2 = ((ViewGroup) this.e.a()).findViewById(R.id.map_pulldown_tooltip_arrow3);
        if (findViewById == null || findViewById2 == null) {
            return null;
        }
        return new b(a((ImageView) findViewById, 0), a((ImageView) findViewById2, 250));
    }
}
