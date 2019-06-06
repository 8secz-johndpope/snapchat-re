package defpackage;

import android.graphics.Canvas;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: abvj */
public final class abvj implements abvf {
    private float a = MapboxConstants.MINIMUM_ZOOM;
    private int b = 0;
    private int c = 0;

    public final void a(Canvas canvas) {
        float f = this.a;
        if (f != MapboxConstants.MINIMUM_ZOOM) {
            canvas.rotate(f, (float) this.b, (float) this.c);
        }
    }

    public final void b(Canvas canvas) {
        float f = this.a;
        if (f != MapboxConstants.MINIMUM_ZOOM) {
            canvas.rotate(-f, (float) this.b, (float) this.c);
        }
    }

    public final int getPivotX() {
        return this.b;
    }

    public final int getPivotY() {
        return this.c;
    }

    public final float getRotation() {
        return this.a;
    }

    public final void setPivotX(int i) {
        this.b = i;
    }

    public final void setPivotY(int i) {
        this.c = i;
    }

    public final void setRotation(float f) {
        this.a = f;
    }
}
