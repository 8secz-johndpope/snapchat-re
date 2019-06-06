package defpackage;

import android.graphics.Canvas;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: abvq */
public final class abvq implements abvf {
    private int a = 0;

    public final void a(Canvas canvas) {
        int i = this.a;
        if (i != 0) {
            canvas.translate((float) i, MapboxConstants.MINIMUM_ZOOM);
        }
    }

    public final void b(Canvas canvas) {
        int i = this.a;
        if (i != 0) {
            canvas.translate((float) (-i), MapboxConstants.MINIMUM_ZOOM);
        }
    }

    public final int getTranslateX() {
        return this.a;
    }

    public final void setTranslateX(int i) {
        this.a = i;
    }
}
