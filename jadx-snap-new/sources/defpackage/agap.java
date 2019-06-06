package defpackage;

import java.util.Locale;

/* renamed from: agap */
public enum agap {
    DISCOVER_CHANNEL(r2),
    LIVE_STORY(r3),
    UNRECOGNIZED_VALUE(r4);
    
    private final String value;

    private agap(String str) {
        this.value = str;
    }

    public static agap a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return agap.valueOf(str.toUpperCase(Locale.US));
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
