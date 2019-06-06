package com.snap.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.abtp;
import defpackage.akcr;
import defpackage.akdp;
import defpackage.bo;
import defpackage.zhg.a;

public final class RoundedCornerAspectRatioFrameLayout extends RoundedCornerFrameLayout {
    private final float aspectRatio;

    public RoundedCornerAspectRatioFrameLayout(Context context) {
        akcr.b(context, "context");
        this(context, null);
    }

    public RoundedCornerAspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, 0);
    }

    public RoundedCornerAspectRatioFrameLayout(Context context, AttributeSet attributeSet, int i) {
        akcr.b(context, "context");
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.g);
        try {
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                float a;
                if (akcr.a((Object) string, (Object) "match_display")) {
                    a = (((float) abtp.a(context)) * 1.0f) / ((float) abtp.b(context));
                } else {
                    bo boVar = new bo();
                    boVar.a(string);
                    a = boVar.w();
                }
                this.aspectRatio = a;
                if (this.aspectRatio == MapboxConstants.MINIMUM_ZOOM) {
                    StringBuilder stringBuilder = new StringBuilder("Supplied aspect ratio was invalid: {");
                    stringBuilder.append(string);
                    stringBuilder.append("}. Should either be a float, or in W:H format.");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                return;
            }
            throw new IllegalArgumentException("aspect_ratio needs to be specified");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, MeasureSpec.makeMeasureSpec(akdp.a(((float) MeasureSpec.getSize(i)) / this.aspectRatio), AudioPlayer.INFINITY_LOOP_COUNT));
    }
}
