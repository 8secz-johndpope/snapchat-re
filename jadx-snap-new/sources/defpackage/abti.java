package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.ViewGroup.MarginLayoutParams;

/* renamed from: abti */
public final class abti {
    public static MarginLayoutParams a(Context context, int i, int i2, int i3, int i4, int i5, int i6) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i7 = (((int) (displayMetrics.density * 64.0f)) * i2) / i6;
        int i8 = (((int) (displayMetrics.density * 25.0f)) * i2) / i6;
        i6 = (((int) (displayMetrics.density * 25.0f)) * i) / i5;
        i -= i6 << 1;
        i2 = (i2 - i7) - i8;
        i5 = i3 * i2;
        int i9 = i4 * i;
        if (i5 > i9) {
            i2 -= i9 / i3;
            i7 += (i2 + 1) / 2;
            i8 += i2 / 2;
            if (((float) i8) / displayMetrics.density > 64.0f) {
                i8 += i7;
                i8 /= 2;
                i7 = (i8 + 1) / 2;
            }
        } else {
            i6 += (i - (i5 / i4)) / 2;
        }
        MarginLayoutParams marginLayoutParams = new MarginLayoutParams(i3, i4);
        marginLayoutParams.setMargins(i6, i7, i6, i8);
        return marginLayoutParams;
    }
}
