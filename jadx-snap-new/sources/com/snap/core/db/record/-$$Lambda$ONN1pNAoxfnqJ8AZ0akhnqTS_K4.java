package com.snap.core.db.record;

import com.snap.core.db.column.FeedKind;
import com.snap.core.db.column.GeofilterMetadata;
import com.snap.core.db.record.MessagingSnapModel.GetPlayablePendingSnapsForFeedCreator;
import com.snap.core.db.record.MessagingSnapModel.GetPlayablePendingSnapsForFeedModel;
import defpackage.aesg;
import defpackage.gcp;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$ONN1pNAoxfnqJ8AZ0akhnqTS_K4 implements GetPlayablePendingSnapsForFeedCreator {
    public static final /* synthetic */ -$$Lambda$ONN1pNAoxfnqJ8AZ0akhnqTS_K4 INSTANCE = new -$$Lambda$ONN1pNAoxfnqJ8AZ0akhnqTS_K4();

    private /* synthetic */ -$$Lambda$ONN1pNAoxfnqJ8AZ0akhnqTS_K4() {
    }

    public final GetPlayablePendingSnapsForFeedModel create(long j, long j2, FeedKind feedKind, String str, gcp gcp, String str2, String str3, String str4, long j3, boolean z, long j4, String str5, Boolean bool, String str6, String str7, String str8, String str9, aesg aesg, GeofilterMetadata geofilterMetadata) {
        return new AutoValue_MessagingSnapRecord_PlayableRecord(j, j2, feedKind, str, gcp, str2, str3, str4, j3, z, j4, str5, bool, str6, str7, str8, str9, aesg, geofilterMetadata);
    }
}
