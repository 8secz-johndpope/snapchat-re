package com.snap.core.db.record;

import com.snap.core.db.column.InteractionMessageType;
import com.snap.core.db.column.LocalMessageBodyType;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import defpackage.aetf;
import defpackage.akbp;
import defpackage.akcq;
import defpackage.akde;
import defpackage.akej;

final class InteractionMessagesRecord$Companion$NEW_CONTENT_INTERACTION_MESSAGE_ROW_MAPPER$1 extends akcq implements akbp<Long, InteractionMessageType, MessageClientStatus, LocalMessageBodyType, Long, String, Long, aetf, String, Boolean, Long, Long, ScreenshottedOrReplayedState, AutoValue_InteractionMessagesRecord_GetNewContentInteractionMessagesRow> {
    public static final InteractionMessagesRecord$Companion$NEW_CONTENT_INTERACTION_MESSAGE_ROW_MAPPER$1 INSTANCE = new InteractionMessagesRecord$Companion$NEW_CONTENT_INTERACTION_MESSAGE_ROW_MAPPER$1();

    InteractionMessagesRecord$Companion$NEW_CONTENT_INTERACTION_MESSAGE_ROW_MAPPER$1() {
        super(13);
    }

    public final String getName() {
        return "<init>";
    }

    public final akej getOwner() {
        return akde.a(AutoValue_InteractionMessagesRecord_GetNewContentInteractionMessagesRow.class);
    }

    public final String getSignature() {
        return "<init>(JLcom/snap/core/db/column/InteractionMessageType;Lcom/snap/core/db/column/MessageClientStatus;Lcom/snap/core/db/column/LocalMessageBodyType;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Lcom/snapchat/soju/android/MischiefUpdateMessageType;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Lcom/snap/core/db/column/ScreenshottedOrReplayedState;)V";
    }

    public final AutoValue_InteractionMessagesRecord_GetNewContentInteractionMessagesRow invoke(long j, InteractionMessageType interactionMessageType, MessageClientStatus messageClientStatus, LocalMessageBodyType localMessageBodyType, Long l, String str, Long l2, aetf aetf, String str2, Boolean bool, Long l3, Long l4, ScreenshottedOrReplayedState screenshottedOrReplayedState) {
        return new AutoValue_InteractionMessagesRecord_GetNewContentInteractionMessagesRow(j, interactionMessageType, messageClientStatus, localMessageBodyType, l, str, l2, aetf, str2, bool, l3, l4, screenshottedOrReplayedState);
    }
}
