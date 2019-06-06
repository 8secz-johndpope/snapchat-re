package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import com.brightcove.player.event.Event;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.fv.c;
import defpackage.fv.d;
import defpackage.fz.a;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: ga */
public final class ga extends fz implements Factory2 {
    private static Interpolator D = new DecelerateInterpolator(2.5f);
    private static Interpolator E = new DecelerateInterpolator(1.5f);
    private static Field r;
    private SparseArray<Parcelable> A = null;
    private ArrayList<i> B;
    private Runnable C = new 1();
    final ArrayList<fv> a = new ArrayList();
    SparseArray<fv> b;
    ArrayList<fs> c;
    int d = 0;
    fy e;
    fw f;
    fv g;
    boolean h;
    public gb i;
    private ArrayList<g> j;
    private boolean k;
    private int l = 0;
    private ArrayList<fv> m;
    private ArrayList<fs> n;
    private ArrayList<Integer> o;
    private final CopyOnWriteArrayList<je<a, Boolean>> p = new CopyOnWriteArrayList();
    private fv q;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private ArrayList<fs> w;
    private ArrayList<Boolean> x;
    private ArrayList<fv> y;
    private Bundle z = null;

    /* renamed from: ga$1 */
    class 1 implements Runnable {
        1() {
        }

        public final void run() {
            ga.this.g();
        }
    }

    /* renamed from: ga$g */
    interface g {
        boolean a(ArrayList<fs> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: ga$b */
    static class b implements AnimationListener {
        private final AnimationListener a;

        private b(AnimationListener animationListener) {
            this.a = animationListener;
        }

        /* synthetic */ b(AnimationListener animationListener, byte b) {
            this(animationListener);
        }

        public void onAnimationEnd(Animation animation) {
            AnimationListener animationListener = this.a;
            if (animationListener != null) {
                animationListener.onAnimationEnd(animation);
            }
        }

        public void onAnimationRepeat(Animation animation) {
            AnimationListener animationListener = this.a;
            if (animationListener != null) {
                animationListener.onAnimationRepeat(animation);
            }
        }

        public void onAnimationStart(Animation animation) {
            AnimationListener animationListener = this.a;
            if (animationListener != null) {
                animationListener.onAnimationStart(animation);
            }
        }
    }

    /* renamed from: ga$c */
    static class c {
        public final Animation a;
        public final Animator b;

        private c(Animator animator) {
            this.a = null;
            this.b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        private c(Animation animation) {
            this.a = animation;
            this.b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* renamed from: ga$d */
    static class d extends AnimatorListenerAdapter {
        private View a;

        d(View view) {
            this.a = view;
        }

        public final void onAnimationEnd(Animator animator) {
            this.a.setLayerType(0, null);
            animator.removeListener(this);
        }

        public final void onAnimationStart(Animator animator) {
            this.a.setLayerType(2, null);
        }
    }

    /* renamed from: ga$e */
    static class e extends AnimationSet implements Runnable {
        private final ViewGroup a;
        private final View b;
        private boolean c;
        private boolean d;

        e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.a = viewGroup;
            this.b = view;
            addAnimation(animation);
        }

        public final boolean getTransformation(long j, Transformation transformation) {
            if (this.c) {
                return !this.d;
            } else {
                if (!super.getTransformation(j, transformation)) {
                    this.c = true;
                    gs.a(this.a, this);
                }
                return true;
            }
        }

        public final boolean getTransformation(long j, Transformation transformation, float f) {
            if (this.c) {
                return !this.d;
            } else {
                if (!super.getTransformation(j, transformation, f)) {
                    this.c = true;
                    gs.a(this.a, this);
                }
                return true;
            }
        }

        public final void run() {
            this.a.endViewTransition(this.b);
            this.d = true;
        }
    }

    /* renamed from: ga$f */
    static class f {
        public static final int[] a = new int[]{16842755, 16842960, 16842961};
    }

    /* renamed from: ga$a */
    static class a extends b {
        View a;

        /* renamed from: ga$a$1 */
        class 1 implements Runnable {
            1() {
            }

            public final void run() {
                a.this.a.setLayerType(0, null);
            }
        }

        a(View view, AnimationListener animationListener) {
            super(animationListener, (byte) 0);
            this.a = view;
        }

        public final void onAnimationEnd(Animation animation) {
            if (kb.a.r(this.a) || VERSION.SDK_INT >= 24) {
                this.a.post(new 1());
            } else {
                this.a.setLayerType(0, null);
            }
            super.onAnimationEnd(animation);
        }
    }

    /* renamed from: ga$h */
    class h implements g {
        private String a = null;
        private int b;
        private int c;

        h(int i) {
            this.b = i;
            this.c = 1;
        }

        public final boolean a(ArrayList<fs> arrayList, ArrayList<Boolean> arrayList2) {
            if (ga.this.g != null && this.b < 0) {
                fz peekChildFragmentManager = ga.this.g.peekChildFragmentManager();
                if (peekChildFragmentManager != null && peekChildFragmentManager.c()) {
                    return false;
                }
            }
            return ga.this.a((ArrayList) arrayList, (ArrayList) arrayList2, null, this.b, this.c);
        }
    }

    /* renamed from: ga$i */
    static class i implements c {
        final boolean a;
        final fs b;
        int c;

        i(fs fsVar, boolean z) {
            this.a = z;
            this.b = fsVar;
        }

        public final void a() {
            this.c--;
            if (this.c == 0) {
                this.b.a.f();
            }
        }

        public final void b() {
            this.c++;
        }

        public final void c() {
            int i = this.c > 0 ? 1 : 0;
            ga gaVar = this.b.a;
            int size = gaVar.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                fv fvVar = (fv) gaVar.a.get(i2);
                fvVar.setOnStartEnterTransitionListener(null);
                if (i != 0 && fvVar.isPostponed()) {
                    fvVar.startPostponedEnterTransition();
                }
            }
            ga.a(this.b.a, this.b, this.a, i ^ 1, true);
        }

        public final void d() {
            ga.a(this.b.a, this.b, this.a, false, false);
        }
    }

    static {
        AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator(2.5f);
        accelerateInterpolator = new AccelerateInterpolator(1.5f);
    }

    ga() {
    }

    private int a(ArrayList<fs> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, iw<fv> iwVar) {
        int i3 = i2 - 1;
        int i4 = i2;
        while (i3 >= i) {
            Object obj;
            Object obj2;
            fs fsVar = (fs) arrayList.get(i3);
            boolean booleanValue = ((Boolean) arrayList2.get(i3)).booleanValue();
            int i5 = 0;
            while (true) {
                obj = 1;
                if (i5 >= fsVar.b.size()) {
                    obj2 = null;
                    break;
                } else if (fs.b((fs.a) fsVar.b.get(i5))) {
                    obj2 = 1;
                    break;
                } else {
                    i5++;
                }
            }
            if (obj2 == null || fsVar.a((ArrayList) arrayList, i3 + 1, i2)) {
                obj = null;
            }
            if (obj != null) {
                if (this.B == null) {
                    this.B = new ArrayList();
                }
                c iVar = new i(fsVar, booleanValue);
                this.B.add(iVar);
                fsVar.a(iVar);
                if (booleanValue) {
                    fsVar.f();
                } else {
                    fsVar.a(false);
                }
                i4--;
                if (i3 != i4) {
                    arrayList.remove(i3);
                    arrayList.add(i4, fsVar);
                }
                b((iw) iwVar);
            }
            i3--;
        }
        return i4;
    }

    private static AnimationListener a(Animation animation) {
        Throwable e;
        String str;
        try {
            if (r == null) {
                Field declaredField = Animation.class.getDeclaredField("mListener");
                r = declaredField;
                declaredField.setAccessible(true);
            }
            return (AnimationListener) r.get(animation);
        } catch (NoSuchFieldException e2) {
            e = e2;
            str = "No field with the name mListener is found in Animation class";
            Log.e("FragmentManager", str, e);
            return null;
        } catch (IllegalAccessException e3) {
            e = e3;
            str = "Cannot access Animation's mListener field";
            Log.e("FragmentManager", str, e);
            return null;
        }
    }

    private static c a(float f, float f2) {
        Animation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(E);
        alphaAnimation.setDuration(220);
        return new c(alphaAnimation, (byte) 0);
    }

    private static c a(float f, float f2, float f3, float f4) {
        Animation animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(D);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(E);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return new c(animationSet, (byte) 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x004b A:{SYNTHETIC, Splitter:B:23:0x004b} */
    private defpackage.ga.c a(defpackage.fv r6, int r7, boolean r8, int r9) {
        /*
        r5 = this;
        r0 = r6.getNextAnim();
        r1 = r6.onCreateAnimation(r7, r8, r0);
        r2 = 0;
        if (r1 == 0) goto L_0x0011;
    L_0x000b:
        r6 = new ga$c;
        r6.<init>(r1, r2);
        return r6;
    L_0x0011:
        r6 = r6.onCreateAnimator(r7, r8, r0);
        if (r6 == 0) goto L_0x001d;
    L_0x0017:
        r7 = new ga$c;
        r7.<init>(r6, r2);
        return r7;
    L_0x001d:
        r6 = 1;
        if (r0 == 0) goto L_0x006f;
    L_0x0020:
        r1 = r5.e;
        r1 = r1.b;
        r1 = r1.getResources();
        r1 = r1.getResourceTypeName(r0);
        r3 = "anim";
        r1 = r3.equals(r1);
        if (r1 == 0) goto L_0x0048;
    L_0x0034:
        r3 = r5.e;	 Catch:{ NotFoundException -> 0x0046, RuntimeException -> 0x0048 }
        r3 = r3.b;	 Catch:{ NotFoundException -> 0x0046, RuntimeException -> 0x0048 }
        r3 = android.view.animation.AnimationUtils.loadAnimation(r3, r0);	 Catch:{ NotFoundException -> 0x0046, RuntimeException -> 0x0048 }
        if (r3 == 0) goto L_0x0044;
    L_0x003e:
        r4 = new ga$c;	 Catch:{ NotFoundException -> 0x0046, RuntimeException -> 0x0048 }
        r4.<init>(r3, r2);	 Catch:{ NotFoundException -> 0x0046, RuntimeException -> 0x0048 }
        return r4;
    L_0x0044:
        r3 = 1;
        goto L_0x0049;
    L_0x0046:
        r6 = move-exception;
        throw r6;
    L_0x0048:
        r3 = 0;
    L_0x0049:
        if (r3 != 0) goto L_0x006f;
    L_0x004b:
        r3 = r5.e;	 Catch:{ RuntimeException -> 0x005b }
        r3 = r3.b;	 Catch:{ RuntimeException -> 0x005b }
        r3 = android.animation.AnimatorInflater.loadAnimator(r3, r0);	 Catch:{ RuntimeException -> 0x005b }
        if (r3 == 0) goto L_0x006f;
    L_0x0055:
        r4 = new ga$c;	 Catch:{ RuntimeException -> 0x005b }
        r4.<init>(r3, r2);	 Catch:{ RuntimeException -> 0x005b }
        return r4;
    L_0x005b:
        r3 = move-exception;
        if (r1 != 0) goto L_0x006e;
    L_0x005e:
        r1 = r5.e;
        r1 = r1.b;
        r0 = android.view.animation.AnimationUtils.loadAnimation(r1, r0);
        if (r0 == 0) goto L_0x006f;
    L_0x0068:
        r6 = new ga$c;
        r6.<init>(r0, r2);
        return r6;
    L_0x006e:
        throw r3;
    L_0x006f:
        r0 = 0;
        if (r7 != 0) goto L_0x0073;
    L_0x0072:
        return r0;
    L_0x0073:
        r1 = -1;
        r2 = 4097; // 0x1001 float:5.741E-42 double:2.024E-320;
        if (r7 == r2) goto L_0x0091;
    L_0x0078:
        r6 = 4099; // 0x1003 float:5.744E-42 double:2.025E-320;
        if (r7 == r6) goto L_0x0089;
    L_0x007c:
        r6 = 8194; // 0x2002 float:1.1482E-41 double:4.0484E-320;
        if (r7 == r6) goto L_0x0081;
    L_0x0080:
        goto L_0x0097;
    L_0x0081:
        if (r8 == 0) goto L_0x0086;
    L_0x0083:
        r6 = 3;
        r1 = 3;
        goto L_0x0097;
    L_0x0086:
        r6 = 4;
        r1 = 4;
        goto L_0x0097;
    L_0x0089:
        if (r8 == 0) goto L_0x008e;
    L_0x008b:
        r6 = 5;
        r1 = 5;
        goto L_0x0097;
    L_0x008e:
        r6 = 6;
        r1 = 6;
        goto L_0x0097;
    L_0x0091:
        if (r8 == 0) goto L_0x0095;
    L_0x0093:
        r1 = 1;
        goto L_0x0097;
    L_0x0095:
        r6 = 2;
        r1 = 2;
    L_0x0097:
        if (r1 >= 0) goto L_0x009a;
    L_0x0099:
        return r0;
    L_0x009a:
        r6 = 1064933786; // 0x3f79999a float:0.975 double:5.26147199E-315;
        r7 = 0;
        r8 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        switch(r1) {
            case 1: goto L_0x00d0;
            case 2: goto L_0x00cb;
            case 3: goto L_0x00c6;
            case 4: goto L_0x00be;
            case 5: goto L_0x00b9;
            case 6: goto L_0x00b4;
            default: goto L_0x00a3;
        };
    L_0x00a3:
        if (r9 != 0) goto L_0x00d7;
    L_0x00a5:
        r6 = r5.e;
        r6 = r6.e();
        if (r6 == 0) goto L_0x00d7;
    L_0x00ad:
        r6 = r5.e;
        r9 = r6.f();
        goto L_0x00d7;
    L_0x00b4:
        r6 = defpackage.ga.a(r8, r7);
        return r6;
    L_0x00b9:
        r6 = defpackage.ga.a(r7, r8);
        return r6;
    L_0x00be:
        r6 = 1065982362; // 0x3f89999a float:1.075 double:5.26665264E-315;
        r6 = defpackage.ga.a(r8, r6, r8, r7);
        return r6;
    L_0x00c6:
        r6 = defpackage.ga.a(r6, r8, r7, r8);
        return r6;
    L_0x00cb:
        r6 = defpackage.ga.a(r8, r6, r8, r7);
        return r6;
    L_0x00d0:
        r6 = 1066401792; // 0x3f900000 float:1.125 double:5.2687249E-315;
        r6 = defpackage.ga.a(r6, r8, r7, r8);
        return r6;
    L_0x00d7:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ga.a(fv, int, boolean, int):ga$c");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x0043 in {4, 7, 11, 12, 13, 15, 18} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private void a(int r4, defpackage.fs r5) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.n;	 Catch:{ all -> 0x0040 }
        if (r0 != 0) goto L_0x000c;	 Catch:{ all -> 0x0040 }
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0040 }
        r0.<init>();	 Catch:{ all -> 0x0040 }
        r3.n = r0;	 Catch:{ all -> 0x0040 }
        r0 = r3.n;	 Catch:{ all -> 0x0040 }
        r0 = r0.size();	 Catch:{ all -> 0x0040 }
        if (r4 >= r0) goto L_0x001a;	 Catch:{ all -> 0x0040 }
        r0 = r3.n;	 Catch:{ all -> 0x0040 }
        r0.set(r4, r5);	 Catch:{ all -> 0x0040 }
        goto L_0x003e;	 Catch:{ all -> 0x0040 }
        if (r0 >= r4) goto L_0x0039;	 Catch:{ all -> 0x0040 }
        r1 = r3.n;	 Catch:{ all -> 0x0040 }
        r2 = 0;	 Catch:{ all -> 0x0040 }
        r1.add(r2);	 Catch:{ all -> 0x0040 }
        r1 = r3.o;	 Catch:{ all -> 0x0040 }
        if (r1 != 0) goto L_0x002d;	 Catch:{ all -> 0x0040 }
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x0040 }
        r1.<init>();	 Catch:{ all -> 0x0040 }
        r3.o = r1;	 Catch:{ all -> 0x0040 }
        r1 = r3.o;	 Catch:{ all -> 0x0040 }
        r2 = java.lang.Integer.valueOf(r0);	 Catch:{ all -> 0x0040 }
        r1.add(r2);	 Catch:{ all -> 0x0040 }
        r0 = r0 + 1;	 Catch:{ all -> 0x0040 }
        goto L_0x001a;	 Catch:{ all -> 0x0040 }
        r4 = r3.n;	 Catch:{ all -> 0x0040 }
        r4.add(r5);	 Catch:{ all -> 0x0040 }
        monitor-exit(r3);	 Catch:{ all -> 0x0040 }
        return;	 Catch:{ all -> 0x0040 }
        r4 = move-exception;	 Catch:{ all -> 0x0040 }
        monitor-exit(r3);	 Catch:{ all -> 0x0040 }
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ga.a(int, fs):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    private static void a(android.view.View r5, defpackage.ga.c r6) {
        /*
        if (r5 == 0) goto L_0x007a;
    L_0x0002:
        if (r6 != 0) goto L_0x0005;
    L_0x0004:
        goto L_0x007a;
    L_0x0005:
        r0 = 1;
        r1 = 0;
        if (r5 == 0) goto L_0x0054;
    L_0x0009:
        if (r6 != 0) goto L_0x000c;
    L_0x000b:
        goto L_0x0054;
    L_0x000c:
        r2 = android.os.Build.VERSION.SDK_INT;
        r3 = 19;
        if (r2 < r3) goto L_0x0054;
    L_0x0012:
        r2 = r5.getLayerType();
        if (r2 != 0) goto L_0x0054;
    L_0x0018:
        r2 = defpackage.kb.a;
        r2 = r2.i(r5);
        if (r2 == 0) goto L_0x0054;
    L_0x0020:
        r2 = r6.a;
        r2 = r2 instanceof android.view.animation.AlphaAnimation;
        if (r2 == 0) goto L_0x0028;
    L_0x0026:
        r2 = 1;
        goto L_0x0051;
    L_0x0028:
        r2 = r6.a;
        r2 = r2 instanceof android.view.animation.AnimationSet;
        if (r2 == 0) goto L_0x004b;
    L_0x002e:
        r2 = r6.a;
        r2 = (android.view.animation.AnimationSet) r2;
        r2 = r2.getAnimations();
        r3 = 0;
    L_0x0037:
        r4 = r2.size();
        if (r3 >= r4) goto L_0x0049;
    L_0x003d:
        r4 = r2.get(r3);
        r4 = r4 instanceof android.view.animation.AlphaAnimation;
        if (r4 == 0) goto L_0x0046;
    L_0x0045:
        goto L_0x0026;
    L_0x0046:
        r3 = r3 + 1;
        goto L_0x0037;
    L_0x0049:
        r2 = 0;
        goto L_0x0051;
    L_0x004b:
        r2 = r6.b;
        r2 = defpackage.ga.a(r2);
    L_0x0051:
        if (r2 == 0) goto L_0x0054;
    L_0x0053:
        r1 = 1;
    L_0x0054:
        if (r1 == 0) goto L_0x007a;
    L_0x0056:
        r0 = r6.b;
        if (r0 == 0) goto L_0x0065;
    L_0x005a:
        r6 = r6.b;
        r0 = new ga$d;
        r0.<init>(r5);
        r6.addListener(r0);
        return;
    L_0x0065:
        r0 = r6.a;
        r0 = defpackage.ga.a(r0);
        r1 = 2;
        r2 = 0;
        r5.setLayerType(r1, r2);
        r6 = r6.a;
        r1 = new ga$a;
        r1.<init>(r5, r0);
        r6.setAnimationListener(r1);
    L_0x007a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ga.a(android.view.View, ga$c):void");
    }

    private void a(fv fvVar, Context context, boolean z) {
        fv fvVar2 = this.q;
        if (fvVar2 != null) {
            fz fragmentManager = fvVar2.getFragmentManager();
            if (fragmentManager instanceof ga) {
                ((ga) fragmentManager).a(fvVar, context, true);
            }
        }
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            je jeVar = (je) it.next();
            if (z) {
                ((Boolean) jeVar.b).booleanValue();
            }
        }
    }

    private void a(fv fvVar, Bundle bundle, boolean z) {
        fv fvVar2 = this.q;
        if (fvVar2 != null) {
            fz fragmentManager = fvVar2.getFragmentManager();
            if (fragmentManager instanceof ga) {
                ((ga) fragmentManager).a(fvVar, bundle, true);
            }
        }
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            je jeVar = (je) it.next();
            if (z) {
                ((Boolean) jeVar.b).booleanValue();
            }
        }
    }

    private void a(fv fvVar, View view, Bundle bundle, boolean z) {
        fv fvVar2 = this.q;
        if (fvVar2 != null) {
            fz fragmentManager = fvVar2.getFragmentManager();
            if (fragmentManager instanceof ga) {
                ((ga) fragmentManager).a(fvVar, view, bundle, true);
            }
        }
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            je jeVar = (je) it.next();
            if (z) {
                ((Boolean) jeVar.b).booleanValue();
            }
        }
    }

    private void a(final fv fvVar, c cVar, int i) {
        final View view = fvVar.mView;
        final ViewGroup viewGroup = fvVar.mContainer;
        viewGroup.startViewTransition(view);
        fvVar.setStateAfterAnimating(i);
        if (cVar.a != null) {
            Animation eVar = new e(cVar.a, viewGroup, view);
            fvVar.setAnimatingAway(fvVar.mView);
            eVar.setAnimationListener(new b(ga.a(eVar)) {

                /* renamed from: ga$2$1 */
                class 1 implements Runnable {
                    1() {
                    }

                    public final void run() {
                        if (fvVar.getAnimatingAway() != null) {
                            fvVar.setAnimatingAway(null);
                            ga.this.a(fvVar, fvVar.getStateAfterAnimating(), 0, 0, false);
                        }
                    }
                }

                public final void onAnimationEnd(Animation animation) {
                    super.onAnimationEnd(animation);
                    viewGroup.post(new 1());
                }
            });
            ga.a(view, cVar);
            fvVar.mView.startAnimation(eVar);
            return;
        }
        Animator animator = cVar.b;
        fvVar.setAnimator(cVar.b);
        animator.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                viewGroup.endViewTransition(view);
                animator = fvVar.getAnimator();
                fvVar.setAnimator(null);
                if (animator != null && viewGroup.indexOfChild(view) < 0) {
                    ga gaVar = ga.this;
                    fv fvVar = fvVar;
                    gaVar.a(fvVar, fvVar.getStateAfterAnimating(), 0, 0, false);
                }
            }
        });
        animator.setTarget(fvVar.mView);
        ga.a(fvVar.mView, cVar);
        animator.start();
    }

    public static void a(gb gbVar) {
        if (gbVar != null) {
            List<fv> list = gbVar.a;
            if (list != null) {
                for (fv fvVar : list) {
                    fvVar.mRetaining = true;
                }
            }
            List<gb> list2 = gbVar.b;
            if (list2 != null) {
                for (gb a : list2) {
                    ga.a(a);
                }
            }
        }
    }

    private static void a(iw<fv> iwVar) {
        int size = iwVar.size();
        for (int i = 0; i < size; i++) {
            fv fvVar = (fv) iwVar.a[i];
            if (!fvVar.mAdded) {
                View view = fvVar.getView();
                fvVar.mPostponedAlpha = view.getAlpha();
                view.setAlpha(MapboxConstants.MINIMUM_ZOOM);
            }
        }
    }

    private void a(RuntimeException runtimeException) {
        String str = "FragmentManager";
        Log.e(str, runtimeException.getMessage());
        Log.e(str, "Activity state:");
        PrintWriter printWriter = new PrintWriter(new iz(str));
        fy fyVar = this.e;
        String str2 = "Failed dumping state";
        String str3 = "  ";
        if (fyVar != null) {
            try {
                fyVar.a(str3, printWriter, new String[0]);
            } catch (Exception e) {
                Log.e(str, str2, e);
            }
        } else {
            a(str3, null, printWriter, new String[0]);
        }
        throw runtimeException;
    }

    /* JADX WARNING: Missing block: B:13:0x0031, code skipped:
            if (((java.lang.Boolean) r10.get(r6)).booleanValue() != false) goto L_0x0033;
     */
    /* JADX WARNING: Missing block: B:14:0x0033, code skipped:
            r3.d();
     */
    /* JADX WARNING: Missing block: B:30:0x006f, code skipped:
            if (((java.lang.Boolean) r10.get(r6)).booleanValue() != false) goto L_0x0033;
     */
    private void a(java.util.ArrayList<defpackage.fs> r9, java.util.ArrayList<java.lang.Boolean> r10) {
        /*
        r8 = this;
        r0 = r8.B;
        r1 = 0;
        if (r0 != 0) goto L_0x0007;
    L_0x0005:
        r0 = 0;
        goto L_0x000b;
    L_0x0007:
        r0 = r0.size();
    L_0x000b:
        r2 = r0;
        r0 = 0;
    L_0x000d:
        if (r0 >= r2) goto L_0x0077;
    L_0x000f:
        r3 = r8.B;
        r3 = r3.get(r0);
        r3 = (defpackage.ga.i) r3;
        r4 = 1;
        r5 = -1;
        if (r9 == 0) goto L_0x0037;
    L_0x001b:
        r6 = r3.a;
        if (r6 != 0) goto L_0x0037;
    L_0x001f:
        r6 = r3.b;
        r6 = r9.indexOf(r6);
        if (r6 == r5) goto L_0x0037;
    L_0x0027:
        r6 = r10.get(r6);
        r6 = (java.lang.Boolean) r6;
        r6 = r6.booleanValue();
        if (r6 == 0) goto L_0x0037;
    L_0x0033:
        r3.d();
        goto L_0x0075;
    L_0x0037:
        r6 = r3.c;
        if (r6 != 0) goto L_0x003d;
    L_0x003b:
        r6 = 1;
        goto L_0x003e;
    L_0x003d:
        r6 = 0;
    L_0x003e:
        if (r6 != 0) goto L_0x004e;
    L_0x0040:
        if (r9 == 0) goto L_0x0075;
    L_0x0042:
        r6 = r3.b;
        r7 = r9.size();
        r6 = r6.a(r9, r1, r7);
        if (r6 == 0) goto L_0x0075;
    L_0x004e:
        r6 = r8.B;
        r6.remove(r0);
        r0 = r0 + -1;
        r2 = r2 + -1;
        if (r9 == 0) goto L_0x0072;
    L_0x0059:
        r6 = r3.a;
        if (r6 != 0) goto L_0x0072;
    L_0x005d:
        r6 = r3.b;
        r6 = r9.indexOf(r6);
        if (r6 == r5) goto L_0x0072;
    L_0x0065:
        r5 = r10.get(r6);
        r5 = (java.lang.Boolean) r5;
        r5 = r5.booleanValue();
        if (r5 == 0) goto L_0x0072;
    L_0x0071:
        goto L_0x0033;
    L_0x0072:
        r3.c();
    L_0x0075:
        r0 = r0 + r4;
        goto L_0x000d;
    L_0x0077:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ga.a(java.util.ArrayList, java.util.ArrayList):void");
    }

    private void a(ArrayList<fs> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        int i4;
        ArrayList<fs> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i5 = i;
        int i6 = i2;
        boolean z = ((fs) arrayList.get(i5)).r;
        ArrayList arrayList5 = this.y;
        if (arrayList5 == null) {
            this.y = new ArrayList();
        } else {
            arrayList5.clear();
        }
        this.y.addAll(this.a);
        fv fvVar = this.g;
        for (i3 = i5; i3 < i6; i3++) {
            fs fsVar = (fs) arrayList.get(i3);
            fvVar = !((Boolean) arrayList2.get(i3)).booleanValue() ? fsVar.a(this.y, fvVar) : fsVar.b(this.y, fvVar);
        }
        this.y.clear();
        if (!z) {
            gh.a(this, (ArrayList) arrayList, (ArrayList) arrayList2, i, i2, false);
        }
        ga.b(arrayList, arrayList2, i, i2);
        if (z) {
            iw iwVar = new iw();
            b(iwVar);
            i3 = a((ArrayList) arrayList, (ArrayList) arrayList2, i, i2, iwVar);
            ga.a(iwVar);
            i4 = i3;
        } else {
            i4 = i6;
        }
        if (i4 != i5 && z) {
            gh.a(this, (ArrayList) arrayList, (ArrayList) arrayList2, i, i4, true);
            a(this.d, true);
        }
        while (i5 < i6) {
            fs fsVar2 = (fs) arrayList.get(i5);
            if (((Boolean) arrayList2.get(i5)).booleanValue() && fsVar2.k >= 0) {
                int i7 = fsVar2.k;
                synchronized (this) {
                    this.n.set(i7, null);
                    if (this.o == null) {
                        this.o = new ArrayList();
                    }
                    this.o.add(Integer.valueOf(i7));
                }
                fsVar2.k = -1;
            }
            i5++;
        }
    }

    private static boolean a(Animator animator) {
        if (animator == null) {
            return false;
        }
        int i;
        if (animator instanceof ValueAnimator) {
            PropertyValuesHolder[] values = ((ValueAnimator) animator).getValues();
            for (PropertyValuesHolder propertyName : values) {
                if ("alpha".equals(propertyName.getPropertyName())) {
                    return true;
                }
            }
        } else if (animator instanceof AnimatorSet) {
            ArrayList childAnimations = ((AnimatorSet) animator).getChildAnimations();
            for (i = 0; i < childAnimations.size(); i++) {
                if (ga.a((Animator) childAnimations.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    private void b(fv fvVar, Context context, boolean z) {
        fv fvVar2 = this.q;
        if (fvVar2 != null) {
            fz fragmentManager = fvVar2.getFragmentManager();
            if (fragmentManager instanceof ga) {
                ((ga) fragmentManager).b(fvVar, context, true);
            }
        }
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            je jeVar = (je) it.next();
            if (z) {
                ((Boolean) jeVar.b).booleanValue();
            }
        }
    }

    private void b(fv fvVar, Bundle bundle, boolean z) {
        fv fvVar2 = this.q;
        if (fvVar2 != null) {
            fz fragmentManager = fvVar2.getFragmentManager();
            if (fragmentManager instanceof ga) {
                ((ga) fragmentManager).b(fvVar, bundle, true);
            }
        }
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            je jeVar = (je) it.next();
            if (!z || ((Boolean) jeVar.b).booleanValue()) {
                ((a) jeVar.a).a(fvVar);
            }
        }
    }

    private void b(fv fvVar, boolean z) {
        fv fvVar2 = this.q;
        if (fvVar2 != null) {
            fz fragmentManager = fvVar2.getFragmentManager();
            if (fragmentManager instanceof ga) {
                ((ga) fragmentManager).b(fvVar, true);
            }
        }
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            je jeVar = (je) it.next();
            if (!z || ((Boolean) jeVar.b).booleanValue()) {
                ((a) jeVar.a).b(fvVar);
            }
        }
    }

    private void b(iw<fv> iwVar) {
        int i = this.d;
        if (i > 0) {
            i = Math.min(i, 4);
            int size = this.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                fv fvVar = (fv) this.a.get(i2);
                if (fvVar.mState < i) {
                    a(fvVar, i, fvVar.getNextAnim(), fvVar.getNextTransition(), false);
                    if (!(fvVar.mView == null || fvVar.mHidden || !fvVar.mIsNewlyAdded)) {
                        iwVar.add(fvVar);
                    }
                }
            }
        }
    }

    private void b(ArrayList<fs> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            a((ArrayList) arrayList, (ArrayList) arrayList2);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                if (!((fs) arrayList.get(i)).r) {
                    if (i2 != i) {
                        a((ArrayList) arrayList, (ArrayList) arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (((Boolean) arrayList2.get(i)).booleanValue()) {
                        while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((fs) arrayList.get(i2)).r) {
                            i2++;
                        }
                    }
                    a((ArrayList) arrayList, (ArrayList) arrayList2, i, i2);
                    i = i2 - 1;
                }
                i++;
            }
            if (i2 != size) {
                a((ArrayList) arrayList, (ArrayList) arrayList2, i2, size);
            }
        }
    }

    private static void b(ArrayList<fs> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            fs fsVar = (fs) arrayList.get(i);
            boolean z = true;
            if (((Boolean) arrayList2.get(i)).booleanValue()) {
                fsVar.a(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                fsVar.a(z);
            } else {
                fsVar.a(1);
                fsVar.f();
            }
            i++;
        }
    }

    private fv c(int i) {
        int size;
        fv fvVar;
        for (size = this.a.size() - 1; size >= 0; size--) {
            fvVar = (fv) this.a.get(size);
            if (fvVar != null && fvVar.mFragmentId == i) {
                return fvVar;
            }
        }
        SparseArray sparseArray = this.b;
        if (sparseArray != null) {
            for (size = sparseArray.size() - 1; size >= 0; size--) {
                fvVar = (fv) this.b.valueAt(size);
                if (fvVar != null && fvVar.mFragmentId == i) {
                    return fvVar;
                }
            }
        }
        return null;
    }

    private void c(fv fvVar, Bundle bundle, boolean z) {
        fv fvVar2 = this.q;
        if (fvVar2 != null) {
            fz fragmentManager = fvVar2.getFragmentManager();
            if (fragmentManager instanceof ga) {
                ((ga) fragmentManager).c(fvVar, bundle, true);
            }
        }
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            je jeVar = (je) it.next();
            if (z) {
                ((Boolean) jeVar.b).booleanValue();
            }
        }
    }

    private void c(fv fvVar, boolean z) {
        fv fvVar2 = this.q;
        if (fvVar2 != null) {
            fz fragmentManager = fvVar2.getFragmentManager();
            if (fragmentManager instanceof ga) {
                ((ga) fragmentManager).c(fvVar, true);
            }
        }
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            je jeVar = (je) it.next();
            if (!z || ((Boolean) jeVar.b).booleanValue()) {
                ((a) jeVar.a).c(fvVar);
            }
        }
    }

    private void c(boolean z) {
        if (this.k) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.e == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() == this.e.c.getLooper()) {
            if (!z) {
                s();
            }
            if (this.w == null) {
                this.w = new ArrayList();
                this.x = new ArrayList();
            }
            this.k = true;
            try {
                a(null, null);
            } finally {
                this.k = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x003d in {6, 9, 12, 14, 17} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private boolean c(java.util.ArrayList<defpackage.fs> r5, java.util.ArrayList<java.lang.Boolean> r6) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.j;	 Catch:{ all -> 0x003a }
        r1 = 0;	 Catch:{ all -> 0x003a }
        if (r0 == 0) goto L_0x0038;	 Catch:{ all -> 0x003a }
        r0 = r4.j;	 Catch:{ all -> 0x003a }
        r0 = r0.size();	 Catch:{ all -> 0x003a }
        if (r0 != 0) goto L_0x000f;	 Catch:{ all -> 0x003a }
        goto L_0x0038;	 Catch:{ all -> 0x003a }
        r0 = r4.j;	 Catch:{ all -> 0x003a }
        r0 = r0.size();	 Catch:{ all -> 0x003a }
        r2 = 0;	 Catch:{ all -> 0x003a }
        if (r1 >= r0) goto L_0x0028;	 Catch:{ all -> 0x003a }
        r3 = r4.j;	 Catch:{ all -> 0x003a }
        r3 = r3.get(r1);	 Catch:{ all -> 0x003a }
        r3 = (defpackage.ga.g) r3;	 Catch:{ all -> 0x003a }
        r3 = r3.a(r5, r6);	 Catch:{ all -> 0x003a }
        r2 = r2 | r3;	 Catch:{ all -> 0x003a }
        r1 = r1 + 1;	 Catch:{ all -> 0x003a }
        goto L_0x0016;	 Catch:{ all -> 0x003a }
        r5 = r4.j;	 Catch:{ all -> 0x003a }
        r5.clear();	 Catch:{ all -> 0x003a }
        r5 = r4.e;	 Catch:{ all -> 0x003a }
        r5 = r5.c;	 Catch:{ all -> 0x003a }
        r6 = r4.C;	 Catch:{ all -> 0x003a }
        r5.removeCallbacks(r6);	 Catch:{ all -> 0x003a }
        monitor-exit(r4);	 Catch:{ all -> 0x003a }
        return r2;	 Catch:{ all -> 0x003a }
        monitor-exit(r4);	 Catch:{ all -> 0x003a }
        return r1;	 Catch:{ all -> 0x003a }
        r5 = move-exception;	 Catch:{ all -> 0x003a }
        monitor-exit(r4);	 Catch:{ all -> 0x003a }
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ga.c(java.util.ArrayList, java.util.ArrayList):boolean");
    }

    private void d(fv fvVar, Bundle bundle, boolean z) {
        fv fvVar2 = this.q;
        if (fvVar2 != null) {
            fz fragmentManager = fvVar2.getFragmentManager();
            if (fragmentManager instanceof ga) {
                ((ga) fragmentManager).d(fvVar, bundle, true);
            }
        }
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            je jeVar = (je) it.next();
            if (z) {
                ((Boolean) jeVar.b).booleanValue();
            }
        }
    }

    private void d(fv fvVar, boolean z) {
        fv fvVar2 = this.q;
        if (fvVar2 != null) {
            fz fragmentManager = fvVar2.getFragmentManager();
            if (fragmentManager instanceof ga) {
                ((ga) fragmentManager).d(fvVar, true);
            }
        }
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            je jeVar = (je) it.next();
            if (z) {
                ((Boolean) jeVar.b).booleanValue();
            }
        }
    }

    private void e(fv fvVar, boolean z) {
        fv fvVar2 = this.q;
        if (fvVar2 != null) {
            fz fragmentManager = fvVar2.getFragmentManager();
            if (fragmentManager instanceof ga) {
                ((ga) fragmentManager).e(fvVar, true);
            }
        }
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            je jeVar = (je) it.next();
            if (z) {
                ((Boolean) jeVar.b).booleanValue();
            }
        }
    }

    public static void f(fv fvVar) {
        if (!fvVar.mHidden) {
            fvVar.mHidden = true;
            fvVar.mHiddenChanged = 1 ^ fvVar.mHiddenChanged;
        }
    }

    private void f(fv fvVar, boolean z) {
        fv fvVar2 = this.q;
        if (fvVar2 != null) {
            fz fragmentManager = fvVar2.getFragmentManager();
            if (fragmentManager instanceof ga) {
                ((ga) fragmentManager).f(fvVar, true);
            }
        }
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            je jeVar = (je) it.next();
            if (z) {
                ((Boolean) jeVar.b).booleanValue();
            }
        }
    }

    public static void g(fv fvVar) {
        if (fvVar.mHidden) {
            fvVar.mHidden = false;
            fvVar.mHiddenChanged ^= 1;
        }
    }

    private void g(fv fvVar, boolean z) {
        fv fvVar2 = this.q;
        if (fvVar2 != null) {
            fz fragmentManager = fvVar2.getFragmentManager();
            if (fragmentManager instanceof ga) {
                ((ga) fragmentManager).g(fvVar, true);
            }
        }
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            je jeVar = (je) it.next();
            if (z) {
                ((Boolean) jeVar.b).booleanValue();
            }
        }
    }

    private void h(fv fvVar, boolean z) {
        fv fvVar2 = this.q;
        if (fvVar2 != null) {
            fz fragmentManager = fvVar2.getFragmentManager();
            if (fragmentManager instanceof ga) {
                ((ga) fragmentManager).h(fvVar, true);
            }
        }
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            je jeVar = (je) it.next();
            if (z) {
                ((Boolean) jeVar.b).booleanValue();
            }
        }
    }

    private void k(fv fvVar) {
        a(fvVar, this.d, 0, 0, false);
    }

    private void l(fv fvVar) {
        if (fvVar.mFromLayout && !fvVar.mPerformedCreateView) {
            fvVar.mView = fvVar.performCreateView(fvVar.performGetLayoutInflater(fvVar.mSavedFragmentState), null, fvVar.mSavedFragmentState);
            if (fvVar.mView != null) {
                fvVar.mInnerView = fvVar.mView;
                fvVar.mView.setSaveFromParentEnabled(false);
                if (fvVar.mHidden) {
                    fvVar.mView.setVisibility(8);
                }
                fvVar.onViewCreated(fvVar.mView, fvVar.mSavedFragmentState);
                a(fvVar, fvVar.mView, fvVar.mSavedFragmentState, false);
                return;
            }
            fvVar.mInnerView = null;
        }
    }

    private void m(final fv fvVar) {
        if (fvVar.mView != null) {
            c a = a(fvVar, fvVar.getNextTransition(), fvVar.mHidden ^ 1, fvVar.getNextTransitionStyle());
            if (a == null || a.b == null) {
                if (a != null) {
                    ga.a(fvVar.mView, a);
                    fvVar.mView.startAnimation(a.a);
                    a.a.start();
                }
                int i = (!fvVar.mHidden || fvVar.isHideReplaced()) ? 0 : 8;
                fvVar.mView.setVisibility(i);
                if (fvVar.isHideReplaced()) {
                    fvVar.setHideReplaced(false);
                }
            } else {
                a.b.setTarget(fvVar.mView);
                if (!fvVar.mHidden) {
                    fvVar.mView.setVisibility(0);
                } else if (fvVar.isHideReplaced()) {
                    fvVar.setHideReplaced(false);
                } else {
                    final ViewGroup viewGroup = fvVar.mContainer;
                    final View view = fvVar.mView;
                    viewGroup.startViewTransition(view);
                    a.b.addListener(new AnimatorListenerAdapter() {
                        public final void onAnimationEnd(Animator animator) {
                            viewGroup.endViewTransition(view);
                            animator.removeListener(this);
                            if (fvVar.mView != null) {
                                fvVar.mView.setVisibility(8);
                            }
                        }
                    });
                }
                ga.a(fvVar.mView, a);
                a.b.start();
            }
        }
        if (fvVar.mAdded && fvVar.mHasMenu && fvVar.mMenuVisible) {
            this.s = true;
        }
        fvVar.mHiddenChanged = false;
        fvVar.onHiddenChanged(fvVar.mHidden);
    }

    private void n(fv fvVar) {
        if (fvVar.mIndex >= 0) {
            this.b.put(fvVar.mIndex, null);
            fvVar.initState();
        }
    }

    private fv o(fv fvVar) {
        ViewGroup viewGroup = fvVar.mContainer;
        View view = fvVar.mView;
        if (!(viewGroup == null || view == null)) {
            for (int indexOf = this.a.indexOf(fvVar) - 1; indexOf >= 0; indexOf--) {
                fv fvVar2 = (fv) this.a.get(indexOf);
                if (fvVar2.mContainer == viewGroup && fvVar2.mView != null) {
                    return fvVar2;
                }
            }
        }
        return null;
    }

    private void p(fv fvVar) {
        if (fvVar.mInnerView != null) {
            SparseArray sparseArray = this.A;
            if (sparseArray == null) {
                this.A = new SparseArray();
            } else {
                sparseArray.clear();
            }
            fvVar.mInnerView.saveHierarchyState(this.A);
            if (this.A.size() > 0) {
                fvVar.mSavedViewState = this.A;
                this.A = null;
            }
        }
    }

    private Bundle q(fv fvVar) {
        Bundle bundle;
        if (this.z == null) {
            this.z = new Bundle();
        }
        fvVar.performSaveInstanceState(this.z);
        d(fvVar, this.z, false);
        if (this.z.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.z;
            this.z = null;
        }
        if (fvVar.mView != null) {
            p(fvVar);
        }
        if (fvVar.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fvVar.mSavedViewState);
        }
        if (!fvVar.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fvVar.mUserVisibleHint);
        }
        return bundle;
    }

    private boolean q() {
        g();
        c(true);
        fv fvVar = this.g;
        if (fvVar != null) {
            fz peekChildFragmentManager = fvVar.peekChildFragmentManager();
            if (peekChildFragmentManager != null && peekChildFragmentManager.c()) {
                return true;
            }
        }
        boolean a = a(this.w, this.x, null, -1, 0);
        if (a) {
            this.k = true;
            try {
                b(this.w, this.x);
            } finally {
                t();
            }
        }
        w();
        y();
        return a;
    }

    private void r() {
        if (this.b != null) {
            for (int i = 0; i < this.b.size(); i++) {
                fv fvVar = (fv) this.b.valueAt(i);
                if (fvVar != null) {
                    b(fvVar);
                }
            }
        }
    }

    private void s() {
        if (e()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void t() {
        this.k = false;
        this.x.clear();
        this.w.clear();
    }

    private void u() {
        if (this.B != null) {
            while (!this.B.isEmpty()) {
                ((i) this.B.remove(0)).c();
            }
        }
    }

    private void v() {
        SparseArray sparseArray = this.b;
        int i = 0;
        int size = sparseArray == null ? 0 : sparseArray.size();
        while (i < size) {
            fv fvVar = (fv) this.b.valueAt(i);
            if (fvVar != null) {
                if (fvVar.getAnimatingAway() != null) {
                    int stateAfterAnimating = fvVar.getStateAfterAnimating();
                    View animatingAway = fvVar.getAnimatingAway();
                    Animation animation = animatingAway.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        animatingAway.clearAnimation();
                    }
                    fvVar.setAnimatingAway(null);
                    a(fvVar, stateAfterAnimating, 0, 0, false);
                } else if (fvVar.getAnimator() != null) {
                    fvVar.getAnimator().end();
                }
            }
            i++;
        }
    }

    private void w() {
        if (this.v) {
            this.v = false;
            r();
        }
    }

    private void x() {
        List list;
        List list2;
        List list3;
        if (this.b != null) {
            list = null;
            list2 = list;
            list3 = list2;
            for (int i = 0; i < this.b.size(); i++) {
                fv fvVar = (fv) this.b.valueAt(i);
                if (fvVar != null) {
                    Object obj;
                    if (fvVar.mRetainInstance) {
                        if (list == null) {
                            list = new ArrayList();
                        }
                        list.add(fvVar);
                        fvVar.mTargetIndex = fvVar.mTarget != null ? fvVar.mTarget.mIndex : -1;
                    }
                    if (fvVar.mChildFragmentManager != null) {
                        fvVar.mChildFragmentManager.x();
                        obj = fvVar.mChildFragmentManager.i;
                    } else {
                        obj = fvVar.mChildNonConfig;
                    }
                    if (list2 == null && obj != null) {
                        list2 = new ArrayList(this.b.size());
                        for (int i2 = 0; i2 < i; i2++) {
                            list2.add(null);
                        }
                    }
                    if (list2 != null) {
                        list2.add(obj);
                    }
                    if (list3 == null && fvVar.mViewModelStore != null) {
                        list3 = new ArrayList(this.b.size());
                        for (int i3 = 0; i3 < i; i3++) {
                            list3.add(null);
                        }
                    }
                    if (list3 != null) {
                        list3.add(fvVar.mViewModelStore);
                    }
                }
            }
        } else {
            list = null;
            list2 = list;
            list3 = list2;
        }
        if (list == null && list2 == null && list3 == null) {
            this.i = null;
        } else {
            this.i = new gb(list, list2, list3);
        }
    }

    private void y() {
        SparseArray sparseArray = this.b;
        if (sparseArray != null) {
            for (int size = sparseArray.size() - 1; size >= 0; size--) {
                if (this.b.valueAt(size) == null) {
                    SparseArray sparseArray2 = this.b;
                    sparseArray2.delete(sparseArray2.keyAt(size));
                }
            }
        }
    }

    public final int a(fs fsVar) {
        synchronized (this) {
            int intValue;
            if (this.o != null) {
                if (this.o.size() > 0) {
                    intValue = ((Integer) this.o.remove(this.o.size() - 1)).intValue();
                    this.n.set(intValue, fsVar);
                    return intValue;
                }
            }
            if (this.n == null) {
                this.n = new ArrayList();
            }
            intValue = this.n.size();
            this.n.add(fsVar);
            return intValue;
        }
    }

    public final d a(fv fvVar) {
        if (fvVar.mIndex < 0) {
            StringBuilder stringBuilder = new StringBuilder("Fragment ");
            stringBuilder.append(fvVar);
            stringBuilder.append(" is not currently in the FragmentManager");
            a(new IllegalStateException(stringBuilder.toString()));
        }
        if (fvVar.mState > 0) {
            Bundle q = q(fvVar);
            if (q != null) {
                return new d(q);
            }
        }
        return null;
    }

    public final fv a(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        fv fvVar = (fv) this.b.get(i);
        if (fvVar == null) {
            StringBuilder stringBuilder = new StringBuilder("Fragment no longer exists for key ");
            stringBuilder.append(str);
            stringBuilder.append(": index ");
            stringBuilder.append(i);
            a(new IllegalStateException(stringBuilder.toString()));
        }
        return fvVar;
    }

    public final fv a(String str) {
        int size;
        fv fvVar;
        if (str != null) {
            for (size = this.a.size() - 1; size >= 0; size--) {
                fvVar = (fv) this.a.get(size);
                if (fvVar != null && str.equals(fvVar.mTag)) {
                    return fvVar;
                }
            }
        }
        SparseArray sparseArray = this.b;
        if (!(sparseArray == null || str == null)) {
            for (size = sparseArray.size() - 1; size >= 0; size--) {
                fvVar = (fv) this.b.valueAt(size);
                if (fvVar != null && str.equals(fvVar.mTag)) {
                    return fvVar;
                }
            }
        }
        return null;
    }

    public final gg a() {
        return new fs(this);
    }

    public final void a(int i) {
        if (i >= 0) {
            a(new h(i), false);
        } else {
            throw new IllegalArgumentException("Bad id: ".concat(String.valueOf(i)));
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, boolean z) {
        if (this.e == null && i != 0) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.d) {
            this.d = i;
            if (this.b != null) {
                int i2;
                i = this.a.size();
                for (i2 = 0; i2 < i; i2++) {
                    c((fv) this.a.get(i2));
                }
                i = this.b.size();
                for (i2 = 0; i2 < i; i2++) {
                    fv fvVar = (fv) this.b.valueAt(i2);
                    if (fvVar != null && ((fvVar.mRemoving || fvVar.mDetached) && !fvVar.mIsNewlyAdded)) {
                        c(fvVar);
                    }
                }
                r();
                if (this.s) {
                    fy fyVar = this.e;
                    if (fyVar != null && this.d == 5) {
                        fyVar.d();
                        this.s = false;
                    }
                }
            }
        }
    }

    public final void a(Configuration configuration) {
        for (int i = 0; i < this.a.size(); i++) {
            fv fvVar = (fv) this.a.get(i);
            if (fvVar != null) {
                fvVar.performConfigurationChanged(configuration);
            }
        }
    }

    public final void a(Bundle bundle, String str, fv fvVar) {
        if (fvVar.mIndex < 0) {
            StringBuilder stringBuilder = new StringBuilder("Fragment ");
            stringBuilder.append(fvVar);
            stringBuilder.append(" is not currently in the FragmentManager");
            a(new IllegalStateException(stringBuilder.toString()));
        }
        bundle.putInt(str, fvVar.mIndex);
    }

    public final void a(Parcelable parcelable, gb gbVar) {
        if (parcelable != null) {
            gc gcVar = (gc) parcelable;
            if (gcVar.a != null) {
                List list;
                List list2;
                int i = 0;
                if (gbVar != null) {
                    List list3 = gbVar.a;
                    list = gbVar.b;
                    list2 = gbVar.c;
                    int size = list3 != null ? list3.size() : 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        fv fvVar = (fv) list3.get(i2);
                        int i3 = 0;
                        while (i3 < gcVar.a.length && gcVar.a[i3].a != fvVar.mIndex) {
                            i3++;
                        }
                        if (i3 == gcVar.a.length) {
                            StringBuilder stringBuilder = new StringBuilder("Could not find active fragment with index ");
                            stringBuilder.append(fvVar.mIndex);
                            a(new IllegalStateException(stringBuilder.toString()));
                        }
                        ge geVar = gcVar.a[i3];
                        geVar.c = fvVar;
                        fvVar.mSavedViewState = null;
                        fvVar.mBackStackNesting = 0;
                        fvVar.mInLayout = false;
                        fvVar.mAdded = false;
                        fvVar.mTarget = null;
                        if (geVar.b != null) {
                            geVar.b.setClassLoader(this.e.b.getClassLoader());
                            fvVar.mSavedViewState = geVar.b.getSparseParcelableArray("android:view_state");
                            fvVar.mSavedFragmentState = geVar.b;
                        }
                    }
                } else {
                    list = null;
                    list2 = list;
                }
                this.b = new SparseArray(gcVar.a.length);
                int i4 = 0;
                while (i4 < gcVar.a.length) {
                    ge geVar2 = gcVar.a[i4];
                    if (geVar2 != null) {
                        gb gbVar2 = (list == null || i4 >= list.size()) ? null : (gb) list.get(i4);
                        y yVar = (list2 == null || i4 >= list2.size()) ? null : (y) list2.get(i4);
                        fv a = geVar2.a(this.e, this.f, this.q, gbVar2, yVar);
                        this.b.put(a.mIndex, a);
                        geVar2.c = null;
                    }
                    i4++;
                }
                if (gbVar != null) {
                    List list4 = gbVar.a;
                    i4 = list4 != null ? list4.size() : 0;
                    for (int i5 = 0; i5 < i4; i5++) {
                        fv fvVar2 = (fv) list4.get(i5);
                        if (fvVar2.mTargetIndex >= 0) {
                            fvVar2.mTarget = (fv) this.b.get(fvVar2.mTargetIndex);
                            if (fvVar2.mTarget == null) {
                                StringBuilder stringBuilder2 = new StringBuilder("Re-attaching retained fragment ");
                                stringBuilder2.append(fvVar2);
                                stringBuilder2.append(" target no longer exists: ");
                                stringBuilder2.append(fvVar2.mTargetIndex);
                                Log.w("FragmentManager", stringBuilder2.toString());
                            }
                        }
                    }
                }
                this.a.clear();
                if (gcVar.b != null) {
                    for (int i6 = 0; i6 < gcVar.b.length; i6++) {
                        fv fvVar3 = (fv) this.b.get(gcVar.b[i6]);
                        if (fvVar3 == null) {
                            StringBuilder stringBuilder3 = new StringBuilder("No instantiated fragment for index #");
                            stringBuilder3.append(gcVar.b[i6]);
                            a(new IllegalStateException(stringBuilder3.toString()));
                        }
                        fvVar3.mAdded = true;
                        if (this.a.contains(fvVar3)) {
                            throw new IllegalStateException("Already added!");
                        }
                        synchronized (this.a) {
                            this.a.add(fvVar3);
                        }
                    }
                }
                if (gcVar.c != null) {
                    this.c = new ArrayList(gcVar.c.length);
                    while (i < gcVar.c.length) {
                        fs a2 = gcVar.c[i].a(this);
                        this.c.add(a2);
                        if (a2.k >= 0) {
                            a(a2.k, a2);
                        }
                        i++;
                    }
                } else {
                    this.c = null;
                }
                if (gcVar.d >= 0) {
                    this.g = (fv) this.b.get(gcVar.d);
                }
                this.l = gcVar.e;
            }
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0367  */
    /* JADX WARNING: Missing block: B:42:0x0075, code skipped:
            if (r0 != 4) goto L_0x0362;
     */
    public final void a(defpackage.fv r17, int r18, int r19, int r20, boolean r21) {
        /*
        r16 = this;
        r6 = r16;
        r7 = r17;
        r0 = r7.mAdded;
        r8 = 1;
        if (r0 == 0) goto L_0x0011;
    L_0x0009:
        r0 = r7.mDetached;
        if (r0 == 0) goto L_0x000e;
    L_0x000d:
        goto L_0x0011;
    L_0x000e:
        r0 = r18;
        goto L_0x0016;
    L_0x0011:
        r0 = r18;
        if (r0 <= r8) goto L_0x0016;
    L_0x0015:
        r0 = 1;
    L_0x0016:
        r1 = r7.mRemoving;
        if (r1 == 0) goto L_0x002c;
    L_0x001a:
        r1 = r7.mState;
        if (r0 <= r1) goto L_0x002c;
    L_0x001e:
        r0 = r7.mState;
        if (r0 != 0) goto L_0x002a;
    L_0x0022:
        r0 = r17.isInBackStack();
        if (r0 == 0) goto L_0x002a;
    L_0x0028:
        r0 = 1;
        goto L_0x002c;
    L_0x002a:
        r0 = r7.mState;
    L_0x002c:
        r1 = r7.mDeferStart;
        r9 = 4;
        r10 = 3;
        if (r1 == 0) goto L_0x003a;
    L_0x0032:
        r1 = r7.mState;
        if (r1 >= r9) goto L_0x003a;
    L_0x0036:
        if (r0 <= r10) goto L_0x003a;
    L_0x0038:
        r11 = 3;
        goto L_0x003b;
    L_0x003a:
        r11 = r0;
    L_0x003b:
        r0 = r7.mState;
        r12 = 2;
        r13 = 0;
        r14 = 0;
        if (r0 > r11) goto L_0x0278;
    L_0x0042:
        r0 = r7.mFromLayout;
        if (r0 == 0) goto L_0x004b;
    L_0x0046:
        r0 = r7.mInLayout;
        if (r0 != 0) goto L_0x004b;
    L_0x004a:
        return;
    L_0x004b:
        r0 = r17.getAnimatingAway();
        if (r0 != 0) goto L_0x0057;
    L_0x0051:
        r0 = r17.getAnimator();
        if (r0 == 0) goto L_0x006b;
    L_0x0057:
        r7.setAnimatingAway(r13);
        r7.setAnimator(r13);
        r2 = r17.getStateAfterAnimating();
        r3 = 0;
        r4 = 0;
        r5 = 1;
        r0 = r16;
        r1 = r17;
        r0.a(r1, r2, r3, r4, r5);
    L_0x006b:
        r0 = r7.mState;
        if (r0 == 0) goto L_0x0079;
    L_0x006f:
        if (r0 == r8) goto L_0x0181;
    L_0x0071:
        if (r0 == r12) goto L_0x025e;
    L_0x0073:
        if (r0 == r10) goto L_0x0262;
    L_0x0075:
        if (r0 == r9) goto L_0x026a;
    L_0x0077:
        goto L_0x0362;
    L_0x0079:
        if (r11 <= 0) goto L_0x0181;
    L_0x007b:
        r0 = r7.mSavedFragmentState;
        if (r0 == 0) goto L_0x00d0;
    L_0x007f:
        r0 = r7.mSavedFragmentState;
        r1 = r6.e;
        r1 = r1.b;
        r1 = r1.getClassLoader();
        r0.setClassLoader(r1);
        r0 = r7.mSavedFragmentState;
        r1 = "android:view_state";
        r0 = r0.getSparseParcelableArray(r1);
        r7.mSavedViewState = r0;
        r0 = r7.mSavedFragmentState;
        r1 = "android:target_state";
        r0 = r6.a(r0, r1);
        r7.mTarget = r0;
        r0 = r7.mTarget;
        if (r0 == 0) goto L_0x00ae;
    L_0x00a4:
        r0 = r7.mSavedFragmentState;
        r1 = "android:target_req_state";
        r0 = r0.getInt(r1, r14);
        r7.mTargetRequestCode = r0;
    L_0x00ae:
        r0 = r7.mSavedUserVisibleHint;
        if (r0 == 0) goto L_0x00bd;
    L_0x00b2:
        r0 = r7.mSavedUserVisibleHint;
        r0 = r0.booleanValue();
        r7.mUserVisibleHint = r0;
        r7.mSavedUserVisibleHint = r13;
        goto L_0x00c7;
    L_0x00bd:
        r0 = r7.mSavedFragmentState;
        r1 = "android:user_visible_hint";
        r0 = r0.getBoolean(r1, r8);
        r7.mUserVisibleHint = r0;
    L_0x00c7:
        r0 = r7.mUserVisibleHint;
        if (r0 != 0) goto L_0x00d0;
    L_0x00cb:
        r7.mDeferStart = r8;
        if (r11 <= r10) goto L_0x00d0;
    L_0x00cf:
        r11 = 3;
    L_0x00d0:
        r0 = r6.e;
        r7.mHost = r0;
        r1 = r6.q;
        r7.mParentFragment = r1;
        if (r1 == 0) goto L_0x00dd;
    L_0x00da:
        r0 = r1.mChildFragmentManager;
        goto L_0x00df;
    L_0x00dd:
        r0 = r0.d;
    L_0x00df:
        r7.mFragmentManager = r0;
        r0 = r7.mTarget;
        r15 = "Fragment ";
        if (r0 == 0) goto L_0x0128;
    L_0x00e7:
        r0 = r6.b;
        r1 = r7.mTarget;
        r1 = r1.mIndex;
        r0 = r0.get(r1);
        r1 = r7.mTarget;
        if (r0 != r1) goto L_0x0107;
    L_0x00f5:
        r0 = r7.mTarget;
        r0 = r0.mState;
        if (r0 > 0) goto L_0x0128;
    L_0x00fb:
        r1 = r7.mTarget;
        r2 = 1;
        r3 = 0;
        r4 = 0;
        r5 = 1;
        r0 = r16;
        r0.a(r1, r2, r3, r4, r5);
        goto L_0x0128;
    L_0x0107:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r15);
        r1.append(r7);
        r2 = " declared target fragment ";
        r1.append(r2);
        r2 = r7.mTarget;
        r1.append(r2);
        r2 = " that does not belong to this FragmentManager!";
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0128:
        r0 = r6.e;
        r0 = r0.b;
        r6.a(r7, r0, r14);
        r7.mCalled = r14;
        r0 = r6.e;
        r0 = r0.b;
        r7.onAttach(r0);
        r0 = r7.mCalled;
        if (r0 == 0) goto L_0x016a;
    L_0x013c:
        r0 = r7.mParentFragment;
        if (r0 == 0) goto L_0x0145;
    L_0x0140:
        r0 = r7.mParentFragment;
        r0.onAttachFragment(r7);
    L_0x0145:
        r0 = r6.e;
        r0 = r0.b;
        r6.b(r7, r0, r14);
        r0 = r7.mIsCreated;
        if (r0 != 0) goto L_0x0160;
    L_0x0150:
        r0 = r7.mSavedFragmentState;
        r6.a(r7, r0, r14);
        r0 = r7.mSavedFragmentState;
        r7.performCreate(r0);
        r0 = r7.mSavedFragmentState;
        r6.b(r7, r0, r14);
        goto L_0x0167;
    L_0x0160:
        r0 = r7.mSavedFragmentState;
        r7.restoreChildFragmentState(r0);
        r7.mState = r8;
    L_0x0167:
        r7.mRetaining = r14;
        goto L_0x0181;
    L_0x016a:
        r0 = new gv;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r15);
        r1.append(r7);
        r2 = " did not call through to super.onAttach()";
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0181:
        r16.l(r17);
        if (r11 <= r8) goto L_0x025e;
    L_0x0186:
        r0 = r7.mFromLayout;
        if (r0 != 0) goto L_0x0249;
    L_0x018a:
        r0 = r7.mContainerId;
        if (r0 == 0) goto L_0x01f8;
    L_0x018e:
        r0 = r7.mContainerId;
        r1 = -1;
        if (r0 != r1) goto L_0x01ae;
    L_0x0193:
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r2 = "Cannot create fragment ";
        r1.<init>(r2);
        r1.append(r7);
        r2 = " for a container view with no id";
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        r6.a(r0);
    L_0x01ae:
        r0 = r6.f;
        r1 = r7.mContainerId;
        r0 = r0.a(r1);
        r0 = (android.view.ViewGroup) r0;
        if (r0 != 0) goto L_0x01f9;
    L_0x01ba:
        r1 = r7.mRestored;
        if (r1 != 0) goto L_0x01f9;
    L_0x01be:
        r1 = r17.getResources();	 Catch:{ NotFoundException -> 0x01c9 }
        r2 = r7.mContainerId;	 Catch:{ NotFoundException -> 0x01c9 }
        r1 = r1.getResourceName(r2);	 Catch:{ NotFoundException -> 0x01c9 }
        goto L_0x01cb;
    L_0x01c9:
        r1 = "unknown";
    L_0x01cb:
        r2 = new java.lang.IllegalArgumentException;
        r3 = new java.lang.StringBuilder;
        r4 = "No view found for id 0x";
        r3.<init>(r4);
        r4 = r7.mContainerId;
        r4 = java.lang.Integer.toHexString(r4);
        r3.append(r4);
        r4 = " (";
        r3.append(r4);
        r3.append(r1);
        r1 = ") for fragment ";
        r3.append(r1);
        r3.append(r7);
        r1 = r3.toString();
        r2.<init>(r1);
        r6.a(r2);
        goto L_0x01f9;
    L_0x01f8:
        r0 = r13;
    L_0x01f9:
        r7.mContainer = r0;
        r1 = r7.mSavedFragmentState;
        r1 = r7.performGetLayoutInflater(r1);
        r2 = r7.mSavedFragmentState;
        r1 = r7.performCreateView(r1, r0, r2);
        r7.mView = r1;
        r1 = r7.mView;
        if (r1 == 0) goto L_0x0247;
    L_0x020d:
        r1 = r7.mView;
        r7.mInnerView = r1;
        r1 = r7.mView;
        r1.setSaveFromParentEnabled(r14);
        if (r0 == 0) goto L_0x021d;
    L_0x0218:
        r1 = r7.mView;
        r0.addView(r1);
    L_0x021d:
        r0 = r7.mHidden;
        if (r0 == 0) goto L_0x0228;
    L_0x0221:
        r0 = r7.mView;
        r1 = 8;
        r0.setVisibility(r1);
    L_0x0228:
        r0 = r7.mView;
        r1 = r7.mSavedFragmentState;
        r7.onViewCreated(r0, r1);
        r0 = r7.mView;
        r1 = r7.mSavedFragmentState;
        r6.a(r7, r0, r1, r14);
        r0 = r7.mView;
        r0 = r0.getVisibility();
        if (r0 != 0) goto L_0x0243;
    L_0x023e:
        r0 = r7.mContainer;
        if (r0 == 0) goto L_0x0243;
    L_0x0242:
        goto L_0x0244;
    L_0x0243:
        r8 = 0;
    L_0x0244:
        r7.mIsNewlyAdded = r8;
        goto L_0x0249;
    L_0x0247:
        r7.mInnerView = r13;
    L_0x0249:
        r0 = r7.mSavedFragmentState;
        r7.performActivityCreated(r0);
        r0 = r7.mSavedFragmentState;
        r6.c(r7, r0, r14);
        r0 = r7.mView;
        if (r0 == 0) goto L_0x025c;
    L_0x0257:
        r0 = r7.mSavedFragmentState;
        r7.restoreViewState(r0);
    L_0x025c:
        r7.mSavedFragmentState = r13;
    L_0x025e:
        if (r11 <= r12) goto L_0x0262;
    L_0x0260:
        r7.mState = r10;
    L_0x0262:
        if (r11 <= r10) goto L_0x026a;
    L_0x0264:
        r17.performStart();
        r6.b(r7, r14);
    L_0x026a:
        if (r11 <= r9) goto L_0x0362;
    L_0x026c:
        r17.performResume();
        r6.c(r7, r14);
        r7.mSavedFragmentState = r13;
        r7.mSavedViewState = r13;
        goto L_0x0362;
    L_0x0278:
        r0 = r7.mState;
        if (r0 <= r11) goto L_0x0362;
    L_0x027c:
        r0 = r7.mState;
        if (r0 == r8) goto L_0x0306;
    L_0x0280:
        if (r0 == r12) goto L_0x02a0;
    L_0x0282:
        if (r0 == r10) goto L_0x029b;
    L_0x0284:
        if (r0 == r9) goto L_0x0293;
    L_0x0286:
        r1 = 5;
        if (r0 == r1) goto L_0x028b;
    L_0x0289:
        goto L_0x0362;
    L_0x028b:
        if (r11 >= r1) goto L_0x0293;
    L_0x028d:
        r17.performPause();
        r6.d(r7, r14);
    L_0x0293:
        if (r11 >= r9) goto L_0x029b;
    L_0x0295:
        r17.performStop();
        r6.e(r7, r14);
    L_0x029b:
        if (r11 >= r10) goto L_0x02a0;
    L_0x029d:
        r17.performReallyStop();
    L_0x02a0:
        if (r11 >= r12) goto L_0x0306;
    L_0x02a2:
        r0 = r7.mView;
        if (r0 == 0) goto L_0x02b5;
    L_0x02a6:
        r0 = r6.e;
        r0 = r0.b();
        if (r0 == 0) goto L_0x02b5;
    L_0x02ae:
        r0 = r7.mSavedViewState;
        if (r0 != 0) goto L_0x02b5;
    L_0x02b2:
        r16.p(r17);
    L_0x02b5:
        r17.performDestroyView();
        r6.f(r7, r14);
        r0 = r7.mView;
        if (r0 == 0) goto L_0x02fe;
    L_0x02bf:
        r0 = r7.mContainer;
        if (r0 == 0) goto L_0x02fe;
    L_0x02c3:
        r0 = r7.mContainer;
        r1 = r7.mView;
        r0.endViewTransition(r1);
        r0 = r7.mView;
        r0.clearAnimation();
        r0 = r6.d;
        r1 = 0;
        if (r0 <= 0) goto L_0x02ef;
    L_0x02d4:
        r0 = r6.u;
        if (r0 != 0) goto L_0x02ef;
    L_0x02d8:
        r0 = r7.mView;
        r0 = r0.getVisibility();
        if (r0 != 0) goto L_0x02ef;
    L_0x02e0:
        r0 = r7.mPostponedAlpha;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 < 0) goto L_0x02ef;
    L_0x02e6:
        r0 = r19;
        r2 = r20;
        r0 = r6.a(r7, r0, r14, r2);
        goto L_0x02f0;
    L_0x02ef:
        r0 = r13;
    L_0x02f0:
        r7.mPostponedAlpha = r1;
        if (r0 == 0) goto L_0x02f7;
    L_0x02f4:
        r6.a(r7, r0, r11);
    L_0x02f7:
        r0 = r7.mContainer;
        r1 = r7.mView;
        r0.removeView(r1);
    L_0x02fe:
        r7.mContainer = r13;
        r7.mView = r13;
        r7.mInnerView = r13;
        r7.mInLayout = r14;
    L_0x0306:
        if (r11 > 0) goto L_0x0362;
    L_0x0308:
        r0 = r6.u;
        if (r0 == 0) goto L_0x032d;
    L_0x030c:
        r0 = r17.getAnimatingAway();
        if (r0 == 0) goto L_0x031d;
    L_0x0312:
        r0 = r17.getAnimatingAway();
        r7.setAnimatingAway(r13);
        r0.clearAnimation();
        goto L_0x032d;
    L_0x031d:
        r0 = r17.getAnimator();
        if (r0 == 0) goto L_0x032d;
    L_0x0323:
        r0 = r17.getAnimator();
        r7.setAnimator(r13);
        r0.cancel();
    L_0x032d:
        r0 = r17.getAnimatingAway();
        if (r0 != 0) goto L_0x035e;
    L_0x0333:
        r0 = r17.getAnimator();
        if (r0 == 0) goto L_0x033a;
    L_0x0339:
        goto L_0x035e;
    L_0x033a:
        r0 = r7.mRetaining;
        if (r0 != 0) goto L_0x0345;
    L_0x033e:
        r17.performDestroy();
        r6.g(r7, r14);
        goto L_0x0347;
    L_0x0345:
        r7.mState = r14;
    L_0x0347:
        r17.performDetach();
        r6.h(r7, r14);
        if (r21 != 0) goto L_0x0362;
    L_0x034f:
        r0 = r7.mRetaining;
        if (r0 != 0) goto L_0x0357;
    L_0x0353:
        r16.n(r17);
        goto L_0x0362;
    L_0x0357:
        r7.mHost = r13;
        r7.mParentFragment = r13;
        r7.mFragmentManager = r13;
        goto L_0x0362;
    L_0x035e:
        r7.setStateAfterAnimating(r11);
        goto L_0x0363;
    L_0x0362:
        r8 = r11;
    L_0x0363:
        r0 = r7.mState;
        if (r0 == r8) goto L_0x038e;
    L_0x0367:
        r0 = new java.lang.StringBuilder;
        r1 = "moveToState: Fragment state for ";
        r0.<init>(r1);
        r0.append(r7);
        r1 = " not updated inline; expected state ";
        r0.append(r1);
        r0.append(r8);
        r1 = " found ";
        r0.append(r1);
        r1 = r7.mState;
        r0.append(r1);
        r0 = r0.toString();
        r1 = "FragmentManager";
        android.util.Log.w(r1, r0);
        r7.mState = r8;
    L_0x038e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ga.a(fv, int, int, int, boolean):void");
    }

    public final void a(fv fvVar, boolean z) {
        d(fvVar);
        if (!fvVar.mDetached) {
            if (this.a.contains(fvVar)) {
                throw new IllegalStateException("Fragment already added: ".concat(String.valueOf(fvVar)));
            }
            synchronized (this.a) {
                this.a.add(fvVar);
            }
            fvVar.mAdded = true;
            fvVar.mRemoving = false;
            if (fvVar.mView == null) {
                fvVar.mHiddenChanged = false;
            }
            if (fvVar.mHasMenu && fvVar.mMenuVisible) {
                this.s = true;
            }
            if (z) {
                k(fvVar);
            }
        }
    }

    public final void a(fy fyVar, fw fwVar, fv fvVar) {
        if (this.e == null) {
            this.e = fyVar;
            this.f = fwVar;
            this.q = fvVar;
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public final void a(a aVar) {
        this.p.add(new je(aVar, Boolean.TRUE));
    }

    public final void a(g gVar, boolean z) {
        if (!z) {
            s();
        }
        synchronized (this) {
            if (!this.u) {
                if (this.e != null) {
                    if (this.j == null) {
                        this.j = new ArrayList();
                    }
                    this.j.add(gVar);
                    f();
                    return;
                }
            }
            if (z) {
                return;
            }
            throw new IllegalStateException("Activity has been destroyed");
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:62:0x01fd in {8, 9, 14, 21, 28, 37, 42, 50, 53, 56, 57, 61} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final void a(java.lang.String r7, java.io.FileDescriptor r8, java.io.PrintWriter r9, java.lang.String[] r10) {
        /*
        r6 = this;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0.append(r7);
        r1 = "    ";
        r0.append(r1);
        r0 = r0.toString();
        r1 = r6.b;
        r2 = 0;
        if (r1 == 0) goto L_0x005a;
        r1 = r1.size();
        if (r1 <= 0) goto L_0x005a;
        r9.print(r7);
        r3 = "Active Fragments in ";
        r9.print(r3);
        r3 = java.lang.System.identityHashCode(r6);
        r3 = java.lang.Integer.toHexString(r3);
        r9.print(r3);
        r3 = ":";
        r9.println(r3);
        r3 = 0;
        if (r3 >= r1) goto L_0x005a;
        r4 = r6.b;
        r4 = r4.valueAt(r3);
        r4 = (defpackage.fv) r4;
        r9.print(r7);
        r5 = "  #";
        r9.print(r5);
        r9.print(r3);
        r5 = ": ";
        r9.print(r5);
        r9.println(r4);
        if (r4 == 0) goto L_0x0057;
        r4.dump(r0, r8, r9, r10);
        r3 = r3 + 1;
        goto L_0x0035;
        r8 = r6.a;
        r8 = r8.size();
        if (r8 <= 0) goto L_0x008f;
        r9.print(r7);
        r10 = "Added Fragments:";
        r9.println(r10);
        r10 = 0;
        if (r10 >= r8) goto L_0x008f;
        r1 = r6.a;
        r1 = r1.get(r10);
        r1 = (defpackage.fv) r1;
        r9.print(r7);
        r3 = "  #";
        r9.print(r3);
        r9.print(r10);
        r3 = ": ";
        r9.print(r3);
        r1 = r1.toString();
        r9.println(r1);
        r10 = r10 + 1;
        goto L_0x006b;
        r8 = r6.m;
        if (r8 == 0) goto L_0x00c6;
        r8 = r8.size();
        if (r8 <= 0) goto L_0x00c6;
        r9.print(r7);
        r10 = "Fragments Created Menus:";
        r9.println(r10);
        r10 = 0;
        if (r10 >= r8) goto L_0x00c6;
        r1 = r6.m;
        r1 = r1.get(r10);
        r1 = (defpackage.fv) r1;
        r9.print(r7);
        r3 = "  #";
        r9.print(r3);
        r9.print(r10);
        r3 = ": ";
        r9.print(r3);
        r1 = r1.toString();
        r9.println(r1);
        r10 = r10 + 1;
        goto L_0x00a2;
        r8 = r6.c;
        if (r8 == 0) goto L_0x0100;
        r8 = r8.size();
        if (r8 <= 0) goto L_0x0100;
        r9.print(r7);
        r10 = "Back Stack:";
        r9.println(r10);
        r10 = 0;
        if (r10 >= r8) goto L_0x0100;
        r1 = r6.c;
        r1 = r1.get(r10);
        r1 = (defpackage.fs) r1;
        r9.print(r7);
        r3 = "  #";
        r9.print(r3);
        r9.print(r10);
        r3 = ": ";
        r9.print(r3);
        r3 = r1.toString();
        r9.println(r3);
        r1.a(r0, r9);
        r10 = r10 + 1;
        goto L_0x00d9;
        monitor-enter(r6);
        r8 = r6.n;	 Catch:{ all -> 0x01fa }
        if (r8 == 0) goto L_0x0136;	 Catch:{ all -> 0x01fa }
        r8 = r6.n;	 Catch:{ all -> 0x01fa }
        r8 = r8.size();	 Catch:{ all -> 0x01fa }
        if (r8 <= 0) goto L_0x0136;	 Catch:{ all -> 0x01fa }
        r9.print(r7);	 Catch:{ all -> 0x01fa }
        r10 = "Back Stack Indices:";	 Catch:{ all -> 0x01fa }
        r9.println(r10);	 Catch:{ all -> 0x01fa }
        r10 = 0;	 Catch:{ all -> 0x01fa }
        if (r10 >= r8) goto L_0x0136;	 Catch:{ all -> 0x01fa }
        r0 = r6.n;	 Catch:{ all -> 0x01fa }
        r0 = r0.get(r10);	 Catch:{ all -> 0x01fa }
        r0 = (defpackage.fs) r0;	 Catch:{ all -> 0x01fa }
        r9.print(r7);	 Catch:{ all -> 0x01fa }
        r1 = "  #";	 Catch:{ all -> 0x01fa }
        r9.print(r1);	 Catch:{ all -> 0x01fa }
        r9.print(r10);	 Catch:{ all -> 0x01fa }
        r1 = ": ";	 Catch:{ all -> 0x01fa }
        r9.print(r1);	 Catch:{ all -> 0x01fa }
        r9.println(r0);	 Catch:{ all -> 0x01fa }
        r10 = r10 + 1;	 Catch:{ all -> 0x01fa }
        goto L_0x0116;	 Catch:{ all -> 0x01fa }
        r8 = r6.o;	 Catch:{ all -> 0x01fa }
        if (r8 == 0) goto L_0x0157;	 Catch:{ all -> 0x01fa }
        r8 = r6.o;	 Catch:{ all -> 0x01fa }
        r8 = r8.size();	 Catch:{ all -> 0x01fa }
        if (r8 <= 0) goto L_0x0157;	 Catch:{ all -> 0x01fa }
        r9.print(r7);	 Catch:{ all -> 0x01fa }
        r8 = "mAvailBackStackIndices: ";	 Catch:{ all -> 0x01fa }
        r9.print(r8);	 Catch:{ all -> 0x01fa }
        r8 = r6.o;	 Catch:{ all -> 0x01fa }
        r8 = r8.toArray();	 Catch:{ all -> 0x01fa }
        r8 = java.util.Arrays.toString(r8);	 Catch:{ all -> 0x01fa }
        r9.println(r8);	 Catch:{ all -> 0x01fa }
        monitor-exit(r6);	 Catch:{ all -> 0x01fa }
        r8 = r6.j;
        if (r8 == 0) goto L_0x018a;
        r8 = r8.size();
        if (r8 <= 0) goto L_0x018a;
        r9.print(r7);
        r10 = "Pending Actions:";
        r9.println(r10);
        if (r2 >= r8) goto L_0x018a;
        r10 = r6.j;
        r10 = r10.get(r2);
        r10 = (defpackage.ga.g) r10;
        r9.print(r7);
        r0 = "  #";
        r9.print(r0);
        r9.print(r2);
        r0 = ": ";
        r9.print(r0);
        r9.println(r10);
        r2 = r2 + 1;
        goto L_0x016a;
        r9.print(r7);
        r8 = "FragmentManager misc state:";
        r9.println(r8);
        r9.print(r7);
        r8 = "  mHost=";
        r9.print(r8);
        r8 = r6.e;
        r9.println(r8);
        r9.print(r7);
        r8 = "  mContainer=";
        r9.print(r8);
        r8 = r6.f;
        r9.println(r8);
        r8 = r6.q;
        if (r8 == 0) goto L_0x01bd;
        r9.print(r7);
        r8 = "  mParent=";
        r9.print(r8);
        r8 = r6.q;
        r9.println(r8);
        r9.print(r7);
        r8 = "  mCurState=";
        r9.print(r8);
        r8 = r6.d;
        r9.print(r8);
        r8 = " mStateSaved=";
        r9.print(r8);
        r8 = r6.h;
        r9.print(r8);
        r8 = " mStopped=";
        r9.print(r8);
        r8 = r6.t;
        r9.print(r8);
        r8 = " mDestroyed=";
        r9.print(r8);
        r8 = r6.u;
        r9.println(r8);
        r8 = r6.s;
        if (r8 == 0) goto L_0x01f9;
        r9.print(r7);
        r7 = "  mNeedMenuInvalidate=";
        r9.print(r7);
        r7 = r6.s;
        r9.println(r7);
        return;
        r7 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x01fa }
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ga.a(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    public final void a(boolean z) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            fv fvVar = (fv) this.a.get(size);
            if (fvVar != null) {
                fvVar.performMultiWindowModeChanged(z);
            }
        }
    }

    public final boolean a(Menu menu) {
        int i = 0;
        if (this.d <= 0) {
            return false;
        }
        boolean z = false;
        while (i < this.a.size()) {
            fv fvVar = (fv) this.a.get(i);
            if (fvVar != null && fvVar.performPrepareOptionsMenu(menu)) {
                z = true;
            }
            i++;
        }
        return z;
    }

    public final boolean a(Menu menu, MenuInflater menuInflater) {
        int i = 0;
        if (this.d <= 0) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            fv fvVar = (fv) this.a.get(i2);
            if (fvVar != null && fvVar.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fvVar);
                z = true;
            }
        }
        if (this.m != null) {
            while (i < this.m.size()) {
                fv fvVar2 = (fv) this.m.get(i);
                if (arrayList == null || !arrayList.contains(fvVar2)) {
                    fvVar2.onDestroyOptionsMenu();
                }
                i++;
            }
        }
        this.m = arrayList;
        return z;
    }

    public final boolean a(MenuItem menuItem) {
        if (this.d <= 0) {
            return false;
        }
        for (int i = 0; i < this.a.size(); i++) {
            fv fvVar = (fv) this.a.get(i);
            if (fvVar != null && fvVar.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: final */
    public final boolean a(ArrayList<fs> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        ArrayList arrayList3 = this.c;
        if (arrayList3 == null) {
            return false;
        }
        int size;
        if (i >= 0 || (i2 & 1) != 0) {
            if (i >= 0) {
                size = this.c.size() - 1;
                while (size >= 0) {
                    fs fsVar = (fs) this.c.get(size);
                    if (i >= 0 && i == fsVar.k) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        fs fsVar2 = (fs) this.c.get(size);
                        if (i < 0 || i != fsVar2.k) {
                            break;
                        }
                    }
                }
            } else {
                size = -1;
            }
            if (size == this.c.size() - 1) {
                return false;
            }
            for (i = this.c.size() - 1; i > size; i--) {
                arrayList.add(this.c.remove(i));
                arrayList2.add(Boolean.TRUE);
            }
        } else {
            size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.c.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final fv b(String str) {
        SparseArray sparseArray = this.b;
        if (!(sparseArray == null || str == null)) {
            for (int size = sparseArray.size() - 1; size >= 0; size--) {
                fv fvVar = (fv) this.b.valueAt(size);
                if (fvVar != null) {
                    fvVar = fvVar.findFragmentByWho(str);
                    if (fvVar != null) {
                        return fvVar;
                    }
                }
            }
        }
        return null;
    }

    public final void b(int i) {
        try {
            this.k = true;
            a(i, false);
            g();
        } finally {
            this.k = false;
        }
    }

    public final void b(Menu menu) {
        if (this.d > 0) {
            for (int i = 0; i < this.a.size(); i++) {
                fv fvVar = (fv) this.a.get(i);
                if (fvVar != null) {
                    fvVar.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    public final void b(fv fvVar) {
        if (fvVar.mDeferStart) {
            if (this.k) {
                this.v = true;
                return;
            }
            fvVar.mDeferStart = false;
            a(fvVar, this.d, 0, 0, false);
        }
    }

    public final void b(g gVar, boolean z) {
        if (!z || (this.e != null && !this.u)) {
            c(z);
            if (gVar.a(this.w, this.x)) {
                this.k = true;
                try {
                    b(this.w, this.x);
                } finally {
                    t();
                }
            }
            w();
            y();
        }
    }

    public final void b(boolean z) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            fv fvVar = (fv) this.a.get(size);
            if (fvVar != null) {
                fvVar.performPictureInPictureModeChanged(z);
            }
        }
    }

    public final boolean b() {
        boolean g = g();
        u();
        return g;
    }

    public final boolean b(MenuItem menuItem) {
        if (this.d <= 0) {
            return false;
        }
        for (int i = 0; i < this.a.size(); i++) {
            fv fvVar = (fv) this.a.get(i);
            if (fvVar != null && fvVar.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: final */
    public final void c(fv fvVar) {
        if (fvVar != null) {
            int i = this.d;
            if (fvVar.mRemoving) {
                i = fvVar.isInBackStack() ? Math.min(i, 1) : Math.min(i, 0);
            }
            a(fvVar, i, fvVar.getNextTransition(), fvVar.getNextTransitionStyle(), false);
            if (fvVar.mView != null) {
                fv o = o(fvVar);
                if (o != null) {
                    View view = o.mView;
                    ViewGroup viewGroup = fvVar.mContainer;
                    i = viewGroup.indexOfChild(view);
                    int indexOfChild = viewGroup.indexOfChild(fvVar.mView);
                    if (indexOfChild < i) {
                        viewGroup.removeViewAt(indexOfChild);
                        viewGroup.addView(fvVar.mView, i);
                    }
                }
                if (fvVar.mIsNewlyAdded && fvVar.mContainer != null) {
                    if (fvVar.mPostponedAlpha > MapboxConstants.MINIMUM_ZOOM) {
                        fvVar.mView.setAlpha(fvVar.mPostponedAlpha);
                    }
                    fvVar.mPostponedAlpha = MapboxConstants.MINIMUM_ZOOM;
                    fvVar.mIsNewlyAdded = false;
                    c a = a(fvVar, fvVar.getNextTransition(), true, fvVar.getNextTransitionStyle());
                    if (a != null) {
                        ga.a(fvVar.mView, a);
                        if (a.a != null) {
                            fvVar.mView.startAnimation(a.a);
                        } else {
                            a.b.setTarget(fvVar.mView);
                            a.b.start();
                        }
                    }
                }
            }
            if (fvVar.mHiddenChanged) {
                m(fvVar);
            }
        }
    }

    public final boolean c() {
        s();
        return q();
    }

    public final List<fv> d() {
        if (this.a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        List list;
        synchronized (this.a) {
            list = (List) this.a.clone();
        }
        return list;
    }

    /* Access modifiers changed, original: final */
    public final void d(fv fvVar) {
        if (fvVar.mIndex < 0) {
            int i = this.l;
            this.l = i + 1;
            fvVar.setIndex(i, this.q);
            if (this.b == null) {
                this.b = new SparseArray();
            }
            this.b.put(fvVar.mIndex, fvVar);
        }
    }

    public final void e(fv fvVar) {
        int isInBackStack = fvVar.isInBackStack() ^ 1;
        if (!fvVar.mDetached || isInBackStack != 0) {
            synchronized (this.a) {
                this.a.remove(fvVar);
            }
            if (fvVar.mHasMenu && fvVar.mMenuVisible) {
                this.s = true;
            }
            fvVar.mAdded = false;
            fvVar.mRemoving = true;
        }
    }

    public final boolean e() {
        return this.h || this.t;
    }

    /* Access modifiers changed, original: final */
    public final void f() {
        synchronized (this) {
            Object obj = null;
            Object obj2 = (this.B == null || this.B.isEmpty()) ? null : 1;
            if (this.j != null && this.j.size() == 1) {
                obj = 1;
            }
            if (!(obj2 == null && obj == null)) {
                this.e.c.removeCallbacks(this.C);
                this.e.c.post(this.C);
            }
        }
    }

    public final boolean g() {
        c(true);
        boolean z = false;
        while (c(this.w, this.x)) {
            this.k = true;
            try {
                b(this.w, this.x);
                t();
                z = true;
            } catch (Throwable th) {
                t();
                throw th;
            }
        }
        w();
        y();
        return z;
    }

    public final Parcelable h() {
        u();
        v();
        g();
        this.h = true;
        ft[] ftVarArr = null;
        this.i = null;
        SparseArray sparseArray = this.b;
        if (sparseArray == null || sparseArray.size() <= 0) {
            return null;
        }
        String str;
        String str2;
        int size = this.b.size();
        ge[] geVarArr = new ge[size];
        int i = 0;
        Object obj = null;
        while (true) {
            str = " has cleared index: ";
            str2 = "Failure saving state: active ";
            if (i >= size) {
                break;
            }
            fv fvVar = (fv) this.b.valueAt(i);
            if (fvVar != null) {
                if (fvVar.mIndex < 0) {
                    StringBuilder stringBuilder = new StringBuilder(str2);
                    stringBuilder.append(fvVar);
                    stringBuilder.append(str);
                    stringBuilder.append(fvVar.mIndex);
                    a(new IllegalStateException(stringBuilder.toString()));
                }
                ge geVar = new ge(fvVar);
                geVarArr[i] = geVar;
                if (fvVar.mState <= 0 || geVar.b != null) {
                    geVar.b = fvVar.mSavedFragmentState;
                } else {
                    geVar.b = q(fvVar);
                    if (fvVar.mTarget != null) {
                        if (fvVar.mTarget.mIndex < 0) {
                            StringBuilder stringBuilder2 = new StringBuilder("Failure saving state: ");
                            stringBuilder2.append(fvVar);
                            stringBuilder2.append(" has target not in fragment manager: ");
                            stringBuilder2.append(fvVar.mTarget);
                            a(new IllegalStateException(stringBuilder2.toString()));
                        }
                        if (geVar.b == null) {
                            geVar.b = new Bundle();
                        }
                        a(geVar.b, "android:target_state", fvVar.mTarget);
                        if (fvVar.mTargetRequestCode != 0) {
                            geVar.b.putInt("android:target_req_state", fvVar.mTargetRequestCode);
                        }
                    }
                }
                obj = 1;
            }
            i++;
        }
        if (obj == null) {
            return null;
        }
        int[] iArr;
        int size2 = this.a.size();
        if (size2 > 0) {
            iArr = new int[size2];
            for (i = 0; i < size2; i++) {
                iArr[i] = ((fv) this.a.get(i)).mIndex;
                if (iArr[i] < 0) {
                    StringBuilder stringBuilder3 = new StringBuilder(str2);
                    stringBuilder3.append(this.a.get(i));
                    stringBuilder3.append(str);
                    stringBuilder3.append(iArr[i]);
                    a(new IllegalStateException(stringBuilder3.toString()));
                }
            }
        } else {
            iArr = null;
        }
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            size2 = arrayList.size();
            if (size2 > 0) {
                ftVarArr = new ft[size2];
                for (int i2 = 0; i2 < size2; i2++) {
                    ftVarArr[i2] = new ft((fs) this.c.get(i2));
                }
            }
        }
        gc gcVar = new gc();
        gcVar.a = geVarArr;
        gcVar.b = iArr;
        gcVar.c = ftVarArr;
        fv fvVar2 = this.g;
        if (fvVar2 != null) {
            gcVar.d = fvVar2.mIndex;
        }
        gcVar.e = this.l;
        x();
        return gcVar;
    }

    public final void h(fv fvVar) {
        if (!fvVar.mDetached) {
            fvVar.mDetached = true;
            if (fvVar.mAdded) {
                synchronized (this.a) {
                    this.a.remove(fvVar);
                }
                if (fvVar.mHasMenu && fvVar.mMenuVisible) {
                    this.s = true;
                }
                fvVar.mAdded = false;
            }
        }
    }

    public final void i() {
        this.i = null;
        int i = 0;
        this.h = false;
        this.t = false;
        int size = this.a.size();
        while (i < size) {
            fv fvVar = (fv) this.a.get(i);
            if (fvVar != null) {
                fvVar.noteStateNotSaved();
            }
            i++;
        }
    }

    public final void i(fv fvVar) {
        if (fvVar.mDetached) {
            fvVar.mDetached = false;
            if (!fvVar.mAdded) {
                if (this.a.contains(fvVar)) {
                    throw new IllegalStateException("Fragment already added: ".concat(String.valueOf(fvVar)));
                }
                synchronized (this.a) {
                    this.a.add(fvVar);
                }
                fvVar.mAdded = true;
                if (fvVar.mHasMenu && fvVar.mMenuVisible) {
                    this.s = true;
                }
            }
        }
    }

    public final void j() {
        this.h = false;
        this.t = false;
        b(1);
    }

    public final void j(fv fvVar) {
        if (fvVar == null || (this.b.get(fvVar.mIndex) == fvVar && (fvVar.mHost == null || fvVar.getFragmentManager() == this))) {
            this.g = fvVar;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Fragment ");
        stringBuilder.append(fvVar);
        stringBuilder.append(" is not an active fragment of FragmentManager ");
        stringBuilder.append(this);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final void k() {
        this.h = false;
        this.t = false;
        b(2);
    }

    public final void l() {
        this.h = false;
        this.t = false;
        b(4);
    }

    public final void m() {
        this.h = false;
        this.t = false;
        b(5);
    }

    public final void n() {
        this.t = true;
        b(3);
    }

    public final void o() {
        this.u = true;
        g();
        b(0);
        this.e = null;
        this.f = null;
        this.q = null;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (!Event.FRAGMENT.equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a);
        int i = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str2 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!fv.isSupportFragmentClass(this.e.b, str2)) {
            return null;
        }
        if (view != null) {
            i = view.getId();
        }
        StringBuilder stringBuilder;
        if (i == -1 && resourceId == -1 && string == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(attributeSet.getPositionDescription());
            stringBuilder.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
            stringBuilder.append(str2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        fv fvVar;
        fv c = resourceId != -1 ? c(resourceId) : null;
        if (c == null && string != null) {
            c = a(string);
        }
        if (c == null && i != -1) {
            c = c(i);
        }
        if (c == null) {
            fv a = this.f.a(context, str2, null);
            a.mFromLayout = true;
            a.mFragmentId = resourceId != 0 ? resourceId : i;
            a.mContainerId = i;
            a.mTag = string;
            a.mInLayout = true;
            a.mFragmentManager = this;
            fy fyVar = this.e;
            a.mHost = fyVar;
            a.onInflate(fyVar.b, attributeSet, a.mSavedFragmentState);
            a(a, true);
            fvVar = a;
        } else if (c.mInLayout) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(attributeSet.getPositionDescription());
            stringBuilder.append(": Duplicate id 0x");
            stringBuilder.append(Integer.toHexString(resourceId));
            stringBuilder.append(", tag ");
            stringBuilder.append(string);
            stringBuilder.append(", or parent id 0x");
            stringBuilder.append(Integer.toHexString(i));
            stringBuilder.append(" with another fragment for ");
            stringBuilder.append(str2);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else {
            c.mInLayout = true;
            c.mHost = this.e;
            if (!c.mRetaining) {
                c.onInflate(this.e.b, attributeSet, c.mSavedFragmentState);
            }
            fvVar = c;
        }
        if (this.d > 0 || !fvVar.mFromLayout) {
            k(fvVar);
        } else {
            a(fvVar, 1, 0, 0, false);
        }
        if (fvVar.mView != null) {
            if (resourceId != 0) {
                fvVar.mView.setId(resourceId);
            }
            if (fvVar.mView.getTag() == null) {
                fvVar.mView.setTag(string);
            }
            return fvVar.mView;
        }
        StringBuilder stringBuilder2 = new StringBuilder("Fragment ");
        stringBuilder2.append(str2);
        stringBuilder2.append(" did not create a view.");
        throw new IllegalStateException(stringBuilder2.toString());
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public final void p() {
        for (int i = 0; i < this.a.size(); i++) {
            fv fvVar = (fv) this.a.get(i);
            if (fvVar != null) {
                fvVar.performLowMemory();
            }
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("FragmentManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        Object obj = this.q;
        if (obj == null) {
            obj = this.e;
        }
        iy.a(obj, stringBuilder);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }
}
