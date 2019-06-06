package com.brightcove.player.media;

public enum CaptionType {
    UNKNOWN(r2),
    TTML("application/text+xml"),
    WEBVTT("text/vtt");
    
    private final String type;

    private CaptionType(String str) {
        this.type = str;
    }

    public static CaptionType fromString(String str) {
        if (str != null) {
            for (CaptionType captionType : values()) {
                if (str.equalsIgnoreCase(captionType.type)) {
                    return captionType;
                }
            }
        }
        return null;
    }

    public final String toString() {
        return this.type;
    }
}
