package com.snapchat.map.util;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import defpackage.acmk;
import defpackage.acmu;
import defpackage.adbd;
import defpackage.akcr;

public final class SurfaceMapAnchorView extends FrameLayout implements adbd {
    private acmu a;

    public SurfaceMapAnchorView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
    }

    public final acmu a(acmk acmk) {
        akcr.b(acmk, "delegate");
        acmu acmu = this.a;
        if (acmu != null) {
            return acmu;
        }
        Object a = acmk.c().a(getContext());
        akcr.a(a, "delegate.mapViewFactory.newMapViewHolder(context)");
        addView(a.a(), new LayoutParams(-1, -1));
        this.a = a;
        return a;
    }
}
