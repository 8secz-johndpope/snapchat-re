package com.snap.core.db.query;

import com.snap.core.db.column.GroupStoryType;
import com.snap.core.db.query.ProfileModel.GetGroupByFeedIdCreator;
import com.snap.core.db.query.ProfileModel.GetGroupByFeedIdModel;
import defpackage.akbp;
import defpackage.akcr;

final class LegacyProfileQueriesKt$sam$com_snap_core_db_query_ProfileModel_GetGroupByFeedIdCreator$0 implements GetGroupByFeedIdCreator {
    private final /* synthetic */ akbp function;

    LegacyProfileQueriesKt$sam$com_snap_core_db_query_ProfileModel_GetGroupByFeedIdCreator$0(akbp akbp) {
        this.function = akbp;
    }

    public final /* synthetic */ GetGroupByFeedIdModel create(long j, String str, long j2, Long l, Long l2, Long l3, Long l4, Long l5, Boolean bool, GroupStoryType groupStoryType, Boolean bool2, String str2, String str3) {
        String str4 = str;
        akcr.b(str4, "key");
        return (GetGroupByFeedIdModel) this.function.invoke(Long.valueOf(j), str4, Long.valueOf(j2), l, l2, l3, l4, l5, bool, groupStoryType, bool2, str2, str3);
    }
}
