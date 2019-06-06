package defpackage;

import defpackage.fth.a;

/* renamed from: fxs */
public enum fxs implements fth {
    BANDWIDTH_LOG_VIEWER(a.a(true)),
    MEMORY_LOG_VIEWER(a.a(true)),
    KERNEL_MEMORY_LOG_VIEWER(a.a(false)),
    MEMORY_LEAK_AUTO_CRASH(a.a(false)),
    STARTUP_MODE(a.a(fxv.ALL)),
    FINISH_ACTIVITY_ON_BACK(a.a(false)),
    LOW_END_DEVICE_MODE(a.a(false)),
    TAB_NAVIGATION_MODE(a.a(false)),
    NO_ANIMATION_MODE(a.a(false)),
    SHOW_EXPERIMENT_PARSE_FAIL_TAOSTS(a.a(false)),
    DECK_PAGE_BACKGROUND_PURGE_TIMEOUT_MIN(a.a(-1)),
    DECK_PAGE_BACKGROUND_PURGE_PAGE_TYPES(a.a("FriendsFeed,DiscoverFeed,MEMORIES")),
    DECK_APP_STATE_MANAGEMENT(a.a(false)),
    FEATURE_CONFIG_SYNCED_FEATURE_SETTINGS(a.a(false)),
    FEATURE_CONFIG_SYNCED_CLIENT_PROPERTIES(a.a(false)),
    FEATURE_CONFIG_SYNCED_TOOLTIPS(a.a(false)),
    PLACEHOLDER_CRASH_BUTTON(a.a(false)),
    DISPLAY_NOTCH_HEIGHT(a.a(0)),
    NEEDS_CUSTOM_INSETS_SOURCE(a.a(false)),
    FRIENDS_FEED_SYNC_TOKEN(a.a("")),
    V_ELEVEN_MODE(a.a(false)),
    INSETS_DETECTOR_V2(a.a(false));
    
    private final a<?> delegate;

    private fxs(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.GLOBAL;
    }
}
