package com.snap.core.db.query;

import com.snap.core.db.query.FriendsFeedModel.SelectFailedOrQueuedFeedItemsCreator;
import com.snap.core.db.query.FriendsFeedModel.SelectFailedOrQueuedFeedItemsModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$qUpYG58tGy6mthig4GPNH67d2vc implements SelectFailedOrQueuedFeedItemsCreator {
    public static final /* synthetic */ -$$Lambda$qUpYG58tGy6mthig4GPNH67d2vc INSTANCE = new -$$Lambda$qUpYG58tGy6mthig4GPNH67d2vc();

    private /* synthetic */ -$$Lambda$qUpYG58tGy6mthig4GPNH67d2vc() {
    }

    public final SelectFailedOrQueuedFeedItemsModel create(long j, String str, String str2) {
        return new AutoValue_LegacyFriendsFeedQueries_FailedOrSending(j, str, str2);
    }
}
