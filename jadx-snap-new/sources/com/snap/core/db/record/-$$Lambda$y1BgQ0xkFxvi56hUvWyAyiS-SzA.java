package com.snap.core.db.record;

import com.snap.core.db.column.FeedKind;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.record.MessageModel.GetLastReceivedNotViewedChatCreator;
import com.snap.core.db.record.MessageModel.GetLastReceivedNotViewedChatModel;
import defpackage.gcj;
import defpackage.gcm;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$y1BgQ0xkFxvi56hUvWyAyiS-SzA implements GetLastReceivedNotViewedChatCreator {
    public static final /* synthetic */ -$$Lambda$y1BgQ0xkFxvi56hUvWyAyiS-SzA INSTANCE = new -$$Lambda$y1BgQ0xkFxvi56hUvWyAyiS-SzA();

    private /* synthetic */ -$$Lambda$y1BgQ0xkFxvi56hUvWyAyiS-SzA() {
    }

    public final GetLastReceivedNotViewedChatModel create(Long l, String str, Long l2, String str2, long j, MessageClientStatus messageClientStatus, Long l3, boolean z, Long l4, gcj gcj, gcm gcm, Long l5, FeedKind feedKind) {
        return new AutoValue_MessageRecord_LastReceivedNotViewedChat(l, str, l2, str2, j, messageClientStatus, l3, z, l4, gcj, gcm, l5, feedKind);
    }
}
