package com.mapbox.mapboxsdk.maps.widgets;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.mapboxsdk.maps.FocalPointChangeListener;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import defpackage.kb;
import defpackage.kf;
import defpackage.kh;
import java.lang.ref.WeakReference;

public final class CompassView extends AppCompatImageView implements FocalPointChangeListener, Runnable {
    private static final long TIME_FADE_ANIMATION = 500;
    private static final long TIME_MAP_NORTH_ANIMATION = 150;
    private static final long TIME_WAIT_IDLE = 500;
    private kf fadeAnimator;
    private boolean fadeCompassViewFacingNorth = true;
    private PointF focalPoint;
    private float rotation = MapboxConstants.MINIMUM_ZOOM;

    static class CompassClickListener implements OnClickListener {
        private WeakReference<CompassView> compassView;
        private WeakReference<MapboxMap> mapboxMap;

        CompassClickListener(MapboxMap mapboxMap, CompassView compassView) {
            this.mapboxMap = new WeakReference(mapboxMap);
            this.compassView = new WeakReference(compassView);
        }

        public void onClick(View view) {
            MapboxMap mapboxMap = (MapboxMap) this.mapboxMap.get();
            CompassView compassView = (CompassView) this.compassView.get();
            if (mapboxMap != null && compassView != null) {
                float f;
                double d;
                float f2;
                long j;
                PointF focalPoint = compassView.getFocalPoint();
                if (focalPoint != null) {
                    f = focalPoint.x;
                    float f3 = focalPoint.y;
                    d = 0.0d;
                    f2 = f;
                    f = f3;
                    j = 150;
                } else {
                    d = 0.0d;
                    f2 = mapboxMap.getWidth() / 2.0f;
                    f = mapboxMap.getHeight() / 2.0f;
                    j = 150;
                }
                mapboxMap.setFocalBearing(d, f2, f, j);
                compassView.postDelayed(compassView, 650);
            }
        }
    }

    public CompassView(Context context) {
        super(context);
        initialize(context);
    }

    public CompassView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize(context);
    }

    public CompassView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initialize(context);
    }

    private void initialize(Context context) {
        setEnabled(false);
        int i = (int) (context.getResources().getDisplayMetrics().density * 48.0f);
        setLayoutParams(new LayoutParams(i, i));
    }

    private void resetAnimation() {
        kf kfVar = this.fadeAnimator;
        if (kfVar != null) {
            kfVar.c();
        }
        this.fadeAnimator = null;
    }

    public final void fadeCompassViewFacingNorth(boolean z) {
        this.fadeCompassViewFacingNorth = z;
    }

    public final Drawable getCompassImage() {
        return getDrawable();
    }

    /* Access modifiers changed, original: final */
    public final PointF getFocalPoint() {
        return this.focalPoint;
    }

    public final boolean isFacingNorth() {
        return ((double) Math.abs(this.rotation)) >= 359.0d || ((double) Math.abs(this.rotation)) <= 1.0d;
    }

    public final boolean isFadeCompassViewFacingNorth() {
        return this.fadeCompassViewFacingNorth;
    }

    public final boolean isHidden() {
        return this.fadeCompassViewFacingNorth && isFacingNorth();
    }

    public final void onFocalPointChanged(PointF pointF) {
        this.focalPoint = pointF;
    }

    public final void run() {
        if (isFacingNorth() && this.fadeCompassViewFacingNorth) {
            resetAnimation();
            setLayerType(2, null);
            this.fadeAnimator = kb.b(this).a((float) MapboxConstants.MINIMUM_ZOOM).a(500);
            this.fadeAnimator.a(new kh() {
                public void onAnimationEnd(View view) {
                    CompassView.this.setLayerType(0, null);
                    CompassView.this.setVisibility(4);
                    CompassView.this.resetAnimation();
                }
            });
        }
    }

    public final void setCompassImage(Drawable drawable) {
        setImageDrawable(drawable);
    }

    public final void setEnabled(boolean z) {
        int i;
        super.setEnabled(z);
        if (!z || isHidden()) {
            resetAnimation();
            setAlpha(MapboxConstants.MINIMUM_ZOOM);
            i = 4;
        } else {
            resetAnimation();
            setAlpha(1.0f);
            i = 0;
        }
        setVisibility(i);
    }

    public final void setMapboxMap(MapboxMap mapboxMap) {
        setOnClickListener(new CompassClickListener(mapboxMap, this));
    }

    public final void update(double d) {
        this.rotation = (float) d;
        if (!isEnabled()) {
            return;
        }
        if (isHidden()) {
            if (getVisibility() != 4 && this.fadeAnimator == null) {
                postDelayed(this, 500);
            }
            return;
        }
        resetAnimation();
        setAlpha(1.0f);
        setVisibility(0);
        setRotation(this.rotation);
    }
}
