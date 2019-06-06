package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: mgx */
public final class mgx {

    /* renamed from: mgx$a */
    static final class a extends akcs implements akbk<ajxw> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return ajxw.a;
        }
    }

    /* renamed from: mgx$c */
    static final class c extends akcs implements akbk<ajxw> {
        public static final c a = new c();

        c() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return ajxw.a;
        }
    }

    /* renamed from: mgx$d */
    static final class d extends akcs implements akbk<ajxw> {
        public static final d a = new d();

        d() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return ajxw.a;
        }
    }

    /* renamed from: mgx$e */
    static final class e extends akcs implements akbk<ajxw> {
        private /* synthetic */ akbk a;

        e(akbk akbk) {
            this.a = akbk;
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            this.a.invoke();
            return ajxw.a;
        }
    }

    /* renamed from: mgx$b */
    static final class b extends akcs implements akbk<ajxw> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return ajxw.a;
        }
    }

    /* renamed from: mgx$f */
    static final class f extends akcs implements akbk<ajxw> {
        private /* synthetic */ akbk a;

        f(akbk akbk) {
            this.a = akbk;
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            this.a.invoke();
            return ajxw.a;
        }
    }

    public static final Animator a(Animator animator) {
        akcr.b(animator, "receiver$0");
        animator.setStartDelay(1000);
        return animator;
    }

    public static final Animator a(Animator animator, akbk<ajxw> akbk) {
        akcr.b(animator, "receiver$0");
        akcr.b(akbk, "block");
        animator.addListener(new mik(null, new e(akbk), null, null, 13));
        return animator;
    }

    public static ObjectAnimator a(View view, float f) {
        akcr.b(view, "target");
        r0 = new PropertyValuesHolder[2];
        r0[0] = PropertyValuesHolder.ofFloat("scaleX", new float[]{f});
        r0[1] = PropertyValuesHolder.ofFloat("scaleY", new float[]{f});
        return ObjectAnimator.ofPropertyValuesHolder(view, r0).setDuration(100);
    }

    public static final ObjectAnimator a(View view, float f, float f2, long j) {
        akcr.b(view, "target");
        r0 = new PropertyValuesHolder[3];
        r0[0] = PropertyValuesHolder.ofFloat("scaleX", new float[]{f2});
        r0[1] = PropertyValuesHolder.ofFloat("scaleY", new float[]{f2});
        r0[2] = PropertyValuesHolder.ofFloat("alpha", new float[]{f});
        return ObjectAnimator.ofPropertyValuesHolder(view, r0).setDuration(j);
    }

    public static final ObjectAnimator a(View view, float f, long j) {
        akcr.b(view, "target");
        return ObjectAnimator.ofFloat(view, "alpha", new float[]{f}).setDuration(j);
    }

    private static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, akbk<ajxw> akbk, akbk<ajxw> akbk2, akbk<ajxw> akbk3, akbk<ajxw> akbk4) {
        akcr.b(viewPropertyAnimator, "receiver$0");
        akcr.b(akbk, "animationRepeat");
        akcr.b(akbk2, "animationEnd");
        akcr.b(akbk3, "animationCancel");
        akcr.b(akbk4, "animationStart");
        viewPropertyAnimator.setListener(new mik(akbk, akbk2, akbk3, akbk4));
        return viewPropertyAnimator;
    }

    public static /* synthetic */ ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, akbk akbk, akbk akbk2, akbk akbk3, akbk akbk4, int i) {
        if ((i & 1) != 0) {
            akbk = a.a;
        }
        if ((i & 2) != 0) {
            akbk2 = b.a;
        }
        if ((i & 4) != 0) {
            akbk3 = c.a;
        }
        if ((i & 8) != 0) {
            akbk4 = d.a;
        }
        return mgx.a(viewPropertyAnimator, akbk, akbk2, akbk3, akbk4);
    }

    public static final Animator b(Animator animator, akbk<ajxw> akbk) {
        akcr.b(animator, "receiver$0");
        akcr.b(akbk, "block");
        animator.addListener(new mik(null, null, null, new f(akbk), 7));
        return animator;
    }
}
