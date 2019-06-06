package com.snap.core.db.record;

import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.record.MessageModel.GetLastReceivedViewedChatCreator;
import com.snap.core.db.record.MessageModel.GetLastReceivedViewedChatModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$ReBVKG9kKjMBpqygvfcEux6zALE implements GetLastReceivedViewedChatCreator {
    public static final /* synthetic */ -$$Lambda$ReBVKG9kKjMBpqygvfcEux6zALE INSTANCE = new -$$Lambda$ReBVKG9kKjMBpqygvfcEux6zALE();

    private /* synthetic */ -$$Lambda$ReBVKG9kKjMBpqygvfcEux6zALE() {
    }

    public final GetLastReceivedViewedChatModel create(Long l, String str, Long l2, String str2, long j, MessageClientStatus messageClientStatus, Long l3) {
        return new AutoValue_MessageRecord_LastReceivedViewedChat(l, str, l2, str2, j, messageClientStatus, l3);
    }
}
