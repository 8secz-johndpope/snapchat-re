package com.snap.core.db.query;

import com.snap.core.db.column.GroupStoryType;
import defpackage.akbp;
import defpackage.akcq;
import defpackage.akde;
import defpackage.akej;

final class LegacyProfileQueries$Companion$GET_GROUP_INFO_BY_ID_MAPPER$1 extends akcq implements akbp<Long, String, Long, Long, Long, Long, Long, Long, Boolean, GroupStoryType, Boolean, String, String, AutoValue_LegacyProfileQueries_GroupInfoDataRecord> {
    public static final LegacyProfileQueries$Companion$GET_GROUP_INFO_BY_ID_MAPPER$1 INSTANCE = new LegacyProfileQueries$Companion$GET_GROUP_INFO_BY_ID_MAPPER$1();

    LegacyProfileQueries$Companion$GET_GROUP_INFO_BY_ID_MAPPER$1() {
        super(13);
    }

    public final String getName() {
        return "<init>";
    }

    public final akej getOwner() {
        return akde.a(AutoValue_LegacyProfileQueries_GroupInfoDataRecord.class);
    }

    public final String getSignature() {
        return "<init>(JLjava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Lcom/snap/core/db/column/GroupStoryType;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V";
    }

    public final AutoValue_LegacyProfileQueries_GroupInfoDataRecord invoke(long j, String str, long j2, Long l, Long l2, Long l3, Long l4, Long l5, Boolean bool, GroupStoryType groupStoryType, Boolean bool2, String str2, String str3) {
        return new AutoValue_LegacyProfileQueries_GroupInfoDataRecord(j, str, j2, l, l2, l3, l4, l5, bool, groupStoryType, bool2, str2, str3);
    }
}
