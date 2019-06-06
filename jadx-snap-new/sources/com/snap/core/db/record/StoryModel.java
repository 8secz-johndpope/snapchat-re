package com.snap.core.db.record;

import android.database.Cursor;
import com.snap.core.db.column.FeedKind;
import com.snap.core.db.column.Friendmojis;
import com.snap.core.db.column.GroupStoryType;
import com.snap.core.db.column.StoryKind;
import defpackage.agec;
import defpackage.ainu;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.ainz;
import defpackage.aioa;
import defpackage.pa;
import defpackage.pc;

public interface StoryModel {
    public static final String CREATESTORYVIEWACTIVESNAPS = "CREATE VIEW IF NOT EXISTS StoryViewActiveSnaps AS\nSELECT\n    *,\n    -- there is a bug in SQLDelight that does not generate the correct nullable type when left joining Views\n    -- adding these fields as helpers to be used for these cases until the bug can be addressed\n    CASE WHEN Story._id IS NULL THEN NULL ELSE Story._id END AS storyRowIdNullable,\n    CAST (CASE WHEN Story.storyId IS NULL THEN NULL ELSE Story.storyId END AS TEXT) AS storyIdNullable\nFROM Story\nWHERE Story._id IN (SELECT DISTINCT StorySnap.storyRowId FROM StorySnap)";
    public static final String CREATESTORYVIEWFRIENDSTORIESACTIVESNAPS = "CREATE VIEW IF NOT EXISTS StoryViewFriendStoriesActiveSnaps AS\nSELECT\n    FriendStories.username AS username,\n    FriendStories.isViewed AS isViewed,\n    FriendStories.latestSnapTimestamp AS latestSnapTimestamp,\n    FriendStories.latestSnapExpirationTimestamp AS latestSnapExpirationTimestamp,\n    COALESCE(FirstUnviewedSnap.snapId, '') AS firstUnviewedSnapId\nFROM (\n    SELECT\n        StoryViewPlayableFriendStoriesMapping.username AS username,\n        MAX(Snap.timestamp) AS latestSnapTimestamp,\n        MAX(StorySnap.expirationTimestamp) AS latestSnapExpirationTimestamp,\n        MIN(StorySnap.viewed) AS isViewed\n    FROM StorySnap\n    JOIN Snap ON StorySnap.snapRowId = Snap._id\n    JOIN StoryViewPlayableFriendStoriesMapping ON StorySnap.storyRowId = StoryViewPlayableFriendStoriesMapping.storyRowId\n    GROUP BY StoryViewPlayableFriendStoriesMapping.username\n) AS FriendStories\nLEFT OUTER JOIN (\n    SELECT * FROM (\n        SELECT StoryViewPlayableFriendStoriesMapping.username AS username, Snap.snapId\n        FROM StorySnap\n        JOIN Snap ON StorySnap.snapRowId = Snap._id\n        JOIN StoryViewPlayableFriendStoriesMapping ON StorySnap.storyRowId = StoryViewPlayableFriendStoriesMapping.storyRowId\n        WHERE StorySnap.viewed = 0\n        ORDER BY Snap.timestamp DESC\n    ) GROUP BY username\n) AS FirstUnviewedSnap ON (FriendStories.isViewed = 0 AND FirstUnviewedSnap.username = FriendStories.username)";
    public static final String CREATESTORYVIEWPLAYABLEFRIENDSTORIESMAPPING = "CREATE VIEW IF NOT EXISTS StoryViewPlayableFriendStoriesMapping AS\nSELECT\n    -- For Friend Stories, there is no linked MobStoryMetadata and Story.storyId resolves to username and\n    -- For Private Stories, Story.storyId is mobStoryId so instead MobStoryMetadata.creatorUsername resolves to username\n    COALESCE(MobStoryMetadata.creatorUsername, Story.storyId) AS username,\n    Story._id AS storyRowId\nFROM Story\nLEFT OUTER JOIN MobStoryMetadata ON Story._id = MobStoryMetadata.storyRowId\nWHERE (\n    -- Include Friend Stories\n    Story.kind = 0 OR\n    -- Include Private Stories\n    (Story.kind = 1 AND MobStoryMetadata.storyType = 1)\n)";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS Story (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, -- also used as a value for Feed.storyRowId\n    storyId TEXT NOT NULL,\n    userName TEXT,\n    displayName TEXT,\n    isLocal INTEGER,\n    profileDescription TEXT,\n    sharedId TEXT,\n    latestTimeStamp INTEGER, -- Creation timestamp of the newest snap in the story.\n    latestExpirationTimestamp INTEGER, -- Expiration timestamp of the newest snap in the story.\n    viewed INTEGER, -- true if all snaps in the story have been viewed\n    kind INTEGER NOT NULL,\n    groupStoryType INTEGER,\n    isPostable INTEGER,\n    rankingId INTEGER, -- Ranking number returned from server for priority of this story. Lower is higher priority.\n\n    UNIQUE(storyId, kind)\n)";
    @Deprecated
    public static final String DISPLAYNAME = "displayName";
    @Deprecated
    public static final String GROUPSTORYTYPE = "groupStoryType";
    @Deprecated
    public static final String ISLOCAL = "isLocal";
    @Deprecated
    public static final String ISPOSTABLE = "isPostable";
    @Deprecated
    public static final String KIND = "kind";
    @Deprecated
    public static final String LATESTEXPIRATIONTIMESTAMP = "latestExpirationTimestamp";
    @Deprecated
    public static final String LATESTTIMESTAMP = "latestTimeStamp";
    @Deprecated
    public static final String PROFILEDESCRIPTION = "profileDescription";
    @Deprecated
    public static final String RANKINGID = "rankingId";
    @Deprecated
    public static final String SHAREDID = "sharedId";
    @Deprecated
    public static final String STORYID = "storyId";
    @Deprecated
    public static final String STORYVIEWACTIVESNAPS_VIEW_NAME = "StoryViewActiveSnaps";
    @Deprecated
    public static final String STORYVIEWFRIENDSTORIESACTIVESNAPS_VIEW_NAME = "StoryViewFriendStoriesActiveSnaps";
    @Deprecated
    public static final String STORYVIEWPLAYABLEFRIENDSTORIESMAPPING_VIEW_NAME = "StoryViewPlayableFriendStoriesMapping";
    @Deprecated
    public static final String TABLE_NAME = "Story";
    @Deprecated
    public static final String USERNAME = "userName";
    @Deprecated
    public static final String VIEWED = "viewed";
    @Deprecated
    public static final String _ID = "_id";

    public static final class UpdateStory extends ainy {
        private final Factory<? extends StoryModel> storyModelFactory;

        public UpdateStory(pa paVar, Factory<? extends StoryModel> factory) {
            super(StoryModel.TABLE_NAME, paVar.a("UPDATE Story\nSET userName=?,\n    displayName=?,\n    isLocal=?,\n    profileDescription=?,\n    sharedId=?,\n    groupStoryType=?\nWHERE storyId=? AND kind=?"));
            this.storyModelFactory = factory;
        }

        public final void bind(String str, String str2, Boolean bool, String str3, String str4, GroupStoryType groupStoryType, String str5, StoryKind storyKind) {
            if (str == null) {
                bindNull(1);
            } else {
                bindString(1, str);
            }
            if (str2 == null) {
                bindNull(2);
            } else {
                bindString(2, str2);
            }
            if (bool == null) {
                bindNull(3);
            } else {
                bindLong(3, bool.booleanValue() ? 1 : 0);
            }
            if (str3 == null) {
                bindNull(4);
            } else {
                bindString(4, str3);
            }
            if (str4 == null) {
                bindNull(5);
            } else {
                bindString(5, str4);
            }
            if (groupStoryType == null) {
                bindNull(6);
            } else {
                bindLong(6, ((Long) this.storyModelFactory.groupStoryTypeAdapter.encode(groupStoryType)).longValue());
            }
            bindString(7, str5);
            bindLong(8, ((Long) this.storyModelFactory.kindAdapter.encode(storyKind)).longValue());
        }
    }

    public static final class Factory<T extends StoryModel> {
        public final Creator<T> creator;
        public final ainu<GroupStoryType, Long> groupStoryTypeAdapter;
        public final ainu<StoryKind, Long> kindAdapter;

        final class GetStoryRowIdByStoryKeyQuery extends ainx {
            private final StoryKind kind;
            private final String storyId;

            GetStoryRowIdByStoryKeyQuery(String str, StoryKind storyKind) {
                super("SELECT _id FROM Story\nWHERE storyId=?1 AND kind=?2", new aioa(StoryModel.TABLE_NAME));
                this.storyId = str;
                this.kind = storyKind;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.storyId);
                pcVar.bindLong(2, ((Long) Factory.this.kindAdapter.encode(this.kind)).longValue());
            }
        }

        final class RemoveGroupStoryPostabilityExceptQuery extends ainx {
            private final GroupStoryType[] groupStoryType;
            private final String[] storyId;

            RemoveGroupStoryPostabilityExceptQuery(String[] strArr, GroupStoryType[] groupStoryTypeArr) {
                StringBuilder stringBuilder = new StringBuilder("UPDATE Story\nSET isPostable = 0\nWHERE storyId NOT IN ");
                stringBuilder.append(ainz.a(strArr.length));
                stringBuilder.append(" AND kind = 1 AND (groupStoryType IS NULL OR groupStoryType IN ");
                stringBuilder.append(ainz.a(groupStoryTypeArr.length));
                stringBuilder.append(")");
                super(stringBuilder.toString(), new aioa(StoryModel.TABLE_NAME));
                this.storyId = strArr;
                this.groupStoryType = groupStoryTypeArr;
            }

            public final void bindTo(pc pcVar) {
                String[] strArr = this.storyId;
                int length = strArr.length;
                int i = 0;
                int i2 = 0;
                int i3 = 1;
                while (i2 < length) {
                    int i4 = i3 + 1;
                    pcVar.bindString(i3, strArr[i2]);
                    i2++;
                    i3 = i4;
                }
                GroupStoryType[] groupStoryTypeArr = this.groupStoryType;
                if (groupStoryTypeArr != null) {
                    length = groupStoryTypeArr.length;
                    while (i < length) {
                        int i5 = i3 + 1;
                        pcVar.bindLong(i3, ((Long) Factory.this.groupStoryTypeAdapter.encode(groupStoryTypeArr[i])).longValue());
                        i++;
                        i3 = i5;
                    }
                    return;
                }
                pcVar.bindNull(i3);
            }
        }

        final class GetPostableStoryKeyForStoryKindQuery extends ainx {
            private final StoryKind kind;

            GetPostableStoryKeyForStoryKindQuery(StoryKind storyKind) {
                super("SELECT storyId\nFROM Story\nWHERE isPostable = 1 AND kind = ?1", new aioa(StoryModel.TABLE_NAME));
                this.kind = storyKind;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, ((Long) Factory.this.kindAdapter.encode(this.kind)).longValue());
            }
        }

        final class IsPostableStoryQuery extends ainx {
            private final StoryKind kind;
            private final String storyId;

            IsPostableStoryQuery(String str, StoryKind storyKind) {
                super("SELECT COUNT(1)\nFROM Story\nWHERE Story.storyId = ?1 AND Story.kind = ?2 AND Story.isPostable = 1", new aioa(StoryModel.TABLE_NAME));
                this.storyId = str;
                this.kind = storyKind;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.storyId);
                pcVar.bindLong(2, ((Long) Factory.this.kindAdapter.encode(this.kind)).longValue());
            }
        }

        final class SelectAllFriendStoriesQuery extends ainx {
            private final Boolean viewed;

            SelectAllFriendStoriesQuery(Boolean bool) {
                super("SELECT Story._id,\n Story.storyId,\n coalesce(Friend.displayName, Story.displayName) AS displayName,\n Story.latestTimeStamp,\n Story.viewed,\n StorySnap._id AS story_id,\n StorySnap.username,\n StorySnap.clientId,\n StorySnap.viewed,\n Snap.durationInMs,\n max(Snap.timestamp) AS storyTimeStamp,\n Friend.friendmojis AS emoji\nFROM\nStory\nJOIN Snap ON Snap.snapId = Story.storyId\nINNER JOIN StorySnap ON StorySnap.storyRowId = Story._id\nLEFT OUTER JOIN Friend ON Friend.username = Story.storyId\nWHERE Story.viewed = ?1\nGROUP BY Story.storyId\nORDER BY Story.latestTimeStamp DESC", new aioa(StoryModel.TABLE_NAME, SnapModel.TABLE_NAME, StorySnapModel.TABLE_NAME, FriendModel.TABLE_NAME));
                this.viewed = bool;
            }

            public final void bindTo(pc pcVar) {
                Boolean bool = this.viewed;
                if (bool != null) {
                    pcVar.bindLong(1, bool.booleanValue() ? 1 : 0);
                } else {
                    pcVar.bindNull(1);
                }
            }
        }

        final class SelectByStoryKeyQuery extends ainx {
            private final StoryKind kind;
            private final String storyId;

            SelectByStoryKeyQuery(String str, StoryKind storyKind) {
                super("SELECT *\nFROM Story\nWHERE storyId =?1 AND kind = ?2", new aioa(StoryModel.TABLE_NAME));
                this.storyId = str;
                this.kind = storyKind;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.storyId);
                pcVar.bindLong(2, ((Long) Factory.this.kindAdapter.encode(this.kind)).longValue());
            }
        }

        final class SelectByStoryRowIdQuery extends ainx {
            private final long _id;

            SelectByStoryRowIdQuery(long j) {
                super("SELECT *\nFROM Story\nWHERE _id = ?1", new aioa(StoryModel.TABLE_NAME));
                this._id = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this._id);
            }
        }

        final class SelectPlayableStoryQuery extends ainx {
            private final long _id;

            SelectPlayableStoryQuery(long j) {
                super("SELECT Story._id,\n  Story.storyId,\n  Story.userName AS username,\n  Story.kind,\n  Story.groupStoryType,\n  coalesce(Story.displayName, Friend.displayName) AS displayName,\n  Friend.friendmojis AS emoji,\n  Feed._id AS feedId,\n  Feed.key AS feedKey,\n  Feed.kind AS feedKind,\n  MobStoryMetadata.typeExtraData AS groupStoryTypeExtraData\nFROM\nStory\nLEFT OUTER JOIN Friend ON Friend.username = Story.userName\nLEFT OUTER JOIN Feed ON (\n    Feed.friendRowId = Friend._id -- for friend and private stories\n    OR Feed.storyRowId = Story._id -- for group chat stories\n)\nLEFT OUTER JOIN MobStoryMetadata ON MobStoryMetadata.storyRowId = Story._id\nWHERE Story._id = ?1", new aioa(StoryModel.TABLE_NAME, FriendModel.TABLE_NAME, FeedModel.TABLE_NAME, MobStoryMetadataModel.TABLE_NAME));
                this._id = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this._id);
            }
        }

        final class SelectUserManagedStoriesQuery extends ainx {
            private final String username;

            SelectUserManagedStoriesQuery(String str) {
                super("SELECT Story._id, Story.kind\nFROM Story\n-- TODO(apatel) remove this dep on PostableStory when we have a better data model for resolving timestamps\nLEFT OUTER JOIN StorySnap ON StorySnap.storyRowId = Story._id\nLEFT OUTER JOIN PostableStory ON (PostableStory.storyRowId = Story._id)\nWHERE\n  Story.kind = 2 -- my story\n  OR StorySnap.username = ?1 -- posted by user\n  OR Story.kind = 1 AND Story.userName = ?1 -- group story creator\nGROUP BY Story._id, Story.kind\nHAVING COUNT(1) > 0\nORDER BY\n  -- primary sort by story kind\n  -- TODO: might want to datafy this\n  CASE Story.kind\n       WHEN 2 THEN 1 -- My Story\n       WHEN 3 THEN 2 -- My Story Overridden Privacy\n       WHEN 5 THEN 3 -- Our Story\n       WHEN 1 THEN 4 -- Group Story\n       ELSE        5 -- All other kinds\n   END ASC,\n   -- secondary sort by timestamp\n   MAX(ifnull(Story.latestTimeStamp, 0),\n       ifnull(PostableStory.creationTimestamp, 0),\n       ifnull(PostableStory.lastActionTimestamp, 0)) DESC", new aioa(StoryModel.TABLE_NAME, StorySnapModel.TABLE_NAME, "PostableStory"));
                this.username = str;
            }

            public final void bindTo(pc pcVar) {
                String str = this.username;
                if (str != null) {
                    pcVar.bindString(1, str);
                } else {
                    pcVar.bindNull(1);
                }
            }
        }

        public Factory(Creator<T> creator, ainu<StoryKind, Long> ainu, ainu<GroupStoryType, Long> ainu2) {
            this.creator = creator;
            this.kindAdapter = ainu;
            this.groupStoryTypeAdapter = ainu2;
        }

        public final ainx getPostableStoryKeyForStoryKind(StoryKind storyKind) {
            return new GetPostableStoryKeyForStoryKindQuery(storyKind);
        }

        public final ainw<String> getPostableStoryKeyForStoryKindMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.getString(0);
                }
            };
        }

        public final ainx getStoryRowIdByStoryKey(String str, StoryKind storyKind) {
            return new GetStoryRowIdByStoryKeyQuery(str, storyKind);
        }

        public final ainw<Long> getStoryRowIdByStoryKeyMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx isPostableStory(String str, StoryKind storyKind) {
            return new IsPostableStoryQuery(str, storyKind);
        }

        public final ainw<Long> isPostableStoryMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx removeGroupStoryPostabilityExcept(String[] strArr, GroupStoryType[] groupStoryTypeArr) {
            return new RemoveGroupStoryPostabilityExceptQuery(strArr, groupStoryTypeArr);
        }

        public final ainx selectAllFriendStories(Boolean bool) {
            return new SelectAllFriendStoriesQuery(bool);
        }

        public final <R extends SelectAllFriendStoriesModel, T1 extends FriendModel> SelectAllFriendStoriesMapper<R, T1> selectAllFriendStoriesMapper(SelectAllFriendStoriesCreator<R> selectAllFriendStoriesCreator, com.snap.core.db.record.FriendModel.Factory<T1> factory) {
            return new SelectAllFriendStoriesMapper(selectAllFriendStoriesCreator, factory);
        }

        public final ainx selectAllGroupStoryIds() {
            return new ainx("SELECT Story.storyId AS groupId\nFROM\nStory\nWHERE Story.kind = 1", new aioa(StoryModel.TABLE_NAME));
        }

        public final ainw<String> selectAllGroupStoryIdsMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.getString(0);
                }
            };
        }

        public final ainx selectByStoryKey(String str, StoryKind storyKind) {
            return new SelectByStoryKeyQuery(str, storyKind);
        }

        public final Mapper<T> selectByStoryKeyMapper() {
            return new Mapper(this);
        }

        public final ainx selectByStoryRowId(long j) {
            return new SelectByStoryRowIdQuery(j);
        }

        public final Mapper<T> selectByStoryRowIdMapper() {
            return new Mapper(this);
        }

        public final ainx selectPlayableStory(long j) {
            return new SelectPlayableStoryQuery(j);
        }

        public final <R extends SelectPlayableStoryModel, T2 extends FriendModel, T3 extends FeedModel, T4 extends MobStoryMetadataModel> SelectPlayableStoryMapper<R, T, T2, T3, T4> selectPlayableStoryMapper(SelectPlayableStoryCreator<R> selectPlayableStoryCreator, com.snap.core.db.record.FriendModel.Factory<T2> factory, com.snap.core.db.record.FeedModel.Factory<T3> factory2, com.snap.core.db.record.MobStoryMetadataModel.Factory<T4> factory3) {
            return new SelectPlayableStoryMapper(selectPlayableStoryCreator, this, factory, factory2, factory3);
        }

        public final ainx selectUserManagedStories(String str) {
            return new SelectUserManagedStoriesQuery(str);
        }

        public final <R extends SelectUserManagedStoriesModel> SelectUserManagedStoriesMapper<R, T> selectUserManagedStoriesMapper(SelectUserManagedStoriesCreator<R> selectUserManagedStoriesCreator) {
            return new SelectUserManagedStoriesMapper(selectUserManagedStoriesCreator, this);
        }
    }

    public interface Creator<T extends StoryModel> {
        T create(long j, String str, String str2, String str3, Boolean bool, String str4, String str5, Long l, Long l2, Boolean bool2, StoryKind storyKind, GroupStoryType groupStoryType, Boolean bool3, Long l3);
    }

    public static final class UpdateStoryPostability extends ainy {
        private final Factory<? extends StoryModel> storyModelFactory;

        public UpdateStoryPostability(pa paVar, Factory<? extends StoryModel> factory) {
            super(StoryModel.TABLE_NAME, paVar.a("UPDATE Story\nSET isPostable = ?\nWHERE storyId = ? AND kind = ?"));
            this.storyModelFactory = factory;
        }

        public final void bind(Boolean bool, String str, StoryKind storyKind) {
            if (bool == null) {
                bindNull(1);
            } else {
                bindLong(1, bool.booleanValue() ? 1 : 0);
            }
            bindString(2, str);
            bindLong(3, ((Long) this.storyModelFactory.kindAdapter.encode(storyKind)).longValue());
        }
    }

    public static final class UpdateStoryRanking extends ainy {
        public UpdateStoryRanking(pa paVar) {
            super(StoryModel.TABLE_NAME, paVar.a("UPDATE Story\nSET rankingId = ?\nWHERE storyId = ?"));
        }

        public final void bind(Long l, String str) {
            if (l == null) {
                bindNull(1);
            } else {
                bindLong(1, l.longValue());
            }
            bindString(2, str);
        }
    }

    public interface SelectAllFriendStoriesCreator<T extends SelectAllFriendStoriesModel> {
        T create(long j, String str, String str2, Long l, Boolean bool, long j2, String str3, String str4, Boolean bool2, long j3, long j4, Friendmojis friendmojis);
    }

    public interface SelectAllFriendStoriesModel {
        Boolean StorySnap_viewed();

        long _id();

        String clientId();

        String displayName();

        long durationInMs();

        Friendmojis emoji();

        Long latestTimeStamp();

        String storyId();

        long storyTimeStamp();

        long story_id();

        String username();

        Boolean viewed();
    }

    public interface SelectPlayableStoryCreator<T extends SelectPlayableStoryModel> {
        T create(long j, String str, String str2, StoryKind storyKind, GroupStoryType groupStoryType, String str3, Friendmojis friendmojis, Long l, String str4, FeedKind feedKind, agec agec);
    }

    public interface SelectPlayableStoryModel {
        long _id();

        String displayName();

        Friendmojis emoji();

        Long feedId();

        String feedKey();

        FeedKind feedKind();

        GroupStoryType groupStoryType();

        agec groupStoryTypeExtraData();

        StoryKind kind();

        String storyId();

        String username();
    }

    public interface SelectUserManagedStoriesCreator<T extends SelectUserManagedStoriesModel> {
        T create(long j, StoryKind storyKind);
    }

    public interface SelectUserManagedStoriesModel {
        long _id();

        StoryKind kind();
    }

    public interface StoryViewActiveSnapsCreator<T1 extends StoryModel, T extends StoryViewActiveSnapsModel<T1>> {
        T create(T1 t1, Long l, String str);
    }

    public interface StoryViewActiveSnapsModel<T1 extends StoryModel> {
        T1 Story();

        String storyIdNullable();

        Long storyRowIdNullable();
    }

    public interface StoryViewFriendStoriesActiveSnapsCreator<T extends StoryViewFriendStoriesActiveSnapsModel> {
        T create(String str, Long l, long j, Long l2, String str2);
    }

    public interface StoryViewFriendStoriesActiveSnapsModel {
        String firstUnviewedSnapId();

        Long isViewed();

        Long latestSnapExpirationTimestamp();

        long latestSnapTimestamp();

        String username();
    }

    public interface StoryViewPlayableFriendStoriesMappingCreator<T extends StoryViewPlayableFriendStoriesMappingModel> {
        T create(String str, long j);
    }

    public interface StoryViewPlayableFriendStoriesMappingModel {
        long storyRowId();

        String username();
    }

    public static final class Mapper<T extends StoryModel> implements ainw<T> {
        private final Factory<T> storyModelFactory;

        public Mapper(Factory<T> factory) {
            this.storyModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            Cursor cursor2 = cursor;
            Creator creator = this.storyModelFactory.creator;
            long j = cursor2.getLong(0);
            String string = cursor2.getString(1);
            String string2 = cursor2.isNull(2) ? null : cursor2.getString(2);
            String string3 = cursor2.isNull(3) ? null : cursor2.getString(3);
            if (cursor2.isNull(4)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(4) == 1);
            }
            String string4 = cursor2.isNull(5) ? null : cursor2.getString(5);
            String string5 = cursor2.isNull(6) ? null : cursor2.getString(6);
            Long valueOf = cursor2.isNull(7) ? null : Long.valueOf(cursor2.getLong(7));
            Long valueOf2 = cursor2.isNull(8) ? null : Long.valueOf(cursor2.getLong(8));
            if (cursor2.isNull(9)) {
                bool2 = null;
            } else {
                bool2 = Boolean.valueOf(cursor2.getInt(9) == 1);
            }
            StoryKind storyKind = (StoryKind) this.storyModelFactory.kindAdapter.decode(Long.valueOf(cursor2.getLong(10)));
            GroupStoryType groupStoryType = cursor2.isNull(11) ? null : (GroupStoryType) this.storyModelFactory.groupStoryTypeAdapter.decode(Long.valueOf(cursor2.getLong(11)));
            if (cursor2.isNull(12)) {
                bool3 = null;
            } else {
                bool3 = Boolean.valueOf(cursor2.getInt(12) == 1);
            }
            return creator.create(j, string, string2, string3, bool, string4, string5, valueOf, valueOf2, bool2, storyKind, groupStoryType, bool3, cursor2.isNull(13) ? null : Long.valueOf(cursor2.getLong(13)));
        }
    }

    public static final class SelectAllFriendStoriesMapper<T extends SelectAllFriendStoriesModel, T1 extends FriendModel> implements ainw<T> {
        private final SelectAllFriendStoriesCreator<T> creator;
        private final com.snap.core.db.record.FriendModel.Factory<T1> friendModelFactory;

        public SelectAllFriendStoriesMapper(SelectAllFriendStoriesCreator<T> selectAllFriendStoriesCreator, com.snap.core.db.record.FriendModel.Factory<T1> factory) {
            this.creator = selectAllFriendStoriesCreator;
            this.friendModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Boolean bool2;
            Cursor cursor2 = cursor;
            SelectAllFriendStoriesCreator selectAllFriendStoriesCreator = this.creator;
            long j = cursor2.getLong(0);
            String string = cursor2.getString(1);
            String string2 = cursor2.isNull(2) ? null : cursor2.getString(2);
            Long valueOf = cursor2.isNull(3) ? null : Long.valueOf(cursor2.getLong(3));
            if (cursor2.isNull(4)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(4) == 1);
            }
            long j2 = cursor2.getLong(5);
            String string3 = cursor2.isNull(6) ? null : cursor2.getString(6);
            String string4 = cursor2.getString(7);
            if (cursor2.isNull(8)) {
                bool2 = null;
            } else {
                bool2 = Boolean.valueOf(cursor2.getInt(8) == 1);
            }
            return selectAllFriendStoriesCreator.create(j, string, string2, valueOf, bool, j2, string3, string4, bool2, cursor2.getLong(9), cursor2.getLong(10), cursor2.isNull(11) ? null : (Friendmojis) this.friendModelFactory.friendmojisAdapter.decode(cursor2.getString(11)));
        }
    }

    public static final class SelectPlayableStoryMapper<T extends SelectPlayableStoryModel, T1 extends StoryModel, T2 extends FriendModel, T3 extends FeedModel, T4 extends MobStoryMetadataModel> implements ainw<T> {
        private final SelectPlayableStoryCreator<T> creator;
        private final com.snap.core.db.record.FeedModel.Factory<T3> feedModelFactory;
        private final com.snap.core.db.record.FriendModel.Factory<T2> friendModelFactory;
        private final com.snap.core.db.record.MobStoryMetadataModel.Factory<T4> mobStoryMetadataModelFactory;
        private final Factory<T1> storyModelFactory;

        public SelectPlayableStoryMapper(SelectPlayableStoryCreator<T> selectPlayableStoryCreator, Factory<T1> factory, com.snap.core.db.record.FriendModel.Factory<T2> factory2, com.snap.core.db.record.FeedModel.Factory<T3> factory3, com.snap.core.db.record.MobStoryMetadataModel.Factory<T4> factory4) {
            this.creator = selectPlayableStoryCreator;
            this.storyModelFactory = factory;
            this.friendModelFactory = factory2;
            this.feedModelFactory = factory3;
            this.mobStoryMetadataModelFactory = factory4;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            return this.creator.create(cursor2.getLong(0), cursor2.getString(1), cursor2.isNull(2) ? null : cursor2.getString(2), (StoryKind) this.storyModelFactory.kindAdapter.decode(Long.valueOf(cursor2.getLong(3))), cursor2.isNull(4) ? null : (GroupStoryType) this.storyModelFactory.groupStoryTypeAdapter.decode(Long.valueOf(cursor2.getLong(4))), cursor2.isNull(5) ? null : cursor2.getString(5), cursor2.isNull(6) ? null : (Friendmojis) this.friendModelFactory.friendmojisAdapter.decode(cursor2.getString(6)), cursor2.isNull(7) ? null : Long.valueOf(cursor2.getLong(7)), cursor2.isNull(8) ? null : cursor2.getString(8), cursor2.isNull(9) ? null : (FeedKind) this.feedModelFactory.kindAdapter.decode(Long.valueOf(cursor2.getLong(9))), cursor2.isNull(10) ? null : (agec) this.mobStoryMetadataModelFactory.typeExtraDataAdapter.decode(cursor2.getBlob(10)));
        }
    }

    public static final class SelectUserManagedStoriesMapper<T extends SelectUserManagedStoriesModel, T1 extends StoryModel> implements ainw<T> {
        private final SelectUserManagedStoriesCreator<T> creator;
        private final Factory<T1> storyModelFactory;

        public SelectUserManagedStoriesMapper(SelectUserManagedStoriesCreator<T> selectUserManagedStoriesCreator, Factory<T1> factory) {
            this.creator = selectUserManagedStoriesCreator;
            this.storyModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), (StoryKind) this.storyModelFactory.kindAdapter.decode(Long.valueOf(cursor.getLong(1))));
        }
    }

    public static final class ClearAll extends ainy {
        public ClearAll(pa paVar) {
            super(StoryModel.TABLE_NAME, paVar.a("DELETE FROM Story"));
        }
    }

    public static final class DeleteByRowId extends ainy {
        public DeleteByRowId(pa paVar) {
            super(StoryModel.TABLE_NAME, paVar.a("DELETE FROM Story\nWHERE _id = ?"));
        }

        public final void bind(long j) {
            bindLong(1, j);
        }
    }

    public static final class EnsureStory extends ainy {
        private final Factory<? extends StoryModel> storyModelFactory;

        public EnsureStory(pa paVar, Factory<? extends StoryModel> factory) {
            super(StoryModel.TABLE_NAME, paVar.a("INSERT OR IGNORE INTO Story (\nstoryId,\nkind,\ndisplayName)\nVALUES (?, ?, ?)"));
            this.storyModelFactory = factory;
        }

        public final void bind(String str, StoryKind storyKind, String str2) {
            bindString(1, str);
            bindLong(2, ((Long) this.storyModelFactory.kindAdapter.encode(storyKind)).longValue());
            if (str2 == null) {
                bindNull(3);
            } else {
                bindString(3, str2);
            }
        }
    }

    public static final class InsertGroupStory extends ainy {
        private final Factory<? extends StoryModel> storyModelFactory;

        public InsertGroupStory(pa paVar, Factory<? extends StoryModel> factory) {
            super(StoryModel.TABLE_NAME, paVar.a("INSERT OR IGNORE INTO Story(\n    storyId,\n    kind,\n    userName,\n    displayName,\n    groupStoryType,\n    isPostable\n)\nVALUES (?, ?, ?, ?, ?, ?)"));
            this.storyModelFactory = factory;
        }

        public final void bind(String str, StoryKind storyKind, String str2, String str3, GroupStoryType groupStoryType, Boolean bool) {
            bindString(1, str);
            bindLong(2, ((Long) this.storyModelFactory.kindAdapter.encode(storyKind)).longValue());
            if (str2 == null) {
                bindNull(3);
            } else {
                bindString(3, str2);
            }
            if (str3 == null) {
                bindNull(4);
            } else {
                bindString(4, str3);
            }
            if (groupStoryType == null) {
                bindNull(5);
            } else {
                bindLong(5, ((Long) this.storyModelFactory.groupStoryTypeAdapter.encode(groupStoryType)).longValue());
            }
            if (bool == null) {
                bindNull(6);
            } else {
                bindLong(6, bool.booleanValue() ? 1 : 0);
            }
        }
    }

    public static final class InsertStory extends ainy {
        private final Factory<? extends StoryModel> storyModelFactory;

        public InsertStory(pa paVar, Factory<? extends StoryModel> factory) {
            super(StoryModel.TABLE_NAME, paVar.a("INSERT INTO Story (\n    storyId,\n    userName,\n    displayName,\n    isLocal,\n    profileDescription,\n    sharedId,\n    kind,\n    groupStoryType,\n    isPostable)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)"));
            this.storyModelFactory = factory;
        }

        public final void bind(String str, String str2, String str3, Boolean bool, String str4, String str5, StoryKind storyKind, GroupStoryType groupStoryType, Boolean bool2) {
            bindString(1, str);
            if (str2 == null) {
                bindNull(2);
            } else {
                bindString(2, str2);
            }
            if (str3 == null) {
                bindNull(3);
            } else {
                bindString(3, str3);
            }
            long j = 1;
            if (bool == null) {
                bindNull(4);
            } else {
                bindLong(4, bool.booleanValue() ? 1 : 0);
            }
            if (str4 == null) {
                bindNull(5);
            } else {
                bindString(5, str4);
            }
            if (str5 == null) {
                bindNull(6);
            } else {
                bindString(6, str5);
            }
            bindLong(7, ((Long) this.storyModelFactory.kindAdapter.encode(storyKind)).longValue());
            if (groupStoryType == null) {
                bindNull(8);
            } else {
                bindLong(8, ((Long) this.storyModelFactory.groupStoryTypeAdapter.encode(groupStoryType)).longValue());
            }
            if (bool2 == null) {
                bindNull(9);
                return;
            }
            if (!bool2.booleanValue()) {
                j = 0;
            }
            bindLong(9, j);
        }
    }

    public static final class MarkAsViewed extends ainy {
        private final Factory<? extends StoryModel> storyModelFactory;

        public MarkAsViewed(pa paVar, Factory<? extends StoryModel> factory) {
            super(StoryModel.TABLE_NAME, paVar.a("UPDATE Story\nSET viewed = 1\nWHERE storyId = ? AND kind = ?"));
            this.storyModelFactory = factory;
        }

        public final void bind(String str, StoryKind storyKind) {
            bindString(1, str);
            bindLong(2, ((Long) this.storyModelFactory.kindAdapter.encode(storyKind)).longValue());
        }
    }

    public static final class PopulateGroupChatGroupStories extends ainy {
        public PopulateGroupChatGroupStories(pa paVar) {
            super(StoryModel.TABLE_NAME, paVar.a("INSERT OR IGNORE INTO Story(\n    storyId,\n    userName,\n    displayName,\n    kind,\n    groupStoryType,\n    isPostable\n)\nSELECT\n    Feed.groupMobId,\n    Feed.key,\n    COALESCE(Feed.specifiedName, Feed.participantString),\n    1, -- StoryKind.GROUP\n    3, -- GroupStoryType.MISCHIEF\n    1 -- isPostable\nFROM Feed\nWHERE Feed.kind = 1 AND Feed.groupMobId NOT NULL"));
        }
    }

    public static final class UpdateGroupStory extends ainy {
        private final Factory<? extends StoryModel> storyModelFactory;

        public UpdateGroupStory(pa paVar, Factory<? extends StoryModel> factory) {
            super(StoryModel.TABLE_NAME, paVar.a("UPDATE Story\nSET displayName=?,\n    userName=?,\n    groupStoryType=?\nWHERE _id = ?"));
            this.storyModelFactory = factory;
        }

        public final void bind(String str, String str2, GroupStoryType groupStoryType, long j) {
            if (str == null) {
                bindNull(1);
            } else {
                bindString(1, str);
            }
            if (str2 == null) {
                bindNull(2);
            } else {
                bindString(2, str2);
            }
            if (groupStoryType == null) {
                bindNull(3);
            } else {
                bindLong(3, ((Long) this.storyModelFactory.groupStoryTypeAdapter.encode(groupStoryType)).longValue());
            }
            bindLong(4, j);
        }
    }

    public static final class UpdateLatestMetadata extends ainy {
        public UpdateLatestMetadata(pa paVar) {
            super(StoryModel.TABLE_NAME, paVar.a("UPDATE Story\nSET latestTimeStamp = ?, latestExpirationTimestamp = ?, viewed = ?\nWHERE _id = ?"));
        }

        public final void bind(Long l, Long l2, Boolean bool, long j) {
            if (l == null) {
                bindNull(1);
            } else {
                bindLong(1, l.longValue());
            }
            if (l2 == null) {
                bindNull(2);
            } else {
                bindLong(2, l2.longValue());
            }
            if (bool == null) {
                bindNull(3);
            } else {
                bindLong(3, bool.booleanValue() ? 1 : 0);
            }
            bindLong(4, j);
        }
    }

    public static final class UpdateStoryDisplayName extends ainy {
        private final Factory<? extends StoryModel> storyModelFactory;

        public UpdateStoryDisplayName(pa paVar, Factory<? extends StoryModel> factory) {
            super(StoryModel.TABLE_NAME, paVar.a("UPDATE Story\nSET displayName=?\nWHERE storyId = ? AND kind = ?"));
            this.storyModelFactory = factory;
        }

        public final void bind(String str, String str2, StoryKind storyKind) {
            if (str == null) {
                bindNull(1);
            } else {
                bindString(1, str);
            }
            bindString(2, str2);
            bindLong(3, ((Long) this.storyModelFactory.kindAdapter.encode(storyKind)).longValue());
        }
    }

    public static final class UpdateStoryIdForFriendFeed extends ainy {
        public UpdateStoryIdForFriendFeed(pa paVar) {
            super(FeedModel.TABLE_NAME, paVar.a("UPDATE Feed\nSET storyRowId=?\nWHERE Feed.friendRowId=?"));
        }

        public final void bind(Long l, Long l2) {
            if (l == null) {
                bindNull(1);
            } else {
                bindLong(1, l.longValue());
            }
            if (l2 == null) {
                bindNull(2);
            } else {
                bindLong(2, l2.longValue());
            }
        }
    }

    long _id();

    String displayName();

    GroupStoryType groupStoryType();

    Boolean isLocal();

    Boolean isPostable();

    StoryKind kind();

    Long latestExpirationTimestamp();

    Long latestTimeStamp();

    String profileDescription();

    Long rankingId();

    String sharedId();

    String storyId();

    String userName();

    Boolean viewed();
}
