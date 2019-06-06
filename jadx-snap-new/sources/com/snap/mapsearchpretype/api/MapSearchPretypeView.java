package com.snap.mapsearchpretype.api;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.ackk;
import defpackage.akcr;
import defpackage.ock;

public final class MapSearchPretypeView extends ackk {
    public ock a;

    public MapSearchPretypeView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private MapSearchPretypeView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, (byte) 0);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ock ock = this.a;
        if (ock != null) {
            ock.a();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ock ock = this.a;
        if (ock != null) {
            ock.b();
        }
    }
}
