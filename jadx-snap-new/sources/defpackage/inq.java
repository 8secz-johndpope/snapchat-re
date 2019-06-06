package defpackage;

import defpackage.ily.a;

/* renamed from: inq */
public enum inq implements ily {
    ENTERING_CAMERA_PAGE,
    STREAMING_BEGAN,
    STREAMING_FAILED,
    LEFT_CAMERA_PAGE,
    OPEN_ATTEMPT,
    OPEN_SUCCESS,
    OPEN_FAILURE,
    OPEN_INTERRUPT,
    PHOTO_ATTEMPTED,
    PHOTO_MEDIA_SUCCESS,
    PHOTO_PREVIEW_ENTERED,
    VIDEO_ATTEMPTED,
    VIDEO_MEDIA_SUCCESS,
    VIDEO_PREVIEW_ENTERED,
    STREAMING_DELAYED,
    STREAMING_BEGAN_AFTER_DELAY,
    CAMERA_OPEN,
    CAMERA_START,
    CAMERA_STOP,
    CAMERA_CLOSE,
    TAKE_PICTURE_CAPTURE,
    SCREENSHOT_CAPTURE,
    SCREENSHOT_PLUS_CAPTURE,
    POST_PROCESS_SCREENSHOT_CAPTURE,
    GHOST_TO_SNAPPABLE,
    GHOST_TO_FEED_READY,
    SNAP_CREATION_DELAY,
    CRASH_SNAP_RECOVERY,
    CRASH_SNAP_LOOP_EXIT,
    KEY_EVENT_INTERCEPTION_BUG;

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
        return ink.CAMERA;
    }

    public final ilz b() {
        return a.a(this);
    }
}
