package defpackage;

import defpackage.ily.a;

/* renamed from: ino */
public enum ino implements ily {
    EVENT_LOGGED,
    LOG_EVENT_QUEUING_DELAY,
    PRE_INIT_LOGGED,
    APP_OPEN_NOTIF_EXCEPTION,
    END_SESSION_BEFORE_INIT,
    SERVER_CONFIG_INVALID,
    TIME_TO_FIRST_RESUME,
    TIME_TO_FIRST_SESSION_INIT,
    TIME_TO_FIRST_COMPLETE_INIT,
    SEQID_INIT_ERROR,
    SEQID_GENERATE_LATENCY_MICRO,
    SEQID_SAVE_EXCEPTION,
    SEQID_READ_EXCEPTION,
    SESSIONID_INVALID,
    EVENT_BURST_BATCH_SIZE,
    FLUSH_EVENTS,
    TIME_TO_FLUSH_EVENT,
    INTER_FLUSH_TIME_MILLI,
    INTER_PROCESS_TIME_MILLI,
    DB_ERROR_ON_FLUSH,
    DATABESE_GOT_DELETED_EVENTS_LOST,
    DATABESE_GOT_DELETED,
    INTER_UPLOAD_TIME_MILLI,
    UPLOAD_BATCH_SIZE,
    UPLOAD_DISPATCHED,
    UPLOAD_SUCCEEDED,
    UPLOAD_FAILED,
    UPLOAD_REQUESTED,
    NO_NETWORK_UPLOAD_AVOIDED,
    BACKGROUND_UPLOAD_AVOIDED,
    UPLOAD_REQUEST_SIZE_IN_BYTES,
    UPLOAD_RESPONSE_SIZE_IN_BYTES,
    UPLOAD_SUCCEEDED_V2,
    UPLOAD_FAILED_V2,
    FILE_DELETED_FAILED_V2,
    FILE_DELETED_SUCCESS_V2,
    OVERFLOW_TOTAL_EVENTS,
    OVERFLOW_CRITICAL_EVENT,
    OVERFLOW_P0_EVENTS,
    BLACKLISTED_EVENT,
    PROPERTY_STORE_USED_APP_OPEN_TS,
    PROPERTY_STORE_DAILY_CLIENT_ID,
    PROPERTY_STORE_DAILY_CL_ID_TS,
    FILES_ON_DISK_AT_STARTUP,
    FILENAME_MALFORMED;

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
        return ink.BLIZZARD;
    }

    public final ilz b() {
        return a.a(this);
    }
}
