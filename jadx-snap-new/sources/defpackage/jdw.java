package defpackage;

import defpackage.fth.a;

/* renamed from: jdw */
public enum jdw implements fth {
    PRE_AUTH_TOKEN(a.a(r1)),
    LOGIN_USERNAME(a.a(r1)),
    ODLV_OTP_TYPE(a.a(r1)),
    ODLV_OBFUSCATED_PHONE(a.a(r1)),
    ODLV_OBFUSCATED_EMAIL(a.a(r1)),
    TWO_FA_SMS_ENABLED(a.a(false)),
    TWO_FA_OTP_ENABLED(a.a(false)),
    TWO_FA_REDACTED_PHONE_NUMBER(a.a(r1)),
    LOGIN_SESSION_ID(a.a(r1)),
    SIGNUP_FIRST_NAME(a.a(r1)),
    SIGNUP_LAST_NAME(a.a(r1)),
    SIGNUP_BIRTHDAY(a.a(r1)),
    SIGNUP_PHONE_NUMBER(a.a(r1)),
    SIGNUP_COUNTRY_CODE(a.a(r1)),
    SIGNUP_HAS_VERIFIED_PHONE_NUMBER(a.a(false)),
    SIGNUP_USERNAME(a.a(r1)),
    SIGNUP_USERNAME_SUGGESTION(a.a(r1)),
    SIGNUP_PASSWORD(a.a(r1)),
    SIGNUP_EMAIL(a.a(r1)),
    SIGNUP_DISPLAY_NAME_ERROR(a.a(r1)),
    SIGNUP_BIRTHDAY_ERROR(a.a(r1)),
    SIGNUP_USERNAME_ERROR(a.a(r1)),
    SIGNUP_PASSWORD_ERROR(a.a(r1)),
    SIGNUP_REGISTRATION_ATTEMPTS(a.a(0)),
    SIGNUP_SESSION_ID(a.a(r1)),
    SIGNUP_IS_USER_CREATED(a.a(false)),
    SIGNUP_IS_HUMAN_VERIFIED(a.a(false)),
    FORGOT_PASSWORD_SESSION_ID(a.a(r1)),
    FORGOT_PASSWORD_PRE_AUTH_TOKEN(a.a(r1)),
    FORGOT_PASSWORD_USER_NAME(a.a(r1)),
    FORGOT_PASSWORD_COUNTRY_CODE(a.a(r1)),
    FORGOT_PASSWORD_PHONE_NUMBER(a.a(r1)),
    FORGOT_PASSWORD_VERIFY_METHOD(a.a(r1)),
    USER_BYPASSED_SIGNUP_PHONE(a.a(false)),
    USER_SET_EMAIL(a.a(false)),
    LAST_VIEWED_LOGIN_SIGNUP_PAGE_TYPE(a.a(r1)),
    SMS_VERIFICATION_FORMAT(a.a(r1)),
    LOGIN_SOURCE(a.a(r1)),
    PREFERRED_VERIFICATION_METHOD(a.a(r1)),
    REG_PHONE_AUTO_ADVANCE(a.a(false)),
    REG_REMOVE_CAPTCHA(a.a(false)),
    SHOW_HIDE_TOGGLE(a.a(a.STUDY));
    
    private final a<?> delegate;

    /* renamed from: jdw$a */
    public enum a {
        private static final /* synthetic */ a[] $VALUES = null;
        public static final a DISABLED = null;
        public static final a ENABLED = null;
        public static final a STUDY = null;

        static {
            STUDY = new a("STUDY", 0);
            ENABLED = new a("ENABLED", 1);
            DISABLED = new a("DISABLED", 2);
            $VALUES = new a[]{STUDY, ENABLED, DISABLED};
        }

        private a(String str, int i) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    private jdw(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.LOGIN_SIGNUP;
    }
}
