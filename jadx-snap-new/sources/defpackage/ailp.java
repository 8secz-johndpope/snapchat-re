package defpackage;

import java.util.Locale;

/* renamed from: ailp */
public enum ailp {
    JAVA(r2),
    ANR(r3),
    NATIVE(r4),
    MEMORY_LEAK(r5),
    CPP_EXCEPTION(r6),
    MACH(r7),
    NSEXCEPTION(r8),
    SIGNAL(r8),
    NON_FATAL("NON_FATAL"),
    UNRECOGNIZED_VALUE("UNRECOGNIZED_VALUE");
    
    private final String value;

    private ailp(String str) {
        this.value = str;
    }

    public static ailp a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ailp.valueOf(str.toUpperCase(Locale.US));
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
