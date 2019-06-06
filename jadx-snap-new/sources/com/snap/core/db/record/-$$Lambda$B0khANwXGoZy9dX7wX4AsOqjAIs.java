package com.snap.core.db.record;

import com.snap.core.db.record.FeedMemberModel.SelectMembersForTalkCreator;
import com.snap.core.db.record.FeedMemberModel.SelectMembersForTalkModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$B0khANwXGoZy9dX7wX4AsOqjAIs implements SelectMembersForTalkCreator {
    public static final /* synthetic */ -$$Lambda$B0khANwXGoZy9dX7wX4AsOqjAIs INSTANCE = new -$$Lambda$B0khANwXGoZy9dX7wX4AsOqjAIs();

    private /* synthetic */ -$$Lambda$B0khANwXGoZy9dX7wX4AsOqjAIs() {
    }

    public final SelectMembersForTalkModel create(Integer num, Long l, String str, String str2, String str3, String str4) {
        return new AutoValue_FeedMemberRecord_ForTalk(num, l, str, str2, str3, str4);
    }
}
