package defpackage;

import defpackage.ily.a;

/* renamed from: iol */
public enum iol implements ily {
    VIDEO_REQUEST,
    VIDEO_REQUEST_SECTION_TIME,
    VIDEO_REQUEST_ACCEPTED,
    VIDEO_REQUEST_PREPARATION_START,
    VIDEO_REQUEST_PREPARATION_END,
    VIDEO_REQUEST_EXECUTION_START,
    VIDEO_REQUEST_EXECTUION_END,
    VIDEO_REQUEST_END,
    VIDEO_REQUEST_NORMALIZED_LATENCY,
    TRANSCODE_EXECUTION_TOTAL_TIME,
    TRANSCODE_WAITING_TIME,
    TRANSCODE_NORMALIZED_LATENCY,
    VIDEO_SENDING_OR_POSTING,
    VIDEO_EXPORT,
    VIDEO_MEMORIES_SAVE,
    VIDEO_MEMORIES_BACK_UP,
    VIDEO_TRIM,
    TRANSCODE_START,
    TRANSCODE_REQUEST_CREATED,
    TRANSCODE_TASK_EXECUTION_START,
    TRANSCODE_TASK_EXECUTION_END,
    TRANSCODE_END,
    TRANSCODE_SECTION_TIME,
    VIDEO_REQUEST_INPUT_DURATION_MS,
    TRANSCODE_VIDEO_DURATION_MS,
    VIDEO_FILE_SIZE,
    VIDEO_FRAME_RETRIEVING,
    VIDEO_FRAME_RETRIEVE_OVERALL,
    CODEC_LEASE_AWAITED,
    CODEC_LEASE_AWAIT_INTERRUPTED,
    IMAGE_SEND_OR_POST,
    IMAGE_EXPORT,
    IMAGE_MEMORIES_BACK_UP,
    IMAGE_THUMBNAIL_GENERATE,
    IMAGE_BITMAP_SIZE_BEFORE,
    IMAGE_BITMAP_SIZE_AFTER,
    VIDEO_CONFIGURATION_GENERATION,
    VIDEO_OG_TRANSCODING,
    IMAGE_PROCESSING,
    PLAYER_SURFACE_SETUP_RETRY,
    SC_MEDIA_RECORDER_STABILITY,
    SC_MEDIA_RECORDER_METADATA,
    SC_MEDIA_RECORDER_PERFORMANCE,
    RECORDER_DELAY_DETAIL,
    RECORDING_FPS,
    CODEC_LEASE_GRANT,
    CODEC_EXHAUSTION,
    DANGLING_CODEC_LEASE,
    MEDIA_PLAYER_SETUP,
    MEDIA_PLAYER_RUNNING,
    MEDIA_PLAYER_STEP,
    MEDIA_PLAYER_ERROR,
    IMAGE_PLAYER,
    METADATA_RETRIEVER,
    METADATA_RETRIEVER_SETUP;

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
        return ink.MEDIA;
    }

    public final ilz b() {
        return a.a(this);
    }
}
