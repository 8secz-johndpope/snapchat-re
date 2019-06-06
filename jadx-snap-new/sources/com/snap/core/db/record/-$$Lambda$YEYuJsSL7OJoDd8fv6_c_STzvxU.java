package com.snap.core.db.record;

import com.snap.core.db.column.CalendarDate;
import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.column.Friendmojis;
import com.snap.core.db.record.FriendModel.Creator;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$YEYuJsSL7OJoDd8fv6_c_STzvxU implements Creator {
    public static final /* synthetic */ -$$Lambda$YEYuJsSL7OJoDd8fv6_c_STzvxU INSTANCE = new -$$Lambda$YEYuJsSL7OJoDd8fv6_c_STzvxU();

    private /* synthetic */ -$$Lambda$YEYuJsSL7OJoDd8fv6_c_STzvxU() {
    }

    public final FriendModel create(long j, Long l, String str, String str2, String str3, String str4, String str5, Friendmojis friendmojis, String str6, String str7, Long l2, CalendarDate calendarDate, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, String str8, Integer num, Long l10, FriendLinkType friendLinkType, boolean z, boolean z2, boolean z3, boolean z4, String str9) {
        return new AutoValue_FriendRecord(j, l, str, str2, str3, str4, str5, friendmojis, str6, str7, l2, calendarDate, l3, l4, l5, l6, l7, l8, l9, str8, num, l10, friendLinkType, z, z2, z3, z4, str9);
    }
}
