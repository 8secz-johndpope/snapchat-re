package com.snap.core.db.record;

import com.snap.core.db.column.GroupStoryRankType;
import com.snap.core.db.column.PrivacyType;
import com.snap.core.db.record.PostableStoryModel.Creator;
import com.snapchat.soju.android.Geofence;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$EfT2InwYIdr8wzlApfQBts1aB1I implements Creator {
    public static final /* synthetic */ -$$Lambda$EfT2InwYIdr8wzlApfQBts1aB1I INSTANCE = new -$$Lambda$EfT2InwYIdr8wzlApfQBts1aB1I();

    private /* synthetic */ -$$Lambda$EfT2InwYIdr8wzlApfQBts1aB1I() {
    }

    public final PostableStoryModel create(long j, String str, Long l, String str2, Boolean bool, Geofence geofence, GroupStoryRankType groupStoryRankType, String str3, Boolean bool2, Long l2, Long l3, Long l4, String str4, PrivacyType privacyType, Long l5) {
        return new AutoValue_PostableStoryRecord(j, str, l, str2, bool, geofence, groupStoryRankType, str3, bool2, l2, l3, l4, str4, privacyType, l5);
    }
}
