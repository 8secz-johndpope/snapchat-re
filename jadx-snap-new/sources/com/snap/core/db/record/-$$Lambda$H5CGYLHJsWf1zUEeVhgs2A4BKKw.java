package com.snap.core.db.record;

import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.MessageModel.GetLastMessageForFeedExcludingStatusCreator;
import com.snap.core.db.record.MessageModel.GetLastMessageForFeedExcludingStatusModel;
import defpackage.gcp;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$H5CGYLHJsWf1zUEeVhgs2A4BKKw implements GetLastMessageForFeedExcludingStatusCreator {
    public static final /* synthetic */ -$$Lambda$H5CGYLHJsWf1zUEeVhgs2A4BKKw INSTANCE = new -$$Lambda$H5CGYLHJsWf1zUEeVhgs2A4BKKw();

    private /* synthetic */ -$$Lambda$H5CGYLHJsWf1zUEeVhgs2A4BKKw() {
    }

    public final GetLastMessageForFeedExcludingStatusModel create(long j, String str, long j2, MessageClientStatus messageClientStatus, Long l, gcp gcp, SnapServerStatus snapServerStatus, ScreenshottedOrReplayedState screenshottedOrReplayedState, String str2, Long l2) {
        return new AutoValue_MessageRecord_LastMessage(j, str, j2, messageClientStatus, l, gcp, snapServerStatus, screenshottedOrReplayedState, str2, l2);
    }
}
