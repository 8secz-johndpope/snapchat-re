package com.snap.core.db.query;

import com.snap.core.db.column.GroupStoryType;
import com.snap.core.db.query.DiscoverFeedModel.DiscoverFeedFriendStoriesViewCreator;
import com.snap.core.db.query.DiscoverFeedModel.DiscoverFeedFriendStoriesViewModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$rPXSKyRgilmOk4aAyuMfAMUZxqw implements DiscoverFeedFriendStoriesViewCreator {
    public static final /* synthetic */ -$$Lambda$rPXSKyRgilmOk4aAyuMfAMUZxqw INSTANCE = new -$$Lambda$rPXSKyRgilmOk4aAyuMfAMUZxqw();

    private /* synthetic */ -$$Lambda$rPXSKyRgilmOk4aAyuMfAMUZxqw() {
    }

    public final DiscoverFeedFriendStoriesViewModel create(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, long j2, GroupStoryType groupStoryType, Boolean bool, Long l, Long l2, Long l3) {
        return new AutoValue_LegacyDiscoverFeedQueries_SnapDbFriendStory(j, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, j2, groupStoryType, bool, l, l2, l3);
    }
}
