package com.snap.core.db.record;

import com.snap.core.db.column.FeatureType;
import com.snap.core.db.record.DiscoverFeedStoryModel.Creator;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$KOSrulupRk7uE8e5aycqe3riwdQ implements Creator {
    public static final /* synthetic */ -$$Lambda$KOSrulupRk7uE8e5aycqe3riwdQ INSTANCE = new -$$Lambda$KOSrulupRk7uE8e5aycqe3riwdQ();

    private /* synthetic */ -$$Lambda$KOSrulupRk7uE8e5aycqe3riwdQ() {
    }

    public final DiscoverFeedStoryModel create(long j, String str, FeatureType featureType, long j2) {
        return new AutoValue_DiscoverFeedStoryRecord(j, str, featureType, j2);
    }
}
