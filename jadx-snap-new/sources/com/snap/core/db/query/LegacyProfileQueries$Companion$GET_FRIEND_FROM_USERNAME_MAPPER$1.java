package com.snap.core.db.query;

import com.snap.core.db.column.CalendarDate;
import com.snap.core.db.column.FriendLinkType;
import defpackage.akbu;
import defpackage.akcq;
import defpackage.akde;
import defpackage.akej;

final class LegacyProfileQueries$Companion$GET_FRIEND_FROM_USERNAME_MAPPER$1 extends akcq implements akbu<Long, String, String, String, String, Long, String, String, CalendarDate, Long, Long, FriendLinkType, Long, Long, Long, Long, Long, Boolean, AutoValue_LegacyProfileQueries_FriendProfileDataRecord> {
    public static final LegacyProfileQueries$Companion$GET_FRIEND_FROM_USERNAME_MAPPER$1 INSTANCE = new LegacyProfileQueries$Companion$GET_FRIEND_FROM_USERNAME_MAPPER$1();

    LegacyProfileQueries$Companion$GET_FRIEND_FROM_USERNAME_MAPPER$1() {
        super(18);
    }

    public final String getName() {
        return "<init>";
    }

    public final akej getOwner() {
        return akde.a(AutoValue_LegacyProfileQueries_FriendProfileDataRecord.class);
    }

    public final String getSignature() {
        return "<init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/snap/core/db/column/CalendarDate;Ljava/lang/Long;Ljava/lang/Long;Lcom/snap/core/db/column/FriendLinkType;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;JLjava/lang/Boolean;)V";
    }

    public final AutoValue_LegacyProfileQueries_FriendProfileDataRecord invoke(long j, String str, String str2, String str3, String str4, Long l, String str5, String str6, CalendarDate calendarDate, Long l2, Long l3, FriendLinkType friendLinkType, Long l4, Long l5, Long l6, Long l7, long j2, Boolean bool) {
        return new AutoValue_LegacyProfileQueries_FriendProfileDataRecord(j, str, str2, str3, str4, l, str5, str6, calendarDate, l2, l3, friendLinkType, l4, l5, l6, l7, j2, bool);
    }
}
