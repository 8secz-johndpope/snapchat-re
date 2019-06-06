package com.brightcove.player.media;

import com.brightcove.player.model.Video;

@Deprecated
public interface VideoListener extends ErrorListener {
    void onVideo(Video video);
}
