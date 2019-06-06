package com.snap.composer.views;

import android.content.Context;
import com.snap.ui.view.LoadingSpinnerView;
import defpackage.akcr;

public final class ComposerSpinnerView extends LoadingSpinnerView implements ComposerRecyclableView {
    private int a = -1;

    public ComposerSpinnerView(Context context) {
        akcr.b(context, "context");
        super(context);
        setColor(this.a);
    }

    public final int getSpinnerColor() {
        return this.a;
    }

    public final boolean prepareForRecycling() {
        return true;
    }

    public final void setSpinnerColor(int i) {
        this.a = i;
        setColor(i);
    }
}
