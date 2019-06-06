package com.snap.ui.view;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

public class TransparentMaskViewHelper {
    private Drawable mBackground;
    private Bitmap mBackgroundBitmap;
    private Canvas mBackgroundCanvas;
    private Bitmap mMaskBitmap;
    private Canvas mMaskCanvas;
    private Paint mPaint;
    private View mTransparentMaskView;

    public interface TransparentMaskView {
        void drawTransparentMask(Canvas canvas);
    }

    public TransparentMaskViewHelper(View view) {
        this.mTransparentMaskView = view;
    }

    private void clear(Canvas canvas) {
        canvas.drawColor(-16777216, Mode.CLEAR);
    }

    private void createBitmaps(int i, int i2) {
        this.mBackgroundBitmap = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
        this.mBackgroundCanvas = new Canvas(this.mBackgroundBitmap);
        this.mMaskBitmap = Bitmap.createBitmap(i, i2, Config.ALPHA_8);
        this.mMaskCanvas = new Canvas(this.mMaskBitmap);
    }

    public void onDraw(Canvas canvas) {
        clear(this.mMaskCanvas);
        ((TransparentMaskView) this.mTransparentMaskView).drawTransparentMask(this.mMaskCanvas);
        clear(this.mBackgroundCanvas);
        this.mBackground.draw(this.mBackgroundCanvas);
        if (this.mPaint == null) {
            this.mPaint = new Paint();
            this.mPaint.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
        }
        this.mBackgroundCanvas.drawBitmap(this.mMaskBitmap, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, this.mPaint);
        canvas.drawBitmap(this.mBackgroundBitmap, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, null);
    }

    public void onSizeChanged(int i, int i2) {
        createBitmaps(i, i2);
        Drawable drawable = this.mBackground;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public void setBackground(Drawable drawable) {
        if (this.mBackground != drawable) {
            this.mBackground = drawable;
            drawable = this.mBackground;
            if (drawable != null) {
                drawable.setBounds(0, 0, this.mTransparentMaskView.getWidth(), this.mTransparentMaskView.getHeight());
            }
            this.mTransparentMaskView.requestLayout();
            this.mTransparentMaskView.invalidate();
        }
    }
}
