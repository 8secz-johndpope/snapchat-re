package com.snapchat.android.framework.ui.actionmenu;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.snapchat.android.R;
import defpackage.abtq;
import defpackage.abtt;
import defpackage.abtu;

public class ActionMenuDescriptionView extends abtu {
    private TextView a;

    public ActionMenuDescriptionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private ActionMenuDescriptionView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
    }

    public final void a(abtt abtt) {
        abtq abtq = (abtq) abtt;
        String[] strArr = abtq.a;
        Object obj = (strArr == null || strArr.length == 0) ? 1 : null;
        if (obj == null) {
            this.a.setText(abtq.a[0]);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.action_menu_option_text);
    }
}
