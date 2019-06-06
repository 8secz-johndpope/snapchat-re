package com.snap.core.db.record;

import com.snap.core.db.record.FriendModel.SelectUserNameAndRowIdByUserIdsCreator;
import com.snap.core.db.record.FriendModel.SelectUserNameAndRowIdByUserIdsModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$K9jmeK5f59sPSi_WJjDGHgDsR9k implements SelectUserNameAndRowIdByUserIdsCreator {
    public static final /* synthetic */ -$$Lambda$K9jmeK5f59sPSi_WJjDGHgDsR9k INSTANCE = new -$$Lambda$K9jmeK5f59sPSi_WJjDGHgDsR9k();

    private /* synthetic */ -$$Lambda$K9jmeK5f59sPSi_WJjDGHgDsR9k() {
    }

    public final SelectUserNameAndRowIdByUserIdsModel create(String str, String str2, long j) {
        return new AutoValue_FriendRecord_UserIdAndUsernameAndRow(str, str2, j);
    }
}
