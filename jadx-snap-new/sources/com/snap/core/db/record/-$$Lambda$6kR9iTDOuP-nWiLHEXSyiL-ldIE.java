package com.snap.core.db.record;

import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.record.MultiRecipientSendingSnapModel.GetSendingMessagesCreator;
import com.snap.core.db.record.MultiRecipientSendingSnapModel.GetSendingMessagesModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$6kR9iTDOuP-nWiLHEXSyiL-ldIE implements GetSendingMessagesCreator {
    public static final /* synthetic */ -$$Lambda$6kR9iTDOuP-nWiLHEXSyiL-ldIE INSTANCE = new -$$Lambda$6kR9iTDOuP-nWiLHEXSyiL-ldIE();

    private /* synthetic */ -$$Lambda$6kR9iTDOuP-nWiLHEXSyiL-ldIE() {
    }

    public final GetSendingMessagesModel create(long j, String str, String str2, String str3, MessageClientStatus messageClientStatus, long j2) {
        return new AutoValue_MultiRecipientSendingSnapRecord_SendingMessage(j, str, str2, str3, messageClientStatus, j2);
    }
}
