package com.looksery.sdk.audio;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.os.SystemClock;
import com.looksery.sdk.io.ResourceResolver;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

final class MediaPlayerAudioPlayer implements AudioPlayer {
    private static final boolean DEBUG = false;
    private static final String TAG = "com.looksery.sdk.audio.MediaPlayerAudioPlayer";
    private final ExecutorService mExecutorService;
    private final MediaPlayerFactory mMediaPlayerFactory;
    private final Map<String, MediaPlayerWrapper> mMediaPlayers;

    static final class MediaPlayerWrapper {
        private final MediaPlayer mMediaPlayer;
        private volatile boolean mReleased;
        private float mVolume;

        MediaPlayerWrapper(MediaPlayer mediaPlayer) {
            this(mediaPlayer, 1.0f);
        }

        MediaPlayerWrapper(MediaPlayer mediaPlayer, float f) {
            this.mMediaPlayer = mediaPlayer;
            this.mVolume = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MediaPlayerWrapper mediaPlayerWrapper = (MediaPlayerWrapper) obj;
            return Float.compare(mediaPlayerWrapper.mVolume, this.mVolume) != 0 ? false : this.mMediaPlayer.equals(mediaPlayerWrapper.mMediaPlayer);
        }

        /* Access modifiers changed, original: final|declared_synchronized */
        public final synchronized float getVolume() {
            return this.mVolume;
        }

        public final int hashCode() {
            int hashCode = this.mMediaPlayer.hashCode() * 31;
            float f = this.mVolume;
            return hashCode + (f != MapboxConstants.MINIMUM_ZOOM ? Float.floatToIntBits(f) : 0);
        }

        /* Access modifiers changed, original: final|declared_synchronized */
        public final synchronized void release() {
            if (!this.mReleased) {
                this.mReleased = true;
                this.mMediaPlayer.release();
            }
        }

        /* Access modifiers changed, original: final|declared_synchronized */
        public final synchronized void setLooping(boolean z) {
            if (!this.mReleased) {
                this.mMediaPlayer.setLooping(z);
            }
        }

        /* Access modifiers changed, original: final|declared_synchronized */
        public final synchronized void setOnCompletionListener(OnCompletionListener onCompletionListener) {
            if (!this.mReleased) {
                this.mMediaPlayer.setOnCompletionListener(onCompletionListener);
            }
        }

        /* Access modifiers changed, original: final|declared_synchronized */
        public final synchronized void setOnErrorListener(OnErrorListener onErrorListener) {
            if (!this.mReleased) {
                this.mMediaPlayer.setOnErrorListener(onErrorListener);
            }
        }

        /* Access modifiers changed, original: final|declared_synchronized */
        public final synchronized void setVolume(float f) {
            if (!this.mReleased) {
                this.mVolume = f;
                this.mMediaPlayer.setVolume(f, f);
            }
        }

        /* Access modifiers changed, original: final|declared_synchronized */
        public final synchronized void start() {
            if (!this.mReleased) {
                this.mMediaPlayer.start();
            }
        }

        /* Access modifiers changed, original: final|declared_synchronized */
        public final synchronized void stop() {
            if (!this.mReleased) {
                this.mMediaPlayer.stop();
            }
        }
    }

    MediaPlayerAudioPlayer(ResourceResolver resourceResolver, ExecutorService executorService) {
        this(executorService, new DefaultMediaPlayerFactory(resourceResolver));
    }

    MediaPlayerAudioPlayer(ExecutorService executorService, MediaPlayerFactory mediaPlayerFactory) {
        this.mMediaPlayers = new ConcurrentHashMap();
        this.mExecutorService = executorService;
        this.mMediaPlayerFactory = mediaPlayerFactory;
    }

    private MediaPlayerWrapper loadInternal(String str) {
        if (this.mMediaPlayers.containsKey(str)) {
            return (MediaPlayerWrapper) this.mMediaPlayers.get(str);
        }
        MediaPlayer create = this.mMediaPlayerFactory.create(str);
        if (create == null) {
            return null;
        }
        MediaPlayerWrapper mediaPlayerWrapper = new MediaPlayerWrapper(create);
        this.mMediaPlayers.put(str, mediaPlayerWrapper);
        return mediaPlayerWrapper;
    }

    public final boolean canHandle(AudioSampleInfo audioSampleInfo) {
        return true;
    }

    public final boolean isLoaded(AudioSampleInfo audioSampleInfo) {
        return this.mMediaPlayers.containsKey(audioSampleInfo.getResourceUri());
    }

    public final boolean isPlaying(AudioSampleInfo audioSampleInfo) {
        return this.mMediaPlayers.containsKey(audioSampleInfo.getResourceUri());
    }

    public final boolean load(AudioSampleInfo audioSampleInfo) {
        return loadInternal(audioSampleInfo.getResourceUri()) != null;
    }

    public final void play(final AudioSampleInfo audioSampleInfo, final int i, float f) {
        try {
            boolean z = false;
            if (this.mMediaPlayers.containsKey(audioSampleInfo.getResourceUri())) {
                stop(audioSampleInfo, false);
            }
            MediaPlayerWrapper loadInternal = loadInternal(audioSampleInfo.getResourceUri());
            if (loadInternal != null) {
                if (i > 0) {
                    z = true;
                }
                loadInternal.setLooping(z);
                loadInternal.setOnCompletionListener(new OnCompletionListener() {
                    private int mLoops = 0;

                    public void onCompletion(MediaPlayer mediaPlayer) {
                        int i = i;
                        if (i != AudioPlayer.INFINITY_LOOP_COUNT) {
                            int i2 = this.mLoops;
                            if (i2 < i) {
                                this.mLoops = i2 + 1;
                            } else {
                                MediaPlayerAudioPlayer.this.stop(audioSampleInfo, false);
                            }
                        }
                    }
                });
                loadInternal.setOnErrorListener(new OnErrorListener() {
                    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                        MediaPlayerAudioPlayer.this.stop(audioSampleInfo, false);
                        return true;
                    }
                });
                loadInternal.setVolume(f);
                loadInternal.start();
            }
        } catch (Exception unused) {
        }
    }

    public final void setVolume(AudioSampleInfo audioSampleInfo, float f) {
        MediaPlayerWrapper mediaPlayerWrapper = (MediaPlayerWrapper) this.mMediaPlayers.get(audioSampleInfo.getResourceUri());
        if (mediaPlayerWrapper != null) {
            mediaPlayerWrapper.setVolume(f);
        }
    }

    public final void stop(AudioSampleInfo audioSampleInfo, boolean z) {
        final MediaPlayerWrapper mediaPlayerWrapper = (MediaPlayerWrapper) this.mMediaPlayers.remove(audioSampleInfo.getResourceUri());
        if (mediaPlayerWrapper != null) {
            if (z) {
                this.mExecutorService.execute(new Runnable() {
                    public void run() {
                        float volume = mediaPlayerWrapper.getVolume();
                        while (true) {
                            volume -= 0.1f;
                            if (volume > MapboxConstants.MINIMUM_ZOOM) {
                                mediaPlayerWrapper.setVolume(volume);
                                SystemClock.sleep(50);
                            } else {
                                mediaPlayerWrapper.stop();
                                mediaPlayerWrapper.release();
                                return;
                            }
                        }
                    }
                });
                return;
            }
            mediaPlayerWrapper.stop();
            mediaPlayerWrapper.release();
        }
    }

    public final void stopAll() {
        if (!this.mMediaPlayers.isEmpty()) {
            ArrayList<MediaPlayerWrapper> arrayList = new ArrayList(this.mMediaPlayers.values());
            this.mMediaPlayers.clear();
            for (MediaPlayerWrapper mediaPlayerWrapper : arrayList) {
                mediaPlayerWrapper.stop();
                mediaPlayerWrapper.release();
            }
        }
    }
}
