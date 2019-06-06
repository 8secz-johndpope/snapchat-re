package com.mapbox.mapboxsdk.annotations;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

class Bubble extends Drawable {
    private float arrowHeight;
    private float arrowPosition;
    private float arrowWidth;
    private float cornersRadius;
    private Paint paint = new Paint(1);
    private Path path = new Path();
    private RectF rect;
    private Paint strokePaint;
    private Path strokePath;
    private float strokeWidth;

    Bubble(RectF rectF, ArrowDirection arrowDirection, float f, float f2, float f3, float f4, int i, float f5, int i2) {
        Path path;
        this.rect = rectF;
        this.arrowWidth = f;
        this.arrowHeight = f2;
        this.arrowPosition = f3;
        this.cornersRadius = f4;
        this.paint.setColor(i);
        this.strokeWidth = f5;
        if (f5 > MapboxConstants.MINIMUM_ZOOM) {
            this.strokePaint = new Paint(1);
            this.strokePaint.setColor(i2);
            this.strokePath = new Path();
            initPath(arrowDirection, this.path, f5);
            path = this.strokePath;
        } else {
            path = this.path;
        }
        initPath(arrowDirection, path, MapboxConstants.MINIMUM_ZOOM);
    }

    private void initBottomRoundedPath(RectF rectF, Path path, float f) {
        path.moveTo((rectF.left + this.cornersRadius) + f, rectF.top + f);
        path.lineTo((rectF.width() - this.cornersRadius) - f, rectF.top + f);
        path.arcTo(new RectF(rectF.right - this.cornersRadius, rectF.top + f, rectF.right - f, this.cornersRadius + rectF.top), 270.0f, 90.0f);
        path.lineTo(rectF.right - f, ((rectF.bottom - this.arrowHeight) - this.cornersRadius) - f);
        path.arcTo(new RectF(rectF.right - this.cornersRadius, (rectF.bottom - this.cornersRadius) - this.arrowHeight, rectF.right - f, (rectF.bottom - this.arrowHeight) - f), MapboxConstants.MINIMUM_ZOOM, 90.0f);
        float f2 = f / 2.0f;
        path.lineTo(((rectF.left + this.arrowWidth) + this.arrowPosition) - f2, (rectF.bottom - this.arrowHeight) - f);
        path.lineTo((rectF.left + this.arrowPosition) + (this.arrowWidth / 2.0f), (rectF.bottom - f) - f);
        path.lineTo((rectF.left + this.arrowPosition) + f2, (rectF.bottom - this.arrowHeight) - f);
        path.lineTo((rectF.left + Math.min(this.cornersRadius, this.arrowPosition)) + f, (rectF.bottom - this.arrowHeight) - f);
        float f3 = rectF.left + f;
        f2 = rectF.bottom;
        float f4 = this.cornersRadius;
        path.arcTo(new RectF(f3, (f2 - f4) - this.arrowHeight, f4 + rectF.left, (rectF.bottom - this.arrowHeight) - f), 90.0f, 90.0f);
        path.lineTo(rectF.left + f, (rectF.top + this.cornersRadius) + f);
        path.arcTo(new RectF(rectF.left + f, rectF.top + f, this.cornersRadius + rectF.left, this.cornersRadius + rectF.top), 180.0f, 90.0f);
        path.close();
    }

    private void initBottomSquarePath(RectF rectF, Path path, float f) {
        path.moveTo(rectF.left + f, rectF.top + f);
        path.lineTo(rectF.right - f, rectF.top + f);
        path.lineTo(rectF.right - f, (rectF.bottom - this.arrowHeight) - f);
        float f2 = f / 2.0f;
        path.lineTo(((rectF.left + this.arrowWidth) + this.arrowPosition) - f2, (rectF.bottom - this.arrowHeight) - f);
        path.lineTo((rectF.left + this.arrowPosition) + (this.arrowWidth / 2.0f), (rectF.bottom - f) - f);
        path.lineTo((rectF.left + this.arrowPosition) + f2, (rectF.bottom - this.arrowHeight) - f);
        path.lineTo((rectF.left + this.arrowPosition) + f, (rectF.bottom - this.arrowHeight) - f);
        path.lineTo(rectF.left + f, (rectF.bottom - this.arrowHeight) - f);
        path.lineTo(rectF.left + f, rectF.top + f);
        path.close();
    }

    private void initLeftRoundedPath(RectF rectF, Path path, float f) {
        path.moveTo(((this.arrowWidth + rectF.left) + this.cornersRadius) + f, rectF.top + f);
        path.lineTo((rectF.width() - this.cornersRadius) - f, rectF.top + f);
        path.arcTo(new RectF(rectF.right - this.cornersRadius, rectF.top + f, rectF.right - f, this.cornersRadius + rectF.top), 270.0f, 90.0f);
        path.lineTo(rectF.right - f, (rectF.bottom - this.cornersRadius) - f);
        path.arcTo(new RectF(rectF.right - this.cornersRadius, rectF.bottom - this.cornersRadius, rectF.right - f, rectF.bottom - f), MapboxConstants.MINIMUM_ZOOM, 90.0f);
        path.lineTo(((rectF.left + this.arrowWidth) + this.cornersRadius) + f, rectF.bottom - f);
        float f2 = (rectF.left + this.arrowWidth) + f;
        float f3 = rectF.bottom;
        float f4 = this.cornersRadius;
        path.arcTo(new RectF(f2, f3 - f4, (f4 + rectF.left) + this.arrowWidth, rectF.bottom - f), 90.0f, 90.0f);
        f4 = f / 2.0f;
        path.lineTo((rectF.left + this.arrowWidth) + f, (this.arrowHeight + this.arrowPosition) - f4);
        path.lineTo((rectF.left + f) + f, this.arrowPosition + (this.arrowHeight / 2.0f));
        path.lineTo((rectF.left + this.arrowWidth) + f, this.arrowPosition + f4);
        path.lineTo((rectF.left + this.arrowWidth) + f, (rectF.top + this.cornersRadius) + f);
        path.arcTo(new RectF((rectF.left + this.arrowWidth) + f, rectF.top + f, (this.cornersRadius + rectF.left) + this.arrowWidth, this.cornersRadius + rectF.top), 180.0f, 90.0f);
        path.close();
    }

    private void initLeftSquarePath(RectF rectF, Path path, float f) {
        path.moveTo((this.arrowWidth + rectF.left) + f, rectF.top + f);
        path.lineTo(rectF.width() - f, rectF.top + f);
        path.lineTo(rectF.right - f, rectF.bottom - f);
        path.lineTo((rectF.left + this.arrowWidth) + f, rectF.bottom - f);
        float f2 = f / 2.0f;
        path.lineTo((rectF.left + this.arrowWidth) + f, (this.arrowHeight + this.arrowPosition) - f2);
        path.lineTo((rectF.left + f) + f, this.arrowPosition + (this.arrowHeight / 2.0f));
        path.lineTo((rectF.left + this.arrowWidth) + f, this.arrowPosition + f2);
        path.lineTo((rectF.left + this.arrowWidth) + f, rectF.top + f);
        path.close();
    }

    private void initPath(ArrowDirection arrowDirection, Path path, float f) {
        int value = arrowDirection.getValue();
        float f2;
        if (value == 0) {
            f2 = this.cornersRadius;
            if (f2 <= MapboxConstants.MINIMUM_ZOOM) {
                initLeftSquarePath(this.rect, path, f);
            } else if (f <= MapboxConstants.MINIMUM_ZOOM || f <= f2) {
                initLeftRoundedPath(this.rect, path, f);
            } else {
                initLeftSquarePath(this.rect, path, f);
            }
        } else if (value == 1) {
            f2 = this.cornersRadius;
            if (f2 <= MapboxConstants.MINIMUM_ZOOM) {
                initRightSquarePath(this.rect, path, f);
            } else if (f <= MapboxConstants.MINIMUM_ZOOM || f <= f2) {
                initRightRoundedPath(this.rect, path, f);
            } else {
                initRightSquarePath(this.rect, path, f);
            }
        } else if (value != 2) {
            if (value == 3) {
                f2 = this.cornersRadius;
                if (f2 <= MapboxConstants.MINIMUM_ZOOM) {
                    initBottomSquarePath(this.rect, path, f);
                } else if (f <= MapboxConstants.MINIMUM_ZOOM || f <= f2) {
                    initBottomRoundedPath(this.rect, path, f);
                } else {
                    initBottomSquarePath(this.rect, path, f);
                }
            }
        } else {
            f2 = this.cornersRadius;
            if (f2 <= MapboxConstants.MINIMUM_ZOOM) {
                initTopSquarePath(this.rect, path, f);
            } else if (f <= MapboxConstants.MINIMUM_ZOOM || f <= f2) {
                initTopRoundedPath(this.rect, path, f);
            } else {
                initTopSquarePath(this.rect, path, f);
            }
        }
    }

    private void initRightRoundedPath(RectF rectF, Path path, float f) {
        path.moveTo((rectF.left + this.cornersRadius) + f, rectF.top + f);
        path.lineTo(((rectF.width() - this.cornersRadius) - this.arrowWidth) - f, rectF.top + f);
        path.arcTo(new RectF((rectF.right - this.cornersRadius) - this.arrowWidth, rectF.top + f, (rectF.right - this.arrowWidth) - f, this.cornersRadius + rectF.top), 270.0f, 90.0f);
        float f2 = f / 2.0f;
        path.lineTo((rectF.right - this.arrowWidth) - f, this.arrowPosition + f2);
        path.lineTo((rectF.right - f) - f, this.arrowPosition + (this.arrowHeight / 2.0f));
        path.lineTo((rectF.right - this.arrowWidth) - f, (this.arrowPosition + this.arrowHeight) - f2);
        path.lineTo((rectF.right - this.arrowWidth) - f, (rectF.bottom - this.cornersRadius) - f);
        path.arcTo(new RectF((rectF.right - this.cornersRadius) - this.arrowWidth, rectF.bottom - this.cornersRadius, (rectF.right - this.arrowWidth) - f, rectF.bottom - f), MapboxConstants.MINIMUM_ZOOM, 90.0f);
        path.lineTo((rectF.left + this.arrowWidth) + f, rectF.bottom - f);
        float f3 = rectF.left + f;
        float f4 = rectF.bottom;
        f2 = this.cornersRadius;
        path.arcTo(new RectF(f3, f4 - f2, f2 + rectF.left, rectF.bottom - f), 90.0f, 90.0f);
        path.arcTo(new RectF(rectF.left + f, rectF.top + f, this.cornersRadius + rectF.left, this.cornersRadius + rectF.top), 180.0f, 90.0f);
        path.close();
    }

    private void initRightSquarePath(RectF rectF, Path path, float f) {
        path.moveTo(rectF.left + f, rectF.top + f);
        path.lineTo((rectF.width() - this.arrowWidth) - f, rectF.top + f);
        float f2 = f / 2.0f;
        path.lineTo((rectF.right - this.arrowWidth) - f, this.arrowPosition + f2);
        path.lineTo((rectF.right - f) - f, this.arrowPosition + (this.arrowHeight / 2.0f));
        path.lineTo((rectF.right - this.arrowWidth) - f, (this.arrowPosition + this.arrowHeight) - f2);
        path.lineTo((rectF.right - this.arrowWidth) - f, rectF.bottom - f);
        path.lineTo(rectF.left + f, rectF.bottom - f);
        path.lineTo(rectF.left + f, rectF.top + f);
        path.close();
    }

    private void initTopRoundedPath(RectF rectF, Path path, float f) {
        path.moveTo((rectF.left + Math.min(this.arrowPosition, this.cornersRadius)) + f, (rectF.top + this.arrowHeight) + f);
        float f2 = f / 2.0f;
        path.lineTo((rectF.left + this.arrowPosition) + f2, (rectF.top + this.arrowHeight) + f);
        path.lineTo((rectF.left + (this.arrowWidth / 2.0f)) + this.arrowPosition, (rectF.top + f) + f);
        path.lineTo(((rectF.left + this.arrowWidth) + this.arrowPosition) - f2, (rectF.top + this.arrowHeight) + f);
        path.lineTo((rectF.right - this.cornersRadius) - f, (rectF.top + this.arrowHeight) + f);
        path.arcTo(new RectF(rectF.right - this.cornersRadius, (rectF.top + this.arrowHeight) + f, rectF.right - f, (this.cornersRadius + rectF.top) + this.arrowHeight), 270.0f, 90.0f);
        path.lineTo(rectF.right - f, (rectF.bottom - this.cornersRadius) - f);
        path.arcTo(new RectF(rectF.right - this.cornersRadius, rectF.bottom - this.cornersRadius, rectF.right - f, rectF.bottom - f), MapboxConstants.MINIMUM_ZOOM, 90.0f);
        path.lineTo((rectF.left + this.cornersRadius) + f, rectF.bottom - f);
        f2 = rectF.left + f;
        float f3 = rectF.bottom;
        float f4 = this.cornersRadius;
        path.arcTo(new RectF(f2, f3 - f4, f4 + rectF.left, rectF.bottom - f), 90.0f, 90.0f);
        path.lineTo(rectF.left + f, ((rectF.top + this.arrowHeight) + this.cornersRadius) + f);
        path.arcTo(new RectF(rectF.left + f, (rectF.top + this.arrowHeight) + f, this.cornersRadius + rectF.left, (this.cornersRadius + rectF.top) + this.arrowHeight), 180.0f, 90.0f);
        path.close();
    }

    private void initTopSquarePath(RectF rectF, Path path, float f) {
        path.moveTo((rectF.left + this.arrowPosition) + f, (rectF.top + this.arrowHeight) + f);
        float f2 = f / 2.0f;
        path.lineTo((rectF.left + this.arrowPosition) + f2, (rectF.top + this.arrowHeight) + f);
        path.lineTo((rectF.left + (this.arrowWidth / 2.0f)) + this.arrowPosition, (rectF.top + f) + f);
        path.lineTo(((rectF.left + this.arrowWidth) + this.arrowPosition) - f2, (rectF.top + this.arrowHeight) + f);
        path.lineTo(rectF.right - f, (rectF.top + this.arrowHeight) + f);
        path.lineTo(rectF.right - f, rectF.bottom - f);
        path.lineTo(rectF.left + f, rectF.bottom - f);
        path.lineTo(rectF.left + f, (rectF.top + this.arrowHeight) + f);
        path.lineTo((rectF.left + this.arrowPosition) + f, (rectF.top + this.arrowHeight) + f);
        path.close();
    }

    public void draw(Canvas canvas) {
        if (this.strokeWidth > MapboxConstants.MINIMUM_ZOOM) {
            canvas.drawPath(this.strokePath, this.strokePaint);
        }
        canvas.drawPath(this.path, this.paint);
    }

    public int getIntrinsicHeight() {
        return (int) this.rect.height();
    }

    public int getIntrinsicWidth() {
        return (int) this.rect.width();
    }

    public int getOpacity() {
        return -3;
    }

    /* Access modifiers changed, original: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
    }

    public void setAlpha(int i) {
        this.paint.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }
}
