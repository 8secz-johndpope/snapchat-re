package com.snap.ui.view;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.ArcShape;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.abpf;
import defpackage.zhg.a;

public class PieTimerView extends AppCompatImageView {
    private static final int DAY_IN_MILLIS = 86400000;
    private static final int DEGREE_SLICE = 15;
    private static final int HOURS_IN_DAY = 24;
    private static final int OFFSET_DEGREES = 270;
    private static final int TOTAL_DEGREES = 360;
    private ShapeDrawable shapeDrawable = new ShapeDrawable();

    public PieTimerView(Context context) {
        super(context);
    }

    public PieTimerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public PieTimerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }

    private float getPercentElapsed(long j, long j2) {
        return abpf.a(((float) (System.currentTimeMillis() - j)) / ((float) j2), (float) MapboxConstants.MINIMUM_ZOOM, 1.0f);
    }

    private void setShape(float f) {
        int round = Math.round(f * 24.0f);
        if (round == 24) {
            round--;
        }
        round *= 15;
        this.shapeDrawable.setShape(new ArcShape((float) ((round - 360) + OFFSET_DEGREES), (float) (360 - round)));
    }

    private void updateSize() {
        this.shapeDrawable.setIntrinsicWidth(getLayoutParams().width);
        this.shapeDrawable.setIntrinsicHeight(getLayoutParams().height);
    }

    public void init(Context context, AttributeSet attributeSet) {
        this.shapeDrawable.getPaint().setColor(context.getTheme().obtainStyledAttributes(attributeSet, a.e, 0, 0).getColor(0, getResources().getColor(R.color.black)));
        setImageDrawable(this.shapeDrawable);
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        if (MeasureSpec.getMode(i) == Integer.MIN_VALUE || MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("wrap_context is not a valid width_layout or height_layout argument");
        }
        super.onMeasure(0, 0);
        updateSize();
    }

    public void setLayoutParams(LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        updateSize();
    }

    public void setTime(long j) {
        setShape(getPercentElapsed(j, 86400000));
    }

    public void setTime(long j, long j2) {
        setShape(getPercentElapsed(j, j2));
    }
}
