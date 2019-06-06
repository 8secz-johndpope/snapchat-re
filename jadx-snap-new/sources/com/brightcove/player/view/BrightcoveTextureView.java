package com.brightcove.player.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View.MeasureSpec;
import com.brightcove.player.model.Video.ProjectionFormat;
import com.brightcove.player.util.LayoutUtil;

@TargetApi(14)
public class BrightcoveTextureView extends TextureView implements OnFrameAvailableListener, RenderView {
    private static final String a = "BrightcoveTextureView";
    private int b;
    private int c;
    private int d;
    private int e;
    private Surface f;
    private OnFrameAvailableListener g;
    private ProjectionFormat h = ProjectionFormat.NORMAL;

    public BrightcoveTextureView(Context context) {
        super(context);
    }

    public SurfaceHolder getHolder() {
        return null;
    }

    public int getMeasuredVideoHeight() {
        return this.e;
    }

    public int getMeasuredVideoWidth() {
        return this.d;
    }

    public ProjectionFormat getProjectionFormat() {
        return ProjectionFormat.NORMAL;
    }

    public Surface getSurface() {
        if (this.f == null) {
            this.f = new Surface(getSurfaceTexture());
        }
        return this.f;
    }

    public int getVideoHeight() {
        return this.c;
    }

    public int getVideoWidth() {
        return this.b;
    }

    public boolean isVrMode() {
        return false;
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        OnFrameAvailableListener onFrameAvailableListener = this.g;
        if (onFrameAvailableListener != null) {
            onFrameAvailableListener.onFrameAvailable(surfaceTexture);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        String str = a;
        StringBuilder stringBuilder = new StringBuilder("onLayout: changed = ");
        stringBuilder.append(z);
        stringBuilder.append(", left = ");
        stringBuilder.append(i);
        stringBuilder.append(", top = ");
        stringBuilder.append(i2);
        stringBuilder.append(", right = ");
        stringBuilder.append(i3);
        stringBuilder.append(", bottom = ");
        stringBuilder.append(i4);
        Log.v(str, stringBuilder.toString());
        super.onLayout(z, i, i2, i3, i4);
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        i = MeasureSpec.getMode(i);
        int size2 = MeasureSpec.getSize(i2);
        i2 = MeasureSpec.getMode(i2);
        String str = a;
        StringBuilder stringBuilder = new StringBuilder("onMeasure: width = ");
        stringBuilder.append(size);
        String str2 = ", height = ";
        stringBuilder.append(str2);
        stringBuilder.append(size2);
        stringBuilder.append(", videoWidth = ");
        stringBuilder.append(this.b);
        stringBuilder.append(", videoHeight = ");
        stringBuilder.append(this.c);
        stringBuilder.append(", widthMode = ");
        stringBuilder.append(LayoutUtil.getSpecMode(i));
        stringBuilder.append(", heightMode = ");
        stringBuilder.append(LayoutUtil.getSpecMode(i2));
        Log.v(str, stringBuilder.toString());
        i = this.b;
        if (i > 0) {
            i2 = this.c;
            if (i2 > 0) {
                if (i * size2 > size * i2) {
                    size2 = (i2 * size) / i;
                } else if (i * size2 < size * i2) {
                    size = (i * size2) / i2;
                }
            }
        }
        String str3 = a;
        StringBuilder stringBuilder2 = new StringBuilder("setMeasuredDimension: width = ");
        stringBuilder2.append(size);
        stringBuilder2.append(str2);
        stringBuilder2.append(size2);
        Log.v(str3, stringBuilder2.toString());
        this.e = size2;
        this.d = size;
        setMeasuredDimension(size, size2);
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        String str = a;
        StringBuilder stringBuilder = new StringBuilder("onSizeChanged: width = ");
        stringBuilder.append(i);
        stringBuilder.append(", height = ");
        stringBuilder.append(i2);
        stringBuilder.append(", oldw = ");
        stringBuilder.append(i3);
        stringBuilder.append(", oldh = ");
        stringBuilder.append(i4);
        Log.v(str, stringBuilder.toString());
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void release() {
        Surface surface = this.f;
        if (surface != null) {
            surface.release();
            this.f = null;
        }
    }

    public void setOnFrameAvailableListener(OnFrameAvailableListener onFrameAvailableListener) {
        this.g = onFrameAvailableListener;
    }

    public void setProjectionFormat(ProjectionFormat projectionFormat) {
        if (projectionFormat != ProjectionFormat.NORMAL) {
            StringBuilder stringBuilder = new StringBuilder("Texture view does not support ");
            stringBuilder.append(projectionFormat);
            stringBuilder.append(" format");
            throw new UnsupportedOperationException(stringBuilder.toString());
        }
    }

    public void setSurface(Surface surface) {
        if (this.f != surface) {
            release();
            this.f = surface;
        }
    }

    public void setVideoSize(int i, int i2) {
        this.b = i;
        this.c = i2;
        if (i > 0 && i2 > 0) {
            super.requestLayout();
            super.invalidate();
        }
    }

    public void setVrMode(boolean z) {
        throw new UnsupportedOperationException("Texture view does not support VR mode");
    }
}
