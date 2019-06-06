package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.api.column.IntegerEnumColumnAdapter;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.record.MultiRecipientSendingSnapModel.Factory;
import com.snap.core.db.record.MultiRecipientSendingSnapModel.GetSendingMessagesModel;
import defpackage.ainw;

@AutoValue
public abstract class MultiRecipientSendingSnapRecord implements MultiRecipientSendingSnapModel {
    public static final Factory<MultiRecipientSendingSnapRecord> FACTORY;
    public static final IntegerEnumColumnAdapter<MessageClientStatus> MESSAGE_CLIENT_STATUS_COLUMN_ADAPTER = new IntegerEnumColumnAdapter(MessageClientStatus.class);
    public static final ainw<SendingMessage> SENDING_MESSAGE_ROW_MAPPER;

    @AutoValue
    public static abstract class SendingMessage implements GetSendingMessagesModel {
    }

    static {
        Factory factory = new Factory(-$$Lambda$hEPUM9gI44Xtfexa1fXfHUEmmeA.INSTANCE, MESSAGE_CLIENT_STATUS_COLUMN_ADAPTER);
        FACTORY = factory;
        SENDING_MESSAGE_ROW_MAPPER = factory.getSendingMessagesMapper(-$$Lambda$6kR9iTDOuP-nWiLHEXSyiL-ldIE.INSTANCE);
    }
}
