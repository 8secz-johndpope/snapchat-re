package defpackage;

/* renamed from: gcl */
public enum gcl {
    UNDEFINED(""),
    BIRTHDAY_PARTY("🎉"),
    NOTIFICATION_PERMISSION("📬"),
    PHONE_NUMBER_VERIFICATION("🔐"),
    SUICIDE_PREVENTION("💌"),
    EMAIL_VERIFICATION("📧");
    
    private final String icon;

    private gcl(String str) {
        this.icon = str;
    }
}
