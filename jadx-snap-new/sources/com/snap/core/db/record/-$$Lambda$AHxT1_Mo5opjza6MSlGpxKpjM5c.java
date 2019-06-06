package com.snap.core.db.record;

import com.snap.core.db.column.FeedKind;
import com.snap.core.db.column.Friendmojis;
import com.snap.core.db.column.GroupStoryType;
import com.snap.core.db.column.StoryKind;
import com.snap.core.db.record.StoryModel.SelectPlayableStoryCreator;
import com.snap.core.db.record.StoryModel.SelectPlayableStoryModel;
import defpackage.agec;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$AHxT1_Mo5opjza6MSlGpxKpjM5c implements SelectPlayableStoryCreator {
    public static final /* synthetic */ -$$Lambda$AHxT1_Mo5opjza6MSlGpxKpjM5c INSTANCE = new -$$Lambda$AHxT1_Mo5opjza6MSlGpxKpjM5c();

    private /* synthetic */ -$$Lambda$AHxT1_Mo5opjza6MSlGpxKpjM5c() {
    }

    public final SelectPlayableStoryModel create(long j, String str, String str2, StoryKind storyKind, GroupStoryType groupStoryType, String str3, Friendmojis friendmojis, Long l, String str4, FeedKind feedKind, agec agec) {
        return new AutoValue_StoryRecord_PlayableStoryRecord(j, str, str2, storyKind, groupStoryType, str3, friendmojis, l, str4, feedKind, agec);
    }
}
