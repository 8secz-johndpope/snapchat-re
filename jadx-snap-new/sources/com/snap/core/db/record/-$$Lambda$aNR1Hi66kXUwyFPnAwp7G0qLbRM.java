package com.snap.core.db.record;

import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.record.FriendModel.SelectExistingUserDataCreator;
import com.snap.core.db.record.FriendModel.SelectExistingUserDataModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$aNR1Hi66kXUwyFPnAwp7G0qLbRM implements SelectExistingUserDataCreator {
    public static final /* synthetic */ -$$Lambda$aNR1Hi66kXUwyFPnAwp7G0qLbRM INSTANCE = new -$$Lambda$aNR1Hi66kXUwyFPnAwp7G0qLbRM();

    private /* synthetic */ -$$Lambda$aNR1Hi66kXUwyFPnAwp7G0qLbRM() {
    }

    public final SelectExistingUserDataModel create(long j, String str, String str2, String str3, FriendLinkType friendLinkType) {
        return new AutoValue_FriendRecord_ExistingUserData(j, str, str2, str3, friendLinkType);
    }
}
