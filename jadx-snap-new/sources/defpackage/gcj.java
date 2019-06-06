package defpackage;

import com.snap.core.db.api.model.IntegerEnumColumn;

/* renamed from: gcj */
public enum gcj implements IntegerEnumColumn {
    INITIAL(0),
    PRESERVED(1),
    UNPRESERVED(2);
    
    private final int intValue;

    private gcj(int i) {
        this.intValue = i;
    }

    public final int getIntValue() {
        return this.intValue;
    }
}
