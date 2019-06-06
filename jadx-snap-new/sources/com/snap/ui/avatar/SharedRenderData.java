package com.snap.ui.avatar;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.akcr;

public final class SharedRenderData {
    private int avatarPadding;
    private final Context context;
    private int currentSize;
    private State currentState = State.NO_STORY;
    private boolean currentlyHasActiveTyping;
    private final int defaultImagePadding = this.resources.getDimensionPixelSize(R.dimen.feed_list_image_padding);
    private final RectF drawRectF = new RectF();
    private boolean ignoreMemoryOptimization;
    private int imagePadding;
    private int imagePaddingBottom;
    private final Resources resources;

    public SharedRenderData(Context context) {
        akcr.b(context, "context");
        this.context = context;
        Object resources = this.context.getResources();
        akcr.a(resources, "context.resources");
        this.resources = resources;
    }

    public final int avatarPadding() {
        return this.avatarPadding;
    }

    public final Context getContext() {
        return this.context;
    }

    public final int getCurrentSize() {
        return this.currentSize;
    }

    public final State getCurrentState() {
        return this.currentState;
    }

    public final boolean getCurrentlyHasActiveTyping() {
        return this.currentlyHasActiveTyping;
    }

    public final int getDefaultImagePadding() {
        return this.defaultImagePadding;
    }

    public final RectF getDrawRectF() {
        return this.drawRectF;
    }

    public final Resources getResources() {
        return this.resources;
    }

    public final boolean ignoreMemoryOptimization() {
        return this.ignoreMemoryOptimization;
    }

    public final int imagePadding() {
        return this.imagePadding;
    }

    public final int imagePaddingBottom() {
        return this.imagePaddingBottom;
    }

    public final boolean onMeasure(float f, float f2) {
        if (this.drawRectF.right == f && this.drawRectF.bottom == f2) {
            return false;
        }
        this.drawRectF.set(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, f, f2);
        return true;
    }

    public final void setAttributes(TypedArray typedArray) {
        akcr.b(typedArray, "customAttrs");
        this.avatarPadding = typedArray.getDimensionPixelSize(0, this.resources.getDimensionPixelSize(R.dimen.feed_list_avatar_padding));
        this.imagePadding = typedArray.getDimensionPixelSize(4, this.defaultImagePadding);
        this.imagePaddingBottom = typedArray.getDimensionPixelSize(5, this.imagePadding);
        this.ignoreMemoryOptimization = typedArray.getBoolean(3, false);
    }

    public final void setCurrentSize(int i) {
        this.currentSize = i;
    }

    public final void setCurrentState(State state) {
        akcr.b(state, "<set-?>");
        this.currentState = state;
    }

    public final void setCurrentlyHasActiveTyping(boolean z) {
        this.currentlyHasActiveTyping = z;
    }
}
