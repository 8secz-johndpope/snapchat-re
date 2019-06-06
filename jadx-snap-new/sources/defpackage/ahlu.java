package defpackage;

import java.util.Locale;

/* renamed from: ahlu */
public enum ahlu {
    ADD_FRIEND(r2),
    BARCODE_OFFER(r3),
    OPEN_URL(r4),
    DEEP_LINK(r5),
    MESSAGE(r6),
    UNLOCKABLE(r7),
    QUICK_ADD(r8),
    URL_ONLY(r8),
    KHALEESI_ACTION("KHALEESI_ACTION"),
    BITMOJI("BITMOJI"),
    PROFILE_MEDIA("PROFILE_MEDIA"),
    LENS("LENS"),
    MONEY_REQUEST("MONEY_REQUEST"),
    MARCO_ACTION("MARCO_ACTION"),
    AD_CREATIVE_PREVIEW("AD_CREATIVE_PREVIEW"),
    UNLOCKABLE_STICKER("UNLOCKABLE_STICKER"),
    URL_SHARE("URL_SHARE"),
    NOTIFICATION_OPT_IN("NOTIFICATION_OPT_IN"),
    SNAP_KIT_DEEP_LINK("SNAP_KIT_DEEP_LINK"),
    UNRECOGNIZED_VALUE("UNRECOGNIZED_VALUE");
    
    private final String value;

    private ahlu(String str) {
        this.value = str;
    }

    public static ahlu a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahlu.valueOf(str.toUpperCase(Locale.US));
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
