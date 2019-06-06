package com.snap.core.db.record;

import com.snap.core.db.record.FriendModel.SelectUserNameByUserIdsCreator;
import com.snap.core.db.record.FriendModel.SelectUserNameByUserIdsModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$935TDypeEMZoFkWUzIkGHDLflPE implements SelectUserNameByUserIdsCreator {
    public static final /* synthetic */ -$$Lambda$935TDypeEMZoFkWUzIkGHDLflPE INSTANCE = new -$$Lambda$935TDypeEMZoFkWUzIkGHDLflPE();

    private /* synthetic */ -$$Lambda$935TDypeEMZoFkWUzIkGHDLflPE() {
    }

    public final SelectUserNameByUserIdsModel create(String str, String str2) {
        return new AutoValue_FriendRecord_UserIdAndUsername(str, str2);
    }
}
