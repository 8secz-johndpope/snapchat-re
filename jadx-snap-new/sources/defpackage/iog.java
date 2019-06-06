package defpackage;

import defpackage.ily.a;

/* renamed from: iog */
public enum iog implements ily {
    SETTINGS_DISPLAY_NAME_CHANGE,
    SETTINGS_PHONE_NUMBER_CHANGE,
    SETTINGS_BIRTHDAY_CHANGE,
    SETTINGS_EMAIL_CHANGE,
    SETTINGS_PASSWORD_CHANGE,
    SETTINGS_SEARCHABILITY_CHANGE,
    TFA_FORGET_DEVICE_ONE,
    TFA_FORGET_DEVICE_ALL,
    TFA_RECOVERY_CODE_GENERATED,
    TFA_OTP_ENABLED,
    TFA_OTP_DISABLED,
    TFA_OTP_VERIFIED_AUTO_SECRET,
    TFA_OTP_VERIFIED_MANUAL_SECRET,
    TFA_SMS_ENABLED,
    TFA_SMS_DISABLED,
    TFA_SMS_SENT_NEW_PHONE,
    TFA_SMS_SENT_ENABLE_PHONE,
    TFA_SMS_VERIFIED_NEW_PHONE,
    TFA_SMS_VERIFIED_ENABLE_PHONE;

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
        return ink.IDENTITY_SETTINGS;
    }

    public final ilz b() {
        return a.a(this);
    }
}
