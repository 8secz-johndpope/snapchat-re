package com.snap.core.db.record;

import defpackage.akbq;
import defpackage.akcq;
import defpackage.akde;
import defpackage.akej;

final class ChatAttachmentsRecord$Companion$FACTORY$1 extends akcq implements akbq<Long, String, String, String, String, String, String, String, String, String, String, String, Long, Long, AutoValue_ChatAttachmentsRecord> {
    public static final ChatAttachmentsRecord$Companion$FACTORY$1 INSTANCE = new ChatAttachmentsRecord$Companion$FACTORY$1();

    ChatAttachmentsRecord$Companion$FACTORY$1() {
        super(14);
    }

    public final String getName() {
        return "<init>";
    }

    public final akej getOwner() {
        return akde.a(AutoValue_ChatAttachmentsRecord.class);
    }

    public final String getSignature() {
        return "<init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;)V";
    }

    public final AutoValue_ChatAttachmentsRecord invoke(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, long j2, Long l) {
        return new AutoValue_ChatAttachmentsRecord(j, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, j2, l);
    }
}
