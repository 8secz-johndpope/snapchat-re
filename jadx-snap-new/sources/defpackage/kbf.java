package defpackage;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.google.common.base.Preconditions;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.Arrays;

/* renamed from: kbf */
public final class kbf extends Drawable implements kbd {
    private final float[] a = new float[8];
    private float[] b = new float[8];
    private Paint c = new Paint(1);
    private boolean d = false;
    private float e = MapboxConstants.MINIMUM_ZOOM;
    private float f = MapboxConstants.MINIMUM_ZOOM;
    private int g = 0;
    private float h = MapboxConstants.MINIMUM_ZOOM;
    private boolean i = false;
    private Path j = new Path();
    private Path k = new Path();
    private int l = 0;
    private final RectF m = new RectF();
    private final RectF n = new RectF();
    private final RectF o = new RectF();
    private int p = 255;

    private kbf(int i) {
        if (this.l != i) {
            this.l = i;
            invalidateSelf();
        }
    }

    @TargetApi(11)
    public static kbf a(ColorDrawable colorDrawable) {
        return new kbf(colorDrawable.getColor());
    }

    private void a() {
        if (this.d) {
            this.o.set(getBounds());
            this.o.inset(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM);
            this.n.set(getBounds());
            this.n.inset(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM);
            return;
        }
        this.j.reset();
        this.k.reset();
        this.m.set(getBounds());
        this.m.inset(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM);
        if (this.d) {
            this.k.addCircle(this.m.centerX(), this.m.centerY(), Math.min(this.m.width(), this.m.height()) / 2.0f, Direction.CW);
        } else {
            for (int i = 0; i < 8; i++) {
                this.b[i] = this.a[i] + MapboxConstants.MINIMUM_ZOOM;
            }
            this.k.addRoundRect(this.m, this.b, Direction.CW);
        }
        this.m.inset(-0.0f, -0.0f);
        this.m.inset(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM);
        if (this.d) {
            this.j.addCircle(this.m.centerX(), this.m.centerY(), Math.min(this.m.width(), this.m.height()) / 2.0f, Direction.CW);
        } else {
            this.j.addRoundRect(this.m, this.a, Direction.CW);
        }
        this.m.inset(-0.0f, -0.0f);
    }

    public final void a(boolean z) {
        this.d = z;
        a();
        invalidateSelf();
    }

    public final void a(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.a, MapboxConstants.MINIMUM_ZOOM);
        } else {
            Preconditions.checkArgument(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.a, 0, 8);
        }
        a();
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        this.c.setColor(kbb.a(this.l, this.p));
        this.c.setStyle(Style.FILL);
        if (this.d) {
            canvas.drawCircle(this.n.centerX(), this.n.centerY(), Math.min(this.n.width(), this.n.height()) / 2.0f, this.c);
            return;
        }
        canvas.drawPath(this.j, this.c);
    }

    public final int getAlpha() {
        return this.p;
    }

    public final int getOpacity() {
        int a = kbb.a(this.l, this.p) >>> 24;
        return a == 255 ? -1 : a == 0 ? -2 : -3;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a();
    }

    public final void setAlpha(int i) {
        if (i != this.p) {
            this.p = i;
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
