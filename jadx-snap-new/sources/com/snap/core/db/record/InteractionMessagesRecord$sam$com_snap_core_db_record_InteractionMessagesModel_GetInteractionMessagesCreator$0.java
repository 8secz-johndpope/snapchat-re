package com.snap.core.db.record;

import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.column.InteractionMessageType;
import com.snap.core.db.column.LocalMessageBodyType;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.record.InteractionMessagesModel.GetInteractionMessagesCreator;
import com.snap.core.db.record.InteractionMessagesModel.GetInteractionMessagesModel;
import defpackage.aetf;
import defpackage.akbr;
import defpackage.akcr;

final class InteractionMessagesRecord$sam$com_snap_core_db_record_InteractionMessagesModel_GetInteractionMessagesCreator$0 implements GetInteractionMessagesCreator {
    private final /* synthetic */ akbr function;

    InteractionMessagesRecord$sam$com_snap_core_db_record_InteractionMessagesModel_GetInteractionMessagesCreator$0(akbr akbr) {
        this.function = akbr;
    }

    public final /* synthetic */ GetInteractionMessagesModel create(long j, InteractionMessageType interactionMessageType, MessageClientStatus messageClientStatus, LocalMessageBodyType localMessageBodyType, Long l, String str, Long l2, aetf aetf, String str2, Boolean bool, Long l3, Long l4, ScreenshottedOrReplayedState screenshottedOrReplayedState, byte[] bArr, FriendLinkType friendLinkType) {
        InteractionMessageType interactionMessageType2 = interactionMessageType;
        akcr.b(interactionMessageType2, "messageType");
        MessageClientStatus messageClientStatus2 = messageClientStatus;
        akcr.b(messageClientStatus2, InteractionMessagesModel.MESSAGECLIENTSTATUS);
        LocalMessageBodyType localMessageBodyType2 = localMessageBodyType;
        akcr.b(localMessageBodyType2, InteractionMessagesModel.MESSAGEBODYTYPE);
        return (GetInteractionMessagesModel) this.function.invoke(Long.valueOf(j), interactionMessageType2, messageClientStatus2, localMessageBodyType2, l, str, l2, aetf, str2, bool, l3, l4, screenshottedOrReplayedState, bArr, friendLinkType);
    }
}
