package defpackage;

import com.snap.core.db.api.model.IntegerEnumColumn;

/* renamed from: yfk */
public enum yfk implements IntegerEnumColumn {
    CLEAN(1),
    DIRTY(2);
    
    private final int intValue;

    private yfk(int i) {
        this.intValue = i;
    }

    public final int getIntValue() {
        return this.intValue;
    }
}
