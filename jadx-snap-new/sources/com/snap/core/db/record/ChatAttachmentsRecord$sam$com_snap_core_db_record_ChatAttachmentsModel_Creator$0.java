package com.snap.core.db.record;

import com.snap.core.db.record.ChatAttachmentsModel.Creator;
import defpackage.akbq;
import defpackage.akcr;

final class ChatAttachmentsRecord$sam$com_snap_core_db_record_ChatAttachmentsModel_Creator$0 implements Creator {
    private final /* synthetic */ akbq function;

    ChatAttachmentsRecord$sam$com_snap_core_db_record_ChatAttachmentsModel_Creator$0(akbq akbq) {
        this.function = akbq;
    }

    public final /* synthetic */ ChatAttachmentsModel create(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, long j2, Long l) {
        String str12 = str;
        akcr.b(str12, "type");
        String str13 = str2;
        akcr.b(str13, "conversationId");
        String str14 = str4;
        akcr.b(str14, ChatAttachmentsModel.ATTACHEDCONTENT);
        return (ChatAttachmentsModel) this.function.invoke(Long.valueOf(j), str12, str13, str3, str14, str5, str6, str7, str8, str9, str10, str11, Long.valueOf(j2), l);
    }
}
