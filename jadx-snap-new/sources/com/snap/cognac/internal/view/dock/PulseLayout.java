package com.snap.cognac.internal.view.dock;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.snapchat.android.R;
import defpackage.ezg.a;

public class PulseLayout extends RelativeLayout {
    public int a;
    public int b;
    public float c;
    public int d;
    public final AnimatorSet e = new AnimatorSet();
    public final Context f;

    public PulseLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = context;
        if (!isInEditMode()) {
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.a);
                this.a = obtainStyledAttributes.getColor(1, getResources().getColor(R.color.bitmoji_regular_green));
                this.b = obtainStyledAttributes.getColor(0, getResources().getColor(R.color.bitmoji_regular_green_forty_opacity));
                this.c = obtainStyledAttributes.getFloat(2, 2.0f);
                this.d = context.getResources().getDimensionPixelSize(R.dimen.cognac_dock_item_thumbnail_size_normal);
                obtainStyledAttributes.recycle();
                return;
            }
            throw new IllegalArgumentException("An attribute set is required for this view");
        }
    }
}
