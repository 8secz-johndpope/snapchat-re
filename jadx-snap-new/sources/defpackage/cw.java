package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import com.snapchat.android.R;

/* renamed from: cw */
public final class cw {
    private static final int[] a = new int[]{R.attr.colorPrimary};

    public static void a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(a);
        int hasValue = obtainStyledAttributes.hasValue(0) ^ 1;
        obtainStyledAttributes.recycle();
        if (hasValue != 0) {
            throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
        }
    }
}
