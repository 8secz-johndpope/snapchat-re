package com.snap.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import defpackage.ajxw;
import defpackage.akbw;
import defpackage.akcr;

public final class KeyImeInterceptingEditText extends SnapFontEditText {
    private akbw<? super Integer, ? super KeyEvent, ajxw> onKeyImeChange;

    public KeyImeInterceptingEditText(Context context) {
        akcr.b(context, "context");
        super(context);
    }

    public KeyImeInterceptingEditText(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
    }

    public KeyImeInterceptingEditText(Context context, AttributeSet attributeSet, int i) {
        akcr.b(context, "context");
        super(context, attributeSet, i);
    }

    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        akcr.b(keyEvent, "event");
        akbw akbw = this.onKeyImeChange;
        if (akbw != null) {
            akbw.invoke(Integer.valueOf(i), keyEvent);
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public final void setKeyImeChangeListener(akbw<? super Integer, ? super KeyEvent, ajxw> akbw) {
        akcr.b(akbw, "onKeyImeChange");
        this.onKeyImeChange = akbw;
    }
}
