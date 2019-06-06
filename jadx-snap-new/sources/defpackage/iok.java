package defpackage;

import defpackage.ily.a;

/* renamed from: iok */
public enum iok implements ily {
    LOGIN_SIGNUP_STARTED,
    INSTALL,
    LOGIN_STARTED,
    LOGIN_ATTEMPT,
    LOGIN_COMPLETED,
    SIGNUP_STARTED,
    SIGNUP_CREATE_ACCOUNT,
    SIGNUP_PHONE_COUNTRY_SOURCE,
    SIGNUP_PHONE_SOURCE,
    SIGNUP_COUNTRY_SOURCE,
    SIGNUP_PHONE_CODE_SENT,
    SIGNUP_PHONE_VERIFIED,
    SIGNUP_GRANT_SEARCHABILITY,
    SIGNUP_DNU_SUCCESS,
    SIGNUP_CONTACT_PERMISSION,
    SIGNUP_SOLVE_CAPTCHA,
    SIGNUP_COMPLETED,
    SIGNUP_FEATURE_AUTOFILL,
    LOGIN_SIGNUP_PAGEVIEW,
    SIGNUP_PAGE_REACH,
    LOGIN_SIGNUP_STATE_TRANSITION,
    INSTALL_REFERRER,
    INSTALL_DEVICE_HISTORY,
    DEVICE_INSTALL_METADATA,
    LOGOUT,
    ONE_TAP_LOGIN_STARTED,
    ONE_TAP_LOGIN_LOGOUT;

    public final ilz a(String str, Enum<?> enumR) {
        akcr.b(str, "shortKey");
        akcr.b(enumR, "shortValue");
        return a.a((ily) this, str, (Enum) enumR);
    }

    public final ilz a(String str, String str2) {
        akcr.b(str, "shortKey");
        akcr.b(str2, "shortValue");
        return a.a((ily) this, str, str2);
    }

    public final ilz a(String str, boolean z) {
        akcr.b(str, "shortKey");
        return a.a((ily) this, str, z);
    }

    public final ink a() {
        return ink.LOGIN_SIGNUP;
    }

    public final ilz b() {
        return a.a(this);
    }
}
