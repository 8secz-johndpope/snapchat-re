package com.snap.core.db.query;

import com.snap.core.db.column.CalendarDate;
import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.column.Friendmojis;
import com.snap.core.db.query.ProfileModel.SelectMembersForGroupCreator;
import com.snap.core.db.query.ProfileModel.SelectMembersForGroupModel;
import defpackage.akbz;
import defpackage.akcr;

final class LegacyProfileQueriesKt$sam$com_snap_core_db_query_ProfileModel_SelectMembersForGroupCreator$0 implements SelectMembersForGroupCreator {
    private final /* synthetic */ akbz function;

    LegacyProfileQueriesKt$sam$com_snap_core_db_query_ProfileModel_SelectMembersForGroupCreator$0(akbz akbz) {
        this.function = akbz;
    }

    public final /* synthetic */ SelectMembersForGroupModel create(Integer num, Long l, long j, String str, String str2, String str3, String str4, String str5, String str6, Long l2, FriendLinkType friendLinkType, Friendmojis friendmojis, Integer num2, Long l3, CalendarDate calendarDate, Long l4, Long l5, Long l6, Long l7, Long l8, Boolean bool, long j2) {
        Integer num3 = num;
        Long l9 = l;
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        Long l10 = l2;
        FriendLinkType friendLinkType2 = friendLinkType;
        Friendmojis friendmojis2 = friendmojis;
        Integer num4 = num2;
        Long l11 = l3;
        CalendarDate calendarDate2 = calendarDate;
        Long l12 = l4;
        Long l13 = l5;
        Long l14 = l6;
        Long l15 = l7;
        Long l16 = l8;
        Boolean bool2 = bool;
        akcr.b(str4, "username");
        return (SelectMembersForGroupModel) this.function.invoke(num3, l9, Long.valueOf(j), str7, str8, str9, str10, str11, str12, l10, friendLinkType2, friendmojis2, num4, l11, calendarDate2, l12, l13, l14, l15, l16, bool2, Long.valueOf(j2));
    }
}
