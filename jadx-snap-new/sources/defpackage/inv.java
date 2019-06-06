package defpackage;

import defpackage.ily.a;

/* renamed from: inv */
public enum inv implements ily {
    TOTAL_REQUEST_COUNT,
    SUCCESS_REQUEST_COUNT,
    TOTAL_LATENCY,
    CONTENT_MANAGER_LATENCY;

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
        return ink.CONTENT_RESOLVER;
    }

    public final ilz b() {
        return a.a(this);
    }
}
