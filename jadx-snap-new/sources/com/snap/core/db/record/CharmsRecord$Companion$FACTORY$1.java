package com.snap.core.db.record;

import com.snap.core.db.column.CharmDataSourceType;
import com.snap.core.db.column.CharmOwnerType;
import defpackage.akby;
import defpackage.akcq;
import defpackage.akde;
import defpackage.akej;

final class CharmsRecord$Companion$FACTORY$1 extends akcq implements akby<Long, String, Long, CharmOwnerType, String, String, String, String, String, Long, Long, Long, String, String, String, String, String, String, CharmDataSourceType, Long, Long, AutoValue_CharmsRecord> {
    public static final CharmsRecord$Companion$FACTORY$1 INSTANCE = new CharmsRecord$Companion$FACTORY$1();

    CharmsRecord$Companion$FACTORY$1() {
        super(21);
    }

    public final String getName() {
        return "<init>";
    }

    public final akej getOwner() {
        return akde.a(AutoValue_CharmsRecord.class);
    }

    public final String getSignature() {
        return "<init>(JLjava/lang/String;JLcom/snap/core/db/column/CharmOwnerType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/snap/core/db/column/CharmDataSourceType;JLjava/lang/Long;)V";
    }

    public final AutoValue_CharmsRecord invoke(long j, String str, long j2, CharmOwnerType charmOwnerType, String str2, String str3, String str4, String str5, String str6, long j3, long j4, long j5, String str7, String str8, String str9, String str10, String str11, String str12, CharmDataSourceType charmDataSourceType, long j6, Long l) {
        return new AutoValue_CharmsRecord(j, str, j2, charmOwnerType, str2, str3, str4, str5, str6, j3, j4, j5, str7, str8, str9, str10, str11, str12, charmDataSourceType, j6, l);
    }
}
