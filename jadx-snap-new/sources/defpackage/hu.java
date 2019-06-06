package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build.VERSION;

/* renamed from: hu */
public final class hu {

    /* renamed from: hu$a */
    static class a extends hs {
        a(Resources resources, Bitmap bitmap) {
            super(resources, bitmap);
        }

        /* Access modifiers changed, original: final */
        public final void a(int i, int i2, int i3, Rect rect, Rect rect2) {
            jp.a(i, i2, i3, rect, rect2, 0);
        }
    }

    public static hs a(Resources resources, Bitmap bitmap) {
        return VERSION.SDK_INT >= 21 ? new ht(resources, bitmap) : new a(resources, bitmap);
    }
}
