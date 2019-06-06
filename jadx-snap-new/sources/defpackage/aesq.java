package defpackage;

import com.mapbox.services.android.telemetry.navigation.MapboxNavigationEvent;
import java.util.Locale;

/* renamed from: aesq */
public enum aesq {
    TEXT("text"),
    MEDIA("media"),
    SCREENSHOT(MapboxNavigationEvent.KEY_SCREENSHOT),
    HERE_SCREENSHOT("here_screenshot"),
    DISCOVER_SHARE_V2("discover_share_v2"),
    MISSED_AUDIO_CALL("missed_audio_call"),
    MISSED_VIDEO_CALL("missed_video_call"),
    WELCOME_MESSAGE("welcome_message"),
    STORY_REPLY("story_reply"),
    STORY_REPLY_V2("story_reply_v2"),
    STICKER("sticker"),
    STICKER_V2("sticker_v2"),
    STICKER_V3("sticker_v3"),
    MEDIA_V2("media_v2"),
    AUDIO_NOTE("audio_note"),
    VIDEO_NOTE("video_note"),
    BATCHED_MEDIA("batched_media"),
    MEDIA_V3("media_v3"),
    MEDIA_V4("media_v4"),
    SPEEDWAY_STORY("speedway_story"),
    SPEEDWAY_STORY_V2("speedway_story_v2"),
    SPEEDWAY_SNAP("speedway_snap"),
    SPEEDWAY_SNAP_V2("speedway_snap_v2"),
    STORY_SHARE("story_share"),
    SNAPCHATTER("snapchatter"),
    UPDATE_MESSAGE("update_message"),
    SNAP("snap"),
    KHALEESI_SHARE("khaleesi_share"),
    NYC_SHARE("nyc_share"),
    SEARCH_SHARE_STORY_SNAP("search_share_story_snap"),
    SEARCH_SHARE_STORY("search_share_story"),
    AD_SHARE("ad_share"),
    MEDIA_SAVE("media_save"),
    MESSAGE_PALLET("message_pallet"),
    SNAPCASH("snapcash"),
    MESSAGE_PARCEL("message_parcel"),
    ERASED_MESSAGE("erased_message"),
    JOINED_CALL("joined_call"),
    LEFT_CALL("left_call"),
    UNRECOGNIZED_VALUE("UNRECOGNIZED_VALUE");
    
    private final String value;

    private aesq(String str) {
        this.value = str;
    }

    public static aesq a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aesq.valueOf(str.toUpperCase(Locale.US));
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
