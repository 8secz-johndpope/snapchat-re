package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.b;
import android.support.design.widget.CoordinatorLayout.e;
import android.support.design.widget.SwipeDismissBehavior;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.snapchat.android.R;
import defpackage.cj.a;

/* renamed from: cm */
public abstract class cm<B extends cm<B>> {
    static final Handler a = new Handler(Looper.getMainLooper(), new 1());
    static final boolean b;
    final ViewGroup c;
    final e d;
    final b e;
    private final AccessibilityManager f;

    /* renamed from: cm$10 */
    class 10 implements AnimationListener {
        10() {
        }

        public final void onAnimationEnd(Animation animation) {
            cm.this.b();
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: cm$1 */
    static class 1 implements Callback {
        1() {
        }

        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                cm cmVar = (cm) message.obj;
                if (cmVar.d.getParent() == null) {
                    LayoutParams layoutParams = cmVar.d.getLayoutParams();
                    if (layoutParams instanceof e) {
                        e eVar = (e) layoutParams;
                        b aVar = new a();
                        aVar.e = SwipeDismissBehavior.a(0.1f);
                        aVar.f = SwipeDismissBehavior.a(0.6f);
                        aVar.c = 0;
                        aVar.b = new 5();
                        eVar.a(aVar);
                        eVar.g = 80;
                    }
                    cmVar.c.addView(cmVar.d);
                }
                cmVar.d.b = new 6();
                if (!kb.a.q(cmVar.d)) {
                    cmVar.d.a = new 7();
                } else if (cmVar.d()) {
                    cmVar.a();
                } else {
                    cmVar.b();
                }
                return true;
            } else if (i != 1) {
                return false;
            } else {
                cm cmVar2 = (cm) message.obj;
                int i2 = message.arg1;
                if (!cmVar2.d() || cmVar2.d.getVisibility() != 0) {
                    cmVar2.c();
                } else if (VERSION.SDK_INT >= 12) {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    valueAnimator.setIntValues(new int[]{0, cmVar2.d.getHeight()});
                    valueAnimator.setInterpolator(cl.a);
                    valueAnimator.setDuration(250);
                    valueAnimator.addListener(new 2(i2));
                    valueAnimator.addUpdateListener(new 3());
                    valueAnimator.start();
                } else {
                    Animation loadAnimation = AnimationUtils.loadAnimation(cmVar2.d.getContext(), R.anim.design_snackbar_out);
                    loadAnimation.setInterpolator(cl.a);
                    loadAnimation.setDuration(250);
                    loadAnimation.setAnimationListener(new 4(i2));
                    cmVar2.d.startAnimation(loadAnimation);
                }
                return true;
            }
        }
    }

    /* renamed from: cm$2 */
    class 2 extends AnimatorListenerAdapter {
        private /* synthetic */ int a;

        2(int i) {
            this.a = i;
        }

        public final void onAnimationEnd(Animator animator) {
            cm.this.c();
        }

        public final void onAnimationStart(Animator animator) {
            cm.this.e.b();
        }
    }

    /* renamed from: cm$3 */
    class 3 implements AnimatorUpdateListener {
        private int a = 0;

        3() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (cm.b) {
                kb.b(cm.this.d, intValue - this.a);
            } else {
                cm.this.d.setTranslationY((float) intValue);
            }
            this.a = intValue;
        }
    }

    /* renamed from: cm$4 */
    class 4 implements AnimationListener {
        private /* synthetic */ int a;

        4(int i) {
            this.a = i;
        }

        public final void onAnimationEnd(Animation animation) {
            cm.this.c();
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: cm$8 */
    class 8 extends AnimatorListenerAdapter {
        8() {
        }

        public final void onAnimationEnd(Animator animator) {
            cm.this.b();
        }

        public final void onAnimationStart(Animator animator) {
            cm.this.e.a();
        }
    }

    /* renamed from: cm$b */
    public interface b {
        void a();

        void b();
    }

    /* renamed from: cm$c */
    interface c {
        void a();
    }

    /* renamed from: cm$d */
    interface d {
        void a();
    }

    /* renamed from: cm$e */
    public static class e extends FrameLayout {
        d a;
        c b;

        protected e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.i);
            if (obtainStyledAttributes.hasValue(1)) {
                kb.a((View) this, (float) obtainStyledAttributes.getDimensionPixelSize(1, 0));
            }
            obtainStyledAttributes.recycle();
            setClickable(true);
        }

        /* Access modifiers changed, original: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            kb.a.g(this);
        }

        /* Access modifiers changed, original: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            c cVar = this.b;
            if (cVar != null) {
                cVar.a();
            }
        }

        /* Access modifiers changed, original: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            d dVar = this.a;
            if (dVar != null) {
                dVar.a();
            }
        }
    }

    /* renamed from: cm$5 */
    class 5 implements SwipeDismissBehavior.a {
        5() {
        }

        public final void a(int i) {
            if (i == 0) {
                cu.a();
            } else if (i == 1 || i == 2) {
                cu.a();
            }
        }

        public final void a(View view) {
            view.setVisibility(8);
            synchronized (cu.a().a) {
            }
        }
    }

    /* renamed from: cm$6 */
    class 6 implements c {
        6() {
        }

        public final void a() {
            cu.a();
        }
    }

    /* renamed from: cm$7 */
    class 7 implements d {
        7() {
        }

        public final void a() {
            cm.this.d.a = null;
            if (cm.this.d()) {
                cm.this.a();
            } else {
                cm.this.b();
            }
        }
    }

    /* renamed from: cm$a */
    final class a extends SwipeDismissBehavior<e> {
        a() {
        }

        public final /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            view = (e) view;
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0 ? !coordinatorLayout.a(view, (int) motionEvent.getX(), (int) motionEvent.getY()) : !(actionMasked == 1 || actionMasked == 3)) {
                cu.a();
            }
            return super.a(coordinatorLayout, view, motionEvent);
        }

        public final boolean b(View view) {
            return view instanceof e;
        }
    }

    static {
        boolean z = VERSION.SDK_INT >= 16 && VERSION.SDK_INT <= 19;
        b = z;
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        if (VERSION.SDK_INT >= 12) {
            final int height = this.d.getHeight();
            if (b) {
                kb.b(this.d, height);
            } else {
                this.d.setTranslationY((float) height);
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(new int[]{height, 0});
            valueAnimator.setInterpolator(cl.a);
            valueAnimator.setDuration(250);
            valueAnimator.addListener(new 8());
            valueAnimator.addUpdateListener(new AnimatorUpdateListener() {
                private int a = height;

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    if (cm.b) {
                        kb.b(cm.this.d, intValue - this.a);
                    } else {
                        cm.this.d.setTranslationY((float) intValue);
                    }
                    this.a = intValue;
                }
            });
            valueAnimator.start();
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this.d.getContext(), R.anim.design_snackbar_in);
        loadAnimation.setInterpolator(cl.a);
        loadAnimation.setDuration(250);
        loadAnimation.setAnimationListener(new 10());
        this.d.startAnimation(loadAnimation);
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        synchronized (cu.a().a) {
        }
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        synchronized (cu.a().a) {
        }
        if (VERSION.SDK_INT < 11) {
            this.d.setVisibility(8);
        }
        ViewParent parent = this.d.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.d);
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean d() {
        return !this.f.isEnabled();
    }
}
