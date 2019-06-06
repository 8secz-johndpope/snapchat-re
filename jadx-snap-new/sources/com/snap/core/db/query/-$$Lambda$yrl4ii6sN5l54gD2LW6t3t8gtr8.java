package com.snap.core.db.query;

import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.record.FriendTestModel.SelectFriendTestDataByUsernameCreator;
import com.snap.core.db.record.FriendTestModel.SelectFriendTestDataByUsernameModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$yrl4ii6sN5l54gD2LW6t3t8gtr8 implements SelectFriendTestDataByUsernameCreator {
    public static final /* synthetic */ -$$Lambda$yrl4ii6sN5l54gD2LW6t3t8gtr8 INSTANCE = new -$$Lambda$yrl4ii6sN5l54gD2LW6t3t8gtr8();

    private /* synthetic */ -$$Lambda$yrl4ii6sN5l54gD2LW6t3t8gtr8() {
    }

    public final SelectFriendTestDataByUsernameModel create(String str, String str2, long j, FriendLinkType friendLinkType) {
        return new AutoValue_LegacyFriendTestQueries_FriendTestData(str, str2, j, friendLinkType);
    }
}
