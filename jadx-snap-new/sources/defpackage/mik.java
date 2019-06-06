package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

/* renamed from: mik */
final class mik implements AnimatorListener {
    private final akbk<ajxw> a;
    private final akbk<ajxw> b;
    private final akbk<ajxw> c;
    private final akbk<ajxw> d;

    /* renamed from: mik$1 */
    static final class 1 extends akcs implements akbk<ajxw> {
        public static final 1 a = new 1();

        1() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return ajxw.a;
        }
    }

    /* renamed from: mik$3 */
    static final class 3 extends akcs implements akbk<ajxw> {
        public static final 3 a = new 3();

        3() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return ajxw.a;
        }
    }

    /* renamed from: mik$4 */
    static final class 4 extends akcs implements akbk<ajxw> {
        public static final 4 a = new 4();

        4() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return ajxw.a;
        }
    }

    /* renamed from: mik$2 */
    static final class 2 extends akcs implements akbk<ajxw> {
        public static final 2 a = new 2();

        2() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return ajxw.a;
        }
    }

    public mik() {
        this(null, null, null, null, 15);
    }

    public mik(akbk<ajxw> akbk, akbk<ajxw> akbk2, akbk<ajxw> akbk3, akbk<ajxw> akbk4) {
        akcr.b(akbk, "onAnimationRepeat");
        akcr.b(akbk2, "onAnimationEnd");
        akcr.b(akbk3, "onAnimationCancel");
        akcr.b(akbk4, "onAnimationStart");
        this.a = akbk;
        this.b = akbk2;
        this.c = akbk3;
        this.d = akbk4;
    }

    public /* synthetic */ mik(akbk akbk, akbk akbk2, akbk akbk3, akbk akbk4, int i) {
        if ((i & 1) != 0) {
            akbk = 1.a;
        }
        if ((i & 2) != 0) {
            akbk2 = 2.a;
        }
        if ((i & 4) != 0) {
            akbk3 = 3.a;
        }
        if ((i & 8) != 0) {
            akbk4 = 4.a;
        }
        this(akbk, akbk2, akbk3, akbk4);
    }

    public final void onAnimationCancel(Animator animator) {
        akcr.b(animator, "animator");
        this.c.invoke();
    }

    public final void onAnimationEnd(Animator animator) {
        akcr.b(animator, "animator");
        this.b.invoke();
    }

    public final void onAnimationRepeat(Animator animator) {
        akcr.b(animator, "animator");
        this.a.invoke();
    }

    public final void onAnimationStart(Animator animator) {
        akcr.b(animator, "animator");
        this.d.invoke();
    }
}
