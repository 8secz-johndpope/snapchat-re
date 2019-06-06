package com.snap.messaging.friendsfeed.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView.BufferType;
import com.snap.ui.view.SnapFontTextView;
import defpackage.akcr;
import defpackage.iho;

public final class SnapFontToggleTextView extends SnapFontTextView {
    private boolean b;

    public SnapFontToggleTextView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        akcr.b(attributeSet, "attrs");
        super(context, attributeSet);
    }

    public final void onOnDrawIndexOutOfBounds(IndexOutOfBoundsException indexOutOfBoundsException) {
        akcr.b(indexOutOfBoundsException, "e");
        if (this.b) {
            super.onOnDrawIndexOutOfBounds(indexOutOfBoundsException);
            return;
        }
        this.b = true;
        Object resources = getResources();
        akcr.a(resources, "resources");
        int i = (int) (resources.getDisplayMetrics().density * 25.0f);
        if (getLayoutDirection() == 0) {
            iho.b((View) this, i);
        } else {
            iho.d(this, i);
        }
        setText(getText().toString());
    }

    public final void setText(CharSequence charSequence, BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.b = false;
    }
}
