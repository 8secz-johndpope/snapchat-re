package com.snap.core.db.record;

import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.MessageModel.GetLastSentSnapForMessageCreator;
import com.snap.core.db.record.MessageModel.GetLastSentSnapForMessageModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$ZiA5bQnlw3KJIPn0AkEwf9nTnzE implements GetLastSentSnapForMessageCreator {
    public static final /* synthetic */ -$$Lambda$ZiA5bQnlw3KJIPn0AkEwf9nTnzE INSTANCE = new -$$Lambda$ZiA5bQnlw3KJIPn0AkEwf9nTnzE();

    private /* synthetic */ -$$Lambda$ZiA5bQnlw3KJIPn0AkEwf9nTnzE() {
    }

    public final GetLastSentSnapForMessageModel create(Long l, Long l2, String str, long j, long j2, SnapServerStatus snapServerStatus, ScreenshottedOrReplayedState screenshottedOrReplayedState, byte[] bArr, byte[] bArr2, FriendLinkType friendLinkType) {
        return new AutoValue_MessageRecord_LastSentSnapModel(l, l2, str, j, j2, snapServerStatus, screenshottedOrReplayedState, bArr, bArr2, friendLinkType);
    }
}
