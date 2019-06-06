package com.snap.core.db.query;

import android.database.Cursor;
import com.snap.core.db.column.CalendarDate;
import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.column.Friendmojis;
import com.snap.core.db.column.GroupStoryType;
import com.snap.core.db.record.FeedMemberModel;
import com.snap.core.db.record.FeedModel;
import com.snap.core.db.record.FriendModel;
import com.snap.core.db.record.StoryModel;
import com.snap.core.db.record.StorySnapModel;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.aioa;
import defpackage.pc;

public interface ProfileModel {

    public static final class Factory<T1 extends FriendModel, T2 extends StoryModel> {
        com.snap.core.db.record.FriendModel.Factory<T1> friendModelFactory;
        com.snap.core.db.record.StoryModel.Factory<T2> storyModelFactory;

        final class GetFriendByUsernameQuery extends ainx {
            private final String username;

            GetFriendByUsernameQuery(String str) {
                super("SELECT\n    Friend._id AS friendRowId,\n    Friend.userId AS friendUserId,\n    Friend.displayName AS friendDisplayName,\n    Friend.serverDisplayName,\n    Friend.username AS friendUsername,\n    Friend.friendmojiString,\n    Friend.bitmojiAvatarId,\n    Friend.bitmojiSelfieId,\n    Friend.birthday,\n    Friend.addedTimestamp,\n    Friend.reverseAddedTimestamp,\n    Friend.friendLinkType,\n    Friend.score,\n    Story.storyRowIdNullable AS storyRowId,\n    Story.latestTimeStamp AS storyLatestTimestamp,\n    Story.latestExpirationTimestamp AS storyLatestExpirationTimestamp,\n    COALESCE((Friend.storyMuted = 1), 0) AS storyMuted,\n    Story.viewed AS storyViewed\nFROM Friend\nLEFT JOIN StoryViewActiveSnaps AS Story ON (Story.kind = 0 AND Story.userName = Friend.username)\nWHERE Friend.username = ?1\nORDER BY Story.latestTimeStamp DESC\nLIMIT 1", new aioa(FriendModel.TABLE_NAME, StoryModel.TABLE_NAME, StorySnapModel.TABLE_NAME));
                this.username = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.username);
            }
        }

        final class GetGroupByFeedIdQuery extends ainx {
            private final long _id;

            GetGroupByFeedIdQuery(long j) {
                super("SELECT\n    Feed._id,\n    Feed.key,\n    Feed.participantsSize,\n    FeedMember.lastInteractionTimestamp,\n    Feed.lastInteractionTimestamp AS groupLastInteractionTimestamp,\n    Story.storyRowIdNullable AS storyRowId,\n    Story.latestExpirationTimestamp AS storyLatestExpirationTimestamp,\n    Story.latestTimeStamp AS storyLatestTimestamp,\n    Story.viewed AS storyViewed,\n    Story.groupStoryType,\n    Feed.groupStoryMuted AS storyMuted,\n    lastInteractionUser.displayName AS displayInteractionUserDisplayName,\n    lastInteractionUser.username AS displayInteractionUserUsername\nFROM\n    Feed\nINNER JOIN FeedMember\n    ON FeedMember.feedRowId = Feed._id\nLEFT OUTER JOIN StoryViewActiveSnaps AS Story\n    ON Feed.storyRowId = Story._id\nLEFT OUTER JOIN Friend AS lastInteractionUser\n    ON Feed.lastInteractionUserId = lastInteractionUser._id\nWHERE Feed._id = ?1\nLIMIT 1", new aioa(FeedModel.TABLE_NAME, FeedMemberModel.TABLE_NAME, StoryModel.TABLE_NAME, StorySnapModel.TABLE_NAME, FriendModel.TABLE_NAME));
                this._id = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this._id);
            }
        }

        final class GetSharedGroupsByFriendRowIdQuery extends ainx {
            private final long friendRowId;

            GetSharedGroupsByFriendRowIdQuery(long j) {
                super("SELECT\n    FeedMember.feedRowId,\n    FeedMember.friendRowId\nFROM FeedMember\nINNER JOIN Feed ON Feed._id = FeedMember.feedRowId\nWHERE FeedMember.friendRowId = ?1 AND Feed.kind = 1 AND removed = 0\nGROUP BY FeedMember.feedRowId", new aioa(FeedMemberModel.TABLE_NAME, FeedModel.TABLE_NAME));
                this.friendRowId = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.friendRowId);
            }
        }

        final class SelectMembersForGroupQuery extends ainx {
            private final long feedRowId;

            SelectMembersForGroupQuery(long j) {
                super("SELECT\n    FeedMember.color,\n    FeedMember.joinedTimestamp,\n    Friend._id AS friendRowId,\n    Friend.userId,\n    Friend.displayName,\n    Friend.serverDisplayName,\n    Friend.username,\n    Friend.bitmojiAvatarId,\n    Friend.bitmojiSelfieId,\n    Friend.score,\n    Friend.friendLinkType,\n    Friend.friendmojis,\n    Friend.streakLength,\n    Friend.streakExpiration,\n    Friend.birthday,\n    Friend.addedTimestamp,\n    Friend.reverseAddedTimestamp,\n    Story.storyRowIdNullable AS storyRowId,\n    Story.latestTimeStamp AS storyLatestTimestamp,\n    Story.latestExpirationTimestamp AS storyLatestExpirationTimestamp,\n    Story.viewed AS storyViewed,\n    COALESCE((Friend.storyMuted = 1), 0) AS storyMuted\nFROM FeedMember\nINNER JOIN Friend ON FeedMember.friendRowId = Friend._id\nLEFT JOIN StoryViewActiveSnaps AS Story ON (Story.kind = 0 AND Story.userName = Friend.username)\nWHERE removed = 0\nAND FeedMember.feedRowId = ?1", new aioa(FeedMemberModel.TABLE_NAME, FriendModel.TABLE_NAME, StoryModel.TABLE_NAME, StorySnapModel.TABLE_NAME));
                this.feedRowId = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.feedRowId);
            }
        }

        public Factory(com.snap.core.db.record.FriendModel.Factory<T1> factory, com.snap.core.db.record.StoryModel.Factory<T2> factory2) {
            this.friendModelFactory = factory;
            this.storyModelFactory = factory2;
        }

        public final ainx getFriendByUsername(String str) {
            return new GetFriendByUsernameQuery(str);
        }

        public final <R extends GetFriendByUsernameModel> GetFriendByUsernameMapper<R, T1> getFriendByUsernameMapper(GetFriendByUsernameCreator<R> getFriendByUsernameCreator) {
            return new GetFriendByUsernameMapper(getFriendByUsernameCreator, this.friendModelFactory);
        }

        public final ainx getGroupByFeedId(long j) {
            return new GetGroupByFeedIdQuery(j);
        }

        public final <R extends GetGroupByFeedIdModel> GetGroupByFeedIdMapper<R, T2> getGroupByFeedIdMapper(GetGroupByFeedIdCreator<R> getGroupByFeedIdCreator) {
            return new GetGroupByFeedIdMapper(getGroupByFeedIdCreator, this.storyModelFactory);
        }

        public final ainx getSharedGroupsByFriendRowId(long j) {
            return new GetSharedGroupsByFriendRowIdQuery(j);
        }

        public final <R extends GetSharedGroupsByFriendRowIdModel> GetSharedGroupsByFriendRowIdMapper<R> getSharedGroupsByFriendRowIdMapper(GetSharedGroupsByFriendRowIdCreator<R> getSharedGroupsByFriendRowIdCreator) {
            return new GetSharedGroupsByFriendRowIdMapper(getSharedGroupsByFriendRowIdCreator);
        }

        public final ainx selectMembersForGroup(long j) {
            return new SelectMembersForGroupQuery(j);
        }

        public final <R extends SelectMembersForGroupModel> SelectMembersForGroupMapper<R, T1> selectMembersForGroupMapper(SelectMembersForGroupCreator<R> selectMembersForGroupCreator) {
            return new SelectMembersForGroupMapper(selectMembersForGroupCreator, this.friendModelFactory);
        }
    }

    public interface GetFriendByUsernameCreator<T extends GetFriendByUsernameModel> {
        T create(long j, String str, String str2, String str3, String str4, Long l, String str5, String str6, CalendarDate calendarDate, Long l2, Long l3, FriendLinkType friendLinkType, Long l4, Long l5, Long l6, Long l7, long j2, Boolean bool);
    }

    public interface GetFriendByUsernameModel {
        Long addedTimestamp();

        CalendarDate birthday();

        String bitmojiAvatarId();

        String bitmojiSelfieId();

        String friendDisplayName();

        FriendLinkType friendLinkType();

        long friendRowId();

        String friendUserId();

        String friendUsername();

        Long friendmojiString();

        Long reverseAddedTimestamp();

        Long score();

        String serverDisplayName();

        Long storyLatestExpirationTimestamp();

        Long storyLatestTimestamp();

        long storyMuted();

        Long storyRowId();

        Boolean storyViewed();
    }

    public interface GetGroupByFeedIdCreator<T extends GetGroupByFeedIdModel> {
        T create(long j, String str, long j2, Long l, Long l2, Long l3, Long l4, Long l5, Boolean bool, GroupStoryType groupStoryType, Boolean bool2, String str2, String str3);
    }

    public interface GetGroupByFeedIdModel {
        long _id();

        String displayInteractionUserDisplayName();

        String displayInteractionUserUsername();

        Long groupLastInteractionTimestamp();

        GroupStoryType groupStoryType();

        String key();

        Long lastInteractionTimestamp();

        long participantsSize();

        Long storyLatestExpirationTimestamp();

        Long storyLatestTimestamp();

        Boolean storyMuted();

        Long storyRowId();

        Boolean storyViewed();
    }

    public interface GetSharedGroupsByFriendRowIdCreator<T extends GetSharedGroupsByFriendRowIdModel> {
        T create(long j, long j2);
    }

    public interface GetSharedGroupsByFriendRowIdModel {
        long feedRowId();

        long friendRowId();
    }

    public interface SelectMembersForGroupCreator<T extends SelectMembersForGroupModel> {
        T create(Integer num, Long l, long j, String str, String str2, String str3, String str4, String str5, String str6, Long l2, FriendLinkType friendLinkType, Friendmojis friendmojis, Integer num2, Long l3, CalendarDate calendarDate, Long l4, Long l5, Long l6, Long l7, Long l8, Boolean bool, long j2);
    }

    public interface SelectMembersForGroupModel {
        Long addedTimestamp();

        CalendarDate birthday();

        String bitmojiAvatarId();

        String bitmojiSelfieId();

        Integer color();

        String displayName();

        FriendLinkType friendLinkType();

        long friendRowId();

        Friendmojis friendmojis();

        Long joinedTimestamp();

        Long reverseAddedTimestamp();

        Long score();

        String serverDisplayName();

        Long storyLatestExpirationTimestamp();

        Long storyLatestTimestamp();

        long storyMuted();

        Long storyRowId();

        Boolean storyViewed();

        Long streakExpiration();

        Integer streakLength();

        String userId();

        String username();
    }

    public static final class GetFriendByUsernameMapper<T extends GetFriendByUsernameModel, T1 extends FriendModel> implements ainw<T> {
        private final GetFriendByUsernameCreator<T> creator;
        private final com.snap.core.db.record.FriendModel.Factory<T1> friendModelFactory;

        public GetFriendByUsernameMapper(GetFriendByUsernameCreator<T> getFriendByUsernameCreator, com.snap.core.db.record.FriendModel.Factory<T1> factory) {
            this.creator = getFriendByUsernameCreator;
            this.friendModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Cursor cursor2 = cursor;
            GetFriendByUsernameCreator getFriendByUsernameCreator = this.creator;
            long j = cursor2.getLong(0);
            String string = cursor2.isNull(1) ? null : cursor2.getString(1);
            String string2 = cursor2.isNull(2) ? null : cursor2.getString(2);
            String string3 = cursor2.isNull(3) ? null : cursor2.getString(3);
            String string4 = cursor2.getString(4);
            Long valueOf = cursor2.isNull(5) ? null : Long.valueOf(cursor2.getLong(5));
            String string5 = cursor2.isNull(6) ? null : cursor2.getString(6);
            String string6 = cursor2.isNull(7) ? null : cursor2.getString(7);
            CalendarDate calendarDate = cursor2.isNull(8) ? null : (CalendarDate) this.friendModelFactory.birthdayAdapter.decode(Long.valueOf(cursor2.getLong(8)));
            Long valueOf2 = cursor2.isNull(9) ? null : Long.valueOf(cursor2.getLong(9));
            Long valueOf3 = cursor2.isNull(10) ? null : Long.valueOf(cursor2.getLong(10));
            FriendLinkType friendLinkType = cursor2.isNull(11) ? null : (FriendLinkType) this.friendModelFactory.friendLinkTypeAdapter.decode(Long.valueOf(cursor2.getLong(11)));
            Long valueOf4 = cursor2.isNull(12) ? null : Long.valueOf(cursor2.getLong(12));
            Long valueOf5 = cursor2.isNull(13) ? null : Long.valueOf(cursor2.getLong(13));
            Long valueOf6 = cursor2.isNull(14) ? null : Long.valueOf(cursor2.getLong(14));
            Long valueOf7 = cursor2.isNull(15) ? null : Long.valueOf(cursor2.getLong(15));
            long j2 = cursor2.getLong(16);
            if (cursor2.isNull(17)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(17) == 1);
            }
            return getFriendByUsernameCreator.create(j, string, string2, string3, string4, valueOf, string5, string6, calendarDate, valueOf2, valueOf3, friendLinkType, valueOf4, valueOf5, valueOf6, valueOf7, j2, bool);
        }
    }

    public static final class GetGroupByFeedIdMapper<T extends GetGroupByFeedIdModel, T1 extends StoryModel> implements ainw<T> {
        private final GetGroupByFeedIdCreator<T> creator;
        private final com.snap.core.db.record.StoryModel.Factory<T1> storyModelFactory;

        public GetGroupByFeedIdMapper(GetGroupByFeedIdCreator<T> getGroupByFeedIdCreator, com.snap.core.db.record.StoryModel.Factory<T1> factory) {
            this.creator = getGroupByFeedIdCreator;
            this.storyModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Boolean bool2;
            Cursor cursor2 = cursor;
            GetGroupByFeedIdCreator getGroupByFeedIdCreator = this.creator;
            long j = cursor2.getLong(0);
            String string = cursor2.getString(1);
            long j2 = cursor2.getLong(2);
            Long valueOf = cursor2.isNull(3) ? null : Long.valueOf(cursor2.getLong(3));
            Long valueOf2 = cursor2.isNull(4) ? null : Long.valueOf(cursor2.getLong(4));
            Long valueOf3 = cursor2.isNull(5) ? null : Long.valueOf(cursor2.getLong(5));
            Long valueOf4 = cursor2.isNull(6) ? null : Long.valueOf(cursor2.getLong(6));
            Long valueOf5 = cursor2.isNull(7) ? null : Long.valueOf(cursor2.getLong(7));
            if (cursor2.isNull(8)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(8) == 1);
            }
            GroupStoryType groupStoryType = cursor2.isNull(9) ? null : (GroupStoryType) this.storyModelFactory.groupStoryTypeAdapter.decode(Long.valueOf(cursor2.getLong(9)));
            if (cursor2.isNull(10)) {
                bool2 = null;
            } else {
                bool2 = Boolean.valueOf(cursor2.getInt(10) == 1);
            }
            return getGroupByFeedIdCreator.create(j, string, j2, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, bool, groupStoryType, bool2, cursor2.isNull(11) ? null : cursor2.getString(11), cursor2.isNull(12) ? null : cursor2.getString(12));
        }
    }

    public static final class GetSharedGroupsByFriendRowIdMapper<T extends GetSharedGroupsByFriendRowIdModel> implements ainw<T> {
        private final GetSharedGroupsByFriendRowIdCreator<T> creator;

        public GetSharedGroupsByFriendRowIdMapper(GetSharedGroupsByFriendRowIdCreator<T> getSharedGroupsByFriendRowIdCreator) {
            this.creator = getSharedGroupsByFriendRowIdCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), cursor.getLong(1));
        }
    }

    public static final class SelectMembersForGroupMapper<T extends SelectMembersForGroupModel, T1 extends FriendModel> implements ainw<T> {
        private final SelectMembersForGroupCreator<T> creator;
        private final com.snap.core.db.record.FriendModel.Factory<T1> friendModelFactory;

        public SelectMembersForGroupMapper(SelectMembersForGroupCreator<T> selectMembersForGroupCreator, com.snap.core.db.record.FriendModel.Factory<T1> factory) {
            this.creator = selectMembersForGroupCreator;
            this.friendModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Cursor cursor2 = cursor;
            SelectMembersForGroupCreator selectMembersForGroupCreator = this.creator;
            Integer valueOf = cursor2.isNull(0) ? null : Integer.valueOf(cursor2.getInt(0));
            Long valueOf2 = cursor2.isNull(1) ? null : Long.valueOf(cursor2.getLong(1));
            long j = cursor2.getLong(2);
            String string = cursor2.isNull(3) ? null : cursor2.getString(3);
            String string2 = cursor2.isNull(4) ? null : cursor2.getString(4);
            String string3 = cursor2.isNull(5) ? null : cursor2.getString(5);
            String string4 = cursor2.getString(6);
            String string5 = cursor2.isNull(7) ? null : cursor2.getString(7);
            String string6 = cursor2.isNull(8) ? null : cursor2.getString(8);
            Long valueOf3 = cursor2.isNull(9) ? null : Long.valueOf(cursor2.getLong(9));
            FriendLinkType friendLinkType = cursor2.isNull(10) ? null : (FriendLinkType) this.friendModelFactory.friendLinkTypeAdapter.decode(Long.valueOf(cursor2.getLong(10)));
            Friendmojis friendmojis = cursor2.isNull(11) ? null : (Friendmojis) this.friendModelFactory.friendmojisAdapter.decode(cursor2.getString(11));
            Integer valueOf4 = cursor2.isNull(12) ? null : Integer.valueOf(cursor2.getInt(12));
            Long valueOf5 = cursor2.isNull(13) ? null : Long.valueOf(cursor2.getLong(13));
            CalendarDate calendarDate = cursor2.isNull(14) ? null : (CalendarDate) this.friendModelFactory.birthdayAdapter.decode(Long.valueOf(cursor2.getLong(14)));
            Long valueOf6 = cursor2.isNull(15) ? null : Long.valueOf(cursor2.getLong(15));
            Long valueOf7 = cursor2.isNull(16) ? null : Long.valueOf(cursor2.getLong(16));
            Long valueOf8 = cursor2.isNull(17) ? null : Long.valueOf(cursor2.getLong(17));
            Long valueOf9 = cursor2.isNull(18) ? null : Long.valueOf(cursor2.getLong(18));
            Long valueOf10 = cursor2.isNull(19) ? null : Long.valueOf(cursor2.getLong(19));
            if (cursor2.isNull(20)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(20) == 1);
            }
            return selectMembersForGroupCreator.create(valueOf, valueOf2, j, string, string2, string3, string4, string5, string6, valueOf3, friendLinkType, friendmojis, valueOf4, valueOf5, calendarDate, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, bool, cursor2.getLong(21));
        }
    }
}
