package defpackage;

import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.RectF;

/* renamed from: eb */
final class eb {
    static final Matrix a = new 1();

    /* renamed from: eb$1 */
    static class 1 extends Matrix {
        1() {
        }

        private static void a() {
            throw new IllegalStateException("Matrix can not be modified");
        }

        public final boolean postConcat(Matrix matrix) {
            1.a();
            return false;
        }

        public final boolean postRotate(float f) {
            1.a();
            return false;
        }

        public final boolean postRotate(float f, float f2, float f3) {
            1.a();
            return false;
        }

        public final boolean postScale(float f, float f2) {
            1.a();
            return false;
        }

        public final boolean postScale(float f, float f2, float f3, float f4) {
            1.a();
            return false;
        }

        public final boolean postSkew(float f, float f2) {
            1.a();
            return false;
        }

        public final boolean postSkew(float f, float f2, float f3, float f4) {
            1.a();
            return false;
        }

        public final boolean postTranslate(float f, float f2) {
            1.a();
            return false;
        }

        public final boolean preConcat(Matrix matrix) {
            1.a();
            return false;
        }

        public final boolean preRotate(float f) {
            1.a();
            return false;
        }

        public final boolean preRotate(float f, float f2, float f3) {
            1.a();
            return false;
        }

        public final boolean preScale(float f, float f2) {
            1.a();
            return false;
        }

        public final boolean preScale(float f, float f2, float f3, float f4) {
            1.a();
            return false;
        }

        public final boolean preSkew(float f, float f2) {
            1.a();
            return false;
        }

        public final boolean preSkew(float f, float f2, float f3, float f4) {
            1.a();
            return false;
        }

        public final boolean preTranslate(float f, float f2) {
            1.a();
            return false;
        }

        public final void reset() {
            1.a();
        }

        public final void set(Matrix matrix) {
            1.a();
        }

        public final boolean setConcat(Matrix matrix, Matrix matrix2) {
            1.a();
            return false;
        }

        public final boolean setPolyToPoly(float[] fArr, int i, float[] fArr2, int i2, int i3) {
            1.a();
            return false;
        }

        public final boolean setRectToRect(RectF rectF, RectF rectF2, ScaleToFit scaleToFit) {
            1.a();
            return false;
        }

        public final void setRotate(float f) {
            1.a();
        }

        public final void setRotate(float f, float f2, float f3) {
            1.a();
        }

        public final void setScale(float f, float f2) {
            1.a();
        }

        public final void setScale(float f, float f2, float f3, float f4) {
            1.a();
        }

        public final void setSinCos(float f, float f2) {
            1.a();
        }

        public final void setSinCos(float f, float f2, float f3, float f4) {
            1.a();
        }

        public final void setSkew(float f, float f2) {
            1.a();
        }

        public final void setSkew(float f, float f2, float f3, float f4) {
            1.a();
        }

        public final void setTranslate(float f, float f2) {
            1.a();
        }

        public final void setValues(float[] fArr) {
            1.a();
        }
    }
}
