package com.snap.core.db.query;

import android.database.Cursor;
import com.snap.core.db.column.CalendarDate;
import com.snap.core.db.column.FeedKind;
import com.snap.core.db.record.FeedModel;
import com.snap.core.db.record.FriendModel;
import com.snap.core.db.record.FriendsFeedScoreModel;
import com.snap.core.db.record.InteractionMessagesModel;
import com.snap.core.db.record.MobStoryMetadataModel;
import com.snap.core.db.record.SnapModel;
import com.snap.core.db.record.StoryModel;
import com.snap.core.db.record.StorySnapModel;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.aioa;
import defpackage.pc;

public interface FriendsFeedModel {
    public static final String CREATEFRIENDSFEEDVIEW = "CREATE VIEW IF NOT EXISTS FriendsFeedView\nAS SELECT\n    Feed._id,\n    coalesce(Feed.specifiedName, Feed.fitScreenParticipantString, Feed.participantString) AS feedDisplayName,\n    participantsSize,\n    Feed.lastInteractionTimestamp,\n    Feed.displayTimestamp,\n    Feed.displayInteractionType,\n    InteractionMessages.snapId AS notViewedSnapId,\n    Feed.lastInteractionUserId,\n    Feed.clearedTimestamp,\n    Feed.kind,\n    Feed.key,\n    Friend._id AS friendRowId,\n    Friend.userId AS friendUserId,\n    Friend.friendmojiCategories,\n    Friend.displayName AS friendDisplayName,\n    Friend.username AS friendUsername,\n    Friend.friendmojiString,\n    Friend.streakLength,\n    Friend.streakExpiration,\n    Friend.bitmojiAvatarId,\n    Friend.bitmojiSelfieId,\n    Friend.birthday,\n    Friend.addedTimestamp,\n    Friend.reverseAddedTimestamp,\n    Friend.isOfficial,\n    COALESCE(((Friend.storyMuted = 1) OR (Feed.groupStoryMuted = 1)), 0) AS storyMuted,\n    Story.storyRowIdNullable AS storyRowId,\n    Story.storyIdNullable AS storyId,\n    StoryFirstUnviewedSnap.snapId AS storyFirstUnviewedSnapId,\n    Story.viewed AS storyViewed,\n    Story.latestTimeStamp AS storyLatestTimestamp,\n    Story.latestExpirationTimestamp AS storyLatestExpirationTimestamp,\n    Story.rankingId AS storyRankingId,\n    COALESCE(FriendStory.username, '') AS friendStoryUsername,\n    FriendStory.isViewed AS friendStoryIsViewed,\n    FriendStory.latestSnapTimestamp AS friendStoryLatestTimestamp,\n    FriendStory.latestSnapExpirationTimestamp AS friendStoryLatestExpirationTimestamp,\n    COALESCE(FriendStory.firstUnviewedSnapId, '') AS friendStoryFirstUnviewedSnapId,\n    lastInteractionUser.displayName AS displayInteractionUserDisplayName,\n    lastInteractionUser.username AS displayInteractionUserUsername,\n    lastWriterUser.username AS lastWriterUsername,\n    FriendsFeedScore.score AS score\nFROM\nFeed\nLEFT OUTER JOIN Friend AS Friend ON Feed.friendRowId = Friend._id\nLEFT OUTER JOIN Friend AS lastInteractionUser ON Feed.lastInteractionUserId = lastInteractionUser._id\nLEFT OUTER JOIN Friend AS lastWriterUser ON Feed.lastInteractionWriterId = lastWriterUser._id\nLEFT OUTER JOIN StoryViewActiveSnaps AS Story ON Feed.storyRowId = Story._id\nLEFT OUTER JOIN StoryViewFriendStoriesActiveSnaps AS FriendStory ON (Feed.kind = 0 AND Friend.username = FriendStory.username)\nLEFT OUTER JOIN (\n    SELECT * FROM (\n        SELECT\n            StorySnap.storyRowId,\n            Snap.snapId\n        FROM StorySnap\n        LEFT OUTER JOIN Snap ON Snap._id = StorySnap.snapRowId\n        WHERE StorySnap.viewed = 0\n        ORDER BY Snap.timestamp DESC\n    ) GROUP BY storyRowId\n)  AS StoryFirstUnviewedSnap ON Feed.storyRowId = StoryFirstUnviewedSnap.storyRowId\nLEFT OUTER JOIN FriendsFeedScore ON Feed._id = FriendsFeedScore.feedRowId\nLEFT OUTER JOIN InteractionMessages\nON (\n    Feed._id = InteractionMessages.feedRowId\n    AND (\n        -- InteractionMessageType.RECEIVED_NOT_VIEWED_SNAP_WITH_SOUND(2),\n        (Feed.displayInteractionType = 'SNAP_RECEIVED_AND_NOT_VIEWED_SOUND' AND InteractionMessages.messageType = 2)\n        OR\n        -- InteractionMessageType.RECEIVED_NOT_VIEWED_SNAP_WITH_NO_SOUND(3),\n        (Feed.displayInteractionType = 'SNAP_RECEIVED_AND_NOT_VIEWED_NO_SOUND' AND InteractionMessages.messageType = 3)\n    )\n)\n\nWHERE Feed.hidden = 0\n      AND (Feed.lastInteractionTimestamp IS NOT NULL AND Feed.clearedTimestamp <= Feed.lastInteractionTimestamp)";
    public static final String DROPFRIENDSFEEDVIEW = "DROP VIEW IF EXISTS FriendsFeedView";
    @Deprecated
    public static final String FRIENDSFEEDVIEW_VIEW_NAME = "FriendsFeedView";

    public interface FriendsFeedViewCreator<T extends FriendsFeedViewModel> {
        T create(long j, String str, long j2, Long l, long j3, String str2, String str3, Long l2, Long l3, FeedKind feedKind, String str4, Long l4, String str5, String str6, String str7, String str8, Long l5, Integer num, Long l6, String str9, String str10, CalendarDate calendarDate, Long l7, Long l8, Boolean bool, long j4, Long l9, String str11, String str12, Boolean bool2, Long l10, Long l11, Long l12, String str13, Long l13, long j5, Long l14, String str14, String str15, String str16, String str17, Float f);
    }

    public interface SelectStoriesForPlayingCreator<T extends SelectStoriesForPlayingModel> {
        T create(long j, Long l, String str, String str2, Boolean bool, String str3, String str4, Long l2);
    }

    public interface SelectFailedOrQueuedFeedItemsCreator<T extends SelectFailedOrQueuedFeedItemsModel> {
        T create(long j, String str, String str2);
    }

    public interface SelectNonFailedFeedItemsCreator<T extends SelectNonFailedFeedItemsModel> {
        T create(long j, String str, String str2);
    }

    public interface FriendsFeedViewModel {
        long _id();

        Long addedTimestamp();

        CalendarDate birthday();

        String bitmojiAvatarId();

        String bitmojiSelfieId();

        Long clearedTimestamp();

        String displayInteractionType();

        String displayInteractionUserDisplayName();

        String displayInteractionUserUsername();

        long displayTimestamp();

        String feedDisplayName();

        String friendDisplayName();

        Long friendRowId();

        String friendStoryFirstUnviewedSnapId();

        Long friendStoryIsViewed();

        Long friendStoryLatestExpirationTimestamp();

        long friendStoryLatestTimestamp();

        String friendStoryUsername();

        String friendUserId();

        String friendUsername();

        String friendmojiCategories();

        Long friendmojiString();

        Boolean isOfficial();

        String key();

        FeedKind kind();

        Long lastInteractionTimestamp();

        Long lastInteractionUserId();

        String lastWriterUsername();

        String notViewedSnapId();

        long participantsSize();

        Long reverseAddedTimestamp();

        Float score();

        String storyFirstUnviewedSnapId();

        String storyId();

        Long storyLatestExpirationTimestamp();

        Long storyLatestTimestamp();

        long storyMuted();

        Long storyRankingId();

        Long storyRowId();

        Boolean storyViewed();

        Long streakExpiration();

        Integer streakLength();
    }

    public static final class FriendsFeedViewMapper<T extends FriendsFeedViewModel, T1 extends FeedModel, T2 extends FriendModel> implements ainw<T> {
        private final FriendsFeedViewCreator<T> creator;
        private final com.snap.core.db.record.FeedModel.Factory<T1> feedModelFactory;
        private final com.snap.core.db.record.FriendModel.Factory<T2> friendModelFactory;

        public FriendsFeedViewMapper(FriendsFeedViewCreator<T> friendsFeedViewCreator, com.snap.core.db.record.FeedModel.Factory<T1> factory, com.snap.core.db.record.FriendModel.Factory<T2> factory2) {
            this.creator = friendsFeedViewCreator;
            this.feedModelFactory = factory;
            this.friendModelFactory = factory2;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Boolean bool2;
            Cursor cursor2 = cursor;
            FriendsFeedViewCreator friendsFeedViewCreator = this.creator;
            long j = cursor2.getLong(0);
            String string = cursor2.isNull(1) ? null : cursor2.getString(1);
            long j2 = cursor2.getLong(2);
            Long valueOf = cursor2.isNull(3) ? null : Long.valueOf(cursor2.getLong(3));
            long j3 = cursor2.getLong(4);
            String string2 = cursor2.isNull(5) ? null : cursor2.getString(5);
            String string3 = cursor2.isNull(6) ? null : cursor2.getString(6);
            Long valueOf2 = cursor2.isNull(7) ? null : Long.valueOf(cursor2.getLong(7));
            Long valueOf3 = cursor2.isNull(8) ? null : Long.valueOf(cursor2.getLong(8));
            FeedKind feedKind = (FeedKind) this.feedModelFactory.kindAdapter.decode(Long.valueOf(cursor2.getLong(9)));
            String string4 = cursor2.getString(10);
            Long valueOf4 = cursor2.isNull(11) ? null : Long.valueOf(cursor2.getLong(11));
            String string5 = cursor2.isNull(12) ? null : cursor2.getString(12);
            String string6 = cursor2.isNull(13) ? null : cursor2.getString(13);
            String string7 = cursor2.isNull(14) ? null : cursor2.getString(14);
            String string8 = cursor2.isNull(15) ? null : cursor2.getString(15);
            Long valueOf5 = cursor2.isNull(16) ? null : Long.valueOf(cursor2.getLong(16));
            Integer valueOf6 = cursor2.isNull(17) ? null : Integer.valueOf(cursor2.getInt(17));
            Long valueOf7 = cursor2.isNull(18) ? null : Long.valueOf(cursor2.getLong(18));
            String string9 = cursor2.isNull(19) ? null : cursor2.getString(19);
            String string10 = cursor2.isNull(20) ? null : cursor2.getString(20);
            CalendarDate calendarDate = cursor2.isNull(21) ? null : (CalendarDate) this.friendModelFactory.birthdayAdapter.decode(Long.valueOf(cursor2.getLong(21)));
            Long valueOf8 = cursor2.isNull(22) ? null : Long.valueOf(cursor2.getLong(22));
            Long valueOf9 = cursor2.isNull(23) ? null : Long.valueOf(cursor2.getLong(23));
            if (cursor2.isNull(24)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(24) == 1);
            }
            long j4 = cursor2.getLong(25);
            Long valueOf10 = cursor2.isNull(26) ? null : Long.valueOf(cursor2.getLong(26));
            String string11 = cursor2.isNull(27) ? null : cursor2.getString(27);
            String string12 = cursor2.isNull(28) ? null : cursor2.getString(28);
            if (cursor2.isNull(29)) {
                bool2 = null;
            } else {
                bool2 = Boolean.valueOf(cursor2.getInt(29) == 1);
            }
            return friendsFeedViewCreator.create(j, string, j2, valueOf, j3, string2, string3, valueOf2, valueOf3, feedKind, string4, valueOf4, string5, string6, string7, string8, valueOf5, valueOf6, valueOf7, string9, string10, calendarDate, valueOf8, valueOf9, bool, j4, valueOf10, string11, string12, bool2, cursor2.isNull(30) ? null : Long.valueOf(cursor2.getLong(30)), cursor2.isNull(31) ? null : Long.valueOf(cursor2.getLong(31)), cursor2.isNull(32) ? null : Long.valueOf(cursor2.getLong(32)), cursor2.getString(33), cursor2.isNull(34) ? null : Long.valueOf(cursor2.getLong(34)), cursor2.getLong(35), cursor2.isNull(36) ? null : Long.valueOf(cursor2.getLong(36)), cursor2.getString(37), cursor2.isNull(38) ? null : cursor2.getString(38), cursor2.isNull(39) ? null : cursor2.getString(39), cursor2.isNull(40) ? null : cursor2.getString(40), cursor2.isNull(41) ? null : Float.valueOf(cursor2.getFloat(41)));
        }
    }

    public static final class SelectStoriesForPlayingMapper<T extends SelectStoriesForPlayingModel> implements ainw<T> {
        private final SelectStoriesForPlayingCreator<T> creator;

        public SelectStoriesForPlayingMapper(SelectStoriesForPlayingCreator<T> selectStoriesForPlayingCreator) {
            this.creator = selectStoriesForPlayingCreator;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            SelectStoriesForPlayingCreator selectStoriesForPlayingCreator = this.creator;
            boolean z = false;
            long j = cursor.getLong(0);
            Long valueOf = cursor.isNull(1) ? null : Long.valueOf(cursor.getLong(1));
            String string = cursor.isNull(2) ? null : cursor.getString(2);
            String string2 = cursor.isNull(3) ? null : cursor.getString(3);
            if (cursor.isNull(4)) {
                bool = null;
            } else {
                if (cursor.getInt(4) == 1) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            }
            return selectStoriesForPlayingCreator.create(j, valueOf, string, string2, bool, cursor.getString(5), cursor.isNull(6) ? null : cursor.getString(6), cursor.isNull(7) ? null : Long.valueOf(cursor.getLong(7)));
        }
    }

    public static final class SelectFailedOrQueuedFeedItemsMapper<T extends SelectFailedOrQueuedFeedItemsModel> implements ainw<T> {
        private final SelectFailedOrQueuedFeedItemsCreator<T> creator;

        public SelectFailedOrQueuedFeedItemsMapper(SelectFailedOrQueuedFeedItemsCreator<T> selectFailedOrQueuedFeedItemsCreator) {
            this.creator = selectFailedOrQueuedFeedItemsCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), cursor.getString(1), cursor.isNull(2) ? null : cursor.getString(2));
        }
    }

    public static final class SelectNonFailedFeedItemsMapper<T extends SelectNonFailedFeedItemsModel> implements ainw<T> {
        private final SelectNonFailedFeedItemsCreator<T> creator;

        public SelectNonFailedFeedItemsMapper(SelectNonFailedFeedItemsCreator<T> selectNonFailedFeedItemsCreator) {
            this.creator = selectNonFailedFeedItemsCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), cursor.getString(1), cursor.isNull(2) ? null : cursor.getString(2));
        }
    }

    public static final class Factory<T1 extends FeedModel, T2 extends FriendModel> {
        com.snap.core.db.record.FeedModel.Factory<T1> feedModelFactory;
        com.snap.core.db.record.FriendModel.Factory<T2> friendModelFactory;

        final class SelectLatestQuery extends ainx {
            private final long arg1;

            SelectLatestQuery(long j) {
                super("SELECT *\nFROM FriendsFeedView\nORDER BY score DESC, _id LIMIT ?1", new aioa(FeedModel.TABLE_NAME, FriendModel.TABLE_NAME, StoryModel.TABLE_NAME, StorySnapModel.TABLE_NAME, SnapModel.TABLE_NAME, MobStoryMetadataModel.TABLE_NAME, FriendsFeedScoreModel.TABLE_NAME, InteractionMessagesModel.TABLE_NAME));
                this.arg1 = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.arg1);
            }
        }

        final class SelectLatestGroupsQuery extends ainx {
            private final long arg1;

            SelectLatestGroupsQuery(long j) {
                super("SELECT *\nFROM FriendsFeedView\nWHERE kind = 1\nORDER BY score DESC, _id LIMIT ?1", new aioa(FeedModel.TABLE_NAME, FriendModel.TABLE_NAME, StoryModel.TABLE_NAME, StorySnapModel.TABLE_NAME, SnapModel.TABLE_NAME, MobStoryMetadataModel.TABLE_NAME, FriendsFeedScoreModel.TABLE_NAME, InteractionMessagesModel.TABLE_NAME));
                this.arg1 = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.arg1);
            }
        }

        final class SelectLatestStoriesOnlyQuery extends ainx {
            private final long arg2;
            private final Long storyLatestExpirationTimestamp;

            SelectLatestStoriesOnlyQuery(Long l, long j) {
                super("SELECT *\nFROM FriendsFeedView\nWHERE storyRowId IS NOT NULL\n    AND storyLatestExpirationTimestamp > ?1\n    AND storyMuted != 1\n-- ordering is:\n-- not viewed, viewed.\n-- within that: lower storyRankingId takes priority, with null storyRankingIds last.\n-- _id to break ties.\nORDER BY storyViewed, (CASE\n            WHEN storyRankingId IS NULL THEN 1\n            ELSE 0\n          END), storyRankingId, _id LIMIT ?2", new aioa(FeedModel.TABLE_NAME, FriendModel.TABLE_NAME, StoryModel.TABLE_NAME, StorySnapModel.TABLE_NAME, SnapModel.TABLE_NAME, MobStoryMetadataModel.TABLE_NAME, FriendsFeedScoreModel.TABLE_NAME, InteractionMessagesModel.TABLE_NAME));
                this.storyLatestExpirationTimestamp = l;
                this.arg2 = j;
            }

            public final void bindTo(pc pcVar) {
                Long l = this.storyLatestExpirationTimestamp;
                if (l != null) {
                    pcVar.bindLong(1, l.longValue());
                } else {
                    pcVar.bindNull(1);
                }
                pcVar.bindLong(2, this.arg2);
            }
        }

        final class SelectStoriesForPlayingQuery extends ainx {
            private final Long curTime;
            private final long feedId;

            SelectStoriesForPlayingQuery(long j, Long l) {
                super("SELECT\n    Feed._id AS feedId,\n\n    -- playable Story record data\n    Story.storyRowIdNullable AS storyRowId,\n    Story.storyIdNullable AS storyId,\n    Story.userName AS storyUsername,\n    Story.viewed AS storyViewed,\n\n    -- playable Friend Story data (playback w/ interweaving)\n    COALESCE(FriendStory.username, '') AS friendStoryUsername,\n    Friend.displayName AS friendStoryDisplayName,\n    FriendStory.isViewed AS friendStoryIsViewed\nFROM Feed\nLEFT OUTER JOIN Friend AS Friend ON Feed.friendRowId = Friend._id\nLEFT OUTER JOIN StoryViewActiveSnaps AS Story ON Feed.storyRowId = Story._id\nLEFT OUTER JOIN StoryViewFriendStoriesActiveSnaps AS FriendStory ON (Feed.kind = 0 AND Friend.username = FriendStory.username)\nLEFT OUTER JOIN FriendsFeedScore ON Feed._id = FriendsFeedScore.feedRowId\nWHERE (\n    -- tapped story should always be included\n    Feed._id = ?1 OR (\n\n        -- for 1:1, include mutual friends or unidirectional friends that have an interaction\n        (Feed.kind != 0 OR\n            (Friend.friendLinkType = 0 OR\n                (Friend.friendLinkType = 1 AND Feed.lastInteractionTimestamp > 0))) AND\n\n        -- include only unmuted stories\n        (COALESCE(((Friend.storyMuted = 1) OR (Feed.groupStoryMuted = 1)), 0) != 1) AND\n\n        -- include only unexpired and unviewed stories\n        ((Story.latestExpirationTimestamp > ?2 AND Story.viewed = 0) OR\n            (FriendStory.latestSnapExpirationTimestamp > ?2 AND FriendStory.isViewed = 0))\n    )\n)\nORDER BY FriendsFeedScore.score DESC", new aioa(FeedModel.TABLE_NAME, FriendModel.TABLE_NAME, StoryModel.TABLE_NAME, StorySnapModel.TABLE_NAME, SnapModel.TABLE_NAME, MobStoryMetadataModel.TABLE_NAME, FriendsFeedScoreModel.TABLE_NAME));
                this.feedId = j;
                this.curTime = l;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.feedId);
                Long l = this.curTime;
                if (l != null) {
                    pcVar.bindLong(2, l.longValue());
                } else {
                    pcVar.bindNull(2);
                }
            }
        }

        public Factory(com.snap.core.db.record.FeedModel.Factory<T1> factory, com.snap.core.db.record.FriendModel.Factory<T2> factory2) {
            this.feedModelFactory = factory;
            this.friendModelFactory = factory2;
        }

        public final ainx getEarliestLastInteractionTimestamp() {
            return new ainx("SELECT FriendsFeedView.lastInteractionTimestamp\nFROM FriendsFeedView\nORDER BY score ASC, _id LIMIT 1", new aioa(FeedModel.TABLE_NAME, FriendModel.TABLE_NAME, StoryModel.TABLE_NAME, StorySnapModel.TABLE_NAME, SnapModel.TABLE_NAME, MobStoryMetadataModel.TABLE_NAME, FriendsFeedScoreModel.TABLE_NAME, InteractionMessagesModel.TABLE_NAME));
        }

        public final ainw<Long> getEarliestLastInteractionTimestampMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return cursor.isNull(0) ? null : Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx selectFailedOrQueuedFeedItems() {
            return new ainx("SELECT\n    _id,\n    key,\n    displayInteractionType\nFROM Feed\nWHERE displayInteractionType IN ('FAILED', 'WAITING_TO_SEND', 'FAILED_NON_RECOVERABLE')", new aioa(FeedModel.TABLE_NAME));
        }

        public final <R extends SelectFailedOrQueuedFeedItemsModel> SelectFailedOrQueuedFeedItemsMapper<R> selectFailedOrQueuedFeedItemsMapper(SelectFailedOrQueuedFeedItemsCreator<R> selectFailedOrQueuedFeedItemsCreator) {
            return new SelectFailedOrQueuedFeedItemsMapper(selectFailedOrQueuedFeedItemsCreator);
        }

        public final ainx selectLatest(long j) {
            return new SelectLatestQuery(j);
        }

        public final ainx selectLatestGroups(long j) {
            return new SelectLatestGroupsQuery(j);
        }

        public final <R extends FriendsFeedViewModel> FriendsFeedViewMapper<R, T1, T2> selectLatestGroupsMapper(FriendsFeedViewCreator<R> friendsFeedViewCreator) {
            return new FriendsFeedViewMapper(friendsFeedViewCreator, this.feedModelFactory, this.friendModelFactory);
        }

        public final <R extends FriendsFeedViewModel> FriendsFeedViewMapper<R, T1, T2> selectLatestMapper(FriendsFeedViewCreator<R> friendsFeedViewCreator) {
            return new FriendsFeedViewMapper(friendsFeedViewCreator, this.feedModelFactory, this.friendModelFactory);
        }

        public final ainx selectLatestStoriesOnly(Long l, long j) {
            return new SelectLatestStoriesOnlyQuery(l, j);
        }

        public final <R extends FriendsFeedViewModel> FriendsFeedViewMapper<R, T1, T2> selectLatestStoriesOnlyMapper(FriendsFeedViewCreator<R> friendsFeedViewCreator) {
            return new FriendsFeedViewMapper(friendsFeedViewCreator, this.feedModelFactory, this.friendModelFactory);
        }

        public final ainx selectNonFailedFeedItems() {
            return new ainx("SELECT\n    _id,\n    key,\n    displayInteractionType\nFROM Feed\nWHERE displayInteractionType NOT IN ('FAILED', 'WAITING_TO_SEND', 'FAILED_NON_RECOVERABLE')", new aioa(FeedModel.TABLE_NAME));
        }

        public final <R extends SelectNonFailedFeedItemsModel> SelectNonFailedFeedItemsMapper<R> selectNonFailedFeedItemsMapper(SelectNonFailedFeedItemsCreator<R> selectNonFailedFeedItemsCreator) {
            return new SelectNonFailedFeedItemsMapper(selectNonFailedFeedItemsCreator);
        }

        public final ainx selectStoriesForPlaying(long j, Long l) {
            return new SelectStoriesForPlayingQuery(j, l);
        }

        public final <R extends SelectStoriesForPlayingModel> SelectStoriesForPlayingMapper<R> selectStoriesForPlayingMapper(SelectStoriesForPlayingCreator<R> selectStoriesForPlayingCreator) {
            return new SelectStoriesForPlayingMapper(selectStoriesForPlayingCreator);
        }
    }

    public interface SelectFailedOrQueuedFeedItemsModel {
        long _id();

        String displayInteractionType();

        String key();
    }

    public interface SelectNonFailedFeedItemsModel {
        long _id();

        String displayInteractionType();

        String key();
    }

    public interface SelectStoriesForPlayingModel {
        long feedId();

        String friendStoryDisplayName();

        Long friendStoryIsViewed();

        String friendStoryUsername();

        String storyId();

        Long storyRowId();

        String storyUsername();

        Boolean storyViewed();
    }
}
