package com.snap.core.db.record;

import com.snap.core.db.column.InteractionMessageType;
import com.snap.core.db.column.LocalMessageBodyType;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import defpackage.aetf;
import defpackage.akbq;
import defpackage.akcq;
import defpackage.akde;
import defpackage.akej;

final class InteractionMessagesRecord$Companion$FACTORY$1 extends akcq implements akbq<Long, Long, InteractionMessageType, MessageClientStatus, LocalMessageBodyType, Long, String, Long, aetf, String, Boolean, Long, Long, ScreenshottedOrReplayedState, AutoValue_InteractionMessagesRecord> {
    public static final InteractionMessagesRecord$Companion$FACTORY$1 INSTANCE = new InteractionMessagesRecord$Companion$FACTORY$1();

    InteractionMessagesRecord$Companion$FACTORY$1() {
        super(14);
    }

    public final String getName() {
        return "<init>";
    }

    public final akej getOwner() {
        return akde.a(AutoValue_InteractionMessagesRecord.class);
    }

    public final String getSignature() {
        return "<init>(JJLcom/snap/core/db/column/InteractionMessageType;Lcom/snap/core/db/column/MessageClientStatus;Lcom/snap/core/db/column/LocalMessageBodyType;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Lcom/snapchat/soju/android/MischiefUpdateMessageType;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Lcom/snap/core/db/column/ScreenshottedOrReplayedState;)V";
    }

    public final AutoValue_InteractionMessagesRecord invoke(long j, long j2, InteractionMessageType interactionMessageType, MessageClientStatus messageClientStatus, LocalMessageBodyType localMessageBodyType, Long l, String str, Long l2, aetf aetf, String str2, Boolean bool, Long l3, Long l4, ScreenshottedOrReplayedState screenshottedOrReplayedState) {
        return new AutoValue_InteractionMessagesRecord(j, j2, interactionMessageType, messageClientStatus, localMessageBodyType, l, str, l2, aetf, str2, bool, l3, l4, screenshottedOrReplayedState);
    }
}
