package com.snap.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;
import com.snapchat.android.R;
import defpackage.zhg.a;
import defpackage.zjy;

public class LoadingSpinnerView extends View {
    zjy loadingDrawable;

    public LoadingSpinnerView(Context context) {
        this(context, null);
    }

    public LoadingSpinnerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.d);
        this.loadingDrawable = new zjy(context);
        setBackground(this.loadingDrawable);
        this.loadingDrawable.a(obtainStyledAttributes.getColor(0, ContextCompat.getColor(context, R.color.light_charcoal)));
        obtainStyledAttributes.recycle();
    }

    private void updateDrawablePlayState() {
        if (this.loadingDrawable != null) {
            zjy zjy;
            if (isShown() && isAttachedToWindow()) {
                zjy = this.loadingDrawable;
                if (!zjy.a) {
                    zjy.a = true;
                    zjy.run();
                }
                return;
            }
            zjy = this.loadingDrawable;
            if (zjy.a) {
                zjy.a = false;
                zjy.unscheduleSelf(zjy);
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateDrawablePlayState();
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        updateDrawablePlayState();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        updateDrawablePlayState();
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.loadingDrawable.setBounds(0, 0, i, i2);
    }

    /* Access modifiers changed, original: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        updateDrawablePlayState();
    }

    public void setColor(int i) {
        this.loadingDrawable.a(i);
    }
}
