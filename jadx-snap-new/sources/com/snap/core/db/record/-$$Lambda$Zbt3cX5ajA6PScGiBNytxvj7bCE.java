package com.snap.core.db.record;

import com.snap.core.db.record.StorySnapModel.GetRowIdAndViewedByStoryRowIdClientIdCreator;
import com.snap.core.db.record.StorySnapModel.GetRowIdAndViewedByStoryRowIdClientIdModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$Zbt3cX5ajA6PScGiBNytxvj7bCE implements GetRowIdAndViewedByStoryRowIdClientIdCreator {
    public static final /* synthetic */ -$$Lambda$Zbt3cX5ajA6PScGiBNytxvj7bCE INSTANCE = new -$$Lambda$Zbt3cX5ajA6PScGiBNytxvj7bCE();

    private /* synthetic */ -$$Lambda$Zbt3cX5ajA6PScGiBNytxvj7bCE() {
    }

    public final GetRowIdAndViewedByStoryRowIdClientIdModel create(long j, Boolean bool) {
        return new AutoValue_StorySnapRecord_RowIdAndViewedRecord(j, bool);
    }
}
