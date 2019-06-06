package defpackage;

import defpackage.ily.a;

/* renamed from: inn */
public enum inn implements ily {
    STUDY,
    AVATAR_DATA_REQUEST_LOAD_TIME,
    AVATAR_DATA_REQUEST_ERROR,
    AVATAR_DATA_REQUEST_LOAD_TIMEOUT,
    UPDATE_AVATAR_TIMEOUT,
    WEB_BUILDER_LOAD_TIME,
    WEB_BUILDER_ERROR,
    WEB_VIEW_VERSION,
    WEB_VIEW_INCOMPATIBLE,
    BITMOJI_APP_NOT_INSTALLED,
    BITMOJI_APP_INSTALLED;

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
        return ink.BITMOJI;
    }

    public final ilz b() {
        return a.a(this);
    }
}
