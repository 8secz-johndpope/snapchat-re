package defpackage;

import defpackage.ily.a;

/* renamed from: iox */
public enum iox implements ily {
    USER_DEVICE_KEYS_READ,
    USER_DEVICE_KEYS_WRITE,
    USER_DEVICE_KEYS_REMOVE_LEGACY,
    SAFE_BROWSING_VALIDATE_SUCCESS,
    SAFE_BROWSING_VALIDATE_FAILURE;

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
        return ink.SECURITY;
    }

    public final ilz b() {
        return a.a(this);
    }
}
