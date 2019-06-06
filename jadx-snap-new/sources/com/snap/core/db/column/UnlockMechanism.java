package com.snap.core.db.column;

import com.snap.core.db.api.model.IntegerEnumColumn;
import defpackage.ajyi;
import defpackage.akco;
import java.util.Set;

public enum UnlockMechanism implements IntegerEnumColumn {
    LOCATION(0),
    PINNED(1),
    SNAP_CODE(2),
    DEEPLINK(3);
    
    public static final Companion Companion = null;
    private final int intValue;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final Set<UnlockMechanism> any() {
            return ajyi.k(UnlockMechanism.values());
        }
    }

    static {
        Companion = new Companion();
    }

    protected UnlockMechanism(int i) {
        this.intValue = i;
    }

    public final int getIntValue() {
        return this.intValue;
    }
}
