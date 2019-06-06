package defpackage;

import android.annotation.SuppressLint;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: aww */
public final class aww {
    public int a = -1;
    private boolean b = false;
    private ColorFilter c = null;
    private int d = -1;
    private int e = -1;

    public final void a(ColorFilter colorFilter) {
        this.c = colorFilter;
        this.b = true;
    }

    @SuppressLint({"Range"})
    public final void a(Drawable drawable) {
        if (drawable != null) {
            int i = this.a;
            if (i != -1) {
                drawable.setAlpha(i);
            }
            if (this.b) {
                drawable.setColorFilter(this.c);
            }
            i = this.d;
            boolean z = true;
            if (i != -1) {
                drawable.setDither(i != 0);
            }
            i = this.e;
            if (i != -1) {
                if (i == 0) {
                    z = false;
                }
                drawable.setFilterBitmap(z);
            }
        }
    }

    public final void a(boolean z) {
        this.d = z;
    }

    public final void b(boolean z) {
        this.e = z;
    }
}
