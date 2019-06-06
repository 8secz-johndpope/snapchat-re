package com.snap.bitmoji.ui.settings.view;

import android.content.Context;
import android.util.AttributeSet;
import com.snap.ui.view.StatefulView;
import com.snap.ui.view.button.ScButton.Builder;
import com.snapchat.android.R;
import defpackage.akcr;

public final class SaveBitmojiSelfieButton extends StatefulView {

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

    public SaveBitmojiSelfieButton(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
        Builder builder = new Builder();
        Object string = context.getString(R.string.bitmoji_done);
        akcr.a(string, "context.getString(com.sn…ji.R.string.bitmoji_done)");
        addState(0, builder.text(string).backgroundColors(context.getResources().getColor(R.color.regular_green), null).buildLazy(context));
        addState(1, new Builder().spinner().backgroundColors(context.getResources().getColor(R.color.regular_green), null).disabled().buildLazy(context));
    }
}
