package com.snap.core.db.record;

import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.record.MessageModel.GetLastReleasedChatCreator;
import com.snap.core.db.record.MessageModel.GetLastReleasedChatModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$tYer1UBxhO2Kj1yWw7sOkTnaBnE implements GetLastReleasedChatCreator {
    public static final /* synthetic */ -$$Lambda$tYer1UBxhO2Kj1yWw7sOkTnaBnE INSTANCE = new -$$Lambda$tYer1UBxhO2Kj1yWw7sOkTnaBnE();

    private /* synthetic */ -$$Lambda$tYer1UBxhO2Kj1yWw7sOkTnaBnE() {
    }

    public final GetLastReleasedChatModel create(String str, Long l, String str2, long j, MessageClientStatus messageClientStatus, Long l2) {
        return new AutoValue_MessageRecord_LastReleasedChat(str, l, str2, j, messageClientStatus, l2);
    }
}
