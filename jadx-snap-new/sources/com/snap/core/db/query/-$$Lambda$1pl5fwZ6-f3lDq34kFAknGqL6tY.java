package com.snap.core.db.query;

import com.snap.core.db.query.SearchModel.GetGroupStoriesCreator;
import com.snap.core.db.query.SearchModel.GetGroupStoriesModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$1pl5fwZ6-f3lDq34kFAknGqL6tY implements GetGroupStoriesCreator {
    public static final /* synthetic */ -$$Lambda$1pl5fwZ6-f3lDq34kFAknGqL6tY INSTANCE = new -$$Lambda$1pl5fwZ6-f3lDq34kFAknGqL6tY();

    private /* synthetic */ -$$Lambda$1pl5fwZ6-f3lDq34kFAknGqL6tY() {
    }

    public final GetGroupStoriesModel create(long j, String str, String str2, Long l, Long l2, Boolean bool) {
        return new AutoValue_LegacySearchQueries_GroupStory(j, str, str2, l, l2, bool);
    }
}
