package defpackage;

import android.graphics.Canvas;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: abvn */
public final class abvn implements abvf {
    private float a = 1.0f;
    private int b = 0;

    public final void a(Canvas canvas) {
        float f = this.a;
        if (f < 1.0f) {
            canvas.scale(1.0f, f, MapboxConstants.MINIMUM_ZOOM, (float) this.b);
        }
    }

    public final void b(Canvas canvas) {
        float f = this.a;
        if (f < 1.0f) {
            canvas.scale(1.0f, 1.0f / f, MapboxConstants.MINIMUM_ZOOM, (float) this.b);
        }
    }

    public final int getScalePY() {
        return this.b;
    }

    public final float getScaleY() {
        return this.a;
    }

    public final void setScalePY(int i) {
        this.b = i;
    }

    public final void setScaleY(float f) {
        this.a = f;
    }
}
