package com.looksery.sdk.media;

import android.util.Log;
import defpackage.bla;
import defpackage.blp;
import defpackage.blq.a;
import defpackage.blx;
import defpackage.bly;
import defpackage.bsj;
import defpackage.bss;
import defpackage.bwu;
import defpackage.bzw;

class ExoPlayerVideoStream extends SurfaceVideoStream {
    private static final String TAG = "ExoPlayerVideoStream";
    private final a mEventListener = new a() {
        public void onLoadingChanged(boolean z) {
        }

        public void onPlaybackParametersChanged(blp blp) {
        }

        public void onPlayerError(bla bla) {
            Log.e(ExoPlayerVideoStream.TAG, "onPlayerError: ", bla);
        }

        public void onPlayerStateChanged(boolean z, int i) {
            if (i == 4 && ExoPlayerVideoStream.this.mPlaybackState != 4 && ExoPlayerVideoStream.this.mPlayer.c() == 0) {
                ExoPlayerVideoStream.this.mPlayCount = ExoPlayerVideoStream.this.mPlayCount + 1;
            }
            ExoPlayerVideoStream.this.mPlaybackState = i;
        }

        public void onPositionDiscontinuity(int i) {
            if (i == 0 && ExoPlayerVideoStream.this.mPlayer.c() == 2) {
                ExoPlayerVideoStream.this.mPlayCount = ExoPlayerVideoStream.this.mPlayCount + 1;
            }
        }

        public void onRepeatModeChanged(int i) {
        }

        public void onSeekProcessed() {
        }

        public void onShuffleModeEnabledChanged(boolean z) {
        }

        public void onTimelineChanged(bly bly, Object obj, int i) {
        }

        public void onTracksChanged(bss bss, bwu bwu) {
        }
    };
    private volatile boolean mGotFirstFrame;
    private volatile int mHeight;
    private final bsj mMediaSource;
    private volatile int mPlayCount;
    private volatile int mPlaybackState;
    private final blx mPlayer;
    private final bzw mVideoEventListener = new bzw() {
        public void onRenderedFirstFrame() {
            ExoPlayerVideoStream.this.mGotFirstFrame = true;
        }

        public void onVideoSizeChanged(int i, int i2, int i3, float f) {
            ExoPlayerVideoStream.this.mWidth = i;
            ExoPlayerVideoStream.this.mHeight = i2;
        }
    };
    private volatile int mWidth;

    ExoPlayerVideoStream(blx blx, bsj bsj) {
        this.mPlayer = blx;
        this.mMediaSource = bsj;
        this.mPlaybackState = 1;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getPlayCount() {
        return this.mPlayCount;
    }

    public float getVolume() {
        checkIfReleased();
        return this.mPlayer.p;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public boolean isReady() {
        checkIfReleased();
        return this.mPlayer.a() == 3 && this.mGotFirstFrame;
    }

    public void pause() {
        this.mPlayer.a(false);
    }

    public void prepare(boolean z, float f, float f2) {
        this.mPlayer.a(this.mEventListener);
        this.mPlayer.a(this.mVideoEventListener);
        this.mPlayer.a(z ? 2 : 0);
        this.mPlayer.a(new blp(f));
        this.mPlayer.a(f2);
        this.mPlayer.a(prepareSurface(), false);
        this.mPlayer.a(this.mMediaSource, true, true);
        this.mPlayer.a(true);
    }

    public void release() {
        this.mPlayer.b(false);
        this.mPlayer.e();
        super.release();
    }

    public void resume() {
        this.mPlayer.a(true);
    }

    public void setVolume(float f) {
        checkIfReleased();
        this.mPlayer.a(f);
    }
}
