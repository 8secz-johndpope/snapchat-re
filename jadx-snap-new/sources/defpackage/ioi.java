package defpackage;

import defpackage.ily.a;

/* renamed from: ioi */
public enum ioi implements ily {
    HANDLED_EXCEPTION,
    FLAG_STILL_SET,
    FPS,
    VIDEO_RECORD_FPS,
    FRAME_TIME,
    VIDEO_RECORD_FRAME_TIME,
    INIT_DELAY,
    APPLY_DELAY,
    TAP_TO_ACTIVATE,
    ASSET_VALIDATION_FAILED,
    VALIDATION_FAILED,
    CACHE_SIZE,
    AMOUNT_CACHED;

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
        return ink.LENS;
    }

    public final ilz b() {
        return a.a(this);
    }
}
