package com.looksery.sdk.audio;

import android.media.MediaPlayer;
import com.looksery.sdk.io.ResourceResolver;

class MediaPlayerAudioTrackFactory implements AudioTrackFactory {
    private final MediaPlayerFactory mMediaPlayerFactory;

    private MediaPlayerAudioTrackFactory(MediaPlayerFactory mediaPlayerFactory) {
        this.mMediaPlayerFactory = mediaPlayerFactory;
    }

    static AudioTrackFactory newInstance(ResourceResolver resourceResolver) {
        return new MediaPlayerAudioTrackFactory(DefaultMediaPlayerFactory.newInstance(resourceResolver));
    }

    public AudioTrack newTrack(String str) {
        MediaPlayer create = this.mMediaPlayerFactory.create(str);
        return create != null ? new MediaPlayerAudioTrack(create) : null;
    }
}
