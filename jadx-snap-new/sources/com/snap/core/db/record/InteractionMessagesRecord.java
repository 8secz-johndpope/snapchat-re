package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.api.column.IntegerEnumColumnAdapter;
import com.snap.core.db.column.InteractionMessageType;
import com.snap.core.db.column.LocalMessageBodyType;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.ScreenshottedOrReplayedStateAdapter;
import com.snap.core.db.record.InteractionMessagesModel.Creator;
import com.snap.core.db.record.InteractionMessagesModel.Factory;
import com.snap.core.db.record.InteractionMessagesModel.GetInteractionMessagesCreator;
import com.snap.core.db.record.InteractionMessagesModel.GetInteractionMessagesModel;
import com.snap.core.db.record.InteractionMessagesModel.GetNewContentInteractionMessagesCreator;
import com.snap.core.db.record.InteractionMessagesModel.GetNewContentInteractionMessagesModel;
import defpackage.ainw;
import defpackage.akbp;
import defpackage.akbq;
import defpackage.akbr;
import defpackage.akco;
import defpackage.akcr;

@AutoValue
public abstract class InteractionMessagesRecord implements InteractionMessagesModel {
    public static final Companion Companion = new Companion();
    private static final Factory<InteractionMessagesRecord> FACTORY;
    private static final ainw<InteractionMessageRow> INTERACTION_MESSAGE_ROW_MAPPER;
    private static final IntegerEnumColumnAdapter<InteractionMessageType> INTERACTION_MESSAGE_TYPE_COLUMN_ADAPTER = new IntegerEnumColumnAdapter(InteractionMessageType.class);
    private static final IntegerEnumColumnAdapter<LocalMessageBodyType> LOCAL_MESSAGE_BODY_TYPE_COLUMN_ADAPTER = new IntegerEnumColumnAdapter(LocalMessageBodyType.class);
    private static final IntegerEnumColumnAdapter<MessageClientStatus> MESSAGE_CLIENT_STATUS_COLUMN_ADAPTER = new IntegerEnumColumnAdapter(MessageClientStatus.class);
    private static final MischiefUpdateColumnAdapter MISCHIEF_UPDATE_MESSAGE_TYPE_COLUMN_ADAPTER = new MischiefUpdateColumnAdapter();
    private static final ainw<GetNewContentInteractionMessagesRow> NEW_CONTENT_INTERACTION_MESSAGE_ROW_MAPPER;
    private static final ScreenshottedOrReplayedStateAdapter SCREENSHOTTED_OR_REPLAYED_STATE_ADAPTER = new ScreenshottedOrReplayedStateAdapter();

    @AutoValue
    public static abstract class GetNewContentInteractionMessagesRow implements GetNewContentInteractionMessagesModel {
    }

    @AutoValue
    public static abstract class InteractionMessageRow implements GetInteractionMessagesModel {
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final Factory<InteractionMessagesRecord> getFACTORY() {
            return InteractionMessagesRecord.FACTORY;
        }

        public final ainw<InteractionMessageRow> getINTERACTION_MESSAGE_ROW_MAPPER() {
            return InteractionMessagesRecord.INTERACTION_MESSAGE_ROW_MAPPER;
        }

        public final ainw<GetNewContentInteractionMessagesRow> getNEW_CONTENT_INTERACTION_MESSAGE_ROW_MAPPER() {
            return InteractionMessagesRecord.NEW_CONTENT_INTERACTION_MESSAGE_ROW_MAPPER;
        }
    }

    static {
        akbq akbq = InteractionMessagesRecord$Companion$FACTORY$1.INSTANCE;
        if (akbq != null) {
            akbq = new InteractionMessagesRecord$sam$com_snap_core_db_record_InteractionMessagesModel_Creator$0(akbq);
        }
        Factory factory = new Factory((Creator) akbq, INTERACTION_MESSAGE_TYPE_COLUMN_ADAPTER, MESSAGE_CLIENT_STATUS_COLUMN_ADAPTER, LOCAL_MESSAGE_BODY_TYPE_COLUMN_ADAPTER, MISCHIEF_UPDATE_MESSAGE_TYPE_COLUMN_ADAPTER, SCREENSHOTTED_OR_REPLAYED_STATE_ADAPTER);
        FACTORY = factory;
        akbr akbr = InteractionMessagesRecord$Companion$INTERACTION_MESSAGE_ROW_MAPPER$1.INSTANCE;
        if (akbr != null) {
            akbr = new InteractionMessagesRecord$sam$com_snap_core_db_record_InteractionMessagesModel_GetInteractionMessagesCreator$0(akbr);
        }
        Object interactionMessagesMapper = factory.getInteractionMessagesMapper((GetInteractionMessagesCreator) akbr, FriendRecord.FACTORY);
        akcr.a(interactionMessagesMapper, "FACTORY.getInteractionMe…dRecord.FACTORY\n        )");
        INTERACTION_MESSAGE_ROW_MAPPER = (ainw) interactionMessagesMapper;
        Factory factory2 = FACTORY;
        akbp akbp = InteractionMessagesRecord$Companion$NEW_CONTENT_INTERACTION_MESSAGE_ROW_MAPPER$1.INSTANCE;
        if (akbp != null) {
            akbp = new InteractionMessagesRecord$sam$com_snap_core_db_record_InteractionMessagesModel_GetNewContentInteractionMessagesCreator$0(akbp);
        }
        interactionMessagesMapper = factory2.getNewContentInteractionMessagesMapper((GetNewContentInteractionMessagesCreator) akbp);
        akcr.a(interactionMessagesMapper, "FACTORY.getNewContentInt…ntInteractionMessagesRow)");
        NEW_CONTENT_INTERACTION_MESSAGE_ROW_MAPPER = (ainw) interactionMessagesMapper;
    }
}
