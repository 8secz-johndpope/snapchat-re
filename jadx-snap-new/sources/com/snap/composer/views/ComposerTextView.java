package com.snap.composer.views;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils.TruncateAt;
import android.view.View.MeasureSpec;
import com.snap.ui.view.SnapFontTextView;
import defpackage.ajej;
import defpackage.akcr;

public final class ComposerTextView extends SnapFontTextView implements ComposerRecyclableView {
    private ajej b;

    public ComposerTextView(Context context) {
        akcr.b(context, "context");
        super(context);
        setMaxLines(1);
        setEllipsize(TruncateAt.END);
        setIncludeFontPadding(false);
        setTextDirection(5);
    }

    public final void draw(Canvas canvas) {
        if (this.b == null) {
            super.draw(canvas);
        }
    }

    public final ajej getFontLoadDisposable() {
        return this.b;
    }

    public final void onMeasure(int i, int i2) {
        CharSequence text = getText();
        Object obj = (text == null || text.length() == 0) ? 1 : null;
        if (obj != null) {
            i2 = MeasureSpec.makeMeasureSpec(0, AudioPlayer.INFINITY_LOOP_COUNT);
        }
        super.onMeasure(i, i2);
    }

    public final boolean prepareForRecycling() {
        return true;
    }

    public final void setFontLoadDisposable(ajej ajej) {
        this.b = ajej;
    }
}
