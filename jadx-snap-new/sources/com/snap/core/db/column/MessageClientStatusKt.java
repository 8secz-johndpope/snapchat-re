package com.snap.core.db.column;

import defpackage.ajyi;
import defpackage.akcr;

public final class MessageClientStatusKt {
    public static final MessageClientStatus[] FAILED_TO_SEND_STATUS = new MessageClientStatus[]{MessageClientStatus.FAILED, MessageClientStatus.FAILED_NON_RECOVERABLE, MessageClientStatus.FAILED_NOT_FRIENDS};
    public static final MessageClientStatus[] WAITING_TO_SEND_STATUS = new MessageClientStatus[]{MessageClientStatus.QUEUED, MessageClientStatus.SENDING};

    public static final boolean isFailedState(MessageClientStatus messageClientStatus) {
        akcr.b(messageClientStatus, "receiver$0");
        return ajyi.a((Object[]) FAILED_TO_SEND_STATUS, (Object) messageClientStatus);
    }

    public static final boolean isWaitingState(MessageClientStatus messageClientStatus) {
        akcr.b(messageClientStatus, "receiver$0");
        return ajyi.a((Object[]) WAITING_TO_SEND_STATUS, (Object) messageClientStatus);
    }
}
