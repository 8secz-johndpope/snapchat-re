package com.brightcove.player.view;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.brightcove.player.display.VideoDisplayComponent;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventType;
import com.brightcove.player.model.Video;
import defpackage.ppy;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;

public class BrightcoveVideoView extends BaseVideoView {
    static final String s = "BrightcoveVideoView";
    private RenderView t;
    private final Callback u = new Callback() {
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            String str = BrightcoveVideoView.s;
            StringBuilder stringBuilder = new StringBuilder("Surface changed to ");
            stringBuilder.append(i2);
            stringBuilder.append(ppy.d);
            stringBuilder.append(i3);
            Log.d(str, stringBuilder.toString());
            BrightcoveVideoView.this.c.surfaceChanged(surfaceHolder, i, i2, i3);
        }

        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            Log.d(BrightcoveVideoView.s, "Surface created.");
            BrightcoveVideoView.this.c.surfaceCreated(surfaceHolder);
            BrightcoveVideoView.this.b.emit(EventType.READY_TO_PLAY);
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            Log.d(BrightcoveVideoView.s, "Surface destroyed.");
            BrightcoveVideoView.this.c.surfaceDestroyed(surfaceHolder);
        }
    };

    public BrightcoveVideoView(Context context) {
        super(context);
    }

    public BrightcoveVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BrightcoveVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* Access modifiers changed, original: protected|final */
    public final void X_() {
        RenderView renderView = this.t;
        if (renderView != null) {
            renderView.setVideoSize(0, 0);
        }
        super.X_();
    }

    /* Access modifiers changed, original: protected */
    public VideoDisplayComponent a(EventEmitter eventEmitter) {
        return new VideoDisplayComponent(this.t, eventEmitter);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(Context context) {
        String str = "Failed to create surface view";
        try {
            Class cls = BrightcoveSurfaceView.class;
            this.t = (RenderView) cls.getConstructors()[0].newInstance(new Object[]{context});
            if (this.t instanceof View) {
                addView((View) this.t);
            } else {
                String str2 = s;
                StringBuilder stringBuilder = new StringBuilder("Render View[ ");
                stringBuilder.append(cls);
                stringBuilder.append("] is not an Android View");
                Log.e(str2, stringBuilder.toString());
            }
            if (this.t instanceof BrightcoveSurfaceView) {
                ((BrightcoveSurfaceView) this.t).setOnFrameAvailableListener(new OnFrameAvailableListener() {
                    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
                        if (BrightcoveVideoView.this.b != null) {
                            BrightcoveVideoView.this.b.emit(EventType.ON_FRAME_AVAILABLE);
                            Video currentVideo = BrightcoveVideoView.this.getCurrentVideo();
                            if (currentVideo != null) {
                                BrightcoveVideoView.this.b.emit(EventType.PROJECTION_FORMAT_CHANGED, Collections.singletonMap("projectionFormat", currentVideo.getProjectionFormat()));
                            }
                        }
                    }
                });
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            Log.e(s, str, e);
        }
        super.a(context);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(LayoutParams layoutParams) {
        int childCount = getChildCount();
        int i = 0;
        Object obj = this.t == null ? 1 : null;
        while (obj == null && i < childCount) {
            if (getChildAt(i).getClass().getName().equals("com.brightcove.ima.GoogleIMAVideoAdPlayer")) {
                obj = 1;
            }
            i++;
        }
        if (obj == null) {
            this.t.setLayoutParams(new FrameLayout.LayoutParams(layoutParams.width, layoutParams.height, 17));
        }
        super.a(layoutParams);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean c() {
        RenderView renderView = this.t;
        return renderView != null && renderView.isShown();
    }

    public RenderView getRenderView() {
        return this.t;
    }

    public SurfaceView getSurfaceView() {
        return (SurfaceView) this.t;
    }

    public int getVideoHeight() {
        RenderView renderView = this.t;
        return renderView == null ? 0 : renderView.getVideoHeight();
    }

    public int getVideoWidth() {
        RenderView renderView = this.t;
        return renderView == null ? 0 : renderView.getVideoWidth();
    }

    /* Access modifiers changed, original: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.t.getHolder().addCallback(this.u);
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.t.getHolder().removeCallback(this.u);
    }
}
