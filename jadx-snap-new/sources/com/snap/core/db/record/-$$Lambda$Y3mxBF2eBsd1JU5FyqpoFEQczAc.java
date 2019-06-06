package com.snap.core.db.record;

import com.snap.core.db.column.FeedKind;
import com.snap.core.db.record.FeedModel.GetBasicFeedInfoByIdCreator;
import com.snap.core.db.record.FeedModel.GetBasicFeedInfoByIdModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$Y3mxBF2eBsd1JU5FyqpoFEQczAc implements GetBasicFeedInfoByIdCreator {
    public static final /* synthetic */ -$$Lambda$Y3mxBF2eBsd1JU5FyqpoFEQczAc INSTANCE = new -$$Lambda$Y3mxBF2eBsd1JU5FyqpoFEQczAc();

    private /* synthetic */ -$$Lambda$Y3mxBF2eBsd1JU5FyqpoFEQczAc() {
    }

    public final GetBasicFeedInfoByIdModel create(long j, String str, Long l, String str2, String str3, String str4, String str5, String str6, String str7, Long l2, FeedKind feedKind, long j2, String str8, Long l3, Long l4, Long l5, Boolean bool, Boolean bool2, long j3, boolean z) {
        return new AutoValue_FeedRecord_BasicFeedInfo(j, str, l, str2, str3, str4, str5, str6, str7, l2, feedKind, j2, str8, l3, l4, l5, bool, bool2, j3, z);
    }
}
