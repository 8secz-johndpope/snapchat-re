package defpackage;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.RectF;
import android.view.View;
import android.view.View.MeasureSpec;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.siw.c;

/* renamed from: tar */
public final class tar extends View implements tat {
    public siw a;
    private final RectF b = new RectF();
    private final RectF c = new RectF();
    private final RectF d = new RectF();
    private float e;
    private float f;
    private float g;
    private float h;
    private float i = ((float) abso.a(7.0f, getContext()));
    private float j;
    private float k;
    private Canvas l;
    private c m;
    private Paint n;
    private Paint o;
    private Paint p;
    private Paint q;
    private float r = 1.0f;
    private float s = 1.0f;
    private float t = 1.0f;

    public tar(Context context) {
        super(context);
        float a = (float) abso.a(3.0f, getContext());
        this.e = (float) abso.a(9.0f, getContext());
        float f = this.e;
        this.j = f;
        this.h = f - (this.i / 2.0f);
        this.k = this.h;
        this.f = (float) abso.a(6.5f, getContext());
        this.g = (float) abso.a(4.0f, getContext());
        this.q = new Paint(1);
        this.q.setStrokeWidth(this.i);
        this.q.setColor(getResources().getColor(R.color.black_sixty_opacity));
        this.n = new Paint(1);
        this.n.setColor(-1);
        this.n.setStrokeWidth(a);
        this.n.setStyle(Style.STROKE);
        this.o = new Paint(1);
        this.o.setColor(getResources().getColor(R.color.white_fifty_opacity));
        this.o.setStyle(Style.FILL);
        this.p = new Paint(1);
        int ceil = (int) Math.ceil((double) ((this.f + this.i) * 2.0f));
        setMinimumWidth(ceil);
        setMinimumHeight(ceil);
    }

    private void a(int i, int i2) {
        c cVar = this.m;
        if (cVar == null || cVar.c().getWidth() != i || this.m.c().getHeight() != i2) {
            a();
            this.m = this.a.a(i, i2, Config.ARGB_8888);
            this.l = new Canvas(this.m.c());
        }
    }

    public final void a() {
        c cVar = this.m;
        if (cVar != null) {
            cVar.b();
            this.m = null;
        }
    }

    public final void a(float f) {
        this.t = f;
        postInvalidate();
    }

    public final void a(long j, float f) {
        this.s = f;
        postInvalidate();
    }

    public final void a(boolean z) {
        this.n.setAlpha(z ? 255 : 0);
        postInvalidate();
    }

    public final void b(boolean z) {
        this.p.setAlpha(z ? 255 : 0);
        postInvalidate();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    public final void onDraw(Canvas canvas) {
        if (!isInEditMode()) {
            a(canvas.getWidth(), canvas.getHeight());
            if (!(getHeight() == 0 || getWidth() == 0)) {
                this.l.drawColor(0, Mode.CLEAR);
                this.q.setStyle(Style.STROKE);
                canvas.drawCircle(this.b.centerX(), this.b.centerY(), this.j, this.q);
                this.q.setStyle(Style.FILL);
                this.l.drawCircle(this.b.centerX(), this.b.centerY(), this.k, this.q);
                int i = (int) (this.t * 360.0f);
                canvas.drawArc(this.c, (float) (270 - i), (float) i, false, this.n);
                i = (int) (this.s * 360.0f);
                this.l.drawArc(this.d, (float) (270 - i), (float) i, true, this.o);
                canvas.drawBitmap(this.m.c(), MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, this.p);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        if (mode == 0 && mode2 == 0) {
            i = (int) Math.ceil((double) ((this.f + this.i) * 2.0f));
            setMeasuredDimension(i, i);
        } else if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            mode = (int) Math.ceil((double) ((this.f + this.i) * 2.0f));
            setMeasuredDimension(Math.min(mode, MeasureSpec.getSize(i)), Math.min(mode, MeasureSpec.getSize(i2)));
        } else {
            super.onMeasure(i, i2);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (!isInEditMode()) {
            super.onSizeChanged(i, i2, i3, i4);
            if (!(i == 0 || i2 == 0)) {
                a(i, i2);
                this.b.set(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, (float) i, (float) i2);
                float f = this.r;
                float f2 = f * 2.0f;
                float f3 = this.f;
                f = (float) ((int) Math.ceil(Math.sqrt((double) (((f2 * f3) * f) * f3))));
                this.c.set(this.b.centerX() - f, this.b.centerY() - f, this.b.centerX() + f, f + this.b.centerY());
                f = this.r;
                float f4 = 2.0f * f;
                f2 = this.g;
                f = (float) ((int) Math.ceil(Math.sqrt((double) (((f4 * f2) * f) * f2))));
                this.d.set(this.b.centerX() - f, this.b.centerY() - f, this.b.centerX() + f, f + this.b.centerY());
            }
        }
    }
}
