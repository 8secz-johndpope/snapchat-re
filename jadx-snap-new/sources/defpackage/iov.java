package defpackage;

import defpackage.ily.a;

/* renamed from: iov */
public enum iov implements ily {
    SNAP_VIEW,
    STORY_VIEW,
    MEDIA_FETCH,
    MEDIA_FETCH_STARTED_DELAY_MS,
    MEDIA_LOAD,
    VIDEO_ERROR,
    IMAGE_ERROR,
    VIDEO_PLAYBACK_STARTED,
    VIDEO_STALL_FREE_PLAYBACK,
    VIDEO_STALLED_PLAYBACK,
    VIDEO_PLAYBACK_STALLS,
    VIDEO_PLAYBACK_STALL_TIME_MS,
    VIDEO_PLAYBACK_STALL_TIME_PCT,
    MEAN_TIME_BETWEEN_STALLS_MS;

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
        return ink.PLAYBACK;
    }

    public final ilz b() {
        return a.a(this);
    }
}
