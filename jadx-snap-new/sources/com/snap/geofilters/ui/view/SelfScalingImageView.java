package com.snap.geofilters.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView.ScaleType;
import com.snap.imageloading.view.SnapImageView;
import defpackage.akcr;
import defpackage.ikz;

public final class SelfScalingImageView extends SnapImageView {
    public ikz a;

    public SelfScalingImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private SelfScalingImageView(Context context, AttributeSet attributeSet, char c) {
        akcr.b(context, "context");
        super(context, attributeSet, 0, null, 8, null);
        this.a = new ikz(this);
    }

    public final void setScaleType(ScaleType scaleType) {
        akcr.b(scaleType, "scaleType");
        super.setScaleType(scaleType);
        ikz ikz = this.a;
        if (ikz != null) {
            ikz.a(ikz.a, ikz.b, ikz.c);
        }
    }
}
