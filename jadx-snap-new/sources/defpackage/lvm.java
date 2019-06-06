package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;

/* renamed from: lvm */
public final class lvm {
    private static /* synthetic */ aken[] d = new aken[]{new akdc(akde.a(lvm.class), "container", "getContainer()Landroid/view/ViewGroup;"), new akda(akde.a(lvm.class), "animator", "<v#0>")};
    a a = new a(null);
    final AccelerateDecelerateInterpolator b = new AccelerateDecelerateInterpolator();
    final ViewGroup c;
    private final ajxe e = ajxh.a(new e(this));

    /* renamed from: lvm$a */
    static abstract class a implements mgw {

        /* renamed from: lvm$a$a */
        public static final class a extends a {
            private final Animator a;

            private /* synthetic */ a() {
                this(null);
            }

            public a(Animator animator) {
                super();
                this.a = animator;
            }

            public final Animator a() {
                return this.a;
            }

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.lvm.a.a) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof defpackage.lvm.a.a;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (defpackage.lvm.a.a) r2;
                r0 = r1.a;
                r2 = r2.a;
                r2 = defpackage.akcr.a(r0, r2);
                if (r2 == 0) goto L_0x0013;
            L_0x0012:
                goto L_0x0015;
            L_0x0013:
                r2 = 0;
                return r2;
            L_0x0015:
                r2 = 1;
                return r2;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.lvm$a$a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                Animator animator = this.a;
                return animator != null ? animator.hashCode() : 0;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Hidden(animator=");
                stringBuilder.append(this.a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: lvm$a$b */
        public static final class b extends a {
            final b<?> a;
            private final Animator b;

            public b(b<?> bVar, Animator animator) {
                akcr.b(bVar, "subview");
                super();
                this.a = bVar;
                this.b = animator;
            }

            public final Animator a() {
                return this.b;
            }

            /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
            public final boolean equals(java.lang.Object r3) {
                /*
                r2 = this;
                if (r2 == r3) goto L_0x001f;
            L_0x0002:
                r0 = r3 instanceof defpackage.lvm.a.b;
                if (r0 == 0) goto L_0x001d;
            L_0x0006:
                r3 = (defpackage.lvm.a.b) r3;
                r0 = r2.a;
                r1 = r3.a;
                r0 = defpackage.akcr.a(r0, r1);
                if (r0 == 0) goto L_0x001d;
            L_0x0012:
                r0 = r2.b;
                r3 = r3.b;
                r3 = defpackage.akcr.a(r0, r3);
                if (r3 == 0) goto L_0x001d;
            L_0x001c:
                goto L_0x001f;
            L_0x001d:
                r3 = 0;
                return r3;
            L_0x001f:
                r3 = 1;
                return r3;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.lvm$a$b.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                b bVar = this.a;
                int i = 0;
                int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
                Animator animator = this.b;
                if (animator != null) {
                    i = animator.hashCode();
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Visible(subview=");
                stringBuilder.append(this.a);
                stringBuilder.append(", animator=");
                stringBuilder.append(this.b);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: lvm$e */
    static final class e extends akcs implements akbk<ViewGroup> {
        private /* synthetic */ lvm a;

        e(lvm lvm) {
            this.a = lvm;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ViewGroup) this.a.c.findViewById(R.id.container);
        }
    }

    /* renamed from: lvm$f */
    static final class f extends akcs implements akbk<ajxw> {
        private /* synthetic */ lvm a;

        f(lvm lvm) {
            this.a = lvm;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.c.setVisibility(8);
            return ajxw.a;
        }
    }

    /* renamed from: lvm$b */
    public interface b<T extends View> {
        int a();

        void a(T t);
    }

    /* renamed from: lvm$c */
    static final class c implements Runnable {
        private /* synthetic */ lvm a;
        private /* synthetic */ b b;
        private /* synthetic */ ajxe c;
        private /* synthetic */ aken d;

        c(lvm lvm, b bVar, ajxe ajxe, aken aken) {
            this.a = lvm;
            this.b = bVar;
            this.c = ajxe;
            this.d = aken;
        }

        public final void run() {
            this.a.a((a) new b(this.b, (Animator) this.c.b()));
        }
    }

    /* renamed from: lvm$d */
    static final class d extends akcs implements akbk<Animator> {
        private /* synthetic */ lvm a;

        d(lvm lvm) {
            this.a = lvm;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            a aVar = this.a.a;
            if (!(aVar instanceof a)) {
                aVar = null;
            }
            if (aVar == null) {
                return null;
            }
            lvm lvm = this.a;
            ViewGroup viewGroup = lvm.c;
            viewGroup.setPivotX(((float) viewGroup.getWidth()) / 2.0f);
            viewGroup.setPivotY((float) viewGroup.getHeight());
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, "scaleX", new float[]{0.75f, 1.04f, 0.98f, 1.0f});
            ofFloat.setDuration(336);
            ofFloat.setInterpolator(lvm.b);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(viewGroup, "scaleY", new float[]{0.75f, 1.04f, 0.98f, 1.0f});
            ofFloat2.setDuration(336);
            ofFloat2.setInterpolator(lvm.b);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(viewGroup, "alpha", new float[]{MapboxConstants.MINIMUM_ZOOM, 1.0f});
            ofFloat3.setDuration(167);
            ofFloat3.setInterpolator(lvm.b);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
            return animatorSet;
        }
    }

    public lvm(ViewGroup viewGroup) {
        akcr.b(viewGroup, "parent");
        this.c = viewGroup;
    }

    private final <T extends View> T a(b<T> bVar) {
        b().removeAllViews();
        View inflate = LayoutInflater.from(this.c.getContext()).inflate(bVar.a(), b(), false);
        if (!(inflate instanceof View)) {
            inflate = null;
        }
        if (inflate != null) {
            bVar.a(inflate);
            b().addView(inflate);
            return inflate;
        }
        throw new ClassCastException("Wrong view type");
    }

    private final ViewGroup b() {
        return (ViewGroup) this.e.b();
    }

    private final <T extends View> T c() {
        ViewGroup b = b();
        akcr.a((Object) b, "it");
        if ((b.getChildCount() > 0 ? 1 : null) == null) {
            b = null;
        }
        T childAt = b != null ? b.getChildAt(0) : null;
        if (!(childAt instanceof View)) {
            childAt = null;
        }
        if (childAt != null) {
            return childAt;
        }
        throw new ClassCastException("Wrong view type");
    }

    private final Animator d() {
        ViewGroup viewGroup = this.c;
        viewGroup.setPivotX(((float) viewGroup.getWidth()) / 2.0f);
        viewGroup.setPivotY((float) viewGroup.getHeight());
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, "scaleX", new float[]{1.0f, 0.5f});
        ofFloat.setDuration(133);
        ofFloat.setInterpolator(this.b);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(viewGroup, "scaleY", new float[]{1.0f, 0.5f});
        ofFloat2.setDuration(133);
        ofFloat2.setInterpolator(this.b);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(viewGroup, "alpha", new float[]{1.0f, MapboxConstants.MINIMUM_ZOOM});
        ofFloat3.setDuration(133);
        ofFloat3.setInterpolator(this.b);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
        return animatorSet;
    }

    public final void a() {
        a((a) new a(mgx.a(d(), (akbk) new f(this))));
    }

    /* Access modifiers changed, original: final */
    public final void a(a aVar) {
        a aVar2 = this.a;
        this.a = aVar;
        if ((akcr.a(akde.a(aVar.getClass()), akde.a(aVar2.getClass())) ^ 1) != 0 || aVar.a() != null) {
            Animator a = aVar2.a();
            if (a != null) {
                a.cancel();
            }
            Animator a2 = aVar.a();
            if (a2 != null) {
                a2.start();
            }
        }
    }

    /* JADX WARNING: Missing block: B:10:0x0026, code skipped:
            if (r0 == null) goto L_0x0028;
     */
    public final <T extends android.view.View> void a(defpackage.lvm.b<T> r4, defpackage.akbl<? super T, defpackage.ajxw> r5) {
        /*
        r3 = this;
        r0 = "subview";
        defpackage.akcr.b(r4, r0);
        r0 = "update";
        defpackage.akcr.b(r5, r0);
        r0 = r3.a;
        r1 = r0 instanceof defpackage.lvm.a.b;
        r2 = 0;
        if (r1 != 0) goto L_0x0012;
    L_0x0011:
        r0 = r2;
    L_0x0012:
        r0 = (defpackage.lvm.a.b) r0;
        if (r0 == 0) goto L_0x0028;
    L_0x0016:
        r1 = r0.a;
        r1 = defpackage.akcr.a(r1, r4);
        if (r1 == 0) goto L_0x001f;
    L_0x001e:
        goto L_0x0020;
    L_0x001f:
        r0 = r2;
    L_0x0020:
        if (r0 == 0) goto L_0x0028;
    L_0x0022:
        r0 = r3.c();
        if (r0 != 0) goto L_0x002c;
    L_0x0028:
        r0 = r3.a(r4);
    L_0x002c:
        r5.invoke(r0);
        r5 = new lvm$d;
        r5.<init>(r3);
        r5 = (defpackage.akbk) r5;
        r5 = defpackage.ajxh.a(r5);
        r0 = d;
        r1 = 1;
        r0 = r0[r1];
        r1 = r3.c;
        r1 = (android.view.View) r1;
        r1 = defpackage.kb.d(r1);
        if (r1 == 0) goto L_0x005a;
    L_0x0049:
        r5 = r5.b();
        r5 = (android.animation.Animator) r5;
        r0 = new lvm$a$b;
        r0.<init>(r4, r5);
        r0 = (defpackage.lvm.a) r0;
        r3.a(r0);
        goto L_0x006c;
    L_0x005a:
        r1 = r3.c;
        r2 = 0;
        r1.setAlpha(r2);
        r1 = r3.c;
        r2 = new lvm$c;
        r2.<init>(r3, r4, r5, r0);
        r2 = (java.lang.Runnable) r2;
        r1.post(r2);
    L_0x006c:
        r4 = r3.c;
        r5 = 0;
        r4.setVisibility(r5);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lvm.a(lvm$b, akbl):void");
    }
}
