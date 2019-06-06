package com.snap.messaging.createchat.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.snap.ui.view.RowSettingLayout;
import defpackage.akcr;
import java.util.ArrayList;
import java.util.List;

public final class CreateChatRecipientBarView extends RowSettingLayout {
    private final LayoutInflater a;
    private List<String> b;

    public CreateChatRecipientBarView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private CreateChatRecipientBarView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        this.b = new ArrayList();
        Object from = LayoutInflater.from(context);
        akcr.a(from, "LayoutInflater.from(context)");
        this.a = from;
    }
}
