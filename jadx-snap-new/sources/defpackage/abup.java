package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: abup */
public final class abup {
    private static final int[] a = new int[2];

    private static boolean a(float f, float f2, View view) {
        view.getLocationOnScreen(a);
        if (((float) (a[0] + view.getWidth())) > f && ((float) (a[1] + view.getHeight())) > f2) {
            int[] iArr = a;
            return ((float) iArr[0]) < f && ((float) iArr[1]) < f2;
        }
    }

    public static boolean a(View view) {
        if (view.getVisibility() != 0) {
            return false;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (abup.a(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return view.canScrollVertically(1) || view.canScrollVertically(-1);
    }

    public static boolean a(View view, int i) {
        int i2 = 0;
        if (view.getVisibility() != 0) {
            return false;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            while (i2 < viewGroup.getChildCount()) {
                if (abup.a(viewGroup.getChildAt(i2), i)) {
                    return true;
                }
                i2++;
            }
        }
        return view.canScrollVertically(i);
    }

    public static boolean a(View view, int i, int i2, int i3) {
        int i4 = 0;
        if (view.getVisibility() != 0 || !abup.a((float) i2, (float) i3, view)) {
            return false;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            while (i4 < viewGroup.getChildCount()) {
                if (abup.a(viewGroup.getChildAt(i4), i, i2, i3)) {
                    return true;
                }
                i4++;
            }
        }
        return view.canScrollVertically(i);
    }

    public static boolean b(View view, int i) {
        int i2 = 0;
        if (view.getVisibility() != 0) {
            return false;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            while (i2 < viewGroup.getChildCount()) {
                if (abup.b(viewGroup.getChildAt(i2), i)) {
                    return true;
                }
                i2++;
            }
        }
        return view.canScrollHorizontally(i);
    }

    public static boolean b(View view, int i, int i2, int i3) {
        int i4 = 0;
        if (view.getVisibility() != 0 || !abup.a((float) i2, (float) i3, view)) {
            return false;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (i4 < childCount) {
                if (abup.b(viewGroup.getChildAt(i4), i, i2, i3)) {
                    return true;
                }
                i4++;
            }
        }
        return view.canScrollHorizontally(i);
    }
}
