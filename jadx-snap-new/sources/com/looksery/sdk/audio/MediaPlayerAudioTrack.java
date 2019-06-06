package com.looksery.sdk.audio;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import com.looksery.sdk.audio.AudioTrack.Client;

final class MediaPlayerAudioTrack implements AudioTrack {
    private Client mClient;
    private final long mDurationMillis;
    private MediaPlayer mMediaPlayer;
    private final OnCompletionListener mOnCompletionListener = new OnCompletionListener() {
        public void onCompletion(MediaPlayer mediaPlayer) {
            MediaPlayerAudioTrack.this.onCompletionInternal();
        }
    };
    private volatile int mTimesToPlay;

    MediaPlayerAudioTrack(MediaPlayer mediaPlayer) {
        this.mMediaPlayer = mediaPlayer;
        long duration = (long) this.mMediaPlayer.getDuration();
        if (duration < 0) {
            duration = -1;
        }
        this.mDurationMillis = duration;
    }

    private void onCompletionInternal() {
        synchronized (this.mClient.getSyncLock()) {
            int i = this.mTimesToPlay - 1;
            this.mTimesToPlay = i;
            if (i <= 0) {
                this.mClient.notifyPlaybackComplete();
            } else if (this.mClient.isPlaying()) {
                this.mMediaPlayer.start();
            }
        }
    }

    public final void doPause() {
        this.mMediaPlayer.pause();
    }

    public final void doPlay(int i) {
        this.mMediaPlayer.seekTo(0);
        this.mMediaPlayer.setLooping(false);
        this.mTimesToPlay = i;
        this.mMediaPlayer.setOnCompletionListener(this.mOnCompletionListener);
        this.mMediaPlayer.start();
    }

    public final void doPlayInfinitely() {
        this.mMediaPlayer.seekTo(0);
        this.mMediaPlayer.setLooping(true);
        this.mMediaPlayer.start();
    }

    public final void doResume() {
        this.mMediaPlayer.start();
    }

    public final void doStop() {
        this.mMediaPlayer.pause();
        this.mMediaPlayer.seekTo(0);
    }

    public final long getDurationMillis() {
        return this.mDurationMillis;
    }

    public final long getPositionMillis() {
        return (long) this.mMediaPlayer.getCurrentPosition();
    }

    public final void initialize(Client client) {
        this.mClient = client;
    }

    public final void release() {
        this.mMediaPlayer.setOnCompletionListener(null);
        this.mMediaPlayer.release();
    }

    public final void setPositionMillis(long j) {
        this.mMediaPlayer.seekTo((int) j);
    }

    public final void setVolumeGain(float f) {
        this.mMediaPlayer.setVolume(f, f);
    }
}
