package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;

/* renamed from: znq */
public final class znq extends ReplacementSpan {
    private int a;
    private int b;
    private Rect c;
    private final int d;
    private final FontMetricsInt e = new FontMetricsInt();
    private final Drawable f;

    public znq(Drawable drawable, int i) {
        this.f = drawable;
        this.d = i;
        a();
    }

    private int a(FontMetricsInt fontMetricsInt) {
        int i = this.d;
        if (i == 0) {
            return fontMetricsInt.descent - this.b;
        }
        if (i != 2) {
            return -this.b;
        }
        return fontMetricsInt.ascent + (((fontMetricsInt.descent - fontMetricsInt.ascent) - this.b) / 2);
    }

    private void a() {
        this.c = this.f.getBounds();
        this.a = this.c.width();
        this.b = this.c.height();
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        paint.getFontMetricsInt(this.e);
        i4 += a(this.e);
        canvas.translate(f, (float) i4);
        this.f.draw(canvas);
        canvas.translate(-f, (float) (-i4));
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        a();
        if (fontMetricsInt == null) {
            return this.a;
        }
        int a = a(fontMetricsInt);
        int i3 = this.b + a;
        if (a < fontMetricsInt.ascent) {
            fontMetricsInt.ascent = a;
        }
        if (a < fontMetricsInt.top) {
            fontMetricsInt.top = a;
        }
        if (i3 > fontMetricsInt.descent) {
            fontMetricsInt.descent = i3;
        }
        if (i3 > fontMetricsInt.bottom) {
            fontMetricsInt.bottom = i3;
        }
        return this.a;
    }
}
