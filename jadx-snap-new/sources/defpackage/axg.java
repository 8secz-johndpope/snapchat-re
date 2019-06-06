package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: axg */
public final class axg {

    /* renamed from: axg$a */
    public static abstract class a implements b {
        public final Matrix a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
            int i3 = i;
            int i4 = i2;
            a(matrix, rect, i3, i4, f, f2, ((float) rect.width()) / ((float) i3), ((float) rect.height()) / ((float) i4));
            return matrix;
        }

        public abstract void a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4);
    }

    /* renamed from: axg$b */
    public interface b {
        public static final b a = j.j;
        public static final b b = i.j;
        public static final b c = g.j;
        public static final b d = h.j;
        public static final b e = c.j;
        public static final b f = e.j;
        public static final b g = d.j;
        public static final b h = k.j;
        public static final b i = f.j;

        Matrix a(Matrix matrix, Rect rect, int i, int i2, float f, float f2);
    }

    /* renamed from: axg$j */
    static class j extends a {
        public static final b j = new j();

        private j() {
        }

        public final void a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float f5 = (float) rect.left;
            float f6 = (float) rect.top;
            matrix.setScale(f3, f4);
            matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (f6 + 0.5f)));
        }

        public final String toString() {
            return "fit_xy";
        }
    }

    /* renamed from: axg$i */
    static class i extends a {
        public static final b j = new i();

        private i() {
        }

        public final void a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            float f5 = (float) rect.left;
            float f6 = (float) rect.top;
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (f6 + 0.5f)));
        }

        public final String toString() {
            return "fit_start";
        }
    }

    /* renamed from: axg$g */
    static class g extends a {
        public static final b j = new g();

        private g() {
        }

        public final void a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            f = Math.min(f3, f4);
            f2 = ((float) rect.left) + ((((float) rect.width()) - (((float) i) * f)) * 0.5f);
            f3 = ((float) rect.top) + ((((float) rect.height()) - (((float) i2) * f)) * 0.5f);
            matrix.setScale(f, f);
            matrix.postTranslate((float) ((int) (f2 + 0.5f)), (float) ((int) (f3 + 0.5f)));
        }

        public final String toString() {
            return "fit_center";
        }
    }

    /* renamed from: axg$h */
    static class h extends a {
        public static final b j = new h();

        private h() {
        }

        public final void a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            f = Math.min(f3, f4);
            f2 = ((float) rect.left) + (((float) rect.width()) - (((float) i) * f));
            float height = ((float) rect.top) + (((float) rect.height()) - (((float) i2) * f));
            matrix.setScale(f, f);
            matrix.postTranslate((float) ((int) (f2 + 0.5f)), (float) ((int) (height + 0.5f)));
        }

        public final String toString() {
            return "fit_end";
        }
    }

    /* renamed from: axg$c */
    static class c extends a {
        public static final b j = new c();

        private c() {
        }

        public final void a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            matrix.setTranslate((float) ((int) ((((float) rect.left) + (((float) (rect.width() - i)) * 0.5f)) + 0.5f)), (float) ((int) ((((float) rect.top) + (((float) (rect.height() - i2)) * 0.5f)) + 0.5f)));
        }

        public final String toString() {
            return "center";
        }
    }

    /* renamed from: axg$e */
    static class e extends a {
        public static final b j = new e();

        private e() {
        }

        public final void a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            f = Math.min(Math.min(f3, f4), 1.0f);
            f2 = ((float) rect.left) + ((((float) rect.width()) - (((float) i) * f)) * 0.5f);
            f3 = ((float) rect.top) + ((((float) rect.height()) - (((float) i2) * f)) * 0.5f);
            matrix.setScale(f, f);
            matrix.postTranslate((float) ((int) (f2 + 0.5f)), (float) ((int) (f3 + 0.5f)));
        }

        public final String toString() {
            return "center_inside";
        }
    }

    /* renamed from: axg$d */
    static class d extends a {
        public static final b j = new d();

        private d() {
        }

        public final void a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float f5;
            float f6;
            if (f4 > f3) {
                float width = ((float) rect.left) + ((((float) rect.width()) - (((float) i) * f4)) * 0.5f);
                f5 = (float) rect.top;
                f6 = width;
                f3 = f4;
            } else {
                f6 = (float) rect.left;
                f5 = ((((float) rect.height()) - (((float) i2) * f3)) * 0.5f) + ((float) rect.top);
            }
            matrix.setScale(f3, f3);
            matrix.postTranslate((float) ((int) (f6 + 0.5f)), (float) ((int) (f5 + 0.5f)));
        }

        public final String toString() {
            return "center_crop";
        }
    }

    /* renamed from: axg$k */
    static class k extends a {
        public static final b j = new k();

        private k() {
        }

        public final void a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float f5;
            float f6;
            if (f4 > f3) {
                f6 = ((float) i) * f4;
                f = ((float) rect.left) + Math.max(Math.min((((float) rect.width()) * 0.5f) - (f * f6), MapboxConstants.MINIMUM_ZOOM), ((float) rect.width()) - f6);
                f5 = (float) rect.top;
                f3 = f4;
            } else {
                f = (float) rect.left;
                float f7 = ((float) i2) * f3;
                f6 = (((float) rect.height()) * 0.5f) - (f2 * f7);
                f5 = Math.max(Math.min(f6, MapboxConstants.MINIMUM_ZOOM), ((float) rect.height()) - f7) + ((float) rect.top);
            }
            matrix.setScale(f3, f3);
            matrix.postTranslate((float) ((int) (f + 0.5f)), (float) ((int) (f5 + 0.5f)));
        }

        public final String toString() {
            return "focus_crop";
        }
    }

    /* renamed from: axg$f */
    static class f extends a {
        public static final b j = new f();

        private f() {
        }

        public final void a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            f = (float) rect.left;
            f2 = ((float) rect.top) + (((float) rect.height()) - (((float) i2) * min));
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (f + 0.5f)), (float) ((int) (f2 + 0.5f)));
        }

        public final String toString() {
            return "fit_bottom_start";
        }
    }

    /* renamed from: axg$l */
    public interface l {
        Object a();
    }
}
