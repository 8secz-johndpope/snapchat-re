package defpackage;

import java.util.Locale;

/* renamed from: aflo */
public enum aflo {
    THREE_V(r2),
    APP_INSTALL(r3),
    LONGFORM_VIDEO(r4),
    REMOTE_WEBPAGE(r5),
    LOCAL_WEBPAGE(r6),
    STORY(r7),
    LENS_SLOT(r8),
    NO_FILL(r8),
    LENS_CAROUSEL("LENS_CAROUSEL"),
    FILTER_CAROUSEL("FILTER_CAROUSEL"),
    DEEP_LINK_ATTACHMENT("DEEP_LINK_ATTACHMENT"),
    FILTER("FILTER"),
    UNLOCKABLE_VIEW("UNLOCKABLE_VIEW"),
    LENS("LENS"),
    AD_TO_LENS("AD_TO_LENS"),
    AD_TO_FILTER("AD_TO_FILTER"),
    COLLECTION("COLLECTION"),
    UNRECOGNIZED_VALUE("UNRECOGNIZED_VALUE");
    
    private final String value;

    private aflo(String str) {
        this.value = str;
    }

    public static aflo a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aflo.valueOf(str.toUpperCase(Locale.US));
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
