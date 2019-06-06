package com.brightcove.player.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.util.Log;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.brightcove.player.display.VideoDisplayComponent;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventType;

@TargetApi(14)
public class BrightcoveTextureVideoView extends BaseVideoView {
    static final String s = "BrightcoveTextureVideoView";
    protected BrightcoveTextureView t;
    private a u;

    class a implements SurfaceTextureListener {
        private a() {
        }

        /* synthetic */ a(BrightcoveTextureVideoView brightcoveTextureVideoView, byte b) {
            this();
        }

        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            Log.d(BrightcoveTextureVideoView.s, "Texture available");
            BrightcoveTextureVideoView.this.b.emit(EventType.READY_TO_PLAY);
            BrightcoveTextureVideoView.this.c.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            Log.d(BrightcoveTextureVideoView.s, "Texture destroyed");
            BrightcoveTextureVideoView.this.c.onSurfaceTextureDestroyed(surfaceTexture);
            return true;
        }

        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            Log.d(BrightcoveTextureVideoView.s, "Texture size changed");
            BrightcoveTextureVideoView.this.c.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }

        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            BrightcoveTextureVideoView.this.c.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    public BrightcoveTextureVideoView(Context context) {
        super(context);
    }

    public BrightcoveTextureVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BrightcoveTextureVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* Access modifiers changed, original: protected|final */
    public final void X_() {
        BrightcoveTextureView brightcoveTextureView = this.t;
        if (brightcoveTextureView != null) {
            brightcoveTextureView.setVideoSize(0, 0);
        }
        super.X_();
    }

    /* Access modifiers changed, original: protected */
    public VideoDisplayComponent a(EventEmitter eventEmitter) {
        return new VideoDisplayComponent(this.t, eventEmitter);
    }

    /* Access modifiers changed, original: protected */
    public void a(Context context) {
        Log.i(s, "init");
        this.t = new BrightcoveTextureView(context);
        this.u = new a(this, (byte) 0);
        this.t.setSurfaceTextureListener(this.u);
        addView(this.t);
        super.a(context);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(LayoutParams layoutParams) {
        this.t.setLayoutParams(new FrameLayout.LayoutParams(layoutParams.width, layoutParams.height, 17));
        super.a(layoutParams);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean c() {
        return this.t.isShown();
    }

    public int getMeasuredVideoHeight() {
        return this.t.getMeasuredVideoHeight();
    }

    public int getMeasuredVideoWidth() {
        return this.t.getMeasuredVideoWidth();
    }

    public RenderView getRenderView() {
        return this.t;
    }

    public TextureView getTextureView() {
        return this.t;
    }

    public int getVideoHeight() {
        return this.t.getVideoHeight();
    }

    public int getVideoWidth() {
        return this.t.getVideoWidth();
    }
}
