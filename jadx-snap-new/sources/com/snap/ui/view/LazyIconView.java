package com.snap.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import defpackage.zhg.a;

public class LazyIconView extends View {
    private static final float ALPHA_VISIBLE = 0.01f;
    private static final String TAG = "LazyIconView";
    private int drawableId = -1;
    private boolean hasOverlappingRendering = true;
    private boolean loaded;

    public LazyIconView(Context context) {
        super(context);
        init(context, null);
    }

    public LazyIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public LazyIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            this.loaded = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.b);
            this.hasOverlappingRendering = obtainStyledAttributes.getBoolean(0, true);
            this.drawableId = obtainStyledAttributes.getResourceId(1, -1);
            obtainStyledAttributes.recycle();
            loadDrawableIfVisible();
        }
    }

    private void loadDrawableIfVisible() {
        if (this.drawableId != -1 && !this.loaded && getVisibility() == 0 && getAlpha() >= ALPHA_VISIBLE) {
            super.setBackgroundResource(this.drawableId);
            this.loaded = true;
        }
    }

    public void forceHasOverlappingRenderingFalse() {
        this.hasOverlappingRendering = false;
    }

    public boolean hasOverlappingRendering() {
        return this.hasOverlappingRendering;
    }

    public void setAlpha(float f) {
        super.setAlpha(f);
        loadDrawableIfVisible();
    }

    public void setDrawableId(int i) {
        this.drawableId = i;
        loadDrawableIfVisible();
    }

    public void setVisibility(int i) {
        if (getVisibility() != i) {
            super.setVisibility(i);
            loadDrawableIfVisible();
        }
    }
}
