package defpackage;

import java.util.Locale;

/* renamed from: ahqv */
public enum ahqv {
    STATUS_NOT_STARTED(r2),
    STATUS_LOADING_LOCAL(r3),
    STATUS_CLIENT_INIT(r4),
    STATUS_LOGIN_EXISTING(r5),
    STATUS_LOGIN_NEW(r6),
    STATUS_READY(r7),
    STATUS_FAILED(r8),
    UNRECOGNIZED_VALUE(r8);
    
    private final String value;

    private ahqv(String str) {
        this.value = str;
    }

    public static ahqv a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahqv.valueOf(str.toUpperCase(Locale.US));
        } catch (Exception unused) {
            return UNRECOGNIZED_VALUE;
        }
    }

    public final String a() {
        return this.value;
    }

    public final String toString() {
        return this.value;
    }
}
