package com.snap.core.db.query;

import android.database.Cursor;
import com.snap.core.db.column.CalendarDate;
import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.column.FriendSuggestionPlacement;
import com.snap.core.db.record.BestFriendModel;
import com.snap.core.db.record.FeedMemberModel;
import com.snap.core.db.record.FeedModel;
import com.snap.core.db.record.FriendModel;
import com.snap.core.db.record.StoryModel;
import com.snap.core.db.record.StorySnapModel;
import com.snap.core.db.record.SuggestedFriendModel;
import com.snap.core.db.record.SuggestedFriendPlacementModel;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.aioa;
import defpackage.pc;

public interface SearchModel {

    public static final class Factory<T1 extends SuggestedFriendPlacementModel, T2 extends FriendModel> {
        com.snap.core.db.record.FriendModel.Factory<T2> friendModelFactory;
        com.snap.core.db.record.SuggestedFriendPlacementModel.Factory<T1> suggestedFriendPlacementModelFactory;

        final class GetRecentFriendsQuery extends ainx {
            private final long arg1;

            GetRecentFriendsQuery(long j) {
                super("SELECT\n    Friend._id,\n    userId,\n    Friend.displayName,\n    Friend.username,\n    Friend.score,\n    friendmojiCategories,\n    streakLength,\n    friendLinkType,\n    bitmojiAvatarId,\n    bitmojiSelfieId,\n    MAX(addedTimestamp, reverseAddedTimestamp) AS lastAddFriendTimestamp,\n    birthday,\n    streakExpiration,\n    Feed._id AS feedRowId,\n    Feed.displayInteractionType,\n    Story.storyRowIdNullable AS storyRowId,\n    Story.viewed AS storyViewed,\n    Story.latestExpirationTimestamp AS storyLatestExpirationTimestamp,\n    Story.latestTimeStamp AS storyLatestTimestamp,\n    storyMuted,\n    Friend.isPopular,\n    Friend.isOfficial,\n    Friend.snapProId\nFROM Friend\nLEFT OUTER JOIN Feed ON Feed.friendRowId = Friend._id\nLEFT OUTER JOIN StoryViewActiveSnaps AS Story ON Friend.username = Story.storyId\nWHERE Feed.friendRowId NOT IN (SELECT friendRowId FROM BestFriend) -- exclude best friends\n    AND (friendLinkType IS 0  -- include mutual friends\n    OR (friendLinkType IN (1, 4) AND addedTimestamp IS NOT 0)) -- include outgoing and following friends with added timestamp\n    AND Feed._id IS NOT NULL\nORDER BY MAX(\n    COALESCE(Feed.sortingTimestamp, 0),\n    COALESCE(Friend.addedTimestamp, 0),\n    COALESCE(Friend.reverseAddedTimestamp, 0),\n    COALESCE(Feed.lastInteractionTimestamp, 0)\n) DESC LIMIT ?1", new aioa(FriendModel.TABLE_NAME, FeedModel.TABLE_NAME, StoryModel.TABLE_NAME, StorySnapModel.TABLE_NAME, BestFriendModel.TABLE_NAME));
                this.arg1 = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.arg1);
            }
        }

        final class GetSearchSuggestedFriendsQuery extends ainx {
            private final com.snap.core.db.record.SuggestedFriendPlacementModel.Factory<? extends SuggestedFriendPlacementModel> suggestedFriendPlacementModelFactory;
            private final FriendSuggestionPlacement suggestionPlacement;

            GetSearchSuggestedFriendsQuery(com.snap.core.db.record.SuggestedFriendPlacementModel.Factory<? extends SuggestedFriendPlacementModel> factory, FriendSuggestionPlacement friendSuggestionPlacement) {
                super("SELECT\n    Friend._id,\n    Friend.username,\n    Friend.userId,\n    Friend.displayName,\n    Friend.bitmojiSelfieId,\n    Friend.bitmojiAvatarId,\n    Friend.friendmojiCategories,\n    Friend.storyMuted,\n    Story.storyRowIdNullable AS storyRowId,\n    Story.latestExpirationTimestamp AS storyLatestExpirationTimestamp,\n    Story.latestTimeStamp AS storyLatestTimestamp,\n    Story.viewed AS storyViewed,\n    displayInfo.added AS isAdded,\n    displayInfo.hidden AS isHidden,\n    displayInfo.suggestionReason AS suggestionReason,\n    displayInfo.suggestionToken AS suggestionToken\nFROM\nFriend\nINNER JOIN SuggestedFriend AS displayInfo ON Friend._id = displayInfo.friendRowId\nLEFT OUTER JOIN SuggestedFriendPlacement AS placement ON Friend._id = placement.friendRowId\nLEFT OUTER JOIN StoryViewActiveSnaps AS Story ON Friend.username = Story.storyId\nWHERE displayInfo.hidden = 0 AND placement.suggestionPlacement = ?1", new aioa(FriendModel.TABLE_NAME, SuggestedFriendModel.TABLE_NAME, SuggestedFriendPlacementModel.TABLE_NAME, StoryModel.TABLE_NAME, StorySnapModel.TABLE_NAME));
                this.suggestedFriendPlacementModelFactory = factory;
                this.suggestionPlacement = friendSuggestionPlacement;
            }

            public final void bindTo(pc pcVar) {
                FriendSuggestionPlacement friendSuggestionPlacement = this.suggestionPlacement;
                if (friendSuggestionPlacement != null) {
                    pcVar.bindLong(1, ((Long) this.suggestedFriendPlacementModelFactory.suggestionPlacementAdapter.encode(friendSuggestionPlacement)).longValue());
                } else {
                    pcVar.bindNull(1);
                }
            }
        }

        public Factory(com.snap.core.db.record.SuggestedFriendPlacementModel.Factory<T1> factory, com.snap.core.db.record.FriendModel.Factory<T2> factory2) {
            this.suggestedFriendPlacementModelFactory = factory;
            this.friendModelFactory = factory2;
        }

        public final ainx getAllAddedFriends() {
            return new ainx("SELECT\n    Friend._id,\n    userId,\n    Friend.displayName,\n    Friend.username,\n    Friend.score,\n    friendmojiCategories,\n    streakLength,\n    friendLinkType,\n    bitmojiAvatarId,\n    bitmojiSelfieId,\n    MAX(addedTimestamp, reverseAddedTimestamp) AS lastAddFriendTimestamp,\n    birthday,\n    streakExpiration,\n    Feed._id AS feedRowId,\n    Feed.displayInteractionType,\n    Story.storyRowIdNullable AS storyRowId,\n    Story.viewed AS storyViewed,\n    Story.latestExpirationTimestamp AS storyLatestExpirationTimestamp,\n    Story.latestTimeStamp AS storyLatestTimestamp,\n    storyMuted,\n    Friend.isPopular,\n    Friend.isOfficial,\n    Friend.snapProId\nFROM Friend\nLEFT OUTER JOIN Feed ON Friend._id = Feed.friendRowId\nLEFT OUTER JOIN StoryViewActiveSnaps AS Story ON Friend.username = Story.storyId\nWHERE (friendLinkType IS 0\n    OR (friendLinkType IN (1, 4) AND addedTimestamp IS NOT 0))\nORDER BY Friend.displayName COLLATE NOCASE ASC", new aioa(FriendModel.TABLE_NAME, FeedModel.TABLE_NAME, StoryModel.TABLE_NAME, StorySnapModel.TABLE_NAME));
        }

        public final <R extends GetAllAddedFriendsModel> GetAllAddedFriendsMapper<R, T2> getAllAddedFriendsMapper(GetAllAddedFriendsCreator<R> getAllAddedFriendsCreator) {
            return new GetAllAddedFriendsMapper(getAllAddedFriendsCreator, this.friendModelFactory);
        }

        public final ainx getAllFriendsStatus() {
            return new ainx("SELECT\n    Friend._id,\n    Friend.username,\n    friendLinkType,\n    Friend.userId\nFROM Friend", new aioa(FriendModel.TABLE_NAME));
        }

        public final <R extends GetAllFriendsStatusModel> GetAllFriendsStatusMapper<R, T2> getAllFriendsStatusMapper(GetAllFriendsStatusCreator<R> getAllFriendsStatusCreator) {
            return new GetAllFriendsStatusMapper(getAllFriendsStatusCreator, this.friendModelFactory);
        }

        public final ainx getGroupStories() {
            return new ainx("SELECT\n    Story._id AS storyRowId,\n    Story.storyId AS conversationId,\n    Story.displayName AS displayName,\n    Story.latestExpirationTimestamp AS storyLatestExpirationTimestamp,\n    Story.latestTimeStamp AS storyLatestTimestamp,\n    Story.viewed AS storyViewed\nFROM\n    Story\nLEFT OUTER JOIN Feed\n    ON Story._id = Feed.storyRowId\nINNER JOIN StorySnap\n    ON Story._id = StorySnap.storyRowId\nWHERE Story.kind = 1 AND Feed._id IS NULL\nGROUP BY Story._id", new aioa(StoryModel.TABLE_NAME, FeedModel.TABLE_NAME, StorySnapModel.TABLE_NAME));
        }

        public final <R extends GetGroupStoriesModel> GetGroupStoriesMapper<R> getGroupStoriesMapper(GetGroupStoriesCreator<R> getGroupStoriesCreator) {
            return new GetGroupStoriesMapper(getGroupStoriesCreator);
        }

        public final ainx getRecentFriends(long j) {
            return new GetRecentFriendsQuery(j);
        }

        public final <R extends GetRecentFriendsModel> GetRecentFriendsMapper<R, T2> getRecentFriendsMapper(GetRecentFriendsCreator<R> getRecentFriendsCreator) {
            return new GetRecentFriendsMapper(getRecentFriendsCreator, this.friendModelFactory);
        }

        public final ainx getSearchBestFriends() {
            return new ainx("SELECT\n    Friend._id,\n    userId,\n    Friend.displayName,\n    Friend.username,\n    Friend.score,\n    friendmojiCategories,\n    streakLength,\n    friendLinkType,\n    bitmojiAvatarId,\n    bitmojiSelfieId,\n    MAX(addedTimestamp, reverseAddedTimestamp) AS lastAddFriendTimestamp,\n    birthday,\n    streakExpiration,\n    Feed._id AS feedRowId,\n    Feed.displayInteractionType,\n    Story.storyRowIdNullable AS storyRowId,\n    Story.viewed AS storyViewed,\n    Story.latestExpirationTimestamp AS storyLatestExpirationTimestamp,\n    Story.latestTimeStamp AS storyLatestTimestamp,\n    storyMuted,\n    Friend.isPopular,\n    Friend.isOfficial,\n    Friend.snapProId\nFROM Friend\nLEFT OUTER JOIN Feed ON Friend._id = Feed.friendRowId\nLEFT OUTER JOIN StoryViewActiveSnaps AS Story ON Friend.username = Story.storyId\nINNER JOIN BestFriend ON Friend._id = BestFriend.friendRowId\nAND friendLinkType IN (0, 1)\nORDER BY BestFriend._id ASC", new aioa(FriendModel.TABLE_NAME, FeedModel.TABLE_NAME, StoryModel.TABLE_NAME, StorySnapModel.TABLE_NAME, BestFriendModel.TABLE_NAME));
        }

        public final <R extends GetSearchBestFriendsModel> GetSearchBestFriendsMapper<R, T2> getSearchBestFriendsMapper(GetSearchBestFriendsCreator<R> getSearchBestFriendsCreator) {
            return new GetSearchBestFriendsMapper(getSearchBestFriendsCreator, this.friendModelFactory);
        }

        public final ainx getSearchGroups() {
            return new ainx("SELECT\n    Feed._id,\n    Feed.key,\n    coalesce(Feed.specifiedName, Feed.participantString) AS displayName,\n    Feed.specifiedName,\n    Feed.participantString,\n    Friend.userId AS participantUserId,\n    Friend.displayName AS participantDisplayName,\n    Friend.username AS participantUsername,\n    Friend.bitmojiAvatarId AS participantBitmojiAvatarId,\n    Friend.bitmojiSelfieId AS participantBitmojiSelfieId,\n    FeedMember.lastInteractionTimestamp,\n    Feed.lastInteractionTimestamp AS groupLastInteractionTimestamp,\n    Story.storyRowIdNullable AS storyRowId,\n    Story.latestExpirationTimestamp AS storyLatestExpirationTimestamp,\n    Story.latestTimeStamp AS storyLatestTimestamp,\n    Story.viewed AS storyViewed,\n    Feed.groupStoryMuted AS storyMuted\nFROM\n    Feed\nINNER JOIN FeedMember\n    ON FeedMember.feedRowId = Feed._id\nINNER JOIN Friend\n    ON FeedMember.friendRowId = Friend._id\nLEFT OUTER JOIN StoryViewActiveSnaps AS Story\n    ON Feed.storyRowId = Story._id\nWHERE Feed.kind = 1 AND FeedMember.removed != 1", new aioa(FeedModel.TABLE_NAME, FeedMemberModel.TABLE_NAME, FriendModel.TABLE_NAME, StoryModel.TABLE_NAME, StorySnapModel.TABLE_NAME));
        }

        public final <R extends GetSearchGroupsModel> GetSearchGroupsMapper<R> getSearchGroupsMapper(GetSearchGroupsCreator<R> getSearchGroupsCreator) {
            return new GetSearchGroupsMapper(getSearchGroupsCreator);
        }

        public final ainx getSearchSuggestedFriends(com.snap.core.db.record.SuggestedFriendPlacementModel.Factory<? extends SuggestedFriendPlacementModel> factory, FriendSuggestionPlacement friendSuggestionPlacement) {
            return new GetSearchSuggestedFriendsQuery(factory, friendSuggestionPlacement);
        }

        public final <R extends GetSearchSuggestedFriendsModel> GetSearchSuggestedFriendsMapper<R> getSearchSuggestedFriendsMapper(GetSearchSuggestedFriendsCreator<R> getSearchSuggestedFriendsCreator) {
            return new GetSearchSuggestedFriendsMapper(getSearchSuggestedFriendsCreator);
        }
    }

    public interface GetAllAddedFriendsCreator<T extends GetAllAddedFriendsModel> {
        T create(long j, String str, String str2, String str3, Long l, String str4, Integer num, FriendLinkType friendLinkType, String str5, String str6, Long l2, CalendarDate calendarDate, Long l3, Long l4, String str7, Long l5, Boolean bool, Long l6, Long l7, boolean z, boolean z2, boolean z3, String str8);
    }

    public interface GetAllAddedFriendsModel {
        long _id();

        CalendarDate birthday();

        String bitmojiAvatarId();

        String bitmojiSelfieId();

        String displayInteractionType();

        String displayName();

        Long feedRowId();

        FriendLinkType friendLinkType();

        String friendmojiCategories();

        boolean isOfficial();

        boolean isPopular();

        Long lastAddFriendTimestamp();

        Long score();

        String snapProId();

        Long storyLatestExpirationTimestamp();

        Long storyLatestTimestamp();

        boolean storyMuted();

        Long storyRowId();

        Boolean storyViewed();

        Long streakExpiration();

        Integer streakLength();

        String userId();

        String username();
    }

    public interface GetAllFriendsStatusCreator<T extends GetAllFriendsStatusModel> {
        T create(long j, String str, FriendLinkType friendLinkType, String str2);
    }

    public interface GetAllFriendsStatusModel {
        long _id();

        FriendLinkType friendLinkType();

        String userId();

        String username();
    }

    public interface GetGroupStoriesCreator<T extends GetGroupStoriesModel> {
        T create(long j, String str, String str2, Long l, Long l2, Boolean bool);
    }

    public interface GetGroupStoriesModel {
        String conversationId();

        String displayName();

        Long storyLatestExpirationTimestamp();

        Long storyLatestTimestamp();

        long storyRowId();

        Boolean storyViewed();
    }

    public interface GetRecentFriendsCreator<T extends GetRecentFriendsModel> {
        T create(long j, String str, String str2, String str3, Long l, String str4, Integer num, FriendLinkType friendLinkType, String str5, String str6, Long l2, CalendarDate calendarDate, Long l3, Long l4, String str7, Long l5, Boolean bool, Long l6, Long l7, boolean z, boolean z2, boolean z3, String str8);
    }

    public interface GetRecentFriendsModel {
        long _id();

        CalendarDate birthday();

        String bitmojiAvatarId();

        String bitmojiSelfieId();

        String displayInteractionType();

        String displayName();

        Long feedRowId();

        FriendLinkType friendLinkType();

        String friendmojiCategories();

        boolean isOfficial();

        boolean isPopular();

        Long lastAddFriendTimestamp();

        Long score();

        String snapProId();

        Long storyLatestExpirationTimestamp();

        Long storyLatestTimestamp();

        boolean storyMuted();

        Long storyRowId();

        Boolean storyViewed();

        Long streakExpiration();

        Integer streakLength();

        String userId();

        String username();
    }

    public interface GetSearchBestFriendsCreator<T extends GetSearchBestFriendsModel> {
        T create(long j, String str, String str2, String str3, Long l, String str4, Integer num, FriendLinkType friendLinkType, String str5, String str6, Long l2, CalendarDate calendarDate, Long l3, Long l4, String str7, Long l5, Boolean bool, Long l6, Long l7, boolean z, boolean z2, boolean z3, String str8);
    }

    public interface GetSearchBestFriendsModel {
        long _id();

        CalendarDate birthday();

        String bitmojiAvatarId();

        String bitmojiSelfieId();

        String displayInteractionType();

        String displayName();

        Long feedRowId();

        FriendLinkType friendLinkType();

        String friendmojiCategories();

        boolean isOfficial();

        boolean isPopular();

        Long lastAddFriendTimestamp();

        Long score();

        String snapProId();

        Long storyLatestExpirationTimestamp();

        Long storyLatestTimestamp();

        boolean storyMuted();

        Long storyRowId();

        Boolean storyViewed();

        Long streakExpiration();

        Integer streakLength();

        String userId();

        String username();
    }

    public interface GetSearchGroupsCreator<T extends GetSearchGroupsModel> {
        T create(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l, Long l2, Long l3, Long l4, Long l5, Boolean bool, Boolean bool2);
    }

    public interface GetSearchGroupsModel {
        long _id();

        String displayName();

        Long groupLastInteractionTimestamp();

        String key();

        Long lastInteractionTimestamp();

        String participantBitmojiAvatarId();

        String participantBitmojiSelfieId();

        String participantDisplayName();

        String participantString();

        String participantUserId();

        String participantUsername();

        String specifiedName();

        Long storyLatestExpirationTimestamp();

        Long storyLatestTimestamp();

        Boolean storyMuted();

        Long storyRowId();

        Boolean storyViewed();
    }

    public interface GetSearchSuggestedFriendsCreator<T extends GetSearchSuggestedFriendsModel> {
        T create(long j, String str, String str2, String str3, String str4, String str5, String str6, boolean z, Long l, Long l2, Long l3, Boolean bool, boolean z2, boolean z3, String str7, String str8);
    }

    public interface GetSearchSuggestedFriendsModel {
        long _id();

        String bitmojiAvatarId();

        String bitmojiSelfieId();

        String displayName();

        String friendmojiCategories();

        boolean isAdded();

        boolean isHidden();

        Long storyLatestExpirationTimestamp();

        Long storyLatestTimestamp();

        boolean storyMuted();

        Long storyRowId();

        Boolean storyViewed();

        String suggestionReason();

        String suggestionToken();

        String userId();

        String username();
    }

    public static final class GetAllAddedFriendsMapper<T extends GetAllAddedFriendsModel, T1 extends FriendModel> implements ainw<T> {
        private final GetAllAddedFriendsCreator<T> creator;
        private final com.snap.core.db.record.FriendModel.Factory<T1> friendModelFactory;

        public GetAllAddedFriendsMapper(GetAllAddedFriendsCreator<T> getAllAddedFriendsCreator, com.snap.core.db.record.FriendModel.Factory<T1> factory) {
            this.creator = getAllAddedFriendsCreator;
            this.friendModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Cursor cursor2 = cursor;
            GetAllAddedFriendsCreator getAllAddedFriendsCreator = this.creator;
            long j = cursor2.getLong(0);
            String string = cursor2.isNull(1) ? null : cursor2.getString(1);
            String string2 = cursor2.isNull(2) ? null : cursor2.getString(2);
            String string3 = cursor2.getString(3);
            Long valueOf = cursor2.isNull(4) ? null : Long.valueOf(cursor2.getLong(4));
            String string4 = cursor2.isNull(5) ? null : cursor2.getString(5);
            Integer valueOf2 = cursor2.isNull(6) ? null : Integer.valueOf(cursor2.getInt(6));
            FriendLinkType friendLinkType = cursor2.isNull(7) ? null : (FriendLinkType) this.friendModelFactory.friendLinkTypeAdapter.decode(Long.valueOf(cursor2.getLong(7)));
            String string5 = cursor2.isNull(8) ? null : cursor2.getString(8);
            String string6 = cursor2.isNull(9) ? null : cursor2.getString(9);
            Long valueOf3 = cursor2.isNull(10) ? null : Long.valueOf(cursor2.getLong(10));
            CalendarDate calendarDate = cursor2.isNull(11) ? null : (CalendarDate) this.friendModelFactory.birthdayAdapter.decode(Long.valueOf(cursor2.getLong(11)));
            Long valueOf4 = cursor2.isNull(12) ? null : Long.valueOf(cursor2.getLong(12));
            Long valueOf5 = cursor2.isNull(13) ? null : Long.valueOf(cursor2.getLong(13));
            String string7 = cursor2.isNull(14) ? null : cursor2.getString(14);
            Long valueOf6 = cursor2.isNull(15) ? null : Long.valueOf(cursor2.getLong(15));
            if (cursor2.isNull(16)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(16) == 1);
            }
            return getAllAddedFriendsCreator.create(j, string, string2, string3, valueOf, string4, valueOf2, friendLinkType, string5, string6, valueOf3, calendarDate, valueOf4, valueOf5, string7, valueOf6, bool, cursor2.isNull(17) ? null : Long.valueOf(cursor2.getLong(17)), cursor2.isNull(18) ? null : Long.valueOf(cursor2.getLong(18)), cursor2.getInt(19) == 1, cursor2.getInt(20) == 1, cursor2.getInt(21) == 1, cursor2.isNull(22) ? null : cursor2.getString(22));
        }
    }

    public static final class GetAllFriendsStatusMapper<T extends GetAllFriendsStatusModel, T1 extends FriendModel> implements ainw<T> {
        private final GetAllFriendsStatusCreator<T> creator;
        private final com.snap.core.db.record.FriendModel.Factory<T1> friendModelFactory;

        public GetAllFriendsStatusMapper(GetAllFriendsStatusCreator<T> getAllFriendsStatusCreator, com.snap.core.db.record.FriendModel.Factory<T1> factory) {
            this.creator = getAllFriendsStatusCreator;
            this.friendModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), cursor.getString(1), cursor.isNull(2) ? null : (FriendLinkType) this.friendModelFactory.friendLinkTypeAdapter.decode(Long.valueOf(cursor.getLong(2))), cursor.isNull(3) ? null : cursor.getString(3));
        }
    }

    public static final class GetGroupStoriesMapper<T extends GetGroupStoriesModel> implements ainw<T> {
        private final GetGroupStoriesCreator<T> creator;

        public GetGroupStoriesMapper(GetGroupStoriesCreator<T> getGroupStoriesCreator) {
            this.creator = getGroupStoriesCreator;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            GetGroupStoriesCreator getGroupStoriesCreator = this.creator;
            boolean z = false;
            long j = cursor.getLong(0);
            String string = cursor.getString(1);
            String string2 = cursor.isNull(2) ? null : cursor.getString(2);
            Long valueOf = cursor.isNull(3) ? null : Long.valueOf(cursor.getLong(3));
            Long valueOf2 = cursor.isNull(4) ? null : Long.valueOf(cursor.getLong(4));
            if (cursor.isNull(5)) {
                bool = null;
            } else {
                if (cursor.getInt(5) == 1) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            }
            return getGroupStoriesCreator.create(j, string, string2, valueOf, valueOf2, bool);
        }
    }

    public static final class GetRecentFriendsMapper<T extends GetRecentFriendsModel, T1 extends FriendModel> implements ainw<T> {
        private final GetRecentFriendsCreator<T> creator;
        private final com.snap.core.db.record.FriendModel.Factory<T1> friendModelFactory;

        public GetRecentFriendsMapper(GetRecentFriendsCreator<T> getRecentFriendsCreator, com.snap.core.db.record.FriendModel.Factory<T1> factory) {
            this.creator = getRecentFriendsCreator;
            this.friendModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Cursor cursor2 = cursor;
            GetRecentFriendsCreator getRecentFriendsCreator = this.creator;
            long j = cursor2.getLong(0);
            String string = cursor2.isNull(1) ? null : cursor2.getString(1);
            String string2 = cursor2.isNull(2) ? null : cursor2.getString(2);
            String string3 = cursor2.getString(3);
            Long valueOf = cursor2.isNull(4) ? null : Long.valueOf(cursor2.getLong(4));
            String string4 = cursor2.isNull(5) ? null : cursor2.getString(5);
            Integer valueOf2 = cursor2.isNull(6) ? null : Integer.valueOf(cursor2.getInt(6));
            FriendLinkType friendLinkType = cursor2.isNull(7) ? null : (FriendLinkType) this.friendModelFactory.friendLinkTypeAdapter.decode(Long.valueOf(cursor2.getLong(7)));
            String string5 = cursor2.isNull(8) ? null : cursor2.getString(8);
            String string6 = cursor2.isNull(9) ? null : cursor2.getString(9);
            Long valueOf3 = cursor2.isNull(10) ? null : Long.valueOf(cursor2.getLong(10));
            CalendarDate calendarDate = cursor2.isNull(11) ? null : (CalendarDate) this.friendModelFactory.birthdayAdapter.decode(Long.valueOf(cursor2.getLong(11)));
            Long valueOf4 = cursor2.isNull(12) ? null : Long.valueOf(cursor2.getLong(12));
            Long valueOf5 = cursor2.isNull(13) ? null : Long.valueOf(cursor2.getLong(13));
            String string7 = cursor2.isNull(14) ? null : cursor2.getString(14);
            Long valueOf6 = cursor2.isNull(15) ? null : Long.valueOf(cursor2.getLong(15));
            if (cursor2.isNull(16)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(16) == 1);
            }
            return getRecentFriendsCreator.create(j, string, string2, string3, valueOf, string4, valueOf2, friendLinkType, string5, string6, valueOf3, calendarDate, valueOf4, valueOf5, string7, valueOf6, bool, cursor2.isNull(17) ? null : Long.valueOf(cursor2.getLong(17)), cursor2.isNull(18) ? null : Long.valueOf(cursor2.getLong(18)), cursor2.getInt(19) == 1, cursor2.getInt(20) == 1, cursor2.getInt(21) == 1, cursor2.isNull(22) ? null : cursor2.getString(22));
        }
    }

    public static final class GetSearchBestFriendsMapper<T extends GetSearchBestFriendsModel, T1 extends FriendModel> implements ainw<T> {
        private final GetSearchBestFriendsCreator<T> creator;
        private final com.snap.core.db.record.FriendModel.Factory<T1> friendModelFactory;

        public GetSearchBestFriendsMapper(GetSearchBestFriendsCreator<T> getSearchBestFriendsCreator, com.snap.core.db.record.FriendModel.Factory<T1> factory) {
            this.creator = getSearchBestFriendsCreator;
            this.friendModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Cursor cursor2 = cursor;
            GetSearchBestFriendsCreator getSearchBestFriendsCreator = this.creator;
            long j = cursor2.getLong(0);
            String string = cursor2.isNull(1) ? null : cursor2.getString(1);
            String string2 = cursor2.isNull(2) ? null : cursor2.getString(2);
            String string3 = cursor2.getString(3);
            Long valueOf = cursor2.isNull(4) ? null : Long.valueOf(cursor2.getLong(4));
            String string4 = cursor2.isNull(5) ? null : cursor2.getString(5);
            Integer valueOf2 = cursor2.isNull(6) ? null : Integer.valueOf(cursor2.getInt(6));
            FriendLinkType friendLinkType = cursor2.isNull(7) ? null : (FriendLinkType) this.friendModelFactory.friendLinkTypeAdapter.decode(Long.valueOf(cursor2.getLong(7)));
            String string5 = cursor2.isNull(8) ? null : cursor2.getString(8);
            String string6 = cursor2.isNull(9) ? null : cursor2.getString(9);
            Long valueOf3 = cursor2.isNull(10) ? null : Long.valueOf(cursor2.getLong(10));
            CalendarDate calendarDate = cursor2.isNull(11) ? null : (CalendarDate) this.friendModelFactory.birthdayAdapter.decode(Long.valueOf(cursor2.getLong(11)));
            Long valueOf4 = cursor2.isNull(12) ? null : Long.valueOf(cursor2.getLong(12));
            Long valueOf5 = cursor2.isNull(13) ? null : Long.valueOf(cursor2.getLong(13));
            String string7 = cursor2.isNull(14) ? null : cursor2.getString(14);
            Long valueOf6 = cursor2.isNull(15) ? null : Long.valueOf(cursor2.getLong(15));
            if (cursor2.isNull(16)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(16) == 1);
            }
            return getSearchBestFriendsCreator.create(j, string, string2, string3, valueOf, string4, valueOf2, friendLinkType, string5, string6, valueOf3, calendarDate, valueOf4, valueOf5, string7, valueOf6, bool, cursor2.isNull(17) ? null : Long.valueOf(cursor2.getLong(17)), cursor2.isNull(18) ? null : Long.valueOf(cursor2.getLong(18)), cursor2.getInt(19) == 1, cursor2.getInt(20) == 1, cursor2.getInt(21) == 1, cursor2.isNull(22) ? null : cursor2.getString(22));
        }
    }

    public static final class GetSearchGroupsMapper<T extends GetSearchGroupsModel> implements ainw<T> {
        private final GetSearchGroupsCreator<T> creator;

        public GetSearchGroupsMapper(GetSearchGroupsCreator<T> getSearchGroupsCreator) {
            this.creator = getSearchGroupsCreator;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Boolean bool2;
            Cursor cursor2 = cursor;
            GetSearchGroupsCreator getSearchGroupsCreator = this.creator;
            long j = cursor2.getLong(0);
            String string = cursor2.getString(1);
            String string2 = cursor2.isNull(2) ? null : cursor2.getString(2);
            String string3 = cursor2.isNull(3) ? null : cursor2.getString(3);
            String string4 = cursor2.isNull(4) ? null : cursor2.getString(4);
            String string5 = cursor2.isNull(5) ? null : cursor2.getString(5);
            String string6 = cursor2.isNull(6) ? null : cursor2.getString(6);
            String string7 = cursor2.getString(7);
            String string8 = cursor2.isNull(8) ? null : cursor2.getString(8);
            String string9 = cursor2.isNull(9) ? null : cursor2.getString(9);
            Long valueOf = cursor2.isNull(10) ? null : Long.valueOf(cursor2.getLong(10));
            Long valueOf2 = cursor2.isNull(11) ? null : Long.valueOf(cursor2.getLong(11));
            Long valueOf3 = cursor2.isNull(12) ? null : Long.valueOf(cursor2.getLong(12));
            Long valueOf4 = cursor2.isNull(13) ? null : Long.valueOf(cursor2.getLong(13));
            Long valueOf5 = cursor2.isNull(14) ? null : Long.valueOf(cursor2.getLong(14));
            if (cursor2.isNull(15)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(15) == 1);
            }
            if (cursor2.isNull(16)) {
                bool2 = null;
            } else {
                bool2 = Boolean.valueOf(cursor2.getInt(16) == 1);
            }
            return getSearchGroupsCreator.create(j, string, string2, string3, string4, string5, string6, string7, string8, string9, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, bool, bool2);
        }
    }

    public static final class GetSearchSuggestedFriendsMapper<T extends GetSearchSuggestedFriendsModel> implements ainw<T> {
        private final GetSearchSuggestedFriendsCreator<T> creator;

        public GetSearchSuggestedFriendsMapper(GetSearchSuggestedFriendsCreator<T> getSearchSuggestedFriendsCreator) {
            this.creator = getSearchSuggestedFriendsCreator;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Cursor cursor2 = cursor;
            GetSearchSuggestedFriendsCreator getSearchSuggestedFriendsCreator = this.creator;
            long j = cursor2.getLong(0);
            String string = cursor2.getString(1);
            String string2 = cursor2.isNull(2) ? null : cursor2.getString(2);
            String string3 = cursor2.isNull(3) ? null : cursor2.getString(3);
            String string4 = cursor2.isNull(4) ? null : cursor2.getString(4);
            String string5 = cursor2.isNull(5) ? null : cursor2.getString(5);
            String string6 = cursor2.isNull(6) ? null : cursor2.getString(6);
            boolean z = cursor2.getInt(7) == 1;
            Long valueOf = cursor2.isNull(8) ? null : Long.valueOf(cursor2.getLong(8));
            Long valueOf2 = cursor2.isNull(9) ? null : Long.valueOf(cursor2.getLong(9));
            Long valueOf3 = cursor2.isNull(10) ? null : Long.valueOf(cursor2.getLong(10));
            if (cursor2.isNull(11)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(11) == 1);
            }
            return getSearchSuggestedFriendsCreator.create(j, string, string2, string3, string4, string5, string6, z, valueOf, valueOf2, valueOf3, bool, cursor2.getInt(12) == 1, cursor2.getInt(13) == 1, cursor2.isNull(14) ? null : cursor2.getString(14), cursor2.isNull(15) ? null : cursor2.getString(15));
        }
    }
}
