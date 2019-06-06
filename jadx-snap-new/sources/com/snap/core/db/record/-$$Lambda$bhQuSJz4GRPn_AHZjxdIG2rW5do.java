package com.snap.core.db.record;

import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.MessagingSnapModel.SnapDumpCreator;
import com.snap.core.db.record.MessagingSnapModel.SnapDumpModel;
import defpackage.gcp;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$bhQuSJz4GRPn_AHZjxdIG2rW5do implements SnapDumpCreator {
    public static final /* synthetic */ -$$Lambda$bhQuSJz4GRPn_AHZjxdIG2rW5do INSTANCE = new -$$Lambda$bhQuSJz4GRPn_AHZjxdIG2rW5do();

    private /* synthetic */ -$$Lambda$bhQuSJz4GRPn_AHZjxdIG2rW5do() {
    }

    public final SnapDumpModel create(String str, String str2, Long l, String str3, gcp gcp, SnapServerStatus snapServerStatus, ScreenshottedOrReplayedState screenshottedOrReplayedState, Long l2) {
        return new AutoValue_MessagingSnapRecord_SnapDump(str, str2, l, str3, gcp, snapServerStatus, screenshottedOrReplayedState, l2);
    }
}
