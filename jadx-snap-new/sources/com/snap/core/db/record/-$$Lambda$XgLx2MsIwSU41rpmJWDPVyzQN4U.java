package com.snap.core.db.record;

import com.snap.core.db.column.FeedKind;
import com.snap.core.db.record.MessageModel.GetSnapOperaInfoByRowIdCreator;
import com.snap.core.db.record.MessageModel.GetSnapOperaInfoByRowIdModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$XgLx2MsIwSU41rpmJWDPVyzQN4U implements GetSnapOperaInfoByRowIdCreator {
    public static final /* synthetic */ -$$Lambda$XgLx2MsIwSU41rpmJWDPVyzQN4U INSTANCE = new -$$Lambda$XgLx2MsIwSU41rpmJWDPVyzQN4U();

    private /* synthetic */ -$$Lambda$XgLx2MsIwSU41rpmJWDPVyzQN4U() {
    }

    public final GetSnapOperaInfoByRowIdModel create(Long l, String str, String str2, Long l2, long j, byte[] bArr, FeedKind feedKind, String str3) {
        return new AutoValue_MessageRecord_GetSnapOperaInfo(l, str, str2, l2, j, bArr, feedKind, str3);
    }
}
