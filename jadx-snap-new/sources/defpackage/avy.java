package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import defpackage.jf.c;

/* renamed from: avy */
public final class avy {
    static {
        c cVar = new c(12);
    }

    @SuppressLint({"NewApi"})
    public static int a(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        if (VERSION.SDK_INT > 19) {
            try {
                bitmap = bitmap.getAllocationByteCount();
                return bitmap;
            } catch (NullPointerException unused) {
            }
        }
        return VERSION.SDK_INT >= 12 ? bitmap.getByteCount() : bitmap.getRowBytes() * bitmap.getHeight();
    }
}
