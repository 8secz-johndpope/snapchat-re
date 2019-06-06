package defpackage;

import java.util.Locale;

/* renamed from: aefj */
public enum aefj {
    UPDATE_NOTIFICATION_SETTING(r2),
    UPDATE_MESSAGE_RETENTION_POLICY(r3),
    UPDATE_COGNAC_NOTIFICATION_SETTING(r4),
    UNRECOGNIZED_VALUE(r5);
    
    private final String value;

    private aefj(String str) {
        this.value = str;
    }

    public static aefj a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aefj.valueOf(str.toUpperCase(Locale.US));
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
