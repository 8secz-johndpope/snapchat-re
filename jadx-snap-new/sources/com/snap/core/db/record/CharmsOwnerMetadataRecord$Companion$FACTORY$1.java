package com.snap.core.db.record;

import defpackage.akcb;
import defpackage.akcq;
import defpackage.akde;
import defpackage.akej;

final class CharmsOwnerMetadataRecord$Companion$FACTORY$1 extends akcq implements akcb<Long, String, byte[], Long, AutoValue_CharmsOwnerMetadataRecord> {
    public static final CharmsOwnerMetadataRecord$Companion$FACTORY$1 INSTANCE = new CharmsOwnerMetadataRecord$Companion$FACTORY$1();

    CharmsOwnerMetadataRecord$Companion$FACTORY$1() {
        super(4);
    }

    public final String getName() {
        return "<init>";
    }

    public final akej getOwner() {
        return akde.a(AutoValue_CharmsOwnerMetadataRecord.class);
    }

    public final String getSignature() {
        return "<init>(JLjava/lang/String;[BJ)V";
    }

    public final AutoValue_CharmsOwnerMetadataRecord invoke(long j, String str, byte[] bArr, long j2) {
        return new AutoValue_CharmsOwnerMetadataRecord(j, str, bArr, j2);
    }
}
