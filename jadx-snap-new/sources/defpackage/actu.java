package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout.LayoutParams;
import com.brightcove.player.event.Event;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: actu */
public final class actu {
    final Set<Runnable> a = new LinkedHashSet();
    final Set<View> b = new LinkedHashSet();
    ViewGroup c;
    AnimatorSet d;
    AnimatorSet e;
    float f;
    boolean g;
    private final Activity h;
    private final acpv i;

    /* renamed from: actu$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: actu$b */
    public static final class b implements Runnable {
        private /* synthetic */ actu a;
        private /* synthetic */ AnimatorSet b;

        b(actu actu, AnimatorSet animatorSet) {
            this.a = actu;
            this.b = animatorSet;
        }

        public final void run() {
            this.b.start();
            this.a.a.remove(this);
        }
    }

    /* renamed from: actu$c */
    public static final class c extends AnimatorListenerAdapter {
        final /* synthetic */ actu a;
        final /* synthetic */ AnimatorSet b;
        private /* synthetic */ ViewGroup c;
        private /* synthetic */ long d;

        /* renamed from: actu$c$a */
        public static final class a implements Runnable {
            private /* synthetic */ c a;

            a(c cVar) {
                this.a = cVar;
            }

            public final void run() {
                this.a.b.start();
                this.a.a.a.remove(this);
            }
        }

        public c(actu actu, AnimatorSet animatorSet, ViewGroup viewGroup, long j) {
            this.a = actu;
            this.b = animatorSet;
            this.c = viewGroup;
            this.d = j;
        }

        public final void onAnimationEnd(Animator animator) {
            akcr.b(animator, "animation");
            a aVar = new a(this);
            this.a.a.add(aVar);
            this.c.postDelayed(aVar, this.d);
        }
    }

    /* renamed from: actu$d */
    public static final class d extends AnimatorListenerAdapter {
        private /* synthetic */ actu a;
        private /* synthetic */ actw b;

        public d(actu actu, actw actw) {
            this.a = actu;
            this.b = actw;
        }

        public final void onAnimationEnd(Animator animator) {
            akcr.b(animator, "animation");
            actu.a(this.a, this.b.e);
        }
    }

    /* renamed from: actu$e */
    public static final class e extends AnimatorListenerAdapter {
        private /* synthetic */ View a;

        public e(View view) {
            this.a = view;
        }

        public final void onAnimationEnd(Animator animator) {
            akcr.b(animator, "animation");
            this.a.setAlpha(MapboxConstants.MINIMUM_ZOOM);
            this.a.setVisibility(8);
            this.a.setTranslationY(MapboxConstants.MINIMUM_ZOOM);
        }
    }

    /* renamed from: actu$f */
    public static final class f extends AnimatorListenerAdapter {
        private /* synthetic */ View a;

        public f(View view) {
            this.a = view;
        }

        public final void onAnimationStart(Animator animator) {
            this.a.setVisibility(0);
        }
    }

    /* renamed from: actu$g */
    public static final class g extends AnimatorListenerAdapter {
        private /* synthetic */ actu a;
        private /* synthetic */ actw b;

        public g(actu actu, actw actw) {
            this.a = actu;
            this.b = actw;
        }

        public final void onAnimationEnd(Animator animator) {
            akcr.b(animator, "animation");
            actu.a(this.a, this.b.e);
        }
    }

    /* renamed from: actu$h */
    public static final class h extends AnimatorListenerAdapter {
        private /* synthetic */ View a;

        public h(View view) {
            this.a = view;
        }

        public final void onAnimationStart(Animator animator) {
            this.a.setVisibility(0);
        }
    }

    static {
        a aVar = new a();
    }

    public actu(Activity activity, acpv acpv) {
        akcr.b(activity, Event.ACTIVITY);
        akcr.b(acpv, "exploreDataSource");
        this.h = activity;
        this.i = acpv;
    }

    private final AnimatorSet a(List<? extends View> list, List<actw> list2, ViewGroup viewGroup, long j, int i, boolean z) {
        List<actw> list3 = list2;
        AnimatorSet animatorSet = new AnimatorSet();
        List arrayList = new ArrayList();
        int i2 = 0;
        if (z) {
            animatorSet.addListener(new c(this, animatorSet, viewGroup, j));
            for (View a : list) {
                arrayList.addAll(a(a, ((long) i2) * 2000, (actw) list3.get(i2), i));
                i2++;
            }
        } else {
            for (View a2 : list) {
                arrayList.addAll(a(a2, ((long) i2) * 2000, list.size(), i2, (actw) list3.get(i2)));
                i2++;
            }
        }
        animatorSet.playTogether(arrayList);
        return animatorSet;
    }

    private final List<Animator> a(View view, long j, int i, int i2, actw actw) {
        List arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{MapboxConstants.MINIMUM_ZOOM, 1.0f});
        ofFloat.setDuration(1000);
        Animator animator = ofFloat;
        animator.addListener(new h(view));
        animator.addListener(new g(this, actw));
        arrayList.add(idc.a((Animator) (ObjectAnimator) animator, j));
        i -= i2 + 1;
        if (i > 0) {
            float h = (((float) i) / 3.0f) * ((-400.0f - this.f) + ((float) iho.h(view)));
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{MapboxConstants.MINIMUM_ZOOM, h});
            ofFloat2.setDuration(((long) i) * 2000);
            ofFloat2.setInterpolator(new acts(i, new DecelerateInterpolator(0.5f)));
            arrayList.add(idc.a((Animator) ofFloat2, j + 2000));
        }
        return arrayList;
    }

    private final List<Animator> a(View view, long j, actw actw, int i) {
        List arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{MapboxConstants.MINIMUM_ZOOM, 1.0f});
        ofFloat.setDuration(1000);
        Animator animator = ofFloat;
        animator.addListener(new f(view));
        animator.addListener(new d(this, actw));
        arrayList.add(idc.a((Animator) (ObjectAnimator) animator, j));
        float h = (-400.0f - this.f) + ((float) iho.h(view));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{MapboxConstants.MINIMUM_ZOOM, h});
        long j2 = ((long) i) * 2000;
        ofFloat2.setDuration(j2);
        ofFloat2.setInterpolator(new acts(i, new DecelerateInterpolator(0.5f)));
        arrayList.add(idc.a((Animator) ofFloat2, j + 2000));
        ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f, MapboxConstants.MINIMUM_ZOOM});
        ofFloat2.setDuration(2000);
        Animator animator2 = ofFloat2;
        animator2.addListener(new e(view));
        arrayList.add(idc.a((Animator) (ObjectAnimator) animator2, j2 + j));
        return arrayList;
    }

    private final List<View> a(List<actw> list, boolean z) {
        Iterable<actw> iterable = list;
        Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
        for (actw actw : iterable) {
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.leftMargin = (int) actw.b;
            layoutParams.bottomMargin = (int) actw.c;
            layoutParams.gravity = 81;
            arrayList.add(new acty(this.h).a(actw.a, actw.d, layoutParams, z));
        }
        return (List) arrayList;
    }

    /* Access modifiers changed, original: final */
    public final void a(List<actw> list, ViewGroup viewGroup, boolean z) {
        List list2 = list;
        ViewGroup viewGroup2 = viewGroup;
        boolean z2 = z;
        this.g = true;
        List<View> a;
        if (list.size() >= 2) {
            a = a(list2, z2);
            for (View addView : a) {
                viewGroup2.addView(addView);
            }
            List<View> a2 = a(list2, z2);
            for (View addView2 : a2) {
                viewGroup2.addView(addView2);
            }
            this.b.addAll(a);
            this.b.addAll(a2);
            int min = Math.min(list.size(), 3);
            long size = ((long) list.size()) * 2000;
            List list3 = list;
            ViewGroup viewGroup3 = viewGroup;
            long j = size - (((long) min) * 2000);
            AnimatorSet a3 = a((List) a, list3, viewGroup3, j, min, true);
            AnimatorSet a4 = a((List) a2, list3, viewGroup3, j, min, true);
            a3.start();
            b bVar = new b(this, a4);
            this.a.add(bVar);
            viewGroup2.postDelayed(bVar, size);
            this.d = a3;
            this.e = a4;
            return;
        }
        a = a(list2, z2);
        for (View addView22 : a) {
            viewGroup2.addView(addView22);
        }
        this.b.addAll(a);
        a((List) a, (List) list, viewGroup, 0, list.size(), false).start();
    }
}
