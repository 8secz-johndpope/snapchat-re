package defpackage;

import com.snap.core.db.api.model.IntegerEnumColumn;

/* renamed from: hwt */
public enum hwt implements IntegerEnumColumn {
    ENQUEUED(0),
    RUNNING(1),
    SUCCEEDED(2),
    FAILED(3),
    BLOCKED(4),
    CANCELLED(5),
    NOT_FOUND(6);
    
    private final int intValue;

    private hwt(int i) {
        this.intValue = i;
    }

    public final int getIntValue() {
        return this.intValue;
    }
}
