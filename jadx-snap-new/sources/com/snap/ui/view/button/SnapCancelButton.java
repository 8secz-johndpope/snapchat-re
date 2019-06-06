package com.snap.ui.view.button;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.snap.ui.view.SnapFontTextView;
import com.snapchat.android.R;
import defpackage.abrz;
import defpackage.akco;
import defpackage.akcr;

public final class SnapCancelButton extends SnapFontTextView {
    public SnapCancelButton(Context context) {
        this(context, null, 2, null);
    }

    public SnapCancelButton(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
        setTextSize(0, context.getResources().getDimension(R.dimen.alert_dialog_button_text_size));
        setTypeface(null, 1);
        abrz.a((TextView) this, 0.084f);
        setText(R.string.dialog_cancel);
        setGravity(17);
    }

    public /* synthetic */ SnapCancelButton(Context context, AttributeSet attributeSet, int i, akco akco) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }
}
