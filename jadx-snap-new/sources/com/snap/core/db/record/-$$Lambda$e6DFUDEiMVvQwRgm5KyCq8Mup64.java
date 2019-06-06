package com.snap.core.db.record;

import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.record.FriendModel.SelectFriendLinkTypesByUsernamesCreator;
import com.snap.core.db.record.FriendModel.SelectFriendLinkTypesByUsernamesModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$e6DFUDEiMVvQwRgm5KyCq8Mup64 implements SelectFriendLinkTypesByUsernamesCreator {
    public static final /* synthetic */ -$$Lambda$e6DFUDEiMVvQwRgm5KyCq8Mup64 INSTANCE = new -$$Lambda$e6DFUDEiMVvQwRgm5KyCq8Mup64();

    private /* synthetic */ -$$Lambda$e6DFUDEiMVvQwRgm5KyCq8Mup64() {
    }

    public final SelectFriendLinkTypesByUsernamesModel create(String str, FriendLinkType friendLinkType) {
        return new AutoValue_FriendRecord_UsernameAndLinkType(str, friendLinkType);
    }
}
