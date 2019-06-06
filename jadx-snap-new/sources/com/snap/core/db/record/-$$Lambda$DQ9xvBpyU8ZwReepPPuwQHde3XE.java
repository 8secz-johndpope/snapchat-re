package com.snap.core.db.record;

import com.snap.core.db.column.Friendmojis;
import com.snap.core.db.record.StoryModel.SelectAllFriendStoriesCreator;
import com.snap.core.db.record.StoryModel.SelectAllFriendStoriesModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$DQ9xvBpyU8ZwReepPPuwQHde3XE implements SelectAllFriendStoriesCreator {
    public static final /* synthetic */ -$$Lambda$DQ9xvBpyU8ZwReepPPuwQHde3XE INSTANCE = new -$$Lambda$DQ9xvBpyU8ZwReepPPuwQHde3XE();

    private /* synthetic */ -$$Lambda$DQ9xvBpyU8ZwReepPPuwQHde3XE() {
    }

    public final SelectAllFriendStoriesModel create(long j, String str, String str2, Long l, Boolean bool, long j2, String str3, String str4, Boolean bool2, long j3, long j4, Friendmojis friendmojis) {
        return new AutoValue_StoryRecord_AllInfoRecord(j, str, str2, l, bool, j2, str3, str4, bool2, j3, j4, friendmojis);
    }
}
