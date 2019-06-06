package com.snap.ui.view.scrollbar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.ajxt;
import defpackage.akco;
import defpackage.akcr;

public final class SnapScrollBarIndicator extends FrameLayout {
    public static final Companion Companion = new Companion();
    private static final long INDICATOR_TEXT_ANIMATION_DURATION = 200;
    private volatile float currentShownFraction;
    private final ImageView imageView;
    private final TextView indicatorText;
    private final boolean isRtlLayout;
    private volatile float targetShownFraction;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }
    }

    public SnapScrollBarIndicator(Context context) {
        akcr.b(context, "context");
        this(context, null);
    }

    public SnapScrollBarIndicator(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, 0);
    }

    public SnapScrollBarIndicator(Context context, AttributeSet attributeSet, int i) {
        akcr.b(context, "context");
        super(context, attributeSet, i);
        Object systemService = getContext().getSystemService("layout_inflater");
        if (systemService != null) {
            ((LayoutInflater) systemService).inflate(R.layout.scroll_bar_indicator, this);
            systemService = findViewById(R.id.scroll_bar_indicator_text);
            akcr.a(systemService, "findViewById(R.id.scroll_bar_indicator_text)");
            this.indicatorText = (TextView) systemService;
            systemService = findViewById(R.id.scroll_bar_indicator_thumb);
            akcr.a(systemService, "findViewById(R.id.scroll_bar_indicator_thumb)");
            this.imageView = (ImageView) systemService;
            systemService = getResources();
            akcr.a(systemService, "resources");
            systemService = systemService.getConfiguration();
            akcr.a(systemService, "resources.configuration");
            boolean z = true;
            if (systemService.getLayoutDirection() != 1) {
                z = false;
            }
            this.isRtlLayout = z;
            return;
        }
        throw new ajxt("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    public static /* synthetic */ void hideIndicatorTextView$default(SnapScrollBarIndicator snapScrollBarIndicator, Runnable runnable, int i, Object obj) {
        if ((i & 1) != 0) {
            runnable = null;
        }
        snapScrollBarIndicator.hideIndicatorTextView(runnable);
    }

    public final float getIndicatorX() {
        return getX() + (((1.0f - this.currentShownFraction) * ((float) this.indicatorText.getWidth())) * ((float) (this.isRtlLayout ? -1 : 1)));
    }

    public final void hideIndicatorTextView(Runnable runnable) {
        if (getVisibility() != 4) {
            if (this.indicatorText.getVisibility() == 4) {
                if (runnable != null) {
                    runnable.run();
                }
                return;
            }
            this.indicatorText.clearAnimation();
            float f = 1.0f - this.targetShownFraction;
            if (this.isRtlLayout) {
                f = -f;
            }
            float f2 = f;
            float f3 = this.isRtlLayout ? -1.0f : 1.0f;
            SnapScrollBarIndicator$hideIndicatorTextView$animation$1 snapScrollBarIndicator$hideIndicatorTextView$animation$1 = new SnapScrollBarIndicator$hideIndicatorTextView$animation$1(this, f2, f3, 1, f2, 1, f3, 1, MapboxConstants.MINIMUM_ZOOM, 1, MapboxConstants.MINIMUM_ZOOM);
            snapScrollBarIndicator$hideIndicatorTextView$animation$1.setFillAfter(true);
            snapScrollBarIndicator$hideIndicatorTextView$animation$1.setDuration(INDICATOR_TEXT_ANIMATION_DURATION);
            snapScrollBarIndicator$hideIndicatorTextView$animation$1.setAnimationListener(new SnapScrollBarIndicator$hideIndicatorTextView$1(this, runnable));
            this.indicatorText.startAnimation(snapScrollBarIndicator$hideIndicatorTextView$animation$1);
        }
    }

    public final void setIndicatorImageDrawable(Drawable drawable) {
        akcr.b(drawable, "imageDrawable");
        this.imageView.setImageDrawable(drawable);
    }

    public final void setIndicatorText(String str) {
        akcr.b(str, "text");
        this.indicatorText.setText(str);
    }

    public final void setIndicatorTextBackground(Drawable drawable) {
        akcr.b(drawable, "backgroundDrawable");
        this.indicatorText.setBackground(drawable);
    }

    public final void showIndicatorTextView(float f) {
        if (this.indicatorText.getVisibility() != 0 || this.targetShownFraction != f) {
            this.targetShownFraction = f;
            this.indicatorText.setVisibility(0);
            this.indicatorText.clearAnimation();
            float f2 = this.isRtlLayout ? -1.0f : 1.0f;
            float f3 = 1.0f - this.targetShownFraction;
            float f4 = this.isRtlLayout ? -f3 : f3;
            SnapScrollBarIndicator$showIndicatorTextView$animation$1 snapScrollBarIndicator$showIndicatorTextView$animation$1 = new SnapScrollBarIndicator$showIndicatorTextView$animation$1(this, f2, f4, 1, f2, 1, f4, 1, MapboxConstants.MINIMUM_ZOOM, 1, MapboxConstants.MINIMUM_ZOOM);
            snapScrollBarIndicator$showIndicatorTextView$animation$1.setFillAfter(true);
            snapScrollBarIndicator$showIndicatorTextView$animation$1.setDuration(INDICATOR_TEXT_ANIMATION_DURATION);
            this.indicatorText.startAnimation(snapScrollBarIndicator$showIndicatorTextView$animation$1);
        }
    }
}
