package com.snapchat.android.framework.ui.actionmenu;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import com.snapchat.android.R;
import com.snapchat.android.framework.ui.views.LoadingSpinnerView;
import defpackage.abtr;
import defpackage.abtt;
import defpackage.abtu;

public class ActionMenuOptionView extends abtu {
    private final int a;
    private final int b;
    private final int c;
    private ImageView d;
    private TextView e;
    private LoadingSpinnerView f;

    public ActionMenuOptionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private ActionMenuOptionView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        this.a = R.id.action_menu_option_icon;
        this.b = R.id.action_menu_option_text;
        this.c = R.id.action_menu_option_spinner;
    }

    public final void a(abtt abtt) {
        abtr abtr = (abtr) abtt;
        boolean z = abtr.c;
        int i = 0;
        if (abtr.b()) {
            this.d.setImageDrawable(getResources().getDrawable(abtr.a.intValue()));
            this.d.setVisibility(z ? 8 : 0);
        } else {
            this.d.setVisibility(8);
        }
        this.e.setText(getResources().getString(abtr.b));
        LoadingSpinnerView loadingSpinnerView = this.f;
        if (loadingSpinnerView != null) {
            if (!z) {
                i = 8;
            }
            loadingSpinnerView.setVisibility(i);
        }
        float f = abtr.e() ? 1.0f : 0.6f;
        this.d.setAlpha(f);
        this.e.setAlpha(f);
        setBackgroundResource(abtr.e() ? R.drawable.action_menu_option_background : R.drawable.action_menu_option_disabled_background);
    }

    /* Access modifiers changed, original: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.d = (ImageView) findViewById(R.id.action_menu_option_icon);
        this.e = (TextView) findViewById(R.id.action_menu_option_text);
        this.f = (LoadingSpinnerView) findViewById(R.id.action_menu_option_spinner);
    }
}
