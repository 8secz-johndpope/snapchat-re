package defpackage;

import android.opengl.Matrix;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: adhs */
public final class adhs implements adhn {
    public final void a(float[] fArr) {
        Matrix.setIdentityM(fArr, 0);
    }

    public final void a(float[] fArr, float f, float f2) {
        Matrix.scaleM(fArr, 0, f, f2, 1.0f);
    }

    public final void a(float[] fArr, float f, float f2, float f3, float f4) {
        Matrix.setRotateM(fArr, 0, f, f2, f3, f4);
    }

    public final void a(float[] fArr, float[] fArr2) {
        Matrix.invertM(fArr, 0, fArr2, 0);
    }

    public final void a(float[] fArr, float[] fArr2, float[] fArr3) {
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr3, 0);
    }

    public final void b(float[] fArr, float f, float f2) {
        Matrix.translateM(fArr, 0, f, f2, MapboxConstants.MINIMUM_ZOOM);
    }
}
