package defpackage;

import android.graphics.Canvas;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: abvr */
public final class abvr implements abvf {
    private int a = 0;

    public final void a(Canvas canvas) {
        int i = this.a;
        if (i != 0) {
            canvas.translate(MapboxConstants.MINIMUM_ZOOM, (float) i);
        }
    }

    public final void b(Canvas canvas) {
        int i = this.a;
        if (i != 0) {
            canvas.translate(MapboxConstants.MINIMUM_ZOOM, (float) (-i));
        }
    }

    public final int getTranslateY() {
        return this.a;
    }

    public final void setTranslateY(int i) {
        this.a = i;
    }
}
