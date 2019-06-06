package com.looksery.sdk.media;

import android.util.Log;
import com.looksery.sdk.audio.AudioTrack;
import com.looksery.sdk.audio.AudioTrack.Client;
import defpackage.bla;
import defpackage.blb;
import defpackage.blp;
import defpackage.blq.a;
import defpackage.bls;
import defpackage.bly;
import defpackage.bsh;
import defpackage.bsj;
import defpackage.bss;
import defpackage.bwu;

class ExoPlayerAudioTrack implements AudioTrack {
    private static final String TAG = "ExoPlayerAudioTrack";
    private final bls mAudioRenderer;
    private Client mClient;
    private final a mEventListener = new a() {
        public void onLoadingChanged(boolean z) {
        }

        public void onPlaybackParametersChanged(blp blp) {
        }

        public void onPlayerError(bla bla) {
            Log.e(ExoPlayerAudioTrack.TAG, "onPlayerError: ", bla);
        }

        public void onPlayerStateChanged(boolean z, int i) {
            if (i == 4) {
                ExoPlayerAudioTrack.this.mPlayer.a(false);
                ExoPlayerAudioTrack.this.mClient.notifyPlaybackComplete();
            }
        }

        public void onPositionDiscontinuity(int i) {
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
    private final blb mPlayer;
    private final bsj mTopLevelMediaSource;

    ExoPlayerAudioTrack(bsj bsj, bls bls, blb blb) {
        if (bls.a() == 1 && blb.n() == 1) {
            this.mAudioRenderer = bls;
            this.mTopLevelMediaSource = bsj;
            this.mPlayer = blb;
            this.mPlayer.a(this.mEventListener);
            return;
        }
        throw new IllegalArgumentException("Player must use exactly one audio renderer");
    }

    public void doPause() {
        this.mPlayer.a(false);
    }

    public void doPlay(int i) {
        this.mPlayer.a(new bsh(this.mTopLevelMediaSource, i));
        this.mPlayer.a(true);
    }

    public void doPlayInfinitely() {
        this.mPlayer.a(new bsh(this.mTopLevelMediaSource));
        this.mPlayer.a(true);
    }

    public void doResume() {
        this.mPlayer.a(true);
    }

    public void doStop() {
        this.mPlayer.d();
    }

    public long getDurationMillis() {
        return this.mPlayer.o().a() ? -2 : this.mPlayer.g();
    }

    public long getPositionMillis() {
        return this.mPlayer.h();
    }

    public void initialize(Client client) {
        this.mClient = client;
    }

    public void release() {
        this.mPlayer.e();
    }

    public void setPositionMillis(long j) {
        this.mPlayer.a(j);
    }

    public void setVolumeGain(float f) {
        this.mPlayer.a(this.mAudioRenderer).a(2).a(Float.valueOf(f)).a();
    }
}
