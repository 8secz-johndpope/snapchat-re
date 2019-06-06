package com.brightcove.player.media;

public final class SourceFields {
    public static final String BIT_RATE = "encodingRate";
    public static final String[] DEFAULT_FIELDS = new String[]{"url", DURATION, VIDEO_CONTAINER, BIT_RATE};
    public static final String DURATION = "videoDuration";
    public static final String URL = "url";
    public static final String VIDEO_CONTAINER = "videoContainer";

    public final class Containers {
        public static final String FLV = "FLV";
        public static final String M2TS = "M2TS";
        public static final String MP4 = "MP4";
        public static final String WVM = "WVM";
    }
}
