package defpackage;

import java.util.Locale;

/* renamed from: aikr */
public enum aikr {
    USERID_EMPTY(r2),
    USERID_INVALID(r3),
    VERIFICATION_CODE_EMPTY(r4),
    VERIFICATION_CODE_ERROR(r5),
    VERIFICATION_CODE_EXPIRED(r6),
    UNRECOGNIZED_VALUE(r7);
    
    private final String value;

    private aikr(String str) {
        this.value = str;
    }

    public static aikr a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aikr.valueOf(str.toUpperCase(Locale.US));
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
