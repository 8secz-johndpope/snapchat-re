package com.snap.lenses.camera.slug;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.abtw;
import defpackage.ajdp;
import defpackage.ajdt;
import defpackage.ajfc;
import defpackage.ajpy;
import defpackage.ajwo;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxk;
import defpackage.ajxt;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.aqd;
import defpackage.cfl;
import defpackage.mde;
import defpackage.mih;

public final class DefaultSponsoredSlugView extends FrameLayout implements mde {
    final ajwo<MotionEvent> a;
    private int b;
    private String c;
    private final long d;
    private final ajxe e;
    private final ObjectAnimator f;
    private TextView g;
    private ViewGroup h;
    private final ajxe i;

    public static final class a extends AnimatorListenerAdapter {
        private /* synthetic */ DefaultSponsoredSlugView a;

        public a(DefaultSponsoredSlugView defaultSponsoredSlugView) {
            this.a = defaultSponsoredSlugView;
        }

        public final void onAnimationEnd(Animator animator) {
            akcr.b(animator, "animation");
            DefaultSponsoredSlugView.a(this.a).setClickable(false);
        }
    }

    public static final class b extends AnimatorListenerAdapter {
        private /* synthetic */ DefaultSponsoredSlugView a;

        public b(DefaultSponsoredSlugView defaultSponsoredSlugView) {
            this.a = defaultSponsoredSlugView;
        }

        public final void onAnimationCancel(Animator animator) {
            DefaultSponsoredSlugView.a(this.a).setClickable(true);
        }
    }

    static final class d extends akcs implements akbk<Boolean> {
        private /* synthetic */ DefaultSponsoredSlugView a;

        d(DefaultSponsoredSlugView defaultSponsoredSlugView) {
            this.a = defaultSponsoredSlugView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(abtw.a(this.a.getContext()) ^ 1);
        }
    }

    static final class c extends akcs implements akbk<ajdp<defpackage.mde.a>> {
        private /* synthetic */ DefaultSponsoredSlugView a;

        static final class a<T, R> implements ajfc<T, R> {
            public static final a a = new a();

            a() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b(obj, "it");
                return defpackage.mde.a.a.a;
            }
        }

        static final class b<T, R> implements ajfc<T, R> {
            public static final b a = new b();

            b() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((MotionEvent) obj, "it");
                return defpackage.mde.a.b.a;
            }
        }

        c(DefaultSponsoredSlugView defaultSponsoredSlugView) {
            this.a = defaultSponsoredSlugView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajpy.k(cfl.c(DefaultSponsoredSlugView.a(this.a)).p(a.a).e((ajdt) this.a.a.p(b.a))).a();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(DefaultSponsoredSlugView.class), "isAnimationEnabled", "isAnimationEnabled()Z"), new akdc(akde.a(DefaultSponsoredSlugView.class), aqd.a, "getEvents()Lio/reactivex/Observable;")};
    }

    public DefaultSponsoredSlugView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private DefaultSponsoredSlugView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        this.c = "";
        this.d = 500;
        this.e = ajxh.a(new d(this));
        Object duration = ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), MapboxConstants.MINIMUM_ZOOM}).setDuration(500);
        akcr.a(duration, "ObjectAnimator\n         …fadeoutAnimationDuration)");
        Animator animator = (Animator) duration;
        animator.addListener(new a(this));
        animator.addListener(new b(this));
        this.f = duration;
        duration = new ajwo();
        akcr.a(duration, "PublishSubject.create<MotionEvent>()");
        this.a = duration;
        this.i = ajxh.a(new c(this));
    }

    public static final /* synthetic */ ViewGroup a(DefaultSponsoredSlugView defaultSponsoredSlugView) {
        ViewGroup viewGroup = defaultSponsoredSlugView.h;
        if (viewGroup == null) {
            akcr.a("backgroundView");
        }
        return viewGroup;
    }

    private final boolean b() {
        return ((Boolean) this.e.b()).booleanValue();
    }

    private final void c() {
        setAlpha(MapboxConstants.MINIMUM_ZOOM);
        ViewGroup viewGroup = this.h;
        if (viewGroup == null) {
            akcr.a("backgroundView");
        }
        viewGroup.setClickable(false);
    }

    private final void d() {
        if (this.f.isRunning()) {
            this.f.cancel();
        }
    }

    public final ajdp<defpackage.mde.a> a() {
        return (ajdp) this.i.b();
    }

    public final /* synthetic */ void accept(Object obj) {
        defpackage.mde.b bVar = (defpackage.mde.b) obj;
        akcr.b(bVar, "viewModel");
        if (bVar instanceof defpackage.mde.b.b) {
            boolean z = ((defpackage.mde.b.b) bVar).a;
            if (b()) {
                d();
                if (z) {
                    this.f.start();
                    return;
                } else {
                    c();
                    return;
                }
            }
            c();
            return;
        }
        if (bVar instanceof defpackage.mde.b.a) {
            defpackage.mde.b.a aVar = (defpackage.mde.b.a) bVar;
            defpackage.mws.b bVar2 = aVar.a;
            mih mih = aVar.b;
            setVisibility(0);
            setAlpha(1.0f);
            ViewGroup viewGroup = this.h;
            if (viewGroup == null) {
                akcr.a("backgroundView");
            }
            viewGroup.setClickable(true);
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                String str;
                ((FrameLayout.LayoutParams) layoutParams).topMargin = mih.b + this.b;
                TextView textView = this.g;
                if (textView == null) {
                    akcr.a("textView");
                }
                defpackage.mws.b.b bVar3 = bVar2.a;
                if (bVar3 instanceof defpackage.mws.b.b.a) {
                    str = ((defpackage.mws.b.b.a) bVar3).a;
                } else if (bVar3 instanceof defpackage.mws.b.b.b) {
                    str = this.c;
                } else {
                    throw new ajxk();
                }
                textView.setText(str);
                if (b()) {
                    d();
                }
            } else {
                throw new ajxt("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        setVisibility(8);
        Resources resources = getResources();
        this.b = resources.getDimensionPixelSize(R.dimen.sponsored_slug_v3_bg_vertical_margin);
        Object string = resources.getString(R.string.lens_sponsored_slug_sponsored);
        akcr.a(string, "res.getString(R.string.l…sponsored_slug_sponsored)");
        this.c = string;
        string = findViewById(R.id.lenses_camera_slug_background_view);
        akcr.a(string, "findViewById(R.id.lenses…era_slug_background_view)");
        this.h = (ViewGroup) string;
        string = findViewById(R.id.lenses_camera_slug_text_view);
        akcr.a(string, "findViewById(R.id.lenses_camera_slug_text_view)");
        this.g = (TextView) string;
        TextView textView = this.g;
        if (textView == null) {
            akcr.a("textView");
        }
        textView.setTypeface(Typeface.create(defpackage.zkh.a.AVENIR_NEXT_BOLD.name(), 0));
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            this.a.a((Object) motionEvent);
        }
        return false;
    }
}
