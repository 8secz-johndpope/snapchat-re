package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: abwf */
public final class abwf implements abvv {
    private final Paint a = new Paint();
    private akbk<Integer> b;

    public abwf(akbk<Integer> akbk) {
        akcr.b(akbk, "color");
        this.a.setAntiAlias(true);
        this.a.setDither(true);
        this.b = akbk;
    }

    public final void a(View view, Canvas canvas, abxs abxs) {
        akcr.b(view, "view");
        akcr.b(canvas, "canvas");
        akcr.b(abxs, "dimensions");
        this.a.setColor(((Number) this.b.invoke()).intValue());
        canvas.drawRect(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, (float) abxs.a, (float) abxs.b, this.a);
    }

    public final void b(View view, Canvas canvas, abxs abxs) {
        akcr.b(view, "view");
        akcr.b(canvas, "canvas");
        akcr.b(abxs, "dimensions");
    }
}
