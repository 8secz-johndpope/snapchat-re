package com.snap.core.db.record;

import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.MessageModel.GetReceivedSnapsCreator;
import com.snap.core.db.record.MessageModel.GetReceivedSnapsModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$kW2gCw5zp3UmdWSKBZLZEzlLQKY implements GetReceivedSnapsCreator {
    public static final /* synthetic */ -$$Lambda$kW2gCw5zp3UmdWSKBZLZEzlLQKY INSTANCE = new -$$Lambda$kW2gCw5zp3UmdWSKBZLZEzlLQKY();

    private /* synthetic */ -$$Lambda$kW2gCw5zp3UmdWSKBZLZEzlLQKY() {
    }

    public final GetReceivedSnapsModel create(Long l, Long l2, String str, long j, long j2, SnapServerStatus snapServerStatus, ScreenshottedOrReplayedState screenshottedOrReplayedState, byte[] bArr) {
        return new AutoValue_MessageRecord_ReceivedSnapsModel(l, l2, str, j, j2, snapServerStatus, screenshottedOrReplayedState, bArr);
    }
}
