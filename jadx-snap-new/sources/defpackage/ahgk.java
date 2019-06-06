package defpackage;

import java.util.Locale;

/* renamed from: ahgk */
public enum ahgk {
    UPDATE_DISPLAY(r2),
    UPDATE_FIRMWARE_VERSION(r3),
    UPDATE_DEVICE_INFO(r4),
    DELETE_DEVICE(r5),
    UNRECOGNIZED_VALUE(r6);
    
    private final String value;

    private ahgk(String str) {
        this.value = str;
    }

    public static ahgk a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahgk.valueOf(str.toUpperCase(Locale.US));
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
