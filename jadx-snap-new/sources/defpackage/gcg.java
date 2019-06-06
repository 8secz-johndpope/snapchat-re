package defpackage;

import com.snap.core.db.api.model.IntegerEnumColumn;

/* renamed from: gcg */
public enum gcg implements IntegerEnumColumn {
    NONE(0),
    UNRECOGNIZED(1),
    DELTA_HISTORY(2),
    DELTA(3),
    FULL(4);
    
    private final int intValue;

    private gcg(int i) {
        this.intValue = i;
    }

    public final int getIntValue() {
        return this.intValue;
    }
}
