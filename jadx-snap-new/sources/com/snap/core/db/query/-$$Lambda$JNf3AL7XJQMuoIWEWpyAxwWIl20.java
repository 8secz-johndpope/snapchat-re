package com.snap.core.db.query;

import com.snap.core.db.column.CalendarDate;
import com.snap.core.db.column.FeedKind;
import com.snap.core.db.query.FriendsFeedModel.FriendsFeedViewCreator;
import com.snap.core.db.query.FriendsFeedModel.FriendsFeedViewModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$JNf3AL7XJQMuoIWEWpyAxwWIl20 implements FriendsFeedViewCreator {
    public static final /* synthetic */ -$$Lambda$JNf3AL7XJQMuoIWEWpyAxwWIl20 INSTANCE = new -$$Lambda$JNf3AL7XJQMuoIWEWpyAxwWIl20();

    private /* synthetic */ -$$Lambda$JNf3AL7XJQMuoIWEWpyAxwWIl20() {
    }

    public final FriendsFeedViewModel create(long j, String str, long j2, Long l, long j3, String str2, String str3, Long l2, Long l3, FeedKind feedKind, String str4, Long l4, String str5, String str6, String str7, String str8, Long l5, Integer num, Long l6, String str9, String str10, CalendarDate calendarDate, Long l7, Long l8, Boolean bool, long j4, Long l9, String str11, String str12, Boolean bool2, Long l10, Long l11, Long l12, String str13, Long l13, long j5, Long l14, String str14, String str15, String str16, String str17, Float f) {
        return new AutoValue_LegacyFriendsFeedQueries_WithFriendAndStory(j, str, j2, l, j3, str2, str3, l2, l3, feedKind, str4, l4, str5, str6, str7, str8, l5, num, l6, str9, str10, calendarDate, l7, l8, bool, j4, l9, str11, str12, bool2, l10, l11, l12, str13, l13, j5, l14, str14, str15, str16, str17, f);
    }
}
