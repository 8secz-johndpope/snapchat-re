package defpackage;

import defpackage.fth.a;
import java.lang.reflect.Type;

/* renamed from: xsj */
public enum xsj implements fth {
    BITMOJI_PACK_VERSION_SYNCED_V1(a.a(r1)),
    BITMOJI_METADATA_VERSION_SYNCED_V1(a.a(r1)),
    BITMOJI_SEARCH_TAGS_VERSION_SYNCED(a.a(r1)),
    SNAP_PACK_VERSION_SYNCED_V1(a.a((Type) xse.class, r6)),
    CONTEXTUAL_STICKER_PACK_URLSYNCED_V1(a.a((Type) xse.class, r6)),
    CONTEXTUAL_UNLOCKED_STICKER_PACK(a.a((Type) xse.class, r6)),
    SNAPSTICKER_SEARCH_TAGS_VERSION_SYNCED(a.a(r1)),
    CUSTOM_STICKERS_SYNC_TIME_V1(a.a(0)),
    WEATHER_DATA_SYNC_TIME(a.a(0)),
    WEATHER_CACHED_OBJ(a.a((Type) xsg.class, r6)),
    DELETING_CUSTOM_STICKERS_GATE(a.a(true)),
    LEARNED_SEARCH_RESULTS_COUNT(a.a(100)),
    DDML_SEARCH_ENABLED(a.a(false)),
    BITMOJI_SMART_REPLY_ENABLED(a.a(false)),
    WEATHER_STICKER_ENABLED(a.a(true)),
    MENTION_STICKER_ENABLED(a.a(false)),
    BITMOJI_SMART_REPLY_VERSION(a.a(0)),
    WEATHER_BASE_URL_KEY(a.a(r1)),
    STICKER_CDN_BASE_URL(a.a("https://gcs.sc-cdn.net/sticker-packs-sc")),
    STICKER_API_THROTTLE_SERVER(a.a(-1)),
    STICKER_PACK_V3_API_THROTTLE_CLIENT(a.a(0)),
    STICKER_BBG_API_THROTTLE_CLIENT(a.a(0)),
    STICKER_UNLOCKED_API_THROTTLE_CLIENT(a.a(0)),
    UNLOCKED_STICKER_THROTTLE_SETTING(a.a(30)),
    STICKERS_METADATA_JITTER_ANDROID(a.a(-1)),
    BITMOJI_CHAT_FIRST_TAB(a.a(false)),
    SWIPE_DOWN_TO_DISMISS_PREVIEW_STICKER_PICKER(a.a(false)),
    BITMOJI_THUMBNAILS_STICKER_PICKER(a.a(false)),
    BITMOJI_HIGH_RES_PREVIEW(a.a(false)),
    FORMATTED_SEARCH_TAGS(a.a(false)),
    STICKER_TAG_TYPE_REVERSE_FORMATTED(a.a(false)),
    VENUE_STICKERS_MUSHROOM(a.a(false));
    
    private final a<?> delegate;

    private xsj(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.STICKERS;
    }
}
