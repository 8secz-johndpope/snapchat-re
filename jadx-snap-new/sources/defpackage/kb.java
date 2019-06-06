package defpackage;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.lang.reflect.Field;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: kb */
public final class kb {
    public static final j a;

    /* renamed from: kb$j */
    public static class j {
        private static Field b;
        private static boolean c;
        private static Field d;
        private static boolean e;
        private static WeakHashMap<View, String> f;
        private static Field g;
        private static boolean h = false;
        WeakHashMap<View, kf> a = null;

        static {
            AtomicInteger atomicInteger = new AtomicInteger(1);
        }

        j() {
        }

        public static boolean A(View view) {
            if (h) {
                return false;
            }
            if (g == null) {
                try {
                    Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                    g = declaredField;
                    declaredField.setAccessible(true);
                } catch (Throwable unused) {
                    h = true;
                    return false;
                }
            }
            try {
                return g.get(view) != null;
            } catch (Throwable unused2) {
                h = true;
                return false;
            }
        }

        private static void B(View view) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
        }

        public static void a(View view, jl jlVar) {
            view.setAccessibilityDelegate(jlVar == null ? null : jlVar.getBridge());
        }

        public kj a(View view, kj kjVar) {
            return kjVar;
        }

        public void a(View view, float f) {
        }

        public void a(View view, int i) {
        }

        public void a(View view, int i, int i2, int i3, int i4) {
            view.setPadding(i, i2, i3, i4);
        }

        public void a(View view, ColorStateList colorStateList) {
            if (view instanceof ka) {
                ((ka) view).setSupportBackgroundTintList(colorStateList);
            }
        }

        public void a(View view, Mode mode) {
            if (view instanceof ka) {
                ((ka) view).setSupportBackgroundTintMode(mode);
            }
        }

        public void a(View view, Rect rect) {
        }

        public void a(View view, Drawable drawable) {
            view.setBackgroundDrawable(drawable);
        }

        public void a(View view, Runnable runnable) {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }

        public void a(View view, Runnable runnable, long j) {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }

        public void a(View view, String str) {
            if (f == null) {
                f = new WeakHashMap();
            }
            f.put(view, str);
        }

        public void a(View view, jy jyVar) {
        }

        public void a(View view, boolean z) {
        }

        public boolean a(View view) {
            return false;
        }

        public kj b(View view, kj kjVar) {
            return kjVar;
        }

        public void b(View view, float f) {
        }

        public void b(View view, int i) {
            view.offsetLeftAndRight(i);
            if (view.getVisibility() == 0) {
                j.B(view);
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    j.B((View) parent);
                }
            }
        }

        public boolean b(View view) {
            return false;
        }

        public void c(View view) {
            view.postInvalidate();
        }

        public void c(View view, int i) {
            view.offsetTopAndBottom(i);
            if (view.getVisibility() == 0) {
                j.B(view);
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    j.B((View) parent);
                }
            }
        }

        public int d(View view) {
            return 0;
        }

        public void d(View view, int i) {
        }

        public int e(View view) {
            if (!c) {
                try {
                    Field declaredField = View.class.getDeclaredField("mMinWidth");
                    b = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                c = true;
            }
            Field field = b;
            if (field != null) {
                try {
                    return ((Integer) field.get(view)).intValue();
                } catch (Exception unused2) {
                }
            }
            return 0;
        }

        public int f(View view) {
            if (!e) {
                try {
                    Field declaredField = View.class.getDeclaredField("mMinHeight");
                    d = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                e = true;
            }
            Field field = d;
            if (field != null) {
                try {
                    return ((Integer) field.get(view)).intValue();
                } catch (Exception unused2) {
                }
            }
            return 0;
        }

        public void g(View view) {
        }

        public boolean h(View view) {
            return false;
        }

        public boolean i(View view) {
            return true;
        }

        public int j(View view) {
            return 0;
        }

        public int k(View view) {
            return view.getPaddingLeft();
        }

        public int l(View view) {
            return view.getPaddingRight();
        }

        public int m(View view) {
            return 0;
        }

        public boolean n(View view) {
            return false;
        }

        public Display o(View view) {
            return r(view) ? ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay() : null;
        }

        public Rect p(View view) {
            return null;
        }

        public boolean q(View view) {
            return view.getWidth() > 0 && view.getHeight() > 0;
        }

        public boolean r(View view) {
            return view.getWindowToken() != null;
        }

        public String s(View view) {
            WeakHashMap weakHashMap = f;
            return weakHashMap == null ? null : (String) weakHashMap.get(view);
        }

        public float t(View view) {
            return MapboxConstants.MINIMUM_ZOOM;
        }

        public float u(View view) {
            return MapboxConstants.MINIMUM_ZOOM;
        }

        public boolean v(View view) {
            return view instanceof js ? ((js) view).isNestedScrollingEnabled() : false;
        }

        public void w(View view) {
            if (view instanceof js) {
                ((js) view).stopNestedScroll();
            }
        }

        public ColorStateList x(View view) {
            return view instanceof ka ? ((ka) view).getSupportBackgroundTintList() : null;
        }

        public Mode y(View view) {
            return view instanceof ka ? ((ka) view).getSupportBackgroundTintMode() : null;
        }

        public float z(View view) {
            return u(view) + t(view);
        }
    }

    /* renamed from: kb$a */
    static class a extends j {
        a() {
        }

        public final boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* renamed from: kb$b */
    static class b extends a {
        b() {
        }

        public void a(View view, int i) {
            if (i == 4) {
                i = 2;
            }
            view.setImportantForAccessibility(i);
        }

        public final void a(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        public final void a(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        public final void a(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        public final void a(View view, boolean z) {
            view.setHasTransientState(z);
        }

        public final boolean b(View view) {
            return view.hasTransientState();
        }

        public final void c(View view) {
            view.postInvalidateOnAnimation();
        }

        public final int d(View view) {
            return view.getImportantForAccessibility();
        }

        public final int e(View view) {
            return view.getMinimumWidth();
        }

        public final int f(View view) {
            return view.getMinimumHeight();
        }

        public void g(View view) {
            view.requestFitSystemWindows();
        }

        public final boolean h(View view) {
            return view.getFitsSystemWindows();
        }

        public final boolean i(View view) {
            return view.hasOverlappingRendering();
        }
    }

    /* renamed from: kb$c */
    static class c extends b {
        c() {
        }

        public final void a(View view, int i, int i2, int i3, int i4) {
            view.setPaddingRelative(i, i2, i3, i4);
        }

        public final int j(View view) {
            return view.getLayoutDirection();
        }

        public final int k(View view) {
            return view.getPaddingStart();
        }

        public final int l(View view) {
            return view.getPaddingEnd();
        }

        public final int m(View view) {
            return view.getWindowSystemUiVisibility();
        }

        public final boolean n(View view) {
            return view.isPaddingRelative();
        }

        public final Display o(View view) {
            return view.getDisplay();
        }
    }

    /* renamed from: kb$d */
    static class d extends c {
        d() {
        }

        public final void a(View view, Rect rect) {
            view.setClipBounds(rect);
        }

        public final Rect p(View view) {
            return view.getClipBounds();
        }
    }

    /* renamed from: kb$e */
    static class e extends d {
        e() {
        }

        public final void a(View view, int i) {
            view.setImportantForAccessibility(i);
        }

        public final boolean q(View view) {
            return view.isLaidOut();
        }

        public final boolean r(View view) {
            return view.isAttachedToWindow();
        }
    }

    /* renamed from: kb$f */
    static class f extends e {
        private static ThreadLocal<Rect> b;

        f() {
        }

        private static Rect a() {
            if (b == null) {
                b = new ThreadLocal();
            }
            Rect rect = (Rect) b.get();
            if (rect == null) {
                rect = new Rect();
                b.set(rect);
            }
            rect.setEmpty();
            return rect;
        }

        public final kj a(View view, kj kjVar) {
            Object obj = (WindowInsets) kj.a(kjVar);
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(obj);
            if (onApplyWindowInsets != obj) {
                obj = new WindowInsets(onApplyWindowInsets);
            }
            return kj.a(obj);
        }

        public final void a(View view, float f) {
            view.setElevation(f);
        }

        public final void a(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
            if (VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                Object obj = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? null : 1;
                if (background != null && obj != null) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        }

        public final void a(View view, Mode mode) {
            view.setBackgroundTintMode(mode);
            if (VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                Object obj = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? null : 1;
                if (background != null && obj != null) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        }

        public final void a(View view, String str) {
            view.setTransitionName(str);
        }

        public final void a(View view, final jy jyVar) {
            if (jyVar == null) {
                view.setOnApplyWindowInsetsListener(null);
            } else {
                view.setOnApplyWindowInsetsListener(new OnApplyWindowInsetsListener() {
                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        return (WindowInsets) kj.a(jyVar.a(view, kj.a((Object) windowInsets)));
                    }
                });
            }
        }

        public final kj b(View view, kj kjVar) {
            Object obj = (WindowInsets) kj.a(kjVar);
            WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(obj);
            if (dispatchApplyWindowInsets != obj) {
                obj = new WindowInsets(dispatchApplyWindowInsets);
            }
            return kj.a(obj);
        }

        public final void b(View view, float f) {
            view.setTranslationZ(f);
        }

        public void b(View view, int i) {
            int intersects;
            Rect a = f.a();
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                a.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                intersects = a.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) ^ 1;
            } else {
                intersects = 0;
            }
            super.b(view, i);
            if (intersects != 0 && a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(a);
            }
        }

        public void c(View view, int i) {
            int intersects;
            Rect a = f.a();
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                a.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                intersects = a.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) ^ 1;
            } else {
                intersects = 0;
            }
            super.c(view, i);
            if (intersects != 0 && a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(a);
            }
        }

        public final void g(View view) {
            view.requestApplyInsets();
        }

        public final String s(View view) {
            return view.getTransitionName();
        }

        public final float t(View view) {
            return view.getElevation();
        }

        public final float u(View view) {
            return view.getTranslationZ();
        }

        public final boolean v(View view) {
            return view.isNestedScrollingEnabled();
        }

        public final void w(View view) {
            view.stopNestedScroll();
        }

        public final ColorStateList x(View view) {
            return view.getBackgroundTintList();
        }

        public final Mode y(View view) {
            return view.getBackgroundTintMode();
        }

        public final float z(View view) {
            return view.getZ();
        }
    }

    /* renamed from: kb$g */
    static class g extends f {
        g() {
        }

        public final void b(View view, int i) {
            view.offsetLeftAndRight(i);
        }

        public final void c(View view, int i) {
            view.offsetTopAndBottom(i);
        }

        public final void d(View view, int i) {
            view.setScrollIndicators(i, 3);
        }
    }

    /* renamed from: kb$h */
    static class h extends g {
        h() {
        }
    }

    /* renamed from: kb$i */
    static class i extends h {
        i() {
        }
    }

    static {
        j iVar = VERSION.SDK_INT >= 26 ? new i() : VERSION.SDK_INT >= 24 ? new h() : VERSION.SDK_INT >= 23 ? new g() : VERSION.SDK_INT >= 21 ? new f() : VERSION.SDK_INT >= 19 ? new e() : VERSION.SDK_INT >= 18 ? new d() : VERSION.SDK_INT >= 17 ? new c() : VERSION.SDK_INT >= 16 ? new b() : VERSION.SDK_INT >= 15 ? new a() : new j();
        a = iVar;
    }

    public static int a(View view) {
        return a.j(view);
    }

    public static kj a(View view, kj kjVar) {
        return a.a(view, kjVar);
    }

    public static void a(View view, float f) {
        a.a(view, f);
    }

    public static void a(View view, int i) {
        a.a(view, i);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        a.a(view, i, i2, i3, i4);
    }

    public static void a(View view, ColorStateList colorStateList) {
        a.a(view, colorStateList);
    }

    public static void a(View view, Mode mode) {
        a.a(view, mode);
    }

    public static void a(View view, Drawable drawable) {
        a.a(view, drawable);
    }

    public static void a(View view, Runnable runnable) {
        a.a(view, runnable);
    }

    public static void a(View view, Runnable runnable, long j) {
        a.a(view, runnable, j);
    }

    public static void a(View view, String str) {
        a.a(view, str);
    }

    public static void a(View view, jy jyVar) {
        a.a(view, jyVar);
    }

    public static void a(View view, boolean z) {
        a.a(view, z);
    }

    public static kf b(View view) {
        j jVar = a;
        if (jVar.a == null) {
            jVar.a = new WeakHashMap();
        }
        kf kfVar = (kf) jVar.a.get(view);
        if (kfVar != null) {
            return kfVar;
        }
        kfVar = new kf(view);
        jVar.a.put(view, kfVar);
        return kfVar;
    }

    public static void b(View view, float f) {
        a.b(view, f);
    }

    public static void b(View view, int i) {
        a.c(view, i);
    }

    public static void c(View view) {
        if (view instanceof jt) {
            ((jt) view).stopNestedScroll(1);
        }
    }

    public static void c(View view, int i) {
        a.b(view, i);
    }

    public static boolean d(View view) {
        return a.q(view);
    }
}
