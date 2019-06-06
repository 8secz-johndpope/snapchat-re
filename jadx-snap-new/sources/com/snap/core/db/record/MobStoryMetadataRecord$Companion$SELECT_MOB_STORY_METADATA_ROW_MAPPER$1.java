package com.snap.core.db.record;

import defpackage.ageb;
import defpackage.agec;
import defpackage.ageh;
import defpackage.akbo;
import defpackage.akcq;
import defpackage.akde;
import defpackage.akej;
import java.util.List;

final class MobStoryMetadataRecord$Companion$SELECT_MOB_STORY_METADATA_ROW_MAPPER$1 extends akcq implements akbo<Long, Long, String, String, String, Long, String, String, ageb, agec, List<ageh>, String, AutoValue_MobStoryMetadataRecord_SelectMobStoryMetadataRecord> {
    public static final MobStoryMetadataRecord$Companion$SELECT_MOB_STORY_METADATA_ROW_MAPPER$1 INSTANCE = new MobStoryMetadataRecord$Companion$SELECT_MOB_STORY_METADATA_ROW_MAPPER$1();

    MobStoryMetadataRecord$Companion$SELECT_MOB_STORY_METADATA_ROW_MAPPER$1() {
        super(12);
    }

    public final String getName() {
        return "<init>";
    }

    public final akej getOwner() {
        return akde.a(AutoValue_MobStoryMetadataRecord_SelectMobStoryMetadataRecord.class);
    }

    public final String getSignature() {
        return "<init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/snapchat/soju/android/broadcast/mobs/model/MobStoryType;Lcom/snapchat/soju/android/broadcast/mobs/model/MobStoryTypeExtraData;Ljava/util/List;Ljava/lang/String;)V";
    }

    public final AutoValue_MobStoryMetadataRecord_SelectMobStoryMetadataRecord invoke(long j, long j2, String str, String str2, String str3, Long l, String str4, String str5, ageb ageb, agec agec, List<ageh> list, String str6) {
        return new AutoValue_MobStoryMetadataRecord_SelectMobStoryMetadataRecord(j, j2, str, str2, str3, l, str4, str5, ageb, agec, list, str6);
    }
}
