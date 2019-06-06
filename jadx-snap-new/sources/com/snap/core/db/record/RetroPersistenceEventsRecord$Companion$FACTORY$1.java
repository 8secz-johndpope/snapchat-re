package com.snap.core.db.record;

import com.snap.core.db.column.RetroEventsCategory;
import defpackage.akce;
import defpackage.akcq;
import defpackage.akde;
import defpackage.akej;

final class RetroPersistenceEventsRecord$Companion$FACTORY$1 extends akcq implements akce<Long, RetroEventsCategory, String, String, byte[], Long, Long, AutoValue_RetroPersistenceEventsRecord> {
    public static final RetroPersistenceEventsRecord$Companion$FACTORY$1 INSTANCE = new RetroPersistenceEventsRecord$Companion$FACTORY$1();

    RetroPersistenceEventsRecord$Companion$FACTORY$1() {
        super(7);
    }

    public final String getName() {
        return "<init>";
    }

    public final akej getOwner() {
        return akde.a(AutoValue_RetroPersistenceEventsRecord.class);
    }

    public final String getSignature() {
        return "<init>(JLcom/snap/core/db/column/RetroEventsCategory;Ljava/lang/String;Ljava/lang/String;[BJJ)V";
    }

    public final AutoValue_RetroPersistenceEventsRecord invoke(long j, RetroEventsCategory retroEventsCategory, String str, String str2, byte[] bArr, long j2, long j3) {
        return new AutoValue_RetroPersistenceEventsRecord(j, retroEventsCategory, str, str2, bArr, j2, j3);
    }
}
