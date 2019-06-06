package com.snap.core.db.record;

import com.snap.core.db.column.GeofilterMetadata;
import com.snap.core.db.column.ReplyMedia;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.column.SnappableLensMetadata;
import com.snap.core.db.record.MessagingSnapModel.Creator;
import defpackage.aesg;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$ERUZhGW_ARVZpp8lhcH_XX2kOSU implements Creator {
    public static final /* synthetic */ -$$Lambda$ERUZhGW_ARVZpp8lhcH_XX2kOSU INSTANCE = new -$$Lambda$ERUZhGW_ARVZpp8lhcH_XX2kOSU();

    private /* synthetic */ -$$Lambda$ERUZhGW_ARVZpp8lhcH_XX2kOSU() {
    }

    public final MessagingSnapModel create(long j, long j2, long j3, Long l, SnapServerStatus snapServerStatus, Long l2, Long l3, Integer num, Long l4, Long l5, ScreenshottedOrReplayedState screenshottedOrReplayedState, String str, Long l6, Boolean bool, String str2, String str3, Boolean bool2, String str4, String str5, ReplyMedia replyMedia, GeofilterMetadata geofilterMetadata, SnappableLensMetadata snappableLensMetadata, aesg aesg) {
        return new AutoValue_MessagingSnapRecord(j, j2, j3, l, snapServerStatus, l2, l3, num, l4, l5, screenshottedOrReplayedState, str, l6, bool, str2, str3, bool2, str4, str5, replyMedia, geofilterMetadata, snappableLensMetadata, aesg);
    }
}
