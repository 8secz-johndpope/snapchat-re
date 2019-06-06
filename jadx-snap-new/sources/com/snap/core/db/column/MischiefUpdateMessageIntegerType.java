package com.snap.core.db.column;

import com.snap.core.db.api.model.IntegerEnumColumn;

public enum MischiefUpdateMessageIntegerType implements IntegerEnumColumn {
    PARTICIPANT_JOINED(0),
    PARTICIPANT_LEFT(1),
    MISCHIEF_NAME_CHANGED(2),
    MISCHIEF_CREATED(3),
    UNRECOGNIZED_VALUE(4),
    INVITE_CREATED(5),
    INVITES_DELETED(6),
    PARTICIPANT_JOINED_BY_INVITE(7);
    
    private final int intValue;

    protected MischiefUpdateMessageIntegerType(int i) {
        this.intValue = i;
    }

    public final int getIntValue() {
        return this.intValue;
    }
}
