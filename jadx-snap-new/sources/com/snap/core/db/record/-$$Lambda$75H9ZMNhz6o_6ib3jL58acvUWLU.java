package com.snap.core.db.record;

import com.snap.core.db.record.FeedMemberModel.GetGroupFeedIdsForFriendRowIdsCreator;
import com.snap.core.db.record.FeedMemberModel.GetGroupFeedIdsForFriendRowIdsModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$75H9ZMNhz6o_6ib3jL58acvUWLU implements GetGroupFeedIdsForFriendRowIdsCreator {
    public static final /* synthetic */ -$$Lambda$75H9ZMNhz6o_6ib3jL58acvUWLU INSTANCE = new -$$Lambda$75H9ZMNhz6o_6ib3jL58acvUWLU();

    private /* synthetic */ -$$Lambda$75H9ZMNhz6o_6ib3jL58acvUWLU() {
    }

    public final GetGroupFeedIdsForFriendRowIdsModel create(long j, String str) {
        return new AutoValue_FeedMemberRecord_GroupInfo(j, str);
    }
}
