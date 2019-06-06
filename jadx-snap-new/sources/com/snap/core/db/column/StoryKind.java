package com.snap.core.db.column;

import com.snap.core.db.api.model.IntegerEnumColumn;

public enum StoryKind implements IntegerEnumColumn {
    FRIEND(0),
    GROUP(1),
    MY(2),
    MY_OVERRIDDEN_PRIVACY(3),
    OFFICIAL(4),
    OUR(5),
    BUSINESS(6),
    DISCOVER(7),
    USER_SHARE(8),
    THIRD_PARTY_APP(9);
    
    private final int intValue;

    protected StoryKind(int i) {
        this.intValue = i;
    }

    public final int getIntValue() {
        return this.intValue;
    }

    public final boolean isMyStory() {
        StoryKind storyKind = this;
        return storyKind == MY || storyKind == MY_OVERRIDDEN_PRIVACY;
    }
}
