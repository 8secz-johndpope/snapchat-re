package com.snap.core.db.column;

import com.snap.core.db.api.model.IntegerEnumColumn;

public enum MessageClientStatus implements IntegerEnumColumn {
    QUEUED(0),
    PENDING(1),
    SENDING(2),
    FAILED(3),
    FAILED_NON_RECOVERABLE(4),
    OK(5),
    FAILED_NOT_FRIENDS(6);
    
    private final int intValue;

    protected MessageClientStatus(int i) {
        this.intValue = i;
    }

    public final int getIntValue() {
        return this.intValue;
    }
}
