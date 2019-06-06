package defpackage;

import java.util.Locale;

/* renamed from: ahfk */
public enum ahfk {
    INACTIVE(r2),
    ACTIVE_CONSUMER(r3),
    ACTIVE_GENERATOR(r4),
    HIGH_CHURN_RISK_ACTIVE(r5),
    NEW_USER(r6),
    LOW_FRIENDS(r7),
    HIGH_CHURN_RISK_NEW(r8),
    RETURNING_FROM_CHURN(r8),
    POPULAR("POPULAR"),
    HIGH_CHURN_RISK_RESURRECTED("HIGH_CHURN_RISK_RESURRECTED"),
    DEEP_CHURN("DEEP_CHURN"),
    SUPER_CREATOR("SUPER_CREATOR"),
    ELIGIBLE_FOR_APP_STORE_RATING("ELIGIBLE_FOR_APP_STORE_RATING"),
    UNRECOGNIZED_VALUE("UNRECOGNIZED_VALUE");
    
    private final String value;

    private ahfk(String str) {
        this.value = str;
    }

    public static ahfk a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahfk.valueOf(str.toUpperCase(Locale.US));
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
