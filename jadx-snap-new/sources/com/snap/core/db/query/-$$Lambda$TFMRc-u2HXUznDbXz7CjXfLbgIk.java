package com.snap.core.db.query;

import com.snap.core.db.query.DiscoverFeedModel.SelectFriendsFromGroupStoryCreator;
import com.snap.core.db.query.DiscoverFeedModel.SelectFriendsFromGroupStoryModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$TFMRc-u2HXUznDbXz7CjXfLbgIk implements SelectFriendsFromGroupStoryCreator {
    public static final /* synthetic */ -$$Lambda$TFMRc-u2HXUznDbXz7CjXfLbgIk INSTANCE = new -$$Lambda$TFMRc-u2HXUznDbXz7CjXfLbgIk();

    private /* synthetic */ -$$Lambda$TFMRc-u2HXUznDbXz7CjXfLbgIk() {
    }

    public final SelectFriendsFromGroupStoryModel create(String str, String str2, String str3) {
        return new AutoValue_LegacyDiscoverFeedQueries_FriendFromGroupStory(str, str2, str3);
    }
}
