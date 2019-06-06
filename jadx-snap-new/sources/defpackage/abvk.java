package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: abvk */
public final class abvk implements abvf {
    private final Path a = new Path();
    private int b;
    private int c;
    private int d;
    private int e;
    private int f = 0;

    public final void a(Canvas canvas) {
        if (this.b > 0 || this.c > 0 || this.d > 0 || this.e > 0) {
            canvas.save();
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            this.a.reset();
            this.a.moveTo((float) (this.b + 0), (float) this.f);
            this.a.lineTo((float) (width - this.c), (float) this.f);
            Path path = this.a;
            float f = (float) width;
            int i = this.f;
            path.quadTo(f, (float) i, f, (float) (i + this.c));
            this.a.lineTo(f, (float) (height - this.e));
            float f2 = (float) height;
            this.a.quadTo(f, f2, (float) (width - this.e), f2);
            this.a.lineTo((float) (this.d + 0), f2);
            this.a.quadTo(MapboxConstants.MINIMUM_ZOOM, f2, MapboxConstants.MINIMUM_ZOOM, (float) (height - this.d));
            this.a.lineTo(MapboxConstants.MINIMUM_ZOOM, (float) (this.f + this.b));
            Path path2 = this.a;
            height = this.f;
            path2.quadTo(MapboxConstants.MINIMUM_ZOOM, (float) height, (float) (this.b + 0), (float) height);
            this.a.close();
            canvas.clipPath(this.a);
        }
    }

    public final void b(Canvas canvas) {
        if (this.b > 0 || this.c > 0 || this.d > 0 || this.e > 0) {
            canvas.restore();
        }
    }

    public final int getBottomLeftCornerRadius() {
        return this.d;
    }

    public final int getBottomRightCornerRadius() {
        return this.e;
    }

    public final int getCornerRadius() {
        return this.b;
    }

    public final int getTop() {
        return this.f;
    }

    public final int getTopLeftCornerRadius() {
        return this.b;
    }

    public final int getTopRightCornerRadius() {
        return this.c;
    }

    public final void setBottomLeftCornerRadius(int i) {
        this.d = i;
    }

    public final void setBottomRightCornerRadius(int i) {
        this.e = i;
    }

    public final void setCornerRadius(int i) {
        this.e = i;
        this.d = i;
        this.c = i;
        this.b = i;
    }

    public final void setTop(int i) {
        this.f = i;
    }

    public final void setTopLeftCornerRadius(int i) {
        this.b = i;
    }

    public final void setTopRightCornerRadius(int i) {
        this.c = i;
    }
}
