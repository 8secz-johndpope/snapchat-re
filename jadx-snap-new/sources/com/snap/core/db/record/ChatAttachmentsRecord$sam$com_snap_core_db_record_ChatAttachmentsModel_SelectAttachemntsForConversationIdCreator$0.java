package com.snap.core.db.record;

import com.snap.core.db.record.ChatAttachmentsModel.SelectAttachemntsForConversationIdCreator;
import com.snap.core.db.record.ChatAttachmentsModel.SelectAttachemntsForConversationIdModel;
import defpackage.akbp;
import defpackage.akcr;

final class ChatAttachmentsRecord$sam$com_snap_core_db_record_ChatAttachmentsModel_SelectAttachemntsForConversationIdCreator$0 implements SelectAttachemntsForConversationIdCreator {
    private final /* synthetic */ akbp function;

    ChatAttachmentsRecord$sam$com_snap_core_db_record_ChatAttachmentsModel_SelectAttachemntsForConversationIdCreator$0(akbp akbp) {
        this.function = akbp;
    }

    public final /* synthetic */ SelectAttachemntsForConversationIdModel create(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, long j, Long l) {
        String str12 = str;
        akcr.b(str12, "type");
        String str13 = str2;
        akcr.b(str13, "conversationId");
        String str14 = str4;
        akcr.b(str14, ChatAttachmentsModel.ATTACHEDCONTENT);
        return (SelectAttachemntsForConversationIdModel) this.function.invoke(str12, str13, str3, str14, str5, str6, str7, str8, str9, str10, str11, Long.valueOf(j), l);
    }
}
