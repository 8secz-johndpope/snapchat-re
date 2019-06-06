package com.snap.previewtools.shared.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.ukq.a;

public class CarouselRecyclerView extends RecyclerView {
    private final Context a;
    private boolean b;

    public CarouselRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private CarouselRecyclerView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        this.a = context;
    }

    public final void a(boolean z) {
        this.b = z;
    }

    /* Access modifiers changed, original: protected */
    public float getLeftFadingEdgeStrength() {
        return (this.b && a.f()) ? MapboxConstants.MINIMUM_ZOOM : super.getLeftFadingEdgeStrength();
    }

    /* Access modifiers changed, original: protected */
    public float getRightFadingEdgeStrength() {
        return (!this.b || a.f()) ? super.getRightFadingEdgeStrength() : MapboxConstants.MINIMUM_ZOOM;
    }
}
