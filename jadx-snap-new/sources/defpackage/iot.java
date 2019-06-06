package defpackage;

import defpackage.ily.a;

/* renamed from: iot */
public enum iot implements ily {
    DISK_USAGE,
    TOTAL_DISK_USAGE,
    DISK_STORAGE_STATE,
    DISK_USAGE_FILE_GROUP,
    DISK_USAGE_FILE_GROUP_MAX_SIZE,
    FILE_GROUP_ENTRY_TIME_WINDOW,
    FILE_GROUP_INVALID_ENTRY,
    DISK_USAGE_CACHE_LOOKUP,
    DISK_USAGE_CACHE_HIT,
    MEMORY_USAGE_BACKGROUND,
    MEMORY_USAGE_LOW_MEMORY,
    MEMORY_USAGE_CALLBACK,
    DURABLE_JOB_QUEUE_LATENCY,
    DURABLE_JOB_RUN_TIME_LATENCY,
    DURABLE_JOB_SUBMITTED,
    DURABLE_JOB_QUEUE_SIZE,
    DURABLE_JOB_STARTED,
    DURABLE_JOB_RETRIED,
    DURABLE_JOB_FAILED,
    DURABLE_JOB_TIMED_OUT,
    DURABLE_JOB_BACKGROUND_WAKE_UP,
    CPU_TIME_BY_FEATURE_FOREGROUND,
    CPU_TIME_BY_FEATURE_BACKGROUND,
    APP_OPEN,
    APP_CRASH,
    INVALID_APP_CRASH_REPORT,
    OOM_CRASH,
    CONTENT_RESULT_TOO_MANY,
    CONTENT_RESULT_BACKGROUND_LEAK,
    BITMAP_HIGH_USAGE,
    BITMAP_BG_LEAK,
    BITMAP_PER_PAGE,
    IMAGE_LOADING,
    CONTENT_RESOLVER_USAGE,
    BG_PREFETCH,
    THROTTLE,
    PAGE_LOAD,
    THREAD_MAX,
    THREAD_CURRENT_ACTIVE,
    THREAD_MAX_ACTIVE,
    FONT_NOT_FOUND,
    INPUT_BAR_HEIGHT_ERROR,
    MUSHROOM_OPT_IN,
    MUSHROOM_OPT_OUT,
    MUSHROOM_EXIT,
    MUSHROOM_BLOCKER,
    PURE_MROOM_DATA_MIGR_TIMER,
    PURE_MROOM_DATA_MIGR_STARTED,
    PURE_MROOM_DATA_MIGR_NOOP,
    PURE_MROOM_DATA_MIGR_ZOMBIE,
    PURE_MROOM_DATA_MIGR_FAILED;

    public final ilz a(String str, Enum<?> enumR) {
        akcr.b(str, "shortKey");
        akcr.b(enumR, "shortValue");
        return a.a((ily) this, str, (Enum) enumR);
    }

    public final ilz a(String str, String str2) {
        akcr.b(str, "shortKey");
        akcr.b(str2, "shortValue");
        return a.a((ily) this, str, str2);
    }

    public final ilz a(String str, boolean z) {
        akcr.b(str, "shortKey");
        return a.a((ily) this, str, z);
    }

    public final ink a() {
        return ink.PLATFORM;
    }

    public final ilz b() {
        return a.a(this);
    }
}
