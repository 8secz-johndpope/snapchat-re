package com.snap.messaging.createchat.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import com.snap.ui.view.SnapFontEditText;
import defpackage.akcr;

public final class RecipientBarEditText extends SnapFontEditText {
    public RecipientBarEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private RecipientBarEditText(Context context, AttributeSet attributeSet, char c) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        setHorizontallyScrolling(false);
    }
}
