package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/* renamed from: abso */
public final class abso {
    public static float a(boolean z, float f, Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return f * ((z ? displayMetrics.ydpi : displayMetrics.xdpi) / 160.0f);
    }

    public static int a(float f, Context context) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static int a(Point point, boolean z) {
        return z ? Math.max(point.x, point.y) : Math.min(point.x, point.y);
    }

    public static int a(DisplayMetrics displayMetrics, boolean z) {
        return z ? Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels) : Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static float b(float f, Context context) {
        return f / context.getResources().getDisplayMetrics().density;
    }

    public static int b(Point point, boolean z) {
        return z ? Math.min(point.x, point.y) : Math.max(point.x, point.y);
    }

    public static int b(DisplayMetrics displayMetrics, boolean z) {
        return z ? Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) : Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }
}
