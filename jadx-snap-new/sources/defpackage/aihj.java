package defpackage;

import java.util.Locale;

/* renamed from: aihj */
public enum aihj {
    PENDING_COLLECTION(r2),
    COLLECTING(r3),
    COLLECTED(r4),
    COLLECTION_CANCELED(r5),
    COLLECTION_FAILED(r6),
    UNRECOGNIZED_VALUE(r7);
    
    private final String value;

    private aihj(String str) {
        this.value = str;
    }

    public static aihj a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aihj.valueOf(str.toUpperCase(Locale.US));
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
