package com.snap.core.db.query;

import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.record.FriendTestModel.SelectFriendTestDataByUserIdCreator;
import com.snap.core.db.record.FriendTestModel.SelectFriendTestDataByUserIdModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$amFTGrzjDo-xIohTXOvq4I18OmI implements SelectFriendTestDataByUserIdCreator {
    public static final /* synthetic */ -$$Lambda$amFTGrzjDo-xIohTXOvq4I18OmI INSTANCE = new -$$Lambda$amFTGrzjDo-xIohTXOvq4I18OmI();

    private /* synthetic */ -$$Lambda$amFTGrzjDo-xIohTXOvq4I18OmI() {
    }

    public final SelectFriendTestDataByUserIdModel create(String str, String str2, long j, FriendLinkType friendLinkType) {
        return new AutoValue_LegacyFriendTestQueries_FriendTestData(str, str2, j, friendLinkType);
    }
}
