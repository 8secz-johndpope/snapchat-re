package com.looksery.sdk.audio;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.looksery.sdk.io.ResourceResolver;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

final class DefaultScenariumAudioPlaybackService implements ScenariumAudioPlaybackService {
    private static final long VOLUME_TRANSITION_DURATION = TimeUnit.SECONDS.toMillis(1);
    private final AudioTrackFactory mAudioTrackFactory;
    private final ConcurrentMap<Integer, AudioTrackHolder> mAudioTracks;
    private volatile float mGlobalVolumeGain;
    private final ResourceResolver mResourceResolver;
    private final VolumeAdjuster mVolumeAdjuster;
    private final AdjustingDriver mVolumeDriver;

    interface VolumeAdjuster {

        public interface AdjustingDriver {
            void onAdjustVolume(float f);
        }

        void adjust(AdjustingDriver adjustingDriver, float f, float f2, boolean z);

        void shutdown();

        void start();
    }

    static class ValueAnimatorVolumeAdjuster implements VolumeAdjuster {
        private static final String TAG = "ValueAnimatorAdjuster";
        private volatile HandlerThread mAnimationThread;
        private AdjustingDriver mDriver;
        private volatile Handler mHandler;
        private final ValueAnimator mVolumeAnimator = new ValueAnimator();
        private final AnimatorUpdateListener mVolumeUpdateListener = new AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ValueAnimatorVolumeAdjuster.this.mDriver.onAdjustVolume(((Float) ValueAnimatorVolumeAdjuster.this.mVolumeAnimator.getAnimatedValue()).floatValue());
            }
        };

        ValueAnimatorVolumeAdjuster(long j) {
            this.mVolumeAnimator.addUpdateListener(this.mVolumeUpdateListener);
            this.mVolumeAnimator.setDuration(j);
        }

        public void adjust(AdjustingDriver adjustingDriver, float f, float f2, boolean z) {
            Handler handler = this.mHandler;
            String str = TAG;
            if (handler != null) {
                final AdjustingDriver adjustingDriver2 = adjustingDriver;
                final boolean z2 = z;
                final float f3 = f;
                final float f4 = f2;
                if (!this.mHandler.post(new Runnable() {
                    public void run() {
                        if (ValueAnimatorVolumeAdjuster.this.mVolumeAnimator.isRunning()) {
                            ValueAnimatorVolumeAdjuster.this.mVolumeAnimator.cancel();
                        }
                        ValueAnimatorVolumeAdjuster.this.mDriver = adjustingDriver2;
                        if (z2) {
                            ValueAnimatorVolumeAdjuster.this.mVolumeAnimator.setFloatValues(new float[]{f3, f4});
                            ValueAnimatorVolumeAdjuster.this.mVolumeAnimator.start();
                            return;
                        }
                        ValueAnimatorVolumeAdjuster.this.mDriver.onAdjustVolume(f4);
                    }
                })) {
                    Log.w(str, "adjust: failed to post task");
                }
            } else if (z) {
                Log.w(str, "adjust: smooth mode unavailable");
            } else {
                adjustingDriver.onAdjustVolume(f2);
            }
        }

        public void shutdown() {
            this.mAnimationThread.quit();
            this.mAnimationThread = null;
            this.mHandler = null;
        }

        public void start() {
            this.mAnimationThread = new HandlerThread("LSVolumeAdjuster");
            this.mAnimationThread.start();
            this.mHandler = new Handler(this.mAnimationThread.getLooper());
        }
    }

    static class AudioTrackHolder {
        final AudioTrackDescriptor track;
        float trackVolume = 1.0f;

        AudioTrackHolder(AudioTrackDescriptor audioTrackDescriptor) {
            this.track = audioTrackDescriptor;
        }
    }

    private DefaultScenariumAudioPlaybackService(ResourceResolver resourceResolver, AudioTrackFactory audioTrackFactory) {
        this(resourceResolver, audioTrackFactory, new ValueAnimatorVolumeAdjuster(VOLUME_TRANSITION_DURATION));
    }

    @SuppressLint({"UseSparseArrays"})
    DefaultScenariumAudioPlaybackService(ResourceResolver resourceResolver, AudioTrackFactory audioTrackFactory, VolumeAdjuster volumeAdjuster) {
        this.mVolumeDriver = new AdjustingDriver() {
            public void onAdjustVolume(float f) {
                DefaultScenariumAudioPlaybackService.this.onAdjustVolumeInternal(f);
            }
        };
        this.mGlobalVolumeGain = 1.0f;
        this.mResourceResolver = resourceResolver;
        this.mAudioTrackFactory = audioTrackFactory;
        this.mVolumeAdjuster = volumeAdjuster;
        this.mAudioTracks = new ConcurrentHashMap();
    }

    private void addTrack(int i, AudioTrackHolder audioTrackHolder) {
        this.mAudioTracks.put(Integer.valueOf(i), audioTrackHolder);
    }

    private static float clampVolume(float f) {
        return f < MapboxConstants.MINIMUM_ZOOM ? MapboxConstants.MINIMUM_ZOOM : f > 1.0f ? 1.0f : f;
    }

    private AudioTrackDescriptor getAudioTrack(int i) {
        AudioTrackHolder audioTrackHolder = getAudioTrackHolder(i);
        return audioTrackHolder != null ? audioTrackHolder.track : null;
    }

    private AudioTrackHolder getAudioTrackHolder(int i) {
        return (AudioTrackHolder) this.mAudioTracks.get(Integer.valueOf(i));
    }

    static DefaultScenariumAudioPlaybackService newInstance(ResourceResolver resourceResolver) {
        return new DefaultScenariumAudioPlaybackService(resourceResolver, MediaPlayerAudioTrackFactory.newInstance(resourceResolver));
    }

    static DefaultScenariumAudioPlaybackService newInstance(ResourceResolver resourceResolver, AudioTrackFactory audioTrackFactory) {
        return new DefaultScenariumAudioPlaybackService(resourceResolver, audioTrackFactory);
    }

    private void onAdjustVolumeInternal(float f) {
        this.mGlobalVolumeGain = f;
        syncAllTracksVolumes();
    }

    private void removeAudioTrack(int i) {
        this.mAudioTracks.remove(Integer.valueOf(i));
    }

    private void syncAllTracksVolumes() {
        for (AudioTrackHolder syncTrackVolume : this.mAudioTracks.values()) {
            syncTrackVolume(syncTrackVolume);
        }
    }

    private void syncTrackVolume(AudioTrackHolder audioTrackHolder) {
        audioTrackHolder.track.setVolume(audioTrackHolder.trackVolume * this.mGlobalVolumeGain);
    }

    public final void close(int i) {
        AudioTrackDescriptor audioTrack = getAudioTrack(i);
        if (audioTrack != null) {
            removeAudioTrack(i);
            audioTrack.close();
        }
    }

    public final void closeAll() {
        Iterator it = this.mAudioTracks.entrySet().iterator();
        while (it.hasNext()) {
            AudioTrackHolder audioTrackHolder = (AudioTrackHolder) ((Entry) it.next()).getValue();
            it.remove();
            audioTrackHolder.track.close();
        }
    }

    public final float getDuration(int i) {
        AudioTrackDescriptor audioTrack = getAudioTrack(i);
        return audioTrack != null ? audioTrack.getDuration() : -1.0f;
    }

    public final float getPosition(int i) {
        AudioTrackDescriptor audioTrack = getAudioTrack(i);
        return audioTrack != null ? audioTrack.getPosition() : -1.0f;
    }

    public final float getVolume(int i) {
        AudioTrackHolder audioTrackHolder = getAudioTrackHolder(i);
        return audioTrackHolder != null ? audioTrackHolder.trackVolume : -1.0f;
    }

    public final boolean isPlaying(int i) {
        AudioTrackDescriptor audioTrack = getAudioTrack(i);
        return audioTrack != null && audioTrack.isPlaying();
    }

    public final int open(String str, AudioTrackStateCallback audioTrackStateCallback) {
        AudioTrack newTrack = this.mAudioTrackFactory.newTrack(str);
        if (newTrack == null) {
            return -1;
        }
        AudioTrackDescriptor audioTrackDescriptor = new AudioTrackDescriptor(this.mResourceResolver, str, newTrack, audioTrackStateCallback);
        AudioTrackHolder audioTrackHolder = new AudioTrackHolder(audioTrackDescriptor);
        int handle = audioTrackDescriptor.getHandle();
        addTrack(handle, audioTrackHolder);
        syncTrackVolume(audioTrackHolder);
        return handle;
    }

    public final boolean pause(int i) {
        AudioTrackDescriptor audioTrack = getAudioTrack(i);
        return audioTrack != null && audioTrack.pause();
    }

    public final boolean play(int i, int i2) {
        AudioTrackDescriptor audioTrack = getAudioTrack(i);
        return audioTrack != null && audioTrack.play(i2);
    }

    public final boolean resume(int i) {
        AudioTrackDescriptor audioTrack = getAudioTrack(i);
        return audioTrack != null && audioTrack.resume();
    }

    public final void setMasterVolume(float f, boolean z) {
        this.mVolumeAdjuster.adjust(this.mVolumeDriver, this.mGlobalVolumeGain, f, z);
    }

    public final boolean setPosition(int i, float f) {
        AudioTrackDescriptor audioTrack = getAudioTrack(i);
        return audioTrack != null && audioTrack.setPosition(f);
    }

    public final void setVolume(int i, float f) {
        AudioTrackHolder audioTrackHolder = getAudioTrackHolder(i);
        if (audioTrackHolder != null) {
            audioTrackHolder.trackVolume = clampVolume(f);
            syncTrackVolume(audioTrackHolder);
        }
    }

    public final void shutdownService() {
        this.mVolumeAdjuster.shutdown();
    }

    public final void startService() {
        this.mVolumeAdjuster.start();
    }

    public final boolean stop(int i) {
        AudioTrackDescriptor audioTrack = getAudioTrack(i);
        return audioTrack != null && audioTrack.stop();
    }
}
