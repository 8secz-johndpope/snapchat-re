package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: abux */
public class abux extends FrameLayout {
    private final Path a;
    protected boolean b;
    protected float c;
    protected float d;
    protected float e;
    protected float f;
    protected boolean g;
    protected a h;
    private final Path i;
    private float j;

    /* renamed from: abux$a */
    public static class a {
        final RectF a;
        final RectF b;
        final float c;

        a(RectF rectF, RectF rectF2, float f) {
            this.a = rectF;
            this.b = rectF2;
            this.c = f;
        }

        public final float a() {
            return this.c;
        }
    }

    /* renamed from: abux$1 */
    class 1 extends azs {
        1() {
        }

        public final void onSpringUpdate(azt azt) {
            a aVar = abux.this.h;
            float f = (float) azt.d.a;
            float width = (aVar.a.width() / aVar.a.height()) * f;
            float centerX = aVar.a.centerX();
            float centerY = aVar.a.centerY();
            width /= 2.0f;
            f /= 2.0f;
            aVar.b.set(centerX - width, centerY - f, centerX + width, centerY + f);
            abux.this.invalidate();
        }
    }

    public abux(Context context) {
        super(context);
        this.a = new Path();
        this.b = false;
        this.i = new Path();
        this.c = MapboxConstants.MINIMUM_ZOOM;
        this.d = MapboxConstants.MINIMUM_ZOOM;
        this.e = 1.0f;
        this.j = 1.0f;
        this.g = false;
    }

    public abux(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public abux(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        this.a = new Path();
        this.b = false;
        this.i = new Path();
        this.c = MapboxConstants.MINIMUM_ZOOM;
        this.d = MapboxConstants.MINIMUM_ZOOM;
        this.e = 1.0f;
        this.j = 1.0f;
        this.g = false;
    }

    private void f() {
        this.f = (Math.min(this.c, this.d) * this.e) * this.j;
        this.a.reset();
        this.a.addCircle(this.c, this.d, this.f, Direction.CW);
    }

    public final void a() {
        this.g = true;
    }

    public final void a(float f) {
        this.j = f;
        f();
        invalidate();
    }

    public final void a(RectF rectF, float f) {
        this.b = true;
        this.h = new a(rectF, new RectF(rectF), f);
        invalidate();
    }

    public final void a(RectF rectF, float f, float f2, float f3) {
        this.b = true;
        this.h = new a(rectF, new RectF(), f);
        azt a = azx.b().a();
        a.a(new azu((double) f2, (double) f3));
        a.a(new 1());
        a.a((double) getMeasuredHeight());
        a.b((double) rectF.height());
    }

    public final void b() {
        this.g = false;
    }

    public final void c() {
        this.e = 1.0f;
    }

    public final void d() {
        this.e = 1.0f;
        this.a.reset();
        invalidate();
    }

    /* Access modifiers changed, original: protected */
    public void dispatchDraw(Canvas canvas) {
        Path path;
        if (this.b) {
            RectF rectF = this.h.b;
            float f = this.h.c;
            this.i.reset();
            this.i.addRoundRect(rectF, f, f, Direction.CW);
            path = this.i;
        } else {
            if (this.g) {
                path = this.a;
            }
            super.dispatchDraw(canvas);
        }
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        this.b = false;
        this.i.reset();
        invalidate();
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.c = (float) (i / 2);
        this.d = (float) (i2 / 2);
        if (this.g) {
            f();
        }
    }
}
