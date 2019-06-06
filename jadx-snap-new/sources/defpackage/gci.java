package defpackage;

import com.snap.core.db.api.model.IntegerEnumColumn;

/* renamed from: gci */
public enum gci implements IntegerEnumColumn {
    MESSAGE_SEND(0),
    SAVE_STATE_UPDATE(3),
    PRESERVE_STATE_UPDATE(4),
    CONVERSATION_ID_CHANGED(6),
    RELEASED(7);
    
    private final int intValue;

    private gci(int i) {
        this.intValue = i;
    }

    public final int getIntValue() {
        return this.intValue;
    }
}
