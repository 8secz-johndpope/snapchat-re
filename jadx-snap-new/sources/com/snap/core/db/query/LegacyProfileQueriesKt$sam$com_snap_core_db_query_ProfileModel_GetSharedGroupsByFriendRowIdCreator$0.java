package com.snap.core.db.query;

import com.snap.core.db.query.ProfileModel.GetSharedGroupsByFriendRowIdCreator;
import com.snap.core.db.query.ProfileModel.GetSharedGroupsByFriendRowIdModel;
import defpackage.akbw;

final class LegacyProfileQueriesKt$sam$com_snap_core_db_query_ProfileModel_GetSharedGroupsByFriendRowIdCreator$0 implements GetSharedGroupsByFriendRowIdCreator {
    private final /* synthetic */ akbw function;

    LegacyProfileQueriesKt$sam$com_snap_core_db_query_ProfileModel_GetSharedGroupsByFriendRowIdCreator$0(akbw akbw) {
        this.function = akbw;
    }

    public final /* synthetic */ GetSharedGroupsByFriendRowIdModel create(long j, long j2) {
        return (GetSharedGroupsByFriendRowIdModel) this.function.invoke(Long.valueOf(j), Long.valueOf(j2));
    }
}
