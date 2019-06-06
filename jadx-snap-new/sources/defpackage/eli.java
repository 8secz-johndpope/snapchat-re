package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.ui.view.ViewFinder;
import com.snapchat.android.R;
import defpackage.abur.a;
import defpackage.eld.c;
import defpackage.ele.b;

/* renamed from: eli */
public final class eli implements b {
    int a;
    final abur<ViewGroup> b = new abur(this.k, R.id.map_pulldown_tooltip_foreground, R.id.map_pulldown_tooltip_foreground, new e(this));
    ajfa c;
    float d = 1.0f;
    float e;
    Float f;
    final ViewFinder g;
    private final eld h = new eld(this.b, this.g);
    private Animator i;
    private Animator j;
    private final View k;

    /* renamed from: eli$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: eli$e */
    static final class e<T extends View> implements a<T> {
        private /* synthetic */ eli a;

        e(eli eli) {
            this.a = eli;
        }

        public final /* synthetic */ void onViewInflated(View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            akcr.b(viewGroup, "inflatedView");
            iho.c(viewGroup, this.a.a);
        }
    }

    /* renamed from: eli$b */
    public static final class b extends AnimatorListenerAdapter {
        private /* synthetic */ eli a;

        public b(eli eli) {
            this.a = eli;
        }

        public final void onAnimationEnd(Animator animator) {
            akcr.b(animator, "animation");
            Object findViewById = this.a.g.findViewById(R.id.neon_header_layout);
            if (findViewById != null) {
                eli eli = this.a;
                akcr.a(findViewById, "it");
                eli.d = findViewById.getAlpha();
                this.a.e = findViewById.getTranslationY();
            }
        }
    }

    /* renamed from: eli$c */
    public static final class c extends AnimatorListenerAdapter {
        private /* synthetic */ eli a;

        public c(eli eli) {
            this.a = eli;
        }

        public final void onAnimationEnd(Animator animator) {
            akcr.b(animator, "animation");
            eli eli = this.a;
            Object a = eli.b.a();
            akcr.a(a, "view.get()");
            eli.f = Float.valueOf(((ViewGroup) a).getTranslationY());
        }
    }

    /* renamed from: eli$d */
    public static final class d extends AnimatorListenerAdapter {
        private /* synthetic */ eli a;

        public d(eli eli) {
            this.a = eli;
        }

        public final void onAnimationEnd(Animator animator) {
            akcr.b(animator, "animation");
            eli eli = this.a;
            Object a = eli.b.a();
            akcr.a(a, "view.get()");
            eli.f = Float.valueOf(((ViewGroup) a).getTranslationY());
            ajfa ajfa = this.a.c;
            if (ajfa != null) {
                ajfa.cancel();
            }
            this.a.c = null;
        }
    }

    static {
        a aVar = new a();
    }

    public eli(View view, ViewFinder viewFinder) {
        akcr.b(view, "rootView");
        akcr.b(viewFinder, "viewFinder");
        this.k = view;
        this.g = viewFinder;
    }

    public final void a() {
        Object a = this.b.a();
        akcr.a(a, "view.get()");
        ((ViewGroup) a).setVisibility(0);
        if (this.c == null) {
            this.c = this.h.b();
        }
        Animator animator = this.i;
        if (animator != null) {
            animator.cancel();
        }
        eld eld = this.h;
        Float f = this.f;
        eld.e.a(0);
        float floatValue = f != null ? f.floatValue() : -eld.a();
        Object ofFloat = ObjectAnimator.ofFloat(eld.e.a(), View.TRANSLATION_Y, new float[]{floatValue, MapboxConstants.MINIMUM_ZOOM});
        ofFloat.setDuration(300);
        ofFloat.setInterpolator((DecelerateInterpolator) eld.b.b());
        ofFloat.start();
        akcr.a(ofFloat, "ObjectAnimator.ofFloat(t…        start()\n        }");
        Animator animator2 = (Animator) ofFloat;
        animator2.addListener(new c(this));
        this.i = animator2;
    }

    public final void a(float f) {
        Object a = this.b.a();
        akcr.a(a, "view.get()");
        ((ViewGroup) a).setTranslationY(((float) this.k.getHeight()) * f);
    }

    public final void a(int i) {
        if (this.b.b()) {
            iho.c(this.b.a(), i);
        } else {
            this.a = i;
        }
    }

    public final void b() {
        Animator animator = this.i;
        if (animator != null) {
            animator.cancel();
        }
        eld eld = this.h;
        Float f = this.f;
        float floatValue = f != null ? f.floatValue() : MapboxConstants.MINIMUM_ZOOM;
        Object ofFloat = ObjectAnimator.ofFloat(eld.e.a(), View.TRANSLATION_Y, new float[]{floatValue, -eld.a()});
        ofFloat.setDuration(300);
        ofFloat.setInterpolator((DecelerateInterpolator) eld.a.b());
        Animator animator2 = (Animator) ofFloat;
        akdd.a aVar = new akdd.a();
        aVar.a = false;
        animator2.addListener(new c(animator2, aVar, eld));
        ofFloat.start();
        akcr.a(ofFloat, "ObjectAnimator.ofFloat(t…start()\n                }");
        animator2.addListener(new d(this));
        this.i = animator2;
    }

    public final void c() {
        Animator animator = this.i;
        if (animator != null) {
            animator.cancel();
        }
        this.i = null;
        Object a = this.b.a();
        akcr.a(a, "view.get()");
        ((ViewGroup) a).setVisibility(0);
        View findViewById = this.g.findViewById(R.id.neon_header_layout);
        if (findViewById != null) {
            findViewById.setTranslationY(MapboxConstants.MINIMUM_ZOOM);
            findViewById.setAlpha(1.0f);
        }
        if (this.c == null) {
            this.c = this.h.b();
        }
        this.d = 1.0f;
        this.e = MapboxConstants.MINIMUM_ZOOM;
        this.f = null;
    }

    public final void d() {
        if (this.b.c()) {
            this.b.a(8);
            ajfa ajfa = this.c;
            if (ajfa != null) {
                ajfa.cancel();
            }
            this.c = null;
        }
    }

    public final void e() {
        Animator animator = this.j;
        if (animator != null) {
            animator.cancel();
        }
        eld eld = this.h;
        Object findViewById = eld.f.findViewById(R.id.neon_header_layout);
        if (findViewById == null) {
            animator = null;
        } else {
            akcr.a(findViewById, "viewFinder.findViewById<…VA_HEADER) ?: return null");
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById, View.ALPHA, new float[]{1.0f, MapboxConstants.MINIMUM_ZOOM});
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(findViewById, View.TRANSLATION_Y, new float[]{MapboxConstants.MINIMUM_ZOOM, eld.a()});
            animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
            animatorSet.setDuration(300);
            animatorSet.setInterpolator((DecelerateInterpolator) eld.c.b());
            animatorSet.start();
            animator = animatorSet;
        }
        if (animator != null) {
            animator.addListener(new b(this));
        } else {
            animator = null;
        }
        this.j = animator;
    }

    public final void f() {
        Animator animator = this.j;
        if (animator != null) {
            animator.cancel();
        }
        if (this.d != 1.0f || this.e != MapboxConstants.MINIMUM_ZOOM) {
            eld eld = this.h;
            float f = this.d;
            float f2 = this.e;
            Object findViewById = eld.f.findViewById(R.id.neon_header_layout);
            if (findViewById == null) {
                animator = null;
            } else {
                akcr.a(findViewById, "viewFinder.findViewById<…VA_HEADER) ?: return null");
                findViewById.setVisibility(0);
                findViewById.setAlpha(f);
                findViewById.setTranslationY(f2);
                AnimatorSet animatorSet = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById, View.ALPHA, new float[]{f, 1.0f});
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(findViewById, View.TRANSLATION_Y, new float[]{f2, MapboxConstants.MINIMUM_ZOOM});
                animatorSet.setDuration(300);
                animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
                animatorSet.setInterpolator((DecelerateInterpolator) eld.d.b());
                animatorSet.start();
                animator = animatorSet;
            }
            this.j = animator;
        }
    }

    public final void g() {
        Animator animator = this.j;
        if (animator != null) {
            animator.cancel();
        }
        Object findViewById = this.g.findViewById(R.id.neon_header_layout);
        if (findViewById != null) {
            akcr.a(findViewById, "viewFinder.findViewById<…ds.HOVA_HEADER) ?: return");
            findViewById.setTranslationY(MapboxConstants.MINIMUM_ZOOM);
            findViewById.setVisibility(0);
            findViewById.setAlpha(1.0f);
        }
    }

    public final void h() {
        Animator animator = this.j;
        if (animator != null) {
            animator.cancel();
        }
        this.j = null;
        Animator animator2 = this.i;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.i = null;
    }
}
