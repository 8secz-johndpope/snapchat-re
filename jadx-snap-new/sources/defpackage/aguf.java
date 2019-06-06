package defpackage;

import java.util.Locale;

/* renamed from: aguf */
public enum aguf {
    VIDEO_SD_HEVC("video_sd_hevc"),
    VIDEO_SD_AVC("video_sd_avc"),
    VIDEO_HD_HEVC("video_hd_hevc"),
    VIDEO_HD_AVC("video_hd_avc"),
    IMAGE_JPEG("image_jpeg"),
    IMAGE_HEIF("image_heif"),
    VIDEO_HEVC("video_hevc"),
    VIDEO_AVC("video_avc"),
    UNSPECIFIED("unspecified"),
    UNRECOGNIZED_VALUE(r11);
    
    private final String value;

    private aguf(String str) {
        this.value = str;
    }

    public static aguf a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aguf.valueOf(str.toUpperCase(Locale.US));
        } catch (Exception unused) {
            return UNRECOGNIZED_VALUE;
        }
    }

    public final String a() {
        return this.value;
    }

    public final String toString() {
        return this.value;
    }
}
