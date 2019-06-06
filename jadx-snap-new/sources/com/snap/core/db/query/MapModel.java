package com.snap.core.db.query;

import android.database.Cursor;
import com.snap.core.db.column.CalendarDate;
import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.record.BestFriendModel;
import com.snap.core.db.record.FeedModel;
import com.snap.core.db.record.FriendModel;
import com.snap.core.db.record.StoryModel;
import com.snap.core.db.record.StorySnapModel;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.aioa;
import defpackage.pc;

public interface MapModel {

    public static final class Factory<T1 extends FriendModel> {
        com.snap.core.db.record.FriendModel.Factory<T1> friendModelFactory;

        final class GetFeedInteractionTypeForFriendQuery extends ainx {
            private final String username;

            GetFeedInteractionTypeForFriendQuery(String str) {
                super("SELECT Feed.displayInteractionType\nFROM Feed\nINNER JOIN Friend ON Friend._id = Feed.friendRowId\nWHERE Friend.username=?1 AND kind=0\nLIMIT 1", new aioa(FeedModel.TABLE_NAME, FriendModel.TABLE_NAME));
                this.username = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.username);
            }
        }

        final class GetFriendByUserIdQuery extends ainx {
            private final String userId;

            GetFriendByUserIdQuery(String str) {
                super("SELECT\n    Friend._id AS friendRowId,\n    Friend.userId AS friendUserId,\n    Friend.displayName AS friendDisplayName,\n    Friend.serverDisplayName,\n    Friend.username AS friendUsername,\n    Friend.friendmojiString,\n    Friend.bitmojiAvatarId,\n    Friend.bitmojiSelfieId,\n    Friend.birthday,\n    Friend.addedTimestamp,\n    Friend.reverseAddedTimestamp,\n    Friend.friendLinkType,\n    Friend.score,\n    Story._id AS storyRowId,\n    Story.latestTimeStamp AS storyLatestTimestamp,\n    Story.latestExpirationTimestamp AS storyLatestExpirationTimestamp,\n    COALESCE((Friend.storyMuted = 1), 0) AS storyMuted,\n    Story.viewed AS storyViewed\nFROM Friend\nLEFT JOIN Story ON (Story.kind = 0 AND Story.userName = Friend.username)\nWHERE Friend.userId = ?1\nORDER BY Story.latestTimeStamp DESC\nLIMIT 1", new aioa(FriendModel.TABLE_NAME, StoryModel.TABLE_NAME));
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

        final class GetValidFriendsInfoQuery extends ainx {
            private final String username;

            GetValidFriendsInfoQuery(String str) {
                super("SELECT\n    Friend._id AS friendId,\n    userId,\n    displayName,\n    username\nFROM Friend\nWHERE (friendLinkType IS 0\n    OR (friendLinkType IS 1 AND addedTimestamp IS NOT 0))\nAND username != 'teamsnapchat' AND username != ?1\nORDER BY LOWER(displayName) ASC", new aioa(FriendModel.TABLE_NAME));
                this.username = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.username);
            }
        }

        public Factory(com.snap.core.db.record.FriendModel.Factory<T1> factory) {
            this.friendModelFactory = factory;
        }

        public final ainx getBestFriendsInfo() {
            return new ainx("SELECT\n    Friend._id AS friendId,\n    userId,\n    displayName,\n    username\nFROM Friend\nLEFT OUTER JOIN BestFriend ON Friend._id = BestFriend.friendRowId\nWHERE Friend._id = BestFriend.friendRowId", new aioa(FriendModel.TABLE_NAME, BestFriendModel.TABLE_NAME));
        }

        public final <R extends GetBestFriendsInfoModel> GetBestFriendsInfoMapper<R> getBestFriendsInfoMapper(GetBestFriendsInfoCreator<R> getBestFriendsInfoCreator) {
            return new GetBestFriendsInfoMapper(getBestFriendsInfoCreator);
        }

        public final ainx getFeedInteractionTypeForFriend(String str) {
            return new GetFeedInteractionTypeForFriendQuery(str);
        }

        public final ainw<String> getFeedInteractionTypeForFriendMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.isNull(0) ? null : cursor.getString(0);
                }
            };
        }

        public final ainx getFriendByUserId(String str) {
            return new GetFriendByUserIdQuery(str);
        }

        public final <R extends GetFriendByUserIdModel> GetFriendByUserIdMapper<R, T1> getFriendByUserIdMapper(GetFriendByUserIdCreator<R> getFriendByUserIdCreator) {
            return new GetFriendByUserIdMapper(getFriendByUserIdCreator, this.friendModelFactory);
        }

        public final ainx getFriendsAndStoriesInfo() {
            return new ainx("SELECT\n    Friend._id AS friendRowId,\n    userId,\n    Friend.displayName,\n    Friend.username AS username,\n    bitmojiAvatarId,\n    bitmojiSelfieId,\n    Story.storyRowIdNullable AS storyRowId,\n    Story.latestExpirationTimestamp AS storyLatestExpirationTimestamp,\n    Story.latestTimeStamp AS storyLatestTimestamp,\n    Story.viewed AS storyViewed,\n    BestFriend._id AS bestFriendRowId\nFROM Friend\nLEFT OUTER JOIN StoryViewActiveSnaps AS Story ON Friend.username = Story.storyId\nLEFT OUTER JOIN BestFriend ON Friend._id = BestFriend.friendRowId\nWHERE (Friend.friendLinkType IS 0\n      OR (Friend.friendLinkType IS 1 AND Friend.addedTimestamp IS NOT 0))", new aioa(FriendModel.TABLE_NAME, StoryModel.TABLE_NAME, StorySnapModel.TABLE_NAME, BestFriendModel.TABLE_NAME));
        }

        public final <R extends GetFriendsAndStoriesInfoModel> GetFriendsAndStoriesInfoMapper<R> getFriendsAndStoriesInfoMapper(GetFriendsAndStoriesInfoCreator<R> getFriendsAndStoriesInfoCreator) {
            return new GetFriendsAndStoriesInfoMapper(getFriendsAndStoriesInfoCreator);
        }

        public final ainx getFriendsInfo() {
            return new ainx("SELECT\n    Friend._id AS friendRowId,\n    userId,\n    Friend.displayName,\n    username,\n    bitmojiAvatarId,\n    bitmojiSelfieId\nFROM Friend\nWHERE (friendLinkType IS 0\n      OR (friendLinkType IS 1 AND addedTimestamp IS NOT 0))", new aioa(FriendModel.TABLE_NAME));
        }

        public final <R extends GetFriendsInfoModel> GetFriendsInfoMapper<R> getFriendsInfoMapper(GetFriendsInfoCreator<R> getFriendsInfoCreator) {
            return new GetFriendsInfoMapper(getFriendsInfoCreator);
        }

        public final ainx getRecentFriendsInfo() {
            return new ainx("SELECT DISTINCT\n    Friend._id AS friendId,\n    userId,\n    displayName,\n    username\nFROM Feed\nLEFT OUTER JOIN Friend ON Feed.friendRowId = Friend._id\nWHERE (Feed.friendRowId NOT IN (SELECT friendRowId FROM BestFriend) AND (username != 'teamsnapchat'))\n-- We only want friends that are MUTUAL, OUTGOING, or FOLLOWING\nAND (Friend.friendLinkType IS NULL OR Friend.friendLinkType IN (0,1,4))\nORDER BY lastInteractionTimestamp DESC", new aioa(FeedModel.TABLE_NAME, FriendModel.TABLE_NAME, BestFriendModel.TABLE_NAME));
        }

        public final <R extends GetRecentFriendsInfoModel> GetRecentFriendsInfoMapper<R> getRecentFriendsInfoMapper(GetRecentFriendsInfoCreator<R> getRecentFriendsInfoCreator) {
            return new GetRecentFriendsInfoMapper(getRecentFriendsInfoCreator);
        }

        public final ainx getValidFriendsAndCurrentUserInfo() {
            return new ainx("SELECT\n    Friend._id AS friendId,\n    userId,\n    displayName,\n    username\nFROM Friend\nWHERE (friendLinkType IS 0\n    OR (friendLinkType IS 1 AND addedTimestamp IS NOT 0))\nAND username != 'teamsnapchat'\nORDER BY displayName ASC", new aioa(FriendModel.TABLE_NAME));
        }

        public final <R extends GetValidFriendsAndCurrentUserInfoModel> GetValidFriendsAndCurrentUserInfoMapper<R> getValidFriendsAndCurrentUserInfoMapper(GetValidFriendsAndCurrentUserInfoCreator<R> getValidFriendsAndCurrentUserInfoCreator) {
            return new GetValidFriendsAndCurrentUserInfoMapper(getValidFriendsAndCurrentUserInfoCreator);
        }

        public final ainx getValidFriendsInfo(String str) {
            return new GetValidFriendsInfoQuery(str);
        }

        public final <R extends GetValidFriendsInfoModel> GetValidFriendsInfoMapper<R> getValidFriendsInfoMapper(GetValidFriendsInfoCreator<R> getValidFriendsInfoCreator) {
            return new GetValidFriendsInfoMapper(getValidFriendsInfoCreator);
        }
    }

    public interface GetBestFriendsInfoCreator<T extends GetBestFriendsInfoModel> {
        T create(long j, String str, String str2, String str3);
    }

    public interface GetBestFriendsInfoModel {
        String displayName();

        long friendId();

        String userId();

        String username();
    }

    public interface GetFriendByUserIdCreator<T extends GetFriendByUserIdModel> {
        T create(long j, String str, String str2, String str3, String str4, Long l, String str5, String str6, CalendarDate calendarDate, Long l2, Long l3, FriendLinkType friendLinkType, Long l4, Long l5, Long l6, Long l7, long j2, Boolean bool);
    }

    public interface GetFriendByUserIdModel {
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

    public interface GetFriendsAndStoriesInfoCreator<T extends GetFriendsAndStoriesInfoModel> {
        T create(long j, String str, String str2, String str3, String str4, String str5, Long l, Long l2, Long l3, Boolean bool, Long l4);
    }

    public interface GetFriendsAndStoriesInfoModel {
        Long bestFriendRowId();

        String bitmojiAvatarId();

        String bitmojiSelfieId();

        String displayName();

        long friendRowId();

        Long storyLatestExpirationTimestamp();

        Long storyLatestTimestamp();

        Long storyRowId();

        Boolean storyViewed();

        String userId();

        String username();
    }

    public interface GetFriendsInfoCreator<T extends GetFriendsInfoModel> {
        T create(long j, String str, String str2, String str3, String str4, String str5);
    }

    public interface GetFriendsInfoModel {
        String bitmojiAvatarId();

        String bitmojiSelfieId();

        String displayName();

        long friendRowId();

        String userId();

        String username();
    }

    public interface GetRecentFriendsInfoCreator<T extends GetRecentFriendsInfoModel> {
        T create(Long l, String str, String str2, String str3);
    }

    public interface GetRecentFriendsInfoModel {
        String displayName();

        Long friendId();

        String userId();

        String username();
    }

    public interface GetValidFriendsAndCurrentUserInfoCreator<T extends GetValidFriendsAndCurrentUserInfoModel> {
        T create(long j, String str, String str2, String str3);
    }

    public interface GetValidFriendsAndCurrentUserInfoModel {
        String displayName();

        long friendId();

        String userId();

        String username();
    }

    public interface GetValidFriendsInfoCreator<T extends GetValidFriendsInfoModel> {
        T create(long j, String str, String str2, String str3);
    }

    public interface GetValidFriendsInfoModel {
        String displayName();

        long friendId();

        String userId();

        String username();
    }

    public static final class GetBestFriendsInfoMapper<T extends GetBestFriendsInfoModel> implements ainw<T> {
        private final GetBestFriendsInfoCreator<T> creator;

        public GetBestFriendsInfoMapper(GetBestFriendsInfoCreator<T> getBestFriendsInfoCreator) {
            this.creator = getBestFriendsInfoCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), cursor.isNull(1) ? null : cursor.getString(1), cursor.isNull(2) ? null : cursor.getString(2), cursor.getString(3));
        }
    }

    public static final class GetFriendByUserIdMapper<T extends GetFriendByUserIdModel, T1 extends FriendModel> implements ainw<T> {
        private final GetFriendByUserIdCreator<T> creator;
        private final com.snap.core.db.record.FriendModel.Factory<T1> friendModelFactory;

        public GetFriendByUserIdMapper(GetFriendByUserIdCreator<T> getFriendByUserIdCreator, com.snap.core.db.record.FriendModel.Factory<T1> factory) {
            this.creator = getFriendByUserIdCreator;
            this.friendModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Cursor cursor2 = cursor;
            GetFriendByUserIdCreator getFriendByUserIdCreator = this.creator;
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
            return getFriendByUserIdCreator.create(j, string, string2, string3, string4, valueOf, string5, string6, calendarDate, valueOf2, valueOf3, friendLinkType, valueOf4, valueOf5, valueOf6, valueOf7, j2, bool);
        }
    }

    public static final class GetFriendsAndStoriesInfoMapper<T extends GetFriendsAndStoriesInfoModel> implements ainw<T> {
        private final GetFriendsAndStoriesInfoCreator<T> creator;

        public GetFriendsAndStoriesInfoMapper(GetFriendsAndStoriesInfoCreator<T> getFriendsAndStoriesInfoCreator) {
            this.creator = getFriendsAndStoriesInfoCreator;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Cursor cursor2 = cursor;
            GetFriendsAndStoriesInfoCreator getFriendsAndStoriesInfoCreator = this.creator;
            long j = cursor2.getLong(0);
            String string = cursor2.isNull(1) ? null : cursor2.getString(1);
            String string2 = cursor2.isNull(2) ? null : cursor2.getString(2);
            String string3 = cursor2.getString(3);
            String string4 = cursor2.isNull(4) ? null : cursor2.getString(4);
            String string5 = cursor2.isNull(5) ? null : cursor2.getString(5);
            Long valueOf = cursor2.isNull(6) ? null : Long.valueOf(cursor2.getLong(6));
            Long valueOf2 = cursor2.isNull(7) ? null : Long.valueOf(cursor2.getLong(7));
            Long valueOf3 = cursor2.isNull(8) ? null : Long.valueOf(cursor2.getLong(8));
            if (cursor2.isNull(9)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(9) == 1);
            }
            return getFriendsAndStoriesInfoCreator.create(j, string, string2, string3, string4, string5, valueOf, valueOf2, valueOf3, bool, cursor2.isNull(10) ? null : Long.valueOf(cursor2.getLong(10)));
        }
    }

    public static final class GetFriendsInfoMapper<T extends GetFriendsInfoModel> implements ainw<T> {
        private final GetFriendsInfoCreator<T> creator;

        public GetFriendsInfoMapper(GetFriendsInfoCreator<T> getFriendsInfoCreator) {
            this.creator = getFriendsInfoCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), cursor.isNull(1) ? null : cursor.getString(1), cursor.isNull(2) ? null : cursor.getString(2), cursor.getString(3), cursor.isNull(4) ? null : cursor.getString(4), cursor.isNull(5) ? null : cursor.getString(5));
        }
    }

    public static final class GetRecentFriendsInfoMapper<T extends GetRecentFriendsInfoModel> implements ainw<T> {
        private final GetRecentFriendsInfoCreator<T> creator;

        public GetRecentFriendsInfoMapper(GetRecentFriendsInfoCreator<T> getRecentFriendsInfoCreator) {
            this.creator = getRecentFriendsInfoCreator;
        }

        public final T map(Cursor cursor) {
            GetRecentFriendsInfoCreator getRecentFriendsInfoCreator = this.creator;
            String str = null;
            Long valueOf = cursor.isNull(0) ? null : Long.valueOf(cursor.getLong(0));
            String string = cursor.isNull(1) ? null : cursor.getString(1);
            String string2 = cursor.isNull(2) ? null : cursor.getString(2);
            if (!cursor.isNull(3)) {
                str = cursor.getString(3);
            }
            return getRecentFriendsInfoCreator.create(valueOf, string, string2, str);
        }
    }

    public static final class GetValidFriendsAndCurrentUserInfoMapper<T extends GetValidFriendsAndCurrentUserInfoModel> implements ainw<T> {
        private final GetValidFriendsAndCurrentUserInfoCreator<T> creator;

        public GetValidFriendsAndCurrentUserInfoMapper(GetValidFriendsAndCurrentUserInfoCreator<T> getValidFriendsAndCurrentUserInfoCreator) {
            this.creator = getValidFriendsAndCurrentUserInfoCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), cursor.isNull(1) ? null : cursor.getString(1), cursor.isNull(2) ? null : cursor.getString(2), cursor.getString(3));
        }
    }

    public static final class GetValidFriendsInfoMapper<T extends GetValidFriendsInfoModel> implements ainw<T> {
        private final GetValidFriendsInfoCreator<T> creator;

        public GetValidFriendsInfoMapper(GetValidFriendsInfoCreator<T> getValidFriendsInfoCreator) {
            this.creator = getValidFriendsInfoCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), cursor.isNull(1) ? null : cursor.getString(1), cursor.isNull(2) ? null : cursor.getString(2), cursor.getString(3));
        }
    }
}
