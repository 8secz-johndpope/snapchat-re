package com.snap.core.db.record;

import com.snap.core.db.column.FriendmojiType;
import com.snap.core.db.record.FriendmojiModel.GetFriendmojiForCategoryCreator;
import com.snap.core.db.record.FriendmojiModel.GetFriendmojiForCategoryModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$3QjFP0Dlpl9Wa2vaVUf2AtQq6UQ implements GetFriendmojiForCategoryCreator {
    public static final /* synthetic */ -$$Lambda$3QjFP0Dlpl9Wa2vaVUf2AtQq6UQ INSTANCE = new -$$Lambda$3QjFP0Dlpl9Wa2vaVUf2AtQq6UQ();

    private /* synthetic */ -$$Lambda$3QjFP0Dlpl9Wa2vaVUf2AtQq6UQ() {
    }

    public final GetFriendmojiForCategoryModel create(String str, Long l, FriendmojiType friendmojiType, String str2, String str3) {
        return new AutoValue_FriendmojiRecord_FriendmojiForCategory(str, l, friendmojiType, str2, str3);
    }
}
