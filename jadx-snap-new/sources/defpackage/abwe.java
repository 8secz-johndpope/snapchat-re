package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: abwe */
public final class abwe implements abvv {
    private final Path a = new Path();
    private float b;
    private float c;
    private float d;
    private float e;

    public abwe(float f) {
        this.b = f;
        this.c = f;
        this.d = f;
        this.e = f;
    }

    public final void a(View view, Canvas canvas, abxs abxs) {
        akcr.b(view, "view");
        akcr.b(canvas, "canvas");
        akcr.b(abxs, "dimensions");
        if (this.b > MapboxConstants.MINIMUM_ZOOM || this.c > MapboxConstants.MINIMUM_ZOOM || this.d > MapboxConstants.MINIMUM_ZOOM || this.e > MapboxConstants.MINIMUM_ZOOM) {
            canvas.save();
            float f = (float) abxs.a;
            float f2 = (float) abxs.b;
            this.a.reset();
            this.a.moveTo(this.b + MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM);
            this.a.lineTo(f - this.c, MapboxConstants.MINIMUM_ZOOM);
            this.a.quadTo(f, MapboxConstants.MINIMUM_ZOOM, f, this.c + MapboxConstants.MINIMUM_ZOOM);
            this.a.lineTo(f, f2 - this.e);
            this.a.quadTo(f, f2, f - this.e, f2);
            this.a.lineTo(this.d + MapboxConstants.MINIMUM_ZOOM, f2);
            this.a.quadTo(MapboxConstants.MINIMUM_ZOOM, f2, MapboxConstants.MINIMUM_ZOOM, f2 - this.d);
            this.a.lineTo(MapboxConstants.MINIMUM_ZOOM, this.b + MapboxConstants.MINIMUM_ZOOM);
            this.a.quadTo(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, this.b + MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM);
            this.a.close();
            canvas.clipPath(this.a);
        }
    }

    public final void b(View view, Canvas canvas, abxs abxs) {
        akcr.b(view, "view");
        akcr.b(canvas, "canvas");
        akcr.b(abxs, "dimensions");
        if (this.b > MapboxConstants.MINIMUM_ZOOM || this.c > MapboxConstants.MINIMUM_ZOOM || this.d > MapboxConstants.MINIMUM_ZOOM || this.e > MapboxConstants.MINIMUM_ZOOM) {
            canvas.restore();
        }
    }
}
