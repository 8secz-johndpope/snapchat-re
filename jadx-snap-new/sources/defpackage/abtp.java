package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.content.ContextCompat;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowManager;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.framework.misc.AppContext;
import defpackage.absi.a;

/* renamed from: abtp */
public final class abtp {
    public static float a(float f, Context context) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static int a() {
        return ViewConfiguration.get(AppContext.get()).getScaledPagingTouchSlop();
    }

    public static int a(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int a(Context context, int i) {
        return VERSION.SDK_INT >= 23 ? context.getColor(i) : ContextCompat.getColor(context, i);
    }

    public static Rect a(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new Rect(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    public static void a(View view, OnGlobalLayoutListener onGlobalLayoutListener) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static boolean a(int i) {
        return ((i & 48) & -17) != 0;
    }

    public static float[] a(double d, float f, float f2, int i, int i2, int i3, int i4) {
        double cos = Math.cos(d);
        double sin = Math.sin(d);
        double d2 = (double) f;
        Double.isNaN(d2);
        double d3 = cos * d2;
        double d4 = (double) f2;
        Double.isNaN(d4);
        d3 -= sin * d4;
        Double.isNaN(d2);
        d2 *= sin;
        Double.isNaN(d4);
        d2 += d4 * cos;
        if (cos - sin < 0.0d) {
            d4 = (double) i3;
            Double.isNaN(d4);
            d3 += d4;
        }
        if (cos + sin < 0.0d) {
            cos = (double) i4;
            Double.isNaN(cos);
            d2 += cos;
        }
        float f3 = ((float) d3) - (((float) i) / 2.0f);
        float f4 = ((float) d2) - (((float) i2) / 2.0f);
        return new float[]{f3, f4};
    }

    public static int b(float f, Context context) {
        double applyDimension = (double) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
        Double.isNaN(applyDimension);
        return (int) (applyDimension + 0.5d);
    }

    public static int b(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static Rect b(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationX(MapboxConstants.MINIMUM_ZOOM);
        view.setTranslationY(MapboxConstants.MINIMUM_ZOOM);
        Rect a = abtp.a(view);
        view.setScaleX(scaleX);
        view.setScaleY(scaleY);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        return a;
    }

    public static boolean b(int i) {
        return ((i & 80) & -17) != 0;
    }

    public static float c(float f, Context context) {
        return f / context.getResources().getDisplayMetrics().density;
    }

    public static float c(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return ((float) displayMetrics.heightPixels) / displayMetrics.density;
    }

    public static void c(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    public static boolean c(int i) {
        return ((i & 3) & -2) != 0;
    }

    public static int d(Context context) {
        return abtp.b(context) < abtp.a(context) ? abtp.b(context) : abtp.a(context);
    }

    public static boolean d(int i) {
        return ((i & 5) & -2) != 0;
    }

    @Deprecated
    public static boolean e(Context context) {
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            return point.x < point.y;
        } catch (RuntimeException unused) {
            return true;
        }
    }

    public static abtl f(Context context) {
        boolean e = abtp.e(context) ^ 1;
        return new abtl(abso.a(context.getResources().getDisplayMetrics(), e), abso.b(context.getResources().getDisplayMetrics(), e));
    }

    public static abtl g(Context context) {
        try {
            Point point = new Point();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealSize(point);
            boolean z = !abtp.e(context);
            return new abtl(abso.a(point, z), abso.b(point, z));
        } catch (RuntimeException unused) {
            return abtp.f(context);
        }
    }

    public static int h(Context context) {
        try {
            return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        } catch (RuntimeException unused) {
            return 0;
        }
    }

    public static String i(Context context) {
        String str = "mdpi";
        switch (context.getResources().getDisplayMetrics().densityDpi) {
            case 120:
                return "ldpi";
            case 160:
                return str;
            case 240:
                return "hdpi";
            case 260:
            case 280:
            case MapboxConstants.ANIMATION_DURATION /*300*/:
            case 320:
                return "xhdpi";
            case 340:
            case 360:
            case 400:
            case 420:
            case 440:
            case 480:
                return "xxhdpi";
            case 560:
            case 640:
                return "xxxhdpi";
            default:
                return str;
        }
    }

    public static int j(Context context) {
        a.a.e();
        return abtp.b(context) + a.a.e();
    }
}
