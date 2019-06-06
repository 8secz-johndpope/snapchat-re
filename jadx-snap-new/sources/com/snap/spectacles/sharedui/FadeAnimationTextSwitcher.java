package com.snap.spectacles.sharedui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher.ViewFactory;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

public class FadeAnimationTextSwitcher extends TextSwitcher {
    private CharSequence a = null;
    private volatile boolean b = false;

    public FadeAnimationTextSwitcher(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(int i) {
        setText(getContext().getText(i));
    }

    public final void a(ViewFactory viewFactory) {
        if (!this.b) {
            this.b = true;
            setFactory(viewFactory);
            AlphaAnimation alphaAnimation = new AlphaAnimation(MapboxConstants.MINIMUM_ZOOM, 1.0f);
            alphaAnimation.setDuration(233);
            setInAnimation(alphaAnimation);
            alphaAnimation = new AlphaAnimation(1.0f, MapboxConstants.MINIMUM_ZOOM);
            alphaAnimation.setDuration(233);
            setOutAnimation(alphaAnimation);
        }
    }

    public final void b(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ((TextView) getChildAt(i2)).setTextColor(i);
        }
    }

    public void setText(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.a)) {
            this.a = charSequence;
            super.setText(charSequence);
        }
    }
}
