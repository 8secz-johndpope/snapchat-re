package com.snap.core.db.record;

import com.snap.core.db.record.FeedMemberModel.SelectAllParticipantsForFeedCreator;
import com.snap.core.db.record.FeedMemberModel.SelectAllParticipantsForFeedModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$P1cwtTaXw82X-119sD6GHUvv47g implements SelectAllParticipantsForFeedCreator {
    public static final /* synthetic */ -$$Lambda$P1cwtTaXw82X-119sD6GHUvv47g INSTANCE = new -$$Lambda$P1cwtTaXw82X-119sD6GHUvv47g();

    private /* synthetic */ -$$Lambda$P1cwtTaXw82X-119sD6GHUvv47g() {
    }

    public final SelectAllParticipantsForFeedModel create(long j, String str, String str2) {
        return new AutoValue_FeedMemberRecord_AllParticipants(j, str, str2);
    }
}
