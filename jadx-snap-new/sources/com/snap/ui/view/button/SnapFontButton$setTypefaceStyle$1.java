package com.snap.ui.view.button;

import android.graphics.Typeface;
import defpackage.ajfb;

final class SnapFontButton$setTypefaceStyle$1<T> implements ajfb<Typeface> {
    final /* synthetic */ int $style;
    final /* synthetic */ SnapFontButton this$0;

    SnapFontButton$setTypefaceStyle$1(SnapFontButton snapFontButton, int i) {
        this.this$0 = snapFontButton;
        this.$style = i;
    }

    public final void accept(Typeface typeface) {
        if (this.this$0.requestedStyle == this.$style) {
            this.this$0.setTypeface(typeface);
            this.this$0.invalidate();
        }
    }
}
