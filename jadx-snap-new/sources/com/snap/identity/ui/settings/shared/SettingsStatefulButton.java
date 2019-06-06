package com.snap.identity.ui.settings.shared;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.snap.ui.view.button.ScButton.Builder;
import com.snapchat.android.R;
import defpackage.akcr;
import defpackage.joo;

public final class SettingsStatefulButton extends joo {

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

    public SettingsStatefulButton(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
        String string = context.getString(R.string.settings_save);
        akcr.a((Object) string, "context.getString(R.string.settings_save)");
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, defpackage.iqb.a.a, 0, 0);
            if (obtainStyledAttributes.hasValue(0)) {
                String string2 = obtainStyledAttributes.getString(0);
                akcr.a((Object) string2, "typedArray.getString(R.s…tatefulButton_buttonText)");
                string = string2;
            }
        }
        addState(0, new Builder().text(string).setVisibility(0).backgroundColors(context.getResources().getColor(R.color.regular_green), Integer.valueOf(context.getResources().getColor(R.color.dark_green))).rectangular().buildLazy(context));
        addState(1, new Builder().setVisibility(0).backgroundColors(context.getResources().getColor(R.color.regular_grey), null).spinner().disabled().rectangular().buildLazy(context));
        addState(2, new Builder().text("").setVisibility(8).backgroundColors(context.getResources().getColor(R.color.white), null).disabled().rectangular().buildLazy(context));
    }
}
