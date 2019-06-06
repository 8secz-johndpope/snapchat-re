package com.looksery.sdk.audio;

import com.looksery.sdk.io.ResourceResolver;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class AudioServices {
    private AudioServices() {
        throw new AssertionError("No instances");
    }

    public static AudioPlaybackService playback(ResourceResolver resourceResolver) {
        return playback(resourceResolver, Executors.newCachedThreadPool());
    }

    public static AudioPlaybackService playback(ResourceResolver resourceResolver, ExecutorService executorService) {
        return MultiPlayerAudioPlaybackService.create(resourceResolver, executorService);
    }

    public static ScenariumAudioPlaybackService scenariumPlaybackService(ResourceResolver resourceResolver) {
        return DefaultScenariumAudioPlaybackService.newInstance(resourceResolver);
    }

    public static ScenariumAudioPlaybackService scenariumPlaybackService(ResourceResolver resourceResolver, AudioTrackFactory audioTrackFactory) {
        return DefaultScenariumAudioPlaybackService.newInstance(resourceResolver, audioTrackFactory);
    }
}
