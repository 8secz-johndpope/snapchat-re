package defpackage;

import android.util.DisplayMetrics;
import com.google.common.base.Supplier;
import defpackage.abtm.a;

/* renamed from: abtf */
final class abtf implements a {
    private final int a;
    private final int b;

    abtf(Supplier<DisplayMetrics> supplier) {
        int i;
        DisplayMetrics displayMetrics = (DisplayMetrics) supplier.get();
        if (displayMetrics.heightPixels > displayMetrics.widthPixels) {
            this.a = displayMetrics.heightPixels;
            i = displayMetrics.widthPixels;
        } else {
            this.a = displayMetrics.widthPixels;
            i = displayMetrics.heightPixels;
        }
        this.b = i;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }
}
