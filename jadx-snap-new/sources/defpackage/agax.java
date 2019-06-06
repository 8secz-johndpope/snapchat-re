package defpackage;

import java.util.Locale;

/* renamed from: agax */
public enum agax {
    DELETE_FRIEND(r2),
    STORY_UNARCHIVE_ERROR(r3),
    UNARCHIVE_ERROR(r4),
    LOG_OUT(r5),
    EMPTY_VALUE_FROM_SERVER(r6),
    BAD_STATE_PREP(r7),
    REQUEST_UNBLOCK(r8),
    DB_DOWNGRADE(r8),
    DB_UPGRADE("DB_UPGRADE"),
    DOC_OBJECT_DELTA_CURSOR_MISSING("DOC_OBJECT_DELTA_CURSOR_MISSING"),
    DOC_OBJECT_DELTA_CURSOR_OUTDATED("DOC_OBJECT_DELTA_CURSOR_OUTDATED"),
    UNRECOGNIZED_VALUE("UNRECOGNIZED_VALUE");
    
    private final String value;

    private agax(String str) {
        this.value = str;
    }

    public static agax a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return agax.valueOf(str.toUpperCase(Locale.US));
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
