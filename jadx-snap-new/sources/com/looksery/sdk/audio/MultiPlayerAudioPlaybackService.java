package com.looksery.sdk.audio;

import com.looksery.sdk.io.ResourceResolver;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

final class MultiPlayerAudioPlaybackService implements AudioPlaybackService {
    static final long DEFAULT_FADE_DURATION = TimeUnit.SECONDS.toMillis(1);
    static final long FADE_DELAY = 50;
    private final AudioSampleInfoExtractor mAudioSampleInfoExtractor;
    private final Map<String, AudioSampleInfo> mAudioSampleInfoMap = new ConcurrentHashMap();
    private final Map<AudioSampleInfo, Float> mAudioSampleVolumeMap = new HashMap();
    private final ExecutorService mExecutorService;
    private AtomicReference<Fader> mFader = new AtomicReference(null);
    private final AudioPlayer mInMemoryAudioPlayer;
    private AtomicInteger mLastVolumeCommandId = new AtomicInteger();
    private volatile float mMasterVolume = 1.0f;
    private final AudioPlayer mStreamingAudioPlayer;

    class Fader implements Runnable {
        private final int mCommandId;
        private final long mDuration;
        private final float mEndVolume;
        private volatile boolean mShouldStop;

        Fader(int i, float f, long j) {
            this.mCommandId = i;
            this.mEndVolume = f;
            this.mDuration = j;
        }

        public void run() {
            if (MultiPlayerAudioPlaybackService.this.mLastVolumeCommandId.get() == this.mCommandId) {
                long j = this.mDuration / MultiPlayerAudioPlaybackService.FADE_DELAY;
                float access$100 = MultiPlayerAudioPlaybackService.this.mMasterVolume;
                float f = (this.mEndVolume - access$100) / ((float) j);
                long j2 = 1;
                while (j2 < j) {
                    try {
                        if (this.mShouldStop) {
                            break;
                        }
                        MultiPlayerAudioPlaybackService.this.setMasterVolume((((float) j2) * f) + access$100);
                        Thread.sleep(MultiPlayerAudioPlaybackService.FADE_DELAY);
                        j2++;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
                if (!this.mShouldStop) {
                    MultiPlayerAudioPlaybackService.this.setMasterVolume(this.mEndVolume);
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void stopFading() {
            this.mShouldStop = true;
        }
    }

    MultiPlayerAudioPlaybackService(AudioSampleInfoExtractor audioSampleInfoExtractor, AudioPlayer audioPlayer, AudioPlayer audioPlayer2, ExecutorService executorService) {
        this.mAudioSampleInfoExtractor = audioSampleInfoExtractor;
        this.mInMemoryAudioPlayer = audioPlayer;
        this.mStreamingAudioPlayer = audioPlayer2;
        this.mExecutorService = executorService;
    }

    private void applyVolume(AudioSampleInfo audioSampleInfo, float f) {
        this.mInMemoryAudioPlayer.setVolume(audioSampleInfo, f);
        this.mStreamingAudioPlayer.setVolume(audioSampleInfo, f);
    }

    static AudioPlaybackService create(ResourceResolver resourceResolver, ExecutorService executorService) {
        return new MultiPlayerAudioPlaybackService(new MediaExtractorAudioSampleInfoExtractor(resourceResolver), new SoundPoolAudioPlayer(resourceResolver, executorService), new MediaPlayerAudioPlayer(resourceResolver, executorService), executorService);
    }

    private AudioPlayer getAudioPlayerFor(AudioSampleInfo audioSampleInfo) {
        AudioPlayer audioPlayer = this.mStreamingAudioPlayer;
        if (!this.mInMemoryAudioPlayer.canHandle(audioSampleInfo)) {
            return audioPlayer;
        }
        if (this.mInMemoryAudioPlayer.isLoaded(audioSampleInfo)) {
            return this.mInMemoryAudioPlayer;
        }
        this.mInMemoryAudioPlayer.load(audioSampleInfo);
        return this.mStreamingAudioPlayer;
    }

    private AudioSampleInfo getAudioSampleInfoFor(String str, boolean z) {
        AudioSampleInfo audioSampleInfo = (AudioSampleInfo) this.mAudioSampleInfoMap.get(str);
        if (z && audioSampleInfo == null) {
            audioSampleInfo = this.mAudioSampleInfoExtractor.extract(str);
            if (audioSampleInfo != null) {
                this.mAudioSampleInfoMap.put(str, audioSampleInfo);
            }
        }
        return audioSampleInfo == null ? AudioSampleInfo.create(str).durationUs(Long.MAX_VALUE).build() : audioSampleInfo;
    }

    private void setMasterVolume(float f) {
        this.mMasterVolume = f;
        for (Entry entry : this.mAudioSampleVolumeMap.entrySet()) {
            applyVolume((AudioSampleInfo) entry.getKey(), ((Float) entry.getValue()).floatValue() * f);
        }
    }

    public final boolean isPlaying(String str) {
        AudioSampleInfo audioSampleInfoFor = getAudioSampleInfoFor(str, false);
        return this.mInMemoryAudioPlayer.isPlaying(audioSampleInfoFor) || this.mStreamingAudioPlayer.isPlaying(audioSampleInfoFor);
    }

    public final void play(String str, int i) {
        AudioSampleInfo audioSampleInfoFor = getAudioSampleInfoFor(str, true);
        this.mAudioSampleVolumeMap.put(audioSampleInfoFor, Float.valueOf(1.0f));
        getAudioPlayerFor(audioSampleInfoFor).play(audioSampleInfoFor, i, this.mMasterVolume);
    }

    public final void setVolume(float f, boolean z) {
        Fader fader;
        if (z) {
            Fader fader2;
            do {
                fader = (Fader) this.mFader.get();
                fader2 = new Fader(this.mLastVolumeCommandId.incrementAndGet(), f, DEFAULT_FADE_DURATION);
            } while (!this.mFader.compareAndSet(fader, fader2));
            this.mExecutorService.execute(fader2);
            return;
        }
        do {
            fader = (Fader) this.mFader.get();
            if (fader != null) {
                fader.stopFading();
            }
            setMasterVolume(f);
        } while (!this.mFader.compareAndSet(fader, null));
    }

    public final void setVolume(String str, float f) {
        AudioSampleInfo audioSampleInfoFor = getAudioSampleInfoFor(str, false);
        this.mAudioSampleVolumeMap.put(audioSampleInfoFor, Float.valueOf(f));
        applyVolume(audioSampleInfoFor, f * this.mMasterVolume);
    }

    public final void stop(String str, boolean z) {
        AudioSampleInfo audioSampleInfoFor = getAudioSampleInfoFor(str, false);
        this.mInMemoryAudioPlayer.stop(audioSampleInfoFor, z);
        this.mStreamingAudioPlayer.stop(audioSampleInfoFor, z);
        this.mAudioSampleInfoMap.remove(str);
    }

    public final void stopAll() {
        this.mInMemoryAudioPlayer.stopAll();
        this.mStreamingAudioPlayer.stopAll();
        this.mAudioSampleInfoMap.clear();
    }
}
