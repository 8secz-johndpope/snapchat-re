package com.snap.ui.tooltip;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup.MarginLayoutParams;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.ui.view.SnapFontTextView;
import com.snapchat.android.R;
import com.snapchat.android.framework.ui.views.Tooltip;
import com.snapchat.android.framework.ui.views.TriangleView;

public class SnapTooltipView extends Tooltip {
    private TriangleView a;
    private TriangleView b;
    private TriangleView c;
    private SnapFontTextView d;
    private int e;

    public SnapTooltipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(int i) {
        this.d.setTextColor(i);
    }

    public void a(Context context) {
        super.initialize(R.id.snap_tooltip_upper_triangle, R.id.snap_tooltip_lower_triangle, context.getResources().getDimensionPixelSize(R.dimen.snap_tooltip_rounded_corner_radius), context.getResources().getDimensionPixelSize(R.dimen.snap_tooltip_triangle_width));
        this.a = (TriangleView) getTopTriangle();
        this.b = (TriangleView) getBottomTriangle();
        this.c = (TriangleView) findViewById(R.id.snap_tooltip_right_triangle);
        this.d = (SnapFontTextView) findViewById(R.id.snap_tooltip_text);
        setBackgroundColor(-1);
        a(-16777216);
    }

    public final void a(String str) {
        a(str, 1);
    }

    public final void a(String str, int i) {
        this.d.setText(str);
        this.e = i;
    }

    public final void b(int i) {
        this.d.setShadowLayer(10.0f, MapboxConstants.MINIMUM_ZOOM, 1.0f, i);
    }

    public void moveTooltipToPointAtAttachedView() {
        int i = this.e;
        if (i == 2 || i == 3) {
            int[] iArr = new int[2];
            this.mAttachedView.getLocationOnScreen(iArr);
            this.a.setVisibility(4);
            this.b.setVisibility(4);
            this.c.setVisibility(0);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.c.getLayoutParams();
            int paddingBottom = this.d.getPaddingBottom() + ((int) ((getResources().getDisplayMetrics().density * 7.0f) + 0.5f));
            if (this.e == 3 && marginLayoutParams.bottomMargin != paddingBottom) {
                marginLayoutParams.bottomMargin = paddingBottom;
                this.c.setLayoutParams(marginLayoutParams);
            }
            setX((float) (iArr[0] - getWidth()));
            setY((float) (((this.mAttachedView.getHeight() - getHeight()) / 2) + iArr[1]));
            return;
        }
        this.c.setVisibility(8);
        super.moveTooltipToPointAtAttachedView();
    }

    public void setBackgroundColor(int i) {
        ((GradientDrawable) this.d.getBackground()).setColor(i);
        this.b.b(i);
        this.a.b(i);
    }
}
