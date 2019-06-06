package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.widget.TintTypedArray;
import android.util.TypedValue;

/* renamed from: os */
public final class os {
    public static final int[] a = new int[]{-16842910};
    public static final int[] b = new int[]{16842908};
    public static final int[] c = new int[]{16842919};
    public static final int[] d = new int[]{16842912};
    public static final int[] e = new int[0];
    private static final ThreadLocal<TypedValue> f = new ThreadLocal();
    private static final int[] g = new int[1];

    public static int a(Context context, int i) {
        int[] iArr = g;
        iArr[0] = i;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, null, iArr);
        try {
            i = obtainStyledAttributes.getColor(0, 0);
            return i;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private static int a(Context context, int i, float f) {
        int a = os.a(context, i);
        return hj.b(a, Math.round(((float) Color.alpha(a)) * f));
    }

    private static TypedValue a() {
        TypedValue typedValue = (TypedValue) f.get();
        if (typedValue != null) {
            return typedValue;
        }
        typedValue = new TypedValue();
        f.set(typedValue);
        return typedValue;
    }

    public static ColorStateList b(Context context, int i) {
        int[] iArr = g;
        iArr[0] = i;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, null, iArr);
        try {
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int c(Context context, int i) {
        ColorStateList b = os.b(context, i);
        if (b != null && b.isStateful()) {
            return b.getColorForState(a, b.getDefaultColor());
        }
        TypedValue a = os.a();
        context.getTheme().resolveAttribute(16842803, a, true);
        return os.a(context, i, a.getFloat());
    }
}
