package com.snap.core.db.record;

import android.database.Cursor;
import com.snap.core.db.column.FeedKind;
import defpackage.ainu;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.ainz;
import defpackage.aioa;
import defpackage.gcg;
import defpackage.gcp;
import defpackage.pa;
import defpackage.pc;

public interface FeedModel {
    public static final String ADDAUTHTOKEN = "ALTER TABLE Feed\nADD COLUMN authToken BLOB";
    public static final String ADDCOGNACNOTIFICATIONMUTED = "ALTER TABLE Feed\nADD cognacNotificationMuted INTEGER DEFAULT 0 NOT NULL";
    public static final String ADDFITSCREENPARTICIPANTSTRING = "ALTER TABLE Feed\nADD fitScreenParticipantString TEXT";
    public static final String ADDGROUPCREATIONREQUESTID = "ALTER TABLE Feed\nADD groupCreationRequestId TEXT";
    public static final String ADDGROUPCREATIONTIMESTAMP = "ALTER TABLE Feed\nADD groupCreationTimestamp INTEGER DEFAULT 0";
    public static final String ADDGROUPMOBID = "ALTER TABLE Feed\nADD groupMobId TEXT";
    public static final String ADDGROUPSYNCCONTENTTYPE = "ALTER TABLE Feed\nADD groupSyncContentType INTEGER DEFAULT 0 NOT NULL";
    public static final String ADDHIDDENBOOLEAN = "ALTER TABLE Feed\nADD hidden INTEGER DEFAULT 0";
    public static final String ADDISARROYO = "ALTER TABLE Feed\nADD isArroyo INTEGER DEFAULT 0 NOT NULL";
    public static final String ADDISTEMPORARYGROUP = "ALTER TABLE Feed\nADD isTemporaryGroup INTEGER DEFAULT 0 NOT NULL";
    public static final String ADDLASTINTERACTIONWRITERID = "ALTER TABLE Feed\nADD lastInteractionWriterId INTEGER";
    public static final String ADDMESSAGERETENTIONINMINUTES = "ALTER TABLE Feed\nADD messageRetentionInMinutes INTEGER NOT NULL DEFAULT 0";
    public static final String ADDNOTIFICATIONMUTED = "ALTER TABLE Feed\nADD notificationMuted INTEGER DEFAULT 0";
    public static final String ADDSORTINGTIMESTAMP = "ALTER TABLE Feed\nADD sortingTimestamp INTEGER NOT NULL DEFAULT 0";
    public static final String ADDSOURCEPAGE = "ALTER TABLE Feed\nADD sourcePage INTEGER DEFAULT 0 NOT NULL";
    @Deprecated
    public static final String AUTHTOKEN = "authToken";
    @Deprecated
    public static final String CLEAREDTIMESTAMP = "clearedTimestamp";
    @Deprecated
    public static final String COGNACNOTIFICATIONMUTED = "cognacNotificationMuted";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS Feed (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    key TEXT NOT NULL UNIQUE,\n\n    specifiedName TEXT, -- A name chosen by the group (not generated)\n    participantString TEXT, -- Displayable string with a group chat's members\n    fitScreenParticipantString TEXT, -- Shortened version of participantString to fit the screen.\n    participantsSize INTEGER NOT NULL DEFAULT 1,\n    friendRowId INTEGER, -- If this is a one-on-one chat, the friend's id.\n    iterToken TEXT, -- this is a token used for conversation pagination.\n\n    displayTimestamp INTEGER NOT NULL DEFAULT 0,\n    displayInteractionType TEXT, -- the type of the last interaction\n\n    sortingTimestamp INTEGER NOT NULL DEFAULT 0, -- dedicated timestamp used for sorting\n\n    groupCreationTimestamp INTEGER DEFAULT 0,\n    lastInteractionTimestamp INTEGER DEFAULT 0,\n    lastInteractionUserId INTEGER, -- friend row id of the last user that write/read/screenshotted.\n    lastInteractionWriterId INTEGER, -- friend row id of the last writer.\n\n    -- check https://snapchat.quip.com/x1DnAyDCbaPa for snap release design\n    -- Used in 1-1 Snap Release, represents my release of my received snap\n    myReceivedSnapReleaseTimestamp INTEGER NOT NULL DEFAULT 0,\n    -- Used in 1-1 Snap Release, represents my release of my sent snap\n    mySentSnapReleaseTimestamp INTEGER NOT NULL DEFAULT 0,\n\n    clearedTimestamp INTEGER DEFAULT 0,\n\n    storySkipCount INTEGER NOT NULL DEFAULT 0, -- how many times the user has swiped to skip a story in the feed. AKA: FRIEND_STORY_AUTO_ADVANCE_SKIP_COUNT\n\n    lastReadTimestamp INTEGER,\n    lastReader TEXT,\n    lastWriteTimestamp INTEGER,\n    lastWriteType TEXT,\n    lastWriter TEXT,\n\n    myLastReadTimestamp INTEGER,\n    friendLastReadTimestamp INTEGER,\n\n    lastSnapType INTEGER,\n    storyRowId INTEGER, -- either null or Story._id as DatabaseKey<Story>\n    -- mischief_mob_id field in soju.android.identity.Mischief.\n    -- Is used for posting to group chat group stories.\n    groupMobId TEXT,\n    groupStoryMuted INTEGER DEFAULT 0,\n    authToken BLOB, -- SignedPayload --\n\n    laterContentExists INTEGER DEFAULT 0 NOT NULL,\n    groupSyncContentType INTEGER DEFAULT 0 NOT NULL,\n\n    groupVersion INTEGER DEFAULT 0 NOT NULL,\n\n    -- Used in 1-1 24hr message retention, 0 represents immediate and 1440 is 24hr retention model\n    messageRetentionInMinutes INTEGER NOT NULL DEFAULT 0,\n\n    kind INTEGER NOT NULL,\n\n    notificationMuted INTEGER DEFAULT 0,\n\n    cognacNotificationMuted INTEGER DEFAULT 0 NOT NULL,\n\n    groupCreationRequestId TEXT UNIQUE, -- uuid used for group creation request\n\n    -- True if a group 1) is local and 2) has no conversation interaction\n    -- it needs to be cleaned up upon user leaving chat page\n    isTemporaryGroup INTEGER DEFAULT 0 NOT NULL,\n\n    isArroyo INTEGER DEFAULT 0 NOT NULL,\n\n    hidden INTEGER DEFAULT 0, -- allow for this cell to be hidden. cells are visible by default,\n\n    sourcePage INTEGER DEFAULT 0 NOT NULL -- the page id this item originated from\n)";
    @Deprecated
    public static final String DISPLAYINTERACTIONTYPE = "displayInteractionType";
    @Deprecated
    public static final String DISPLAYTIMESTAMP = "displayTimestamp";
    @Deprecated
    public static final String FITSCREENPARTICIPANTSTRING = "fitScreenParticipantString";
    @Deprecated
    public static final String FRIENDLASTREADTIMESTAMP = "friendLastReadTimestamp";
    @Deprecated
    public static final String FRIENDROWID = "friendRowId";
    @Deprecated
    public static final String GROUPCREATIONREQUESTID = "groupCreationRequestId";
    @Deprecated
    public static final String GROUPCREATIONTIMESTAMP = "groupCreationTimestamp";
    @Deprecated
    public static final String GROUPMOBID = "groupMobId";
    @Deprecated
    public static final String GROUPSTORYMUTED = "groupStoryMuted";
    @Deprecated
    public static final String GROUPSYNCCONTENTTYPE = "groupSyncContentType";
    @Deprecated
    public static final String GROUPVERSION = "groupVersion";
    @Deprecated
    public static final String HIDDEN = "hidden";
    @Deprecated
    public static final String ISARROYO = "isArroyo";
    @Deprecated
    public static final String ISTEMPORARYGROUP = "isTemporaryGroup";
    @Deprecated
    public static final String ITERTOKEN = "iterToken";
    @Deprecated
    public static final String KEY = "key";
    @Deprecated
    public static final String KIND = "kind";
    @Deprecated
    public static final String LASTINTERACTIONTIMESTAMP = "lastInteractionTimestamp";
    @Deprecated
    public static final String LASTINTERACTIONUSERID = "lastInteractionUserId";
    @Deprecated
    public static final String LASTINTERACTIONWRITERID = "lastInteractionWriterId";
    @Deprecated
    public static final String LASTREADER = "lastReader";
    @Deprecated
    public static final String LASTREADTIMESTAMP = "lastReadTimestamp";
    @Deprecated
    public static final String LASTSNAPTYPE = "lastSnapType";
    @Deprecated
    public static final String LASTWRITER = "lastWriter";
    @Deprecated
    public static final String LASTWRITETIMESTAMP = "lastWriteTimestamp";
    @Deprecated
    public static final String LASTWRITETYPE = "lastWriteType";
    @Deprecated
    public static final String LATERCONTENTEXISTS = "laterContentExists";
    @Deprecated
    public static final String MESSAGERETENTIONINMINUTES = "messageRetentionInMinutes";
    @Deprecated
    public static final String MYLASTREADTIMESTAMP = "myLastReadTimestamp";
    @Deprecated
    public static final String MYRECEIVEDSNAPRELEASETIMESTAMP = "myReceivedSnapReleaseTimestamp";
    @Deprecated
    public static final String MYSENTSNAPRELEASETIMESTAMP = "mySentSnapReleaseTimestamp";
    @Deprecated
    public static final String NOTIFICATIONMUTED = "notificationMuted";
    @Deprecated
    public static final String PARTICIPANTSSIZE = "participantsSize";
    @Deprecated
    public static final String PARTICIPANTSTRING = "participantString";
    @Deprecated
    public static final String SORTINGTIMESTAMP = "sortingTimestamp";
    @Deprecated
    public static final String SOURCEPAGE = "sourcePage";
    @Deprecated
    public static final String SPECIFIEDNAME = "specifiedName";
    @Deprecated
    public static final String STORYROWID = "storyRowId";
    @Deprecated
    public static final String STORYSKIPCOUNT = "storySkipCount";
    @Deprecated
    public static final String TABLE_NAME = "Feed";
    @Deprecated
    public static final String _ID = "_id";

    public interface GetFeedIdForKeysModel {
        long _id();

        String key();
    }

    public interface SelectReadWriteInfoModel {
        long _id();

        String displayInteractionType();

        long displayTimestamp();

        Long lastInteractionTimestamp();

        Long lastInteractionUserId();

        Long lastReadTimestamp();

        String lastReader();

        Long lastReaderUserId();

        gcp lastSnapType();

        Long lastWriteTimestamp();

        String lastWriteType();

        String lastWriter();

        Long lastWriterUserId();

        long sortingTimestamp();

        Long storyLatestExpirationTimestamp();

        Long storyLatestTimestamp();

        Boolean storyViewed();
    }

    public static final class Factory<T extends FeedModel> {
        public final Creator<T> creator;
        public final ainu<gcg, Long> groupSyncContentTypeAdapter;
        public final ainu<FeedKind, Long> kindAdapter;
        public final ainu<gcp, Long> lastSnapTypeAdapter;

        final class GetFeedIdForKeysQuery extends ainx {
            private final String[] key;

            GetFeedIdForKeysQuery(String[] strArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT\n    Feed._id,\n    Feed.key\nFROM Feed\nWHERE Feed.key IN ");
                stringBuilder.append(ainz.a(strArr.length));
                super(stringBuilder.toString(), new aioa(FeedModel.TABLE_NAME));
                this.key = strArr;
            }

            public final void bindTo(pc pcVar) {
                String[] strArr = this.key;
                int length = strArr.length;
                int i = 1;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i + 1;
                    pcVar.bindString(i, strArr[i2]);
                    i2++;
                    i = i3;
                }
            }
        }

        final class SelectReadWriteInfoQuery extends ainx {
            private final long[] _id;

            SelectReadWriteInfoQuery(long[] jArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT\n    Feed._id,\n    Feed.lastInteractionTimestamp,\n    Feed.lastReadTimestamp,\n    Feed.lastReader,\n    lastReaderFriend._id AS lastReaderUserId,\n    Feed.lastWriteTimestamp,\n    Feed.lastWriteType,\n    Feed.lastWriter,\n--    for diffing against last interaction type\n    Feed.displayTimestamp,\n    Feed.displayInteractionType,\n    Feed.lastInteractionUserId,\n    Feed.sortingTimestamp,\n    lastWriterFriend._id AS lastWriterUserId,\n    Feed.lastSnapType,\n    friendStory.latestTimeStamp AS storyLatestTimestamp,\n    friendStory.latestExpirationTimestamp AS storyLatestExpirationTimestamp,\n    friendStory.viewed AS storyViewed\nFROM\nFeed\nLEFT OUTER JOIN Friend AS lastWriterFriend ON Feed.lastWriter = lastWriterFriend.username\nLEFT OUTER JOIN Friend AS lastReaderFriend ON Feed.lastReader = lastReaderFriend.username\nLEFT OUTER JOIN StoryViewActiveSnaps AS friendStory ON Feed.storyRowId = friendStory._id\nWHERE Feed._id IN ");
                stringBuilder.append(ainz.a(jArr.length));
                super(stringBuilder.toString(), new aioa(FeedModel.TABLE_NAME, FriendModel.TABLE_NAME, StoryModel.TABLE_NAME, StorySnapModel.TABLE_NAME));
                this._id = jArr;
            }

            public final void bindTo(pc pcVar) {
                long[] jArr = this._id;
                int length = jArr.length;
                int i = 1;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i + 1;
                    pcVar.bindLong(i, jArr[i2]);
                    i2++;
                    i = i3;
                }
            }
        }

        final class GetIdsWithLaterContentQuery extends ainx {
            private final boolean laterContentExists;

            GetIdsWithLaterContentQuery(boolean z) {
                super("SELECT\n key\nFROM Feed\nWHERE laterContentExists=?1 AND groupSyncContentType IN (3,4)", new aioa(FeedModel.TABLE_NAME));
                this.laterContentExists = z;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.laterContentExists ? 1 : 0);
            }
        }

        final class DeleteLocalTemporaryGroupsExceptQuery extends ainx {
            private final String[] key;

            DeleteLocalTemporaryGroupsExceptQuery(String[] strArr) {
                StringBuilder stringBuilder = new StringBuilder("DELETE FROM Feed\nWHERE isTemporaryGroup = 1 AND key NOT IN ");
                stringBuilder.append(ainz.a(strArr.length));
                super(stringBuilder.toString(), new aioa(FeedModel.TABLE_NAME));
                this.key = strArr;
            }

            public final void bindTo(pc pcVar) {
                String[] strArr = this.key;
                int length = strArr.length;
                int i = 1;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i + 1;
                    pcVar.bindString(i, strArr[i2]);
                    i2++;
                    i = i3;
                }
            }
        }

        final class GetAuthTokenForFeedQuery extends ainx {
            private final long _id;

            GetAuthTokenForFeedQuery(long j) {
                super("SELECT COALESCE(authToken, '')\nFROM Feed\nWHERE _id = ?1", new aioa(FeedModel.TABLE_NAME));
                this._id = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this._id);
            }
        }

        final class GetBasicFeedInfoByIdQuery extends ainx {
            private final long _id;

            GetBasicFeedInfoByIdQuery(long j) {
                super("SELECT\n    Feed._id,\n    Feed.key,\n    Feed.friendRowId,\n    coalesce(Feed.specifiedName, Feed.participantString) AS feedDisplayName,\n    Feed.specifiedName,\n    Friend.displayName AS friendDisplayName,\n    Friend.username AS friendUserName,\n    Friend.bitmojiAvatarId AS friendAvatarId,\n    Friend.bitmojiSelfieId AS friendSelfiedId,\n    Feed.friendLastReadTimestamp,\n    Feed.kind,\n    participantsSize,\n    lastWriterUser.username AS lastWriterUsername,\n    storyRowId,\n    Story.latestExpirationTimestamp AS storyLatestExpirationTimestamp,\n    Story.latestTimeStamp AS storyLatestTimestamp,\n    Story.viewed AS storyViewed,\n    Feed.groupStoryMuted AS storyMuted,\n    messageRetentionInMinutes,\n    isTemporaryGroup\nFROM Feed\nLEFT OUTER JOIN Friend ON Feed.friendRowId = Friend._id\nLEFT OUTER JOIN Friend AS lastWriterUser ON Feed.lastInteractionWriterId = lastWriterUser._id\nLEFT OUTER JOIN StoryViewActiveSnaps AS Story ON Story._id = storyRowId\nWHERE Feed._id=?1\nLIMIT 1", new aioa(FeedModel.TABLE_NAME, FriendModel.TABLE_NAME, StoryModel.TABLE_NAME, StorySnapModel.TABLE_NAME));
                this._id = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this._id);
            }
        }

        final class GetConversationStateQuery extends ainx {
            private final long _id;

            GetConversationStateQuery(long j) {
                super("SELECT\n    _id,\n    key,\n    clearedTimestamp,\n    myReceivedSnapReleaseTimestamp,\n    mySentSnapReleaseTimestamp,\n    notificationMuted,\n    cognacNotificationMuted,\n    messageRetentionInMinutes,\n    isTemporaryGroup\nFROM Feed\nWHERE Feed._id = ?1", new aioa(FeedModel.TABLE_NAME));
                this._id = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this._id);
            }
        }

        final class GetDisplayNameByKeyQuery extends ainx {
            private final String key;
            private final FeedKind kind;

            GetDisplayNameByKeyQuery(String str, FeedKind feedKind) {
                super("SELECT\n    COALESCE(Feed.specifiedName, Feed.participantString) AS feedDisplayName\nFROM Feed\nWHERE Feed.key=?1 AND Feed.kind=?2\nLIMIT 1", new aioa(FeedModel.TABLE_NAME));
                this.key = str;
                this.kind = feedKind;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.key);
                pcVar.bindLong(2, ((Long) Factory.this.kindAdapter.encode(this.kind)).longValue());
            }
        }

        final class GetDisplayNameByMobStoryIdQuery extends ainx {
            private final String[] groupMobId;

            GetDisplayNameByMobStoryIdQuery(String[] strArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT\n    Feed.groupMobId AS mobStoryId,\n    COALESCE(Feed.specifiedName, Feed.participantString) AS displayName\nFROM Feed\nWHERE Feed.groupMobId IN ");
                stringBuilder.append(ainz.a(strArr.length));
                super(stringBuilder.toString(), new aioa(FeedModel.TABLE_NAME));
                this.groupMobId = strArr;
            }

            public final void bindTo(pc pcVar) {
                String[] strArr = this.groupMobId;
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

        final class GetFeedIdForFriendQuery extends ainx {
            private final String username;

            GetFeedIdForFriendQuery(String str) {
                super("SELECT Feed._id\nFROM Feed\nINNER JOIN Friend ON Friend._id = Feed.friendRowId\nWHERE Friend.username=?1 AND kind=0\nLIMIT 1", new aioa(FeedModel.TABLE_NAME, FriendModel.TABLE_NAME));
                this.username = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.username);
            }
        }

        final class GetFeedIdForKeyQuery extends ainx {
            private final String key;

            GetFeedIdForKeyQuery(String str) {
                super("SELECT _id\nFROM Feed\nWHERE key=?1\nLIMIT 1", new aioa(FeedModel.TABLE_NAME));
                this.key = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.key);
            }
        }

        final class GetFeedIdForStoryRowIdQuery extends ainx {
            private final Long storyRowId;

            GetFeedIdForStoryRowIdQuery(Long l) {
                super("SELECT Feed._id\nFROM Feed\nWHERE Feed.storyRowId = ?1\nLIMIT 1", new aioa(FeedModel.TABLE_NAME));
                this.storyRowId = l;
            }

            public final void bindTo(pc pcVar) {
                Long l = this.storyRowId;
                if (l != null) {
                    pcVar.bindLong(1, l.longValue());
                } else {
                    pcVar.bindNull(1);
                }
            }
        }

        final class GetGroupCreationRequestIdQuery extends ainx {
            private final String key;

            GetGroupCreationRequestIdQuery(String str) {
                super("SELECT groupCreationRequestId\nFROM Feed\nWHERE key=?1\nLIMIT 1", new aioa(FeedModel.TABLE_NAME));
                this.key = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.key);
            }
        }

        final class GetGroupSyncContentTypeQuery extends ainx {
            private final long _id;

            GetGroupSyncContentTypeQuery(long j) {
                super("SELECT groupSyncContentType\nFROM Feed\nWHERE _id = ?1", new aioa(FeedModel.TABLE_NAME));
                this._id = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this._id);
            }
        }

        final class GetGroupVersionByKeyQuery extends ainx {
            private final String key;

            GetGroupVersionByKeyQuery(String str) {
                super("SELECT\ngroupVersion\nFROM Feed\nWHERE key = ?1", new aioa(FeedModel.TABLE_NAME));
                this.key = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.key);
            }
        }

        final class GetGroupVersionQuery extends ainx {
            private final long _id;

            GetGroupVersionQuery(long j) {
                super("SELECT\ngroupVersion\nFROM Feed\nWHERE _id = ?1", new aioa(FeedModel.TABLE_NAME));
                this._id = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this._id);
            }
        }

        final class GetGroupVersionsForKeysQuery extends ainx {
            private final String[] key;

            GetGroupVersionsForKeysQuery(String[] strArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT\nkey, groupVersion\nFROM Feed\nWHERE key IN ");
                stringBuilder.append(ainz.a(strArr.length));
                super(stringBuilder.toString(), new aioa(FeedModel.TABLE_NAME));
                this.key = strArr;
            }

            public final void bindTo(pc pcVar) {
                String[] strArr = this.key;
                int length = strArr.length;
                int i = 1;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i + 1;
                    pcVar.bindString(i, strArr[i2]);
                    i2++;
                    i = i3;
                }
            }
        }

        final class GetIsArroyoForKeyQuery extends ainx {
            private final String key;

            GetIsArroyoForKeyQuery(String str) {
                super("SELECT isArroyo\nFROM Feed\nWHERE key = ?1\nLIMIT 1", new aioa(FeedModel.TABLE_NAME));
                this.key = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.key);
            }
        }

        final class GetIterTokenQuery extends ainx {
            private final String key;

            GetIterTokenQuery(String str) {
                super("SELECT iterToken\nFROM Feed\nWHERE key=?1\nLIMIT 1", new aioa(FeedModel.TABLE_NAME));
                this.key = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.key);
            }
        }

        final class GetLastWriterAvatarIdForFeedQuery extends ainx {
            private final long _id;

            GetLastWriterAvatarIdForFeedQuery(long j) {
                super("SELECT\n   COALESCE(bitmojiAvatarId,'') AS lastWriterAvatarId\nFROM Feed\nLEFT OUTER JOIN Friend AS lastWriterUser ON Feed.lastWriter = lastWriterUser.username\nWHERE Feed._id=?1\nLIMIT 1", new aioa(FeedModel.TABLE_NAME, FriendModel.TABLE_NAME));
                this._id = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this._id);
            }
        }

        final class GetLaterContentExistsQuery extends ainx {
            private final String key;

            GetLaterContentExistsQuery(String str) {
                super("SELECT\nlaterContentExists\nFROM Feed\nWHERE key = ?1", new aioa(FeedModel.TABLE_NAME));
                this.key = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.key);
            }
        }

        final class GetMessageRetentionInMinutesByIdQuery extends ainx {
            private final long _id;

            GetMessageRetentionInMinutesByIdQuery(long j) {
                super("SELECT messageRetentionInMinutes\nFROM Feed\nWHERE _id = ?1\nLIMIT 1", new aioa(FeedModel.TABLE_NAME));
                this._id = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this._id);
            }
        }

        final class GetSourcePageQuery extends ainx {
            private final long _id;

            GetSourcePageQuery(long j) {
                super("SELECT sourcePage\nFROM Feed\nWHERE _id = ?1", new aioa(FeedModel.TABLE_NAME));
                this._id = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this._id);
            }
        }

        final class QueryIsHiddenQuery extends ainx {
            private final long _id;

            QueryIsHiddenQuery(long j) {
                super("SELECT\nhidden\nFROM Feed\nWHERE _id = ?1", new aioa(FeedModel.TABLE_NAME));
                this._id = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this._id);
            }
        }

        final class SelectMembersForAvatarPickerQuery extends ainx {
            private final long feedRowId;

            SelectMembersForAvatarPickerQuery(long j) {
                super("SELECT\n    Friend.bitmojiAvatarId, Friend.username\nFROM FeedMember\nINNER JOIN Friend ON FeedMember.friendRowId = Friend._id\nWHERE FeedMember.removed = 0\nAND FeedMember.feedRowId = ?1", new aioa(FeedMemberModel.TABLE_NAME, FriendModel.TABLE_NAME));
                this.feedRowId = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.feedRowId);
            }
        }

        public Factory(Creator<T> creator, ainu<gcp, Long> ainu, ainu<gcg, Long> ainu2, ainu<FeedKind, Long> ainu3) {
            this.creator = creator;
            this.lastSnapTypeAdapter = ainu;
            this.groupSyncContentTypeAdapter = ainu2;
            this.kindAdapter = ainu3;
        }

        public final ainx deleteLocalTemporaryGroupsExcept(String[] strArr) {
            return new DeleteLocalTemporaryGroupsExceptQuery(strArr);
        }

        public final ainx getAuthTokenForFeed(long j) {
            return new GetAuthTokenForFeedQuery(j);
        }

        public final ainw<byte[]> getAuthTokenForFeedMapper() {
            return new ainw<byte[]>() {
                public byte[] map(Cursor cursor) {
                    return cursor.getBlob(0);
                }
            };
        }

        public final ainx getBasicFeedInfoById(long j) {
            return new GetBasicFeedInfoByIdQuery(j);
        }

        public final <R extends GetBasicFeedInfoByIdModel> GetBasicFeedInfoByIdMapper<R, T> getBasicFeedInfoByIdMapper(GetBasicFeedInfoByIdCreator<R> getBasicFeedInfoByIdCreator) {
            return new GetBasicFeedInfoByIdMapper(getBasicFeedInfoByIdCreator, this);
        }

        public final ainx getConversationState(long j) {
            return new GetConversationStateQuery(j);
        }

        public final <R extends GetConversationStateModel> GetConversationStateMapper<R> getConversationStateMapper(GetConversationStateCreator<R> getConversationStateCreator) {
            return new GetConversationStateMapper(getConversationStateCreator);
        }

        public final ainx getDisplayNameByKey(String str, FeedKind feedKind) {
            return new GetDisplayNameByKeyQuery(str, feedKind);
        }

        public final ainw<String> getDisplayNameByKeyMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.isNull(0) ? null : cursor.getString(0);
                }
            };
        }

        public final ainx getDisplayNameByMobStoryId(String[] strArr) {
            return new GetDisplayNameByMobStoryIdQuery(strArr);
        }

        public final <R extends GetDisplayNameByMobStoryIdModel> GetDisplayNameByMobStoryIdMapper<R> getDisplayNameByMobStoryIdMapper(GetDisplayNameByMobStoryIdCreator<R> getDisplayNameByMobStoryIdCreator) {
            return new GetDisplayNameByMobStoryIdMapper(getDisplayNameByMobStoryIdCreator);
        }

        public final ainx getFeedIdForFriend(String str) {
            return new GetFeedIdForFriendQuery(str);
        }

        public final ainw<Long> getFeedIdForFriendMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx getFeedIdForKey(String str) {
            return new GetFeedIdForKeyQuery(str);
        }

        public final ainw<Long> getFeedIdForKeyMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx getFeedIdForKeys(String[] strArr) {
            return new GetFeedIdForKeysQuery(strArr);
        }

        public final <R extends GetFeedIdForKeysModel> GetFeedIdForKeysMapper<R> getFeedIdForKeysMapper(GetFeedIdForKeysCreator<R> getFeedIdForKeysCreator) {
            return new GetFeedIdForKeysMapper(getFeedIdForKeysCreator);
        }

        public final ainx getFeedIdForStoryRowId(Long l) {
            return new GetFeedIdForStoryRowIdQuery(l);
        }

        public final ainw<Long> getFeedIdForStoryRowIdMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx getGroupCount() {
            return new ainx("SELECT COUNT(*)\nFROM Feed\nWHERE kind = 1", new aioa(FeedModel.TABLE_NAME));
        }

        public final ainw<Long> getGroupCountMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx getGroupCreationRequestId(String str) {
            return new GetGroupCreationRequestIdQuery(str);
        }

        public final ainw<String> getGroupCreationRequestIdMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.isNull(0) ? null : cursor.getString(0);
                }
            };
        }

        public final ainx getGroupSyncContentType(long j) {
            return new GetGroupSyncContentTypeQuery(j);
        }

        public final ainw<gcg> getGroupSyncContentTypeMapper() {
            return new ainw<gcg>() {
                public gcg map(Cursor cursor) {
                    return (gcg) Factory.this.groupSyncContentTypeAdapter.decode(Long.valueOf(cursor.getLong(0)));
                }
            };
        }

        public final ainx getGroupVersion(long j) {
            return new GetGroupVersionQuery(j);
        }

        public final ainx getGroupVersionByKey(String str) {
            return new GetGroupVersionByKeyQuery(str);
        }

        public final ainw<Long> getGroupVersionByKeyMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainw<Long> getGroupVersionMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx getGroupVersionsForKeys(String[] strArr) {
            return new GetGroupVersionsForKeysQuery(strArr);
        }

        public final <R extends GetGroupVersionsForKeysModel> GetGroupVersionsForKeysMapper<R> getGroupVersionsForKeysMapper(GetGroupVersionsForKeysCreator<R> getGroupVersionsForKeysCreator) {
            return new GetGroupVersionsForKeysMapper(getGroupVersionsForKeysCreator);
        }

        public final ainx getIdsWithLaterContent(boolean z) {
            return new GetIdsWithLaterContentQuery(z);
        }

        public final ainw<String> getIdsWithLaterContentMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.getString(0);
                }
            };
        }

        public final ainx getIsArroyoForKey(String str) {
            return new GetIsArroyoForKeyQuery(str);
        }

        public final ainw<Boolean> getIsArroyoForKeyMapper() {
            return new ainw<Boolean>() {
                public Boolean map(Cursor cursor) {
                    boolean z = false;
                    if (cursor.getInt(0) == 1) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            };
        }

        public final ainx getIterToken(String str) {
            return new GetIterTokenQuery(str);
        }

        public final ainw<String> getIterTokenMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.isNull(0) ? null : cursor.getString(0);
                }
            };
        }

        public final ainx getLastWriterAvatarIdForFeed(long j) {
            return new GetLastWriterAvatarIdForFeedQuery(j);
        }

        public final ainw<String> getLastWriterAvatarIdForFeedMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.getString(0);
                }
            };
        }

        public final ainx getLaterContentExists(String str) {
            return new GetLaterContentExistsQuery(str);
        }

        public final ainw<Boolean> getLaterContentExistsMapper() {
            return new ainw<Boolean>() {
                public Boolean map(Cursor cursor) {
                    boolean z = false;
                    if (cursor.getInt(0) == 1) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            };
        }

        public final ainx getMessageRetentionInMinutesById(long j) {
            return new GetMessageRetentionInMinutesByIdQuery(j);
        }

        public final ainw<Long> getMessageRetentionInMinutesByIdMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx getSourcePage(long j) {
            return new GetSourcePageQuery(j);
        }

        public final ainw<Long> getSourcePageMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx queryIsHidden(long j) {
            return new QueryIsHiddenQuery(j);
        }

        public final ainw<Boolean> queryIsHiddenMapper() {
            return new ainw<Boolean>() {
                public Boolean map(Cursor cursor) {
                    boolean z = false;
                    if (cursor.isNull(0)) {
                        return null;
                    }
                    if (cursor.getInt(0) == 1) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            };
        }

        public final ainx selectMembersForAvatarPicker(long j) {
            return new SelectMembersForAvatarPickerQuery(j);
        }

        public final <R extends SelectMembersForAvatarPickerModel> SelectMembersForAvatarPickerMapper<R> selectMembersForAvatarPickerMapper(SelectMembersForAvatarPickerCreator<R> selectMembersForAvatarPickerCreator) {
            return new SelectMembersForAvatarPickerMapper(selectMembersForAvatarPickerCreator);
        }

        public final ainx selectReadWriteInfo(long[] jArr) {
            return new SelectReadWriteInfoQuery(jArr);
        }

        public final <R extends SelectReadWriteInfoModel> SelectReadWriteInfoMapper<R, T> selectReadWriteInfoMapper(SelectReadWriteInfoCreator<R> selectReadWriteInfoCreator) {
            return new SelectReadWriteInfoMapper(selectReadWriteInfoCreator, this);
        }
    }

    public interface Creator<T extends FeedModel> {
        T create(long j, String str, String str2, String str3, String str4, long j2, Long l, String str5, long j3, String str6, long j4, Long l2, Long l3, Long l4, Long l5, long j5, long j6, Long l6, long j7, Long l7, String str7, Long l8, String str8, String str9, Long l9, Long l10, gcp gcp, Long l11, String str10, Boolean bool, byte[] bArr, boolean z, gcg gcg, long j8, long j9, FeedKind feedKind, Boolean bool2, boolean z2, String str11, boolean z3, boolean z4, Boolean bool3, long j10);
    }

    public interface GetFeedIdForKeysCreator<T extends GetFeedIdForKeysModel> {
        T create(long j, String str);
    }

    public interface GetBasicFeedInfoByIdCreator<T extends GetBasicFeedInfoByIdModel> {
        T create(long j, String str, Long l, String str2, String str3, String str4, String str5, String str6, String str7, Long l2, FeedKind feedKind, long j2, String str8, Long l3, Long l4, Long l5, Boolean bool, Boolean bool2, long j3, boolean z);
    }

    public interface SelectMembersForAvatarPickerCreator<T extends SelectMembersForAvatarPickerModel> {
        T create(String str, String str2);
    }

    public interface SelectReadWriteInfoCreator<T extends SelectReadWriteInfoModel> {
        T create(long j, Long l, Long l2, String str, Long l3, Long l4, String str2, String str3, long j2, String str4, Long l5, long j3, Long l6, gcp gcp, Long l7, Long l8, Boolean bool);
    }

    public interface GetConversationStateCreator<T extends GetConversationStateModel> {
        T create(long j, String str, Long l, long j2, long j3, Boolean bool, boolean z, long j4, boolean z2);
    }

    public interface GetGroupVersionsForKeysCreator<T extends GetGroupVersionsForKeysModel> {
        T create(String str, long j);
    }

    public interface GetDisplayNameByMobStoryIdCreator<T extends GetDisplayNameByMobStoryIdModel> {
        T create(String str, String str2);
    }

    public static final class GetFeedIdForKeysMapper<T extends GetFeedIdForKeysModel> implements ainw<T> {
        private final GetFeedIdForKeysCreator<T> creator;

        public GetFeedIdForKeysMapper(GetFeedIdForKeysCreator<T> getFeedIdForKeysCreator) {
            this.creator = getFeedIdForKeysCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), cursor.getString(1));
        }
    }

    public static final class GetBasicFeedInfoByIdMapper<T extends GetBasicFeedInfoByIdModel, T1 extends FeedModel> implements ainw<T> {
        private final GetBasicFeedInfoByIdCreator<T> creator;
        private final Factory<T1> feedModelFactory;

        public GetBasicFeedInfoByIdMapper(GetBasicFeedInfoByIdCreator<T> getBasicFeedInfoByIdCreator, Factory<T1> factory) {
            this.creator = getBasicFeedInfoByIdCreator;
            this.feedModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Boolean bool2;
            Cursor cursor2 = cursor;
            GetBasicFeedInfoByIdCreator getBasicFeedInfoByIdCreator = this.creator;
            long j = cursor2.getLong(0);
            String string = cursor2.getString(1);
            Long valueOf = cursor2.isNull(2) ? null : Long.valueOf(cursor2.getLong(2));
            String string2 = cursor2.isNull(3) ? null : cursor2.getString(3);
            String string3 = cursor2.isNull(4) ? null : cursor2.getString(4);
            String string4 = cursor2.isNull(5) ? null : cursor2.getString(5);
            String string5 = cursor2.isNull(6) ? null : cursor2.getString(6);
            String string6 = cursor2.isNull(7) ? null : cursor2.getString(7);
            String string7 = cursor2.isNull(8) ? null : cursor2.getString(8);
            Long valueOf2 = cursor2.isNull(9) ? null : Long.valueOf(cursor2.getLong(9));
            FeedKind feedKind = (FeedKind) this.feedModelFactory.kindAdapter.decode(Long.valueOf(cursor2.getLong(10)));
            long j2 = cursor2.getLong(11);
            String string8 = cursor2.isNull(12) ? null : cursor2.getString(12);
            Long valueOf3 = cursor2.isNull(13) ? null : Long.valueOf(cursor2.getLong(13));
            Long valueOf4 = cursor2.isNull(14) ? null : Long.valueOf(cursor2.getLong(14));
            Long valueOf5 = cursor2.isNull(15) ? null : Long.valueOf(cursor2.getLong(15));
            if (cursor2.isNull(16)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(16) == 1);
            }
            if (cursor2.isNull(17)) {
                bool2 = null;
            } else {
                bool2 = Boolean.valueOf(cursor2.getInt(17) == 1);
            }
            return getBasicFeedInfoByIdCreator.create(j, string, valueOf, string2, string3, string4, string5, string6, string7, valueOf2, feedKind, j2, string8, valueOf3, valueOf4, valueOf5, bool, bool2, cursor2.getLong(18), cursor2.getInt(19) == 1);
        }
    }

    public static final class SelectMembersForAvatarPickerMapper<T extends SelectMembersForAvatarPickerModel> implements ainw<T> {
        private final SelectMembersForAvatarPickerCreator<T> creator;

        public SelectMembersForAvatarPickerMapper(SelectMembersForAvatarPickerCreator<T> selectMembersForAvatarPickerCreator) {
            this.creator = selectMembersForAvatarPickerCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.isNull(0) ? null : cursor.getString(0), cursor.getString(1));
        }
    }

    public static final class SelectReadWriteInfoMapper<T extends SelectReadWriteInfoModel, T1 extends FeedModel> implements ainw<T> {
        private final SelectReadWriteInfoCreator<T> creator;
        private final Factory<T1> feedModelFactory;

        public SelectReadWriteInfoMapper(SelectReadWriteInfoCreator<T> selectReadWriteInfoCreator, Factory<T1> factory) {
            this.creator = selectReadWriteInfoCreator;
            this.feedModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Cursor cursor2 = cursor;
            SelectReadWriteInfoCreator selectReadWriteInfoCreator = this.creator;
            long j = cursor2.getLong(0);
            Long valueOf = cursor2.isNull(1) ? null : Long.valueOf(cursor2.getLong(1));
            Long valueOf2 = cursor2.isNull(2) ? null : Long.valueOf(cursor2.getLong(2));
            String string = cursor2.isNull(3) ? null : cursor2.getString(3);
            Long valueOf3 = cursor2.isNull(4) ? null : Long.valueOf(cursor2.getLong(4));
            Long valueOf4 = cursor2.isNull(5) ? null : Long.valueOf(cursor2.getLong(5));
            String string2 = cursor2.isNull(6) ? null : cursor2.getString(6);
            String string3 = cursor2.isNull(7) ? null : cursor2.getString(7);
            long j2 = cursor2.getLong(8);
            String string4 = cursor2.isNull(9) ? null : cursor2.getString(9);
            Long valueOf5 = cursor2.isNull(10) ? null : Long.valueOf(cursor2.getLong(10));
            long j3 = cursor2.getLong(11);
            Long valueOf6 = cursor2.isNull(12) ? null : Long.valueOf(cursor2.getLong(12));
            gcp gcp = cursor2.isNull(13) ? null : (gcp) this.feedModelFactory.lastSnapTypeAdapter.decode(Long.valueOf(cursor2.getLong(13)));
            Long valueOf7 = cursor2.isNull(14) ? null : Long.valueOf(cursor2.getLong(14));
            Long valueOf8 = cursor2.isNull(15) ? null : Long.valueOf(cursor2.getLong(15));
            if (cursor2.isNull(16)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(16) == 1);
            }
            return selectReadWriteInfoCreator.create(j, valueOf, valueOf2, string, valueOf3, valueOf4, string2, string3, j2, string4, valueOf5, j3, valueOf6, gcp, valueOf7, valueOf8, bool);
        }
    }

    public static final class GetConversationStateMapper<T extends GetConversationStateModel> implements ainw<T> {
        private final GetConversationStateCreator<T> creator;

        public GetConversationStateMapper(GetConversationStateCreator<T> getConversationStateCreator) {
            this.creator = getConversationStateCreator;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            GetConversationStateCreator getConversationStateCreator = this.creator;
            long j = cursor2.getLong(0);
            String string = cursor2.getString(1);
            Boolean bool = null;
            Long valueOf = cursor2.isNull(2) ? null : Long.valueOf(cursor2.getLong(2));
            long j2 = cursor2.getLong(3);
            long j3 = cursor2.getLong(4);
            if (!cursor2.isNull(5)) {
                bool = Boolean.valueOf(cursor2.getInt(5) == 1);
            }
            return getConversationStateCreator.create(j, string, valueOf, j2, j3, bool, cursor2.getInt(6) == 1, cursor2.getLong(7), cursor2.getInt(8) == 1);
        }
    }

    public static final class GetGroupVersionsForKeysMapper<T extends GetGroupVersionsForKeysModel> implements ainw<T> {
        private final GetGroupVersionsForKeysCreator<T> creator;

        public GetGroupVersionsForKeysMapper(GetGroupVersionsForKeysCreator<T> getGroupVersionsForKeysCreator) {
            this.creator = getGroupVersionsForKeysCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getString(0), cursor.getLong(1));
        }
    }

    public static final class GetDisplayNameByMobStoryIdMapper<T extends GetDisplayNameByMobStoryIdModel> implements ainw<T> {
        private final GetDisplayNameByMobStoryIdCreator<T> creator;

        public GetDisplayNameByMobStoryIdMapper(GetDisplayNameByMobStoryIdCreator<T> getDisplayNameByMobStoryIdCreator) {
            this.creator = getDisplayNameByMobStoryIdCreator;
        }

        public final T map(Cursor cursor) {
            GetDisplayNameByMobStoryIdCreator getDisplayNameByMobStoryIdCreator = this.creator;
            String str = null;
            String string = cursor.isNull(0) ? null : cursor.getString(0);
            if (!cursor.isNull(1)) {
                str = cursor.getString(1);
            }
            return getDisplayNameByMobStoryIdCreator.create(string, str);
        }
    }

    public static final class UpdateConversation extends ainy {
        private final Factory<? extends FeedModel> feedModelFactory;

        public UpdateConversation(pa paVar, Factory<? extends FeedModel> factory) {
            super(FeedModel.TABLE_NAME, paVar.a("UPDATE Feed\nSET lastInteractionTimestamp=?,\n    iterToken=coalesce(?, iterToken),\n    lastWriter=?,\n    lastWriteType=?,\n    lastWriteTimestamp=?,\n    lastReader=?,\n    lastReadTimestamp=?,\n    lastSnapType=?,\n    messageRetentionInMinutes=?,\n    notificationMuted=?\nWHERE _id = ?"));
            this.feedModelFactory = factory;
        }

        public final void bind(Long l, Object obj, String str, String str2, Long l2, String str3, Long l3, gcp gcp, long j, Boolean bool, long j2) {
            Object obj2 = obj;
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            gcp gcp2 = gcp;
            if (l == null) {
                bindNull(1);
            } else {
                bindLong(1, l.longValue());
            }
            long j3 = 1;
            if (obj2 == null) {
                bindNull(2);
            } else if (obj2 instanceof String) {
                bindString(2, (String) obj2);
            } else if ((obj2 instanceof Float) || (obj2 instanceof Double)) {
                bindDouble(2, ((Double) obj2).doubleValue());
            } else {
                long longValue;
                if ((obj2 instanceof Integer) || (obj2 instanceof Short) || (obj2 instanceof Long)) {
                    longValue = ((Long) obj2).longValue();
                } else if (obj2 instanceof Boolean) {
                    longValue = ((Boolean) obj2).booleanValue() ? 1 : 0;
                } else if (obj2 instanceof byte[]) {
                    bindBlob(2, (byte[]) obj2);
                } else {
                    throw new IllegalArgumentException("Attempting to bind an object that is not one of (String, Integer, Short, Long, Float, Double, Boolean, byte[]) to argument arg2");
                }
                bindLong(2, longValue);
            }
            if (str4 == null) {
                bindNull(3);
            } else {
                bindString(3, str4);
            }
            if (str5 == null) {
                bindNull(4);
            } else {
                bindString(4, str5);
            }
            if (l2 == null) {
                bindNull(5);
            } else {
                bindLong(5, l2.longValue());
            }
            if (str6 == null) {
                bindNull(6);
            } else {
                bindString(6, str6);
            }
            if (l3 == null) {
                bindNull(7);
            } else {
                bindLong(7, l3.longValue());
            }
            if (gcp2 == null) {
                bindNull(8);
            } else {
                bindLong(8, ((Long) this.feedModelFactory.lastSnapTypeAdapter.encode(gcp2)).longValue());
            }
            bindLong(9, j);
            if (bool == null) {
                bindNull(10);
            } else {
                if (!bool.booleanValue()) {
                    j3 = 0;
                }
                bindLong(10, j3);
            }
            bindLong(11, j2);
        }
    }

    public static final class UpdateClearedTimestampIfMoreRecent extends ainy {
        public UpdateClearedTimestampIfMoreRecent(pa paVar) {
            super(FeedModel.TABLE_NAME, paVar.a("UPDATE Feed\nSET clearedTimestamp = ?\nWHERE _id = ? AND clearedTimestamp < ?"));
        }

        public final void bind(Long l, long j, Long l2) {
            if (l == null) {
                bindNull(1);
            } else {
                bindLong(1, l.longValue());
            }
            bindLong(2, j);
            if (l2 == null) {
                bindNull(3);
            } else {
                bindLong(3, l2.longValue());
            }
        }
    }

    public static final class UpdateLatestInteractionTimestampIfMoreRecent extends ainy {
        public UpdateLatestInteractionTimestampIfMoreRecent(pa paVar) {
            super(FeedModel.TABLE_NAME, paVar.a("UPDATE Feed\nSET lastInteractionTimestamp = ?\nWHERE _id = ? AND lastInteractionTimestamp < ?"));
        }

        public final void bind(Long l, long j, Long l2) {
            if (l == null) {
                bindNull(1);
            } else {
                bindLong(1, l.longValue());
            }
            bindLong(2, j);
            if (l2 == null) {
                bindNull(3);
            } else {
                bindLong(3, l2.longValue());
            }
        }
    }

    public static final class UpdateAuthTokenForFeed extends ainy {
        public UpdateAuthTokenForFeed(pa paVar) {
            super(FeedModel.TABLE_NAME, paVar.a("UPDATE Feed\nSET authToken = ?\nWHERE _id = ?"));
        }

        public final void bind(byte[] bArr, long j) {
            if (bArr == null) {
                bindNull(1);
            } else {
                bindBlob(1, bArr);
            }
            bindLong(2, j);
        }
    }

    public static final class UpdateHidden extends ainy {
        public UpdateHidden(pa paVar) {
            super(FeedModel.TABLE_NAME, paVar.a("UPDATE Feed\nSET hidden = ?\nWHERE _id = ?"));
        }

        public final void bind(Boolean bool, long j) {
            if (bool == null) {
                bindNull(1);
            } else {
                bindLong(1, bool.booleanValue() ? 1 : 0);
            }
            bindLong(2, j);
        }
    }

    public static final class UpdateDisplayInfo extends ainy {
        public UpdateDisplayInfo(pa paVar) {
            super(FeedModel.TABLE_NAME, paVar.a("UPDATE Feed\nSET\ndisplayTimestamp=?,\ndisplayInteractionType=?,\nlastInteractionTimestamp=MAX(?, coalesce(lastInteractionTimestamp, 0)),\nlastInteractionUserId=?,\nlastInteractionWriterId=?,\nsortingTimestamp=?,\nisTemporaryGroup=0\nWHERE _id = ?"));
        }

        public final void bind(long j, String str, Object obj, Long l, Long l2, long j2, long j3) {
            bindLong(1, j);
            if (str == null) {
                bindNull(2);
            } else {
                bindString(2, str);
            }
            if (obj == null) {
                bindNull(3);
            } else if (obj instanceof String) {
                bindString(3, (String) obj);
            } else if ((obj instanceof Float) || (obj instanceof Double)) {
                bindDouble(3, ((Double) obj).doubleValue());
            } else {
                long longValue;
                if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Long)) {
                    longValue = ((Long) obj).longValue();
                } else if (obj instanceof Boolean) {
                    longValue = ((Boolean) obj).booleanValue() ? 1 : 0;
                } else if (obj instanceof byte[]) {
                    bindBlob(3, (byte[]) obj);
                } else {
                    throw new IllegalArgumentException("Attempting to bind an object that is not one of (String, Integer, Short, Long, Float, Double, Boolean, byte[]) to argument arg3");
                }
                bindLong(3, longValue);
            }
            if (l == null) {
                bindNull(4);
            } else {
                bindLong(4, l.longValue());
            }
            if (l2 == null) {
                bindNull(5);
            } else {
                bindLong(5, l2.longValue());
            }
            bindLong(6, j2);
            bindLong(7, j3);
        }
    }

    public interface GetBasicFeedInfoByIdModel {
        long _id();

        String feedDisplayName();

        String friendAvatarId();

        String friendDisplayName();

        Long friendLastReadTimestamp();

        Long friendRowId();

        String friendSelfiedId();

        String friendUserName();

        boolean isTemporaryGroup();

        String key();

        FeedKind kind();

        String lastWriterUsername();

        long messageRetentionInMinutes();

        long participantsSize();

        String specifiedName();

        Long storyLatestExpirationTimestamp();

        Long storyLatestTimestamp();

        Boolean storyMuted();

        Long storyRowId();

        Boolean storyViewed();
    }

    public interface GetConversationStateModel {
        long _id();

        Long clearedTimestamp();

        boolean cognacNotificationMuted();

        boolean isTemporaryGroup();

        String key();

        long messageRetentionInMinutes();

        long myReceivedSnapReleaseTimestamp();

        long mySentSnapReleaseTimestamp();

        Boolean notificationMuted();
    }

    public interface GetDisplayNameByMobStoryIdModel {
        String displayName();

        String mobStoryId();
    }

    public interface GetGroupVersionsForKeysModel {
        long groupVersion();

        String key();
    }

    public interface SelectMembersForAvatarPickerModel {
        String bitmojiAvatarId();

        String username();
    }

    public static final class Mapper<T extends FeedModel> implements ainw<T> {
        private final Factory<T> feedModelFactory;

        public Mapper(Factory<T> factory) {
            this.feedModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            int i;
            Boolean bool2;
            Boolean bool3;
            Cursor cursor2 = cursor;
            Creator creator = this.feedModelFactory.creator;
            long j = cursor2.getLong(0);
            String string = cursor2.getString(1);
            String string2 = cursor2.isNull(2) ? null : cursor2.getString(2);
            String string3 = cursor2.isNull(3) ? null : cursor2.getString(3);
            String string4 = cursor2.isNull(4) ? null : cursor2.getString(4);
            long j2 = cursor2.getLong(5);
            Long valueOf = cursor2.isNull(6) ? null : Long.valueOf(cursor2.getLong(6));
            String string5 = cursor2.isNull(7) ? null : cursor2.getString(7);
            long j3 = cursor2.getLong(8);
            String string6 = cursor2.isNull(9) ? null : cursor2.getString(9);
            long j4 = cursor2.getLong(10);
            Long valueOf2 = cursor2.isNull(11) ? null : Long.valueOf(cursor2.getLong(11));
            Long valueOf3 = cursor2.isNull(12) ? null : Long.valueOf(cursor2.getLong(12));
            Long valueOf4 = cursor2.isNull(13) ? null : Long.valueOf(cursor2.getLong(13));
            Long valueOf5 = cursor2.isNull(14) ? null : Long.valueOf(cursor2.getLong(14));
            long j5 = cursor2.getLong(15);
            long j6 = cursor2.getLong(16);
            Long valueOf6 = cursor2.isNull(17) ? null : Long.valueOf(cursor2.getLong(17));
            long j7 = cursor2.getLong(18);
            Long valueOf7 = cursor2.isNull(19) ? null : Long.valueOf(cursor2.getLong(19));
            String string7 = cursor2.isNull(20) ? null : cursor2.getString(20);
            Long valueOf8 = cursor2.isNull(21) ? null : Long.valueOf(cursor2.getLong(21));
            String string8 = cursor2.isNull(22) ? null : cursor2.getString(22);
            String string9 = cursor2.isNull(23) ? null : cursor2.getString(23);
            Long valueOf9 = cursor2.isNull(24) ? null : Long.valueOf(cursor2.getLong(24));
            Long valueOf10 = cursor2.isNull(25) ? null : Long.valueOf(cursor2.getLong(25));
            gcp gcp = cursor2.isNull(26) ? null : (gcp) this.feedModelFactory.lastSnapTypeAdapter.decode(Long.valueOf(cursor2.getLong(26)));
            Long valueOf11 = cursor2.isNull(27) ? null : Long.valueOf(cursor2.getLong(27));
            String string10 = cursor2.isNull(28) ? null : cursor2.getString(28);
            if (cursor2.isNull(29)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(29) == 1);
            }
            byte[] blob = cursor2.isNull(30) ? null : cursor2.getBlob(30);
            boolean z = cursor2.getInt(31) == 1;
            gcg gcg = (gcg) this.feedModelFactory.groupSyncContentTypeAdapter.decode(Long.valueOf(cursor2.getLong(32)));
            long j8 = cursor2.getLong(33);
            long j9 = cursor2.getLong(34);
            FeedKind feedKind = (FeedKind) this.feedModelFactory.kindAdapter.decode(Long.valueOf(cursor2.getLong(35)));
            if (cursor2.isNull(36)) {
                i = 1;
                bool2 = null;
            } else {
                i = 1;
                bool2 = Boolean.valueOf(cursor2.getInt(36) == 1);
            }
            boolean z2 = cursor2.getInt(37) == i;
            String string11 = cursor2.isNull(38) ? null : cursor2.getString(38);
            boolean z3 = cursor2.getInt(39) == 1;
            boolean z4 = cursor2.getInt(40) == 1;
            if (cursor2.isNull(41)) {
                bool3 = null;
            } else {
                bool3 = Boolean.valueOf(cursor2.getInt(41) == 1);
            }
            return creator.create(j, string, string2, string3, string4, j2, valueOf, string5, j3, string6, j4, valueOf2, valueOf3, valueOf4, valueOf5, j5, j6, valueOf6, j7, valueOf7, string7, valueOf8, string8, string9, valueOf9, valueOf10, gcp, valueOf11, string10, bool, blob, z, gcg, j8, j9, feedKind, bool2, z2, string11, z3, z4, bool3, cursor2.getLong(42));
        }
    }

    public static final class DeleteAllFeedData extends ainy {
        public DeleteAllFeedData(pa paVar) {
            super(FeedModel.TABLE_NAME, paVar.a("DELETE FROM Feed"));
        }
    }

    public static final class DeleteConversation extends ainy {
        public DeleteConversation(pa paVar) {
            super(FeedModel.TABLE_NAME, paVar.a("DELETE FROM Feed\nWHERE _id = ?"));
        }

        public final void bind(long j) {
            bindLong(1, j);
        }
    }

    public static final class DeleteLocalTemporaryGroups extends ainy {
        public DeleteLocalTemporaryGroups(pa paVar) {
            super(FeedModel.TABLE_NAME, paVar.a("DELETE FROM Feed\nWHERE isTemporaryGroup = 1"));
        }
    }

    public static final class IncrementStorySkipCount extends ainy {
        public IncrementStorySkipCount(pa paVar) {
            super(FeedModel.TABLE_NAME, paVar.a("UPDATE Feed\nSET storySkipCount = storySkipCount + 1\nWHERE _id = ?"));
        }

        public final void bind(long j) {
            bindLong(1, j);
        }
    }

    public static final class InsertConversation extends ainy {
        private final Factory<? extends FeedModel> feedModelFactory;

        public InsertConversation(pa paVar, Factory<? extends FeedModel> factory) {
            super(FeedModel.TABLE_NAME, paVar.a("INSERT INTO Feed(\n    key,\n    lastInteractionTimestamp,\n    lastWriter,\n    lastWriteType,\n    lastWriteTimestamp,\n    lastReader,\n    lastReadTimestamp,\n    clearedTimestamp,\n    lastSnapType,\n    friendRowId,\n    iterToken,\n    messageRetentionInMinutes,\n    kind,\n    notificationMuted,\n    cognacNotificationMuted,\n    storyRowId)\nVALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ?, ?,\n(SELECT _id FROM Story WHERE storyId=? AND kind=0)\n)"));
            this.feedModelFactory = factory;
        }

        public final void bind(String str, Long l, String str2, String str3, Long l2, String str4, Long l3, Long l4, gcp gcp, Long l5, String str5, long j, Boolean bool, boolean z, String str6) {
            String str7 = str2;
            String str8 = str3;
            String str9 = str4;
            gcp gcp2 = gcp;
            String str10 = str5;
            String str11 = str;
            bindString(1, str);
            if (l == null) {
                bindNull(2);
            } else {
                bindLong(2, l.longValue());
            }
            if (str7 == null) {
                bindNull(3);
            } else {
                bindString(3, str2);
            }
            if (str8 == null) {
                bindNull(4);
            } else {
                bindString(4, str3);
            }
            if (l2 == null) {
                bindNull(5);
            } else {
                bindLong(5, l2.longValue());
            }
            if (str9 == null) {
                bindNull(6);
            } else {
                bindString(6, str4);
            }
            if (l3 == null) {
                bindNull(7);
            } else {
                bindLong(7, l3.longValue());
            }
            if (l4 == null) {
                bindNull(8);
            } else {
                bindLong(8, l4.longValue());
            }
            if (gcp2 == null) {
                bindNull(9);
            } else {
                bindLong(9, ((Long) this.feedModelFactory.lastSnapTypeAdapter.encode(gcp2)).longValue());
            }
            if (l5 == null) {
                bindNull(10);
            } else {
                bindLong(10, l5.longValue());
            }
            if (str10 == null) {
                bindNull(11);
            } else {
                bindString(11, str10);
            }
            bindLong(12, j);
            long j2 = 1;
            if (bool == null) {
                bindNull(13);
            } else {
                bindLong(13, bool.booleanValue() ? 1 : 0);
            }
            if (!z) {
                j2 = 0;
            }
            bindLong(14, j2);
            bindString(15, str6);
        }
    }

    public static final class InsertConversationIfNotExists extends ainy {
        private final Factory<? extends FeedModel> feedModelFactory;

        public InsertConversationIfNotExists(pa paVar, Factory<? extends FeedModel> factory) {
            super(FeedModel.TABLE_NAME, paVar.a("INSERT OR IGNORE INTO Feed(\n    key,\n    lastInteractionTimestamp,\n    lastWriter,\n    lastWriteType,\n    lastWriteTimestamp,\n    lastReader,\n    lastReadTimestamp,\n    clearedTimestamp,\n    lastSnapType,\n    friendRowId,\n    iterToken,\n    messageRetentionInMinutes,\n    kind,\n    notificationMuted,\n    cognacNotificationMuted,\n    isArroyo,\n    storyRowId)\nVALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ?, ?, ?,\n(SELECT _id FROM Story WHERE storyId=? AND kind=0)\n)"));
            this.feedModelFactory = factory;
        }

        public final void bind(String str, Long l, String str2, String str3, Long l2, String str4, Long l3, Long l4, gcp gcp, Long l5, String str5, long j, Boolean bool, boolean z, boolean z2, String str6) {
            String str7 = str2;
            String str8 = str3;
            String str9 = str4;
            gcp gcp2 = gcp;
            String str10 = str5;
            String str11 = str;
            bindString(1, str);
            if (l == null) {
                bindNull(2);
            } else {
                bindLong(2, l.longValue());
            }
            if (str7 == null) {
                bindNull(3);
            } else {
                bindString(3, str2);
            }
            if (str8 == null) {
                bindNull(4);
            } else {
                bindString(4, str3);
            }
            if (l2 == null) {
                bindNull(5);
            } else {
                bindLong(5, l2.longValue());
            }
            if (str9 == null) {
                bindNull(6);
            } else {
                bindString(6, str4);
            }
            if (l3 == null) {
                bindNull(7);
            } else {
                bindLong(7, l3.longValue());
            }
            if (l4 == null) {
                bindNull(8);
            } else {
                bindLong(8, l4.longValue());
            }
            if (gcp2 == null) {
                bindNull(9);
            } else {
                bindLong(9, ((Long) this.feedModelFactory.lastSnapTypeAdapter.encode(gcp2)).longValue());
            }
            if (l5 == null) {
                bindNull(10);
            } else {
                bindLong(10, l5.longValue());
            }
            if (str10 == null) {
                bindNull(11);
            } else {
                bindString(11, str10);
            }
            bindLong(12, j);
            long j2 = 1;
            if (bool == null) {
                bindNull(13);
            } else {
                bindLong(13, bool.booleanValue() ? 1 : 0);
            }
            bindLong(14, z ? 1 : 0);
            if (!z2) {
                j2 = 0;
            }
            bindLong(15, j2);
            bindString(16, str6);
        }
    }

    public static final class InsertGroup extends ainy {
        private final Factory<? extends FeedModel> feedModelFactory;

        public InsertGroup(pa paVar, Factory<? extends FeedModel> factory) {
            super(FeedModel.TABLE_NAME, paVar.a("INSERT INTO Feed(\n    key,\n    specifiedName,\n    lastInteractionTimestamp,\n    iterToken,\n    groupStoryMuted,\n    laterContentExists,\n    groupSyncContentType,\n    kind,\n    notificationMuted,\n    cognacNotificationMuted,\n    storyRowId,\n    groupMobId,\n    hidden,\n    groupCreationTimestamp)\nVALUES(?1, ?2, ?3, ?4, ?5, ?6, ?7, 1, ?8, ?9,\n    (SELECT _id FROM Story WHERE storyId=?10 AND kind=1),\n    ?11,\n    (?7 = 0), -- hidden if groupSyncContentType=0\n    ?12\n)"));
            this.feedModelFactory = factory;
        }

        public final void bind(String str, String str2, Long l, String str3, Boolean bool, boolean z, gcg gcg, Boolean bool2, boolean z2, String str4, String str5, Long l2) {
            bindString(1, str);
            if (str2 == null) {
                bindNull(2);
            } else {
                bindString(2, str2);
            }
            if (l == null) {
                bindNull(3);
            } else {
                bindLong(3, l.longValue());
            }
            if (str3 == null) {
                bindNull(4);
            } else {
                bindString(4, str3);
            }
            long j = 1;
            if (bool == null) {
                bindNull(5);
            } else {
                bindLong(5, bool.booleanValue() ? 1 : 0);
            }
            bindLong(6, z ? 1 : 0);
            bindLong(7, ((Long) this.feedModelFactory.groupSyncContentTypeAdapter.encode(gcg)).longValue());
            if (bool2 == null) {
                bindNull(8);
            } else {
                bindLong(8, bool2.booleanValue() ? 1 : 0);
            }
            if (!z2) {
                j = 0;
            }
            bindLong(9, j);
            bindString(10, str4);
            if (str5 == null) {
                bindNull(11);
            } else {
                bindString(11, str5);
            }
            if (l2 == null) {
                bindNull(12);
            } else {
                bindLong(12, l2.longValue());
            }
        }
    }

    public static final class InsertGroupIfNotExists extends ainy {
        private final Factory<? extends FeedModel> feedModelFactory;

        public InsertGroupIfNotExists(pa paVar, Factory<? extends FeedModel> factory) {
            super(FeedModel.TABLE_NAME, paVar.a("INSERT OR IGNORE INTO Feed(\n    key,\n    specifiedName,\n    lastInteractionTimestamp,\n    iterToken,\n    groupStoryMuted,\n    laterContentExists,\n    groupSyncContentType,\n    kind,\n    notificationMuted,\n    cognacNotificationMuted,\n    participantsSize,\n    isTemporaryGroup,\n    isArroyo,\n    storyRowId,\n    hidden,\n    sourcePage)\nVALUES(?1, ?2, ?3, ?4, ?5, ?6, ?7, 1, ?8, ?9, ?10, ?11, ?12,\n    (SELECT _id FROM Story WHERE storyId=?13 AND kind=1),\n    (?7 = 0), -- hidden if groupSyncContentType=0\n    ?14\n)"));
            this.feedModelFactory = factory;
        }

        public final void bind(String str, String str2, Long l, String str3, Boolean bool, boolean z, gcg gcg, Boolean bool2, boolean z2, long j, boolean z3, boolean z4, String str4, long j2) {
            String str5 = str2;
            String str6 = str3;
            String str7 = str;
            bindString(1, str);
            if (str5 == null) {
                bindNull(2);
            } else {
                bindString(2, str2);
            }
            if (l == null) {
                bindNull(3);
            } else {
                bindLong(3, l.longValue());
            }
            if (str6 == null) {
                bindNull(4);
            } else {
                bindString(4, str3);
            }
            long j3 = 1;
            if (bool == null) {
                bindNull(5);
            } else {
                bindLong(5, bool.booleanValue() ? 1 : 0);
            }
            bindLong(6, z ? 1 : 0);
            gcg gcg2 = gcg;
            bindLong(7, ((Long) this.feedModelFactory.groupSyncContentTypeAdapter.encode(gcg)).longValue());
            if (bool2 == null) {
                bindNull(8);
            } else {
                bindLong(8, bool2.booleanValue() ? 1 : 0);
            }
            bindLong(9, z2 ? 1 : 0);
            bindLong(10, j);
            bindLong(11, z3 ? 1 : 0);
            if (!z4) {
                j3 = 0;
            }
            bindLong(12, j3);
            bindString(13, str4);
            bindLong(14, j2);
        }
    }

    public static final class InsertGroupStory extends ainy {
        public InsertGroupStory(pa paVar) {
            super(FeedModel.TABLE_NAME, paVar.a("INSERT INTO Feed(\n    key,\n    specifiedName,\n    storyRowId,\n    kind)\nVALUES(?, ?, ?, 1)"));
        }

        public final void bind(String str, String str2, Long l) {
            bindString(1, str);
            if (str2 == null) {
                bindNull(2);
            } else {
                bindString(2, str2);
            }
            if (l == null) {
                bindNull(3);
            } else {
                bindLong(3, l.longValue());
            }
        }
    }

    public static final class ResetStorySkipCount extends ainy {
        public ResetStorySkipCount(pa paVar) {
            super(FeedModel.TABLE_NAME, paVar.a("UPDATE Feed\nSET storySkipCount = 0\nWHERE _id = ?"));
        }

        public final void bind(long j) {
            bindLong(1, j);
        }
    }

    public static final class SetCognacNotificationMuted extends ainy {
        public SetCognacNotificationMuted(pa paVar) {
            super(FeedModel.TABLE_NAME, paVar.a("UPDATE Feed\nSET cognacNotificationMuted = ?\nWHERE key = ?"));
        }

        public final void bind(boolean z, String str) {
            bindLong(1, z ? 1 : 0);
            bindString(2, str);
        }
    }

    public static final class SetGroupCreationRequestId extends ainy {
        public SetGroupCreationRequestId(pa paVar) {
            super(FeedModel.TABLE_NAME, paVar.a("UPDATE Feed\nSET groupCreationRequestId = ?1\nWHERE key = ?2"));
        }

        public final void bind(String str, String str2) {
            if (str == null) {
                bindNull(1);
            } else {
                bindString(1, str);
            }
            bindString(2, str2);
        }
    }

    public static final class SetGroupStoryMuted extends ainy {
        public SetGroupStoryMuted(pa paVar) {
            super(FeedModel.TABLE_NAME, paVar.a("UPDATE Feed\nSET groupStoryMuted = ?\nWHERE key = ?"));
        }

        public final void bind(Boolean bool, String str) {
            if (bool == null) {
                bindNull(1);
            } else {
                bindLong(1, bool.booleanValue() ? 1 : 0);
            }
            bindString(2, str);
        }
    }

    public static final class SetMessageRetentionInMinutes extends ainy {
        public SetMessageRetentionInMinutes(pa paVar) {
            super(FeedModel.TABLE_NAME, paVar.a("UPDATE Feed\nSET messageRetentionInMinutes = ?\nWHERE key = ?"));
        }

        public final void bind(long j, String str) {
            bindLong(1, j);
            bindString(2, str);
        }
    }

    public static final class SetNotificationMuted extends ainy {
        public SetNotificationMuted(pa paVar) {
            super(FeedModel.TABLE_NAME, paVar.a("UPDATE Feed\nSET notificationMuted = ?\nWHERE key = ?"));
        }

        public final void bind(Boolean bool, String str) {
            if (bool == null) {
                bindNull(1);
            } else {
                bindLong(1, bool.booleanValue() ? 1 : 0);
            }
            bindString(2, str);
        }
    }

    public static final class UpdateConversationReader extends ainy {
        public UpdateConversationReader(pa paVar) {
            super(FeedModel.TABLE_NAME, paVar.a("UPDATE Feed\nSET\nlastReadTimestamp = ?,\nlastReader = ?\nWHERE _id = ? AND lastWriter != ?"));
        }

        public final void bind(Long l, String str, long j, String str2) {
            if (l == null) {
                bindNull(1);
            } else {
                bindLong(1, l.longValue());
            }
            if (str == null) {
                bindNull(2);
            } else {
                bindString(2, str);
            }
            bindLong(3, j);
            if (str2 == null) {
                bindNull(4);
            } else {
                bindString(4, str2);
            }
        }
    }

    public static final class UpdateConversationWriter extends ainy {
        private final Factory<? extends FeedModel> feedModelFactory;

        public UpdateConversationWriter(pa paVar, Factory<? extends FeedModel> factory) {
            super(FeedModel.TABLE_NAME, paVar.a("UPDATE Feed\nSET\nlastWriteTimestamp = ?1,\nlastWriteType = ?2,\nlastWriter = ?3,\nlastSnapType = ?4\nWHERE _id = ?5"));
            this.feedModelFactory = factory;
        }

        public final void bind(Long l, String str, String str2, gcp gcp, long j) {
            if (l == null) {
                bindNull(1);
            } else {
                bindLong(1, l.longValue());
            }
            if (str == null) {
                bindNull(2);
            } else {
                bindString(2, str);
            }
            if (str2 == null) {
                bindNull(3);
            } else {
                bindString(3, str2);
            }
            if (gcp == null) {
                bindNull(4);
            } else {
                bindLong(4, ((Long) this.feedModelFactory.lastSnapTypeAdapter.encode(gcp)).longValue());
            }
            bindLong(5, j);
        }
    }

    public static final class UpdateGroup extends ainy {
        public UpdateGroup(pa paVar) {
            super(FeedModel.TABLE_NAME, paVar.a("UPDATE Feed\nSET displayTimestamp=?,\n    specifiedName=?,\n    iterToken=?,\n    groupStoryMuted=?,\n    laterContentExists=?,\n    key=?,\n    groupMobId=?\nWHERE _id = ?"));
        }

        public final void bind(long j, String str, String str2, Boolean bool, boolean z, String str3, String str4, long j2) {
            bindLong(1, j);
            if (str == null) {
                bindNull(2);
            } else {
                bindString(2, str);
            }
            if (str2 == null) {
                bindNull(3);
            } else {
                bindString(3, str2);
            }
            j = 1;
            if (bool == null) {
                bindNull(4);
            } else {
                bindLong(4, bool.booleanValue() ? 1 : 0);
            }
            if (!z) {
                j = 0;
            }
            bindLong(5, j);
            bindString(6, str3);
            if (str4 == null) {
                bindNull(7);
            } else {
                bindString(7, str4);
            }
            bindLong(8, j2);
        }
    }

    public static final class UpdateGroupDisplayName extends ainy {
        public UpdateGroupDisplayName(pa paVar) {
            super(FeedModel.TABLE_NAME, paVar.a("UPDATE Feed\nSET specifiedName = ?\nWHERE _id = ? AND kind = 1"));
        }

        public final void bind(String str, long j) {
            if (str == null) {
                bindNull(1);
            } else {
                bindString(1, str);
            }
            bindLong(2, j);
        }
    }

    public static final class UpdateGroupId extends ainy {
        public UpdateGroupId(pa paVar) {
            super(FeedModel.TABLE_NAME, paVar.a("UPDATE Feed\nSET key = ?1\nWHERE _id = ?2 AND kind = 1"));
        }

        public final void bind(String str, long j) {
            bindString(1, str);
            bindLong(2, j);
        }
    }

    public static final class UpdateGroupStory extends ainy {
        public UpdateGroupStory(pa paVar) {
            super(FeedModel.TABLE_NAME, paVar.a("UPDATE Feed\nSET\nstoryRowId = ?\nWHERE key = ? AND kind=1"));
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

    public static final class UpdateGroupSyncContentType extends ainy {
        private final Factory<? extends FeedModel> feedModelFactory;

        public UpdateGroupSyncContentType(pa paVar, Factory<? extends FeedModel> factory) {
            super(FeedModel.TABLE_NAME, paVar.a("UPDATE Feed\nSET\ngroupSyncContentType = ?1,\nhidden = (?1 = 0)\nWHERE _id = ?2"));
            this.feedModelFactory = factory;
        }

        public final void bind(gcg gcg, long j) {
            bindLong(1, ((Long) this.feedModelFactory.groupSyncContentTypeAdapter.encode(gcg)).longValue());
            bindLong(2, j);
        }
    }

    public static final class UpdateGroupVersion extends ainy {
        public UpdateGroupVersion(pa paVar) {
            super(FeedModel.TABLE_NAME, paVar.a("UPDATE Feed\nSET groupVersion = ?\nWHERE _id = ?"));
        }

        public final void bind(long j, long j2) {
            bindLong(1, j);
            bindLong(2, j2);
        }
    }

    public static final class UpdateParticipantString extends ainy {
        public UpdateParticipantString(pa paVar) {
            super(FeedModel.TABLE_NAME, paVar.a("UPDATE Feed\nSET participantString = ?1, fitScreenParticipantString = ?2, participantsSize = ?3\nWHERE Feed._id = ?4"));
        }

        public final void bind(String str, String str2, long j, long j2) {
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
            bindLong(3, j);
            bindLong(4, j2);
        }
    }

    public static final class UpdateReceivedReleaseTimestampIfMoreRecent extends ainy {
        public UpdateReceivedReleaseTimestampIfMoreRecent(pa paVar) {
            super(FeedModel.TABLE_NAME, paVar.a("UPDATE Feed\nSET myReceivedSnapReleaseTimestamp = ?\nWHERE _id = ? AND myReceivedSnapReleaseTimestamp < ?"));
        }

        public final void bind(long j, long j2, long j3) {
            bindLong(1, j);
            bindLong(2, j2);
            bindLong(3, j3);
        }
    }

    public static final class UpdateSentReleaseTimestampIfMoreRecent extends ainy {
        public UpdateSentReleaseTimestampIfMoreRecent(pa paVar) {
            super(FeedModel.TABLE_NAME, paVar.a("UPDATE Feed\nSET mySentSnapReleaseTimestamp = ?\nWHERE _id = ? AND mySentSnapReleaseTimestamp < ?"));
        }

        public final void bind(long j, long j2, long j3) {
            bindLong(1, j);
            bindLong(2, j2);
            bindLong(3, j3);
        }
    }

    public static final class UpdateSortingTimestampIfMoreRecent extends ainy {
        public UpdateSortingTimestampIfMoreRecent(pa paVar) {
            super(FeedModel.TABLE_NAME, paVar.a("UPDATE Feed\nSET sortingTimestamp = ?1\nWHERE _id = ?2 AND sortingTimestamp < ?3"));
        }

        public final void bind(long j, long j2, long j3) {
            bindLong(1, j);
            bindLong(2, j2);
            bindLong(3, j3);
        }
    }

    public static final class UpdateTemporaryGroupById extends ainy {
        public UpdateTemporaryGroupById(pa paVar) {
            super(FeedModel.TABLE_NAME, paVar.a("UPDATE Feed\nSET isTemporaryGroup = ?\nWHERE _id = ?"));
        }

        public final void bind(boolean z, long j) {
            bindLong(1, z ? 1 : 0);
            bindLong(2, j);
        }
    }

    long _id();

    byte[] authToken();

    Long clearedTimestamp();

    boolean cognacNotificationMuted();

    String displayInteractionType();

    long displayTimestamp();

    String fitScreenParticipantString();

    Long friendLastReadTimestamp();

    Long friendRowId();

    String groupCreationRequestId();

    Long groupCreationTimestamp();

    String groupMobId();

    Boolean groupStoryMuted();

    gcg groupSyncContentType();

    long groupVersion();

    Boolean hidden();

    boolean isArroyo();

    boolean isTemporaryGroup();

    String iterToken();

    String key();

    FeedKind kind();

    Long lastInteractionTimestamp();

    Long lastInteractionUserId();

    Long lastInteractionWriterId();

    Long lastReadTimestamp();

    String lastReader();

    gcp lastSnapType();

    Long lastWriteTimestamp();

    String lastWriteType();

    String lastWriter();

    boolean laterContentExists();

    long messageRetentionInMinutes();

    Long myLastReadTimestamp();

    long myReceivedSnapReleaseTimestamp();

    long mySentSnapReleaseTimestamp();

    Boolean notificationMuted();

    String participantString();

    long participantsSize();

    long sortingTimestamp();

    long sourcePage();

    String specifiedName();

    Long storyRowId();

    long storySkipCount();
}
