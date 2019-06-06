package defpackage;

import defpackage.fth.a;

/* renamed from: suc */
public enum suc implements fth {
    RESPONSIVE_LAYOUT_IMAGE_SNAPS(a.a(false)),
    RESPONSIVE_LAYOUT_VIDEO_SNAPS(a.a(false)),
    OPERA_CLOSE_ANIMATION_V2(a.a(false)),
    EXOPLAYER_ENABLE_CUSTOM_HTTP_SETTINGS_EXOPLAYER(a.a(false)),
    EXOPLAYER_CONNECTION_TIMEOUT(a.a(8000)),
    EXOPLAYER_REQUEST_TIMEOUT(a.a(8000)),
    EXOPLAYER_REQUEST_RETRIES(a.a(5)),
    LOG_HIGH_RESOLUTION_IMAGES(a.a(false)),
    ENABLE_HARD_RESOLUTION_LIMIT_FOR_IMAGES(a.a(false)),
    INLINE_PRELOAD_ON_CELL_COUNT(a.a(4)),
    INLINE_PRELOAD_ON_WIFI_COUNT(a.a(4)),
    SINGLE_PAGE_RESOLUTION(a.a(false)),
    ENABLE_BG_WARMUP(a.a(true)),
    ASYNC_EXOPLAYER_RELEASE(a.a(false)),
    USE_EXOPLAYER_FOR_LONGFORM(a.a(false));
    
    private final a<?> delegate;

    private suc(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.OPERA;
    }
}
