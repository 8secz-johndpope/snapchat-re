package defpackage;

import defpackage.ily.a;

/* renamed from: inf */
public enum inf implements ily {
    UPLOAD_STEP_LATENCY,
    UPLOAD_STEP_RESULT,
    GET_UPLOAD_LOCATION_LATENCY,
    GET_UPLOAD_LOCATION_RESULT,
    UPLOAD_LOCATION_CACHE_SIZE,
    UPLOAD_QUALITY_LEVEL;

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
        return ink.UPLOAD;
    }

    public final ilz b() {
        return a.a(this);
    }
}
