package com.snap.core.db.record;

import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.MessagingSnapModel.GetLastSentSnapCreator;
import com.snap.core.db.record.MessagingSnapModel.GetLastSentSnapModel;
import defpackage.gcp;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$cTc1QdnsJgCSs4SUto8m_nQ4k2o implements GetLastSentSnapCreator {
    public static final /* synthetic */ -$$Lambda$cTc1QdnsJgCSs4SUto8m_nQ4k2o INSTANCE = new -$$Lambda$cTc1QdnsJgCSs4SUto8m_nQ4k2o();

    private /* synthetic */ -$$Lambda$cTc1QdnsJgCSs4SUto8m_nQ4k2o() {
    }

    public final GetLastSentSnapModel create(Long l, Long l2, String str, gcp gcp, long j, long j2, SnapServerStatus snapServerStatus, ScreenshottedOrReplayedState screenshottedOrReplayedState, byte[] bArr, FriendLinkType friendLinkType) {
        return new AutoValue_MessagingSnapRecord_LastSentSnap(l, l2, str, gcp, j, j2, snapServerStatus, screenshottedOrReplayedState, bArr, friendLinkType);
    }
}
