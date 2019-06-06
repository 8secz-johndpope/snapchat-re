package com.snap.core.db.record;

import com.snap.core.db.column.FeedKind;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.MessageModel.GetPlayableSnapsForFeedCreator;
import com.snap.core.db.record.MessageModel.GetPlayableSnapsForFeedModel;
import defpackage.gcj;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$KvObiMiUCdDXDGIAAY9D2r_3JfI implements GetPlayableSnapsForFeedCreator {
    public static final /* synthetic */ -$$Lambda$KvObiMiUCdDXDGIAAY9D2r_3JfI INSTANCE = new -$$Lambda$KvObiMiUCdDXDGIAAY9D2r_3JfI();

    private /* synthetic */ -$$Lambda$KvObiMiUCdDXDGIAAY9D2r_3JfI() {
    }

    public final GetPlayableSnapsForFeedModel create(long j, String str, String str2, long j2, Long l, byte[] bArr, MessageClientStatus messageClientStatus, String str3, boolean z, String str4, String str5, SnapServerStatus snapServerStatus, ScreenshottedOrReplayedState screenshottedOrReplayedState, FeedKind feedKind, gcj gcj) {
        return new AutoValue_MessageRecord_PlayableSnap(j, str, str2, j2, l, bArr, messageClientStatus, str3, z, str4, str5, snapServerStatus, screenshottedOrReplayedState, feedKind, gcj);
    }
}
