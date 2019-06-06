package com.snap.core.db.query;

import com.snap.core.db.query.LegacySendToQueries.SuggestedFriend;
import com.snap.core.db.query.SendToModel.GetSuggestedFriendsCreator;
import com.snap.core.db.query.SendToModel.GetSuggestedFriendsModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$ngKtKd9nUEsCmG6bm7p98WP1E5E implements GetSuggestedFriendsCreator {
    public static final /* synthetic */ -$$Lambda$ngKtKd9nUEsCmG6bm7p98WP1E5E INSTANCE = new -$$Lambda$ngKtKd9nUEsCmG6bm7p98WP1E5E();

    private /* synthetic */ -$$Lambda$ngKtKd9nUEsCmG6bm7p98WP1E5E() {
    }

    public final GetSuggestedFriendsModel create(long j, String str, String str2, String str3, String str4, String str5, boolean z, Boolean bool, String str6, String str7) {
        return SuggestedFriend.create(j, str, str2, str3, str4, str5, z, bool, str6, str7);
    }
}
