package com.snap.core.db.record;

import com.snap.core.db.column.FeedKind;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.record.MessageModel.GetLastReceivedNotViewedUpdateMessageCreator;
import com.snap.core.db.record.MessageModel.GetLastReceivedNotViewedUpdateMessageModel;
import defpackage.gcj;
import defpackage.gcm;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$TLA-id2LXtabfQFhHV09j6A6-Yo implements GetLastReceivedNotViewedUpdateMessageCreator {
    public static final /* synthetic */ -$$Lambda$TLA-id2LXtabfQFhHV09j6A6-Yo INSTANCE = new -$$Lambda$TLA-id2LXtabfQFhHV09j6A6-Yo();

    private /* synthetic */ -$$Lambda$TLA-id2LXtabfQFhHV09j6A6-Yo() {
    }

    public final GetLastReceivedNotViewedUpdateMessageModel create(Long l, String str, Long l2, String str2, long j, Long l3, byte[] bArr, MessageClientStatus messageClientStatus, boolean z, Long l4, gcj gcj, gcm gcm, long j2, FeedKind feedKind) {
        return new AutoValue_MessageRecord_LastReceivedNotViewedUpdateMessage(l, str, l2, str2, j, l3, bArr, messageClientStatus, z, l4, gcj, gcm, j2, feedKind);
    }
}
