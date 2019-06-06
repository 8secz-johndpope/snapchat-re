package com.snap.core.db.record;

import android.database.Cursor;
import com.snap.core.db.column.CalendarDate;
import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.column.Friendmojis;
import defpackage.ainu;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.ainz;
import defpackage.aioa;
import defpackage.pa;
import defpackage.pc;

public interface FriendModel {
    @Deprecated
    public static final String ADDEDTIMESTAMP = "addedTimestamp";
    public static final String ADDFRIENDMOJICATEGORIES = "ALTER TABLE Friend\nADD COLUMN friendmojiCategories TEXT";
    public static final String ADDISOFFICIAL = "ALTER TABLE Friend\nADD COLUMN isOfficial INTEGER NOT NULL DEFAULT 0";
    public static final String ADDISPOPULAR = "ALTER TABLE Friend\nADD COLUMN isPopular INTEGER NOT NULL DEFAULT 0";
    public static final String ADDSNAPPROID = "ALTER TABLE Friend\nADD COLUMN snapProId TEXT";
    @Deprecated
    public static final String BIRTHDAY = "birthday";
    @Deprecated
    public static final String BITMOJIAVATARID = "bitmojiAvatarId";
    @Deprecated
    public static final String BITMOJISELFIEID = "bitmojiSelfieId";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS Friend(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    _lastModifiedTimestamp INTEGER,\n    username TEXT NOT NULL UNIQUE,\n    userId TEXT,\n\n    displayName TEXT,\n    bitmojiAvatarId TEXT,\n    bitmojiSelfieId TEXT,\n    friendmojis TEXT,\n    friendmojiCategories TEXT, -- comma separated list of friendmoji categories returned by the server.\n    phone TEXT,\n    score INTEGER,\n--      Birthday as a long consisting of two integers representing the month and day.\n    birthday INTEGER,\n    sentToMe INTEGER,\n    receivedFromMe INTEGER,\n    addedTimestamp INTEGER,  -- timestamp WHEN the 'FROM user' added the 'TO user'\n    reverseAddedTimestamp INTEGER,  -- timestamp WHEN the 'TO user' added the 'FROM user'\n\n    lastMessageId INTEGER,\n\n    unreadCount INTEGER,\n    friendmojiString INTEGER,\n    serverDisplayName TEXT,\n\n    streakLength INTEGER,\n    streakExpiration INTEGER,\n    friendLinkType INTEGER,\n\n    storyMuted INTEGER NOT NULL DEFAULT 0,\n\n    isPopular INTEGER NOT NULL DEFAULT 0,\n    isOfficial INTEGER NOT NULL DEFAULT 0,\n\n    isFideliusReady INTEGER NOT NULL DEFAULT 1,\n\n    snapProId TEXT\n)";
    @Deprecated
    public static final String DISPLAYNAME = "displayName";
    @Deprecated
    public static final String FRIENDLINKTYPE = "friendLinkType";
    @Deprecated
    public static final String FRIENDMOJICATEGORIES = "friendmojiCategories";
    @Deprecated
    public static final String FRIENDMOJIS = "friendmojis";
    @Deprecated
    public static final String FRIENDMOJISTRING = "friendmojiString";
    @Deprecated
    public static final String ISFIDELIUSREADY = "isFideliusReady";
    @Deprecated
    public static final String ISOFFICIAL = "isOfficial";
    @Deprecated
    public static final String ISPOPULAR = "isPopular";
    @Deprecated
    public static final String LASTMESSAGEID = "lastMessageId";
    @Deprecated
    public static final String PHONE = "phone";
    @Deprecated
    public static final String RECEIVEDFROMME = "receivedFromMe";
    @Deprecated
    public static final String REVERSEADDEDTIMESTAMP = "reverseAddedTimestamp";
    @Deprecated
    public static final String SCORE = "score";
    @Deprecated
    public static final String SENTTOME = "sentToMe";
    @Deprecated
    public static final String SERVERDISPLAYNAME = "serverDisplayName";
    @Deprecated
    public static final String SNAPPROID = "snapProId";
    @Deprecated
    public static final String STORYMUTED = "storyMuted";
    @Deprecated
    public static final String STREAKEXPIRATION = "streakExpiration";
    @Deprecated
    public static final String STREAKLENGTH = "streakLength";
    @Deprecated
    public static final String TABLE_NAME = "Friend";
    @Deprecated
    public static final String UNREADCOUNT = "unreadCount";
    @Deprecated
    public static final String USERID = "userId";
    @Deprecated
    public static final String USERNAME = "username";
    @Deprecated
    public static final String _ID = "_id";
    @Deprecated
    public static final String _LASTMODIFIEDTIMESTAMP = "_lastModifiedTimestamp";

    public interface SelectExistingUserDataModel {
        long _id();

        String displayName();

        FriendLinkType friendLinkType();

        String userId();

        String username();
    }

    public interface SelectIdForKeysModel {
        long _id();

        String username();
    }

    public interface Creator<T extends FriendModel> {
        T create(long j, Long l, String str, String str2, String str3, String str4, String str5, Friendmojis friendmojis, String str6, String str7, Long l2, CalendarDate calendarDate, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, String str8, Integer num, Long l10, FriendLinkType friendLinkType, boolean z, boolean z2, boolean z3, boolean z4, String str9);
    }

    public interface SelectIdForKeysCreator<T extends SelectIdForKeysModel> {
        T create(long j, String str);
    }

    public interface SelectAllFriendUserScoresCreator<T extends SelectAllFriendUserScoresModel> {
        T create(long j, Long l, String str);
    }

    public interface SelectDisplayNameForUsernameCreator<T extends SelectDisplayNameForUsernameModel> {
        T create(long j, String str);
    }

    public interface SelectExistingUserDataCreator<T extends SelectExistingUserDataModel> {
        T create(long j, String str, String str2, String str3, FriendLinkType friendLinkType);
    }

    public interface SelectBlockedFriendCreator<T extends SelectBlockedFriendModel> {
        T create(long j, String str, String str2, String str3, Long l, Long l2);
    }

    public interface SelectBitmojiForUsernameCreator<T extends SelectBitmojiForUsernameModel> {
        T create(String str, String str2);
    }

    public interface SelectFriendLinkTypesByUsernamesCreator<T extends SelectFriendLinkTypesByUsernamesModel> {
        T create(String str, FriendLinkType friendLinkType);
    }

    public interface SelectFriendLinkTypesByUserIdsCreator<T extends SelectFriendLinkTypesByUserIdsModel> {
        T create(String str, FriendLinkType friendLinkType);
    }

    public interface SelectFriendsAndAddedTimestampsByLinkTypeAddedBeforeCreator<T extends SelectFriendsAndAddedTimestampsByLinkTypeAddedBeforeModel> {
        T create(String str, Long l);
    }

    public interface SelectUserNameByUserIdsCreator<T extends SelectUserNameByUserIdsModel> {
        T create(String str, String str2);
    }

    public interface SelectUserNameAndRowIdByUserIdsCreator<T extends SelectUserNameAndRowIdByUserIdsModel> {
        T create(String str, String str2, long j);
    }

    public interface SelectFriendsByLinkTypesCreator<T extends SelectFriendsByLinkTypesModel> {
        T create(String str, String str2, String str3, FriendLinkType friendLinkType);
    }

    public static final class Factory<T extends FriendModel> {
        public final ainu<CalendarDate, Long> birthdayAdapter;
        public final Creator<T> creator;
        public final ainu<FriendLinkType, Long> friendLinkTypeAdapter;
        public final ainu<Friendmojis, String> friendmojisAdapter;

        final class SelectIdForKeysQuery extends ainx {
            private final String[] username;

            SelectIdForKeysQuery(String[] strArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT\n    Friend._id,\n    Friend.username\nFROM Friend\nWHERE username IN ");
                stringBuilder.append(ainz.a(strArr.length));
                super(stringBuilder.toString(), new aioa(FriendModel.TABLE_NAME));
                this.username = strArr;
            }

            public final void bindTo(pc pcVar) {
                String[] strArr = this.username;
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

        final class SelectExistingUserDataQuery extends ainx {
            private final String userId;
            private final String username;

            SelectExistingUserDataQuery(String str, String str2) {
                super("SELECT _id, displayName, userId, username, friendLinkType\nFROM Friend\nWHERE userId=?1 OR username=?2 LIMIT 2", new aioa(FriendModel.TABLE_NAME));
                this.userId = str;
                this.username = str2;
            }

            public final void bindTo(pc pcVar) {
                String str = this.userId;
                if (str != null) {
                    pcVar.bindString(1, str);
                } else {
                    pcVar.bindNull(1);
                }
                pcVar.bindString(2, this.username);
            }
        }

        final class SelectFriendsAndAddedTimestampsByLinkTypeAddedBeforeQuery extends ainx {
            private final Long addedTimestamp;
            private final FriendLinkType friendLinkType;

            SelectFriendsAndAddedTimestampsByLinkTypeAddedBeforeQuery(FriendLinkType friendLinkType, Long l) {
                super("SELECT username, addedTimestamp\nFROM Friend\nWHERE friendLinkType = ?1\nAND addedTimestamp < ?2\nAND isPopular = 0", new aioa(FriendModel.TABLE_NAME));
                this.friendLinkType = friendLinkType;
                this.addedTimestamp = l;
            }

            public final void bindTo(pc pcVar) {
                FriendLinkType friendLinkType = this.friendLinkType;
                if (friendLinkType != null) {
                    pcVar.bindLong(1, ((Long) Factory.this.friendLinkTypeAdapter.encode(friendLinkType)).longValue());
                } else {
                    pcVar.bindNull(1);
                }
                Long l = this.addedTimestamp;
                if (l != null) {
                    pcVar.bindLong(2, l.longValue());
                } else {
                    pcVar.bindNull(2);
                }
            }
        }

        final class FindFriendIdWithDisplayNameAndLinkTypesQuery extends ainx {
            private final String displayName;
            private final FriendLinkType[] friendLinkType;

            FindFriendIdWithDisplayNameAndLinkTypesQuery(String str, FriendLinkType[] friendLinkTypeArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT _id\nFROM Friend\nWHERE displayName=?1 AND friendLinkType IN ");
                stringBuilder.append(ainz.a(friendLinkTypeArr.length));
                stringBuilder.append(" LIMIT 1");
                super(stringBuilder.toString(), new aioa(FriendModel.TABLE_NAME));
                this.displayName = str;
                this.friendLinkType = friendLinkTypeArr;
            }

            public final void bindTo(pc pcVar) {
                String str = this.displayName;
                if (str != null) {
                    pcVar.bindString(1, str);
                } else {
                    pcVar.bindNull(1);
                }
                FriendLinkType[] friendLinkTypeArr = this.friendLinkType;
                int i = 2;
                if (friendLinkTypeArr != null) {
                    int length = friendLinkTypeArr.length;
                    int i2 = 0;
                    while (i2 < length) {
                        int i3 = i + 1;
                        pcVar.bindLong(i, ((Long) Factory.this.friendLinkTypeAdapter.encode(friendLinkTypeArr[i2])).longValue());
                        i2++;
                        i = i3;
                    }
                    return;
                }
                pcVar.bindNull(2);
            }
        }

        final class FindFriendIdWithUsernameAndLinkTypesQuery extends ainx {
            private final FriendLinkType[] friendLinkType;
            private final String username;

            FindFriendIdWithUsernameAndLinkTypesQuery(String str, FriendLinkType[] friendLinkTypeArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT _id\nFROM Friend\nWHERE username=?1 AND friendLinkType IN ");
                stringBuilder.append(ainz.a(friendLinkTypeArr.length));
                stringBuilder.append(" LIMIT 1");
                super(stringBuilder.toString(), new aioa(FriendModel.TABLE_NAME));
                this.username = str;
                this.friendLinkType = friendLinkTypeArr;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.username);
                FriendLinkType[] friendLinkTypeArr = this.friendLinkType;
                int i = 2;
                if (friendLinkTypeArr != null) {
                    int length = friendLinkTypeArr.length;
                    int i2 = 0;
                    while (i2 < length) {
                        int i3 = i + 1;
                        pcVar.bindLong(i, ((Long) Factory.this.friendLinkTypeAdapter.encode(friendLinkTypeArr[i2])).longValue());
                        i2++;
                        i = i3;
                    }
                    return;
                }
                pcVar.bindNull(2);
            }
        }

        final class FindFriendLinkTypeWithUsernameQuery extends ainx {
            private final String username;

            FindFriendLinkTypeWithUsernameQuery(String str) {
                super("SELECT friendLinkType\nFROM Friend\nWHERE username=?1 LIMIT 1", new aioa(FriendModel.TABLE_NAME));
                this.username = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.username);
            }
        }

        final class GetAddedTimestampForUsernameQuery extends ainx {
            private final String username;

            GetAddedTimestampForUsernameQuery(String str) {
                super("SELECT addedTimestamp\nFROM Friend\nWHERE username=?1 LIMIT 1", new aioa(FriendModel.TABLE_NAME));
                this.username = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.username);
            }
        }

        final class SelectBitmojiForUsernameQuery extends ainx {
            private final String username;

            SelectBitmojiForUsernameQuery(String str) {
                super("SELECT bitmojiAvatarId, bitmojiSelfieId\nFROM Friend\nWHERE username=?1", new aioa(FriendModel.TABLE_NAME));
                this.username = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.username);
            }
        }

        final class SelectDisplayNameForUsernameQuery extends ainx {
            private final String username;

            SelectDisplayNameForUsernameQuery(String str) {
                super("SELECT _id, displayName\nFROM Friend\nWHERE username=?1 LIMIT 1", new aioa(FriendModel.TABLE_NAME));
                this.username = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.username);
            }
        }

        final class SelectDisplayNamesForFriendsQuery extends ainx {
            private final long[] _id;
            private final String username;

            SelectDisplayNamesForFriendsQuery(String str, long[] jArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT coalesce(displayName, username)\nFROM Friend\nWHERE username != ?1 AND _id IN ");
                stringBuilder.append(ainz.a(jArr.length));
                super(stringBuilder.toString(), new aioa(FriendModel.TABLE_NAME));
                this.username = str;
                this._id = jArr;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.username);
                long[] jArr = this._id;
                int length = jArr.length;
                int i = 2;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i + 1;
                    pcVar.bindLong(i, jArr[i2]);
                    i2++;
                    i = i3;
                }
            }
        }

        final class SelectFriendLinkTypesByUserIdsQuery extends ainx {
            private final String[] userId;

            SelectFriendLinkTypesByUserIdsQuery(String[] strArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT\n    userId,\n    friendLinkType\nFROM Friend\nWHERE userId IN ");
                stringBuilder.append(ainz.a(strArr.length));
                super(stringBuilder.toString(), new aioa(FriendModel.TABLE_NAME));
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

        final class SelectFriendLinkTypesByUsernamesQuery extends ainx {
            private final String[] username;

            SelectFriendLinkTypesByUsernamesQuery(String[] strArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT\n    username,\n    friendLinkType\nFROM Friend\nWHERE username IN ");
                stringBuilder.append(ainz.a(strArr.length));
                super(stringBuilder.toString(), new aioa(FriendModel.TABLE_NAME));
                this.username = strArr;
            }

            public final void bindTo(pc pcVar) {
                String[] strArr = this.username;
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

        final class SelectFriendUserIdFromUsernameQuery extends ainx {
            private final String username;

            SelectFriendUserIdFromUsernameQuery(String str) {
                super("SELECT userId\nFROM Friend\nWHERE username=?1 LIMIT 1", new aioa(FriendModel.TABLE_NAME));
                this.username = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.username);
            }
        }

        final class SelectFriendUserScoreQuery extends ainx {
            private final String username;

            SelectFriendUserScoreQuery(String str) {
                super("SELECT score\nFROM Friend\nWHERE username = ?1", new aioa(FriendModel.TABLE_NAME));
                this.username = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.username);
            }
        }

        final class SelectFriendsByLinkTypesQuery extends ainx {
            private final FriendLinkType[] friendLinkType;

            SelectFriendsByLinkTypesQuery(FriendLinkType[] friendLinkTypeArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT\n    userId,\n    username,\n    displayName,\n    friendLinkType\nFROM Friend\nWHERE friendLinkType IN ");
                stringBuilder.append(ainz.a(friendLinkTypeArr.length));
                stringBuilder.append("\nAND userId IS NOT NULL\nORDER BY displayName COLLATE NOCASE ASC");
                super(stringBuilder.toString(), new aioa(FriendModel.TABLE_NAME));
                this.friendLinkType = friendLinkTypeArr;
            }

            public final void bindTo(pc pcVar) {
                FriendLinkType[] friendLinkTypeArr = this.friendLinkType;
                int i = 1;
                if (friendLinkTypeArr != null) {
                    int length = friendLinkTypeArr.length;
                    int i2 = 0;
                    while (i2 < length) {
                        int i3 = i + 1;
                        pcVar.bindLong(i, ((Long) Factory.this.friendLinkTypeAdapter.encode(friendLinkTypeArr[i2])).longValue());
                        i2++;
                        i = i3;
                    }
                    return;
                }
                pcVar.bindNull(1);
            }
        }

        final class SelectIdForDisplayNameQuery extends ainx {
            private final String displayName;

            SelectIdForDisplayNameQuery(String str) {
                super("SELECT _id FROM Friend\nWHERE displayName=?1", new aioa(FriendModel.TABLE_NAME));
                this.displayName = str;
            }

            public final void bindTo(pc pcVar) {
                String str = this.displayName;
                if (str != null) {
                    pcVar.bindString(1, str);
                } else {
                    pcVar.bindNull(1);
                }
            }
        }

        final class SelectIdForKeyQuery extends ainx {
            private final String username;

            SelectIdForKeyQuery(String str) {
                super("SELECT _id FROM Friend\nWHERE username=?1", new aioa(FriendModel.TABLE_NAME));
                this.username = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.username);
            }
        }

        final class SelectIdForUserIdQuery extends ainx {
            private final String userId;

            SelectIdForUserIdQuery(String str) {
                super("SELECT _id FROM Friend\nWHERE userId=?1", new aioa(FriendModel.TABLE_NAME));
                this.userId = str;
            }

            public final void bindTo(pc pcVar) {
                String str = this.userId;
                if (str != null) {
                    pcVar.bindString(1, str);
                } else {
                    pcVar.bindNull(1);
                }
            }
        }

        final class SelectSnapProIdByUserIdQuery extends ainx {
            private final String userId;

            SelectSnapProIdByUserIdQuery(String str) {
                super("SELECT snapProId\nFROM Friend\nWHERE userId = ?1\nLIMIT 1", new aioa(FriendModel.TABLE_NAME));
                this.userId = str;
            }

            public final void bindTo(pc pcVar) {
                String str = this.userId;
                if (str != null) {
                    pcVar.bindString(1, str);
                } else {
                    pcVar.bindNull(1);
                }
            }
        }

        final class SelectSnapStreakExpirationQuery extends ainx {
            private final String username;

            SelectSnapStreakExpirationQuery(String str) {
                super("SELECT streakExpiration\nFROM Friend\nWHERE username = ?1", new aioa(FriendModel.TABLE_NAME));
                this.username = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.username);
            }
        }

        final class SelectUserIdsByFriendIdsQuery extends ainx {
            private final long[] _id;

            SelectUserIdsByFriendIdsQuery(long[] jArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT userId\nFROM Friend\nWHERE _id IN ");
                stringBuilder.append(ainz.a(jArr.length));
                super(stringBuilder.toString(), new aioa(FriendModel.TABLE_NAME));
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

        final class SelectUserNameAndRowIdByUserIdsQuery extends ainx {
            private final String[] userId;

            SelectUserNameAndRowIdByUserIdsQuery(String[] strArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT userId, username, _id\nFROM Friend\nWHERE userId IN ");
                stringBuilder.append(ainz.a(strArr.length));
                super(stringBuilder.toString(), new aioa(FriendModel.TABLE_NAME));
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

        final class SelectUserNameByUserIdsQuery extends ainx {
            private final String[] userId;

            SelectUserNameByUserIdsQuery(String[] strArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT userId, username\nFROM Friend\nWHERE userId IN ");
                stringBuilder.append(ainz.a(strArr.length));
                super(stringBuilder.toString(), new aioa(FriendModel.TABLE_NAME));
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

        final class SelectUsernamesForIdsQuery extends ainx {
            private final long[] _id;

            SelectUsernamesForIdsQuery(long[] jArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT Friend.username\nFROM Friend\nWHERE _id IN ");
                stringBuilder.append(ainz.a(jArr.length));
                super(stringBuilder.toString(), new aioa(FriendModel.TABLE_NAME));
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

        public Factory(Creator<T> creator, ainu<Friendmojis, String> ainu, ainu<CalendarDate, Long> ainu2, ainu<FriendLinkType, Long> ainu3) {
            this.creator = creator;
            this.friendmojisAdapter = ainu;
            this.birthdayAdapter = ainu2;
            this.friendLinkTypeAdapter = ainu3;
        }

        public final ainx countMutualFriends() {
            return new ainx("SELECT COUNT (_id)\nFROM Friend\nWHERE friendLinkType = 0", new aioa(FriendModel.TABLE_NAME));
        }

        public final ainw<Long> countMutualFriendsMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx findFriendIdWithDisplayNameAndLinkTypes(String str, FriendLinkType[] friendLinkTypeArr) {
            return new FindFriendIdWithDisplayNameAndLinkTypesQuery(str, friendLinkTypeArr);
        }

        public final ainw<Long> findFriendIdWithDisplayNameAndLinkTypesMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx findFriendIdWithUsernameAndLinkTypes(String str, FriendLinkType[] friendLinkTypeArr) {
            return new FindFriendIdWithUsernameAndLinkTypesQuery(str, friendLinkTypeArr);
        }

        public final ainw<Long> findFriendIdWithUsernameAndLinkTypesMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx findFriendLinkTypeWithUsername(String str) {
            return new FindFriendLinkTypeWithUsernameQuery(str);
        }

        public final ainw<FriendLinkType> findFriendLinkTypeWithUsernameMapper() {
            return new ainw<FriendLinkType>() {
                public FriendLinkType map(Cursor cursor) {
                    return cursor.isNull(0) ? null : (FriendLinkType) Factory.this.friendLinkTypeAdapter.decode(Long.valueOf(cursor.getLong(0)));
                }
            };
        }

        public final ainx getAddedTimestampForUsername(String str) {
            return new GetAddedTimestampForUsernameQuery(str);
        }

        public final ainw<Long> getAddedTimestampForUsernameMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return cursor.isNull(0) ? null : Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx selectAllFriendUserScores() {
            return new ainx("SELECT _id, score, userId\nFROM Friend\nWHERE friendLinkType IS 0 OR (friendLinkType IS 1 AND addedTimestamp IS NOT 0)", new aioa(FriendModel.TABLE_NAME));
        }

        public final <R extends SelectAllFriendUserScoresModel> SelectAllFriendUserScoresMapper<R> selectAllFriendUserScoresMapper(SelectAllFriendUserScoresCreator<R> selectAllFriendUserScoresCreator) {
            return new SelectAllFriendUserScoresMapper(selectAllFriendUserScoresCreator);
        }

        public final ainx selectAllMutualFriendUserIds() {
            return new ainx("SELECT userId\nFROM Friend\nWHERE friendLinkType = 0", new aioa(FriendModel.TABLE_NAME));
        }

        public final ainw<String> selectAllMutualFriendUserIdsMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.isNull(0) ? null : cursor.getString(0);
                }
            };
        }

        public final ainx selectBitmojiForUsername(String str) {
            return new SelectBitmojiForUsernameQuery(str);
        }

        public final <R extends SelectBitmojiForUsernameModel> SelectBitmojiForUsernameMapper<R> selectBitmojiForUsernameMapper(SelectBitmojiForUsernameCreator<R> selectBitmojiForUsernameCreator) {
            return new SelectBitmojiForUsernameMapper(selectBitmojiForUsernameCreator);
        }

        public final ainx selectBlockedFriend() {
            return new ainx("SELECT _id, userId, username, displayName, addedTimestamp, reverseAddedTimestamp\nFROM Friend\nWHERE friendLinkType = 2", new aioa(FriendModel.TABLE_NAME));
        }

        public final <R extends SelectBlockedFriendModel> SelectBlockedFriendMapper<R> selectBlockedFriendMapper(SelectBlockedFriendCreator<R> selectBlockedFriendCreator) {
            return new SelectBlockedFriendMapper(selectBlockedFriendCreator);
        }

        public final ainx selectDisplayNameForUsername(String str) {
            return new SelectDisplayNameForUsernameQuery(str);
        }

        public final <R extends SelectDisplayNameForUsernameModel> SelectDisplayNameForUsernameMapper<R> selectDisplayNameForUsernameMapper(SelectDisplayNameForUsernameCreator<R> selectDisplayNameForUsernameCreator) {
            return new SelectDisplayNameForUsernameMapper(selectDisplayNameForUsernameCreator);
        }

        public final ainx selectDisplayNamesForFriends(String str, long[] jArr) {
            return new SelectDisplayNamesForFriendsQuery(str, jArr);
        }

        public final ainw<String> selectDisplayNamesForFriendsMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.getString(0);
                }
            };
        }

        public final ainx selectExistingUserData(String str, String str2) {
            return new SelectExistingUserDataQuery(str, str2);
        }

        public final <R extends SelectExistingUserDataModel> SelectExistingUserDataMapper<R, T> selectExistingUserDataMapper(SelectExistingUserDataCreator<R> selectExistingUserDataCreator) {
            return new SelectExistingUserDataMapper(selectExistingUserDataCreator, this);
        }

        public final ainx selectFriendLinkTypesByUserIds(String[] strArr) {
            return new SelectFriendLinkTypesByUserIdsQuery(strArr);
        }

        public final <R extends SelectFriendLinkTypesByUserIdsModel> SelectFriendLinkTypesByUserIdsMapper<R, T> selectFriendLinkTypesByUserIdsMapper(SelectFriendLinkTypesByUserIdsCreator<R> selectFriendLinkTypesByUserIdsCreator) {
            return new SelectFriendLinkTypesByUserIdsMapper(selectFriendLinkTypesByUserIdsCreator, this);
        }

        public final ainx selectFriendLinkTypesByUsernames(String[] strArr) {
            return new SelectFriendLinkTypesByUsernamesQuery(strArr);
        }

        public final <R extends SelectFriendLinkTypesByUsernamesModel> SelectFriendLinkTypesByUsernamesMapper<R, T> selectFriendLinkTypesByUsernamesMapper(SelectFriendLinkTypesByUsernamesCreator<R> selectFriendLinkTypesByUsernamesCreator) {
            return new SelectFriendLinkTypesByUsernamesMapper(selectFriendLinkTypesByUsernamesCreator, this);
        }

        public final ainx selectFriendUserIdFromUsername(String str) {
            return new SelectFriendUserIdFromUsernameQuery(str);
        }

        public final ainw<String> selectFriendUserIdFromUsernameMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.isNull(0) ? null : cursor.getString(0);
                }
            };
        }

        public final ainx selectFriendUserScore(String str) {
            return new SelectFriendUserScoreQuery(str);
        }

        public final ainw<Long> selectFriendUserScoreMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return cursor.isNull(0) ? null : Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx selectFriendsAndAddedTimestampsByLinkTypeAddedBefore(FriendLinkType friendLinkType, Long l) {
            return new SelectFriendsAndAddedTimestampsByLinkTypeAddedBeforeQuery(friendLinkType, l);
        }

        public final <R extends SelectFriendsAndAddedTimestampsByLinkTypeAddedBeforeModel> SelectFriendsAndAddedTimestampsByLinkTypeAddedBeforeMapper<R> selectFriendsAndAddedTimestampsByLinkTypeAddedBeforeMapper(SelectFriendsAndAddedTimestampsByLinkTypeAddedBeforeCreator<R> selectFriendsAndAddedTimestampsByLinkTypeAddedBeforeCreator) {
            return new SelectFriendsAndAddedTimestampsByLinkTypeAddedBeforeMapper(selectFriendsAndAddedTimestampsByLinkTypeAddedBeforeCreator);
        }

        public final ainx selectFriendsByLinkTypes(FriendLinkType[] friendLinkTypeArr) {
            return new SelectFriendsByLinkTypesQuery(friendLinkTypeArr);
        }

        public final <R extends SelectFriendsByLinkTypesModel> SelectFriendsByLinkTypesMapper<R, T> selectFriendsByLinkTypesMapper(SelectFriendsByLinkTypesCreator<R> selectFriendsByLinkTypesCreator) {
            return new SelectFriendsByLinkTypesMapper(selectFriendsByLinkTypesCreator, this);
        }

        public final ainx selectIdForDisplayName(String str) {
            return new SelectIdForDisplayNameQuery(str);
        }

        public final ainw<Long> selectIdForDisplayNameMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx selectIdForKey(String str) {
            return new SelectIdForKeyQuery(str);
        }

        public final ainw<Long> selectIdForKeyMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx selectIdForKeys(String[] strArr) {
            return new SelectIdForKeysQuery(strArr);
        }

        public final <R extends SelectIdForKeysModel> SelectIdForKeysMapper<R> selectIdForKeysMapper(SelectIdForKeysCreator<R> selectIdForKeysCreator) {
            return new SelectIdForKeysMapper(selectIdForKeysCreator);
        }

        public final ainx selectIdForUserId(String str) {
            return new SelectIdForUserIdQuery(str);
        }

        public final ainw<Long> selectIdForUserIdMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx selectSnapProIdByUserId(String str) {
            return new SelectSnapProIdByUserIdQuery(str);
        }

        public final ainw<String> selectSnapProIdByUserIdMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.isNull(0) ? null : cursor.getString(0);
                }
            };
        }

        public final ainx selectSnapStreakExpiration(String str) {
            return new SelectSnapStreakExpirationQuery(str);
        }

        public final ainw<Long> selectSnapStreakExpirationMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return cursor.isNull(0) ? null : Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx selectUserIdsByFriendIds(long[] jArr) {
            return new SelectUserIdsByFriendIdsQuery(jArr);
        }

        public final ainw<String> selectUserIdsByFriendIdsMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.isNull(0) ? null : cursor.getString(0);
                }
            };
        }

        public final ainx selectUserNameAndRowIdByUserIds(String[] strArr) {
            return new SelectUserNameAndRowIdByUserIdsQuery(strArr);
        }

        public final <R extends SelectUserNameAndRowIdByUserIdsModel> SelectUserNameAndRowIdByUserIdsMapper<R> selectUserNameAndRowIdByUserIdsMapper(SelectUserNameAndRowIdByUserIdsCreator<R> selectUserNameAndRowIdByUserIdsCreator) {
            return new SelectUserNameAndRowIdByUserIdsMapper(selectUserNameAndRowIdByUserIdsCreator);
        }

        public final ainx selectUserNameByUserIds(String[] strArr) {
            return new SelectUserNameByUserIdsQuery(strArr);
        }

        public final <R extends SelectUserNameByUserIdsModel> SelectUserNameByUserIdsMapper<R> selectUserNameByUserIdsMapper(SelectUserNameByUserIdsCreator<R> selectUserNameByUserIdsCreator) {
            return new SelectUserNameByUserIdsMapper(selectUserNameByUserIdsCreator);
        }

        public final ainx selectUsernamesForIds(long[] jArr) {
            return new SelectUsernamesForIdsQuery(jArr);
        }

        public final ainw<String> selectUsernamesForIdsMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.getString(0);
                }
            };
        }
    }

    public interface SelectAllFriendUserScoresModel {
        long _id();

        Long score();

        String userId();
    }

    public static final class SelectIdForKeysMapper<T extends SelectIdForKeysModel> implements ainw<T> {
        private final SelectIdForKeysCreator<T> creator;

        public SelectIdForKeysMapper(SelectIdForKeysCreator<T> selectIdForKeysCreator) {
            this.creator = selectIdForKeysCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), cursor.getString(1));
        }
    }

    public static final class SelectAllFriendUserScoresMapper<T extends SelectAllFriendUserScoresModel> implements ainw<T> {
        private final SelectAllFriendUserScoresCreator<T> creator;

        public SelectAllFriendUserScoresMapper(SelectAllFriendUserScoresCreator<T> selectAllFriendUserScoresCreator) {
            this.creator = selectAllFriendUserScoresCreator;
        }

        public final T map(Cursor cursor) {
            SelectAllFriendUserScoresCreator selectAllFriendUserScoresCreator = this.creator;
            long j = cursor.getLong(0);
            String str = null;
            Long valueOf = cursor.isNull(1) ? null : Long.valueOf(cursor.getLong(1));
            if (!cursor.isNull(2)) {
                str = cursor.getString(2);
            }
            return selectAllFriendUserScoresCreator.create(j, valueOf, str);
        }
    }

    public static final class SelectDisplayNameForUsernameMapper<T extends SelectDisplayNameForUsernameModel> implements ainw<T> {
        private final SelectDisplayNameForUsernameCreator<T> creator;

        public SelectDisplayNameForUsernameMapper(SelectDisplayNameForUsernameCreator<T> selectDisplayNameForUsernameCreator) {
            this.creator = selectDisplayNameForUsernameCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), cursor.isNull(1) ? null : cursor.getString(1));
        }
    }

    public static final class SelectExistingUserDataMapper<T extends SelectExistingUserDataModel, T1 extends FriendModel> implements ainw<T> {
        private final SelectExistingUserDataCreator<T> creator;
        private final Factory<T1> friendModelFactory;

        public SelectExistingUserDataMapper(SelectExistingUserDataCreator<T> selectExistingUserDataCreator, Factory<T1> factory) {
            this.creator = selectExistingUserDataCreator;
            this.friendModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), cursor.isNull(1) ? null : cursor.getString(1), cursor.isNull(2) ? null : cursor.getString(2), cursor.getString(3), cursor.isNull(4) ? null : (FriendLinkType) this.friendModelFactory.friendLinkTypeAdapter.decode(Long.valueOf(cursor.getLong(4))));
        }
    }

    public static final class SelectBlockedFriendMapper<T extends SelectBlockedFriendModel> implements ainw<T> {
        private final SelectBlockedFriendCreator<T> creator;

        public SelectBlockedFriendMapper(SelectBlockedFriendCreator<T> selectBlockedFriendCreator) {
            this.creator = selectBlockedFriendCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), cursor.isNull(1) ? null : cursor.getString(1), cursor.getString(2), cursor.isNull(3) ? null : cursor.getString(3), cursor.isNull(4) ? null : Long.valueOf(cursor.getLong(4)), cursor.isNull(5) ? null : Long.valueOf(cursor.getLong(5)));
        }
    }

    public static final class SelectBitmojiForUsernameMapper<T extends SelectBitmojiForUsernameModel> implements ainw<T> {
        private final SelectBitmojiForUsernameCreator<T> creator;

        public SelectBitmojiForUsernameMapper(SelectBitmojiForUsernameCreator<T> selectBitmojiForUsernameCreator) {
            this.creator = selectBitmojiForUsernameCreator;
        }

        public final T map(Cursor cursor) {
            SelectBitmojiForUsernameCreator selectBitmojiForUsernameCreator = this.creator;
            String str = null;
            String string = cursor.isNull(0) ? null : cursor.getString(0);
            if (!cursor.isNull(1)) {
                str = cursor.getString(1);
            }
            return selectBitmojiForUsernameCreator.create(string, str);
        }
    }

    public static final class SelectFriendLinkTypesByUsernamesMapper<T extends SelectFriendLinkTypesByUsernamesModel, T1 extends FriendModel> implements ainw<T> {
        private final SelectFriendLinkTypesByUsernamesCreator<T> creator;
        private final Factory<T1> friendModelFactory;

        public SelectFriendLinkTypesByUsernamesMapper(SelectFriendLinkTypesByUsernamesCreator<T> selectFriendLinkTypesByUsernamesCreator, Factory<T1> factory) {
            this.creator = selectFriendLinkTypesByUsernamesCreator;
            this.friendModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getString(0), cursor.isNull(1) ? null : (FriendLinkType) this.friendModelFactory.friendLinkTypeAdapter.decode(Long.valueOf(cursor.getLong(1))));
        }
    }

    public static final class SelectFriendLinkTypesByUserIdsMapper<T extends SelectFriendLinkTypesByUserIdsModel, T1 extends FriendModel> implements ainw<T> {
        private final SelectFriendLinkTypesByUserIdsCreator<T> creator;
        private final Factory<T1> friendModelFactory;

        public SelectFriendLinkTypesByUserIdsMapper(SelectFriendLinkTypesByUserIdsCreator<T> selectFriendLinkTypesByUserIdsCreator, Factory<T1> factory) {
            this.creator = selectFriendLinkTypesByUserIdsCreator;
            this.friendModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            SelectFriendLinkTypesByUserIdsCreator selectFriendLinkTypesByUserIdsCreator = this.creator;
            FriendLinkType friendLinkType = null;
            String string = cursor.isNull(0) ? null : cursor.getString(0);
            if (!cursor.isNull(1)) {
                friendLinkType = (FriendLinkType) this.friendModelFactory.friendLinkTypeAdapter.decode(Long.valueOf(cursor.getLong(1)));
            }
            return selectFriendLinkTypesByUserIdsCreator.create(string, friendLinkType);
        }
    }

    public static final class SelectFriendsAndAddedTimestampsByLinkTypeAddedBeforeMapper<T extends SelectFriendsAndAddedTimestampsByLinkTypeAddedBeforeModel> implements ainw<T> {
        private final SelectFriendsAndAddedTimestampsByLinkTypeAddedBeforeCreator<T> creator;

        public SelectFriendsAndAddedTimestampsByLinkTypeAddedBeforeMapper(SelectFriendsAndAddedTimestampsByLinkTypeAddedBeforeCreator<T> selectFriendsAndAddedTimestampsByLinkTypeAddedBeforeCreator) {
            this.creator = selectFriendsAndAddedTimestampsByLinkTypeAddedBeforeCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getString(0), cursor.isNull(1) ? null : Long.valueOf(cursor.getLong(1)));
        }
    }

    public static final class SelectUserNameByUserIdsMapper<T extends SelectUserNameByUserIdsModel> implements ainw<T> {
        private final SelectUserNameByUserIdsCreator<T> creator;

        public SelectUserNameByUserIdsMapper(SelectUserNameByUserIdsCreator<T> selectUserNameByUserIdsCreator) {
            this.creator = selectUserNameByUserIdsCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.isNull(0) ? null : cursor.getString(0), cursor.getString(1));
        }
    }

    public static final class SelectUserNameAndRowIdByUserIdsMapper<T extends SelectUserNameAndRowIdByUserIdsModel> implements ainw<T> {
        private final SelectUserNameAndRowIdByUserIdsCreator<T> creator;

        public SelectUserNameAndRowIdByUserIdsMapper(SelectUserNameAndRowIdByUserIdsCreator<T> selectUserNameAndRowIdByUserIdsCreator) {
            this.creator = selectUserNameAndRowIdByUserIdsCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.isNull(0) ? null : cursor.getString(0), cursor.getString(1), cursor.getLong(2));
        }
    }

    public static final class SelectFriendsByLinkTypesMapper<T extends SelectFriendsByLinkTypesModel, T1 extends FriendModel> implements ainw<T> {
        private final SelectFriendsByLinkTypesCreator<T> creator;
        private final Factory<T1> friendModelFactory;

        public SelectFriendsByLinkTypesMapper(SelectFriendsByLinkTypesCreator<T> selectFriendsByLinkTypesCreator, Factory<T1> factory) {
            this.creator = selectFriendsByLinkTypesCreator;
            this.friendModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            SelectFriendsByLinkTypesCreator selectFriendsByLinkTypesCreator = this.creator;
            FriendLinkType friendLinkType = null;
            String string = cursor.isNull(0) ? null : cursor.getString(0);
            String string2 = cursor.getString(1);
            String string3 = cursor.isNull(2) ? null : cursor.getString(2);
            if (!cursor.isNull(3)) {
                friendLinkType = (FriendLinkType) this.friendModelFactory.friendLinkTypeAdapter.decode(Long.valueOf(cursor.getLong(3)));
            }
            return selectFriendsByLinkTypesCreator.create(string, string2, string3, friendLinkType);
        }
    }

    public static final class UpdateFriend extends ainy {
        private final Factory<? extends FriendModel> friendModelFactory;

        public UpdateFriend(pa paVar, Factory<? extends FriendModel> factory) {
            super(FriendModel.TABLE_NAME, paVar.a("UPDATE Friend\nSET userId=?,\n    username=?,\n    displayName=?,\n    serverDisplayName=?,\n    bitmojiAvatarId=?,\n    bitmojiSelfieId=?,\n    friendmojis=?,\n    friendmojiCategories=?,\n    streakLength=?,\n    streakExpiration=?,\n    birthday=?,\n    friendLinkType=?,\n    addedTimestamp=?,\n    reverseAddedTimestamp=?,\n    storyMuted=?,\n    isPopular=?,\n    isOfficial=?,\n    snapProId=?\nWHERE _id=?"));
            this.friendModelFactory = factory;
        }

        public final void bind(String str, String str2, String str3, String str4, String str5, String str6, Friendmojis friendmojis, String str7, Integer num, Long l, CalendarDate calendarDate, FriendLinkType friendLinkType, Long l2, Long l3, boolean z, boolean z2, boolean z3, String str8, long j) {
            String str9 = str3;
            String str10 = str4;
            String str11 = str5;
            String str12 = str6;
            Friendmojis friendmojis2 = friendmojis;
            String str13 = str7;
            CalendarDate calendarDate2 = calendarDate;
            FriendLinkType friendLinkType2 = friendLinkType;
            String str14 = str8;
            if (str == null) {
                bindNull(1);
            } else {
                bindString(1, str);
            }
            String str15 = str2;
            bindString(2, str2);
            if (str9 == null) {
                bindNull(3);
            } else {
                bindString(3, str3);
            }
            if (str10 == null) {
                bindNull(4);
            } else {
                bindString(4, str10);
            }
            if (str11 == null) {
                bindNull(5);
            } else {
                bindString(5, str11);
            }
            if (str12 == null) {
                bindNull(6);
            } else {
                bindString(6, str12);
            }
            if (friendmojis2 == null) {
                bindNull(7);
            } else {
                bindString(7, (String) this.friendModelFactory.friendmojisAdapter.encode(friendmojis2));
            }
            if (str13 == null) {
                bindNull(8);
            } else {
                bindString(8, str13);
            }
            if (num == null) {
                bindNull(9);
            } else {
                bindLong(9, (long) num.intValue());
            }
            if (l == null) {
                bindNull(10);
            } else {
                bindLong(10, l.longValue());
            }
            if (calendarDate2 == null) {
                bindNull(11);
            } else {
                bindLong(11, ((Long) this.friendModelFactory.birthdayAdapter.encode(calendarDate2)).longValue());
            }
            if (friendLinkType2 == null) {
                bindNull(12);
            } else {
                bindLong(12, ((Long) this.friendModelFactory.friendLinkTypeAdapter.encode(friendLinkType2)).longValue());
            }
            if (l2 == null) {
                bindNull(13);
            } else {
                bindLong(13, l2.longValue());
            }
            if (l3 == null) {
                bindNull(14);
            } else {
                bindLong(14, l3.longValue());
            }
            long j2 = 1;
            bindLong(15, z ? 1 : 0);
            bindLong(16, z2 ? 1 : 0);
            if (!z3) {
                j2 = 0;
            }
            bindLong(17, j2);
            if (str14 == null) {
                bindNull(18);
            } else {
                bindString(18, str14);
            }
            bindLong(19, j);
        }
    }

    public interface SelectBitmojiForUsernameModel {
        String bitmojiAvatarId();

        String bitmojiSelfieId();
    }

    public interface SelectBlockedFriendModel {
        long _id();

        Long addedTimestamp();

        String displayName();

        Long reverseAddedTimestamp();

        String userId();

        String username();
    }

    public interface SelectDisplayNameForUsernameModel {
        long _id();

        String displayName();
    }

    public interface SelectFriendLinkTypesByUserIdsModel {
        FriendLinkType friendLinkType();

        String userId();
    }

    public interface SelectFriendLinkTypesByUsernamesModel {
        FriendLinkType friendLinkType();

        String username();
    }

    public interface SelectFriendsAndAddedTimestampsByLinkTypeAddedBeforeModel {
        Long addedTimestamp();

        String username();
    }

    public interface SelectFriendsByLinkTypesModel {
        String displayName();

        FriendLinkType friendLinkType();

        String userId();

        String username();
    }

    public interface SelectUserNameAndRowIdByUserIdsModel {
        long _id();

        String userId();

        String username();
    }

    public interface SelectUserNameByUserIdsModel {
        String userId();

        String username();
    }

    public static final class Mapper<T extends FriendModel> implements ainw<T> {
        private final Factory<T> friendModelFactory;

        public Mapper(Factory<T> factory) {
            this.friendModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            return this.friendModelFactory.creator.create(cursor2.getLong(0), cursor2.isNull(1) ? null : Long.valueOf(cursor2.getLong(1)), cursor2.getString(2), cursor2.isNull(3) ? null : cursor2.getString(3), cursor2.isNull(4) ? null : cursor2.getString(4), cursor2.isNull(5) ? null : cursor2.getString(5), cursor2.isNull(6) ? null : cursor2.getString(6), cursor2.isNull(7) ? null : (Friendmojis) this.friendModelFactory.friendmojisAdapter.decode(cursor2.getString(7)), cursor2.isNull(8) ? null : cursor2.getString(8), cursor2.isNull(9) ? null : cursor2.getString(9), cursor2.isNull(10) ? null : Long.valueOf(cursor2.getLong(10)), cursor2.isNull(11) ? null : (CalendarDate) this.friendModelFactory.birthdayAdapter.decode(Long.valueOf(cursor2.getLong(11))), cursor2.isNull(12) ? null : Long.valueOf(cursor2.getLong(12)), cursor2.isNull(13) ? null : Long.valueOf(cursor2.getLong(13)), cursor2.isNull(14) ? null : Long.valueOf(cursor2.getLong(14)), cursor2.isNull(15) ? null : Long.valueOf(cursor2.getLong(15)), cursor2.isNull(16) ? null : Long.valueOf(cursor2.getLong(16)), cursor2.isNull(17) ? null : Long.valueOf(cursor2.getLong(17)), cursor2.isNull(18) ? null : Long.valueOf(cursor2.getLong(18)), cursor2.isNull(19) ? null : cursor2.getString(19), cursor2.isNull(20) ? null : Integer.valueOf(cursor2.getInt(20)), cursor2.isNull(21) ? null : Long.valueOf(cursor2.getLong(21)), cursor2.isNull(22) ? null : (FriendLinkType) this.friendModelFactory.friendLinkTypeAdapter.decode(Long.valueOf(cursor2.getLong(22))), cursor2.getInt(23) == 1, cursor2.getInt(24) == 1, cursor2.getInt(25) == 1, cursor2.getInt(26) == 1, cursor2.isNull(27) ? null : cursor2.getString(27));
        }
    }

    public static final class ClearAll extends ainy {
        public ClearAll(pa paVar) {
            super(FriendModel.TABLE_NAME, paVar.a("DELETE FROM Friend"));
        }
    }

    public static final class DeleteUserId extends ainy {
        public DeleteUserId(pa paVar) {
            super(FriendModel.TABLE_NAME, paVar.a("DELETE FROM Friend\nWHERE userId=?"));
        }

        public final void bind(String str) {
            if (str == null) {
                bindNull(1);
            } else {
                bindString(1, str);
            }
        }
    }

    public static final class DeleteUsername extends ainy {
        public DeleteUsername(pa paVar) {
            super(FriendModel.TABLE_NAME, paVar.a("DELETE FROM Friend\nWHERE username=?"));
        }

        public final void bind(String str) {
            bindString(1, str);
        }
    }

    public static final class InsertPendingIncomingFriend extends ainy {
        private final Factory<? extends FriendModel> friendModelFactory;

        public InsertPendingIncomingFriend(pa paVar, Factory<? extends FriendModel> factory) {
            super(FriendModel.TABLE_NAME, paVar.a("INSERT INTO Friend(\n    username,\n    userId,\n    displayName,\n    serverDisplayName,\n    bitmojiAvatarId,\n    bitmojiSelfieId,\n    addedTimestamp,\n    reverseAddedTimestamp,\n    isPopular,\n    isOfficial,\n    friendLinkType,\n    snapProId\n    )\nVALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"));
            this.friendModelFactory = factory;
        }

        public final void bind(String str, String str2, String str3, String str4, String str5, String str6, Long l, Long l2, boolean z, boolean z2, FriendLinkType friendLinkType, String str7) {
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
            if (str4 == null) {
                bindNull(4);
            } else {
                bindString(4, str4);
            }
            if (str5 == null) {
                bindNull(5);
            } else {
                bindString(5, str5);
            }
            if (str6 == null) {
                bindNull(6);
            } else {
                bindString(6, str6);
            }
            if (l == null) {
                bindNull(7);
            } else {
                bindLong(7, l.longValue());
            }
            if (l2 == null) {
                bindNull(8);
            } else {
                bindLong(8, l2.longValue());
            }
            long j = 1;
            bindLong(9, z ? 1 : 0);
            if (!z2) {
                j = 0;
            }
            bindLong(10, j);
            if (friendLinkType == null) {
                bindNull(11);
            } else {
                bindLong(11, ((Long) this.friendModelFactory.friendLinkTypeAdapter.encode(friendLinkType)).longValue());
            }
            if (str7 == null) {
                bindNull(12);
            } else {
                bindString(12, str7);
            }
        }
    }

    public static final class InsertRow extends ainy {
        private final Factory<? extends FriendModel> friendModelFactory;

        public InsertRow(pa paVar, Factory<? extends FriendModel> factory) {
            super(FriendModel.TABLE_NAME, paVar.a("INSERT INTO Friend(\n    userId,\n    displayName,\n    serverDisplayName,\n    bitmojiAvatarId,\n    bitmojiSelfieId,\n    friendmojis,\n    friendmojiCategories,\n    streakLength,\n    streakExpiration,\n    birthday,\n    username,\n    friendLinkType,\n    addedTimestamp,\n    reverseAddedTimestamp,\n    storyMuted,\n    isPopular,\n    isOfficial,\n    snapProId\n    )\nVALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"));
            this.friendModelFactory = factory;
        }

        public final void bind(String str, String str2, String str3, String str4, String str5, Friendmojis friendmojis, String str6, Integer num, Long l, CalendarDate calendarDate, String str7, FriendLinkType friendLinkType, Long l2, Long l3, boolean z, boolean z2, boolean z3, String str8) {
            String str9 = str2;
            String str10 = str3;
            String str11 = str4;
            String str12 = str5;
            Friendmojis friendmojis2 = friendmojis;
            String str13 = str6;
            CalendarDate calendarDate2 = calendarDate;
            FriendLinkType friendLinkType2 = friendLinkType;
            String str14 = str8;
            if (str == null) {
                bindNull(1);
            } else {
                bindString(1, str);
            }
            if (str9 == null) {
                bindNull(2);
            } else {
                bindString(2, str2);
            }
            if (str10 == null) {
                bindNull(3);
            } else {
                bindString(3, str3);
            }
            if (str11 == null) {
                bindNull(4);
            } else {
                bindString(4, str11);
            }
            if (str12 == null) {
                bindNull(5);
            } else {
                bindString(5, str12);
            }
            if (friendmojis2 == null) {
                bindNull(6);
            } else {
                bindString(6, (String) this.friendModelFactory.friendmojisAdapter.encode(friendmojis2));
            }
            if (str13 == null) {
                bindNull(7);
            } else {
                bindString(7, str13);
            }
            if (num == null) {
                bindNull(8);
            } else {
                bindLong(8, (long) num.intValue());
            }
            if (l == null) {
                bindNull(9);
            } else {
                bindLong(9, l.longValue());
            }
            if (calendarDate2 == null) {
                bindNull(10);
            } else {
                bindLong(10, ((Long) this.friendModelFactory.birthdayAdapter.encode(calendarDate2)).longValue());
            }
            bindString(11, str7);
            if (friendLinkType2 == null) {
                bindNull(12);
            } else {
                bindLong(12, ((Long) this.friendModelFactory.friendLinkTypeAdapter.encode(friendLinkType2)).longValue());
            }
            if (l2 == null) {
                bindNull(13);
            } else {
                bindLong(13, l2.longValue());
            }
            if (l3 == null) {
                bindNull(14);
            } else {
                bindLong(14, l3.longValue());
            }
            long j = 1;
            bindLong(15, z ? 1 : 0);
            bindLong(16, z2 ? 1 : 0);
            if (!z3) {
                j = 0;
            }
            bindLong(17, j);
            if (str14 == null) {
                bindNull(18);
            } else {
                bindString(18, str14);
            }
        }
    }

    public static final class InsertUsername extends ainy {
        public InsertUsername(pa paVar) {
            super(FriendModel.TABLE_NAME, paVar.a("INSERT INTO Friend(username)\nVALUES(?)"));
        }

        public final void bind(String str) {
            bindString(1, str);
        }
    }

    public static final class MarkFriendsDeleted extends ainy {
        public MarkFriendsDeleted(pa paVar) {
            super(FriendModel.TABLE_NAME, paVar.a("UPDATE Friend\nSET friendLinkType = 3\nWHERE friendLinkType != 5"));
        }
    }

    public static final class SetStoryMuted extends ainy {
        public SetStoryMuted(pa paVar) {
            super(FriendModel.TABLE_NAME, paVar.a("UPDATE Friend\nSET storyMuted = ?\nWHERE userId = ?"));
        }

        public final void bind(boolean z, String str) {
            bindLong(1, z ? 1 : 0);
            if (str == null) {
                bindNull(2);
            } else {
                bindString(2, str);
            }
        }
    }

    public static final class UpdateDisplayNameForUsername extends ainy {
        public UpdateDisplayNameForUsername(pa paVar) {
            super(FriendModel.TABLE_NAME, paVar.a("UPDATE Friend\nSET displayName=?\nWHERE username=?"));
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

    public static final class UpdateFriendUserScore extends ainy {
        public UpdateFriendUserScore(pa paVar) {
            super(FriendModel.TABLE_NAME, paVar.a("UPDATE Friend\nSET score=?\nWHERE _id=?"));
        }

        public final void bind(Long l, long j) {
            if (l == null) {
                bindNull(1);
            } else {
                bindLong(1, l.longValue());
            }
            bindLong(2, j);
        }
    }

    public static final class UpdateGroupParticipant extends ainy {
        public UpdateGroupParticipant(pa paVar) {
            super(FriendModel.TABLE_NAME, paVar.a("UPDATE Friend\nSET displayName=coalesce(displayName, ?),\n    serverDisplayName=coalesce(serverDisplayName, ?),\n    bitmojiAvatarId=?,\n    bitmojiSelfieId=?\nWHERE _id = ?"));
        }

        public final void bind(Object obj, Object obj2, String str, String str2, long j) {
            long j2 = 1;
            if (obj == null) {
                bindNull(1);
            } else if (obj instanceof String) {
                bindString(1, (String) obj);
            } else if ((obj instanceof Float) || (obj instanceof Double)) {
                bindDouble(1, ((Double) obj).doubleValue());
            } else {
                long longValue;
                if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Long)) {
                    longValue = ((Long) obj).longValue();
                } else if (obj instanceof Boolean) {
                    longValue = ((Boolean) obj).booleanValue() ? 1 : 0;
                } else if (obj instanceof byte[]) {
                    bindBlob(1, (byte[]) obj);
                } else {
                    throw new IllegalArgumentException("Attempting to bind an object that is not one of (String, Integer, Short, Long, Float, Double, Boolean, byte[]) to argument arg1");
                }
                bindLong(1, longValue);
            }
            if (obj2 == null) {
                bindNull(2);
            } else if (obj2 instanceof String) {
                bindString(2, (String) obj2);
            } else if ((obj2 instanceof Float) || (obj2 instanceof Double)) {
                bindDouble(2, ((Double) obj2).doubleValue());
            } else {
                if ((obj2 instanceof Integer) || (obj2 instanceof Short) || (obj2 instanceof Long)) {
                    j2 = ((Long) obj2).longValue();
                } else if (obj2 instanceof Boolean) {
                    if (!((Boolean) obj2).booleanValue()) {
                        j2 = 0;
                    }
                } else if (obj2 instanceof byte[]) {
                    bindBlob(2, (byte[]) obj2);
                } else {
                    throw new IllegalArgumentException("Attempting to bind an object that is not one of (String, Integer, Short, Long, Float, Double, Boolean, byte[]) to argument arg2");
                }
                bindLong(2, j2);
            }
            if (str == null) {
                bindNull(3);
            } else {
                bindString(3, str);
            }
            if (str2 == null) {
                bindNull(4);
            } else {
                bindString(4, str2);
            }
            bindLong(5, j);
        }
    }

    public static final class UpdateLinkType extends ainy {
        private final Factory<? extends FriendModel> friendModelFactory;

        public UpdateLinkType(pa paVar, Factory<? extends FriendModel> factory) {
            super(FriendModel.TABLE_NAME, paVar.a("UPDATE Friend\nSET friendLinkType=?\nWHERE _id=?"));
            this.friendModelFactory = factory;
        }

        public final void bind(FriendLinkType friendLinkType, long j) {
            if (friendLinkType == null) {
                bindNull(1);
            } else {
                bindLong(1, ((Long) this.friendModelFactory.friendLinkTypeAdapter.encode(friendLinkType)).longValue());
            }
            bindLong(2, j);
        }
    }

    public static final class UpdatePendingIncomingFriend extends ainy {
        private final Factory<? extends FriendModel> friendModelFactory;

        public UpdatePendingIncomingFriend(pa paVar, Factory<? extends FriendModel> factory) {
            super(FriendModel.TABLE_NAME, paVar.a("UPDATE Friend\nSET userId = ?,\n    username = ?,\n    displayName = ?,\n    serverDisplayName = ?,\n    bitmojiAvatarId = ?,\n    bitmojiSelfieId = ?,\n    addedTimestamp = ?,\n    reverseAddedTimestamp = ?,\n    isPopular = ?,\n    isOfficial =?,\n    friendLinkType = ?,\n    snapProId = ?\nWHERE _id = ?"));
            this.friendModelFactory = factory;
        }

        public final void bind(String str, String str2, String str3, String str4, String str5, String str6, Long l, Long l2, boolean z, boolean z2, FriendLinkType friendLinkType, String str7, long j) {
            if (str == null) {
                bindNull(1);
            } else {
                bindString(1, str);
            }
            bindString(2, str2);
            if (str3 == null) {
                bindNull(3);
            } else {
                bindString(3, str3);
            }
            if (str4 == null) {
                bindNull(4);
            } else {
                bindString(4, str4);
            }
            if (str5 == null) {
                bindNull(5);
            } else {
                bindString(5, str5);
            }
            if (str6 == null) {
                bindNull(6);
            } else {
                bindString(6, str6);
            }
            if (l == null) {
                bindNull(7);
            } else {
                bindLong(7, l.longValue());
            }
            if (l2 == null) {
                bindNull(8);
            } else {
                bindLong(8, l2.longValue());
            }
            long j2 = 1;
            bindLong(9, z ? 1 : 0);
            if (!z2) {
                j2 = 0;
            }
            bindLong(10, j2);
            if (friendLinkType == null) {
                bindNull(11);
            } else {
                bindLong(11, ((Long) this.friendModelFactory.friendLinkTypeAdapter.encode(friendLinkType)).longValue());
            }
            if (str7 == null) {
                bindNull(12);
            } else {
                bindString(12, str7);
            }
            bindLong(13, j);
        }
    }

    public static final class UpdateSnapstreak extends ainy {
        public UpdateSnapstreak(pa paVar) {
            super(FriendModel.TABLE_NAME, paVar.a("UPDATE Friend\nSET streakLength = ?,\n    streakExpiration = ?,\n    friendmojis = CASE WHEN ? THEN replace(friendmojis, 'STREAK', '') ELSE friendmojis END,\n    friendmojiCategories = CASE WHEN ? THEN replace(friendmojiCategories, 'on_fire', '') ELSE friendmojiCategories END\nWHERE username=?"));
        }

        public final void bind(Integer num, Long l, Object obj, Object obj2, String str) {
            if (num == null) {
                bindNull(1);
            } else {
                bindLong(1, (long) num.intValue());
            }
            if (l == null) {
                bindNull(2);
            } else {
                bindLong(2, l.longValue());
            }
            long j = 1;
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
            if (obj2 == null) {
                bindNull(4);
            } else if (obj2 instanceof String) {
                bindString(4, (String) obj2);
            } else if ((obj2 instanceof Float) || (obj2 instanceof Double)) {
                bindDouble(4, ((Double) obj2).doubleValue());
            } else {
                if ((obj2 instanceof Integer) || (obj2 instanceof Short) || (obj2 instanceof Long)) {
                    j = ((Long) obj2).longValue();
                } else if (obj2 instanceof Boolean) {
                    if (!((Boolean) obj2).booleanValue()) {
                        j = 0;
                    }
                } else if (obj2 instanceof byte[]) {
                    bindBlob(4, (byte[]) obj2);
                } else {
                    throw new IllegalArgumentException("Attempting to bind an object that is not one of (String, Integer, Short, Long, Float, Double, Boolean, byte[]) to argument arg4");
                }
                bindLong(4, j);
            }
            bindString(5, str);
        }
    }

    public static final class UpdateSuggestedFriend extends ainy {
        public UpdateSuggestedFriend(pa paVar) {
            super(FriendModel.TABLE_NAME, paVar.a("UPDATE Friend\nSET displayName = ?,\n    serverDisplayName = ?,\n    username=?,\n    userId = ?,\n    bitmojiAvatarId=?,\n    bitmojiSelfieId=?,\n    friendLinkType = 5\nWHERE _id= ?"));
        }

        public final void bind(String str, String str2, String str3, String str4, String str5, String str6, long j) {
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
            bindString(3, str3);
            if (str4 == null) {
                bindNull(4);
            } else {
                bindString(4, str4);
            }
            if (str5 == null) {
                bindNull(5);
            } else {
                bindString(5, str5);
            }
            if (str6 == null) {
                bindNull(6);
            } else {
                bindString(6, str6);
            }
            bindLong(7, j);
        }
    }

    public static final class UpdateUsername extends ainy {
        public UpdateUsername(pa paVar) {
            super(FriendModel.TABLE_NAME, paVar.a("UPDATE Friend\nSET username = ?\nWHERE _id = ?"));
        }

        public final void bind(String str, long j) {
            bindString(1, str);
            bindLong(2, j);
        }
    }

    long _id();

    Long _lastModifiedTimestamp();

    Long addedTimestamp();

    CalendarDate birthday();

    String bitmojiAvatarId();

    String bitmojiSelfieId();

    String displayName();

    FriendLinkType friendLinkType();

    String friendmojiCategories();

    Long friendmojiString();

    Friendmojis friendmojis();

    boolean isFideliusReady();

    boolean isOfficial();

    boolean isPopular();

    Long lastMessageId();

    String phone();

    Long receivedFromMe();

    Long reverseAddedTimestamp();

    Long score();

    Long sentToMe();

    String serverDisplayName();

    String snapProId();

    boolean storyMuted();

    Long streakExpiration();

    Integer streakLength();

    Long unreadCount();

    String userId();

    String username();
}
