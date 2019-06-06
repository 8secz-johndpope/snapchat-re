package com.snap.core.db.record;

import com.snap.core.db.record.StoryRecord.AllInfoRecord;
import com.snap.core.db.record.StoryRecord.PlayableStoryRecord;
import com.snap.core.db.record.StoryRecord.UserManagedStoryRecord;
import defpackage.ainw;

public class LegacyStoryQueries {
    public static final ainw<StoryRecord> SELECT_BY_STORY_KEY_MAPPER = StoryRecord.FACTORY.selectByStoryKeyMapper();
    public static final ainw<StoryRecord> SELECT_BY_STORY_ROW_ID_MAPPER = StoryRecord.FACTORY.selectByStoryRowIdMapper();
    public static final ainw<String> SELECT_GROUP_IDS_MAPPER = StoryRecord.FACTORY.selectAllGroupStoryIdsMapper();
    public static final ainw<PlayableStoryRecord> SELECT_PLAYABLE_STORY_MAPPER = StoryRecord.FACTORY.selectPlayableStoryMapper(-$$Lambda$AHxT1_Mo5opjza6MSlGpxKpjM5c.INSTANCE, FriendRecord.FACTORY, FeedRecord.FACTORY, MobStoryMetadataRecord.getFACTORY());
    public static final ainw<AllInfoRecord> SELECT_STORIES_MAPPER = StoryRecord.FACTORY.selectAllFriendStoriesMapper(-$$Lambda$DQ9xvBpyU8ZwReepPPuwQHde3XE.INSTANCE, FriendRecord.FACTORY);
    public static final ainw<UserManagedStoryRecord> SELECT_USER_MANAGED_STORIES_MAPPER = StoryRecord.FACTORY.selectUserManagedStoriesMapper(-$$Lambda$Euz1DZDNjCKlKWa3u693SiE1HcE.INSTANCE);
}
