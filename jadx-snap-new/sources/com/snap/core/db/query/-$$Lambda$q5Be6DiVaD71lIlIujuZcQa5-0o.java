package com.snap.core.db.query;

import com.snap.core.db.query.FriendsFeedSuggestedFriendsModel.SelectSuggestedFriendsCreator;
import com.snap.core.db.query.FriendsFeedSuggestedFriendsModel.SelectSuggestedFriendsModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$q5Be6DiVaD71lIlIujuZcQa5-0o implements SelectSuggestedFriendsCreator {
    public static final /* synthetic */ -$$Lambda$q5Be6DiVaD71lIlIujuZcQa5-0o INSTANCE = new -$$Lambda$q5Be6DiVaD71lIlIujuZcQa5-0o();

    private /* synthetic */ -$$Lambda$q5Be6DiVaD71lIlIujuZcQa5-0o() {
    }

    public final SelectSuggestedFriendsModel create(long j, String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, String str6, String str7, Long l, Boolean bool3, Long l2, Long l3) {
        return new AutoValue_LegacyFriendsFeedSuggestedFriendQueries_WithDisplayInfo(j, str, str2, str3, str4, str5, bool, bool2, str6, str7, l, bool3, l2, l3);
    }
}
