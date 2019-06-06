package defpackage;

import android.os.Build.VERSION;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: kr */
public final class kr {
    public static Interpolator a(float f, float f2, float f3, float f4) {
        return VERSION.SDK_INT >= 21 ? new PathInterpolator(f, f2, f3, f4) : new kq(f, f2, f3, f4);
    }
}
