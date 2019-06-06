package com.snap.core.db.query;

import com.snap.core.db.column.CalendarDate;
import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.column.Friendmojis;
import com.snap.core.db.query.LegacySendToQueries.Friend;
import com.snap.core.db.query.SendToModel.GetBestFriendsCreator;
import com.snap.core.db.query.SendToModel.GetBestFriendsModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$IB9lxQC8484u7LzmlAwL86rcKIY implements GetBestFriendsCreator {
    public static final /* synthetic */ -$$Lambda$IB9lxQC8484u7LzmlAwL86rcKIY INSTANCE = new -$$Lambda$IB9lxQC8484u7LzmlAwL86rcKIY();

    private /* synthetic */ -$$Lambda$IB9lxQC8484u7LzmlAwL86rcKIY() {
    }

    public final GetBestFriendsModel create(long j, String str, String str2, String str3, Friendmojis friendmojis, String str4, Integer num, FriendLinkType friendLinkType, String str5, String str6, Long l, CalendarDate calendarDate, Long l2, boolean z) {
        return Friend.create(j, str, str2, str3, friendmojis, str4, num, friendLinkType, str5, str6, l, calendarDate, l2, z);
    }
}
