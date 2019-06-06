package defpackage;

import defpackage.ily.a;

/* renamed from: ioz */
public enum ioz implements ily {
    SEND_TO_GROUP_STORY_LOAD,
    SEND_TO_GROUP_LOAD,
    SEND_TO_LOAD_LATENCY,
    ALL_SECTIONS_LOADED_LATENCY,
    SEND_AND_RECYCLE_LATENCY;

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
        return ink.SEND_TO;
    }

    public final ilz b() {
        return a.a(this);
    }
}
