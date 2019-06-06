package com.snap.ui.view.takesnapbutton;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.os.SystemClock;

public class VideoRingDisplayStyle extends AbstractAnimatedTakeSnapButtonDisplayStyle {
    private static final int DEFAULT_SEGMENT_VIDEO_RECORDING_TIME_MS = 10000;
    private final Paint arcPaint = new Paint();
    private final RectF arcRectF;
    private long ringStartMillis;
    private int segmentVideoRecordingTimeMs = 10000;

    public VideoRingDisplayStyle(DisplayStyleConfig displayStyleConfig) {
        super(displayStyleConfig);
        this.arcPaint.setAntiAlias(true);
        this.arcPaint.setStyle(Style.STROKE);
        this.arcPaint.setStrokeWidth(displayStyleConfig.getWhiteStrokeWidth() / displayStyleConfig.getScaleX());
        this.arcPaint.setColor(-65536);
        this.arcRectF = new RectF();
    }

    /* Access modifiers changed, original: 0000 */
    public void drawInternal(Canvas canvas) {
        float max = (float) Math.max(0, SystemClock.elapsedRealtime() - this.ringStartMillis);
        int i = this.segmentVideoRecordingTimeMs;
        Canvas canvas2 = canvas;
        canvas2.drawArc(this.arcRectF, -90.0f, ((max % ((float) i)) * 360.0f) / ((float) i), false, this.arcPaint);
    }

    public void onSizeChanged() {
        float outerRadius = (float) this.config.getOuterRadius();
        this.arcRectF.set(this.config.getCenterX() - outerRadius, this.config.getCenterY() - outerRadius, this.config.getCenterX() + outerRadius, this.config.getCenterY() + outerRadius);
    }

    public void setSegmentVideoRecordingTimeMs(int i) {
        this.segmentVideoRecordingTimeMs = i;
    }

    public void startAnimation() {
        super.startAnimation();
        this.ringStartMillis = SystemClock.elapsedRealtime();
    }
}
