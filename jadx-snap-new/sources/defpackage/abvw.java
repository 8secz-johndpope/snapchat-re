package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.view.View;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: abvw */
public final class abvw implements abvv {
    private final Paint a = new Paint();
    private final Path b = new Path();
    private float c;
    private float d;
    private float e;
    private float f;
    private akbk<Integer> g;
    private float h;
    private float i;

    public abvw(float f, akbk<Integer> akbk, float f2) {
        akcr.b(akbk, "color");
        this.c = f;
        this.d = f;
        this.e = f;
        this.f = f;
        this.g = akbk;
        this.h = f2;
        this.i = f2 / 2.0f;
        this.a.setStrokeWidth(f2);
        this.a.setStyle(Style.STROKE);
        this.a.setAntiAlias(true);
        this.a.setDither(true);
    }

    public final void a(View view, Canvas canvas, abxs abxs) {
        akcr.b(view, "view");
        akcr.b(canvas, "canvas");
        akcr.b(abxs, "dimensions");
        canvas.save();
        float f = (float) abxs.a;
        float f2 = (float) abxs.b;
        float f3 = this.i;
        float f4 = f3 + MapboxConstants.MINIMUM_ZOOM;
        float f5 = MapboxConstants.MINIMUM_ZOOM + f3;
        f2 -= f3;
        f -= f3;
        float f6 = this.c - f3;
        float f7 = this.d - f3;
        float f8 = this.f - f3;
        float f9 = this.e - f3;
        this.a.setColor(((Number) this.g.invoke()).intValue());
        this.b.reset();
        float f10 = f5 + f6;
        this.b.moveTo(f10, f4);
        this.b.lineTo(f - f7, f4);
        this.b.quadTo(f, f4, f, f7 + f4);
        this.b.lineTo(f, f2 - f8);
        this.b.quadTo(f, f2, f - f8, f2);
        this.b.lineTo(f5 + f9, f2);
        this.b.quadTo(f5, f2, f5, f2 - f9);
        this.b.lineTo(f5, f6 + f4);
        this.b.quadTo(f5, f4, f10, f4);
        this.b.close();
        canvas.drawPath(this.b, this.a);
    }

    public final void b(View view, Canvas canvas, abxs abxs) {
        akcr.b(view, "view");
        akcr.b(canvas, "canvas");
        akcr.b(abxs, "dimensions");
        canvas.restore();
    }
}
