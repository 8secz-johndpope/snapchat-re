package defpackage;

import defpackage.fth.a;

/* renamed from: adew */
public enum adew implements fth {
    MAP_EFFECTS_CUSTOM_ALWAYS_ON_TILE(a.a(r1)),
    MAP_EFFECTS_CUSTOM_ALWAYS_ON_SELECTED(a.a(r1)),
    MAP_FORCE_ONBOARDING(a.a(false)),
    USE_NEW_MAP_RENDERER(a.a(false)),
    MOCK_FRIEND_LOCATIONS(a.a(false)),
    MOCK_CURRENT_LOCATIONS(a.a(r1)),
    SKIP_ONBOARDING_FOR_TESTS(a.a(false)),
    SKIP_LOCATION_ACCESS_FOR_TESTS(a.a(false)),
    MAP_TESTING_MODE(a.a(false)),
    MOCK_LOCATION_NYC(a.a(false)),
    DISABLE_HEATMAP(a.a(false)),
    EGG_HUNT(a.a(false)),
    FORCE_EGG_HUNT_SCORE(a.a(-1)),
    HIT_STAGING_GAME_SERVER(a.a(false)),
    LEADERBOARD_SERENGETI_REGISTRY(a.a(r1)),
    EGG_HUNT_MOCK_GAME_STATUS(a.a(r1)),
    MAP_SCREENSHOT_ENABLED(a.a(false)),
    DISABLE_SLOW_HEATMAP(a.a(-1)),
    CUSTOM_TILE_FLAVOR(a.a("default")),
    MAP_V2(a.a(false)),
    MAP_V2_PASSPORT(a.a(false)),
    MAP_V2_VIEW_STATUS(a.a(false)),
    SHOW_PERFORMANCE_METRICS(a.a(false)),
    MOCK_EXPLORE_RESPONSE(a.a(false)),
    CUSTOM_SERVER_ENDPOINT(a.a(r1)),
    PERSONAL_INSTANCE_VERSION(a.a(r1)),
    ERROR_MAP_REQUESTS(a.a(false)),
    EXPLORE_MY_STATUS_TOOLTIP_SHOWN(a.a(false)),
    IS_TEMPERATURE_SCALE_IMPERIAL(a.a(a.UNSET)),
    NOT_SHARING_LOCATION_TOOLTIP_LAST_SHOWN(a.a(0)),
    EXPLORE_SETTINGS_TOOLTIP_SHOWN(a.a(0)),
    EGG_HUNT_IS_ONBOARDED(a.a(false)),
    IS_PLAYBACK_INSTRUMENTATION_TEST(a.a(false)),
    MAP_PREFETCH_FRIEND_LOCATIONS_THRESHOLD(a.a(-1)),
    EXPLORE_SETTING_TOOLTIP(a.a(false)),
    EXPLORE_EMPTY_MY_STATUS_TOOLTIP(a.a(false)),
    NYC_HAS_SEEN_SUBMIT_ANYWHERE(a.a(false)),
    MAP_USAGE_DATA_SHARING_ENABLED(a.a(false)),
    ALLOW_INCOMING_FRIEND_LOCATION_REQUESTS(a.a(false)),
    NYC_SHARING_NOTIFICATION_COUNT(a.a(0)),
    NYC_SHARING_LAST_SEEN_TIMESTAMP(a.a(Long.MAX_VALUE)),
    LAST_MAP_OPEN_TIMESTAMP(a.a(Long.MAX_VALUE)),
    MAP_LOCATION_SHARING_NOTIFICATION(a.a(false)),
    ZERO_ONBOARDING_SETTINGS_TOOLTIP_LAST_OPEN(a.a(0)),
    ZERO_ONBOARDING_SETTINGS_TOOLTIP_SEEN(a.a(false)),
    ZERO_ONBOARDING_SHARING_SETTINGS_TOOLTIP_SEEN(a.a(false)),
    MAP_PLACES_ONBOARDING_SEEN(a.a(false));
    
    private final a<?> delegate;

    /* renamed from: adew$a */
    public enum a {
        private static final /* synthetic */ a[] $VALUES = null;
        public static final a FALSE = null;
        public static final a TRUE = null;
        public static final a UNSET = null;

        static {
            UNSET = new a("UNSET", 0);
            TRUE = new a("TRUE", 1);
            FALSE = new a("FALSE", 2);
            $VALUES = new a[]{UNSET, TRUE, FALSE};
        }

        private a(String str, int i) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    private adew(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.MAPS;
    }
}
