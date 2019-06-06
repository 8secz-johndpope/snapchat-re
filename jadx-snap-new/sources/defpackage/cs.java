package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: cs */
final class cs extends mc {
    float a;
    private Path c;
    private float d;
    private float e;
    private boolean f;
    private final int g;
    private final int h;
    private final int i;

    static {
        Math.cos(Math.toRadians(45.0d));
    }

    public static void a(float f) {
        cs csVar = null;
        csVar.a(f, csVar.d);
    }

    private void a(float f, float f2) {
        if (f < MapboxConstants.MINIMUM_ZOOM || f2 < MapboxConstants.MINIMUM_ZOOM) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        f = (float) cs.b(f);
        f2 = (float) cs.b(f2);
        if (f > f2) {
            f = f2;
        }
        cs csVar = null;
        if (csVar.a != f || csVar.d != f2) {
            Math.round(f * 1.5f);
            csVar.invalidateSelf();
        }
    }

    private static int b(float f) {
        int round = Math.round(f);
        return round % 2 == 1 ? round - 1 : round;
    }

    public final void draw(Canvas canvas) {
        float f;
        float f2;
        int i;
        int i2;
        float f3;
        Canvas canvas2 = canvas;
        RectF rectF = null;
        if (this.f) {
            Rect bounds = getBounds();
            float f4 = this.d * 1.5f;
            rectF.set(((float) bounds.left) + this.d, ((float) bounds.top) + f4, ((float) bounds.right) - this.d, ((float) bounds.bottom) - f4);
            this.b.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            RectF rectF2 = new RectF(-0.0f, -0.0f, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM);
            RectF rectF3 = new RectF(rectF2);
            f4 = this.e;
            rectF3.inset(-f4, -f4);
            Path path = this.c;
            if (path == null) {
                this.c = new Path();
            } else {
                path.reset();
            }
            this.c.setFillType(FillType.EVEN_ODD);
            this.c.moveTo(-0.0f, MapboxConstants.MINIMUM_ZOOM);
            this.c.rLineTo(-this.e, MapboxConstants.MINIMUM_ZOOM);
            this.c.arcTo(rectF3, 180.0f, 90.0f, false);
            this.c.arcTo(rectF2, 270.0f, -90.0f, false);
            this.c.close();
            f4 = -rectF3.top;
            if (f4 > MapboxConstants.MINIMUM_ZOOM) {
                f = MapboxConstants.MINIMUM_ZOOM / f4;
                float f5 = f + ((1.0f - f) / 2.0f);
                rectF.setShader(new RadialGradient(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, f4, new int[]{0, this.g, this.h, this.i}, new float[]{MapboxConstants.MINIMUM_ZOOM, f, f5, 1.0f}, TileMode.CLAMP));
            }
            f2 = rectF2.top;
            float f6 = rectF3.top;
            r8 = new int[3];
            i = 1;
            r8[1] = this.h;
            r8[2] = this.i;
            rectF.setShader(new LinearGradient(MapboxConstants.MINIMUM_ZOOM, f2, MapboxConstants.MINIMUM_ZOOM, f6, r8, new float[]{MapboxConstants.MINIMUM_ZOOM, 0.5f, 1.0f}, TileMode.CLAMP));
            rectF.setAntiAlias(false);
            this.f = false;
        } else {
            i = 1;
        }
        int save = canvas.save();
        canvas2.rotate(MapboxConstants.MINIMUM_ZOOM, rectF.centerX(), rectF.centerY());
        float f7 = -0.0f - this.e;
        Object obj = rectF.width() > MapboxConstants.MINIMUM_ZOOM ? 1 : null;
        if (rectF.height() <= MapboxConstants.MINIMUM_ZOOM) {
            i = 0;
        }
        f2 = this.a;
        float f8 = MapboxConstants.MINIMUM_ZOOM / ((f2 - (0.5f * f2)) + MapboxConstants.MINIMUM_ZOOM);
        f = MapboxConstants.MINIMUM_ZOOM / ((f2 - (0.25f * f2)) + MapboxConstants.MINIMUM_ZOOM);
        float f9 = MapboxConstants.MINIMUM_ZOOM / ((f2 - f2) + MapboxConstants.MINIMUM_ZOOM);
        int save2 = canvas.save();
        canvas2.translate(rectF.left + MapboxConstants.MINIMUM_ZOOM, rectF.top + MapboxConstants.MINIMUM_ZOOM);
        canvas2.scale(f8, f);
        canvas2.drawPath(this.c, rectF);
        if (obj != null) {
            canvas2.scale(1.0f / f8, 1.0f);
            i2 = save2;
            f3 = f9;
            canvas.drawRect(MapboxConstants.MINIMUM_ZOOM, f7, rectF.width(), -0.0f, null);
        } else {
            i2 = save2;
            f3 = f9;
        }
        canvas2.restoreToCount(i2);
        i2 = canvas.save();
        canvas2.translate(rectF.right, rectF.bottom);
        canvas2.scale(f8, f3);
        canvas2.rotate(180.0f);
        canvas2.drawPath(this.c, rectF);
        if (obj != null) {
            canvas2.scale(1.0f / f8, 1.0f);
            canvas.drawRect(MapboxConstants.MINIMUM_ZOOM, f7, rectF.width(), this.e - -0.0f, null);
        }
        canvas2.restoreToCount(i2);
        int save3 = canvas.save();
        canvas2.translate(rectF.left + MapboxConstants.MINIMUM_ZOOM, rectF.bottom);
        canvas2.scale(f8, f3);
        canvas2.rotate(270.0f);
        canvas2.drawPath(this.c, rectF);
        if (i != 0) {
            canvas2.scale(1.0f / f3, 1.0f);
            canvas.drawRect(MapboxConstants.MINIMUM_ZOOM, f7, rectF.height(), -0.0f, null);
        }
        canvas2.restoreToCount(save3);
        save3 = canvas.save();
        canvas2.translate(rectF.right, rectF.top + MapboxConstants.MINIMUM_ZOOM);
        canvas2.scale(f8, f);
        canvas2.rotate(90.0f);
        canvas2.drawPath(this.c, rectF);
        if (i != 0) {
            canvas2.scale(1.0f / f, 1.0f);
            canvas.drawRect(MapboxConstants.MINIMUM_ZOOM, f7, rectF.height(), -0.0f, null);
        }
        canvas2.restoreToCount(save3);
        canvas2.restoreToCount(save);
        super.draw(canvas);
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) (this.d * 1.5f));
        int ceil2 = (int) Math.ceil((double) this.d);
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public final void onBoundsChange(Rect rect) {
        this.f = true;
    }

    public final void setAlpha(int i) {
        super.setAlpha(i);
        Paint paint = null;
        paint.setAlpha(i);
        paint.setAlpha(i);
    }
}
