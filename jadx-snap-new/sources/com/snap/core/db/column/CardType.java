package com.snap.core.db.column;

import com.snap.core.db.api.model.IntegerEnumColumn;
import defpackage.akco;
import defpackage.akcr;
import java.util.Locale;

public enum CardType implements IntegerEnumColumn {
    OUR_STORY_CARD(0),
    PUBLISHER_STORY_CARD(1),
    PUBLIC_USER_STORY_CARD(2),
    MAP_TILE_CARD(3),
    PROMOTED_STORY_CARD(4),
    GROUP_STORY_CARD(5),
    MOMENT_CARD(6),
    COGNAC(7),
    FRIEND_STORY_CARD(8),
    UNKNOWN(9),
    ERROR(10);
    
    public static final Companion Companion = null;
    private final int intValue;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final CardType valueOf(String str) {
            while (true) {
                akcr.b(str, "name");
                Object obj = Locale.US;
                akcr.a(obj, "Locale.US");
                Object str2 = str2.toUpperCase(obj);
                akcr.a(str2, "(this as java.lang.String).toUpperCase(locale)");
            }
        }
    }

    static {
        Companion = new Companion();
    }

    protected CardType(int i) {
        this.intValue = i;
    }

    public final int getIntValue() {
        return this.intValue;
    }
}
