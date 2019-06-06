package com.snap.core.db.record;

import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.record.FriendModel.SelectFriendLinkTypesByUserIdsCreator;
import com.snap.core.db.record.FriendModel.SelectFriendLinkTypesByUserIdsModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$Zk6h0eElHShuXASzkpFD9vy0B0w implements SelectFriendLinkTypesByUserIdsCreator {
    public static final /* synthetic */ -$$Lambda$Zk6h0eElHShuXASzkpFD9vy0B0w INSTANCE = new -$$Lambda$Zk6h0eElHShuXASzkpFD9vy0B0w();

    private /* synthetic */ -$$Lambda$Zk6h0eElHShuXASzkpFD9vy0B0w() {
    }

    public final SelectFriendLinkTypesByUserIdsModel create(String str, FriendLinkType friendLinkType) {
        return new AutoValue_FriendRecord_UserIdAndLinkType(str, friendLinkType);
    }
}
