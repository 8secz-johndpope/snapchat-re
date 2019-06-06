package com.snap.core.db.record;

import defpackage.ageb;
import defpackage.agec;
import defpackage.ageh;
import defpackage.akbo;
import defpackage.akcq;
import defpackage.akde;
import defpackage.akej;
import java.util.List;

final class MobStoryMetadataRecord$Companion$FACTORY$1 extends akcq implements akbo<Long, Long, Long, String, String, String, Long, String, String, ageb, agec, List<ageh>, AutoValue_MobStoryMetadataRecord> {
    public static final MobStoryMetadataRecord$Companion$FACTORY$1 INSTANCE = new MobStoryMetadataRecord$Companion$FACTORY$1();

    MobStoryMetadataRecord$Companion$FACTORY$1() {
        super(12);
    }

    public final String getName() {
        return "<init>";
    }

    public final akej getOwner() {
        return akde.a(AutoValue_MobStoryMetadataRecord.class);
    }

    public final String getSignature() {
        return "<init>(JJLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/snapchat/soju/android/broadcast/mobs/model/MobStoryType;Lcom/snapchat/soju/android/broadcast/mobs/model/MobStoryTypeExtraData;Ljava/util/List;)V";
    }

    public final AutoValue_MobStoryMetadataRecord invoke(long j, long j2, Long l, String str, String str2, String str3, Long l2, String str4, String str5, ageb ageb, agec agec, List<ageh> list) {
        return new AutoValue_MobStoryMetadataRecord(j, j2, l, str, str2, str3, l2, str4, str5, ageb, agec, list);
    }
}
