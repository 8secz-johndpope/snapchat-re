package com.snap.ui.view.emoji;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView.BufferType;
import com.snap.ui.view.SnapFontTextView;
import defpackage.idl;
import defpackage.zgw;

public class SnapEmojiTextView extends SnapFontTextView {
    idl attribution;
    private SnapEmojiSpanFactory spanFactory;

    public SnapEmojiTextView(Context context) {
        super(context);
    }

    public SnapEmojiTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SnapEmojiTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private void initIfNeeded() {
        if (this.spanFactory == null) {
            this.spanFactory = (SnapEmojiSpanFactory) zgw.b.b();
        }
    }

    public void recycle() {
        setText(null);
    }

    public void setAttribution(idl idl) {
        this.attribution = idl;
    }

    public void setText(CharSequence charSequence, BufferType bufferType) {
        initIfNeeded();
        CharSequence text = getText();
        if (!TextUtils.isEmpty(text)) {
            this.spanFactory.clear(text);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            charSequence = this.spanFactory.convert(charSequence, getTextSize(), 1.1f);
        }
        super.setText(charSequence, bufferType);
    }
}
