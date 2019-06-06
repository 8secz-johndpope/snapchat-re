package com.snap.lenses.camera.confidential;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import defpackage.akcr;
import defpackage.lwk;
import defpackage.lwk.a;
import defpackage.lwk.a.b;

public final class DefaultConfidentialLabelView extends TextView implements lwk {
    public DefaultConfidentialLabelView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private DefaultConfidentialLabelView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
    }

    public final /* synthetic */ void accept(Object obj) {
        a aVar = (a) obj;
        akcr.b(aVar, "viewModel");
        if (aVar instanceof b) {
            setText(((b) aVar).a.a);
            setVisibility(0);
            return;
        }
        if (aVar instanceof a.a) {
            setVisibility(8);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        setVisibility(8);
    }
}
