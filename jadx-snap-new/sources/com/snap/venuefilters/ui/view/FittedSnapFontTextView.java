package com.snap.venuefilters.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.brightcove.player.captioning.TTMLParser.Tags;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.ui.view.SnapFontTextView;
import defpackage.akcr;

public final class FittedSnapFontTextView extends SnapFontTextView {
    public FittedSnapFontTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getLineCount() > 1 && MeasureSpec.getMode(i) != AudioPlayer.INFINITY_LOOP_COUNT) {
            Object layout = getLayout();
            akcr.a(layout, Tags.LAYOUT);
            int lineCount = layout.getLineCount();
            if (lineCount > 1) {
                float f = MapboxConstants.MINIMUM_ZOOM;
                for (int i3 = 0; i3 < lineCount; i3++) {
                    f = Math.max(f, layout.getLineWidth(i3));
                }
                i = (int) Math.ceil((double) (f + ((float) (getCompoundPaddingLeft() + getCompoundPaddingRight()))));
                if (i < getMeasuredWidth()) {
                    super.onMeasure(MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
                }
            }
        }
    }
}
