package com.snap.core.db.record;

import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.record.MessageModel.GetLastSentViewedChatCreator;
import com.snap.core.db.record.MessageModel.GetLastSentViewedChatModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$F7nW45zpT7zK732O5lc_s-vcd7s implements GetLastSentViewedChatCreator {
    public static final /* synthetic */ -$$Lambda$F7nW45zpT7zK732O5lc_s-vcd7s INSTANCE = new -$$Lambda$F7nW45zpT7zK732O5lc_s-vcd7s();

    private /* synthetic */ -$$Lambda$F7nW45zpT7zK732O5lc_s-vcd7s() {
    }

    public final GetLastSentViewedChatModel create(Long l, String str, Long l2, String str2, long j, Long l3, MessageClientStatus messageClientStatus, Long l4) {
        return new AutoValue_MessageRecord_LastSentViewedChat(l, str, l2, str2, j, l3, messageClientStatus, l4);
    }
}
