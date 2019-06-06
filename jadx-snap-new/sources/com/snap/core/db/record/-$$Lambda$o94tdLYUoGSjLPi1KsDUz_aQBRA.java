package com.snap.core.db.record;

import com.snap.core.db.record.FeedMemberModel.SelectMembersForFeedCreator;
import com.snap.core.db.record.FeedMemberModel.SelectMembersForFeedModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$o94tdLYUoGSjLPi1KsDUz_aQBRA implements SelectMembersForFeedCreator {
    public static final /* synthetic */ -$$Lambda$o94tdLYUoGSjLPi1KsDUz_aQBRA INSTANCE = new -$$Lambda$o94tdLYUoGSjLPi1KsDUz_aQBRA();

    private /* synthetic */ -$$Lambda$o94tdLYUoGSjLPi1KsDUz_aQBRA() {
    }

    public final SelectMembersForFeedModel create(long j, Long l, String str, String str2) {
        return new AutoValue_FeedMemberRecord_ForFeed(j, l, str, str2);
    }
}
