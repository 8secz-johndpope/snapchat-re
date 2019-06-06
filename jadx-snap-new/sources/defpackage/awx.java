package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

/* renamed from: awx */
public final class awx {
    public static int a(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & 16777215;
        }
        return (i & 16777215) | ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24);
    }

    public static void a(Drawable drawable, Callback callback, axi axi) {
        if (drawable != null) {
            drawable.setCallback(callback);
            if (drawable instanceof axh) {
                ((axh) drawable).setTransformCallback(axi);
            }
        }
    }

    public static void a(Drawable drawable, Drawable drawable2) {
        if (drawable != null && drawable != drawable2) {
            drawable.setBounds(drawable2.getBounds());
            drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
            drawable.setLevel(drawable2.getLevel());
            drawable.setVisible(drawable2.isVisible(), false);
            drawable.setState(drawable2.getState());
        }
    }

    public static void a(Drawable drawable, aww aww) {
        if (drawable != null && aww != null) {
            aww.a(drawable);
        }
    }
}
