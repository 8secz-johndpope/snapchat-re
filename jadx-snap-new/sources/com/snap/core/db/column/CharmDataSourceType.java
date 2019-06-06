package com.snap.core.db.column;

import com.snap.core.db.api.model.IntegerEnumColumn;
import defpackage.akco;
import defpackage.akcr;
import java.util.Locale;

public enum CharmDataSourceType implements IntegerEnumColumn {
    UNKNOWN(0),
    REMOTE(1),
    LOCAL(2);
    
    public static final Companion Companion = null;
    private final int intValue;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final CharmDataSourceType valueOfIgnoreCase(String str) {
            akcr.b(str, "name");
            Object obj = Locale.US;
            akcr.a(obj, "Locale.US");
            Object toUpperCase = str.toUpperCase(obj);
            akcr.a(toUpperCase, "(this as java.lang.String).toUpperCase(locale)");
            return CharmDataSourceType.valueOf(toUpperCase);
        }
    }

    static {
        Companion = new Companion();
    }

    protected CharmDataSourceType(int i) {
        this.intValue = i;
    }

    public final int getIntValue() {
        return this.intValue;
    }

    public final String toString() {
        return String.valueOf(getIntValue());
    }
}
