package com.snap.composer.attributes.impl.richtext;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import defpackage.akcr;

public final class CustomTypefaceSpan extends MetricAffectingSpan {
    private final Typeface a;

    public CustomTypefaceSpan(Typeface typeface) {
        akcr.b(typeface, "typeface");
        this.a = typeface;
    }

    public final Typeface getTypeface() {
        return this.a;
    }

    public final void updateDrawState(TextPaint textPaint) {
        akcr.b(textPaint, "tp");
        textPaint.setTypeface(this.a);
    }

    public final void updateMeasureState(TextPaint textPaint) {
        akcr.b(textPaint, "tp");
        textPaint.setTypeface(this.a);
    }
}
