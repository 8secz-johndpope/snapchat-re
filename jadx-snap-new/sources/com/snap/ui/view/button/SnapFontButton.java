package com.snap.ui.view.button;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.TextView.BufferType;
import defpackage.abnl;
import defpackage.abrz;
import defpackage.ajdw;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.akcr;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zgu;
import defpackage.zgw;
import defpackage.zki;

public final class SnapFontButton extends Button {
    private int requestedStyle;
    private ajej typefaceLoadRequest;

    public SnapFontButton(Context context) {
        akcr.b(context, "context");
        super(context, null, 0);
    }

    public SnapFontButton(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        akcr.b(attributeSet, "attrs");
        super(context, attributeSet, 0);
    }

    public SnapFontButton(Context context, AttributeSet attributeSet, int i) {
        akcr.b(context, "context");
        akcr.b(attributeSet, "attrs");
        if (abnl.r) {
            i = 0;
        }
        super(context, attributeSet, i);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ajej ajej = this.typefaceLoadRequest;
        if (ajej != null) {
            ajej.dispose();
        }
    }

    public final void setText(CharSequence charSequence, BufferType bufferType) {
        akcr.b(charSequence, "text");
        akcr.b(bufferType, "type");
        super.setText(charSequence, abrz.a(bufferType));
    }

    public final void setTypeface(Typeface typeface) {
        super.setTypeface(typeface);
    }

    public final void setTypeface(Typeface typeface, int i) {
        setTypefaceStyle(i);
    }

    public final void setTypefaceStyle(int i) {
        ajej ajej = this.typefaceLoadRequest;
        if (ajej != null) {
            ajej.dispose();
        }
        if (zki.a(i) || (akcr.a(Looper.getMainLooper(), Looper.myLooper()) ^ 1) != 0) {
            super.setTypeface(zki.a(getContext(), i));
            return;
        }
        this.requestedStyle = i;
        invalidate();
        zgw.a();
        zfw a = zgb.a(zgu.a.callsite("typeface"));
        this.typefaceLoadRequest = zki.a(getContext(), i, (ajdw) a.f()).a((ajdw) a.l()).a((ajfb) new SnapFontButton$setTypefaceStyle$1(this, i), (ajfb) SnapFontButton$setTypefaceStyle$2.INSTANCE);
    }
}
