package com.looksery.sdk.audio;

import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.media.SoundPool.Builder;
import android.media.SoundPool.OnLoadCompleteListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.looksery.sdk.io.ResourceResolver;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

final class SoundPoolAudioPlayer implements AudioPlayer {
    private static final boolean DEBUG = false;
    private static final int MAX_CONCURRENT_STREAMS = 16;
    private static final int MAX_MEMORY_PER_STREAM_MB = 1;
    private static final String TAG = "SoundPoolAudioPlayer";
    private final Map<AudioSample, Runnable> mDelayedCleanups = new ConcurrentHashMap();
    private final Map<Integer, PlaybackInfo> mDelayedPlaybacks = new ConcurrentHashMap();
    private final ExecutorService mExecutorService;
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private final Map<AudioSampleInfo, AudioSample> mInfoToAudioSampleMap = new ConcurrentHashMap();
    private final Set<Integer> mLoadedSoundIds = new CopyOnWriteArraySet();
    private final ResourceResolver mResourceResolver;
    private final Map<AudioSample, PlaybackStream> mSoundIdToPlaybackStreamMap = new ConcurrentHashMap();
    private final AtomicReference<SoundPool> mSoundPool = new AtomicReference();

    static final class AudioSample {
        final AudioSampleInfo mInfo;
        final int mSoundPoolSoundId;

        AudioSample(AudioSampleInfo audioSampleInfo, int i) {
            this.mInfo = audioSampleInfo;
            this.mSoundPoolSoundId = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AudioSample audioSample = (AudioSample) obj;
            return this.mSoundPoolSoundId != audioSample.mSoundPoolSoundId ? false : this.mInfo.equals(audioSample.mInfo);
        }

        public final int hashCode() {
            return (this.mInfo.hashCode() * 31) + this.mSoundPoolSoundId;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("AudioSample{info=");
            stringBuilder.append(this.mInfo);
            stringBuilder.append(", soundPoolSoundId=");
            stringBuilder.append(this.mSoundPoolSoundId);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    static final class PlaybackInfo {
        final AudioSample mAudioSample;
        final int mLoopsCount;
        final float mVolume;

        PlaybackInfo(AudioSample audioSample, int i, float f) {
            this.mAudioSample = audioSample;
            this.mLoopsCount = i;
            this.mVolume = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            PlaybackInfo playbackInfo = (PlaybackInfo) obj;
            return (this.mLoopsCount == playbackInfo.mLoopsCount && Float.compare(playbackInfo.mVolume, this.mVolume) == 0) ? this.mAudioSample.equals(playbackInfo.mAudioSample) : false;
        }

        public final int hashCode() {
            int hashCode = ((this.mAudioSample.hashCode() * 31) + this.mLoopsCount) * 31;
            float f = this.mVolume;
            return hashCode + (f != MapboxConstants.MINIMUM_ZOOM ? Float.floatToIntBits(f) : 0);
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("PlaybackInfo{audioSample=");
            stringBuilder.append(this.mAudioSample);
            stringBuilder.append(", loopsCount=");
            stringBuilder.append(this.mLoopsCount);
            stringBuilder.append(", volume=");
            stringBuilder.append(this.mVolume);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    static final class PlaybackStream {
        final PlaybackInfo mPlaybackInfo;
        final int mStreamId;

        PlaybackStream(PlaybackInfo playbackInfo, int i) {
            this.mPlaybackInfo = playbackInfo;
            this.mStreamId = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            PlaybackStream playbackStream = (PlaybackStream) obj;
            return this.mStreamId != playbackStream.mStreamId ? false : this.mPlaybackInfo.equals(playbackStream.mPlaybackInfo);
        }

        public final int hashCode() {
            return (this.mPlaybackInfo.hashCode() * 31) + this.mStreamId;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("PlaybackStream{playbackInfo=");
            stringBuilder.append(this.mPlaybackInfo);
            stringBuilder.append(", streamId=");
            stringBuilder.append(this.mStreamId);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    SoundPoolAudioPlayer(ResourceResolver resourceResolver, ExecutorService executorService) {
        this.mResourceResolver = resourceResolver;
        this.mExecutorService = executorService;
    }

    private SoundPool getSoundPool() {
        SoundPool soundPool = (SoundPool) this.mSoundPool.get();
        if (soundPool == null) {
            soundPool = VERSION.SDK_INT >= 21 ? new Builder().setAudioAttributes(new AudioAttributes.Builder().build()).setMaxStreams(16).build() : new SoundPool(16, 3, 0);
            soundPool.setOnLoadCompleteListener(new OnLoadCompleteListener() {
                public void onLoadComplete(SoundPool soundPool, int i, int i2) {
                    PlaybackInfo playbackInfo = (PlaybackInfo) SoundPoolAudioPlayer.this.mDelayedPlaybacks.remove(Integer.valueOf(i));
                    if (i2 == 0) {
                        SoundPoolAudioPlayer.this.mLoadedSoundIds.add(Integer.valueOf(i));
                        if (playbackInfo != null) {
                            SoundPoolAudioPlayer.this.playInternal(playbackInfo);
                        }
                    }
                }
            });
            this.mSoundPool.set(soundPool);
        }
        return soundPool;
    }

    private AudioSample loadInternal(AudioSampleInfo audioSampleInfo) {
        AudioSample audioSample = (AudioSample) this.mInfoToAudioSampleMap.get(audioSampleInfo);
        if (audioSample != null) {
            return audioSample;
        }
        int loadSoundStream;
        try {
            loadSoundStream = loadSoundStream(audioSampleInfo.getResourceUri());
        } catch (Exception unused) {
            loadSoundStream = -1;
        }
        if (loadSoundStream == -1) {
            return audioSample;
        }
        audioSample = new AudioSample(audioSampleInfo, loadSoundStream);
        this.mInfoToAudioSampleMap.put(audioSampleInfo, audioSample);
        return audioSample;
    }

    private int loadSoundStream(String str) {
        String str2 = "close failed:";
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            assetFileDescriptor = this.mResourceResolver.openResourceFd(Uri.parse(str));
            int load = getSoundPool().load(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength(), 1);
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException e) {
                    Log.e(TAG, str2, e);
                }
            }
            return load;
        } catch (Throwable th) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException e2) {
                    Log.e(TAG, str2, e2);
                }
            }
        }
    }

    private void playInternal(final PlaybackInfo playbackInfo) {
        int i = playbackInfo.mLoopsCount >= AudioPlayer.INFINITY_LOOP_COUNT ? -1 : playbackInfo.mLoopsCount;
        int play = getSoundPool().play(playbackInfo.mAudioSample.mSoundPoolSoundId, playbackInfo.mVolume, playbackInfo.mVolume, 0, i, 1.0f);
        if (play != 0) {
            PlaybackStream playbackStream = (PlaybackStream) this.mSoundIdToPlaybackStreamMap.put(playbackInfo.mAudioSample, new PlaybackStream(playbackInfo, play));
            if (playbackStream != null) {
                stopStream(playbackStream, false);
            }
            if (i != -1) {
                long toMillis = TimeUnit.MICROSECONDS.toMillis(playbackInfo.mAudioSample.mInfo.getDurationUs());
                if (i > 0) {
                    toMillis *= (long) i;
                }
                AnonymousClass1 anonymousClass1 = new Runnable() {
                    public void run() {
                        SoundPoolAudioPlayer.this.mDelayedCleanups.remove(playbackInfo.mAudioSample);
                        SoundPoolAudioPlayer.this.mSoundIdToPlaybackStreamMap.remove(playbackInfo.mAudioSample);
                    }
                };
                Runnable runnable = (Runnable) this.mDelayedCleanups.put(playbackInfo.mAudioSample, anonymousClass1);
                if (runnable != null) {
                    this.mHandler.removeCallbacks(runnable);
                }
                this.mHandler.postDelayed(anonymousClass1, toMillis);
            }
        }
    }

    private void releaseSoundPool() {
        SoundPool soundPool = (SoundPool) this.mSoundPool.getAndSet(null);
        if (soundPool != null) {
            soundPool.release();
        }
    }

    private void setVolumeInternal(AudioSample audioSample, float f) {
        PlaybackStream playbackStream = (PlaybackStream) this.mSoundIdToPlaybackStreamMap.get(audioSample);
        if (playbackStream != null) {
            PlaybackStream playbackStream2 = new PlaybackStream(new PlaybackInfo(playbackStream.mPlaybackInfo.mAudioSample, playbackStream.mPlaybackInfo.mLoopsCount, f), playbackStream.mStreamId);
            this.mSoundIdToPlaybackStreamMap.put(audioSample, playbackStream2);
            getSoundPool().setVolume(playbackStream2.mStreamId, f, f);
        }
    }

    private void stopAudioSample(AudioSample audioSample, boolean z) {
        this.mDelayedPlaybacks.remove(Integer.valueOf(audioSample.mSoundPoolSoundId));
        PlaybackStream playbackStream = (PlaybackStream) this.mSoundIdToPlaybackStreamMap.remove(audioSample);
        if (playbackStream != null) {
            stopStream(playbackStream, z);
        }
    }

    private void stopStream(final PlaybackStream playbackStream, boolean z) {
        if (z) {
            this.mExecutorService.execute(new Runnable() {
                public void run() {
                    float f = playbackStream.mPlaybackInfo.mVolume;
                    while (true) {
                        f -= 0.1f;
                        if (f > MapboxConstants.MINIMUM_ZOOM) {
                            SoundPoolAudioPlayer.this.getSoundPool().setVolume(playbackStream.mStreamId, f, f);
                            SystemClock.sleep(50);
                        } else {
                            SoundPoolAudioPlayer.this.getSoundPool().stop(playbackStream.mStreamId);
                            return;
                        }
                    }
                }
            });
        } else {
            getSoundPool().stop(playbackStream.mStreamId);
        }
    }

    public final boolean canHandle(AudioSampleInfo audioSampleInfo) {
        return audioSampleInfo.getEstimatedInMemorySizeMb() > MapboxConstants.MINIMUM_ZOOM && audioSampleInfo.getEstimatedInMemorySizeMb() < 1.0f && audioSampleInfo.getDurationUs() > 0;
    }

    public final boolean isLoaded(AudioSampleInfo audioSampleInfo) {
        AudioSample audioSample = (AudioSample) this.mInfoToAudioSampleMap.get(audioSampleInfo);
        return audioSample != null && this.mLoadedSoundIds.contains(Integer.valueOf(audioSample.mSoundPoolSoundId));
    }

    public final boolean isPlaying(AudioSampleInfo audioSampleInfo) {
        AudioSample audioSample = (AudioSample) this.mInfoToAudioSampleMap.get(audioSampleInfo);
        return audioSample != null && this.mSoundIdToPlaybackStreamMap.containsKey(audioSample);
    }

    public final boolean load(AudioSampleInfo audioSampleInfo) {
        return loadInternal(audioSampleInfo) != null;
    }

    public final void play(AudioSampleInfo audioSampleInfo, int i, float f) {
        AudioSample loadInternal = loadInternal(audioSampleInfo);
        if (loadInternal != null) {
            PlaybackInfo playbackInfo = new PlaybackInfo(loadInternal, i, f);
            if (this.mLoadedSoundIds.contains(Integer.valueOf(loadInternal.mSoundPoolSoundId))) {
                playInternal(playbackInfo);
            } else {
                this.mDelayedPlaybacks.put(Integer.valueOf(loadInternal.mSoundPoolSoundId), playbackInfo);
            }
        }
    }

    public final void setVolume(AudioSampleInfo audioSampleInfo, float f) {
        AudioSample audioSample = (AudioSample) this.mInfoToAudioSampleMap.get(audioSampleInfo);
        if (audioSample != null) {
            PlaybackInfo playbackInfo = (PlaybackInfo) this.mDelayedPlaybacks.get(Integer.valueOf(audioSample.mSoundPoolSoundId));
            if (playbackInfo != null) {
                this.mDelayedPlaybacks.put(Integer.valueOf(audioSample.mSoundPoolSoundId), new PlaybackInfo(playbackInfo.mAudioSample, playbackInfo.mLoopsCount, f));
                return;
            }
            setVolumeInternal(audioSample, f);
        }
    }

    public final void stop(AudioSampleInfo audioSampleInfo, boolean z) {
        AudioSample audioSample = (AudioSample) this.mInfoToAudioSampleMap.get(audioSampleInfo);
        if (audioSample != null) {
            stopAudioSample(audioSample, z);
        }
    }

    public final void stopAll() {
        if (!this.mInfoToAudioSampleMap.isEmpty()) {
            for (AudioSample audioSample : this.mInfoToAudioSampleMap.values()) {
                stopAudioSample(audioSample, false);
                getSoundPool().unload(audioSample.mSoundPoolSoundId);
            }
            this.mInfoToAudioSampleMap.clear();
            this.mLoadedSoundIds.clear();
            this.mDelayedPlaybacks.clear();
            this.mSoundIdToPlaybackStreamMap.clear();
            this.mDelayedCleanups.clear();
            this.mHandler.removeCallbacksAndMessages(null);
            releaseSoundPool();
        }
    }
}
