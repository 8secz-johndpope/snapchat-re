package com.snap.lenses.camera.snappables.startbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import com.snapchat.android.framework.ui.views.LoadingSpinnerView;
import defpackage.abur;
import defpackage.ajdp;
import defpackage.ajpy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxt;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.aqd;
import defpackage.azs;
import defpackage.azt;
import defpackage.azu;
import defpackage.azv;
import defpackage.azx;
import defpackage.cfl;
import defpackage.iho;
import defpackage.mfi;
import defpackage.mfu;

public final class DefaultStartButtonView extends FrameLayout implements mfu {
    int a;
    private int b;
    private boolean c;
    private View d;
    private View e;
    private View f;
    private abur<LoadingSpinnerView> g;
    private ValueAnimator h;
    private ValueAnimator i;
    private Animator j;
    private final ajxe k;
    private final ajxe l;
    private final ajxe m;
    private boolean n;
    private final ajxe o;

    static final class a extends Drawable {
        private final Paint a;
        private final int b;
        private final int c;

        private a(int i) {
            this.b = i;
            this.c = -1;
            Paint paint = new Paint(1);
            paint.setStyle(Style.STROKE);
            paint.setStrokeWidth((float) this.b);
            paint.setColor(-1);
            this.a = paint;
        }

        public /* synthetic */ a(int i, byte b) {
            this(i);
        }

        public final void draw(Canvas canvas) {
            akcr.b(canvas, "canvas");
            int i = this.b;
            int width = getBounds().width();
            int height = getBounds().height();
            canvas.drawCircle(((float) width) / 2.0f, ((float) height) / 2.0f, ((float) (Math.min(width, height) - i)) / 2.0f, this.a);
        }

        public final int getOpacity() {
            return -2;
        }

        public final void setAlpha(int i) {
            this.a.setAlpha(i);
        }

        public final void setColorFilter(ColorFilter colorFilter) {
            akcr.b(colorFilter, "colorFilter");
            this.a.setColorFilter(colorFilter);
        }
    }

    static final class j extends akcs implements akbk<Drawable> {
        private /* synthetic */ DefaultStartButtonView a;

        j(DefaultStartButtonView defaultStartButtonView) {
            this.a = defaultStartButtonView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return DefaultStartButtonView.a(this.a.a, mfi.a(this.a, R.color.start_button_default_ready_gradient_start), mfi.a(this.a, R.color.start_button_default_ready_gradient_end));
        }
    }

    static final class i extends akcs implements akbk<Drawable> {
        private /* synthetic */ DefaultStartButtonView a;

        i(DefaultStartButtonView defaultStartButtonView) {
            this.a = defaultStartButtonView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return DefaultStartButtonView.a(this.a.a, mfi.a(this.a, R.color.start_button_default_loading_gradient_start), mfi.a(this.a, R.color.start_button_default_loading_gradient_end));
        }
    }

    static final class l extends akcs implements akbk<azt> {
        final /* synthetic */ DefaultStartButtonView a;

        public static final class a extends azs {
            private /* synthetic */ l a;

            public a(l lVar) {
                this.a = lVar;
            }

            public final void onSpringUpdate(azt azt) {
                akcr.b(azt, "spring");
                float f = (float) azt.d.a;
                this.a.a.setScaleX(f);
                this.a.a.setScaleY(f);
            }
        }

        l(DefaultStartButtonView defaultStartButtonView) {
            this.a = defaultStartButtonView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            azt a = azx.b().a();
            a.a(new azu(420.0d, 32.0d));
            a.a((azv) new a(this));
            return a;
        }
    }

    static final class k extends akcs implements akbk<ajdp<defpackage.mfu.a>> {
        private /* synthetic */ DefaultStartButtonView a;

        k(DefaultStartButtonView defaultStartButtonView) {
            this.a = defaultStartButtonView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajpy.k(cfl.c(this.a).p(AnonymousClass1.a)).a();
        }
    }

    static final class b implements AnimatorUpdateListener {
        private /* synthetic */ DefaultStartButtonView a;

        b(DefaultStartButtonView defaultStartButtonView) {
            this.a = defaultStartButtonView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            DefaultStartButtonView defaultStartButtonView = this.a;
            akcr.a((Object) valueAnimator, "value");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                defaultStartButtonView.setAlpha(((Float) animatedValue).floatValue());
                return;
            }
            throw new ajxt("null cannot be cast to non-null type kotlin.Float");
        }
    }

    public static final class c extends AnimatorListenerAdapter {
        private /* synthetic */ Animator a;
        private /* synthetic */ DefaultStartButtonView b;

        public c(Animator animator, DefaultStartButtonView defaultStartButtonView) {
            this.a = animator;
            this.b = defaultStartButtonView;
        }

        public final void onAnimationCancel(Animator animator) {
            this.a.removeAllListeners();
        }

        public final void onAnimationEnd(Animator animator) {
            akcr.b(animator, "animation");
            this.b.setVisibility(8);
        }
    }

    static final class d implements AnimatorUpdateListener {
        private /* synthetic */ DefaultStartButtonView a;

        d(DefaultStartButtonView defaultStartButtonView) {
            this.a = defaultStartButtonView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            DefaultStartButtonView defaultStartButtonView = this.a;
            akcr.a((Object) valueAnimator, "value");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                defaultStartButtonView.setAlpha(((Float) animatedValue).floatValue());
                return;
            }
            throw new ajxt("null cannot be cast to non-null type kotlin.Float");
        }
    }

    static final class e implements AnimatorUpdateListener {
        private /* synthetic */ DefaultStartButtonView a;
        private /* synthetic */ LoadingSpinnerView b;

        e(DefaultStartButtonView defaultStartButtonView, LoadingSpinnerView loadingSpinnerView) {
            this.a = defaultStartButtonView;
            this.b = loadingSpinnerView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            akcr.a((Object) valueAnimator, "value");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                DefaultStartButtonView.a(this.a).setAlpha(floatValue);
                DefaultStartButtonView.b(this.a).setAlpha(floatValue);
                Object obj = this.b;
                akcr.a(obj, "spinner");
                obj.setAlpha(1.0f - floatValue);
                return;
            }
            throw new ajxt("null cannot be cast to non-null type kotlin.Float");
        }
    }

    public static final class f extends AnimatorListenerAdapter {
        private /* synthetic */ Animator a;
        private /* synthetic */ DefaultStartButtonView b;
        private /* synthetic */ LoadingSpinnerView c;

        public f(Animator animator, DefaultStartButtonView defaultStartButtonView, LoadingSpinnerView loadingSpinnerView) {
            this.a = animator;
            this.b = defaultStartButtonView;
            this.c = loadingSpinnerView;
        }

        public final void onAnimationCancel(Animator animator) {
            this.a.removeAllListeners();
        }

        public final void onAnimationEnd(Animator animator) {
            akcr.b(animator, "animation");
            Object obj = this.c;
            akcr.a(obj, "spinner");
            obj.setVisibility(8);
        }
    }

    static final class g implements AnimatorUpdateListener {
        private /* synthetic */ DefaultStartButtonView a;
        private /* synthetic */ LoadingSpinnerView b;

        g(DefaultStartButtonView defaultStartButtonView, LoadingSpinnerView loadingSpinnerView) {
            this.a = defaultStartButtonView;
            this.b = loadingSpinnerView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            akcr.a((Object) valueAnimator, "value");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                float f = 1.0f - floatValue;
                DefaultStartButtonView.a(this.a).setAlpha(f);
                DefaultStartButtonView.b(this.a).setAlpha(f);
                Object obj = this.b;
                akcr.a(obj, "spinner");
                obj.setAlpha(floatValue);
                return;
            }
            throw new ajxt("null cannot be cast to non-null type kotlin.Float");
        }
    }

    public static final class h extends AnimatorListenerAdapter {
        private /* synthetic */ Animator a;
        private /* synthetic */ DefaultStartButtonView b;
        private /* synthetic */ LoadingSpinnerView c;

        public h(Animator animator, DefaultStartButtonView defaultStartButtonView, LoadingSpinnerView loadingSpinnerView) {
            this.a = animator;
            this.b = defaultStartButtonView;
            this.c = loadingSpinnerView;
        }

        public final void onAnimationCancel(Animator animator) {
            this.a.removeAllListeners();
        }

        public final void onAnimationEnd(Animator animator) {
            akcr.b(animator, "animation");
            DefaultStartButtonView.a(this.b).setVisibility(8);
            DefaultStartButtonView.b(this.b).setVisibility(8);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(DefaultStartButtonView.class), "defaultReadyBackground", "getDefaultReadyBackground()Landroid/graphics/drawable/Drawable;"), new akdc(akde.a(DefaultStartButtonView.class), "defaultLoadingBackground", "getDefaultLoadingBackground()Landroid/graphics/drawable/Drawable;"), new akdc(akde.a(DefaultStartButtonView.class), "spring", "getSpring()Lcom/facebook/rebound/Spring;"), new akdc(akde.a(DefaultStartButtonView.class), aqd.a, "getEvents()Lio/reactivex/Observable;")};
    }

    public DefaultStartButtonView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private DefaultStartButtonView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        this.k = ajxh.a(new j(this));
        this.l = ajxh.a(new i(this));
        this.m = ajxh.a(new l(this));
        this.o = ajxh.a(new k(this));
    }

    public static final /* synthetic */ Drawable a(int i, int... iArr) {
        new GradientDrawable(Orientation.TOP_BOTTOM, iArr).setShape(1);
        a aVar = new a(i, (byte) 0);
        return new LayerDrawable(new Drawable[]{r0, aVar});
    }

    private void a(boolean z) {
        View view = this.d;
        if (view == null) {
            akcr.a("content");
        }
        view.setBackground(z ? (Drawable) this.l.b() : b());
        String str = "loadingSpinner";
        if (z) {
            abur abur = this.g;
            if (abur == null) {
                akcr.a(str);
            }
            ((LoadingSpinnerView) abur.a()).b(1);
        }
        if (this.n != z) {
            ValueAnimator ofFloat;
            Animator animator;
            h hVar;
            abur abur2;
            Animator animator2;
            if (z) {
                abur2 = this.g;
                if (abur2 == null) {
                    akcr.a(str);
                }
                Object obj = (LoadingSpinnerView) abur2.a();
                akcr.a(obj, "spinner");
                obj.setVisibility(0);
                animator2 = this.j;
                if (animator2 != null) {
                    animator2.cancel();
                }
                ofFloat = ValueAnimator.ofFloat(new float[]{MapboxConstants.MINIMUM_ZOOM, 1.0f});
                ofFloat.setDuration(150);
                ofFloat.addUpdateListener(new g(this, obj));
                animator = ofFloat;
                hVar = new h(animator, this, obj);
            } else {
                abur2 = this.g;
                if (abur2 == null) {
                    akcr.a(str);
                }
                LoadingSpinnerView loadingSpinnerView = (LoadingSpinnerView) abur2.a();
                View view2 = this.f;
                if (view2 == null) {
                    akcr.a("start");
                }
                view2.setVisibility(0);
                view2 = this.e;
                if (view2 == null) {
                    akcr.a("glare");
                }
                view2.setVisibility(0);
                animator2 = this.j;
                if (animator2 != null) {
                    animator2.cancel();
                }
                ofFloat = ValueAnimator.ofFloat(new float[]{MapboxConstants.MINIMUM_ZOOM, 1.0f});
                ofFloat.setDuration(150);
                ofFloat.addUpdateListener(new e(this, loadingSpinnerView));
                animator = ofFloat;
                hVar = new f(animator, this, loadingSpinnerView);
            }
            animator.addListener(hVar);
            ofFloat.start();
            this.j = animator;
            this.n = z;
        }
    }

    private final Drawable b() {
        return (Drawable) this.k.b();
    }

    public static final /* synthetic */ View b(DefaultStartButtonView defaultStartButtonView) {
        View view = defaultStartButtonView.e;
        if (view == null) {
            akcr.a("glare");
        }
        return view;
    }

    private final azt c() {
        return (azt) this.m.b();
    }

    private void d() {
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        valueAnimator = this.i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        setVisibility(0);
        c().b(1.0d);
        valueAnimator = ValueAnimator.ofFloat(new float[]{getAlpha(), 1.0f});
        valueAnimator.setDuration(150);
        valueAnimator.addUpdateListener(new b(this));
        valueAnimator.start();
        this.h = valueAnimator;
    }

    public final ajdp<defpackage.mfu.a> a() {
        return (ajdp) this.o.b();
    }

    /* JADX WARNING: Missing block: B:13:0x0035, code skipped:
            if (r1 != false) goto L_0x0037;
     */
    public final /* synthetic */ void accept(java.lang.Object r6) {
        /*
        r5 = this;
        r6 = (defpackage.mfu.b) r6;
        r0 = "viewModel";
        defpackage.akcr.b(r6, r0);
        r0 = defpackage.mfu.b.b.a.a;
        r0 = defpackage.akcr.a(r6, r0);
        r1 = 1;
        if (r0 == 0) goto L_0x0017;
    L_0x0010:
        r5.a(r1);
        r5.d();
        return;
    L_0x0017:
        r0 = defpackage.mfu.b.b.b.a;
        r0 = defpackage.akcr.a(r6, r0);
        r2 = 0;
        if (r0 == 0) goto L_0x003b;
    L_0x0020:
        r5.a(r2);
        r6 = r5.getVisibility();
        if (r6 != 0) goto L_0x0037;
    L_0x0029:
        r6 = r5.i;
        if (r6 == 0) goto L_0x0034;
    L_0x002d:
        r6 = r6.isRunning();
        if (r6 != r1) goto L_0x0034;
    L_0x0033:
        goto L_0x0035;
    L_0x0034:
        r1 = 0;
    L_0x0035:
        if (r1 == 0) goto L_0x008e;
    L_0x0037:
        r5.d();
        return;
    L_0x003b:
        r0 = defpackage.mfu.b.a.a;
        r6 = defpackage.akcr.a(r6, r0);
        if (r6 == 0) goto L_0x008e;
    L_0x0043:
        r6 = r5.h;
        if (r6 == 0) goto L_0x004a;
    L_0x0047:
        r6.cancel();
    L_0x004a:
        r6 = r5.i;
        if (r6 == 0) goto L_0x0051;
    L_0x004e:
        r6.cancel();
    L_0x0051:
        r6 = r5.c();
        r3 = 4603759683083215831; // 0x3fe3d70a3d70a3d7 float:0.05875 double:0.62;
        r6.b(r3);
        r6 = 2;
        r6 = new float[r6];
        r0 = r5.getAlpha();
        r6[r2] = r0;
        r0 = 0;
        r6[r1] = r0;
        r6 = android.animation.ValueAnimator.ofFloat(r6);
        r0 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        r6.setDuration(r0);
        r0 = r6;
        r0 = (android.animation.Animator) r0;
        r1 = new com.snap.lenses.camera.snappables.startbutton.DefaultStartButtonView$c;
        r1.<init>(r0, r5);
        r1 = (android.animation.Animator.AnimatorListener) r1;
        r0.addListener(r1);
        r0 = new com.snap.lenses.camera.snappables.startbutton.DefaultStartButtonView$d;
        r0.<init>(r5);
        r0 = (android.animation.ValueAnimator.AnimatorUpdateListener) r0;
        r6.addUpdateListener(r0);
        r6.start();
        r5.i = r6;
    L_0x008e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.lenses.camera.snappables.startbutton.DefaultStartButtonView.accept(java.lang.Object):void");
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (!this.c) {
            this.a = getResources().getDimensionPixelOffset(R.dimen.start_button_stroke_width_default);
            this.b = getResources().getDimensionPixelOffset(R.dimen.start_button_glare_padding_default);
            View.inflate(getContext(), R.layout.lenses_start_button, this);
            Object findViewById = findViewById(R.id.lenses_start_button_content);
            akcr.a(findViewById, "findViewById(R.id.lenses_start_button_content)");
            this.d = findViewById;
            View view = this.d;
            if (view == null) {
                akcr.a("content");
            }
            view.setBackground(b());
            findViewById = findViewById(R.id.lenses_start_button_glare);
            akcr.a(findViewById, "findViewById(R.id.lenses_start_button_glare)");
            this.e = findViewById;
            view = this.e;
            if (view == null) {
                akcr.a("glare");
            }
            iho.a(view, this.b);
            findViewById = findViewById(R.id.lenses_start_button_start);
            akcr.a(findViewById, "findViewById(R.id.lenses_start_button_start)");
            this.f = findViewById;
            this.g = new abur((View) this, (int) R.id.lenses_start_button_spinner_stub, (int) R.id.lenses_start_button_spinner);
            this.c = true;
        }
    }
}
