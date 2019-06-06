package com.snap.core.db.query;

import com.snap.core.db.column.CalendarDate;
import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.query.ProfileModel.GetFriendByUsernameCreator;
import com.snap.core.db.query.ProfileModel.GetFriendByUsernameModel;
import defpackage.akbu;
import defpackage.akcr;

final class LegacyProfileQueriesKt$sam$com_snap_core_db_query_ProfileModel_GetFriendByUsernameCreator$0 implements GetFriendByUsernameCreator {
    private final /* synthetic */ akbu function;

    LegacyProfileQueriesKt$sam$com_snap_core_db_query_ProfileModel_GetFriendByUsernameCreator$0(akbu akbu) {
        this.function = akbu;
    }

    public final /* synthetic */ GetFriendByUsernameModel create(long j, String str, String str2, String str3, String str4, Long l, String str5, String str6, CalendarDate calendarDate, Long l2, Long l3, FriendLinkType friendLinkType, Long l4, Long l5, Long l6, Long l7, long j2, Boolean bool) {
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        Long l8 = l;
        String str11 = str5;
        String str12 = str6;
        CalendarDate calendarDate2 = calendarDate;
        Long l9 = l2;
        Long l10 = l3;
        FriendLinkType friendLinkType2 = friendLinkType;
        Long l11 = l4;
        Long l12 = l5;
        Long l13 = l6;
        Long l14 = l7;
        Boolean bool2 = bool;
        akcr.b(str4, "friendUsername");
        return (GetFriendByUsernameModel) this.function.invoke(Long.valueOf(j), str7, str8, str9, str10, l8, str11, str12, calendarDate2, l9, l10, friendLinkType2, l11, l12, l13, l14, Long.valueOf(j2), bool2);
    }
}
