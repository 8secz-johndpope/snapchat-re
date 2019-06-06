package com.snap.core.db.record;

import android.database.Cursor;
import com.snap.core.db.column.Friendmojis;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.ainz;
import defpackage.aioa;
import defpackage.pa;
import defpackage.pc;

public interface FeedMemberModel {
    public static final String ADDJOINEDTIMESTAMPCOLUMN = "ALTER TABLE FeedMember\nADD COLUMN joinedTimestamp INTEGER DEFAULT 0";
    public static final String ADDVIDEOCHATUSERIDCOLUMN = "ALTER TABLE FeedMember\nADD COLUMN videoChatUserId INTEGER";
    @Deprecated
    public static final String COLOR = "color";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS FeedMember (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    feedRowId INTEGER NOT NULL,\n    friendRowId INTEGER NOT NULL,\n    color INTEGER,\n    lastInteractionTimestamp INTEGER DEFAULT 0,\n    --this is only updated on the FeedMember of current logged in user.\n    joinedTimestamp INTEGER DEFAULT 0,\n    removed INTEGER NOT NULL,\n    videoChatUserId INTEGER,\n    UNIQUE(feedRowId, friendRowId)\n)";
    public static final String DROPTABLE = "DROP TABLE FeedMember";
    @Deprecated
    public static final String FEEDROWID = "feedRowId";
    @Deprecated
    public static final String FRIENDROWID = "friendRowId";
    @Deprecated
    public static final String JOINEDTIMESTAMP = "joinedTimestamp";
    @Deprecated
    public static final String LASTINTERACTIONTIMESTAMP = "lastInteractionTimestamp";
    @Deprecated
    public static final String REMOVED = "removed";
    @Deprecated
    public static final String TABLE_NAME = "FeedMember";
    @Deprecated
    public static final String VIDEOCHATUSERID = "videoChatUserId";
    @Deprecated
    public static final String _ID = "_id";

    public static final class InsertMemberOrIgnore extends ainy {
        public InsertMemberOrIgnore(pa paVar) {
            super(FeedMemberModel.TABLE_NAME, paVar.a("INSERT OR IGNORE INTO FeedMember(\n    feedRowId,\n    friendRowId,\n    color,\n    lastInteractionTimestamp,\n    joinedTimestamp,\n    videoChatUserId,\n    removed\n)\nVALUES(?,?,?,?,?,?,0)"));
        }

        public final void bind(long j, long j2, Integer num, Long l, Long l2, Long l3) {
            bindLong(1, j);
            bindLong(2, j2);
            if (num == null) {
                bindNull(3);
            } else {
                bindLong(3, (long) num.intValue());
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
            if (l3 == null) {
                bindNull(6);
            } else {
                bindLong(6, l3.longValue());
            }
        }
    }

    public interface Creator<T extends FeedMemberModel> {
        T create(long j, long j2, long j3, Integer num, Long l, Long l2, boolean z, Long l3);
    }

    public static final class Factory<T extends FeedMemberModel> {
        public final Creator<T> creator;

        final class GetAllFeedsWithMembersQuery extends ainx {
            private final long[] friendRowId;

            GetAllFeedsWithMembersQuery(long[] jArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT DISTINCT feedRowId\nFROM FeedMember\nWHERE friendRowId IN ");
                stringBuilder.append(ainz.a(jArr.length));
                super(stringBuilder.toString(), new aioa(FeedMemberModel.TABLE_NAME));
                this.friendRowId = jArr;
            }

            public final void bindTo(pc pcVar) {
                long[] jArr = this.friendRowId;
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

        final class GetFriendUserIdsForGroupQuery extends ainx {
            private final long _id;
            private final long feedRowId;

            GetFriendUserIdsForGroupQuery(long j, long j2) {
                super("SELECT userId\nFROM Friend\nWHERE _id IN (SELECT friendRowId FROM FeedMember WHERE removed = 0 AND feedRowId = ?1)\nAND _id != ?2", new aioa(FriendModel.TABLE_NAME, FeedMemberModel.TABLE_NAME));
                this.feedRowId = j;
                this._id = j2;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.feedRowId);
                pcVar.bindLong(2, this._id);
            }
        }

        final class GetGroupFeedIdsForFriendRowIdsQuery extends ainx {
            private final long[] friendRowId;
            private final long participantsSize;

            GetGroupFeedIdsForFriendRowIdsQuery(long j, long[] jArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT Feed._id, Feed.key\nFROM Feed\nWHERE Feed._id IN (SELECT FeedMember.feedRowId\n                   FROM FeedMember\n                   WHERE removed = 0\n                   AND Feed.participantsSize = ?1\n                   AND friendRowId IN ");
                stringBuilder.append(ainz.a(jArr.length));
                stringBuilder.append("\n                   GROUP BY FeedMember.feedRowId\n                   HAVING COUNT(feedRowId) = ?1)");
                super(stringBuilder.toString(), new aioa(FeedModel.TABLE_NAME, FeedMemberModel.TABLE_NAME));
                this.participantsSize = j;
                this.friendRowId = jArr;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.participantsSize);
                long[] jArr = this.friendRowId;
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

        final class SelectAllParticipantsForFeedQuery extends ainx {
            private final long feedRowId;

            SelectAllParticipantsForFeedQuery(long j) {
                super("SELECT\n    FeedMember.friendRowId AS friendRowId,\n    Friend.displayName,\n    Friend.username\nFROM FeedMember\nINNER JOIN Friend ON FeedMember.friendRowId = Friend._id\nWHERE FeedMember.feedRowId = ?1", new aioa(FeedMemberModel.TABLE_NAME, FriendModel.TABLE_NAME));
                this.feedRowId = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.feedRowId);
            }
        }

        final class SelectBlockedUsernamesForConversationQuery extends ainx {
            private final String key;

            SelectBlockedUsernamesForConversationQuery(String str) {
                super("SELECT Friend.username AS username\nFROM FeedMember\nINNER JOIN Friend ON FeedMember.friendRowId = Friend._id\nINNER JOIN Feed ON FeedMember.feedRowId = Feed._id\nWHERE Feed.key = ?1 AND FeedMember.removed = 0 AND Friend.friendLinkType = 2", new aioa(FeedMemberModel.TABLE_NAME, FriendModel.TABLE_NAME, FeedModel.TABLE_NAME));
                this.key = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.key);
            }
        }

        final class SelectMemberNamesForFeedQuery extends ainx {
            private final long feedRowId;
            private final String username;

            SelectMemberNamesForFeedQuery(long j, String str) {
                super("SELECT\n    Friend.displayName AS display,\n    Friend.username AS username\nFROM Friend\nWHERE _id IN (SELECT friendRowId FROM FeedMember WHERE removed = 0 AND feedRowId = ?1)\nAND Friend.username != ?2", new aioa(FriendModel.TABLE_NAME, FeedMemberModel.TABLE_NAME));
                this.feedRowId = j;
                this.username = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.feedRowId);
                pcVar.bindString(2, this.username);
            }
        }

        final class SelectMembersForAvatarQuery extends ainx {
            private final long feedRowId;
            private final String username;

            SelectMembersForAvatarQuery(String str, long j) {
                super("SELECT\n    FeedMember.color,\n    Friend.displayName,\n    Friend.username,\n    Friend.bitmojiAvatarId,\n    Friend.bitmojiSelfieId\nFROM FeedMember\nINNER JOIN Friend ON FeedMember.friendRowId = Friend._id\nWHERE FeedMember.removed = 0\nAND Friend.username != ?1\nAND FeedMember.feedRowId = ?2\nORDER BY FeedMember.lastInteractionTimestamp DESC\nLIMIT 3", new aioa(FeedMemberModel.TABLE_NAME, FriendModel.TABLE_NAME));
                this.username = str;
                this.feedRowId = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.username);
                pcVar.bindLong(2, this.feedRowId);
            }
        }

        final class SelectMembersForFeedQuery extends ainx {
            private final long feedRowId;

            SelectMembersForFeedQuery(long j) {
                super("SELECT\n    FeedMember.friendRowId AS friendRowId,\n    FeedMember.joinedTimestamp,\n    Friend.displayName,\n    Friend.username\nFROM FeedMember\nINNER JOIN Friend ON FeedMember.friendRowId = Friend._id\nWHERE removed = 0\nAND FeedMember.feedRowId = ?1", new aioa(FeedMemberModel.TABLE_NAME, FriendModel.TABLE_NAME));
                this.feedRowId = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.feedRowId);
            }
        }

        final class SelectMembersForTalkQuery extends ainx {
            private final long feedRowId;

            SelectMembersForTalkQuery(long j) {
                super("SELECT\n    FeedMember.color,\n    FeedMember.videoChatUserId,\n    Friend.userId,\n    Friend.username,\n    Friend.displayName,\n    Friend.bitmojiAvatarId\nFROM FeedMember\nINNER JOIN Friend ON FeedMember.friendRowId = Friend._id\nWHERE FeedMember.removed = 0 AND FeedMember.feedRowId = ?1", new aioa(FeedMemberModel.TABLE_NAME, FriendModel.TABLE_NAME));
                this.feedRowId = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.feedRowId);
            }
        }

        final class SelectParticipantDetailsForFeedQuery extends ainx {
            private final long feedRowId;

            SelectParticipantDetailsForFeedQuery(long j) {
                super("SELECT\n    FeedMember.friendRowId AS friendRowId,\n    FeedMember.color AS color,\n    Friend.userId,\n    Friend.displayName,\n    Friend.username,\n    Friend.bitmojiAvatarId,\n    Friend.bitmojiSelfieId,\n    Friend.friendmojis\nFROM FeedMember\nINNER JOIN Friend ON FeedMember.friendRowId = Friend._id\nWHERE removed = 0\nAND FeedMember.feedRowId = ?1", new aioa(FeedMemberModel.TABLE_NAME, FriendModel.TABLE_NAME));
                this.feedRowId = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.feedRowId);
            }
        }

        public Factory(Creator<T> creator) {
            this.creator = creator;
        }

        public final ainx getAllFeedsWithMembers(long[] jArr) {
            return new GetAllFeedsWithMembersQuery(jArr);
        }

        public final ainw<Long> getAllFeedsWithMembersMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx getFriendUserIdsForGroup(long j, long j2) {
            return new GetFriendUserIdsForGroupQuery(j, j2);
        }

        public final ainw<String> getFriendUserIdsForGroupMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.isNull(0) ? null : cursor.getString(0);
                }
            };
        }

        public final ainx getGroupFeedIdsForFriendRowIds(long j, long[] jArr) {
            return new GetGroupFeedIdsForFriendRowIdsQuery(j, jArr);
        }

        public final <R extends GetGroupFeedIdsForFriendRowIdsModel> GetGroupFeedIdsForFriendRowIdsMapper<R> getGroupFeedIdsForFriendRowIdsMapper(GetGroupFeedIdsForFriendRowIdsCreator<R> getGroupFeedIdsForFriendRowIdsCreator) {
            return new GetGroupFeedIdsForFriendRowIdsMapper(getGroupFeedIdsForFriendRowIdsCreator);
        }

        public final ainx selectAllParticipantsForFeed(long j) {
            return new SelectAllParticipantsForFeedQuery(j);
        }

        public final <R extends SelectAllParticipantsForFeedModel> SelectAllParticipantsForFeedMapper<R> selectAllParticipantsForFeedMapper(SelectAllParticipantsForFeedCreator<R> selectAllParticipantsForFeedCreator) {
            return new SelectAllParticipantsForFeedMapper(selectAllParticipantsForFeedCreator);
        }

        public final ainx selectBlockedUsernamesForConversation(String str) {
            return new SelectBlockedUsernamesForConversationQuery(str);
        }

        public final ainw<String> selectBlockedUsernamesForConversationMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.getString(0);
                }
            };
        }

        public final ainx selectMemberNamesForFeed(long j, String str) {
            return new SelectMemberNamesForFeedQuery(j, str);
        }

        public final <R extends SelectMemberNamesForFeedModel> SelectMemberNamesForFeedMapper<R> selectMemberNamesForFeedMapper(SelectMemberNamesForFeedCreator<R> selectMemberNamesForFeedCreator) {
            return new SelectMemberNamesForFeedMapper(selectMemberNamesForFeedCreator);
        }

        public final ainx selectMembersForAvatar(String str, long j) {
            return new SelectMembersForAvatarQuery(str, j);
        }

        public final <R extends SelectMembersForAvatarModel> SelectMembersForAvatarMapper<R> selectMembersForAvatarMapper(SelectMembersForAvatarCreator<R> selectMembersForAvatarCreator) {
            return new SelectMembersForAvatarMapper(selectMembersForAvatarCreator);
        }

        public final ainx selectMembersForFeed(long j) {
            return new SelectMembersForFeedQuery(j);
        }

        public final <R extends SelectMembersForFeedModel> SelectMembersForFeedMapper<R> selectMembersForFeedMapper(SelectMembersForFeedCreator<R> selectMembersForFeedCreator) {
            return new SelectMembersForFeedMapper(selectMembersForFeedCreator);
        }

        public final ainx selectMembersForTalk(long j) {
            return new SelectMembersForTalkQuery(j);
        }

        public final <R extends SelectMembersForTalkModel> SelectMembersForTalkMapper<R> selectMembersForTalkMapper(SelectMembersForTalkCreator<R> selectMembersForTalkCreator) {
            return new SelectMembersForTalkMapper(selectMembersForTalkCreator);
        }

        public final ainx selectParticipantDetailsForFeed(long j) {
            return new SelectParticipantDetailsForFeedQuery(j);
        }

        public final <R extends SelectParticipantDetailsForFeedModel, T1 extends FriendModel> SelectParticipantDetailsForFeedMapper<R, T1> selectParticipantDetailsForFeedMapper(SelectParticipantDetailsForFeedCreator<R> selectParticipantDetailsForFeedCreator, com.snap.core.db.record.FriendModel.Factory<T1> factory) {
            return new SelectParticipantDetailsForFeedMapper(selectParticipantDetailsForFeedCreator, factory);
        }
    }

    public interface GetGroupFeedIdsForFriendRowIdsCreator<T extends GetGroupFeedIdsForFriendRowIdsModel> {
        T create(long j, String str);
    }

    public interface GetGroupFeedIdsForFriendRowIdsModel {
        long _id();

        String key();
    }

    public interface SelectAllParticipantsForFeedCreator<T extends SelectAllParticipantsForFeedModel> {
        T create(long j, String str, String str2);
    }

    public interface SelectAllParticipantsForFeedModel {
        String displayName();

        long friendRowId();

        String username();
    }

    public interface SelectMemberNamesForFeedCreator<T extends SelectMemberNamesForFeedModel> {
        T create(String str, String str2);
    }

    public interface SelectMemberNamesForFeedModel {
        String display();

        String username();
    }

    public interface SelectMembersForAvatarCreator<T extends SelectMembersForAvatarModel> {
        T create(Integer num, String str, String str2, String str3, String str4);
    }

    public interface SelectMembersForAvatarModel {
        String bitmojiAvatarId();

        String bitmojiSelfieId();

        Integer color();

        String displayName();

        String username();
    }

    public interface SelectMembersForFeedCreator<T extends SelectMembersForFeedModel> {
        T create(long j, Long l, String str, String str2);
    }

    public interface SelectMembersForFeedModel {
        String displayName();

        long friendRowId();

        Long joinedTimestamp();

        String username();
    }

    public interface SelectMembersForTalkCreator<T extends SelectMembersForTalkModel> {
        T create(Integer num, Long l, String str, String str2, String str3, String str4);
    }

    public interface SelectMembersForTalkModel {
        String bitmojiAvatarId();

        Integer color();

        String displayName();

        String userId();

        String username();

        Long videoChatUserId();
    }

    public interface SelectParticipantDetailsForFeedCreator<T extends SelectParticipantDetailsForFeedModel> {
        T create(long j, Integer num, String str, String str2, String str3, String str4, String str5, Friendmojis friendmojis);
    }

    public interface SelectParticipantDetailsForFeedModel {
        String bitmojiAvatarId();

        String bitmojiSelfieId();

        Integer color();

        String displayName();

        long friendRowId();

        Friendmojis friendmojis();

        String userId();

        String username();
    }

    public static final class GetGroupFeedIdsForFriendRowIdsMapper<T extends GetGroupFeedIdsForFriendRowIdsModel> implements ainw<T> {
        private final GetGroupFeedIdsForFriendRowIdsCreator<T> creator;

        public GetGroupFeedIdsForFriendRowIdsMapper(GetGroupFeedIdsForFriendRowIdsCreator<T> getGroupFeedIdsForFriendRowIdsCreator) {
            this.creator = getGroupFeedIdsForFriendRowIdsCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), cursor.getString(1));
        }
    }

    public static final class Mapper<T extends FeedMemberModel> implements ainw<T> {
        private final Factory<T> feedMemberModelFactory;

        public Mapper(Factory<T> factory) {
            this.feedMemberModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            Creator creator = this.feedMemberModelFactory.creator;
            boolean z = false;
            long j = cursor2.getLong(0);
            long j2 = cursor2.getLong(1);
            long j3 = cursor2.getLong(2);
            Integer valueOf = cursor2.isNull(3) ? null : Integer.valueOf(cursor2.getInt(3));
            Long valueOf2 = cursor2.isNull(4) ? null : Long.valueOf(cursor2.getLong(4));
            Long valueOf3 = cursor2.isNull(5) ? null : Long.valueOf(cursor2.getLong(5));
            if (cursor2.getInt(6) == 1) {
                z = true;
            }
            return creator.create(j, j2, j3, valueOf, valueOf2, valueOf3, z, cursor2.isNull(7) ? null : Long.valueOf(cursor2.getLong(7)));
        }
    }

    public static final class SelectAllParticipantsForFeedMapper<T extends SelectAllParticipantsForFeedModel> implements ainw<T> {
        private final SelectAllParticipantsForFeedCreator<T> creator;

        public SelectAllParticipantsForFeedMapper(SelectAllParticipantsForFeedCreator<T> selectAllParticipantsForFeedCreator) {
            this.creator = selectAllParticipantsForFeedCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), cursor.isNull(1) ? null : cursor.getString(1), cursor.getString(2));
        }
    }

    public static final class SelectMemberNamesForFeedMapper<T extends SelectMemberNamesForFeedModel> implements ainw<T> {
        private final SelectMemberNamesForFeedCreator<T> creator;

        public SelectMemberNamesForFeedMapper(SelectMemberNamesForFeedCreator<T> selectMemberNamesForFeedCreator) {
            this.creator = selectMemberNamesForFeedCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.isNull(0) ? null : cursor.getString(0), cursor.getString(1));
        }
    }

    public static final class SelectMembersForAvatarMapper<T extends SelectMembersForAvatarModel> implements ainw<T> {
        private final SelectMembersForAvatarCreator<T> creator;

        public SelectMembersForAvatarMapper(SelectMembersForAvatarCreator<T> selectMembersForAvatarCreator) {
            this.creator = selectMembersForAvatarCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.isNull(0) ? null : Integer.valueOf(cursor.getInt(0)), cursor.isNull(1) ? null : cursor.getString(1), cursor.getString(2), cursor.isNull(3) ? null : cursor.getString(3), cursor.isNull(4) ? null : cursor.getString(4));
        }
    }

    public static final class SelectMembersForFeedMapper<T extends SelectMembersForFeedModel> implements ainw<T> {
        private final SelectMembersForFeedCreator<T> creator;

        public SelectMembersForFeedMapper(SelectMembersForFeedCreator<T> selectMembersForFeedCreator) {
            this.creator = selectMembersForFeedCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), cursor.isNull(1) ? null : Long.valueOf(cursor.getLong(1)), cursor.isNull(2) ? null : cursor.getString(2), cursor.getString(3));
        }
    }

    public static final class SelectMembersForTalkMapper<T extends SelectMembersForTalkModel> implements ainw<T> {
        private final SelectMembersForTalkCreator<T> creator;

        public SelectMembersForTalkMapper(SelectMembersForTalkCreator<T> selectMembersForTalkCreator) {
            this.creator = selectMembersForTalkCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.isNull(0) ? null : Integer.valueOf(cursor.getInt(0)), cursor.isNull(1) ? null : Long.valueOf(cursor.getLong(1)), cursor.isNull(2) ? null : cursor.getString(2), cursor.getString(3), cursor.isNull(4) ? null : cursor.getString(4), cursor.isNull(5) ? null : cursor.getString(5));
        }
    }

    public static final class SelectParticipantDetailsForFeedMapper<T extends SelectParticipantDetailsForFeedModel, T1 extends FriendModel> implements ainw<T> {
        private final SelectParticipantDetailsForFeedCreator<T> creator;
        private final com.snap.core.db.record.FriendModel.Factory<T1> friendModelFactory;

        public SelectParticipantDetailsForFeedMapper(SelectParticipantDetailsForFeedCreator<T> selectParticipantDetailsForFeedCreator, com.snap.core.db.record.FriendModel.Factory<T1> factory) {
            this.creator = selectParticipantDetailsForFeedCreator;
            this.friendModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), cursor.isNull(1) ? null : Integer.valueOf(cursor.getInt(1)), cursor.isNull(2) ? null : cursor.getString(2), cursor.isNull(3) ? null : cursor.getString(3), cursor.getString(4), cursor.isNull(5) ? null : cursor.getString(5), cursor.isNull(6) ? null : cursor.getString(6), cursor.isNull(7) ? null : (Friendmojis) this.friendModelFactory.friendmojisAdapter.decode(cursor.getString(7)));
        }
    }

    public static final class ClearFeedMembers extends ainy {
        public ClearFeedMembers(pa paVar) {
            super(FeedMemberModel.TABLE_NAME, paVar.a("DELETE FROM FeedMember\nWHERE feedRowId=?"));
        }

        public final void bind(long j) {
            bindLong(1, j);
        }
    }

    public static final class InsertFormerMember extends ainy {
        public InsertFormerMember(pa paVar) {
            super(FeedMemberModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO FeedMember(\n    feedRowId,\n    friendRowId,\n    removed\n)\nVALUES (?,?,1)"));
        }

        public final void bind(long j, long j2) {
            bindLong(1, j);
            bindLong(2, j2);
        }
    }

    public static final class InsertMember extends ainy {
        public InsertMember(pa paVar) {
            super(FeedMemberModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO FeedMember(\n    feedRowId,\n    friendRowId,\n    color,\n    lastInteractionTimestamp,\n    joinedTimestamp,\n    videoChatUserId,\n    removed\n)\nVALUES(?,?,?,?,?,?,0)"));
        }

        public final void bind(long j, long j2, Integer num, Long l, Long l2, Long l3) {
            bindLong(1, j);
            bindLong(2, j2);
            if (num == null) {
                bindNull(3);
            } else {
                bindLong(3, (long) num.intValue());
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
            if (l3 == null) {
                bindNull(6);
            } else {
                bindLong(6, l3.longValue());
            }
        }
    }

    public static final class UpdateJoinedTimestamp extends ainy {
        public UpdateJoinedTimestamp(pa paVar) {
            super(FeedMemberModel.TABLE_NAME, paVar.a("UPDATE FeedMember\nSET joinedTimestamp = ?\nWHERE feedRowId = ?"));
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

    public static final class UpdateMember extends ainy {
        public UpdateMember(pa paVar) {
            super(FeedMemberModel.TABLE_NAME, paVar.a("UPDATE FeedMember\nSET\n    lastInteractionTimestamp = ?\nWHERE feedRowId = ? AND friendRowId = ?"));
        }

        public final void bind(Long l, long j, long j2) {
            if (l == null) {
                bindNull(1);
            } else {
                bindLong(1, l.longValue());
            }
            bindLong(2, j);
            bindLong(3, j2);
        }
    }

    long _id();

    Integer color();

    long feedRowId();

    long friendRowId();

    Long joinedTimestamp();

    Long lastInteractionTimestamp();

    boolean removed();

    Long videoChatUserId();
}
