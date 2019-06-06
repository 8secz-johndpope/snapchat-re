package com.snap.core.db.query;

import com.snap.core.db.column.CalendarDate;
import com.snap.core.db.column.FeedKind;
import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.column.Friendmojis;
import com.snap.core.db.query.LegacySendToQueries.Recent;
import com.snap.core.db.query.SendToModel.GetRecentFeedsCreator;
import com.snap.core.db.query.SendToModel.GetRecentFeedsModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$SRPLATx_kz3g29T2jY1YT41vD24 implements GetRecentFeedsCreator {
    public static final /* synthetic */ -$$Lambda$SRPLATx_kz3g29T2jY1YT41vD24 INSTANCE = new -$$Lambda$SRPLATx_kz3g29T2jY1YT41vD24();

    private /* synthetic */ -$$Lambda$SRPLATx_kz3g29T2jY1YT41vD24() {
    }

    public final GetRecentFeedsModel create(long j, String str, String str2, FeedKind feedKind, long j2, Long l, Friendmojis friendmojis, String str3, Long l2, String str4, String str5, String str6, Integer num, Long l3, CalendarDate calendarDate, FriendLinkType friendLinkType, String str7, String str8, Boolean bool, String str9, String str10) {
        return Recent.create(j, str, str2, feedKind, j2, l, friendmojis, str3, l2, str4, str5, str6, num, l3, calendarDate, friendLinkType, str7, str8, bool, str9, str10);
    }
}
