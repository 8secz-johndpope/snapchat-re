package defpackage;

import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: ke */
public final class ke {
    static final c a;

    /* renamed from: ke$c */
    static class c {
        c() {
        }

        public void a(ViewParent viewParent, View view) {
            if (viewParent instanceof jv) {
                ((jv) viewParent).onStopNestedScroll(view);
            }
        }

        public void a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            if (viewParent instanceof jv) {
                ((jv) viewParent).onNestedScroll(view, i, i2, i3, i4);
            }
        }

        public void a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            if (viewParent instanceof jv) {
                ((jv) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }

        public boolean a(ViewParent viewParent, View view, float f, float f2) {
            return viewParent instanceof jv ? ((jv) viewParent).onNestedPreFling(view, f, f2) : false;
        }

        public boolean a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            return viewParent instanceof jv ? ((jv) viewParent).onNestedFling(view, f, f2, z) : false;
        }

        public boolean a(ViewParent viewParent, View view, View view2, int i) {
            return viewParent instanceof jv ? ((jv) viewParent).onStartNestedScroll(view, view2, i) : false;
        }

        public void b(ViewParent viewParent, View view, View view2, int i) {
            if (viewParent instanceof jv) {
                ((jv) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }
    }

    /* renamed from: ke$a */
    static class a extends c {
        a() {
        }
    }

    /* renamed from: ke$b */
    static class b extends a {
        b() {
        }

        public final void a(ViewParent viewParent, View view) {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError e) {
                StringBuilder stringBuilder = new StringBuilder("ViewParent ");
                stringBuilder.append(viewParent);
                stringBuilder.append(" does not implement interface method onStopNestedScroll");
                Log.e("ViewParentCompat", stringBuilder.toString(), e);
            }
        }

        public final void a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            try {
                viewParent.onNestedScroll(view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                StringBuilder stringBuilder = new StringBuilder("ViewParent ");
                stringBuilder.append(viewParent);
                stringBuilder.append(" does not implement interface method onNestedScroll");
                Log.e("ViewParentCompat", stringBuilder.toString(), e);
            }
        }

        public final void a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                StringBuilder stringBuilder = new StringBuilder("ViewParent ");
                stringBuilder.append(viewParent);
                stringBuilder.append(" does not implement interface method onNestedPreScroll");
                Log.e("ViewParentCompat", stringBuilder.toString(), e);
            }
        }

        public final boolean a(ViewParent viewParent, View view, float f, float f2) {
            Object viewParent2;
            try {
                viewParent2 = viewParent2.onNestedPreFling(view, f, f2);
                return viewParent2;
            } catch (AbstractMethodError e) {
                StringBuilder stringBuilder = new StringBuilder("ViewParent ");
                stringBuilder.append(viewParent2);
                stringBuilder.append(" does not implement interface method onNestedPreFling");
                Log.e("ViewParentCompat", stringBuilder.toString(), e);
                return false;
            }
        }

        public final boolean a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            Object viewParent2;
            try {
                viewParent2 = viewParent2.onNestedFling(view, f, f2, z);
                return viewParent2;
            } catch (AbstractMethodError e) {
                StringBuilder stringBuilder = new StringBuilder("ViewParent ");
                stringBuilder.append(viewParent2);
                stringBuilder.append(" does not implement interface method onNestedFling");
                Log.e("ViewParentCompat", stringBuilder.toString(), e);
                return false;
            }
        }

        public final boolean a(ViewParent viewParent, View view, View view2, int i) {
            Object viewParent2;
            try {
                viewParent2 = viewParent2.onStartNestedScroll(view, view2, i);
                return viewParent2;
            } catch (AbstractMethodError e) {
                StringBuilder stringBuilder = new StringBuilder("ViewParent ");
                stringBuilder.append(viewParent2);
                stringBuilder.append(" does not implement interface method onStartNestedScroll");
                Log.e("ViewParentCompat", stringBuilder.toString(), e);
                return false;
            }
        }

        public final void b(ViewParent viewParent, View view, View view2, int i) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i);
            } catch (AbstractMethodError e) {
                StringBuilder stringBuilder = new StringBuilder("ViewParent ");
                stringBuilder.append(viewParent);
                stringBuilder.append(" does not implement interface method onNestedScrollAccepted");
                Log.e("ViewParentCompat", stringBuilder.toString(), e);
            }
        }
    }

    static {
        c bVar = VERSION.SDK_INT >= 21 ? new b() : VERSION.SDK_INT >= 19 ? new a() : new c();
        a = bVar;
    }

    public static void a(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5) {
        if (viewParent instanceof jw) {
            ((jw) viewParent).a(view, i, i2, i3, i4, i5);
            return;
        }
        if (i5 == 0) {
            a.a(viewParent, view, i, i2, i3, i4);
        }
    }

    public static void a(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof jw) {
            ((jw) viewParent).a(view, i, i2, iArr, i3);
            return;
        }
        if (i3 == 0) {
            a.a(viewParent, view, i, i2, iArr);
        }
    }
}
