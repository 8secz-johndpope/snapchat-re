package com.snap.messaging.chat.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import defpackage.akcr;

public final class BackButtonInterceptingLinearLayout extends LinearLayout {
    public a a;

    public interface a {
        boolean c();
    }

    public BackButtonInterceptingLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private BackButtonInterceptingLinearLayout(Context context, AttributeSet attributeSet, char c) {
        akcr.b(context, "context");
        akcr.b(attributeSet, "attrs");
        super(context, attributeSet, 0);
    }

    private final boolean a(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            a aVar = this.a;
            if (aVar != null ? aVar.c() : false) {
                return true;
            }
        }
        return false;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        akcr.b(keyEvent, "event");
        return a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        akcr.b(keyEvent, "event");
        return a(keyEvent) || super.dispatchKeyEventPreIme(keyEvent);
    }
}
