package defpackage;

import java.util.Locale;

/* renamed from: aidl */
public enum aidl {
    CONTAIN_PLACE_HOLDER_WORD_NAME(r2),
    START_FROM_SCRATCH_BLANK_TEMPLATE(r3),
    CONTAIN_PLACE_HOLDER_WORD_WORDS(r4),
    CONTAIN_PLACE_HOLDER_WORD_MESSAGE(r5),
    CONTAIN_PLACE_HOLDER_WORD_TEXT(r6),
    CONTAIN_PLACE_HOLDER_ARABIC_WORD_NAME(r7),
    CONTAIN_PLACE_HOLDER_ARABIC_WORD_YOUR_WORDS(r8),
    CONTAIN_PLACE_HOLDER_ARABIC_WORD_MESSAGE(r8),
    CONTAIN_PROFANITY("CONTAIN_PROFANITY"),
    UNRECOGNIZED_VALUE("UNRECOGNIZED_VALUE");
    
    private final String value;

    private aidl(String str) {
        this.value = str;
    }

    public static aidl a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aidl.valueOf(str.toUpperCase(Locale.US));
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
