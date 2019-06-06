package com.snap.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ImageView;

public class OptimizedImageView extends ImageView {
    private boolean mConsumeNextRequestLayout = false;
    private boolean mIsExactlyMeasured;

    public OptimizedImageView(Context context) {
        super(context);
    }

    public OptimizedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OptimizedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        boolean z = MeasureSpec.getMode(i) == AudioPlayer.INFINITY_LOOP_COUNT && MeasureSpec.getMode(i2) == AudioPlayer.INFINITY_LOOP_COUNT;
        this.mIsExactlyMeasured = z;
        super.onMeasure(i, i2);
    }

    public void requestLayout() {
        if (!this.mConsumeNextRequestLayout) {
            super.requestLayout();
        }
        this.mConsumeNextRequestLayout = false;
    }

    public void setImageBitmap(Bitmap bitmap) {
        if (this.mIsExactlyMeasured) {
            this.mConsumeNextRequestLayout = true;
        }
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        if (this.mIsExactlyMeasured) {
            this.mConsumeNextRequestLayout = true;
        }
        super.setImageDrawable(drawable);
    }

    public void setImageURI(Uri uri) {
        if (this.mIsExactlyMeasured) {
            this.mConsumeNextRequestLayout = true;
        }
        super.setImageURI(uri);
    }
}
