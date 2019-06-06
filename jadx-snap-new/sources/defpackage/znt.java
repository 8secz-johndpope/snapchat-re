package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: znt */
public final class znt extends MetricAffectingSpan {
    private final Typeface a;

    public znt(Context context, int i) {
        akcr.b(context, "context");
        Object a = zki.a(context, i);
        akcr.a(a, "SnapTypefaceLoader.getTy…eFromStyle(context, font)");
        this(a);
    }

    public znt(Typeface typeface) {
        akcr.b(typeface, "family");
        this.a = typeface;
    }

    private static void a(Paint paint, Typeface typeface) {
        Typeface typeface2 = paint.getTypeface();
        int style = (typeface2 != null ? typeface2.getStyle() : 0) & (typeface.getStyle() ^ -1);
        if ((style & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((style & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(typeface);
    }

    public final void updateDrawState(TextPaint textPaint) {
        akcr.b(textPaint, "ds");
        znt.a(textPaint, this.a);
    }

    public final void updateMeasureState(TextPaint textPaint) {
        akcr.b(textPaint, "paint");
        znt.a(textPaint, this.a);
    }
}
