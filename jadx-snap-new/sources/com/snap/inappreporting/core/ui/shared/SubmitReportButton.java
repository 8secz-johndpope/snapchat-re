package com.snap.inappreporting.core.ui.shared;

import android.content.Context;
import android.util.AttributeSet;
import com.snap.ui.view.button.ScButton.Builder;
import com.snapchat.android.R;
import defpackage.akcr;
import defpackage.kod;

public final class SubmitReportButton extends kod {
    public SubmitReportButton(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
        addState(0, new Builder().setVisibility(8).disabled().buildLazy(context));
        Builder visibility = new Builder().setVisibility(0);
        Object string = context.getString(R.string.fragment_button_submit);
        String str = "context.getString(R.string.fragment_button_submit)";
        akcr.a(string, str);
        addState(3, visibility.text(string).backgroundColors(context.getResources().getColor(R.color.regular_grey), Integer.valueOf(context.getResources().getColor(R.color.regular_grey))).disabled().buildLazy(context));
        visibility = new Builder();
        Object string2 = context.getString(R.string.fragment_button_submit);
        akcr.a(string2, str);
        addState(1, visibility.text(string2).setVisibility(0).backgroundColors(context.getResources().getColor(R.color.regular_green), Integer.valueOf(context.getResources().getColor(R.color.dark_green))).buildLazy(context));
        addState(2, new Builder().text("").setVisibility(0).backgroundColors(context.getResources().getColor(R.color.regular_grey), Integer.valueOf(context.getResources().getColor(R.color.regular_grey))).spinner().disabled().buildLazy(context));
    }
}
