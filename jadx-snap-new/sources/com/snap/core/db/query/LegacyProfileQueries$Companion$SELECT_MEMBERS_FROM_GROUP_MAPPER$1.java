package com.snap.core.db.query;

import com.snap.core.db.column.CalendarDate;
import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.column.Friendmojis;
import defpackage.akbz;
import defpackage.akcq;
import defpackage.akde;
import defpackage.akej;

final class LegacyProfileQueries$Companion$SELECT_MEMBERS_FROM_GROUP_MAPPER$1 extends akcq implements akbz<Integer, Long, Long, String, String, String, String, String, String, Long, FriendLinkType, Friendmojis, Integer, Long, CalendarDate, Long, Long, Long, Long, Long, Boolean, Long, AutoValue_LegacyProfileQueries_MemberForGroup> {
    public static final LegacyProfileQueries$Companion$SELECT_MEMBERS_FROM_GROUP_MAPPER$1 INSTANCE = new LegacyProfileQueries$Companion$SELECT_MEMBERS_FROM_GROUP_MAPPER$1();

    LegacyProfileQueries$Companion$SELECT_MEMBERS_FROM_GROUP_MAPPER$1() {
        super(22);
    }

    public final String getName() {
        return "<init>";
    }

    public final akej getOwner() {
        return akde.a(AutoValue_LegacyProfileQueries_MemberForGroup.class);
    }

    public final String getSignature() {
        return "<init>(Ljava/lang/Integer;Ljava/lang/Long;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/snap/core/db/column/FriendLinkType;Lcom/snap/core/db/column/Friendmojis;Ljava/lang/Integer;Ljava/lang/Long;Lcom/snap/core/db/column/CalendarDate;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;J)V";
    }

    public final AutoValue_LegacyProfileQueries_MemberForGroup invoke(Integer num, Long l, long j, String str, String str2, String str3, String str4, String str5, String str6, Long l2, FriendLinkType friendLinkType, Friendmojis friendmojis, Integer num2, Long l3, CalendarDate calendarDate, Long l4, Long l5, Long l6, Long l7, Long l8, Boolean bool, long j2) {
        return new AutoValue_LegacyProfileQueries_MemberForGroup(num, l, j, str, str2, str3, str4, str5, str6, l2, friendLinkType, friendmojis, num2, l3, calendarDate, l4, l5, l6, l7, l8, bool, j2);
    }
}
