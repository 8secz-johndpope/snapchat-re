package com.snap.core.db.query;

import com.google.auto.value.AutoValue;
import com.snap.core.db.query.DiscoverFeedModel.DiscoverFeedFriendStoriesViewModel;
import com.snap.core.db.query.DiscoverFeedModel.Factory;
import com.snap.core.db.query.DiscoverFeedModel.SelectFriendStoryForNotificationWithStoryIdsModel;
import com.snap.core.db.query.DiscoverFeedModel.SelectFriendsFromGroupStoryModel;
import com.snap.core.db.record.StoryRecord;
import defpackage.ainw;

@AutoValue
public abstract class LegacyDiscoverFeedQueries implements DiscoverFeedModel {
    public static final Factory<StoryRecord> FACTORY;
    public static final ainw<SnapDbFriendStory> FRIENDS_STORIES_FOR_DISCOVER_FEED_MAPPER;
    public static final ainw<FriendFromGroupStory> FRIEND_FROM_GROUP_STORY_MAPPER = FACTORY.selectFriendsFromGroupStoryMapper(-$$Lambda$TFMRc-u2HXUznDbXz7CjXfLbgIk.INSTANCE);
    public static final ainw<NotificationFriendStory> NOTIFICATION_FRIEND_STORY_ROW_MAPPER = FACTORY.selectFriendStoryForNotificationWithStoryIdsMapper(-$$Lambda$5dX0OAFVTatKCCg2A4P5rAxN0oM.INSTANCE);

    @AutoValue
    public static abstract class FriendFromGroupStory implements SelectFriendsFromGroupStoryModel {
    }

    @AutoValue
    public static abstract class NotificationFriendStory implements SelectFriendStoryForNotificationWithStoryIdsModel {
    }

    @AutoValue
    public static abstract class SnapDbFriendStory implements DiscoverFeedFriendStoriesViewModel {
    }

    static {
        Factory factory = new Factory(StoryRecord.FACTORY);
        FACTORY = factory;
        FRIENDS_STORIES_FOR_DISCOVER_FEED_MAPPER = factory.selectLatestFriendStoriesForDiscoverFeedMapper(-$$Lambda$rPXSKyRgilmOk4aAyuMfAMUZxqw.INSTANCE);
    }
}
