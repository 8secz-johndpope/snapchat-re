package com.snap.core.db.column;

import com.snap.core.db.api.model.IntegerEnumColumn;
import defpackage.akco;
import defpackage.akcr;
import java.util.Locale;

public enum FeatureType implements IntegerEnumColumn {
    CHAT(0),
    DISCOVER_FEED(1),
    SEARCH(2),
    MAP(3),
    SHOWS(4),
    SNAP_PRO(5);
    
    public static final Companion Companion = null;
    private final int intValue;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final FeatureType valueOfIgnoreCase(String str) {
            akcr.b(str, "name");
            Object obj = Locale.US;
            akcr.a(obj, "Locale.US");
            Object toUpperCase = str.toUpperCase(obj);
            akcr.a(toUpperCase, "(this as java.lang.String).toUpperCase(locale)");
            return FeatureType.valueOf(toUpperCase);
        }
    }

    static {
        Companion = new Companion();
    }

    protected FeatureType(int i) {
        this.intValue = i;
    }

    public final int getIntValue() {
        return this.intValue;
    }
}
