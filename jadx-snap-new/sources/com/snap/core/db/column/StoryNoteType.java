package com.snap.core.db.column;

import com.snap.core.db.api.model.IntegerEnumColumn;

public enum StoryNoteType implements IntegerEnumColumn {
    FRIEND_STORY_NOTE(0),
    OTHER_STORY_NOTE(1);
    
    private final int intValue;

    protected StoryNoteType(int i) {
        this.intValue = i;
    }

    public final int getIntValue() {
        return this.intValue;
    }
}
