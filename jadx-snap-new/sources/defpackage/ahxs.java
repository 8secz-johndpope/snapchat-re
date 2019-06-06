package defpackage;

import java.util.Locale;

/* renamed from: ahxs */
public enum ahxs {
    CHEETAH(r2),
    PRE_CHEETAH(r3),
    RANKING(r4),
    DESIGN_FEEDBACK(r5),
    INCLUDE_PERF_LOGS(r6),
    MUST_FIX(r7),
    WATCH_IN_JIRA(r8),
    UNRECOGNIZED_VALUE(r8);
    
    private final String value;

    private ahxs(String str) {
        this.value = str;
    }

    public static ahxs a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahxs.valueOf(str.toUpperCase(Locale.US));
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
