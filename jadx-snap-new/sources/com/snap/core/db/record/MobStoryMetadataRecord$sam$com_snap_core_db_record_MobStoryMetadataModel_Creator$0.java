package com.snap.core.db.record;

import com.snap.core.db.record.MobStoryMetadataModel.Creator;
import defpackage.ageb;
import defpackage.agec;
import defpackage.akbo;
import defpackage.akcr;
import java.util.List;

final class MobStoryMetadataRecord$sam$com_snap_core_db_record_MobStoryMetadataModel_Creator$0 implements Creator {
    private final /* synthetic */ akbo function;

    MobStoryMetadataRecord$sam$com_snap_core_db_record_MobStoryMetadataModel_Creator$0(akbo akbo) {
        this.function = akbo;
    }

    public final /* synthetic */ MobStoryMetadataModel create(long j, long j2, Long l, String str, String str2, String str3, Long l2, String str4, String str5, ageb ageb, agec agec, List list) {
        ageb ageb2 = ageb;
        akcr.b(ageb2, MobStoryMetadataModel.STORYTYPE);
        agec agec2 = agec;
        akcr.b(agec2, MobStoryMetadataModel.TYPEEXTRADATA);
        return (MobStoryMetadataModel) this.function.invoke(Long.valueOf(j), Long.valueOf(j2), l, str, str2, str3, l2, str4, str5, ageb2, agec2, list);
    }
}
