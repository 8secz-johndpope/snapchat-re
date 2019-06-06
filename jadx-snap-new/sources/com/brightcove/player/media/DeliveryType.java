package com.brightcove.player.media;

public enum DeliveryType {
    UNKNOWN(r2),
    MP4("video/mp4"),
    HLS("application/vnd.apple.mpegurl"),
    FLV("video/x-flv"),
    WVM("video/wvm"),
    DASH("video/mpeg-dash");
    
    private final String type;

    private DeliveryType(String str) {
        this.type = str;
    }

    public final String toString() {
        return this.type;
    }
}
