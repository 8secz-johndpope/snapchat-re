package com.snap.core.db.record;

import com.snap.core.db.record.MobStoryMetadataModel.SelectMobStoryMetadataCreator;
import com.snap.core.db.record.MobStoryMetadataModel.SelectMobStoryMetadataModel;
import defpackage.ageb;
import defpackage.agec;
import defpackage.akbo;
import defpackage.akcr;
import java.util.List;

final class MobStoryMetadataRecord$sam$com_snap_core_db_record_MobStoryMetadataModel_SelectMobStoryMetadataCreator$0 implements SelectMobStoryMetadataCreator {
    private final /* synthetic */ akbo function;

    MobStoryMetadataRecord$sam$com_snap_core_db_record_MobStoryMetadataModel_SelectMobStoryMetadataCreator$0(akbo akbo) {
        this.function = akbo;
    }

    public final /* synthetic */ SelectMobStoryMetadataModel create(long j, long j2, String str, String str2, String str3, Long l, String str4, String str5, ageb ageb, agec agec, List list, String str6) {
        ageb ageb2 = ageb;
        akcr.b(ageb2, MobStoryMetadataModel.STORYTYPE);
        agec agec2 = agec;
        akcr.b(agec2, MobStoryMetadataModel.TYPEEXTRADATA);
        String str7 = str6;
        akcr.b(str7, "storyId");
        return (SelectMobStoryMetadataModel) this.function.invoke(Long.valueOf(j), Long.valueOf(j2), str, str2, str3, l, str4, str5, ageb2, agec2, list, str7);
    }
}
