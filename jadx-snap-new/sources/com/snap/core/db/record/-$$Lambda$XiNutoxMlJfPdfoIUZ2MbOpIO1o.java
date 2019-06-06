package com.snap.core.db.record;

import com.snap.core.db.record.StorySnapModel.GetUpdatedTimestampsAndViewStatusForStoryRowIdCreator;
import com.snap.core.db.record.StorySnapModel.GetUpdatedTimestampsAndViewStatusForStoryRowIdModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$XiNutoxMlJfPdfoIUZ2MbOpIO1o implements GetUpdatedTimestampsAndViewStatusForStoryRowIdCreator {
    public static final /* synthetic */ -$$Lambda$XiNutoxMlJfPdfoIUZ2MbOpIO1o INSTANCE = new -$$Lambda$XiNutoxMlJfPdfoIUZ2MbOpIO1o();

    private /* synthetic */ -$$Lambda$XiNutoxMlJfPdfoIUZ2MbOpIO1o() {
    }

    public final GetUpdatedTimestampsAndViewStatusForStoryRowIdModel create(long j, long j2, Long l, Boolean bool) {
        return new AutoValue_StorySnapRecord_LatestTimestampsAndViewStatusRecord(j, j2, l, bool);
    }
}
