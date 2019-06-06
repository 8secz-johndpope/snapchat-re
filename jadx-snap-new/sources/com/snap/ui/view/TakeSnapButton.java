package com.snap.ui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.LinearInterpolator;
import com.google.common.collect.ImmutableList;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.ui.view.takesnapbutton.DrawableIconDisplayStyle;
import com.snap.ui.view.takesnapbutton.HandsFreeStopIconDisplayStyle;
import com.snap.ui.view.takesnapbutton.SnapButtonRingDisplayStyle;
import com.snap.ui.view.takesnapbutton.SolidRedFillingDisplayStyle;
import com.snap.ui.view.takesnapbutton.TakeSnapButtonDisplayStyle;
import com.snap.ui.view.takesnapbutton.TimerModeStopIconDisplayStyle;
import com.snap.ui.view.takesnapbutton.VideoRingDisplayStyle;
import com.snapchat.android.R;
import defpackage.abtw;
import defpackage.aipn;
import defpackage.azs;
import defpackage.azt;
import defpackage.azu;
import defpackage.azx;
import defpackage.zhg.a;
import defpackage.zoo;
import defpackage.zop;
import java.util.List;

public class TakeSnapButton extends View implements zop {
    private static final int ALPHA_TRANSPARENT = 0;
    public static final float DEFAULT_DAMPENING_CONSTANT = 15.0f;
    public static final float DEFAULT_SPRING_CONSTANT = 1000.0f;
    public static final int LONG_PRESS_TIME = 500;
    private static final float MARGIN_BOTTOM_LOW_END_DEVICE_MODE = 66.0f;
    private static final int TAP_TIME = 125;
    private final DrawableIconDisplayStyle batchCaptureModeIconDisplayStyle;
    private int defaultCameraButtonBorderAlpha;
    private ColorStateList defaultCameraButtonTint;
    private final DisplayStyleConfig displayStyleConfig;
    private final List<TakeSnapButtonDisplayStyle> displayStyles;
    private final TakeSnapButtonDisplayStyle handsFreeStopIconDisplayStyle;
    private zoo lightModeTransition;
    private ValueAnimator mCircleAnimator = null;
    private azt mCircleSpring = null;
    private boolean mIsAnimating;
    private final boolean mIsAnimationEnabled;
    public azt mRingSpring;
    private boolean mShouldInvalidate = true;
    private final aipn<azx> mSpringSystem;
    private final Runnable mVideoAnimationRunnable = new -$$Lambda$cYq5TTN2R-H7rKhoYv0nRbhGiGU(this);
    private final DrawableIconDisplayStyle portraitModeIconDisplayStyle;
    private final SnapButtonRingDisplayStyle snapButtonRingDisplayStyle;
    private final SolidRedFillingDisplayStyle solidRedFillingDisplayStyle;
    private final TakeSnapButtonDisplayStyle timerModeIconDisplayStyle;
    private final VideoRingDisplayStyle videoRingDisplayStyle;

    class DisplayStyleConfig implements com.snap.ui.view.takesnapbutton.DisplayStyleConfig {
        private static final float BORDER_STROKE_DP_WIDTH = 1.0f;
        private static final int RING_STROKE_DP_WIDTH = 5;
        private final float blackStrokeWidth;
        private final float borderStrokeWidth;
        private float centerX;
        private float centerY;
        private float circleRadius;
        private int outerRadius = -1;
        private final float whiteStrokeWidth;

        public DisplayStyleConfig(Context context) {
            this.whiteStrokeWidth = TakeSnapButton.convertDpToPixel(5.0f, context);
            this.blackStrokeWidth = TakeSnapButton.convertDpToPixel(1.0f, context);
            this.borderStrokeWidth = TakeSnapButton.convertDpToPixel(7.0f, context);
            this.circleRadius = MapboxConstants.MINIMUM_ZOOM;
        }

        public azt createSpring() {
            return ((azx) TakeSnapButton.this.mSpringSystem.get()).a();
        }

        public float getBorderStrokeWidth() {
            return this.borderStrokeWidth;
        }

        public float getCenterX() {
            return this.centerX;
        }

        public float getCenterY() {
            return this.centerY;
        }

        public float getCircleRadius() {
            return this.circleRadius;
        }

        public int getOuterRadius() {
            return this.outerRadius;
        }

        public float getScaleX() {
            return TakeSnapButton.this.getScaleX();
        }

        public float getScaleY() {
            return TakeSnapButton.this.getScaleY();
        }

        public float getWhiteStrokeWidth() {
            return this.whiteStrokeWidth;
        }

        /* Access modifiers changed, original: 0000 */
        public DisplayStyleConfig initOutRadiusIfNotSet() {
            if (this.outerRadius == -1) {
                updateOuterRadius(0);
            }
            return this;
        }

        /* Access modifiers changed, original: 0000 */
        public DisplayStyleConfig setCenterCoordinates(float f, float f2) {
            this.centerX = f;
            this.centerY = f2;
            return this;
        }

        public DisplayStyleConfig setCircleRadius(float f) {
            this.circleRadius = f;
            return this;
        }

        /* Access modifiers changed, original: 0000 */
        public DisplayStyleConfig updateOuterRadius(int i) {
            this.outerRadius = (((int) (this.centerX - (this.whiteStrokeWidth / 2.0f))) - ((int) this.blackStrokeWidth)) - i;
            return this;
        }
    }

    public TakeSnapButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIsAnimationEnabled = 1 ^ abtw.a(context);
        this.mSpringSystem = -$$Lambda$R1ZWBpKU-2VdZkDCJRBlupcaPrI.INSTANCE;
        this.displayStyleConfig = new DisplayStyleConfig(context);
        this.solidRedFillingDisplayStyle = new SolidRedFillingDisplayStyle(this.displayStyleConfig);
        this.videoRingDisplayStyle = new VideoRingDisplayStyle(this.displayStyleConfig);
        this.handsFreeStopIconDisplayStyle = new HandsFreeStopIconDisplayStyle(this.displayStyleConfig, getContext());
        this.timerModeIconDisplayStyle = new TimerModeStopIconDisplayStyle(this.displayStyleConfig, getContext());
        this.portraitModeIconDisplayStyle = new DrawableIconDisplayStyle(this.displayStyleConfig, getContext().getApplicationContext(), R.drawable.camera_button_center_portrait_icon);
        this.batchCaptureModeIconDisplayStyle = new DrawableIconDisplayStyle(this.displayStyleConfig, getContext().getApplicationContext(), R.drawable.camera_button_center_batch_capture_icon);
        this.snapButtonRingDisplayStyle = new SnapButtonRingDisplayStyle(this.displayStyleConfig);
        this.displayStyles = ImmutableList.of(this.snapButtonRingDisplayStyle, this.solidRedFillingDisplayStyle, this.portraitModeIconDisplayStyle, this.batchCaptureModeIconDisplayStyle, this.handsFreeStopIconDisplayStyle, this.timerModeIconDisplayStyle, this.videoRingDisplayStyle);
        setCustomAttributes(attributeSet);
    }

    public static float convertDpToPixel(float f, Context context) {
        return f * (((float) context.getResources().getDisplayMetrics().densityDpi) / 160.0f);
    }

    private void setCustomAttributes(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a.r);
        int i = 0;
        try {
            int color = obtainStyledAttributes.getColor(0, 0);
            this.defaultCameraButtonTint = color == 0 ? null : ColorStateList.valueOf(color);
            this.snapButtonRingDisplayStyle.setRingColorFilter(this.defaultCameraButtonTint);
            if (obtainStyledAttributes.getBoolean(1, true)) {
                i = this.snapButtonRingDisplayStyle.getBorderStrokeAlpha();
            }
            this.defaultCameraButtonBorderAlpha = i;
            this.snapButtonRingDisplayStyle.setBorderAlpha(this.defaultCameraButtonBorderAlpha);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void cancelAnimation() {
        removeCallbacks(this.mVideoAnimationRunnable);
        this.mIsAnimating = false;
        this.mShouldInvalidate = false;
        ValueAnimator valueAnimator = this.mCircleAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.mCircleAnimator = null;
        }
        azt azt = this.mRingSpring;
        if (azt != null) {
            azt.b(0.0d);
            this.mRingSpring.b = true;
        }
        setKeepScreenOn(false);
        for (TakeSnapButtonDisplayStyle stopAnimation : this.displayStyles) {
            stopAnimation.stopAnimation();
        }
    }

    public void disableCapture() {
        setOnTouchListener(null);
        cancelAnimation();
    }

    public void enableCapture(OnTouchListener onTouchListener) {
        setOnTouchListener(onTouchListener);
        cancelAnimation();
    }

    public void expandInnerCircle() {
        this.mCircleAnimator = ValueAnimator.ofFloat(new float[]{1.0f, MapboxConstants.MINIMUM_ZOOM});
        this.mCircleAnimator.setDuration(375);
        this.mCircleAnimator.setStartDelay(125);
        this.mCircleAnimator.setInterpolator(new LinearInterpolator());
        this.mCircleAnimator.addUpdateListener(new -$$Lambda$TakeSnapButton$agg2KVlNe3qizoOZ15OE_PAnjO4(this));
        this.mCircleAnimator.start();
    }

    public zoo getCustomTransitionDelegate() {
        if (this.lightModeTransition == null) {
            this.lightModeTransition = new TakeSnapButtonLightModeTransition();
        }
        return this.lightModeTransition;
    }

    public int getDefaultCameraButtonBorderAlpha() {
        return this.defaultCameraButtonBorderAlpha;
    }

    public ColorStateList getDefaultCameraButtonTint() {
        return this.defaultCameraButtonTint;
    }

    public float getTranslatedBottomMargin() {
        return convertDpToPixel(MARGIN_BOTTOM_LOW_END_DEVICE_MODE, getContext());
    }

    public boolean isAnimating() {
        return this.mIsAnimating;
    }

    public /* synthetic */ void lambda$expandInnerCircle$0$TakeSnapButton(ValueAnimator valueAnimator) {
        this.displayStyleConfig.setCircleRadius(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* Access modifiers changed, original: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mRingSpring = ((azx) this.mSpringSystem.get()).a();
        this.mRingSpring.a(new azu(1000.0d, 15.0d));
        this.mRingSpring.a(new azs() {
            public void onSpringUpdate(azt azt) {
                float f = (((float) azt.d.a) * 0.2f) + 1.0f;
                TakeSnapButton.this.setScaleX(f);
                TakeSnapButton.this.setScaleY(f);
            }
        });
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        azt azt = this.mRingSpring;
        if (azt != null) {
            azt.a();
            this.mRingSpring = null;
            setScaleX(1.0f);
            setScaleY(1.0f);
        }
        azt = this.mCircleSpring;
        if (azt != null) {
            azt.a();
            this.mCircleSpring = null;
        }
        ValueAnimator valueAnimator = this.mCircleAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.mCircleAnimator.removeAllUpdateListeners();
            this.mCircleAnimator = null;
        }
        for (TakeSnapButtonDisplayStyle onDetached : this.displayStyles) {
            onDetached.onDetached();
        }
    }

    public void onDraw(Canvas canvas) {
        this.displayStyleConfig.initOutRadiusIfNotSet();
        if (this.mIsAnimating && this.mShouldInvalidate && this.mIsAnimationEnabled) {
            invalidate();
        }
        for (TakeSnapButtonDisplayStyle draw : this.displayStyles) {
            draw.draw(canvas);
        }
    }

    public void onEnterBatchCaptureMode() {
        this.batchCaptureModeIconDisplayStyle.setShouldDraw(true);
        invalidate();
    }

    public void onEnterCountDown() {
        this.handsFreeStopIconDisplayStyle.stopAnimation();
        this.timerModeIconDisplayStyle.startAnimation();
        this.mRingSpring.a(0.6666666865348816d);
        this.mRingSpring.b(0.0d);
    }

    public void onEnterHandsFreeMode() {
        this.handsFreeStopIconDisplayStyle.startAnimation();
        this.mRingSpring.a(0.6666666865348816d);
        this.mRingSpring.b(0.0d);
    }

    public void onEnterPortraitMode() {
        this.portraitModeIconDisplayStyle.setShouldDraw(true);
        invalidate();
    }

    public void onExitBatchCaptureMode() {
        this.batchCaptureModeIconDisplayStyle.setShouldDraw(false);
        invalidate();
    }

    public void onExitHandsFreeMode() {
        this.mRingSpring.b(1.0d);
    }

    public void onExitPortraitMode() {
        this.portraitModeIconDisplayStyle.setShouldDraw(false);
        invalidate();
    }

    public void onFingerMoveInLockRegion() {
        if (this.mCircleSpring == null) {
            this.mCircleSpring = ((azx) this.mSpringSystem.get()).a();
        }
        ValueAnimator valueAnimator = this.mCircleAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.mCircleAnimator = null;
            this.mCircleSpring.a(new azs() {
                public void onSpringUpdate(azt azt) {
                    TakeSnapButton.this.displayStyleConfig.setCircleRadius((float) azt.d.a);
                }
            });
            this.mCircleSpring.a((double) this.displayStyleConfig.getCircleRadius());
        }
        this.mCircleSpring.b(1.0d);
        this.mCircleSpring.c(10.0d);
        this.mCircleSpring.b = false;
        this.mRingSpring.b(0.0d);
    }

    public void onFingerMoveOutLockRegion() {
        azt azt = this.mCircleSpring;
        if (azt != null) {
            azt.b(0.0d);
            this.mCircleSpring.c(10.0d);
        }
        this.mRingSpring.b(1.0d);
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (!isInEditMode()) {
            super.onSizeChanged(i, i2, i3, i4);
            if (i > 0 && i2 > 0) {
                this.displayStyleConfig.setCenterCoordinates((float) (i / 2), (float) (i2 / 2)).updateOuterRadius(getPaddingLeft());
                this.videoRingDisplayStyle.onSizeChanged();
            }
        }
    }

    public void prepareForAnimation(boolean z) {
        if (isAttachedToWindow()) {
            this.displayStyleConfig.setCircleRadius(1.0f);
            this.solidRedFillingDisplayStyle.setShouldDrawRedCircle(z);
            for (TakeSnapButtonDisplayStyle prepareAnimation : this.displayStyles) {
                prepareAnimation.prepareAnimation();
            }
            azt azt = this.mCircleSpring;
            if (azt != null) {
                azt.d();
            }
            removeCallbacks(this.mVideoAnimationRunnable);
            postDelayed(this.mVideoAnimationRunnable, 125);
            this.mIsAnimating = true;
            this.mShouldInvalidate = true;
            setKeepScreenOn(true);
            this.mRingSpring.b(1.0d);
            this.mRingSpring.b = false;
        }
    }

    public void setCameraButtonBorderAlpha(int i) {
        this.snapButtonRingDisplayStyle.setBorderAlpha(i);
        postInvalidateOnAnimation();
    }

    public void setCameraButtonTint(ColorStateList colorStateList) {
        if (this.snapButtonRingDisplayStyle.getRingColorFilter() != null || colorStateList != null) {
            this.snapButtonRingDisplayStyle.setRingColorFilter(colorStateList);
            postInvalidateOnAnimation();
        }
    }

    public void setScaleX(float f) {
        if (f != getScaleX()) {
            super.setScaleX(f);
            postInvalidateOnAnimation();
        }
    }

    public void setScaleY(float f) {
        if (f != getScaleY()) {
            super.setScaleY(f);
            postInvalidateOnAnimation();
        }
    }

    public void setSegmentVideoRecordingTimeMs(int i) {
        this.videoRingDisplayStyle.setSegmentVideoRecordingTimeMs(i);
    }

    public void startVideoRecordingRing() {
        this.videoRingDisplayStyle.startAnimation();
    }
}
