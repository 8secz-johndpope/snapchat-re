package com.brightcove.player.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View.MeasureSpec;
import com.brightcove.player.model.Video.ProjectionFormat;
import com.brightcove.player.util.LayoutUtil;
import com.brightcove.player.video360.RenderThread;

public class BrightcoveSurfaceView extends SurfaceView implements OnFrameAvailableListener, RenderView {
    private static final String c = "BrightcoveSurfaceView";
    OnFrameAvailableListener a;
    RenderThread b;
    private int d;
    private int e;
    private int f;
    private int g;
    private final a h = new a(this, (byte) 0);
    private Handler i = new Handler();
    private ProjectionFormat j = ProjectionFormat.NORMAL;
    private final Callback k = new Callback() {
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            if (BrightcoveSurfaceView.this.isVideo360Supported() && BrightcoveSurfaceView.this.b != null) {
                BrightcoveSurfaceView.this.b.notifySurfaceChanged(surfaceHolder.getSurface(), i2, i3);
            }
        }

        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (BrightcoveSurfaceView.this.isVideo360Mode()) {
                BrightcoveSurfaceView.this.a();
            }
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            BrightcoveSurfaceView.this.b();
        }
    };

    class a implements SurfaceHolder {
        Surface a;

        /* renamed from: com.brightcove.player.view.BrightcoveSurfaceView$a$1 */
        class AnonymousClass1 implements Runnable {
            private /* synthetic */ Surface a;

            AnonymousClass1(Surface surface) {
                this.a = surface;
            }

            public final void run() {
                a.this.a = this.a;
            }
        }

        private a() {
        }

        /* synthetic */ a(BrightcoveSurfaceView brightcoveSurfaceView, byte b) {
            this();
        }

        public final void addCallback(Callback callback) {
            BrightcoveSurfaceView.this.getBaseHolder().addCallback(callback);
        }

        public final Surface getSurface() {
            Surface surface = this.a;
            return surface == null ? BrightcoveSurfaceView.this.getBaseHolder().getSurface() : surface;
        }

        public final Rect getSurfaceFrame() {
            return BrightcoveSurfaceView.this.getBaseHolder().getSurfaceFrame();
        }

        public final boolean isCreating() {
            return BrightcoveSurfaceView.this.getBaseHolder().isCreating();
        }

        public final Canvas lockCanvas() {
            return BrightcoveSurfaceView.this.getBaseHolder().lockCanvas();
        }

        public final Canvas lockCanvas(Rect rect) {
            return BrightcoveSurfaceView.this.getBaseHolder().lockCanvas(rect);
        }

        public final void removeCallback(Callback callback) {
            BrightcoveSurfaceView.this.getBaseHolder().removeCallback(callback);
        }

        public final void setFixedSize(int i, int i2) {
            BrightcoveSurfaceView.this.getBaseHolder().setFixedSize(i, i2);
        }

        public final void setFormat(int i) {
            BrightcoveSurfaceView.this.getBaseHolder().setFormat(i);
        }

        public final void setKeepScreenOn(boolean z) {
            BrightcoveSurfaceView.this.getBaseHolder().setKeepScreenOn(z);
        }

        public final void setSizeFromLayout() {
            BrightcoveSurfaceView.this.getBaseHolder().setSizeFromLayout();
        }

        public final void setType(int i) {
            BrightcoveSurfaceView.this.getBaseHolder().setType(i);
        }

        public final void unlockCanvasAndPost(Canvas canvas) {
            BrightcoveSurfaceView.this.getBaseHolder().unlockCanvasAndPost(canvas);
        }
    }

    public BrightcoveSurfaceView(Context context) {
        super(context);
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        if (isVideo360Supported()) {
            this.b = new RenderThread(this);
            this.b.start();
            SurfaceHolder holder = getHolder();
            Rect surfaceFrame = holder.getSurfaceFrame();
            this.b.notifySurfaceAvailable(holder.getSurface(), surfaceFrame.width(), surfaceFrame.height());
            this.b.setOnFrameAvailableListener(this);
        }
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        if (isVideo360Supported()) {
            RenderThread renderThread = this.b;
            if (renderThread != null) {
                renderThread.notifySurfaceDestroyed();
                this.b = null;
                setSurface(null);
            }
        }
    }

    public SurfaceHolder getBaseHolder() {
        return super.getHolder();
    }

    public SurfaceHolder getHolder() {
        return this.h;
    }

    public int getMeasuredVideoHeight() {
        return this.g;
    }

    public int getMeasuredVideoWidth() {
        return this.f;
    }

    public ProjectionFormat getProjectionFormat() {
        return this.j;
    }

    public Surface getSurface() {
        return this.h.getSurface();
    }

    public int getVideoHeight() {
        return this.e;
    }

    public int getVideoWidth() {
        return this.d;
    }

    public boolean isVideo360Mode() {
        return this.j != ProjectionFormat.NORMAL;
    }

    public boolean isVideo360Supported() {
        return VERSION.SDK_INT >= 17;
    }

    @TargetApi(17)
    public boolean isVrMode() {
        RenderThread renderThread = this.b;
        return renderThread != null && renderThread.isVrMode();
    }

    /* Access modifiers changed, original: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getHolder().addCallback(this.k);
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getHolder().removeCallback(this.k);
    }

    public void onFrameAvailable(final SurfaceTexture surfaceTexture) {
        this.i.post(new Runnable() {
            public final void run() {
                if (BrightcoveSurfaceView.this.a != null) {
                    BrightcoveSurfaceView.this.a.onFrameAvailable(surfaceTexture);
                }
            }
        });
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        String str = c;
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
        String str = c;
        StringBuilder stringBuilder = new StringBuilder("onMeasure: width = ");
        stringBuilder.append(size);
        String str2 = ", height = ";
        stringBuilder.append(str2);
        stringBuilder.append(size2);
        stringBuilder.append(", videoWidth = ");
        stringBuilder.append(this.d);
        stringBuilder.append(", videoHeight = ");
        stringBuilder.append(this.e);
        stringBuilder.append(", widthMode = ");
        stringBuilder.append(LayoutUtil.getSpecMode(i));
        stringBuilder.append(", heightMode = ");
        stringBuilder.append(LayoutUtil.getSpecMode(i2));
        Log.v(str, stringBuilder.toString());
        i = this.d;
        if (i > 0) {
            i2 = this.e;
            if (i2 > 0) {
                if (i * size2 > size * i2) {
                    size2 = (i2 * size) / i;
                } else if (i * size2 < size * i2) {
                    size = (i * size2) / i2;
                }
            }
        }
        String str3 = c;
        StringBuilder stringBuilder2 = new StringBuilder("setMeasuredDimension: width = ");
        stringBuilder2.append(size);
        stringBuilder2.append(str2);
        stringBuilder2.append(size2);
        Log.v(str3, stringBuilder2.toString());
        this.g = size2;
        this.f = size;
        setMeasuredDimension(size, size2);
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        String str = c;
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
    }

    public void setOnFrameAvailableListener(OnFrameAvailableListener onFrameAvailableListener) {
        this.a = onFrameAvailableListener;
    }

    public void setProjectionFormat(ProjectionFormat projectionFormat) {
        if (projectionFormat == null) {
            projectionFormat = ProjectionFormat.NORMAL;
        }
        if (this.j != projectionFormat) {
            b();
            this.j = projectionFormat;
            if (isVideo360Mode()) {
                a();
            }
        }
    }

    public void setSurface(Surface surface) {
        a aVar = this.h;
        BrightcoveSurfaceView.this.i.post(new AnonymousClass1(surface));
    }

    public void setVideoSize(int i, int i2) {
        this.d = i;
        this.e = i2;
        if (i > 0 && i2 > 0) {
            super.requestLayout();
            super.invalidate();
        }
    }

    public void setVrMode(boolean z) {
        if (isVideo360Supported()) {
            RenderThread renderThread = this.b;
            if (renderThread != null) {
                renderThread.setVrMode(z);
            }
        }
    }
}
