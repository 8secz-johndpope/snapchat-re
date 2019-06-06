package defpackage;

import defpackage.ily.a;

/* renamed from: ipc */
public enum ipc implements ily {
    PREVIEW_FINISH_PREPARATION,
    DIRECT_SNAP_SEND,
    PREVIEW_PAGE_LOAD_DELAY,
    PREVIEW_EXIT_DELAY,
    PREVIEW_TO_SEND_PAGE_DELAY,
    PREVIEW_TO_SENDTO_LOAD_FINISH,
    PREVIEW_TO_SENDTO_RENDERED,
    PREVIEW_TO_SENDTO_RENDERED_MAX,
    PREVIEW_TO_SENDTO_RENDERED_ERROR,
    PREVIEW_TOOL_TTI,
    PREVIEW_TOOL_TFI,
    PREVIEW_FILTER_INIT_DELAY,
    SNAPCUT_PERFORMANCE_METRIC,
    LOAD_MEMORIES_EDITS_DELAY,
    MULTI_SNAP_THUMBNAIL,
    MULTI_SNAP_THUMBNAIL_ERROR,
    MULTI_SNAP_PREVIEW,
    PLAYER_STATE_TRANSITION,
    CAPTION_FONT_LOAD_TIME,
    CAPTION_METADATA_LOAD_TIME,
    CAPTION_INIT_TO_TYPEABLE_TIME,
    FONT_SOURCE,
    PROVIDE_EDIT,
    COMPOSE_EDIT,
    PREVIEW_LOADING_CPU_USAGE,
    ACTION_BUTTON_TAP,
    ACTION_BUTTON_LONG_PRESS,
    PRELOAD,
    PINCH_RESIZE,
    DRAWING_BUTTON_PRESSED,
    TAP_RECIPIENTS,
    FILTER_SWIPE,
    FILTER_STACK,
    REWIND_VIDEO_CAPABILITIES,
    REWIND_VIDEO_CAPABILITIES_POOL,
    MEDIA_PLAY_DURATION,
    MEDIA_PLAYER_FPS,
    MEDIA_PLAYER_FRAME_DROP_RATE;

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
        return ink.SNAP_PREVIEW;
    }

    public final ilz b() {
        return a.a(this);
    }
}
