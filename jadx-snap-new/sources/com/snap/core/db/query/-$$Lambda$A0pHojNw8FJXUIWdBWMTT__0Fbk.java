package com.snap.core.db.query;

import com.snap.core.db.column.CalendarDate;
import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.column.Friendmojis;
import com.snap.core.db.query.LegacySendToQueries.Friend;
import com.snap.core.db.query.SendToModel.GetAllFriendsCreator;
import com.snap.core.db.query.SendToModel.GetAllFriendsModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$A0pHojNw8FJXUIWdBWMTT__0Fbk implements GetAllFriendsCreator {
    public static final /* synthetic */ -$$Lambda$A0pHojNw8FJXUIWdBWMTT__0Fbk INSTANCE = new -$$Lambda$A0pHojNw8FJXUIWdBWMTT__0Fbk();

    private /* synthetic */ -$$Lambda$A0pHojNw8FJXUIWdBWMTT__0Fbk() {
    }

    public final GetAllFriendsModel create(long j, String str, String str2, String str3, Friendmojis friendmojis, String str4, Integer num, FriendLinkType friendLinkType, String str5, String str6, Long l, CalendarDate calendarDate, Long l2, boolean z) {
        return Friend.create(j, str, str2, str3, friendmojis, str4, num, friendLinkType, str5, str6, l, calendarDate, l2, z);
    }
}
