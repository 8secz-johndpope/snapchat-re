package com.snap.core.db.record;

import com.snap.core.db.record.DiscoverFeedStoryModel.GetStoryRowIdsInBatchCreator;
import com.snap.core.db.record.DiscoverFeedStoryModel.GetStoryRowIdsInBatchModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$wV7yWw9iOdoWTe2FnnzvNttGsjs implements GetStoryRowIdsInBatchCreator {
    public static final /* synthetic */ -$$Lambda$wV7yWw9iOdoWTe2FnnzvNttGsjs INSTANCE = new -$$Lambda$wV7yWw9iOdoWTe2FnnzvNttGsjs();

    private /* synthetic */ -$$Lambda$wV7yWw9iOdoWTe2FnnzvNttGsjs() {
    }

    public final GetStoryRowIdsInBatchModel create(String str, long j) {
        return new AutoValue_DiscoverFeedStoryRecord_StoryIdModelRecord(str, j);
    }
}
