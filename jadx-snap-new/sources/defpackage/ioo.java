package defpackage;

import defpackage.ily.a;

/* renamed from: ioo */
public enum ioo implements ily {
    REQUEST_SUBMITTED_COUNT,
    REQUEST_EXECUTED_COUNT,
    DATA_SAVER_DIALOG_SHOWN_COUNT,
    DATA_SAVER_DIALOG_GO_TO_SETTINGS,
    USER_BLOCKING_QUEUING_LATENCY,
    USER_BLOCKING_NETWORK_LATENCY;

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
        return ink.NETWORK_MANAGER;
    }

    public final ilz b() {
        return a.a(this);
    }
}
