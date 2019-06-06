package com.snap.core.db.query;

import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.query.SearchModel.GetAllFriendsStatusCreator;
import com.snap.core.db.query.SearchModel.GetAllFriendsStatusModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$pslfz53feLmdWElmlesCOjCTRSA implements GetAllFriendsStatusCreator {
    public static final /* synthetic */ -$$Lambda$pslfz53feLmdWElmlesCOjCTRSA INSTANCE = new -$$Lambda$pslfz53feLmdWElmlesCOjCTRSA();

    private /* synthetic */ -$$Lambda$pslfz53feLmdWElmlesCOjCTRSA() {
    }

    public final GetAllFriendsStatusModel create(long j, String str, FriendLinkType friendLinkType, String str2) {
        return new AutoValue_LegacySearchQueries_FriendsStatus(j, str, friendLinkType, str2);
    }
}
