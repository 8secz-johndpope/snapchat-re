package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.record.ChatAttachmentsModel.Creator;
import com.snap.core.db.record.ChatAttachmentsModel.Factory;
import com.snap.core.db.record.ChatAttachmentsModel.SelectAttachemntsForConversationIdCreator;
import com.snap.core.db.record.ChatAttachmentsModel.SelectAttachemntsForConversationIdModel;
import defpackage.ainw;
import defpackage.akbp;
import defpackage.akbq;
import defpackage.akco;
import defpackage.akcr;

@AutoValue
public abstract class ChatAttachmentsRecord implements ChatAttachmentsModel {
    public static final Companion Companion = new Companion();
    private static final Factory<ChatAttachmentsModel> FACTORY;
    private static final ainw<ChatAttachmentsDataRecord> GET_ATTACHMENTS_BY_CONVERSATION_ID_MAPPER;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final Factory<ChatAttachmentsModel> getFACTORY() {
            return ChatAttachmentsRecord.FACTORY;
        }

        public final ainw<ChatAttachmentsDataRecord> getGET_ATTACHMENTS_BY_CONVERSATION_ID_MAPPER() {
            return ChatAttachmentsRecord.GET_ATTACHMENTS_BY_CONVERSATION_ID_MAPPER;
        }
    }

    @AutoValue
    public static abstract class ChatAttachmentsDataRecord implements SelectAttachemntsForConversationIdModel {
    }

    static {
        akbq akbq = ChatAttachmentsRecord$Companion$FACTORY$1.INSTANCE;
        if (akbq != null) {
            akbq = new ChatAttachmentsRecord$sam$com_snap_core_db_record_ChatAttachmentsModel_Creator$0(akbq);
        }
        Factory factory = new Factory((Creator) akbq);
        FACTORY = factory;
        akbp akbp = ChatAttachmentsRecord$Companion$GET_ATTACHMENTS_BY_CONVERSATION_ID_MAPPER$1.INSTANCE;
        if (akbp != null) {
            akbp = new ChatAttachmentsRecord$sam$com_snap_core_db_record_ChatAttachmentsModel_SelectAttachemntsForConversationIdCreator$0(akbp);
        }
        Object selectAttachemntsForConversationIdMapper = factory.selectAttachemntsForConversationIdMapper((SelectAttachemntsForConversationIdCreator) akbp);
        akcr.a(selectAttachemntsForConversationIdMapper, "FACTORY.selectAttachemnt…hatAttachmentsDataRecord)");
        GET_ATTACHMENTS_BY_CONVERSATION_ID_MAPPER = (ainw) selectAttachemntsForConversationIdMapper;
    }
}
