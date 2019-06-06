package com.snap.core.db.record;

import com.snap.core.db.column.DynamicSnapSource;
import com.snap.core.db.record.DiscoverStorySnapModel.PlayableStorySnapsCreator;
import com.snap.core.db.record.DiscoverStorySnapModel.PlayableStorySnapsModel;
import defpackage.gcp;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$YzPTmGSw3N59PGGbhjdZ6IwkWv8 implements PlayableStorySnapsCreator {
    public static final /* synthetic */ -$$Lambda$YzPTmGSw3N59PGGbhjdZ6IwkWv8 INSTANCE = new -$$Lambda$YzPTmGSw3N59PGGbhjdZ6IwkWv8();

    private /* synthetic */ -$$Lambda$YzPTmGSw3N59PGGbhjdZ6IwkWv8() {
    }

    public final PlayableStorySnapsModel create(long j, String str, long j2, String str2, long j3, String str3, String str4, String str5, String str6, gcp gcp, String str7, String str8, String str9, String str10, String str11, String str12, String str13, long j4, boolean z, boolean z2, Long l, String str14, String str15, long j5, boolean z3, DynamicSnapSource dynamicSnapSource, String str16, String str17, String str18, String str19, String str20) {
        return new AutoValue_DiscoverStorySnapRecord_PlayableStorySnapsModelRecord(j, str, j2, str2, j3, str3, str4, str5, str6, gcp, str7, str8, str9, str10, str11, str12, str13, j4, z, z2, l, str14, str15, j5, z3, dynamicSnapSource, str16, str17, str18, str19, str20);
    }
}
