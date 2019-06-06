package com.snap.identity.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.snap.ui.view.StatefulView;
import com.snap.ui.view.button.ScButton.Builder;
import com.snapchat.android.R;
import defpackage.akcr;

public final class LogInButton extends StatefulView {

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

    public LogInButton(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
        Builder builder = new Builder();
        Object string = context.getString(R.string.log_in_button_text);
        String str = "context.getString(R.string.log_in_button_text)";
        akcr.a(string, str);
        addState(0, builder.text(string).backgroundColors(context.getResources().getColor(R.color.dark_grey), null).disabled().buildLazy(context));
        builder = new Builder();
        Object string2 = context.getString(R.string.log_in_button_text);
        akcr.a(string2, str);
        addState(1, builder.text(string2).buildLazy(context));
        builder = new Builder();
        string2 = context.getString(R.string.logging_in_button_text);
        akcr.a(string2, "context.getString(R.string.logging_in_button_text)");
        addState(2, builder.text(string2).spinner().backgroundColors(context.getResources().getColor(R.color.dark_grey), null).disabled().buildLazy(context));
    }
}
