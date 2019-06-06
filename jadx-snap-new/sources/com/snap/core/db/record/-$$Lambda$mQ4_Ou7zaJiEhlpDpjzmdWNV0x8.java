package com.snap.core.db.record;

import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.record.MessageModel.GetLastSentNotViewedChatCreator;
import com.snap.core.db.record.MessageModel.GetLastSentNotViewedChatModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$mQ4_Ou7zaJiEhlpDpjzmdWNV0x8 implements GetLastSentNotViewedChatCreator {
    public static final /* synthetic */ -$$Lambda$mQ4_Ou7zaJiEhlpDpjzmdWNV0x8 INSTANCE = new -$$Lambda$mQ4_Ou7zaJiEhlpDpjzmdWNV0x8();

    private /* synthetic */ -$$Lambda$mQ4_Ou7zaJiEhlpDpjzmdWNV0x8() {
    }

    public final GetLastSentNotViewedChatModel create(Long l, String str, Long l2, String str2, long j, MessageClientStatus messageClientStatus, Long l3, FriendLinkType friendLinkType, String str3) {
        return new AutoValue_MessageRecord_LastSentNotViewedChat(l, str, l2, str2, j, messageClientStatus, l3, friendLinkType, str3);
    }
}
