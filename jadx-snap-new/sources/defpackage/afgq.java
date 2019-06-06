package defpackage;

import java.util.Locale;

/* renamed from: afgq */
public enum afgq {
    PHONE_NUMBER_EMPTY(r2),
    PHONE_NUMBER_INVALID(r3),
    PHONE_NUMBER_VALID(r4),
    PHONE_NUMBER_TAKEN(r5),
    COUNTRY_CODE_EMPTY(r6),
    COUNTRY_CODE_INVALID(r7),
    USERID_EMPTY(r8),
    USERID_INVALID(r8),
    USER_NOT_FOUND("USER_NOT_FOUND"),
    VERIFICATION_CODE_EMPTY("VERIFICATION_CODE_EMPTY"),
    VERIFICATION_CODE_ERROR("VERIFICATION_CODE_ERROR"),
    VERIFICATION_CODE_EXPIRED("VERIFICATION_CODE_EXPIRED"),
    SEND_SMS_CODE_FAILED("SEND_SMS_CODE_FAILED"),
    SEND_CALL_CODE_FAILED("SEND_CALL_CODE_FAILED"),
    METHOD_INVALID("METHOD_INVALID"),
    SUCCESS("SUCCESS"),
    UNKNOWN("UNKNOWN"),
    NO_CAPTCHA("NO_CAPTCHA"),
    VERIFY_CAPTCHA_FAILED("VERIFY_CAPTCHA_FAILED"),
    UNRECOGNIZED_VALUE("UNRECOGNIZED_VALUE");
    
    private final String value;

    private afgq(String str) {
        this.value = str;
    }

    public static afgq a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return afgq.valueOf(str.toUpperCase(Locale.US));
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
