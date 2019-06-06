package com.snap.core.db.record;

import com.snap.core.db.column.RetroEventsCategory;
import com.snap.core.db.record.RetroPersistenceEventsModel.GetEventOfIdCreator;
import com.snap.core.db.record.RetroPersistenceEventsModel.GetEventOfIdModel;
import defpackage.akce;
import defpackage.akcr;

final class RetroPersistenceEventsRecord$sam$com_snap_core_db_record_RetroPersistenceEventsModel_GetEventOfIdCreator$0 implements GetEventOfIdCreator {
    private final /* synthetic */ akce function;

    RetroPersistenceEventsRecord$sam$com_snap_core_db_record_RetroPersistenceEventsModel_GetEventOfIdCreator$0(akce akce) {
        this.function = akce;
    }

    public final /* synthetic */ GetEventOfIdModel create(long j, RetroEventsCategory retroEventsCategory, String str, String str2, byte[] bArr, long j2, long j3) {
        RetroEventsCategory retroEventsCategory2 = retroEventsCategory;
        akcr.b(retroEventsCategory, "category");
        String str3 = str2;
        akcr.b(str2, RetroPersistenceEventsModel.SINGLETRACKURL);
        Object obj = bArr;
        akcr.b(bArr, "payload");
        return (GetEventOfIdModel) this.function.invoke(Long.valueOf(j), retroEventsCategory2, str, str3, obj, Long.valueOf(j2), Long.valueOf(j3));
    }
}
