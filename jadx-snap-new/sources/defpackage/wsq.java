package defpackage;

import com.snap.core.db.api.model.IntegerEnumColumn;

/* renamed from: wsq */
public enum wsq implements IntegerEnumColumn {
    SHAKE_REPORT(0),
    CRASH_REPORT(1),
    IN_SETTING_REPORT(2),
    IN_COGNAC(3),
    UNRECOGNIZED_VALUE(4);
    
    private final int intValue;

    private wsq(int i) {
        this.intValue = i;
    }

    public final int getIntValue() {
        return this.intValue;
    }
}
