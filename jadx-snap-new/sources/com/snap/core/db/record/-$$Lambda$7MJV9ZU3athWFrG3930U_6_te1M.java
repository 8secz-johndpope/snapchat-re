package com.snap.core.db.record;

import com.snap.core.db.column.FeedKind;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.ReplyMedia;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.MessageModel.GetMessagesForFeedCreator;
import com.snap.core.db.record.MessageModel.GetMessagesForFeedModel;
import defpackage.gcj;
import defpackage.gcm;
import defpackage.gcp;
import defpackage.yfj;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$7MJV9ZU3athWFrG3930U_6_te1M implements GetMessagesForFeedCreator {
    public static final /* synthetic */ -$$Lambda$7MJV9ZU3athWFrG3930U_6_te1M INSTANCE = new -$$Lambda$7MJV9ZU3athWFrG3930U_6_te1M();

    private /* synthetic */ -$$Lambda$7MJV9ZU3athWFrG3930U_6_te1M() {
    }

    public final GetMessagesForFeedModel create(long j, long j2, String str, String str2, long j3, Long l, Long l2, byte[] bArr, gcm gcm, MessageClientStatus messageClientStatus, Long l3, String str3, boolean z, String str4, String str5, SnapServerStatus snapServerStatus, SnapServerStatus snapServerStatus2, String str6, yfj yfj, ScreenshottedOrReplayedState screenshottedOrReplayedState, ScreenshottedOrReplayedState screenshottedOrReplayedState2, ReplyMedia replyMedia, gcp gcp, Long l4, FeedKind feedKind, gcj gcj, Integer num, Long l5, long j4) {
        return new AutoValue_MessageRecord_WithFriend(j, j2, str, str2, j3, l, l2, bArr, gcm, messageClientStatus, l3, str3, z, str4, str5, snapServerStatus, snapServerStatus2, str6, yfj, screenshottedOrReplayedState, screenshottedOrReplayedState2, replyMedia, gcp, l4, feedKind, gcj, num, l5, j4);
    }
}
