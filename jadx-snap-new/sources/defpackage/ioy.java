package defpackage;

import defpackage.ily.a;

/* renamed from: ioy */
public enum ioy implements ily {
    MESSAGE_SEND_LATENCY,
    MESSAGE_SEND_STEP_LATENCY,
    MESSAGE_SEND_RESULT,
    MESSAGE_SEND_ERROR,
    MESSAGE_SEND_CONNECTIVITY,
    MESSAGE_SEND_ERROR_FATAL,
    SCCP_CONNECTION_FAILURE,
    SCCP_CONNECTION_SUCCESS,
    SCCP_CONNECTION_LATENCY,
    SCCP_CONNECTION_ATTEMPT,
    SCCP_SEND_RESULT,
    MESSAGE_SEND_USER_EVENT,
    MESSAGE_SEND_TIMEOUT,
    MESSAGE_SEND_QUEUE,
    MESSAGE_SEND_ATTEMPT,
    MESSAGE_SEND_PARCEL_DELETED;

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
        return ink.SEND_MESSAGE;
    }

    public final ilz b() {
        return a.a(this);
    }
}
