package com.snap.ui.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.zhg.a;

public class ShadowTextView extends SnapFontTextView {
    private static final int DEFAULT_COLOR = -16777216;
    private static final int MAX_SHADOW_PIXEL_RADIUS = 25;
    private static final String TAG = "ShadowTextView";

    public ShadowTextView(Context context) {
        super(context);
    }

    public ShadowTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initFromAttributes(context, attributeSet);
    }

    public ShadowTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initFromAttributes(context, attributeSet);
    }

    private void initFromAttributes(Context context, AttributeSet attributeSet) {
        if (!isInEditMode()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.l);
            float dimension = obtainStyledAttributes.getDimension(3, MapboxConstants.MINIMUM_ZOOM);
            float dimension2 = obtainStyledAttributes.getDimension(1, MapboxConstants.MINIMUM_ZOOM);
            float dimension3 = obtainStyledAttributes.getDimension(2, MapboxConstants.MINIMUM_ZOOM);
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
            if (colorStateList != null) {
                if (dimension > 25.0f) {
                    dimension = 25.0f;
                }
                setShadowLayer(dimension, dimension2, dimension3, colorStateList.getColorForState(new int[]{16842910}, -16777216));
            } else {
                getPaint().clearShadowLayer();
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setupShadowAttributes(float f, int i) {
        setShadowLayer(f, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, i);
    }
}
