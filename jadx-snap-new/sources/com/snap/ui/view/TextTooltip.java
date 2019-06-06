package com.snap.ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.snapchat.android.R;
import com.snapchat.android.framework.ui.views.Tooltip;
import com.snapchat.android.framework.ui.views.TriangleView;

public class TextTooltip extends Tooltip {
    private final TriangleView bottomTriangleView;
    private final TextView textView;
    private final TriangleView topTriangleView;

    public TextTooltip(Context context) {
        this(context, null);
    }

    public TextTooltip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextTooltip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initialize(context);
        this.textView = (TextView) findViewById(R.id.tooltip_text);
        this.topTriangleView = (TriangleView) this.mTopTriangle;
        this.bottomTriangleView = (TriangleView) this.mBottomTriangle;
    }

    private void initialize(Context context) {
        View.inflate(context, R.layout.text_tooltip_layout, this);
        Resources resources = context.getResources();
        initialize(R.id.tooltip_top, R.id.tooltip_bottom, resources.getDimensionPixelSize(R.dimen.text_tooltip_corner_radius), resources.getDimensionPixelSize(R.dimen.text_tooltip_triangle_width));
    }

    public /* synthetic */ void lambda$setFollowAttachedViewLayoutChanges$0$TextTooltip(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        moveTooltipToPointAtAttachedView();
    }

    public void setArrowBorderColor(int i) {
        this.topTriangleView.a(i);
        this.bottomTriangleView.a(i);
    }

    public void setArrowDown() {
        this.topTriangleView.setVisibility(8);
        this.bottomTriangleView.setVisibility(0);
    }

    public void setArrowUp() {
        this.topTriangleView.setVisibility(0);
        this.bottomTriangleView.setVisibility(8);
    }

    public void setBorderWidth(float f) {
        this.topTriangleView.a(f);
        LayoutParams layoutParams = (LayoutParams) this.topTriangleView.getLayoutParams();
        int i = (int) f;
        layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin - i);
        this.bottomTriangleView.a(f);
        LayoutParams layoutParams2 = (LayoutParams) this.bottomTriangleView.getLayoutParams();
        layoutParams2.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin - i, layoutParams2.rightMargin, layoutParams2.bottomMargin);
    }

    public void setColor(int i) {
        this.topTriangleView.b(i);
        this.bottomTriangleView.b(i);
    }

    public void setFollowAttachedViewLayoutChanges() {
        if (this.mAttachedView != null) {
            this.mAttachedView.addOnLayoutChangeListener(new -$$Lambda$TextTooltip$D1Mps0d1Lz3WEs_ggpsa6kwOLxY(this));
        }
    }

    public void setMoveToAttachedViewOnInitialLayout() {
        addOnLayoutChangeListener(new OnLayoutChangeListener() {
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (TextTooltip.this.getWidth() != 0 && TextTooltip.this.getHeight() != 0) {
                    TextTooltip.this.moveTooltipToPointAtAttachedView();
                    TextTooltip.this.removeOnLayoutChangeListener(this);
                }
            }
        });
    }

    public void setText(CharSequence charSequence) {
        this.textView.setText(charSequence);
    }

    public void setTextBackground(int i) {
        this.textView.setBackgroundResource(i);
    }

    public void setTextColor(int i) {
        this.textView.setTextColor(i);
    }
}
