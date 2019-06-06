package defpackage;

import defpackage.ily.a;

/* renamed from: iop */
public enum iop implements ily {
    PUSH_RECEIVED,
    WORK_RELEASED,
    VALIDATED,
    QUEUED_TO_DISPLAY,
    NOTHING_TO_DISPLAY,
    INVALID,
    MISSING_HANDLER,
    DISPLAYED,
    DISPLAY_DROPPED,
    TOTAL_DISPLAY_LATENCY,
    NULL_REMOTE_MESSAGE,
    NULL_REMOTE_DATA;

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
        return ink.NOTIFICATIONS;
    }

    public final ilz b() {
        return a.a(this);
    }
}
