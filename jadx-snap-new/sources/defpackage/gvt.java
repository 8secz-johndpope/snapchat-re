package defpackage;

import defpackage.fth.a;

/* renamed from: gvt */
public enum gvt implements fth {
    CATEGORY_SECTIONS(a.a(false)),
    OVERRIDE_STORY_TYPE_SERVER(a.a(c.DEFAULT)),
    PUBLISHER_NAME_FILTER(a.a(r2)),
    OFFICIAL_STORIES_ONLY(a.a(false)),
    LONGFORM_STORIES_ONLY(a.a(false)),
    SHOW_ALL_CATEGORY_SECTIONS(a.a(false)),
    CATEGORY_SECTIONS_TREATMENT_GROUP(a.a(b.DEFAULT)),
    ENABLE_PREFETCH_DEBUGGER(a.a(false)),
    CUSTOM_MIXER_ENDPOINT(a.a(r2)),
    NEW_USER_ONBOARDING_STORY_TOOLTIP(a.a(true)),
    DF_INITIAL_PAGE_DB_CACHE(a.a(true)),
    LAST_WATCHED_FRIEND_STORY_DF_MS(a.a(0)),
    FRIEND_TEACHING_BUTTON_ENABLED(a.a(false)),
    FRIEND_TEACHING_BUTTON_COOLDOWN_HOURS(a.a(2)),
    FRIEND_TEACHING_BUTTON_COOLDOWN_HOURS_OVERRIDE(a.a(false)),
    FRIEND_TEACHING_BUTTON_TRIGGER_HOURS_OVERRIDE(a.a(false)),
    FRIEND_TEACHING_BUTTON_TRIGGER_HOURS(a.a(12)),
    FRIEND_TEACHING_BUTTON_NUM_UNVIEWED_STORIES(a.a(2)),
    BACKGROUND_PREFETCH_ENABLE_FRIEND_STORY(a.a(false)),
    BACKGROUND_PREFETCH_NUM_FRIEND_STORY(a.a(0)),
    BACKGROUND_PREFETCH_NUM_SNAPS_PER_FRIEND_STORY(a.a(0)),
    BACKGROUND_PREFETCH_FRIEND_STORY_DELAY_MINS(a.a(-1)),
    BACKGROUND_PREFETCH_FRIEND_STORY_TIMEOUT_MINS(a.a(5)),
    BACKGROUND_PREFETCH_FRIEND_STORY_PREFETCH_FIXED_TIME(a.a("N/A")),
    BACKGROUND_PREFETCH_FRIEND_STORY_SKIP_DOWNLOADED_STORIES(a.a(false)),
    BACKGROUND_PREFETCH_ENABLE_SUBSCRIPTION_STORY(a.a(false)),
    BACKGROUND_PREFETCH_NUM_SUBSCRIPTION_STORY(a.a(0)),
    BACKGROUND_PREFETCH_NUM_SNAPS_PER_SUBSCRIPTION_STORY(a.a(0)),
    BACKGROUND_PREFETCH_SUBSCRIPTION_STORY_DELAY_MINS(a.a(-1)),
    BACKGROUND_PREFETCH_SUBSCRIPTION_STORY_TIMEOUT_MINS(a.a(5)),
    FRIEND_STORY_BG_TO_FG_RESUME_ANDROID(a.a(false)),
    OPT_IN_NOTIFICATIONS_ENABLED(a.a(false)),
    OPT_IN_NOTIFICATIONS_ENABLE_SOUND(a.a(false)),
    OPT_IN_NOTIFICATIONS_PROMPT_ALL(a.a(false)),
    OPT_IN_NOTIFICATIONS_DROP_DOWN_PROMPT_ENABLED(a.a(false)),
    OPT_IN_NOTIFICATIONS_SWIPE_UP_PROMPT_ENABLED(a.a(false)),
    OPT_IN_NOTIFICATIONS_CLOSE_TO_FIRST_STORY(a.a(false)),
    OPT_IN_USER_NOTIFICATIONS_ENABLED(a.a(false)),
    OPT_IN_USER_NOTIFICATIONS_PROMPT_DROP_DOWN(a.a(false)),
    OPT_IN_NOTIFICATIONS_HOLDOUT(a.a(false)),
    OPT_IN_NOTIFICATIONS_SHOWN_BETWEEN_APP_SESSION(a.a(0)),
    RANKING_STORIES_BYPASS_FSN_ANDROID_ENABLED(a.a(false)),
    RANKING_STORIES_BYPASS_FSN_ANDROID_BASE_URL(a.a(r2)),
    SHARED_STORY_PREFETCHING_LOGIC_ENABLED(a.a(false)),
    FF_STORY_IMPRESSION_PREFETCHING_ENABLED(a.a(false)),
    FRIEND_STORY_SNAP_PREFETCH_COUNT(a.a(2)),
    OVERFLOW_FRIEND_STORY_PREFETCH_COUNT(a.a(0)),
    MAX_PARALLEL_DOWNLOAD_COUNT(a.a(4)),
    ENABLE_COGNAC_TILE(a.a(false)),
    ENABLE_COGNAC_PIVOT(a.a(a.DISABLE)),
    ENABLE_COGNAC_IN_FOR_YOU(a.a(a.DISABLE)),
    ENABLE_RECOMMENDED_SUBSCRIPTIONS(a.a(false)),
    ENABLE_REPORT_TILE_PUBLISHER(a.a(false)),
    ENABLE_REPORT_TILE_PUBLIC_USER(a.a(false)),
    ENABLE_TEST_PUBLISHERS(a.a(false)),
    DF_FRIENDS_STORIES_LAST_CHECKED_TIMESTAMP_MS(a.a(0)),
    RANKING_SERVER_CONFIG_STUDIES(a.a(r2)),
    ENABLE_CHANNEL_PIVOT(a.a(false)),
    SHOW_TEAM_SNAPCHAT_STORY_ON_DISCOVER(a.a(false)),
    PRELOAD_DISCOVER_FEED(a.a(false)),
    COF_FEED_REFRESH_INTERVAL_IN_MS(a.a(900000)),
    JAGUAR_CAROUSEL_IN_FOR_YOU_ENABLED(a.a(false)),
    ENABLE_PRIVATE_STORY_SHOWS_FRIEND_DISPLAY_NAME(a.a(false)),
    ENABLE_PRIVATE_STORY_OVERLAY_ICON(a.a(false));
    
    private final a<?> delegate;

    /* renamed from: gvt$c */
    public enum c {
        private static final /* synthetic */ c[] $VALUES = null;
        public static final c COGNAC_STORY = null;
        public static final c DEFAULT = null;
        public static final c DYNAMIC_STORY = null;
        public static final c MAP_OUR_STORY = null;
        public static final c MAP_TILE = null;
        public static final c MOMENT_STORY = null;
        public static final c PROMOTED_STORY = null;
        public static final c PUBLIC_USER_STORY = null;
        public static final c PUBLISHER_STORY = null;
        public static final c SOLO_STORY = null;
        private final int mOrdinal;

        static {
            DEFAULT = new c("DEFAULT", 0, 0);
            DYNAMIC_STORY = new c("DYNAMIC_STORY", 1, 1);
            MAP_OUR_STORY = new c("MAP_OUR_STORY", 2, 2);
            PUBLISHER_STORY = new c("PUBLISHER_STORY", 3, 3);
            PUBLIC_USER_STORY = new c("PUBLIC_USER_STORY", 4, 4);
            PROMOTED_STORY = new c("PROMOTED_STORY", 5, 5);
            MAP_TILE = new c("MAP_TILE", 6, 6);
            MOMENT_STORY = new c("MOMENT_STORY", 7, 7);
            SOLO_STORY = new c("SOLO_STORY", 8, 8);
            COGNAC_STORY = new c("COGNAC_STORY", 9, 9);
            $VALUES = new c[]{DEFAULT, DYNAMIC_STORY, MAP_OUR_STORY, PUBLISHER_STORY, PUBLIC_USER_STORY, PROMOTED_STORY, MAP_TILE, MOMENT_STORY, SOLO_STORY, COGNAC_STORY};
        }

        private c(String str, int i, int i2) {
            this.mOrdinal = i2;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    /* renamed from: gvt$b */
    public enum b {
        private static final /* synthetic */ b[] $VALUES = null;
        public static final b DEFAULT = null;
        public static final b DYNAMIC_UP_TO_FIVE = null;
        public static final b HORIZONTAL_FOR_YOU = null;
        public static final b HORIZONTAL_FOR_YOU_DYNAMIC_UP_TO_FIVE = null;
        public static final b HORIZONTAL_FOR_YOU_LARGE = null;
        public static final b HORIZONTAL_FOR_YOU_NAME_SWITCH = null;
        public static final b HORIZONTAL_FOR_YOU_THREE_BEST = null;
        public static final b HORIZONTAL_FOR_YOU_THREE_BEST_FEWER_STORIES = null;
        public static final b NINE_BEST = null;
        public static final b ONE_BEST = null;
        public static final b ONE_RANDOM = null;
        public static final b THREE_BEST = null;

        static {
            DEFAULT = new b("DEFAULT", 0);
            HORIZONTAL_FOR_YOU = new b("HORIZONTAL_FOR_YOU", 1);
            HORIZONTAL_FOR_YOU_LARGE = new b("HORIZONTAL_FOR_YOU_LARGE", 2);
            ONE_BEST = new b("ONE_BEST", 3);
            THREE_BEST = new b("THREE_BEST", 4);
            NINE_BEST = new b("NINE_BEST", 5);
            ONE_RANDOM = new b("ONE_RANDOM", 6);
            DYNAMIC_UP_TO_FIVE = new b("DYNAMIC_UP_TO_FIVE", 7);
            HORIZONTAL_FOR_YOU_DYNAMIC_UP_TO_FIVE = new b("HORIZONTAL_FOR_YOU_DYNAMIC_UP_TO_FIVE", 8);
            HORIZONTAL_FOR_YOU_THREE_BEST = new b("HORIZONTAL_FOR_YOU_THREE_BEST", 9);
            HORIZONTAL_FOR_YOU_THREE_BEST_FEWER_STORIES = new b("HORIZONTAL_FOR_YOU_THREE_BEST_FEWER_STORIES", 10);
            HORIZONTAL_FOR_YOU_NAME_SWITCH = new b("HORIZONTAL_FOR_YOU_NAME_SWITCH", 11);
            $VALUES = new b[]{DEFAULT, HORIZONTAL_FOR_YOU, HORIZONTAL_FOR_YOU_LARGE, ONE_BEST, THREE_BEST, NINE_BEST, ONE_RANDOM, DYNAMIC_UP_TO_FIVE, HORIZONTAL_FOR_YOU_DYNAMIC_UP_TO_FIVE, HORIZONTAL_FOR_YOU_THREE_BEST, HORIZONTAL_FOR_YOU_THREE_BEST_FEWER_STORIES, HORIZONTAL_FOR_YOU_NAME_SWITCH};
        }

        private b(String str, int i) {
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* renamed from: gvt$a */
    public enum a {
        private static final /* synthetic */ a[] $VALUES = null;
        public static final a AB_TEST = null;
        public static final a DISABLE = null;
        public static final a ENABLE = null;

        static {
            AB_TEST = new a("AB_TEST", 0);
            ENABLE = new a("ENABLE", 1);
            DISABLE = new a("DISABLE", 2);
            $VALUES = new a[]{AB_TEST, ENABLE, DISABLE};
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

    private gvt(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.DISCOVER_FEED;
    }
}
