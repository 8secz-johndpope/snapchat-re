package com.snap.core.db.query;

import com.snap.core.db.column.CalendarDate;
import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.query.SearchModel.GetRecentFriendsCreator;
import com.snap.core.db.query.SearchModel.GetRecentFriendsModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$MLKmu-TIBuOq4jkiVnOkssK-Eew implements GetRecentFriendsCreator {
    public static final /* synthetic */ -$$Lambda$MLKmu-TIBuOq4jkiVnOkssK-Eew INSTANCE = new -$$Lambda$MLKmu-TIBuOq4jkiVnOkssK-Eew();

    private /* synthetic */ -$$Lambda$MLKmu-TIBuOq4jkiVnOkssK-Eew() {
    }

    public final GetRecentFriendsModel create(long j, String str, String str2, String str3, Long l, String str4, Integer num, FriendLinkType friendLinkType, String str5, String str6, Long l2, CalendarDate calendarDate, Long l3, Long l4, String str7, Long l5, Boolean bool, Long l6, Long l7, boolean z, boolean z2, boolean z3, String str8) {
        return new AutoValue_LegacySearchQueries_FriendImpl(j, str, str2, str3, l, str4, num, friendLinkType, str5, str6, l2, calendarDate, l3, l4, str7, l5, bool, l6, l7, z, z2, z3, str8);
    }
}
