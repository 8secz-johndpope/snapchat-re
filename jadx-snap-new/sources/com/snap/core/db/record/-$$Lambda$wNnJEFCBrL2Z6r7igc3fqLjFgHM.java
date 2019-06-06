package com.snap.core.db.record;

import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.MessageModel.GetSnapInfoFromMessageByMessageIdCreator;
import com.snap.core.db.record.MessageModel.GetSnapInfoFromMessageByMessageIdModel;
import defpackage.yfj;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$wNnJEFCBrL2Z6r7igc3fqLjFgHM implements GetSnapInfoFromMessageByMessageIdCreator {
    public static final /* synthetic */ -$$Lambda$wNnJEFCBrL2Z6r7igc3fqLjFgHM INSTANCE = new -$$Lambda$wNnJEFCBrL2Z6r7igc3fqLjFgHM();

    private /* synthetic */ -$$Lambda$wNnJEFCBrL2Z6r7igc3fqLjFgHM() {
    }

    public final GetSnapInfoFromMessageByMessageIdModel create(long j, String str, String str2, String str3, long j2, ScreenshottedOrReplayedState screenshottedOrReplayedState, SnapServerStatus snapServerStatus, yfj yfj, Long l) {
        return new AutoValue_MessageRecord_GetSnapInfoFromMessageWithMessageIdModel(j, str, str2, str3, j2, screenshottedOrReplayedState, snapServerStatus, yfj, l);
    }
}
