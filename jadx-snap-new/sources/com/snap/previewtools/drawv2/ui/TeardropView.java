package com.snap.previewtools.drawv2.ui;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.snapchat.android.R;
import defpackage.akcr;

public final class TeardropView extends ConstraintLayout {
    public final float d = (((float) getResources().getDimensionPixelSize(R.dimen.color_picker_v2_tracker_width)) / 2.0f);
    public final float e = (((float) getResources().getDimensionPixelSize(R.dimen.color_picker_v2_tracker_height)) - (((float) getResources().getDimensionPixelSize(R.dimen.color_picker_v2_tracker_dot_size)) / 2.0f));
    private ImageView f;
    private ImageView g;
    private ImageView h;
    private int i;

    public TeardropView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        akcr.b(attributeSet, "attrs");
        super(context, attributeSet);
    }

    private static GradientDrawable c() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        return gradientDrawable;
    }

    public final void a(int i) {
        this.i = i;
        ImageView imageView = this.f;
        String str = "mLargeCircleView";
        if (imageView == null) {
            akcr.a(str);
        }
        GradientDrawable gradientDrawable = (GradientDrawable) imageView.getDrawable();
        if (gradientDrawable == null) {
            gradientDrawable = c();
        }
        gradientDrawable.setColor(i);
        ImageView imageView2 = this.f;
        if (imageView2 == null) {
            akcr.a(str);
        }
        imageView2.setImageDrawable(gradientDrawable);
        imageView = this.g;
        str = "mSmallCircleView";
        if (imageView == null) {
            akcr.a(str);
        }
        gradientDrawable = (GradientDrawable) imageView.getDrawable();
        if (gradientDrawable == null) {
            gradientDrawable = c();
        }
        gradientDrawable.setColor(i);
        ImageView imageView3 = this.g;
        if (imageView3 == null) {
            akcr.a(str);
        }
        imageView3.setImageDrawable(gradientDrawable);
    }

    public final float b() {
        return getResources().getDimension(R.dimen.color_picker_v2_tracker_small_circle_size);
    }

    public final boolean hasOverlappingRendering() {
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        Object findViewById = findViewById(R.id.color_picker_v2_tracker_circle_large);
        akcr.a(findViewById, "findViewById(R.id.color_…_v2_tracker_circle_large)");
        this.f = (ImageView) findViewById;
        findViewById = findViewById(R.id.color_picker_v2_tracker_circle_small);
        akcr.a(findViewById, "findViewById(R.id.color_…_v2_tracker_circle_small)");
        this.g = (ImageView) findViewById;
        findViewById = findViewById(R.id.color_picker_v2_tracker_droplet_background);
        akcr.a(findViewById, "findViewById(R.id.color_…acker_droplet_background)");
        this.h = (ImageView) findViewById;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != 0) {
            setPivotX(((float) getResources().getDimensionPixelSize(R.dimen.color_picker_v2_tracker_width)) / 2.0f);
            setPivotY(this.e);
        }
    }
}
