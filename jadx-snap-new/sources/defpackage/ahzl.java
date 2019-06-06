package defpackage;

import java.util.Locale;

/* renamed from: ahzl */
public enum ahzl {
    BIRTHDAY(r2),
    NEW_FRIEND(r3),
    BECOME_BFF(r4),
    BECOME_SBFF(r5),
    BFF(r6),
    SBFF(r7),
    ANY_FRIEND(r8),
    SMIRK(r8),
    BESTIES("BESTIES"),
    MUTUAL_BESTIES("MUTUAL_BESTIES"),
    BF("BF"),
    MUTUAL_BF("MUTUAL_BF"),
    SNAP_STREAK("SNAP_STREAK"),
    STREAK_HOURGLASS("STREAK_HOURGLASS"),
    UNRECOGNIZED_VALUE("UNRECOGNIZED_VALUE");
    
    private final String value;

    private ahzl(String str) {
        this.value = str;
    }

    public static ahzl a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahzl.valueOf(str.toUpperCase(Locale.US));
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
