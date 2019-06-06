package com.snap.core.db.query;

import android.database.Cursor;
import com.snap.core.db.column.GroupStoryType;
import com.snap.core.db.record.FeedModel;
import com.snap.core.db.record.FriendModel;
import com.snap.core.db.record.SnapModel;
import com.snap.core.db.record.StoryModel;
import com.snap.core.db.record.StorySnapModel;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainz;
import defpackage.aioa;
import defpackage.pc;

public interface DiscoverFeedModel {
    public static final String CREATEDISCOVERFEEDFRIENDSTORIESVIEW = "CREATE VIEW IF NOT EXISTS DiscoverFeedFriendStoriesView\nAS SELECT\n    Story._id,\n    Story.storyId AS storyId,\n    FirstUnviewedSnap.snapId AS firstUnviewedSnapId,\n    Friend.userId AS friendUserId,\n    Friend.displayName AS friendDisplayName,\n    Story.userName AS friendUsername,\n    Story.displayName AS storyDisplayName,\n    Feed.specifiedName AS feedSpecifiedName,\n    Feed.participantString AS feedParticipantString,\n    Friend.bitmojiAvatarId,\n    Friend.bitmojiSelfieId,\n    COALESCE(Friend.storyMuted, 0) AS storyMuted,\n    groupStoryType,\n    Story.viewed AS storyViewed,\n    latestTimeStamp AS storyLatestTimestamp,\n    latestExpirationTimestamp AS storyLatestExpirationTimestamp,\n    rankingId AS storyRankingId\nFROM\nStoryViewActiveSnaps AS Story\nLEFT OUTER JOIN Friend ON Friend.username = Story.userName\nLEFT OUTER JOIN Feed ON Feed.key = Story.userName\nLEFT OUTER JOIN (\n    SELECT * FROM (\n        SELECT\n            StorySnap.storyRowId,\n            Snap.snapId\n        FROM StorySnap\n        LEFT OUTER JOIN Snap ON Snap._id = StorySnap.snapRowId\n        WHERE StorySnap.viewed = 0\n        ORDER BY Snap.timestamp DESC\n    ) GROUP BY storyRowId\n)  AS FirstUnviewedSnap ON Story._id = FirstUnviewedSnap.storyRowId\nWHERE (rankingId NOT NULL OR groupStoryType NOT NULL)";
    @Deprecated
    public static final String DISCOVERFEEDFRIENDSTORIESVIEW_VIEW_NAME = "DiscoverFeedFriendStoriesView";
    public static final String DROPDISCOVERFEEDFRIENDSTORIESVIEW = "DROP VIEW IF EXISTS DiscoverFeedFriendStoriesView";

    public interface DiscoverFeedFriendStoriesViewCreator<T extends DiscoverFeedFriendStoriesViewModel> {
        T create(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, long j2, GroupStoryType groupStoryType, Boolean bool, Long l, Long l2, Long l3);
    }

    public interface SelectFriendsFromGroupStoryCreator<T extends SelectFriendsFromGroupStoryModel> {
        T create(String str, String str2, String str3);
    }

    public interface SelectFriendStoryForNotificationWithStoryIdsCreator<T extends SelectFriendStoryForNotificationWithStoryIdsModel> {
        T create(long j, String str, String str2, String str3, String str4, String str5, Long l);
    }

    public static final class Factory<T1 extends StoryModel> {
        com.snap.core.db.record.StoryModel.Factory<T1> storyModelFactory;

        final class GetNewFriendStoriesCountQuery extends ainx {
            private final Long storyLatestExpirationTimestamp;
            private final Long storyLatestTimestamp;

            GetNewFriendStoriesCountQuery(Long l, Long l2) {
                super("SELECT COUNT(_id)\nFROM DiscoverFeedFriendStoriesView\nWHERE storyLatestTimestamp > ?1\n    AND storyLatestExpirationTimestamp > ?2\n    AND storyViewed = 0\n    AND COALESCE(storyMuted, 0) != 1", new aioa(StoryModel.TABLE_NAME, StorySnapModel.TABLE_NAME, FriendModel.TABLE_NAME, FeedModel.TABLE_NAME, SnapModel.TABLE_NAME));
                this.storyLatestTimestamp = l;
                this.storyLatestExpirationTimestamp = l2;
            }

            public final void bindTo(pc pcVar) {
                Long l = this.storyLatestTimestamp;
                if (l != null) {
                    pcVar.bindLong(1, l.longValue());
                } else {
                    pcVar.bindNull(1);
                }
                l = this.storyLatestExpirationTimestamp;
                if (l != null) {
                    pcVar.bindLong(2, l.longValue());
                } else {
                    pcVar.bindNull(2);
                }
            }
        }

        final class GetLatestUnviewedFriendStoriesTimestampQuery extends ainx {
            private final Long storyLatestExpirationTimestamp;

            GetLatestUnviewedFriendStoriesTimestampQuery(Long l) {
                super("SELECT COALESCE(MAX(storyLatestTimestamp), 0)\nFROM DiscoverFeedFriendStoriesView\nWHERE storyLatestExpirationTimestamp > ?1\n    AND storyViewed = 0\n    AND COALESCE(storyMuted, 0) != 1", new aioa(StoryModel.TABLE_NAME, StorySnapModel.TABLE_NAME, FriendModel.TABLE_NAME, FeedModel.TABLE_NAME, SnapModel.TABLE_NAME));
                this.storyLatestExpirationTimestamp = l;
            }

            public final void bindTo(pc pcVar) {
                Long l = this.storyLatestExpirationTimestamp;
                if (l != null) {
                    pcVar.bindLong(1, l.longValue());
                } else {
                    pcVar.bindNull(1);
                }
            }
        }

        final class SelectFriendStoryForNotificationWithStoryIdsQuery extends ainx {
            private final String[] userId;

            SelectFriendStoryForNotificationWithStoryIdsQuery(String[] strArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT\n    DiscoverFeedFriendStoriesView._id AS storyRowId,\n    DiscoverFeedFriendStoriesView.storyId AS storyId,\n    Friend.displayName AS friendDisplayName,\n    Friend.userId AS friendUserId,\n    Friend.bitmojiAvatarId,\n    Friend.bitmojiSelfieId,\n    DiscoverFeedFriendStoriesView.storyLatestTimestamp\nFROM DiscoverFeedFriendStoriesView\nLEFT JOIN Friend ON Friend.userId = DiscoverFeedFriendStoriesView.friendUserId\nLEFT JOIN Story ON Story._id = DiscoverFeedFriendStoriesView._id\nWHERE DiscoverFeedFriendStoriesView.storyViewed = 0\nAND Friend.userId IN ");
                stringBuilder.append(ainz.a(strArr.length));
                stringBuilder.append("\nAND Story.kind = 0");
                super(stringBuilder.toString(), new aioa(StoryModel.TABLE_NAME, StorySnapModel.TABLE_NAME, FriendModel.TABLE_NAME, FeedModel.TABLE_NAME, SnapModel.TABLE_NAME));
                this.userId = strArr;
            }

            public final void bindTo(pc pcVar) {
                String[] strArr = this.userId;
                int i = 1;
                if (strArr != null) {
                    int length = strArr.length;
                    int i2 = 0;
                    while (i2 < length) {
                        int i3 = i + 1;
                        pcVar.bindString(i, strArr[i2]);
                        i2++;
                        i = i3;
                    }
                    return;
                }
                pcVar.bindNull(1);
            }
        }

        final class SelectFriendsFromGroupStoryQuery extends ainx {
            private final long storyRowId;

            SelectFriendsFromGroupStoryQuery(long j) {
                super("SELECT\n    StorySnap.username,\n    Friend.bitmojiAvatarId,\n    Friend.bitmojiSelfieId\nFROM\nStorySnap\nLEFT OUTER JOIN Friend ON Friend.username = StorySnap.username\nWHERE storyRowId = ?1 AND Friend.bitmojiAvatarId IS NOT NULL\nGROUP BY StorySnap.username\nORDER BY StorySnap.expirationTimestamp DESC LIMIT 3", new aioa(StorySnapModel.TABLE_NAME, FriendModel.TABLE_NAME));
                this.storyRowId = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.storyRowId);
            }
        }

        final class SelectLatestFriendStoriesForDiscoverFeedQuery extends ainx {
            private final Long currentTimestamp;
            private final String currentUsername;
            private final GroupStoryType[] groupStoryTypes;
            private final com.snap.core.db.record.StoryModel.Factory<? extends StoryModel> storyModelFactory;

            SelectLatestFriendStoriesForDiscoverFeedQuery(com.snap.core.db.record.StoryModel.Factory<? extends StoryModel> factory, Long l, String str, GroupStoryType[] groupStoryTypeArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT *\nFROM DiscoverFeedFriendStoriesView\nWHERE storyLatestExpirationTimestamp > ?1\n      AND COALESCE(storyMuted, 0) != 1\n      AND (groupStoryType IS NULL\n          OR ((groupStoryType != 1 OR friendUsername != ?2) AND groupStoryType IN ");
                stringBuilder.append(ainz.a(groupStoryTypeArr.length));
                stringBuilder.append("))\n-- ordering is:\n-- not viewed, viewed.\n-- within that: lower storyRankingId takes priority, with null storyRankingIds last.\n-- _id to break ties.\n-- TODO - Remove this ranking and do custom ranking \nORDER BY storyViewed, (CASE\n            WHEN storyRankingId IS NULL THEN 1\n            ELSE 0\n          END), storyRankingId, _id");
                super(stringBuilder.toString(), new aioa(StoryModel.TABLE_NAME, StorySnapModel.TABLE_NAME, FriendModel.TABLE_NAME, FeedModel.TABLE_NAME, SnapModel.TABLE_NAME));
                this.storyModelFactory = factory;
                this.currentTimestamp = l;
                this.currentUsername = str;
                this.groupStoryTypes = groupStoryTypeArr;
            }

            public final void bindTo(pc pcVar) {
                Long l = this.currentTimestamp;
                if (l != null) {
                    pcVar.bindLong(1, l.longValue());
                } else {
                    pcVar.bindNull(1);
                }
                String str = this.currentUsername;
                if (str != null) {
                    pcVar.bindString(2, str);
                } else {
                    pcVar.bindNull(2);
                }
                GroupStoryType[] groupStoryTypeArr = this.groupStoryTypes;
                int i = 3;
                if (groupStoryTypeArr != null) {
                    int length = groupStoryTypeArr.length;
                    int i2 = 0;
                    while (i2 < length) {
                        int i3 = i + 1;
                        pcVar.bindLong(i, ((Long) this.storyModelFactory.groupStoryTypeAdapter.encode(groupStoryTypeArr[i2])).longValue());
                        i2++;
                        i = i3;
                    }
                    return;
                }
                pcVar.bindNull(3);
            }
        }

        public Factory(com.snap.core.db.record.StoryModel.Factory<T1> factory) {
            this.storyModelFactory = factory;
        }

        public final ainx getLatestUnviewedFriendStoriesTimestamp(Long l) {
            return new GetLatestUnviewedFriendStoriesTimestampQuery(l);
        }

        public final ainw<Long> getLatestUnviewedFriendStoriesTimestampMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx getNewFriendStoriesCount(Long l, Long l2) {
            return new GetNewFriendStoriesCountQuery(l, l2);
        }

        public final ainw<Long> getNewFriendStoriesCountMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx selectFriendStoryForNotificationWithStoryIds(String[] strArr) {
            return new SelectFriendStoryForNotificationWithStoryIdsQuery(strArr);
        }

        public final <R extends SelectFriendStoryForNotificationWithStoryIdsModel> SelectFriendStoryForNotificationWithStoryIdsMapper<R> selectFriendStoryForNotificationWithStoryIdsMapper(SelectFriendStoryForNotificationWithStoryIdsCreator<R> selectFriendStoryForNotificationWithStoryIdsCreator) {
            return new SelectFriendStoryForNotificationWithStoryIdsMapper(selectFriendStoryForNotificationWithStoryIdsCreator);
        }

        public final ainx selectFriendsFromGroupStory(long j) {
            return new SelectFriendsFromGroupStoryQuery(j);
        }

        public final <R extends SelectFriendsFromGroupStoryModel> SelectFriendsFromGroupStoryMapper<R> selectFriendsFromGroupStoryMapper(SelectFriendsFromGroupStoryCreator<R> selectFriendsFromGroupStoryCreator) {
            return new SelectFriendsFromGroupStoryMapper(selectFriendsFromGroupStoryCreator);
        }

        public final ainx selectLatestFriendStoriesForDiscoverFeed(com.snap.core.db.record.StoryModel.Factory<? extends StoryModel> factory, Long l, String str, GroupStoryType[] groupStoryTypeArr) {
            return new SelectLatestFriendStoriesForDiscoverFeedQuery(factory, l, str, groupStoryTypeArr);
        }

        public final <R extends DiscoverFeedFriendStoriesViewModel> DiscoverFeedFriendStoriesViewMapper<R, T1> selectLatestFriendStoriesForDiscoverFeedMapper(DiscoverFeedFriendStoriesViewCreator<R> discoverFeedFriendStoriesViewCreator) {
            return new DiscoverFeedFriendStoriesViewMapper(discoverFeedFriendStoriesViewCreator, this.storyModelFactory);
        }
    }

    public static final class DiscoverFeedFriendStoriesViewMapper<T extends DiscoverFeedFriendStoriesViewModel, T1 extends StoryModel> implements ainw<T> {
        private final DiscoverFeedFriendStoriesViewCreator<T> creator;
        private final com.snap.core.db.record.StoryModel.Factory<T1> storyModelFactory;

        public DiscoverFeedFriendStoriesViewMapper(DiscoverFeedFriendStoriesViewCreator<T> discoverFeedFriendStoriesViewCreator, com.snap.core.db.record.StoryModel.Factory<T1> factory) {
            this.creator = discoverFeedFriendStoriesViewCreator;
            this.storyModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Cursor cursor2 = cursor;
            DiscoverFeedFriendStoriesViewCreator discoverFeedFriendStoriesViewCreator = this.creator;
            long j = cursor2.getLong(0);
            String string = cursor2.getString(1);
            String string2 = cursor2.isNull(2) ? null : cursor2.getString(2);
            String string3 = cursor2.isNull(3) ? null : cursor2.getString(3);
            String string4 = cursor2.isNull(4) ? null : cursor2.getString(4);
            String string5 = cursor2.isNull(5) ? null : cursor2.getString(5);
            String string6 = cursor2.isNull(6) ? null : cursor2.getString(6);
            String string7 = cursor2.isNull(7) ? null : cursor2.getString(7);
            String string8 = cursor2.isNull(8) ? null : cursor2.getString(8);
            String string9 = cursor2.isNull(9) ? null : cursor2.getString(9);
            String string10 = cursor2.isNull(10) ? null : cursor2.getString(10);
            long j2 = cursor2.getLong(11);
            GroupStoryType groupStoryType = cursor2.isNull(12) ? null : (GroupStoryType) this.storyModelFactory.groupStoryTypeAdapter.decode(Long.valueOf(cursor2.getLong(12)));
            if (cursor2.isNull(13)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(13) == 1);
            }
            return discoverFeedFriendStoriesViewCreator.create(j, string, string2, string3, string4, string5, string6, string7, string8, string9, string10, j2, groupStoryType, bool, cursor2.isNull(14) ? null : Long.valueOf(cursor2.getLong(14)), cursor2.isNull(15) ? null : Long.valueOf(cursor2.getLong(15)), cursor2.isNull(16) ? null : Long.valueOf(cursor2.getLong(16)));
        }
    }

    public static final class SelectFriendsFromGroupStoryMapper<T extends SelectFriendsFromGroupStoryModel> implements ainw<T> {
        private final SelectFriendsFromGroupStoryCreator<T> creator;

        public SelectFriendsFromGroupStoryMapper(SelectFriendsFromGroupStoryCreator<T> selectFriendsFromGroupStoryCreator) {
            this.creator = selectFriendsFromGroupStoryCreator;
        }

        public final T map(Cursor cursor) {
            SelectFriendsFromGroupStoryCreator selectFriendsFromGroupStoryCreator = this.creator;
            String str = null;
            String string = cursor.isNull(0) ? null : cursor.getString(0);
            String string2 = cursor.isNull(1) ? null : cursor.getString(1);
            if (!cursor.isNull(2)) {
                str = cursor.getString(2);
            }
            return selectFriendsFromGroupStoryCreator.create(string, string2, str);
        }
    }

    public static final class SelectFriendStoryForNotificationWithStoryIdsMapper<T extends SelectFriendStoryForNotificationWithStoryIdsModel> implements ainw<T> {
        private final SelectFriendStoryForNotificationWithStoryIdsCreator<T> creator;

        public SelectFriendStoryForNotificationWithStoryIdsMapper(SelectFriendStoryForNotificationWithStoryIdsCreator<T> selectFriendStoryForNotificationWithStoryIdsCreator) {
            this.creator = selectFriendStoryForNotificationWithStoryIdsCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), cursor.getString(1), cursor.isNull(2) ? null : cursor.getString(2), cursor.isNull(3) ? null : cursor.getString(3), cursor.isNull(4) ? null : cursor.getString(4), cursor.isNull(5) ? null : cursor.getString(5), cursor.isNull(6) ? null : Long.valueOf(cursor.getLong(6)));
        }
    }

    public interface DiscoverFeedFriendStoriesViewModel {
        long _id();

        String bitmojiAvatarId();

        String bitmojiSelfieId();

        String feedParticipantString();

        String feedSpecifiedName();

        String firstUnviewedSnapId();

        String friendDisplayName();

        String friendUserId();

        String friendUsername();

        GroupStoryType groupStoryType();

        String storyDisplayName();

        String storyId();

        Long storyLatestExpirationTimestamp();

        Long storyLatestTimestamp();

        long storyMuted();

        Long storyRankingId();

        Boolean storyViewed();
    }

    public interface SelectFriendStoryForNotificationWithStoryIdsModel {
        String bitmojiAvatarId();

        String bitmojiSelfieId();

        String friendDisplayName();

        String friendUserId();

        String storyId();

        Long storyLatestTimestamp();

        long storyRowId();
    }

    public interface SelectFriendsFromGroupStoryModel {
        String bitmojiAvatarId();

        String bitmojiSelfieId();

        String username();
    }
}
