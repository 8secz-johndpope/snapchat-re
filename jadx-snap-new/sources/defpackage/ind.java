package defpackage;

import defpackage.ily.a;

/* renamed from: ind */
public enum ind implements ily {
    TOU_SHOW,
    TOU_ACCEPT,
    TOU_LOGOUT,
    FRIENDMOJI_SHOW,
    FRIENDMOJI_UPDATE,
    FRIENDMOJI_UPDATE_COMPLETED,
    FRIENDMOJI_UPDATE_FAILED,
    FRIENDMOJI_RESET_SHOW,
    FRIENDMOJI_RESET_ACCEPT,
    FRIENDMOJI_PICKER_SHOW,
    FRIENDING_CONTACT_SIZE,
    FRIENDING_CONTACT_PHONE_SIZE,
    FRIENDING_CONTACT_EMAIL_SIZE,
    PROPERTY_STORE_PURGE,
    PERMISSION_REPORT_TRANSMIT;

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
        return ink.IDENTITY;
    }

    public final ilz b() {
        return a.a(this);
    }
}
