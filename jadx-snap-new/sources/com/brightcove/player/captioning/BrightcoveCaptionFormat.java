package com.brightcove.player.captioning;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.net.Uri;
import android.util.Pair;
import defpackage.xw.a;
import java.util.List;

public abstract class BrightcoveCaptionFormat {
    public static final String BRIGHTCOVE_SCHEME = "brightcove://";

    public interface Builder {
        BrightcoveCaptionFormat build();

        Builder hasInBandMetadataTrackDispatchType(boolean z);

        Builder language(String str);

        Builder type(String str);
    }

    public static Builder builder() {
        return new a();
    }

    @TargetApi(19)
    public static MediaFormat convertCaptionFormat(BrightcoveCaptionFormat brightcoveCaptionFormat) {
        return MediaFormat.createSubtitleFormat(brightcoveCaptionFormat.type(), brightcoveCaptionFormat.language());
    }

    public static BrightcoveCaptionFormat createCaptionFormat(String str, String str2) {
        return builder().type(str).language(str2).hasInBandMetadataTrackDispatchType(false).build();
    }

    public static Pair<Uri, BrightcoveCaptionFormat> findMatchingLanguageIgnoreMimeType(List<? extends Pair<Uri, BrightcoveCaptionFormat>> list, BrightcoveCaptionFormat brightcoveCaptionFormat) {
        if (brightcoveCaptionFormat == null || brightcoveCaptionFormat.language() == null || list == null || list.isEmpty()) {
            return null;
        }
        for (Pair<Uri, BrightcoveCaptionFormat> pair : list) {
            BrightcoveCaptionFormat brightcoveCaptionFormat2 = (BrightcoveCaptionFormat) pair.second;
            if (brightcoveCaptionFormat2 != null && brightcoveCaptionFormat2.language().equals(brightcoveCaptionFormat.language())) {
                return pair;
            }
        }
        return null;
    }

    public abstract boolean hasInBandMetadataTrackDispatchType();

    public abstract String language();

    public abstract String type();

    public void validate() {
        if (language().length() < 2) {
            throw new IllegalStateException("Language Code incorrect. ");
        }
    }
}
