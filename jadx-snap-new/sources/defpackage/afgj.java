package defpackage;

import java.util.Locale;

/* renamed from: afgj */
public enum afgj {
    LIGHTNING(r2),
    LOW_VISIBILITY(r3),
    PARTIAL_CLOUDY(r4),
    PARTIAL_CLOUDY_NIGHT(r5),
    CLEAR_NIGHT(r6),
    CLOUDY(r7),
    RAINY(r8),
    HAIL(r8),
    SNOW("SNOW"),
    WINDY("WINDY"),
    SUNNY("SUNNY"),
    UNRECOGNIZED_VALUE("UNRECOGNIZED_VALUE");
    
    private final String value;

    private afgj(String str) {
        this.value = str;
    }

    public static afgj a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return afgj.valueOf(str.toUpperCase(Locale.US));
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
