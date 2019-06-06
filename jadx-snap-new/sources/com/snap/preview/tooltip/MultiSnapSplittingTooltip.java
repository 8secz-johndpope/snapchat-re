package com.snap.preview.tooltip;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.ui.tooltip.SnapTooltipView;
import com.snap.ui.view.SnapFontTextView;
import com.snapchat.android.R;

public class MultiSnapSplittingTooltip extends SnapTooltipView {
    private SnapFontTextView a;

    public MultiSnapSplittingTooltip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void c(int i) {
        this.a.setVisibility(i);
    }

    public final void a() {
        int color = getContext().getResources().getColor(R.color.black_fifty_opacity);
        c(8);
        a(getContext().getResources().getString(R.string.magikarp_splitting_tap_message), 1);
        setBackgroundColor(0);
        a(-1);
        b(color);
    }

    public final void a(Context context) {
        super.a(context);
        this.a = (SnapFontTextView) findViewById(R.id.snap_tooltip_description_text);
    }

    public final void a(boolean z, View view) {
        Resources resources = getContext().getResources();
        int color = resources.getColor(R.color.black_fifty_opacity);
        if ((this.a.getVisibility() == 0 ? 1 : null) == null) {
            cancelFadeOutAnimationIfNecessary();
            attachToView(view, false);
        }
        c(z ? 0 : 4);
        this.a.setText(getContext().getResources().getString(R.string.multi_snap_splitting_split_message));
        this.a.setShadowLayer(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, 0);
        ((GradientDrawable) this.a.getBackground()).setColor(-1);
        this.a.setTextColor(-16777216);
        a(z ? "" : resources.getString(R.string.multi_snap_splitting_split_helper_message), 1);
        setBackgroundColor(0);
        a(-1);
        b(color);
    }
}
