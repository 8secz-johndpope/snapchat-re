package com.snap.core.db.query;

import android.database.Cursor;
import com.snap.core.db.column.CalendarDate;
import com.snap.core.db.column.FeedKind;
import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.column.FriendSuggestionPlacement;
import com.snap.core.db.column.Friendmojis;
import com.snap.core.db.column.GroupStoryRankType;
import com.snap.core.db.column.GroupStoryType;
import com.snap.core.db.column.PrivacyType;
import com.snap.core.db.column.StoryKind;
import com.snap.core.db.record.BestFriendModel;
import com.snap.core.db.record.FeedMemberModel;
import com.snap.core.db.record.FeedModel;
import com.snap.core.db.record.FriendModel;
import com.snap.core.db.record.PostableStoryModel;
import com.snap.core.db.record.SendToLastSnapRecipientsModel;
import com.snap.core.db.record.SnapModel;
import com.snap.core.db.record.StoryModel;
import com.snap.core.db.record.StorySnapModel;
import com.snap.core.db.record.SuggestedFriendModel;
import com.snap.core.db.record.SuggestedFriendPlacementModel;
import com.snapchat.soju.android.Geofence;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.aioa;
import defpackage.pc;

public interface SendToModel {

    public static final class Factory<T1 extends SuggestedFriendPlacementModel, T2 extends FeedModel, T3 extends FriendModel, T4 extends StoryModel, T5 extends PostableStoryModel> {
        com.snap.core.db.record.FeedModel.Factory<T2> feedModelFactory;
        com.snap.core.db.record.FriendModel.Factory<T3> friendModelFactory;
        com.snap.core.db.record.PostableStoryModel.Factory<T5> postableStoryModelFactory;
        com.snap.core.db.record.StoryModel.Factory<T4> storyModelFactory;
        com.snap.core.db.record.SuggestedFriendPlacementModel.Factory<T1> suggestedFriendPlacementModelFactory;

        final class GetRecentFeedsQuery extends ainx {
            private final long arg1;

            GetRecentFeedsQuery(long j) {
                super("SELECT\n    Feed._id,\n    Feed.key,\n    coalesce(Feed.specifiedName, Feed.participantString) AS feedDisplayName,\n    Feed.kind,\n    MAX(COALESCE(Feed.sortingTimestamp, 0),\n    COALESCE(Friend.addedTimestamp, 0),\n    COALESCE(Friend.reverseAddedTimestamp, 0),\n    COALESCE(Feed.lastInteractionTimestamp, 0)) AS lastInteractionTimestamp,\n    MAX(Friend.addedTimestamp, Friend.reverseAddedTimestamp) AS lastAddFriendTimestamp,\n    Friend.friendmojis,\n    Friend.friendmojiCategories,\n    Friend._id AS friendRowId,\n    Friend.userId,\n    Friend.username,\n    Friend.displayName AS friendDisplayName,\n    Friend.streakLength,\n    Friend.streakExpiration,\n    Friend.birthday,\n    Friend.friendLinkType,\n    Friend.bitmojiAvatarId,\n    Friend.bitmojiSelfieId,\n    Friend.isOfficial,\n    Feed.participantString,\n    Feed.fitScreenParticipantString\nFROM\nFeed\nLEFT OUTER JOIN Friend ON Feed.friendRowId = Friend._id\nWHERE (Feed.friendRowId IS NULL OR Feed.friendRowId NOT IN (SELECT friendRowId FROM BestFriend))\n-- exclude deleted/blocked friends\nAND (friendLinkType IS NULL OR friendLinkType IN (0,1,4))\nORDER BY Feed.lastInteractionTimestamp DESC LIMIT ?1", new aioa(FeedModel.TABLE_NAME, FriendModel.TABLE_NAME, BestFriendModel.TABLE_NAME));
                this.arg1 = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.arg1);
            }
        }

        final class GetRecentsQuery extends ainx {
            private final long arg1;

            GetRecentsQuery(long j) {
                super("SELECT\n    Feed._id,\n    Feed.key,\n    coalesce(Feed.specifiedName, Feed.participantString) AS feedDisplayName,\n    Feed.kind,\n    MAX(COALESCE(Feed.sortingTimestamp, 0),\n    COALESCE(Friend.addedTimestamp, 0),\n    COALESCE(Friend.reverseAddedTimestamp, 0),\n    COALESCE(Feed.lastInteractionTimestamp, 0)) AS lastInteractionTimestamp,\n    MAX(Friend.addedTimestamp, Friend.reverseAddedTimestamp) AS lastAddFriendTimestamp,\n    Friend.friendmojis,\n    Friend.friendmojiCategories,\n    Friend._id AS friendRowId,\n    Friend.userId,\n    Friend.username,\n    Friend.displayName AS friendDisplayName,\n    Friend.streakLength,\n    Friend.streakExpiration,\n    Friend.birthday,\n    Friend.friendLinkType,\n    Friend.bitmojiAvatarId,\n    Friend.bitmojiSelfieId,\n    Friend.isOfficial,\n    Feed.participantString,\n    Feed.fitScreenParticipantString\nFROM\nFeed\nLEFT OUTER JOIN Friend ON Feed.friendRowId = Friend._id\nWHERE (Feed.friendRowId IS NULL OR Feed.friendRowId NOT IN (SELECT friendRowId FROM BestFriend))\n-- exclude deleted/blocked friends\nAND (friendLinkType IS NULL OR friendLinkType IS 0 OR (friendLinkType IN (1,4) AND addedTimestamp IS NOT 0))\nUNION\nSELECT\n    0 AS _id,\n    COALESCE(userId, '') AS key,\n    NULL AS feedDisplayName,\n    0 AS kind,\n    MAX(COALESCE(Friend.addedTimestamp, 0),\n    COALESCE(Friend.reverseAddedTimestamp, 0)) AS lastInteractionTimestamp,\n    MAX(Friend.addedTimestamp, Friend.reverseAddedTimestamp) AS lastAddFriendTimestamp,\n    Friend.friendmojis,\n    Friend.friendmojiCategories,\n    Friend._id AS friendRowId,\n    Friend.userId,\n    Friend.username,\n    Friend.displayName AS friendDisplayName,\n    Friend.streakLength,\n    Friend.streakExpiration,\n    Friend.birthday,\n    Friend.friendLinkType,\n    Friend.bitmojiAvatarId,\n    Friend.bitmojiSelfieId,\n    Friend.isOfficial,\n    NULL AS participantString,\n    NULL AS fitScreenParticipantString\nFROM\nFriend\nWHERE Friend._id NOT IN (SELECT friendRowId FROM Feed WHERE Feed.kind == 0)\nAND Friend._id NOT IN (SELECT friendRowId FROM BestFriend)\n-- friends who added me\nAND (friendLinkType IS 0 OR (friendLinkType IN (1,4) AND addedTimestamp IS NOT 0))\nORDER BY lastInteractionTimestamp DESC LIMIT ?1", new aioa(FeedModel.TABLE_NAME, FriendModel.TABLE_NAME, BestFriendModel.TABLE_NAME));
                this.arg1 = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.arg1);
            }
        }

        final class GetSuggestedFriendsQuery extends ainx {
            private final com.snap.core.db.record.SuggestedFriendPlacementModel.Factory<? extends SuggestedFriendPlacementModel> suggestedFriendPlacementModelFactory;
            private final FriendSuggestionPlacement suggestionPlacement;

            GetSuggestedFriendsQuery(com.snap.core.db.record.SuggestedFriendPlacementModel.Factory<? extends SuggestedFriendPlacementModel> factory, FriendSuggestionPlacement friendSuggestionPlacement) {
                super("SELECT\n    Friend._id,\n    Friend.username,\n    Friend.userId,\n    Friend.displayName,\n    Friend.bitmojiSelfieId,\n    Friend.bitmojiAvatarId,\n    Friend.isOfficial,\n    displayInfo.added AS isAdded,\n    displayInfo.suggestionReason AS suggestionReason,\n    displayInfo.suggestionToken AS suggestionToken\nFROM\n    Friend\nLEFT OUTER JOIN SuggestedFriend AS displayInfo ON Friend._id = displayInfo.friendRowId\nLEFT OUTER JOIN SuggestedFriendPlacement AS placement ON Friend._id = placement.friendRowId\nWHERE displayInfo.added = 0\nAND displayInfo.hidden = 0\nAND Friend.friendLinkType = 5\nAND placement.suggestionPlacement = ?1", new aioa(FriendModel.TABLE_NAME, SuggestedFriendModel.TABLE_NAME, SuggestedFriendPlacementModel.TABLE_NAME));
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

        public Factory(com.snap.core.db.record.SuggestedFriendPlacementModel.Factory<T1> factory, com.snap.core.db.record.FeedModel.Factory<T2> factory2, com.snap.core.db.record.FriendModel.Factory<T3> factory3, com.snap.core.db.record.StoryModel.Factory<T4> factory4, com.snap.core.db.record.PostableStoryModel.Factory<T5> factory5) {
            this.suggestedFriendPlacementModelFactory = factory;
            this.feedModelFactory = factory2;
            this.friendModelFactory = factory3;
            this.storyModelFactory = factory4;
            this.postableStoryModelFactory = factory5;
        }

        public final ainx getAllFriends() {
            return new ainx("SELECT\n    _id,\n    userId,\n    displayName,\n    username,\n    friendmojis,\n    friendmojiCategories,\n    streakLength,\n    friendLinkType,\n    bitmojiAvatarId,\n    bitmojiSelfieId,\n    MAX(addedTimestamp, reverseAddedTimestamp) AS lastAddFriendTimestamp,\n    birthday,\n    streakExpiration,\n    isOfficial\nFROM Friend\nWHERE (friendLinkType IS 0\nOR (friendLinkType IN (1,4) AND addedTimestamp IS NOT 0))\nAND userId IS NOT NULL\nORDER BY displayName COLLATE NOCASE ASC", new aioa(FriendModel.TABLE_NAME));
        }

        public final <R extends GetAllFriendsModel> GetAllFriendsMapper<R, T3> getAllFriendsMapper(GetAllFriendsCreator<R> getAllFriendsCreator) {
            return new GetAllFriendsMapper(getAllFriendsCreator, this.friendModelFactory);
        }

        public final ainx getAllPostableStories() {
            return new ainx("SELECT\n    Story._id,\n    Story.storyId AS storyId,\n    Story.userName,\n    Story.displayName,\n    Story.kind,\n    Story.isLocal,\n    Story.groupStoryType,\n    -- mischiefId for mischief mob story type\n    CASE Story.groupStoryType WHEN 3 THEN Story.userName ELSE NULL END mischiefId,\n    PostableStory.subtext,\n    PostableStory.isSpectaclesStory,\n    PostableStory.geofence,\n    PostableStory.groupStoryRankType,\n    PostableStory.customTitle,\n    PostableStory.hasActiveStory,\n    PostableStory.lastActionTimestamp,\n    PostableStory.mostRecentPostTimestamp AS latestUserPostTimestamp,\n    PostableStory.creationTimestamp,\n    PostableStory.thumbnailUrl,\n    PostableStory.myStoryPrivacyOverride,\n    LatestStorySnap.timestamp AS latestActiveStorySnapPostTimestamp,\n    Feed._id AS feedId\nFROM Story\n-- TODO(apatel) change to full join and require PostableStory record for postability\nLEFT OUTER JOIN PostableStory ON Story._id = PostableStory.storyRowId\nLEFT OUTER JOIN Feed ON (Feed.groupMobId = Story.storyId OR Feed.key = Story.userName)\nLEFT OUTER JOIN (\n    SELECT StorySnap.storyRowId, MAX(Snap.timestamp) AS timestamp\n    FROM StorySnap\n    JOIN Snap ON StorySnap.snapRowId = Snap._id\n    GROUP BY StorySnap.storyRowId\n) AS LatestStorySnap ON LatestStorySnap.storyRowId = Story._id\nWHERE Story.isPostable = 1 AND\n      Story.displayName IS NOT NULL\n      AND (Story.kind != 1 OR Story.groupStoryType IS NOT NULL)", new aioa(StoryModel.TABLE_NAME, "PostableStory", FeedModel.TABLE_NAME, StorySnapModel.TABLE_NAME, SnapModel.TABLE_NAME));
        }

        public final <R extends GetAllPostableStoriesModel> GetAllPostableStoriesMapper<R, T4, T5> getAllPostableStoriesMapper(GetAllPostableStoriesCreator<R> getAllPostableStoriesCreator) {
            return new GetAllPostableStoriesMapper(getAllPostableStoriesCreator, this.storyModelFactory, this.postableStoryModelFactory);
        }

        public final ainx getBestFriends() {
            return new ainx("SELECT\n    Friend._id AS _id,\n    userId,\n    displayName,\n    username,\n    friendmojis,\n    friendmojiCategories,\n    streakLength,\n    friendLinkType,\n    bitmojiAvatarId,\n    bitmojiSelfieId,\n    MAX(addedTimestamp, reverseAddedTimestamp) AS lastAddFriendTimestamp,\n    birthday,\n    streakExpiration,\n    isOfficial\nFROM Friend\nINNER JOIN BestFriend ON Friend._id = BestFriend.friendRowId\nWHERE userId IS NOT NULL\nAND friendLinkType NOT IN (2,3)\nORDER BY BestFriend._id ASC", new aioa(FriendModel.TABLE_NAME, BestFriendModel.TABLE_NAME));
        }

        public final <R extends GetBestFriendsModel> GetBestFriendsMapper<R, T3> getBestFriendsMapper(GetBestFriendsCreator<R> getBestFriendsCreator) {
            return new GetBestFriendsMapper(getBestFriendsCreator, this.friendModelFactory);
        }

        public final ainx getGroups() {
            return new ainx("SELECT\n    Feed._id,\n    Feed.key,\n    coalesce(Feed.specifiedName, Feed.participantString) AS displayName,\n    Feed.specifiedName,\n    Feed.participantString,\n    Friend.displayName AS participantDisplayName,\n    Friend.username AS participantUsername,\n    Friend.bitmojiAvatarId AS participantBitmojiAvatarId,\n    Friend.bitmojiSelfieId AS participantBitmojiSelfieId,\n    Feed.groupCreationTimestamp AS groupCreationTimestamp,\n    FeedMember.lastInteractionTimestamp,\n    Feed.lastInteractionTimestamp AS groupLastInteractionTimestamp\nFROM\n    Feed\nINNER JOIN FeedMember\n    ON FeedMember.feedRowId = Feed._id\nINNER JOIN Friend\n    ON FeedMember.friendRowId = Friend._id\nWHERE Feed.kind = 1", new aioa(FeedModel.TABLE_NAME, FeedMemberModel.TABLE_NAME, FriendModel.TABLE_NAME));
        }

        public final <R extends GetGroupsModel> GetGroupsMapper<R> getGroupsMapper(GetGroupsCreator<R> getGroupsCreator) {
            return new GetGroupsMapper(getGroupsCreator);
        }

        public final ainx getLastSnapRecipients() {
            return new ainx("SELECT\n    Feed._id AS _id,\n    COALESCE(Feed.key, COALESCE(userId, '')) AS key,\n    COALESCE(Feed.specifiedName, Feed.participantString) AS feedDisplayName,\n    COALESCE(Feed.kind, 0) AS kind,\n    SendToLastSnapRecipients.selectionTimestamp AS lastInteractionTimestamp, -- use selectionTimestamp as the lastInteractionTimestamp\n    MAX(Friend.addedTimestamp, Friend.reverseAddedTimestamp) AS lastAddFriendTimestamp,\n    Friend.friendmojis,\n    Friend.friendmojiCategories,\n    Friend._id AS friendRowId,\n    Friend.userId,\n    Friend.username,\n    Friend.displayName AS friendDisplayName,\n    Friend.streakLength,\n    Friend.streakExpiration,\n    Friend.birthday,\n    Friend.friendLinkType,\n    Friend.bitmojiAvatarId,\n    Friend.bitmojiSelfieId,\n    Friend.isOfficial,\n    NULL AS participantString,\n    NULL AS fitScreenParticipantString\nFROM SendToLastSnapRecipients\nLEFT OUTER JOIN Friend ON SendToLastSnapRecipients.key = Friend.userId\nAND SendToLastSnapRecipients.feedKind = 0\nLEFT OUTER JOIN Feed ON SendToLastSnapRecipients.key = Feed.key\nAND SendToLastSnapRecipients.feedKind = 1\n-- Make sure we don't show a deleted friend or group\nWHERE SendToLastSnapRecipients.key IN (SELECT userId FROM Friend WHERE friendLinkType NOT IN (2,3))\nOR SendToLastSnapRecipients.key IN (SELECT key FROM Feed WHERE kind = 1)\nORDER BY SendToLastSnapRecipients.selectionTimestamp ASC", new aioa(SendToLastSnapRecipientsModel.TABLE_NAME, FriendModel.TABLE_NAME, FeedModel.TABLE_NAME));
        }

        public final <R extends GetLastSnapRecipientsModel> GetLastSnapRecipientsMapper<R, T3> getLastSnapRecipientsMapper(GetLastSnapRecipientsCreator<R> getLastSnapRecipientsCreator) {
            return new GetLastSnapRecipientsMapper(getLastSnapRecipientsCreator, this.friendModelFactory);
        }

        public final ainx getRecentFeeds(long j) {
            return new GetRecentFeedsQuery(j);
        }

        public final <R extends GetRecentFeedsModel> GetRecentFeedsMapper<R, T2, T3> getRecentFeedsMapper(GetRecentFeedsCreator<R> getRecentFeedsCreator) {
            return new GetRecentFeedsMapper(getRecentFeedsCreator, this.feedModelFactory, this.friendModelFactory);
        }

        public final ainx getRecents(long j) {
            return new GetRecentsQuery(j);
        }

        public final <R extends GetRecentsModel> GetRecentsMapper<R, T2, T3> getRecentsMapper(GetRecentsCreator<R> getRecentsCreator) {
            return new GetRecentsMapper(getRecentsCreator, this.feedModelFactory, this.friendModelFactory);
        }

        public final ainx getSuggestedFriends(com.snap.core.db.record.SuggestedFriendPlacementModel.Factory<? extends SuggestedFriendPlacementModel> factory, FriendSuggestionPlacement friendSuggestionPlacement) {
            return new GetSuggestedFriendsQuery(factory, friendSuggestionPlacement);
        }

        public final <R extends GetSuggestedFriendsModel> GetSuggestedFriendsMapper<R> getSuggestedFriendsMapper(GetSuggestedFriendsCreator<R> getSuggestedFriendsCreator) {
            return new GetSuggestedFriendsMapper(getSuggestedFriendsCreator);
        }

        public final ainx getTemporaryGroups() {
            return new ainx("SELECT\n    Feed._id,\n    Feed.key,\n    coalesce(Feed.specifiedName, Feed.participantString) AS displayName,\n    Feed.specifiedName,\n    Feed.participantString,\n    Friend.displayName AS participantDisplayName,\n    Friend.username AS participantUsername,\n    Friend.bitmojiAvatarId AS participantBitmojiAvatarId,\n    Friend.bitmojiSelfieId AS participantBitmojiSelfieId,\n    Feed.groupCreationTimestamp AS groupCreationTimestamp,\n    FeedMember.lastInteractionTimestamp,\n    Feed.lastInteractionTimestamp AS groupLastInteractionTimestamp\nFROM\n    Feed\nINNER JOIN FeedMember\n    ON FeedMember.feedRowId = Feed._id\nINNER JOIN Friend\n    ON FeedMember.friendRowId = Friend._id\nWHERE Feed.kind = 1 AND isTemporaryGroup = 1", new aioa(FeedModel.TABLE_NAME, FeedMemberModel.TABLE_NAME, FriendModel.TABLE_NAME));
        }

        public final <R extends GetTemporaryGroupsModel> GetTemporaryGroupsMapper<R> getTemporaryGroupsMapper(GetTemporaryGroupsCreator<R> getTemporaryGroupsCreator) {
            return new GetTemporaryGroupsMapper(getTemporaryGroupsCreator);
        }
    }

    public interface GetAllFriendsCreator<T extends GetAllFriendsModel> {
        T create(long j, String str, String str2, String str3, Friendmojis friendmojis, String str4, Integer num, FriendLinkType friendLinkType, String str5, String str6, Long l, CalendarDate calendarDate, Long l2, boolean z);
    }

    public interface GetAllFriendsModel {
        long _id();

        CalendarDate birthday();

        String bitmojiAvatarId();

        String bitmojiSelfieId();

        String displayName();

        FriendLinkType friendLinkType();

        String friendmojiCategories();

        Friendmojis friendmojis();

        boolean isOfficial();

        Long lastAddFriendTimestamp();

        Long streakExpiration();

        Integer streakLength();

        String userId();

        String username();
    }

    public interface GetAllPostableStoriesCreator<T extends GetAllPostableStoriesModel> {
        T create(long j, String str, String str2, String str3, StoryKind storyKind, Boolean bool, GroupStoryType groupStoryType, String str4, String str5, Boolean bool2, Geofence geofence, GroupStoryRankType groupStoryRankType, String str6, Boolean bool3, Long l, Long l2, Long l3, String str7, PrivacyType privacyType, long j2, Long l4);
    }

    public interface GetAllPostableStoriesModel {
        long _id();

        Long creationTimestamp();

        String customTitle();

        String displayName();

        Long feedId();

        Geofence geofence();

        GroupStoryRankType groupStoryRankType();

        GroupStoryType groupStoryType();

        Boolean hasActiveStory();

        Boolean isLocal();

        Boolean isSpectaclesStory();

        StoryKind kind();

        Long lastActionTimestamp();

        long latestActiveStorySnapPostTimestamp();

        Long latestUserPostTimestamp();

        String mischiefId();

        PrivacyType myStoryPrivacyOverride();

        String storyId();

        String subtext();

        String thumbnailUrl();

        String userName();
    }

    public interface GetBestFriendsCreator<T extends GetBestFriendsModel> {
        T create(long j, String str, String str2, String str3, Friendmojis friendmojis, String str4, Integer num, FriendLinkType friendLinkType, String str5, String str6, Long l, CalendarDate calendarDate, Long l2, boolean z);
    }

    public interface GetBestFriendsModel {
        long _id();

        CalendarDate birthday();

        String bitmojiAvatarId();

        String bitmojiSelfieId();

        String displayName();

        FriendLinkType friendLinkType();

        String friendmojiCategories();

        Friendmojis friendmojis();

        boolean isOfficial();

        Long lastAddFriendTimestamp();

        Long streakExpiration();

        Integer streakLength();

        String userId();

        String username();
    }

    public interface GetGroupsCreator<T extends GetGroupsModel> {
        T create(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l, Long l2, Long l3);
    }

    public interface GetGroupsModel {
        long _id();

        String displayName();

        Long groupCreationTimestamp();

        Long groupLastInteractionTimestamp();

        String key();

        Long lastInteractionTimestamp();

        String participantBitmojiAvatarId();

        String participantBitmojiSelfieId();

        String participantDisplayName();

        String participantString();

        String participantUsername();

        String specifiedName();
    }

    public interface GetLastSnapRecipientsCreator<T extends GetLastSnapRecipientsModel> {
        T create(Long l, String str, String str2, long j, Long l2, Long l3, Friendmojis friendmojis, String str3, Long l4, String str4, String str5, String str6, Integer num, Long l5, CalendarDate calendarDate, FriendLinkType friendLinkType, String str7, String str8, Boolean bool, Void voidR, Void voidR2);
    }

    public interface GetLastSnapRecipientsModel {
        Long _id();

        CalendarDate birthday();

        String bitmojiAvatarId();

        String bitmojiSelfieId();

        String feedDisplayName();

        Void fitScreenParticipantString();

        String friendDisplayName();

        FriendLinkType friendLinkType();

        Long friendRowId();

        String friendmojiCategories();

        Friendmojis friendmojis();

        Boolean isOfficial();

        String key();

        long kind();

        Long lastAddFriendTimestamp();

        Long lastInteractionTimestamp();

        Void participantString();

        Long streakExpiration();

        Integer streakLength();

        String userId();

        String username();
    }

    public interface GetRecentFeedsCreator<T extends GetRecentFeedsModel> {
        T create(long j, String str, String str2, FeedKind feedKind, long j2, Long l, Friendmojis friendmojis, String str3, Long l2, String str4, String str5, String str6, Integer num, Long l3, CalendarDate calendarDate, FriendLinkType friendLinkType, String str7, String str8, Boolean bool, String str9, String str10);
    }

    public interface GetRecentFeedsModel {
        long _id();

        CalendarDate birthday();

        String bitmojiAvatarId();

        String bitmojiSelfieId();

        String feedDisplayName();

        String fitScreenParticipantString();

        String friendDisplayName();

        FriendLinkType friendLinkType();

        Long friendRowId();

        String friendmojiCategories();

        Friendmojis friendmojis();

        Boolean isOfficial();

        String key();

        FeedKind kind();

        Long lastAddFriendTimestamp();

        long lastInteractionTimestamp();

        String participantString();

        Long streakExpiration();

        Integer streakLength();

        String userId();

        String username();
    }

    public interface GetRecentsCreator<T extends GetRecentsModel> {
        T create(long j, String str, String str2, FeedKind feedKind, long j2, Long l, Friendmojis friendmojis, String str3, Long l2, String str4, String str5, String str6, Integer num, Long l3, CalendarDate calendarDate, FriendLinkType friendLinkType, String str7, String str8, Boolean bool, String str9, String str10);
    }

    public interface GetRecentsModel {
        long _id();

        CalendarDate birthday();

        String bitmojiAvatarId();

        String bitmojiSelfieId();

        String feedDisplayName();

        String fitScreenParticipantString();

        String friendDisplayName();

        FriendLinkType friendLinkType();

        Long friendRowId();

        String friendmojiCategories();

        Friendmojis friendmojis();

        Boolean isOfficial();

        String key();

        FeedKind kind();

        Long lastAddFriendTimestamp();

        long lastInteractionTimestamp();

        String participantString();

        Long streakExpiration();

        Integer streakLength();

        String userId();

        String username();
    }

    public interface GetSuggestedFriendsCreator<T extends GetSuggestedFriendsModel> {
        T create(long j, String str, String str2, String str3, String str4, String str5, boolean z, Boolean bool, String str6, String str7);
    }

    public interface GetSuggestedFriendsModel {
        long _id();

        String bitmojiAvatarId();

        String bitmojiSelfieId();

        String displayName();

        Boolean isAdded();

        boolean isOfficial();

        String suggestionReason();

        String suggestionToken();

        String userId();

        String username();
    }

    public interface GetTemporaryGroupsCreator<T extends GetTemporaryGroupsModel> {
        T create(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l, Long l2, Long l3);
    }

    public interface GetTemporaryGroupsModel {
        long _id();

        String displayName();

        Long groupCreationTimestamp();

        Long groupLastInteractionTimestamp();

        String key();

        Long lastInteractionTimestamp();

        String participantBitmojiAvatarId();

        String participantBitmojiSelfieId();

        String participantDisplayName();

        String participantString();

        String participantUsername();

        String specifiedName();
    }

    public static final class GetAllFriendsMapper<T extends GetAllFriendsModel, T1 extends FriendModel> implements ainw<T> {
        private final GetAllFriendsCreator<T> creator;
        private final com.snap.core.db.record.FriendModel.Factory<T1> friendModelFactory;

        public GetAllFriendsMapper(GetAllFriendsCreator<T> getAllFriendsCreator, com.snap.core.db.record.FriendModel.Factory<T1> factory) {
            this.creator = getAllFriendsCreator;
            this.friendModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            return this.creator.create(cursor2.getLong(0), cursor2.isNull(1) ? null : cursor2.getString(1), cursor2.isNull(2) ? null : cursor2.getString(2), cursor2.getString(3), cursor2.isNull(4) ? null : (Friendmojis) this.friendModelFactory.friendmojisAdapter.decode(cursor2.getString(4)), cursor2.isNull(5) ? null : cursor2.getString(5), cursor2.isNull(6) ? null : Integer.valueOf(cursor2.getInt(6)), cursor2.isNull(7) ? null : (FriendLinkType) this.friendModelFactory.friendLinkTypeAdapter.decode(Long.valueOf(cursor2.getLong(7))), cursor2.isNull(8) ? null : cursor2.getString(8), cursor2.isNull(9) ? null : cursor2.getString(9), cursor2.isNull(10) ? null : Long.valueOf(cursor2.getLong(10)), cursor2.isNull(11) ? null : (CalendarDate) this.friendModelFactory.birthdayAdapter.decode(Long.valueOf(cursor2.getLong(11))), cursor2.isNull(12) ? null : Long.valueOf(cursor2.getLong(12)), cursor2.getInt(13) == 1);
        }
    }

    public static final class GetAllPostableStoriesMapper<T extends GetAllPostableStoriesModel, T1 extends StoryModel, T2 extends PostableStoryModel> implements ainw<T> {
        private final GetAllPostableStoriesCreator<T> creator;
        private final com.snap.core.db.record.PostableStoryModel.Factory<T2> postableStoryModelFactory;
        private final com.snap.core.db.record.StoryModel.Factory<T1> storyModelFactory;

        public GetAllPostableStoriesMapper(GetAllPostableStoriesCreator<T> getAllPostableStoriesCreator, com.snap.core.db.record.StoryModel.Factory<T1> factory, com.snap.core.db.record.PostableStoryModel.Factory<T2> factory2) {
            this.creator = getAllPostableStoriesCreator;
            this.storyModelFactory = factory;
            this.postableStoryModelFactory = factory2;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            Cursor cursor2 = cursor;
            GetAllPostableStoriesCreator getAllPostableStoriesCreator = this.creator;
            long j = cursor2.getLong(0);
            String string = cursor2.getString(1);
            String string2 = cursor2.isNull(2) ? null : cursor2.getString(2);
            String string3 = cursor2.isNull(3) ? null : cursor2.getString(3);
            StoryKind storyKind = (StoryKind) this.storyModelFactory.kindAdapter.decode(Long.valueOf(cursor2.getLong(4)));
            if (cursor2.isNull(5)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(5) == 1);
            }
            GroupStoryType groupStoryType = cursor2.isNull(6) ? null : (GroupStoryType) this.storyModelFactory.groupStoryTypeAdapter.decode(Long.valueOf(cursor2.getLong(6)));
            String string4 = cursor2.isNull(7) ? null : cursor2.getString(7);
            String string5 = cursor2.isNull(8) ? null : cursor2.getString(8);
            if (cursor2.isNull(9)) {
                bool2 = null;
            } else {
                bool2 = Boolean.valueOf(cursor2.getInt(9) == 1);
            }
            Geofence geofence = cursor2.isNull(10) ? null : (Geofence) this.postableStoryModelFactory.geofenceAdapter.decode(cursor2.getString(10));
            GroupStoryRankType groupStoryRankType = cursor2.isNull(11) ? null : (GroupStoryRankType) this.postableStoryModelFactory.groupStoryRankTypeAdapter.decode(Long.valueOf(cursor2.getLong(11)));
            String string6 = cursor2.isNull(12) ? null : cursor2.getString(12);
            if (cursor2.isNull(13)) {
                bool3 = null;
            } else {
                bool3 = Boolean.valueOf(cursor2.getInt(13) == 1);
            }
            return getAllPostableStoriesCreator.create(j, string, string2, string3, storyKind, bool, groupStoryType, string4, string5, bool2, geofence, groupStoryRankType, string6, bool3, cursor2.isNull(14) ? null : Long.valueOf(cursor2.getLong(14)), cursor2.isNull(15) ? null : Long.valueOf(cursor2.getLong(15)), cursor2.isNull(16) ? null : Long.valueOf(cursor2.getLong(16)), cursor2.isNull(17) ? null : cursor2.getString(17), cursor2.isNull(18) ? null : (PrivacyType) this.postableStoryModelFactory.myStoryPrivacyOverrideAdapter.decode(Long.valueOf(cursor2.getLong(18))), cursor2.getLong(19), cursor2.isNull(20) ? null : Long.valueOf(cursor2.getLong(20)));
        }
    }

    public static final class GetBestFriendsMapper<T extends GetBestFriendsModel, T1 extends FriendModel> implements ainw<T> {
        private final GetBestFriendsCreator<T> creator;
        private final com.snap.core.db.record.FriendModel.Factory<T1> friendModelFactory;

        public GetBestFriendsMapper(GetBestFriendsCreator<T> getBestFriendsCreator, com.snap.core.db.record.FriendModel.Factory<T1> factory) {
            this.creator = getBestFriendsCreator;
            this.friendModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            return this.creator.create(cursor2.getLong(0), cursor2.isNull(1) ? null : cursor2.getString(1), cursor2.isNull(2) ? null : cursor2.getString(2), cursor2.getString(3), cursor2.isNull(4) ? null : (Friendmojis) this.friendModelFactory.friendmojisAdapter.decode(cursor2.getString(4)), cursor2.isNull(5) ? null : cursor2.getString(5), cursor2.isNull(6) ? null : Integer.valueOf(cursor2.getInt(6)), cursor2.isNull(7) ? null : (FriendLinkType) this.friendModelFactory.friendLinkTypeAdapter.decode(Long.valueOf(cursor2.getLong(7))), cursor2.isNull(8) ? null : cursor2.getString(8), cursor2.isNull(9) ? null : cursor2.getString(9), cursor2.isNull(10) ? null : Long.valueOf(cursor2.getLong(10)), cursor2.isNull(11) ? null : (CalendarDate) this.friendModelFactory.birthdayAdapter.decode(Long.valueOf(cursor2.getLong(11))), cursor2.isNull(12) ? null : Long.valueOf(cursor2.getLong(12)), cursor2.getInt(13) == 1);
        }
    }

    public static final class GetGroupsMapper<T extends GetGroupsModel> implements ainw<T> {
        private final GetGroupsCreator<T> creator;

        public GetGroupsMapper(GetGroupsCreator<T> getGroupsCreator) {
            this.creator = getGroupsCreator;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            return this.creator.create(cursor2.getLong(0), cursor2.getString(1), cursor2.isNull(2) ? null : cursor2.getString(2), cursor2.isNull(3) ? null : cursor2.getString(3), cursor2.isNull(4) ? null : cursor2.getString(4), cursor2.isNull(5) ? null : cursor2.getString(5), cursor2.getString(6), cursor2.isNull(7) ? null : cursor2.getString(7), cursor2.isNull(8) ? null : cursor2.getString(8), cursor2.isNull(9) ? null : Long.valueOf(cursor2.getLong(9)), cursor2.isNull(10) ? null : Long.valueOf(cursor2.getLong(10)), cursor2.isNull(11) ? null : Long.valueOf(cursor2.getLong(11)));
        }
    }

    public static final class GetLastSnapRecipientsMapper<T extends GetLastSnapRecipientsModel, T1 extends FriendModel> implements ainw<T> {
        private final GetLastSnapRecipientsCreator<T> creator;
        private final com.snap.core.db.record.FriendModel.Factory<T1> friendModelFactory;

        public GetLastSnapRecipientsMapper(GetLastSnapRecipientsCreator<T> getLastSnapRecipientsCreator, com.snap.core.db.record.FriendModel.Factory<T1> factory) {
            this.creator = getLastSnapRecipientsCreator;
            this.friendModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Cursor cursor2 = cursor;
            GetLastSnapRecipientsCreator getLastSnapRecipientsCreator = this.creator;
            Long valueOf = cursor2.isNull(0) ? null : Long.valueOf(cursor2.getLong(0));
            String string = cursor2.getString(1);
            String string2 = cursor2.isNull(2) ? null : cursor2.getString(2);
            long j = cursor2.getLong(3);
            Long valueOf2 = cursor2.isNull(4) ? null : Long.valueOf(cursor2.getLong(4));
            Long valueOf3 = cursor2.isNull(5) ? null : Long.valueOf(cursor2.getLong(5));
            Friendmojis friendmojis = cursor2.isNull(6) ? null : (Friendmojis) this.friendModelFactory.friendmojisAdapter.decode(cursor2.getString(6));
            String string3 = cursor2.isNull(7) ? null : cursor2.getString(7);
            Long valueOf4 = cursor2.isNull(8) ? null : Long.valueOf(cursor2.getLong(8));
            String string4 = cursor2.isNull(9) ? null : cursor2.getString(9);
            String string5 = cursor2.isNull(10) ? null : cursor2.getString(10);
            String string6 = cursor2.isNull(11) ? null : cursor2.getString(11);
            Integer valueOf5 = cursor2.isNull(12) ? null : Integer.valueOf(cursor2.getInt(12));
            Long valueOf6 = cursor2.isNull(13) ? null : Long.valueOf(cursor2.getLong(13));
            CalendarDate calendarDate = cursor2.isNull(14) ? null : (CalendarDate) this.friendModelFactory.birthdayAdapter.decode(Long.valueOf(cursor2.getLong(14)));
            FriendLinkType friendLinkType = cursor2.isNull(15) ? null : (FriendLinkType) this.friendModelFactory.friendLinkTypeAdapter.decode(Long.valueOf(cursor2.getLong(15)));
            String string7 = cursor2.isNull(16) ? null : cursor2.getString(16);
            String string8 = cursor2.isNull(17) ? null : cursor2.getString(17);
            if (cursor2.isNull(18)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(18) == 1);
            }
            cursor2.isNull(19);
            cursor2.isNull(20);
            return getLastSnapRecipientsCreator.create(valueOf, string, string2, j, valueOf2, valueOf3, friendmojis, string3, valueOf4, string4, string5, string6, valueOf5, valueOf6, calendarDate, friendLinkType, string7, string8, bool, null, null);
        }
    }

    public static final class GetRecentFeedsMapper<T extends GetRecentFeedsModel, T1 extends FeedModel, T2 extends FriendModel> implements ainw<T> {
        private final GetRecentFeedsCreator<T> creator;
        private final com.snap.core.db.record.FeedModel.Factory<T1> feedModelFactory;
        private final com.snap.core.db.record.FriendModel.Factory<T2> friendModelFactory;

        public GetRecentFeedsMapper(GetRecentFeedsCreator<T> getRecentFeedsCreator, com.snap.core.db.record.FeedModel.Factory<T1> factory, com.snap.core.db.record.FriendModel.Factory<T2> factory2) {
            this.creator = getRecentFeedsCreator;
            this.feedModelFactory = factory;
            this.friendModelFactory = factory2;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Cursor cursor2 = cursor;
            GetRecentFeedsCreator getRecentFeedsCreator = this.creator;
            long j = cursor2.getLong(0);
            String string = cursor2.getString(1);
            String string2 = cursor2.isNull(2) ? null : cursor2.getString(2);
            FeedKind feedKind = (FeedKind) this.feedModelFactory.kindAdapter.decode(Long.valueOf(cursor2.getLong(3)));
            long j2 = cursor2.getLong(4);
            Long valueOf = cursor2.isNull(5) ? null : Long.valueOf(cursor2.getLong(5));
            Friendmojis friendmojis = cursor2.isNull(6) ? null : (Friendmojis) this.friendModelFactory.friendmojisAdapter.decode(cursor2.getString(6));
            String string3 = cursor2.isNull(7) ? null : cursor2.getString(7);
            Long valueOf2 = cursor2.isNull(8) ? null : Long.valueOf(cursor2.getLong(8));
            String string4 = cursor2.isNull(9) ? null : cursor2.getString(9);
            String string5 = cursor2.isNull(10) ? null : cursor2.getString(10);
            String string6 = cursor2.isNull(11) ? null : cursor2.getString(11);
            Integer valueOf3 = cursor2.isNull(12) ? null : Integer.valueOf(cursor2.getInt(12));
            Long valueOf4 = cursor2.isNull(13) ? null : Long.valueOf(cursor2.getLong(13));
            CalendarDate calendarDate = cursor2.isNull(14) ? null : (CalendarDate) this.friendModelFactory.birthdayAdapter.decode(Long.valueOf(cursor2.getLong(14)));
            FriendLinkType friendLinkType = cursor2.isNull(15) ? null : (FriendLinkType) this.friendModelFactory.friendLinkTypeAdapter.decode(Long.valueOf(cursor2.getLong(15)));
            String string7 = cursor2.isNull(16) ? null : cursor2.getString(16);
            String string8 = cursor2.isNull(17) ? null : cursor2.getString(17);
            if (cursor2.isNull(18)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(18) == 1);
            }
            return getRecentFeedsCreator.create(j, string, string2, feedKind, j2, valueOf, friendmojis, string3, valueOf2, string4, string5, string6, valueOf3, valueOf4, calendarDate, friendLinkType, string7, string8, bool, cursor2.isNull(19) ? null : cursor2.getString(19), cursor2.isNull(20) ? null : cursor2.getString(20));
        }
    }

    public static final class GetRecentsMapper<T extends GetRecentsModel, T1 extends FeedModel, T2 extends FriendModel> implements ainw<T> {
        private final GetRecentsCreator<T> creator;
        private final com.snap.core.db.record.FeedModel.Factory<T1> feedModelFactory;
        private final com.snap.core.db.record.FriendModel.Factory<T2> friendModelFactory;

        public GetRecentsMapper(GetRecentsCreator<T> getRecentsCreator, com.snap.core.db.record.FeedModel.Factory<T1> factory, com.snap.core.db.record.FriendModel.Factory<T2> factory2) {
            this.creator = getRecentsCreator;
            this.feedModelFactory = factory;
            this.friendModelFactory = factory2;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Cursor cursor2 = cursor;
            GetRecentsCreator getRecentsCreator = this.creator;
            long j = cursor2.getLong(0);
            String string = cursor2.getString(1);
            String string2 = cursor2.isNull(2) ? null : cursor2.getString(2);
            FeedKind feedKind = (FeedKind) this.feedModelFactory.kindAdapter.decode(Long.valueOf(cursor2.getLong(3)));
            long j2 = cursor2.getLong(4);
            Long valueOf = cursor2.isNull(5) ? null : Long.valueOf(cursor2.getLong(5));
            Friendmojis friendmojis = cursor2.isNull(6) ? null : (Friendmojis) this.friendModelFactory.friendmojisAdapter.decode(cursor2.getString(6));
            String string3 = cursor2.isNull(7) ? null : cursor2.getString(7);
            Long valueOf2 = cursor2.isNull(8) ? null : Long.valueOf(cursor2.getLong(8));
            String string4 = cursor2.isNull(9) ? null : cursor2.getString(9);
            String string5 = cursor2.isNull(10) ? null : cursor2.getString(10);
            String string6 = cursor2.isNull(11) ? null : cursor2.getString(11);
            Integer valueOf3 = cursor2.isNull(12) ? null : Integer.valueOf(cursor2.getInt(12));
            Long valueOf4 = cursor2.isNull(13) ? null : Long.valueOf(cursor2.getLong(13));
            CalendarDate calendarDate = cursor2.isNull(14) ? null : (CalendarDate) this.friendModelFactory.birthdayAdapter.decode(Long.valueOf(cursor2.getLong(14)));
            FriendLinkType friendLinkType = cursor2.isNull(15) ? null : (FriendLinkType) this.friendModelFactory.friendLinkTypeAdapter.decode(Long.valueOf(cursor2.getLong(15)));
            String string7 = cursor2.isNull(16) ? null : cursor2.getString(16);
            String string8 = cursor2.isNull(17) ? null : cursor2.getString(17);
            if (cursor2.isNull(18)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(18) == 1);
            }
            return getRecentsCreator.create(j, string, string2, feedKind, j2, valueOf, friendmojis, string3, valueOf2, string4, string5, string6, valueOf3, valueOf4, calendarDate, friendLinkType, string7, string8, bool, cursor2.isNull(19) ? null : cursor2.getString(19), cursor2.isNull(20) ? null : cursor2.getString(20));
        }
    }

    public static final class GetSuggestedFriendsMapper<T extends GetSuggestedFriendsModel> implements ainw<T> {
        private final GetSuggestedFriendsCreator<T> creator;

        public GetSuggestedFriendsMapper(GetSuggestedFriendsCreator<T> getSuggestedFriendsCreator) {
            this.creator = getSuggestedFriendsCreator;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            GetSuggestedFriendsCreator getSuggestedFriendsCreator = this.creator;
            boolean z = false;
            long j = cursor.getLong(0);
            String string = cursor.getString(1);
            String string2 = cursor.isNull(2) ? null : cursor.getString(2);
            String string3 = cursor.isNull(3) ? null : cursor.getString(3);
            String string4 = cursor.isNull(4) ? null : cursor.getString(4);
            String string5 = cursor.isNull(5) ? null : cursor.getString(5);
            boolean z2 = cursor.getInt(6) == 1;
            if (cursor.isNull(7)) {
                bool = null;
            } else {
                if (cursor.getInt(7) == 1) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            }
            return getSuggestedFriendsCreator.create(j, string, string2, string3, string4, string5, z2, bool, cursor.isNull(8) ? null : cursor.getString(8), cursor.isNull(9) ? null : cursor.getString(9));
        }
    }

    public static final class GetTemporaryGroupsMapper<T extends GetTemporaryGroupsModel> implements ainw<T> {
        private final GetTemporaryGroupsCreator<T> creator;

        public GetTemporaryGroupsMapper(GetTemporaryGroupsCreator<T> getTemporaryGroupsCreator) {
            this.creator = getTemporaryGroupsCreator;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            return this.creator.create(cursor2.getLong(0), cursor2.getString(1), cursor2.isNull(2) ? null : cursor2.getString(2), cursor2.isNull(3) ? null : cursor2.getString(3), cursor2.isNull(4) ? null : cursor2.getString(4), cursor2.isNull(5) ? null : cursor2.getString(5), cursor2.getString(6), cursor2.isNull(7) ? null : cursor2.getString(7), cursor2.isNull(8) ? null : cursor2.getString(8), cursor2.isNull(9) ? null : Long.valueOf(cursor2.getLong(9)), cursor2.isNull(10) ? null : Long.valueOf(cursor2.getLong(10)), cursor2.isNull(11) ? null : Long.valueOf(cursor2.getLong(11)));
        }
    }
}
