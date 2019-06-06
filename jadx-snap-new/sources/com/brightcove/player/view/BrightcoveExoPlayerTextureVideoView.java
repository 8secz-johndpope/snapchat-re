package com.brightcove.player.view;

import android.content.Context;
import android.util.AttributeSet;
import com.brightcove.player.controller.DefaultSourceSelectionController;
import com.brightcove.player.controller.ExoPlayerSourceSelectionController;
import com.brightcove.player.display.ExoPlayerVideoDisplayComponent;
import com.brightcove.player.display.VideoDisplayComponent;
import com.brightcove.player.event.EventEmitter;

public class BrightcoveExoPlayerTextureVideoView extends BrightcoveTextureVideoView {
    static {
        BrightcoveExoPlayerVideoView.class.getSimpleName();
    }

    public BrightcoveExoPlayerTextureVideoView(Context context) {
        super(context);
    }

    public BrightcoveExoPlayerTextureVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BrightcoveExoPlayerTextureVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean V_() {
        return ((ExoPlayerVideoDisplayComponent) this.c).getExoPlayer() != null;
    }

    /* Access modifiers changed, original: protected|final */
    public final void W_() {
        if (this.o != null) {
            this.o.onPrepared(null);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final VideoDisplayComponent a(EventEmitter eventEmitter) {
        return new ExoPlayerVideoDisplayComponent(this.t, eventEmitter);
    }

    /* Access modifiers changed, original: protected|final */
    public final DefaultSourceSelectionController b(EventEmitter eventEmitter) {
        return new ExoPlayerSourceSelectionController(eventEmitter);
    }

    public boolean isHlsRecommended() {
        return true;
    }

    public void seekToLive() {
        int liveEdge = ((ExoPlayerVideoDisplayComponent) this.c).getLiveEdge();
        if (liveEdge != -1 && getCurrentPosition() < liveEdge) {
            seekTo(liveEdge);
        }
    }
}
