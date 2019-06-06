package com.snap.core.db.query;

import com.google.auto.value.AutoValue;
import com.snap.core.db.column.FeedKind;
import com.snap.core.db.query.FriendsFeedModel.Factory;
import com.snap.core.db.query.FriendsFeedModel.FriendsFeedViewModel;
import com.snap.core.db.query.FriendsFeedModel.SelectFailedOrQueuedFeedItemsModel;
import com.snap.core.db.query.FriendsFeedModel.SelectNonFailedFeedItemsModel;
import com.snap.core.db.query.FriendsFeedModel.SelectStoriesForPlayingModel;
import com.snap.core.db.record.FeedRecord;
import com.snap.core.db.record.FriendRecord;
import defpackage.ainw;

@AutoValue
public abstract class LegacyFriendsFeedQueries implements FriendsFeedModel {
    public static final Factory<FeedRecord, FriendRecord> FACTORY;
    public static final ainw<FailedOrSending> FAILED_OR_SENDING_FEED_ITEMS_MAPPER = FACTORY.selectFailedOrQueuedFeedItemsMapper(-$$Lambda$qUpYG58tGy6mthig4GPNH67d2vc.INSTANCE);
    public static final ainw<WithFriendAndStory> LATEST_FEEDS_MAPPER;
    public static final ainw<WithFriendAndStory> LATEST_GROUPS_MAPPER = FACTORY.selectLatestGroupsMapper(-$$Lambda$JNf3AL7XJQMuoIWEWpyAxwWIl20.INSTANCE);
    public static final ainw<WithFriendAndStory> LATEST_WITH_STORIES_MAPPER = FACTORY.selectLatestStoriesOnlyMapper(-$$Lambda$JNf3AL7XJQMuoIWEWpyAxwWIl20.INSTANCE);
    public static final ainw<NonFailed> NON_FAILED_FEED_ITEMS_MAPPER = FACTORY.selectNonFailedFeedItemsMapper(-$$Lambda$c_yd1uFtMIsIVS1y6HAmRqiH1K0.INSTANCE);
    public static final ainw<PlayableStoryRecord> PLAYABLE_STORIES_MAPPER = FACTORY.selectStoriesForPlayingMapper(-$$Lambda$RoS4CIdMET9iuxo2uNqj8041V8Q.INSTANCE);

    @AutoValue
    public static abstract class WithFriendAndStory implements FriendsFeedViewModel {
        public boolean isGroup() {
            return kind() == FeedKind.GROUP;
        }
    }

    @AutoValue
    public static abstract class FailedOrSending implements SelectFailedOrQueuedFeedItemsModel {
    }

    @AutoValue
    public static abstract class NonFailed implements SelectNonFailedFeedItemsModel {
    }

    @AutoValue
    public static abstract class PlayableStoryRecord implements SelectStoriesForPlayingModel {
    }

    static {
        Factory factory = new Factory(FeedRecord.FACTORY, FriendRecord.FACTORY);
        FACTORY = factory;
        LATEST_FEEDS_MAPPER = factory.selectLatestMapper(-$$Lambda$JNf3AL7XJQMuoIWEWpyAxwWIl20.INSTANCE);
    }
}
