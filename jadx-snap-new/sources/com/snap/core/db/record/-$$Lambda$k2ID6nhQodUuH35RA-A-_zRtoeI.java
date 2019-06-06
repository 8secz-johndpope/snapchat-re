package com.snap.core.db.record;

import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.MessagingSnapModel.GetGroupSnapsOlderThanTimestampCreator;
import com.snap.core.db.record.MessagingSnapModel.GetGroupSnapsOlderThanTimestampModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$k2ID6nhQodUuH35RA-A-_zRtoeI implements GetGroupSnapsOlderThanTimestampCreator {
    public static final /* synthetic */ -$$Lambda$k2ID6nhQodUuH35RA-A-_zRtoeI INSTANCE = new -$$Lambda$k2ID6nhQodUuH35RA-A-_zRtoeI();

    private /* synthetic */ -$$Lambda$k2ID6nhQodUuH35RA-A-_zRtoeI() {
    }

    public final GetGroupSnapsOlderThanTimestampModel create(String str, SnapServerStatus snapServerStatus, long j, long j2) {
        return new AutoValue_MessagingSnapRecord_GroupSnapsOlderThanTimestamp(str, snapServerStatus, j, j2);
    }
}
