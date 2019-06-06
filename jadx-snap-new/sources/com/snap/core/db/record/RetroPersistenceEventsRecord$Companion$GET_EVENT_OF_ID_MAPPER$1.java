package com.snap.core.db.record;

import com.snap.core.db.column.RetroEventsCategory;
import defpackage.akce;
import defpackage.akcq;
import defpackage.akde;
import defpackage.akej;

final class RetroPersistenceEventsRecord$Companion$GET_EVENT_OF_ID_MAPPER$1 extends akcq implements akce<Long, RetroEventsCategory, String, String, byte[], Long, Long, AutoValue_RetroPersistenceEventsRecord_GetEventOfIdImpl> {
    public static final RetroPersistenceEventsRecord$Companion$GET_EVENT_OF_ID_MAPPER$1 INSTANCE = new RetroPersistenceEventsRecord$Companion$GET_EVENT_OF_ID_MAPPER$1();

    RetroPersistenceEventsRecord$Companion$GET_EVENT_OF_ID_MAPPER$1() {
        super(7);
    }

    public final String getName() {
        return "<init>";
    }

    public final akej getOwner() {
        return akde.a(AutoValue_RetroPersistenceEventsRecord_GetEventOfIdImpl.class);
    }

    public final String getSignature() {
        return "<init>(JLcom/snap/core/db/column/RetroEventsCategory;Ljava/lang/String;Ljava/lang/String;[BJJ)V";
    }

    public final AutoValue_RetroPersistenceEventsRecord_GetEventOfIdImpl invoke(long j, RetroEventsCategory retroEventsCategory, String str, String str2, byte[] bArr, long j2, long j3) {
        return new AutoValue_RetroPersistenceEventsRecord_GetEventOfIdImpl(j, retroEventsCategory, str, str2, bArr, j2, j3);
    }
}
