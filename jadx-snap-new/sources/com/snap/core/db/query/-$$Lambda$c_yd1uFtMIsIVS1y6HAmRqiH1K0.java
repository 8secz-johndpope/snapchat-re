package com.snap.core.db.query;

import com.snap.core.db.query.FriendsFeedModel.SelectNonFailedFeedItemsCreator;
import com.snap.core.db.query.FriendsFeedModel.SelectNonFailedFeedItemsModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$c_yd1uFtMIsIVS1y6HAmRqiH1K0 implements SelectNonFailedFeedItemsCreator {
    public static final /* synthetic */ -$$Lambda$c_yd1uFtMIsIVS1y6HAmRqiH1K0 INSTANCE = new -$$Lambda$c_yd1uFtMIsIVS1y6HAmRqiH1K0();

    private /* synthetic */ -$$Lambda$c_yd1uFtMIsIVS1y6HAmRqiH1K0() {
    }

    public final SelectNonFailedFeedItemsModel create(long j, String str, String str2) {
        return new AutoValue_LegacyFriendsFeedQueries_NonFailed(j, str, str2);
    }
}
