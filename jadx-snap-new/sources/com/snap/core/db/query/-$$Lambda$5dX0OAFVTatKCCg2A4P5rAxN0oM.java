package com.snap.core.db.query;

import com.snap.core.db.query.DiscoverFeedModel.SelectFriendStoryForNotificationWithStoryIdsCreator;
import com.snap.core.db.query.DiscoverFeedModel.SelectFriendStoryForNotificationWithStoryIdsModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$5dX0OAFVTatKCCg2A4P5rAxN0oM implements SelectFriendStoryForNotificationWithStoryIdsCreator {
    public static final /* synthetic */ -$$Lambda$5dX0OAFVTatKCCg2A4P5rAxN0oM INSTANCE = new -$$Lambda$5dX0OAFVTatKCCg2A4P5rAxN0oM();

    private /* synthetic */ -$$Lambda$5dX0OAFVTatKCCg2A4P5rAxN0oM() {
    }

    public final SelectFriendStoryForNotificationWithStoryIdsModel create(long j, String str, String str2, String str3, String str4, String str5, Long l) {
        return new AutoValue_LegacyDiscoverFeedQueries_NotificationFriendStory(j, str, str2, str3, str4, str5, l);
    }
}
