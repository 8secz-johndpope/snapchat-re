package defpackage;

import com.snap.core.db.api.model.IntegerEnumColumn;

/* renamed from: hwp */
public enum hwp implements IntegerEnumColumn {
    APP_SCOPE(0),
    USER_SCOPE(1);
    
    private final int intValue;

    private hwp(int i) {
        this.intValue = i;
    }

    public final int getIntValue() {
        return this.intValue;
    }
}
