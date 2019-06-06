package com.snap.composer.views;

import android.content.Context;
import android.widget.Button;
import defpackage.akcr;

public final class ComposerButton extends Button implements ComposerRecyclableView {
    public ComposerButton(Context context) {
        akcr.b(context, "context");
        super(context);
        setIncludeFontPadding(false);
        setPadding(0, 0, 0, 0);
    }

    public final boolean prepareForRecycling() {
        return true;
    }
}
