package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;

/* renamed from: oo */
final class oo extends Drawable {
    static a a;
    private static final double g = Math.cos(Math.toRadians(45.0d));
    float b;
    float c;
    float d;
    ColorStateList e;
    boolean f = true;
    private final int h;
    private Paint i;
    private Paint j;
    private Paint k;
    private final RectF l;
    private Path m;
    private float n;
    private final int o;
    private final int p;
    private boolean q = true;
    private boolean r = false;

    /* renamed from: oo$a */
    interface a {
        void a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    oo(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.o = resources.getColor(R.color.cardview_shadow_start_color);
        this.p = resources.getColor(R.color.cardview_shadow_end_color);
        this.h = resources.getDimensionPixelSize(R.dimen.cardview_compat_inset_shadow);
        this.i = new Paint(5);
        a(colorStateList);
        this.j = new Paint(5);
        this.j.setStyle(Style.FILL);
        this.b = (float) ((int) (f + 0.5f));
        this.l = new RectF();
        this.k = new Paint(this.j);
        this.k.setAntiAlias(false);
        a(f2, f3);
    }

    static float a(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        double d = (double) (f * 1.5f);
        double d2 = 1.0d - g;
        double d3 = (double) f2;
        Double.isNaN(d3);
        d2 *= d3;
        Double.isNaN(d);
        return (float) (d + d2);
    }

    private static int a(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }

    static float b(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        double d = (double) f;
        double d2 = 1.0d - g;
        double d3 = (double) f2;
        Double.isNaN(d3);
        d2 *= d3;
        Double.isNaN(d);
        return (float) (d + d2);
    }

    /* Access modifiers changed, original: final */
    public final float a() {
        float f = this.c;
        return (Math.max(f, (this.b + ((float) this.h)) + (f / 2.0f)) * 2.0f) + ((this.c + ((float) this.h)) * 2.0f);
    }

    /* Access modifiers changed, original: final */
    public final void a(float f, float f2) {
        String str = ". Must be >= 0";
        StringBuilder stringBuilder;
        if (f < MapboxConstants.MINIMUM_ZOOM) {
            stringBuilder = new StringBuilder("Invalid shadow size ");
            stringBuilder.append(f);
            stringBuilder.append(str);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (f2 >= MapboxConstants.MINIMUM_ZOOM) {
            f = (float) oo.a(f);
            f2 = (float) oo.a(f2);
            if (f > f2) {
                if (!this.r) {
                    this.r = true;
                }
                f = f2;
            }
            if (this.d != f || this.c != f2) {
                this.d = f;
                this.c = f2;
                this.n = (float) ((int) (((f * 1.5f) + ((float) this.h)) + 0.5f));
                this.f = true;
                invalidateSelf();
            }
        } else {
            stringBuilder = new StringBuilder("Invalid max shadow size ");
            stringBuilder.append(f2);
            stringBuilder.append(str);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.e = colorStateList;
        this.i.setColor(this.e.getColorForState(getState(), this.e.getDefaultColor()));
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        this.q = z;
        invalidateSelf();
    }

    /* Access modifiers changed, original: final */
    public final float b() {
        float f = this.c;
        return (Math.max(f, (this.b + ((float) this.h)) + ((f * 1.5f) / 2.0f)) * 2.0f) + (((this.c * 1.5f) + ((float) this.h)) * 2.0f);
    }

    public final void draw(Canvas canvas) {
        float f;
        float f2;
        int i;
        Canvas canvas2 = canvas;
        if (this.f) {
            Rect bounds = getBounds();
            float f3 = this.c * 1.5f;
            this.l.set(((float) bounds.left) + this.c, ((float) bounds.top) + f3, ((float) bounds.right) - this.c, ((float) bounds.bottom) - f3);
            f3 = this.b;
            RectF rectF = new RectF(-f3, -f3, f3, f3);
            RectF rectF2 = new RectF(rectF);
            float f4 = this.n;
            rectF2.inset(-f4, -f4);
            Path path = this.m;
            if (path == null) {
                this.m = new Path();
            } else {
                path.reset();
            }
            this.m.setFillType(FillType.EVEN_ODD);
            this.m.moveTo(-this.b, MapboxConstants.MINIMUM_ZOOM);
            this.m.rLineTo(-this.n, MapboxConstants.MINIMUM_ZOOM);
            this.m.arcTo(rectF2, 180.0f, 90.0f, false);
            this.m.arcTo(rectF, 270.0f, -90.0f, false);
            this.m.close();
            f = this.b;
            f3 = this.n;
            f4 = f / (f + f3);
            Paint paint = this.j;
            f += f3;
            r12 = new int[3];
            int i2 = this.o;
            r12[0] = i2;
            r12[1] = i2;
            r12[2] = this.p;
            Shader shader = r12;
            Shader radialGradient = new RadialGradient(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, f, r12, new float[]{MapboxConstants.MINIMUM_ZOOM, f4, 1.0f}, TileMode.CLAMP);
            paint.setShader(shader);
            Paint paint2 = this.k;
            float f5 = this.b;
            float f6 = -f5;
            f2 = this.n;
            float f7 = f6 + f2;
            float f8 = (-f5) - f2;
            r6 = new int[3];
            int i3 = this.o;
            r6[0] = i3;
            r6[1] = i3;
            r6[2] = this.p;
            paint2.setShader(new LinearGradient(MapboxConstants.MINIMUM_ZOOM, f7, MapboxConstants.MINIMUM_ZOOM, f8, r6, new float[]{MapboxConstants.MINIMUM_ZOOM, 0.5f, 1.0f}, TileMode.CLAMP));
            this.k.setAntiAlias(false);
            this.f = false;
        }
        canvas2.translate(MapboxConstants.MINIMUM_ZOOM, this.d / 2.0f);
        f = this.b;
        f2 = (-f) - this.n;
        float f9 = (f + ((float) this.h)) + (this.d / 2.0f);
        float f10 = f9 * 2.0f;
        Object obj = this.l.width() - f10 > MapboxConstants.MINIMUM_ZOOM ? 1 : null;
        Object obj2 = this.l.height() - f10 > MapboxConstants.MINIMUM_ZOOM ? 1 : null;
        int save = canvas.save();
        canvas2.translate(this.l.left + f9, this.l.top + f9);
        canvas2.drawPath(this.m, this.j);
        if (obj != null) {
            i = save;
            canvas.drawRect(MapboxConstants.MINIMUM_ZOOM, f2, this.l.width() - f10, -this.b, this.k);
        } else {
            i = save;
        }
        canvas2.restoreToCount(i);
        i = canvas.save();
        canvas2.translate(this.l.right - f9, this.l.bottom - f9);
        canvas2.rotate(180.0f);
        canvas2.drawPath(this.m, this.j);
        if (obj != null) {
            canvas.drawRect(MapboxConstants.MINIMUM_ZOOM, f2, this.l.width() - f10, (-this.b) + this.n, this.k);
        }
        canvas2.restoreToCount(i);
        int save2 = canvas.save();
        canvas2.translate(this.l.left + f9, this.l.bottom - f9);
        canvas2.rotate(270.0f);
        canvas2.drawPath(this.m, this.j);
        if (obj2 != null) {
            canvas.drawRect(MapboxConstants.MINIMUM_ZOOM, f2, this.l.height() - f10, -this.b, this.k);
        }
        canvas2.restoreToCount(save2);
        save2 = canvas.save();
        canvas2.translate(this.l.right - f9, this.l.top + f9);
        canvas2.rotate(90.0f);
        canvas2.drawPath(this.m, this.j);
        if (obj2 != null) {
            canvas.drawRect(MapboxConstants.MINIMUM_ZOOM, f2, this.l.height() - f10, -this.b, this.k);
        }
        canvas2.restoreToCount(save2);
        canvas2.translate(MapboxConstants.MINIMUM_ZOOM, (-this.d) / 2.0f);
        a.a(canvas2, this.l, this.b, this.i);
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) oo.a(this.c, this.b, this.q));
        int ceil2 = (int) Math.ceil((double) oo.b(this.c, this.b, this.q));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList = this.e;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f = true;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.e;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.i.getColor() == colorForState) {
            return false;
        }
        this.i.setColor(colorForState);
        this.f = true;
        invalidateSelf();
        return true;
    }

    public final void setAlpha(int i) {
        this.i.setAlpha(i);
        this.j.setAlpha(i);
        this.k.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.i.setColorFilter(colorFilter);
    }
}
