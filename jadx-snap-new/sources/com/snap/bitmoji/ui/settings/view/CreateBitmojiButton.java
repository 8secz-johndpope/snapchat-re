package com.snap.bitmoji.ui.settings.view;

import android.content.Context;
import android.util.AttributeSet;
import com.snap.ui.view.StatefulView;
import com.snap.ui.view.button.ScButton.Builder;
import com.snapchat.android.R;
import defpackage.akcr;

public final class CreateBitmojiButton extends StatefulView {
    private final int a = R.color.regular_blue;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public CreateBitmojiButton(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
        Builder builder = new Builder();
        Object string = context.getString(R.string.bitmoji_create);
        akcr.a(string, "context.getString(com.sn….R.string.bitmoji_create)");
        addState(0, builder.text(string).backgroundColors(context.getResources().getColor(R.color.regular_blue), null).buildLazy(context));
        addState(1, new Builder().spinner().backgroundColors(context.getResources().getColor(R.color.regular_blue), null).disabled().buildLazy(context));
    }
}
