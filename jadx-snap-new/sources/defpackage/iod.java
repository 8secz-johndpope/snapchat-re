package defpackage;

import defpackage.ily.a;

/* renamed from: iod */
public enum iod implements ily {
    FIRST_FILTER_PREPARE_TIME,
    GEOFILTER_PREPARE_TIME,
    GEOFILTER_COMPOSE_ERROR,
    REQUEST_LATENCY,
    BITMAP_COMPRESS_LATENCY,
    SWIPE_SESSION,
    GEOFILTER_SWIPE,
    GEOFILTER_SEND,
    GEOFILTER_STORY_POST,
    GEOFILTER_SAVE,
    GEOFILTER_VIEW,
    GEOFILTER_LOADED_COUNT;

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
        return ink.GEOFILTER;
    }

    public final ilz b() {
        return a.a(this);
    }
}
