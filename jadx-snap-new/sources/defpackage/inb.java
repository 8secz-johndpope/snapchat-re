package defpackage;

import defpackage.ily.a;

/* renamed from: inb */
public enum inb implements ily {
    BACKGROUND_RESTRICTED_COUNT,
    CAMERA_OPERATION_MISMATCH_COUNT,
    CAMERA_CALLER_MISMATCH_COUNT,
    CAMERA_HIDE_MISMATCH_COUNT,
    CAMERA_SHOW_MISMATCH_COUNT;

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
        return ink.BATTERY;
    }

    public final ilz b() {
        return a.a(this);
    }
}
