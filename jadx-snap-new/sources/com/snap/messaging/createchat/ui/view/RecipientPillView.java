package com.snap.messaging.createchat.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import defpackage.akcr;

public final class RecipientPillView extends TextView {
    public boolean a;
    public String b;

    public RecipientPillView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private RecipientPillView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        this.b = "";
    }
}
