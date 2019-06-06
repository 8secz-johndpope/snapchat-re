package com.snap.core.db.record;

import com.snap.core.db.record.NetworkMessageModel.GetUnreleasedMessagesForConversationCreator;
import com.snap.core.db.record.NetworkMessageModel.GetUnreleasedMessagesForConversationModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$OnneXnuJrx9kxiC6PJagC6sptho implements GetUnreleasedMessagesForConversationCreator {
    public static final /* synthetic */ -$$Lambda$OnneXnuJrx9kxiC6PJagC6sptho INSTANCE = new -$$Lambda$OnneXnuJrx9kxiC6PJagC6sptho();

    private /* synthetic */ -$$Lambda$OnneXnuJrx9kxiC6PJagC6sptho() {
    }

    public final GetUnreleasedMessagesForConversationModel create(String str, long j, Long l, Long l2, String str2) {
        return new AutoValue_NetworkMessageRecord_UnreleasedMessage(str, j, l, l2, str2);
    }
}
