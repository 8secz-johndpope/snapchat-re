package com.snap.payments.lib.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import com.snap.ui.view.ScHeaderView;
import com.snapchat.android.R;
import defpackage.tlw;

public class CommerceTitleBar extends tlw {
    public CommerceTitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.marco_polo_nav_bar_layout, this);
    }

    /* Access modifiers changed, original: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ScHeaderView) findViewById(R.id.marco_polo_nav_bar_sc_header);
        this.c = (TextView) this.a.findViewById(R.id.marco_polo_nav_bar_right_btn_tv);
        this.b = (ImageView) findViewById(R.id.marco_polo_title_image_icon);
        d();
    }
}
