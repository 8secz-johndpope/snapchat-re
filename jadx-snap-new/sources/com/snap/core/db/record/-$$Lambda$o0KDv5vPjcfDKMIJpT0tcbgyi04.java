package com.snap.core.db.record;

import com.snap.core.db.record.FeedModel.GetFeedIdForKeysCreator;
import com.snap.core.db.record.FeedModel.GetFeedIdForKeysModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$o0KDv5vPjcfDKMIJpT0tcbgyi04 implements GetFeedIdForKeysCreator {
    public static final /* synthetic */ -$$Lambda$o0KDv5vPjcfDKMIJpT0tcbgyi04 INSTANCE = new -$$Lambda$o0KDv5vPjcfDKMIJpT0tcbgyi04();

    private /* synthetic */ -$$Lambda$o0KDv5vPjcfDKMIJpT0tcbgyi04() {
    }

    public final GetFeedIdForKeysModel create(long j, String str) {
        return new AutoValue_FeedRecord_FeedId(j, str);
    }
}
