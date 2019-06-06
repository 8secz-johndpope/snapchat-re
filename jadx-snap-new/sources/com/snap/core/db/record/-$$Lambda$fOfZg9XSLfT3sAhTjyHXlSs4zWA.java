package com.snap.core.db.record;

import com.snap.core.db.record.FriendModel.SelectAllFriendUserScoresCreator;
import com.snap.core.db.record.FriendModel.SelectAllFriendUserScoresModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$fOfZg9XSLfT3sAhTjyHXlSs4zWA implements SelectAllFriendUserScoresCreator {
    public static final /* synthetic */ -$$Lambda$fOfZg9XSLfT3sAhTjyHXlSs4zWA INSTANCE = new -$$Lambda$fOfZg9XSLfT3sAhTjyHXlSs4zWA();

    private /* synthetic */ -$$Lambda$fOfZg9XSLfT3sAhTjyHXlSs4zWA() {
    }

    public final SelectAllFriendUserScoresModel create(long j, Long l, String str) {
        return new AutoValue_FriendRecord_UserScore(j, l, str);
    }
}
