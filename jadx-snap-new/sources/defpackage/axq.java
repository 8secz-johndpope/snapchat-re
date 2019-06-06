package defpackage;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import defpackage.axg.b;
import defpackage.axp.a;

/* renamed from: axq */
public final class axq {
    private static final Drawable a = new ColorDrawable(0);

    static Drawable a(Drawable drawable, Matrix matrix) {
        return (drawable == null || matrix == null) ? drawable : new axa(drawable, matrix);
    }

    static Drawable a(Drawable drawable, b bVar) {
        return (drawable == null || bVar == null) ? drawable : new axf(drawable, bVar);
    }

    static Drawable a(Drawable drawable, axp axp, Resources resources) {
        if (!(drawable == null || axp == null || axp.a != a.BITMAP_ONLY)) {
            if (drawable instanceof awz) {
                awv a = axq.a((awz) drawable);
                a.a(axq.b(a.a(a), axp, resources));
                return drawable;
            }
            drawable = axq.b(drawable, axp, resources);
        }
        return drawable;
    }

    private static awv a(awv awv) {
        while (true) {
            Drawable a = awv.a();
            if (a == awv || !(a instanceof awv)) {
                return awv;
            }
            awv = (awv) a;
        }
        return awv;
    }

    static void a(axb axb, axp axp) {
        axb.a(axp.b);
        axb.a(axp.c);
        axb.a(axp.f, axp.e);
        axb.a(axp.g);
    }

    private static Drawable b(Drawable drawable, axp axp, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            axb axc = new axc(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint());
            axq.a(axc, axp);
            return axc;
        }
        if ((drawable instanceof ColorDrawable) && VERSION.SDK_INT >= 11) {
            drawable = axd.a((ColorDrawable) drawable);
            axq.a((axb) drawable, axp);
        }
        return drawable;
    }
}
