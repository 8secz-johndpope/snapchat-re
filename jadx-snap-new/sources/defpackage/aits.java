package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;

/* renamed from: aits */
public final class aits {
    public final String a;
    public final int b;
    public final int c;
    public final int d;

    private aits(String str, int i, int i2, int i3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public static aits a(Context context, String str) {
        String str2 = "Fabric";
        if (str != null) {
            try {
                int f = airf.f(context);
                aiqj.a().a(str2, "App icon resource ID is ".concat(String.valueOf(f)));
                Options options = new Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeResource(context.getResources(), f, options);
                return new aits(str, f, options.outWidth, options.outHeight);
            } catch (Exception e) {
                aiqj.a().c(str2, "Failed to load icon", e);
            }
        }
        return null;
    }
}
