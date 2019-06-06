package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;

/* renamed from: fd */
class fd implements fi {
    private float[] a;

    fd() {
    }

    public fm a(View view) {
        return new fk(view.getWindowToken());
    }

    public void a(View view, float f) {
        Float f2 = (Float) view.getTag(R.id.save_non_transition_alpha);
        if (f2 != null) {
            view.setAlpha(f2.floatValue() * f);
        } else {
            view.setAlpha(f);
        }
    }

    public void a(View view, int i, int i2, int i3, int i4) {
        view.setLeft(i);
        view.setTop(i2);
        view.setRight(i3);
        view.setBottom(i4);
    }

    public void a(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            a(view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    public float b(View view) {
        Float f = (Float) view.getTag(R.id.save_non_transition_alpha);
        return f != null ? view.getAlpha() / f.floatValue() : view.getAlpha();
    }

    public void b(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            b(view2, matrix);
            matrix.postTranslate((float) view2.getScrollX(), (float) view2.getScrollY());
        }
        matrix.postTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }

    public void c(View view) {
        if (view.getTag(R.id.save_non_transition_alpha) == null) {
            view.setTag(R.id.save_non_transition_alpha, Float.valueOf(view.getAlpha()));
        }
    }

    public void c(View view, Matrix matrix) {
        if (matrix == null || matrix.isIdentity()) {
            view.setPivotX((float) (view.getWidth() / 2));
            view.setPivotY((float) (view.getHeight() / 2));
            view.setTranslationX(MapboxConstants.MINIMUM_ZOOM);
            view.setTranslationY(MapboxConstants.MINIMUM_ZOOM);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotation(MapboxConstants.MINIMUM_ZOOM);
            return;
        }
        float[] fArr = this.a;
        if (fArr == null) {
            fArr = new float[9];
            this.a = fArr;
        }
        matrix.getValues(fArr);
        float f = fArr[3];
        float sqrt = ((float) Math.sqrt((double) (1.0f - (f * f)))) * ((float) (fArr[0] < MapboxConstants.MINIMUM_ZOOM ? -1 : 1));
        f = (float) Math.toDegrees(Math.atan2((double) f, (double) sqrt));
        float f2 = fArr[0] / sqrt;
        float f3 = fArr[4] / sqrt;
        sqrt = fArr[2];
        float f4 = fArr[5];
        view.setPivotX(MapboxConstants.MINIMUM_ZOOM);
        view.setPivotY(MapboxConstants.MINIMUM_ZOOM);
        view.setTranslationX(sqrt);
        view.setTranslationY(f4);
        view.setRotation(f);
        view.setScaleX(f2);
        view.setScaleY(f3);
    }

    public void d(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(R.id.save_non_transition_alpha, null);
        }
    }
}
