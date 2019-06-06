package com.snap.stickers.ui.views.meta;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.akcr;

public final class MetaStickerView extends FrameLayout {
    public MetaStickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private MetaStickerView(Context context, AttributeSet attributeSet, char c) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
    }
}
