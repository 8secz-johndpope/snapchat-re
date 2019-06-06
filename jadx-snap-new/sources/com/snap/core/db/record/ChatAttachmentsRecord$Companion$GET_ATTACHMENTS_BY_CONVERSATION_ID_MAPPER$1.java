package com.snap.core.db.record;

import defpackage.akbp;
import defpackage.akcq;
import defpackage.akde;
import defpackage.akej;

final class ChatAttachmentsRecord$Companion$GET_ATTACHMENTS_BY_CONVERSATION_ID_MAPPER$1 extends akcq implements akbp<String, String, String, String, String, String, String, String, String, String, String, Long, Long, AutoValue_ChatAttachmentsRecord_ChatAttachmentsDataRecord> {
    public static final ChatAttachmentsRecord$Companion$GET_ATTACHMENTS_BY_CONVERSATION_ID_MAPPER$1 INSTANCE = new ChatAttachmentsRecord$Companion$GET_ATTACHMENTS_BY_CONVERSATION_ID_MAPPER$1();

    ChatAttachmentsRecord$Companion$GET_ATTACHMENTS_BY_CONVERSATION_ID_MAPPER$1() {
        super(13);
    }

    public final String getName() {
        return "<init>";
    }

    public final akej getOwner() {
        return akde.a(AutoValue_ChatAttachmentsRecord_ChatAttachmentsDataRecord.class);
    }

    public final String getSignature() {
        return "<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;)V";
    }

    public final AutoValue_ChatAttachmentsRecord_ChatAttachmentsDataRecord invoke(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, long j, Long l) {
        return new AutoValue_ChatAttachmentsRecord_ChatAttachmentsDataRecord(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, j, l);
    }
}
