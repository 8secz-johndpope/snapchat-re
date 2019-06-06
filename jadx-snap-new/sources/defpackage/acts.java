package defpackage;

import android.view.animation.Interpolator;

/* renamed from: acts */
public final class acts implements Interpolator {
    private final float a;
    private final Float[] b;
    private final float c;
    private final ajxm<Float, Float>[] d;
    private final float e = 0.6f;
    private final Interpolator f;

    public acts(int i, Interpolator interpolator) {
        akcr.b(interpolator, "interpolator");
        this.f = interpolator;
        float f = 1.0f / ((float) i);
        this.a = f;
        Float[] fArr = new Float[i];
        int length = fArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            fArr[i2] = Float.valueOf(this.f.getInterpolation(((float) i3) * f));
            i2 = i3;
        }
        this.b = fArr;
        this.c = this.a * 0.6f;
        ajxm[] ajxmArr = new ajxm[i];
        int length2 = ajxmArr.length;
        for (int i4 = 0; i4 < length2; i4++) {
            f = (float) i4;
            ajxmArr[i4] = new ajxm(Float.valueOf(this.a * f), Float.valueOf((f * this.a) + this.c));
        }
        this.d = ajxmArr;
    }

    public final float getInterpolation(float f) {
        int i = 1;
        int min = Math.min((int) (f / this.a), this.d.length - 1);
        ajxm ajxm = this.d[min];
        if (f < ((Number) ajxm.a).floatValue() || f >= ((Number) ajxm.b).floatValue()) {
            i = 0;
        }
        return i != 0 ? this.f.getInterpolation(((f - ((Number) ajxm.a).floatValue()) / 0.6f) + ((Number) ajxm.a).floatValue()) : this.b[min].floatValue();
    }
}
