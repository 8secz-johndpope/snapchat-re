package com.snap.core.db.record;

import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.MessagingSnapModel.GetLastReceivedSnapCreator;
import com.snap.core.db.record.MessagingSnapModel.GetLastReceivedSnapModel;
import defpackage.gcp;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$R-KsfOmJ1DNzcez9ucrtFjwakmk implements GetLastReceivedSnapCreator {
    public static final /* synthetic */ -$$Lambda$R-KsfOmJ1DNzcez9ucrtFjwakmk INSTANCE = new -$$Lambda$R-KsfOmJ1DNzcez9ucrtFjwakmk();

    private /* synthetic */ -$$Lambda$R-KsfOmJ1DNzcez9ucrtFjwakmk() {
    }

    public final GetLastReceivedSnapModel create(Long l, Long l2, String str, gcp gcp, long j, long j2, SnapServerStatus snapServerStatus, ScreenshottedOrReplayedState screenshottedOrReplayedState) {
        return new AutoValue_MessagingSnapRecord_LastReceivedSnap(l, l2, str, gcp, j, j2, snapServerStatus, screenshottedOrReplayedState);
    }
}
