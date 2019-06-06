package defpackage;

import java.util.Locale;

/* renamed from: ahlw */
public enum ahlw {
    SNAPCODE(r2),
    BARCODE(r3),
    QR_CODE(r4),
    KEYWORD(r5),
    KHALEESI(r6),
    UNRECOGNIZED_VALUE(r7);
    
    private final String value;

    private ahlw(String str) {
        this.value = str;
    }

    public static ahlw a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahlw.valueOf(str.toUpperCase(Locale.US));
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
