package com.snap.core.db.record;

import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.record.MultiRecipientSendingSnapModel.Creator;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$hEPUM9gI44Xtfexa1fXfHUEmmeA implements Creator {
    public static final /* synthetic */ -$$Lambda$hEPUM9gI44Xtfexa1fXfHUEmmeA INSTANCE = new -$$Lambda$hEPUM9gI44Xtfexa1fXfHUEmmeA();

    private /* synthetic */ -$$Lambda$hEPUM9gI44Xtfexa1fXfHUEmmeA() {
    }

    public final MultiRecipientSendingSnapModel create(long j, String str, String str2, String str3, MessageClientStatus messageClientStatus, long j2) {
        return new AutoValue_MultiRecipientSendingSnapRecord(j, str, str2, str3, messageClientStatus, j2);
    }
}
