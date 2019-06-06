package defpackage;

import java.util.Locale;

/* renamed from: aetf */
public enum aetf {
    PARTICIPANT_JOINED(r2),
    PARTICIPANT_LEFT(r3),
    MISCHIEF_NAME_CHANGED(r4),
    MISCHIEF_CREATED(r5),
    INVITE_CREATED(r6),
    INVITES_DELETED(r7),
    PARTICIPANT_JOINED_BY_INVITE(r8),
    UNRECOGNIZED_VALUE(r8);
    
    private final String value;

    private aetf(String str) {
        this.value = str;
    }

    public static aetf a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aetf.valueOf(str.toUpperCase(Locale.US));
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
