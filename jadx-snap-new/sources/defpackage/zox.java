package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import defpackage.zom.a;

/* renamed from: zox */
public final class zox extends a {
    private static final a d = new 1();
    private static final a e = new 2();
    private static final a f = new 3();
    private static final a g = new 4();
    private a a = g;
    private int b = 80;
    private float c = 1.0f;

    /* renamed from: zox$1 */
    static class 1 extends b {
        1() {
            super();
        }

        public final float a(ViewGroup viewGroup, View view, float f) {
            return view.getTranslationX() + (((float) viewGroup.getWidth()) * f);
        }

        public final float b(ViewGroup viewGroup, View view, float f) {
            return view.getTranslationX() - (((float) viewGroup.getWidth()) * f);
        }
    }

    /* renamed from: zox$2 */
    static class 2 extends c {
        2() {
            super();
        }

        public final float c(ViewGroup viewGroup, View view, float f) {
            return view.getTranslationY() - (((float) viewGroup.getHeight()) * f);
        }

        public final float d(ViewGroup viewGroup, View view, float f) {
            return view.getTranslationY() + (((float) viewGroup.getHeight()) * f);
        }
    }

    /* renamed from: zox$3 */
    static class 3 extends b {
        3() {
            super();
        }

        public final float a(ViewGroup viewGroup, View view, float f) {
            return view.getTranslationX() - (((float) viewGroup.getWidth()) * f);
        }

        public final float b(ViewGroup viewGroup, View view, float f) {
            return view.getTranslationX() + (((float) viewGroup.getWidth()) * f);
        }
    }

    /* renamed from: zox$4 */
    static class 4 extends c {
        4() {
            super();
        }

        public final float c(ViewGroup viewGroup, View view, float f) {
            return view.getTranslationY() + (((float) viewGroup.getHeight()) * f);
        }

        public final float d(ViewGroup viewGroup, View view, float f) {
            return view.getTranslationY() - (((float) viewGroup.getHeight()) * f);
        }
    }

    /* renamed from: zox$b */
    static abstract class b implements a {
        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }

        public final float c(ViewGroup viewGroup, View view, float f) {
            return view.getTranslationY();
        }

        public final float d(ViewGroup viewGroup, View view, float f) {
            return view.getTranslationY();
        }
    }

    /* renamed from: zox$a */
    interface a {
        float a(ViewGroup viewGroup, View view, float f);

        float b(ViewGroup viewGroup, View view, float f);

        float c(ViewGroup viewGroup, View view, float f);

        float d(ViewGroup viewGroup, View view, float f);
    }

    /* renamed from: zox$c */
    static abstract class c implements a {
        private c() {
        }

        /* synthetic */ c(byte b) {
            this();
        }

        public final float a(ViewGroup viewGroup, View view, float f) {
            return view.getTranslationX();
        }

        public final float b(ViewGroup viewGroup, View view, float f) {
            return view.getTranslationX();
        }
    }

    public zox() {
        a(80);
    }

    public final Animator a(ViewGroup viewGroup, View view, zog zog) {
        if (zog == null) {
            return null;
        }
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float b = this.a.b(viewGroup, view, this.c);
        float c = this.a.c(viewGroup, view, this.c);
        return zof.a(ObjectAnimator.ofFloat(view, View.TRANSLATION_X, new float[]{translationX, b}), ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{translationY, c}));
    }

    public final Animator a(ViewGroup viewGroup, View view, zog zog, zog zog2) {
        if (zog2 == null) {
            return null;
        }
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float a = this.a.a(viewGroup, view, this.c);
        float d = this.a.d(viewGroup, view, this.c);
        return zof.a(ObjectAnimator.ofFloat(view, View.TRANSLATION_X, new float[]{a, translationX}), ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{d, translationY}));
    }

    public final void a(float f) {
        this.c = f;
    }

    public final void a(int i) {
        a aVar;
        if (i != 3) {
            if (i != 5) {
                if (i == 48) {
                    aVar = e;
                } else if (i == 80) {
                    aVar = g;
                } else if (i != 8388611) {
                    if (i != 8388613) {
                        throw new IllegalArgumentException("Invalid slide direction");
                    }
                }
                this.a = aVar;
                this.b = i;
            }
            aVar = f;
            this.a = aVar;
            this.b = i;
        }
        aVar = d;
        this.a = aVar;
        this.b = i;
    }
}
