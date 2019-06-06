package com.snap.core.db.record;

import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.record.FriendModel.SelectFriendsByLinkTypesCreator;
import com.snap.core.db.record.FriendModel.SelectFriendsByLinkTypesModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$sA9N-C_EJoxW210ljnXsh595g0o implements SelectFriendsByLinkTypesCreator {
    public static final /* synthetic */ -$$Lambda$sA9N-C_EJoxW210ljnXsh595g0o INSTANCE = new -$$Lambda$sA9N-C_EJoxW210ljnXsh595g0o();

    private /* synthetic */ -$$Lambda$sA9N-C_EJoxW210ljnXsh595g0o() {
    }

    public final SelectFriendsByLinkTypesModel create(String str, String str2, String str3, FriendLinkType friendLinkType) {
        return new AutoValue_FriendRecord_FriendInfoAndLinkType(str, str2, str3, friendLinkType);
    }
}
