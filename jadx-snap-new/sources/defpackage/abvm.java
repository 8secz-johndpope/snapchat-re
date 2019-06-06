package defpackage;

import android.graphics.Canvas;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: abvm */
public final class abvm implements abvf {
    private float a = 1.0f;
    private int b = 0;

    public final void a(Canvas canvas) {
        float f = this.a;
        if (f < 1.0f) {
            canvas.scale(f, 1.0f, (float) this.b, MapboxConstants.MINIMUM_ZOOM);
        }
    }

    public final void b(Canvas canvas) {
        float f = this.a;
        if (f < 1.0f) {
            canvas.scale(1.0f / f, 1.0f, (float) this.b, MapboxConstants.MINIMUM_ZOOM);
        }
    }

    public final int getScalePX() {
        return this.b;
    }

    public final float getScaleX() {
        return this.a;
    }

    public final void setScalePX(int i) {
        this.b = i;
    }

    public final void setScaleX(float f) {
        this.a = f;
    }
}
