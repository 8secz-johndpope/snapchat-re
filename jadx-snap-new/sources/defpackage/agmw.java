package defpackage;

import java.util.Locale;

/* renamed from: agmw */
public enum agmw {
    LINKABLE_LIVE("linkable_live"),
    LINKABLE_ARCHIVED("linkable_archived"),
    NOT_LINKABLE("not_linkable"),
    FAILED("failed"),
    LOADING("loading"),
    NOT_PUBLISHED("not_published"),
    UNRECOGNIZED_VALUE(r8);
    
    private final String value;

    private agmw(String str) {
        this.value = str;
    }

    public static agmw a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return agmw.valueOf(str.toUpperCase(Locale.US));
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
