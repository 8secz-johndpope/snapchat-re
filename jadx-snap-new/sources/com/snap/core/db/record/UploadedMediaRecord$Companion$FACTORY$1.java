package com.snap.core.db.record;

import defpackage.acgp;
import defpackage.akcf;
import defpackage.akcq;
import defpackage.akde;
import defpackage.akej;

final class UploadedMediaRecord$Companion$FACTORY$1 extends akcq implements akcf<Long, String, String, String, String, Long, acgp, Long, AutoValue_UploadedMediaRecord> {
    public static final UploadedMediaRecord$Companion$FACTORY$1 INSTANCE = new UploadedMediaRecord$Companion$FACTORY$1();

    UploadedMediaRecord$Companion$FACTORY$1() {
        super(8);
    }

    public final String getName() {
        return "<init>";
    }

    public final akej getOwner() {
        return akde.a(AutoValue_UploadedMediaRecord.class);
    }

    public final String getSignature() {
        return "<init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/snapchat/content/nano/UploadLocation;J)V";
    }

    public final AutoValue_UploadedMediaRecord invoke(long j, String str, String str2, String str3, String str4, long j2, acgp acgp, long j3) {
        return new AutoValue_UploadedMediaRecord(j, str, str2, str3, str4, j2, acgp, j3);
    }
}
