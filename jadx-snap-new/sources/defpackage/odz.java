package defpackage;

import com.snap.core.db.api.model.IntegerEnumColumn;

/* renamed from: odz */
public enum odz implements IntegerEnumColumn {
    PERSISTED(0),
    RECOVERABLE(1);
    
    private final int intValue;

    private odz(int i) {
        this.intValue = i;
    }

    public final int getIntValue() {
        return this.intValue;
    }
}
