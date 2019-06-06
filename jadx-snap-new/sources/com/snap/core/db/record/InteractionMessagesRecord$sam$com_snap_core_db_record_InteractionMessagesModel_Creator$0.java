package com.snap.core.db.record;

import com.snap.core.db.column.InteractionMessageType;
import com.snap.core.db.column.LocalMessageBodyType;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.record.InteractionMessagesModel.Creator;
import defpackage.aetf;
import defpackage.akbq;
import defpackage.akcr;

final class InteractionMessagesRecord$sam$com_snap_core_db_record_InteractionMessagesModel_Creator$0 implements Creator {
    private final /* synthetic */ akbq function;

    InteractionMessagesRecord$sam$com_snap_core_db_record_InteractionMessagesModel_Creator$0(akbq akbq) {
        this.function = akbq;
    }

    public final /* synthetic */ InteractionMessagesModel create(long j, long j2, InteractionMessageType interactionMessageType, MessageClientStatus messageClientStatus, LocalMessageBodyType localMessageBodyType, Long l, String str, Long l2, aetf aetf, String str2, Boolean bool, Long l3, Long l4, ScreenshottedOrReplayedState screenshottedOrReplayedState) {
        InteractionMessageType interactionMessageType2 = interactionMessageType;
        akcr.b(interactionMessageType2, "messageType");
        MessageClientStatus messageClientStatus2 = messageClientStatus;
        akcr.b(messageClientStatus2, InteractionMessagesModel.MESSAGECLIENTSTATUS);
        LocalMessageBodyType localMessageBodyType2 = localMessageBodyType;
        akcr.b(localMessageBodyType2, InteractionMessagesModel.MESSAGEBODYTYPE);
        return (InteractionMessagesModel) this.function.invoke(Long.valueOf(j), Long.valueOf(j2), interactionMessageType2, messageClientStatus2, localMessageBodyType2, l, str, l2, aetf, str2, bool, l3, l4, screenshottedOrReplayedState);
    }
}
