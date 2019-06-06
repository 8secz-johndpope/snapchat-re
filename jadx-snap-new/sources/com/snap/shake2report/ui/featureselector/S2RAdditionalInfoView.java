package com.snap.shake2report.ui.featureselector;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.akcr;
import defpackage.wwh;

public final class S2RAdditionalInfoView extends FrameLayout {
    public wwh a;

    public S2RAdditionalInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private S2RAdditionalInfoView(Context context, AttributeSet attributeSet, char c) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
    }

    public final String a() {
        wwh wwh = this.a;
        if (wwh == null) {
            akcr.a();
        }
        return wwh.b();
    }
}
