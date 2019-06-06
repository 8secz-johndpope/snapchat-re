package com.snap.core.db.column;

import com.snap.core.db.api.model.IntegerEnumColumn;
import defpackage.akco;
import defpackage.akcr;
import java.util.Locale;

public enum PublisherPageSnapType implements IntegerEnumColumn {
    REGULAR(0),
    SUBSCRIPTION(1);
    
    public static final Companion Companion = null;
    private final int intValue;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final PublisherPageSnapType valueOfIgnoreCase(String str) {
            akcr.b(str, "name");
            Object obj = Locale.US;
            akcr.a(obj, "Locale.US");
            Object toUpperCase = str.toUpperCase(obj);
            akcr.a(toUpperCase, "(this as java.lang.String).toUpperCase(locale)");
            return PublisherPageSnapType.valueOf(toUpperCase);
        }
    }

    static {
        Companion = new Companion();
    }

    protected PublisherPageSnapType(int i) {
        this.intValue = i;
    }

    public final int getIntValue() {
        return this.intValue;
    }
}
