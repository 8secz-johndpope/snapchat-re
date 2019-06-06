package com.snap.core.db.query;

import android.text.TextUtils;
import com.google.auto.value.AutoValue;
import com.google.common.base.Strings;
import com.snap.core.db.column.CalendarDate;
import com.snap.core.db.column.FeedKind;
import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.column.Friendmojis;
import com.snap.core.db.column.GroupStoryRankType;
import com.snap.core.db.column.GroupStoryType;
import com.snap.core.db.column.PrivacyType;
import com.snap.core.db.column.StoryKind;
import com.snap.core.db.query.SendToModel.Factory;
import com.snap.core.db.query.SendToModel.GetAllFriendsModel;
import com.snap.core.db.query.SendToModel.GetAllPostableStoriesModel;
import com.snap.core.db.query.SendToModel.GetBestFriendsModel;
import com.snap.core.db.query.SendToModel.GetGroupsModel;
import com.snap.core.db.query.SendToModel.GetRecentFeedsModel;
import com.snap.core.db.query.SendToModel.GetSuggestedFriendsModel;
import com.snap.core.db.record.FeedRecord;
import com.snap.core.db.record.FriendRecord;
import com.snap.core.db.record.PostableStoryRecord;
import com.snap.core.db.record.StoryRecord;
import com.snap.core.db.record.SuggestedFriendPlacementRecord;
import com.snapchat.soju.android.Geofence;
import defpackage.ainw;
import java.util.Calendar;

public class LegacySendToQueries implements SendToModel {
    public static final Factory FACTORY;
    public static final ainw<Friend> SELECT_ALL_FRIENDS_MAPPER = FACTORY.getAllFriendsMapper(-$$Lambda$A0pHojNw8FJXUIWdBWMTT__0Fbk.INSTANCE);
    public static final ainw<Friend> SELECT_BEST_FRIEND_MAPPER = FACTORY.getBestFriendsMapper(-$$Lambda$IB9lxQC8484u7LzmlAwL86rcKIY.INSTANCE);
    public static final ainw<Group> SELECT_GROUPS_MAPPER = FACTORY.getGroupsMapper(-$$Lambda$HsVO0j96eL8P9G_h5C1pABW0dbI.INSTANCE);
    public static final ainw<Recent> SELECT_RECENTS_MAPPER;
    public static final ainw<PostableStory> SELECT_STORIES_MAPPER = FACTORY.getAllPostableStoriesMapper(-$$Lambda$RooNxfzc3FBM2jP0FqCtYRgeKjw.INSTANCE);
    public static final ainw<SuggestedFriend> SELECT_SUGGESTIONS_MAPPER = FACTORY.getSuggestedFriendsMapper(-$$Lambda$ngKtKd9nUEsCmG6bm7p98WP1E5E.INSTANCE);

    @AutoValue
    public static abstract class Friend implements GetAllFriendsModel, GetBestFriendsModel {

        public static abstract class Builder {
            public abstract Builder _id(long j);

            public abstract Builder birthday(CalendarDate calendarDate);

            public abstract Builder bitmojiAvatarId(String str);

            public abstract Builder bitmojiSelfieId(String str);

            public abstract Friend build();

            public abstract Builder displayName(String str);

            public abstract Builder friendLinkType(FriendLinkType friendLinkType);

            public abstract Builder friendmojiCategories(String str);

            public abstract Builder friendmojis(Friendmojis friendmojis);

            public abstract Builder friendmojisToDisplay(String str);

            public abstract Builder isBest(boolean z);

            public abstract Builder isNewFriend(boolean z);

            public abstract Builder isOfficial(boolean z);

            public abstract Builder isRecent(boolean z);

            public abstract Builder lastAddFriendTimestamp(Long l);

            public abstract Builder phoneNumber(String str);

            public abstract Builder streakExpiration(Long l);

            public abstract Builder streakLength(Integer num);

            public abstract Builder userId(String str);

            public abstract Builder username(String str);
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Friend create(long j, String str, String str2, String str3, Friendmojis friendmojis, String str4, Integer num, FriendLinkType friendLinkType, String str5, String str6, Long l, CalendarDate calendarDate, Long l2, boolean z) {
            return builder()._id(j).userId(str).displayName(str2).username(str3).friendmojis(friendmojis).friendmojiCategories(str4).streakLength(num).friendLinkType(friendLinkType).bitmojiAvatarId(str5).bitmojiSelfieId(str6).friendmojisToDisplay(Friendmojis.getBaseFriendmojis(friendmojis)).isNewFriend(false).isRecent(false).isBest(false).lastAddFriendTimestamp(l).birthday(calendarDate).streakExpiration(l2).isOfficial(z).build();
        }

        public static Friend create(Friend friend, String str, String str2) {
            return builder()._id(friend._id()).userId(friend.userId()).displayName(friend.displayName()).username(friend.username()).friendmojis(friend.friendmojis()).friendmojiCategories(friend.friendmojiCategories()).streakLength(friend.streakLength()).friendLinkType(friend.friendLinkType()).bitmojiAvatarId(friend.bitmojiAvatarId()).bitmojiSelfieId(str).friendmojisToDisplay(str2).isNewFriend(friend.isNewFriend()).isRecent(friend.isRecent()).isBest(friend.isBest()).lastAddFriendTimestamp(friend.lastAddFriendTimestamp()).birthday(friend.birthday()).streakExpiration(friend.streakExpiration()).isOfficial(friend.isOfficial()).build();
        }

        public int compareTo(Friend friend) {
            return displayNameSafe().compareTo(friend.displayNameSafe());
        }

        public String displayNameSafe() {
            String displayName = displayName();
            return Strings.isNullOrEmpty(displayName) ? username() : displayName;
        }

        public abstract String friendmojisToDisplay();

        public abstract boolean isBest();

        public boolean isBirthday() {
            return LegacySendToQueries.isBirthdayNullSafe(birthday());
        }

        public abstract boolean isNewFriend();

        public boolean isOutGoingFriend() {
            return friendLinkType() == FriendLinkType.OUTGOING;
        }

        public abstract boolean isRecent();

        public boolean isSuggestedFriend() {
            return friendLinkType() == FriendLinkType.SUGGESTED;
        }

        public abstract String phoneNumber();
    }

    @AutoValue
    public static abstract class Group implements GetGroupsModel {
    }

    @AutoValue
    public static abstract class PostableStory implements GetAllPostableStoriesModel {

        public static abstract class Builder {
            public abstract Builder _id(long j);

            public abstract PostableStory build();

            public abstract Builder creationTimestamp(Long l);

            public abstract Builder customTitle(String str);

            public abstract Builder displayName(String str);

            public abstract Builder feedId(Long l);

            public abstract Builder geofence(Geofence geofence);

            public abstract Builder groupStoryRankType(GroupStoryRankType groupStoryRankType);

            public abstract Builder groupStoryType(GroupStoryType groupStoryType);

            public abstract Builder hasActiveStory(Boolean bool);

            public abstract Builder isLocal(Boolean bool);

            public abstract Builder isSpectaclesStory(Boolean bool);

            public abstract Builder kind(StoryKind storyKind);

            public abstract Builder lastActionTimestamp(Long l);

            public abstract Builder latestActiveStorySnapPostTimestamp(long j);

            public abstract Builder latestUserPostTimestamp(Long l);

            public abstract Builder mischiefId(String str);

            public abstract Builder myStoryPrivacyOverride(PrivacyType privacyType);

            public abstract Builder storyId(String str);

            public abstract Builder subtext(String str);

            public abstract Builder thumbnailUrl(String str);

            public abstract Builder userName(String str);
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PostableStory create(long j, String str, String str2, String str3, StoryKind storyKind, Boolean bool, GroupStoryType groupStoryType, String str4, String str5, Boolean bool2, Geofence geofence, GroupStoryRankType groupStoryRankType, String str6, Boolean bool3, Long l, Long l2, Long l3, String str7, PrivacyType privacyType, long j2, Long l4) {
            long j3 = j;
            String str8 = str;
            str8 = str2;
            str8 = str3;
            StoryKind storyKind2 = storyKind;
            Boolean bool4 = bool;
            GroupStoryType groupStoryType2 = groupStoryType;
            str8 = str4;
            str8 = str5;
            bool4 = bool2;
            Geofence geofence2 = geofence;
            GroupStoryRankType groupStoryRankType2 = groupStoryRankType;
            return builder()._id(j).storyId(str).userName(str2).displayName(str3).kind(storyKind).isLocal(bool).groupStoryType(groupStoryType).mischiefId(str4).subtext(str5).isSpectaclesStory(bool2).geofence(geofence).groupStoryRankType(groupStoryRankType).customTitle(str6).hasActiveStory(bool3).lastActionTimestamp(l).latestUserPostTimestamp(l2).creationTimestamp(l3).thumbnailUrl(str7).myStoryPrivacyOverride(privacyType).latestActiveStorySnapPostTimestamp(j2).feedId(l4).build();
        }

        public Geofence getGeofence() {
            return geofence();
        }

        public PrivacyType getMyStoryPrivacyOverride() {
            return (!isMyOverridenPrivacyStory() || myStoryPrivacyOverride() == null) ? null : myStoryPrivacyOverride();
        }

        public boolean isBusinessStory() {
            return kind() == StoryKind.BUSINESS;
        }

        public boolean isCustomGroupStory() {
            return groupStoryType() == GroupStoryType.CUSTOM;
        }

        public boolean isGeoGroupStory() {
            return groupStoryType() == GroupStoryType.GEOFENCE;
        }

        public boolean isMischief() {
            return groupStoryType() == GroupStoryType.MISCHIEF;
        }

        public boolean isMobStory() {
            return kind() == StoryKind.GROUP;
        }

        public boolean isMyOverridenPrivacyStory() {
            return kind() == StoryKind.MY_OVERRIDDEN_PRIVACY;
        }

        public boolean isMyStory() {
            return kind() == StoryKind.MY || kind() == StoryKind.MY_OVERRIDDEN_PRIVACY;
        }

        public boolean isOfficialStory() {
            return kind() == StoryKind.OFFICIAL;
        }

        public boolean isOurStory() {
            return kind() == StoryKind.OUR;
        }

        public boolean isPrivateGroupStory() {
            return groupStoryType() == GroupStoryType.PRIVATE;
        }
    }

    @AutoValue
    public static abstract class Recent implements GetRecentFeedsModel {

        public static abstract class Builder {
            public abstract Builder _id(long j);

            public abstract Builder birthday(CalendarDate calendarDate);

            public abstract Builder bitmojiAvatarId(String str);

            public abstract Builder bitmojiSelfieId(String str);

            public abstract Recent build();

            public abstract Builder feedDisplayName(String str);

            public abstract Builder fitScreenParticipantString(String str);

            public abstract Builder friendDisplayName(String str);

            public abstract Builder friendLinkType(FriendLinkType friendLinkType);

            public abstract Builder friendRowId(Long l);

            public abstract Builder friendmojiCategories(String str);

            public abstract Builder friendmojis(Friendmojis friendmojis);

            public abstract Builder friendmojisToDisplay(String str);

            public abstract Builder isOfficial(Boolean bool);

            public abstract Builder key(String str);

            public abstract Builder kind(FeedKind feedKind);

            public abstract Builder lastAddFriendTimestamp(Long l);

            public abstract Builder lastInteractionTimestamp(long j);

            public abstract Builder participantString(String str);

            public abstract Builder streakExpiration(Long l);

            public abstract Builder streakLength(Integer num);

            public abstract Builder userId(String str);

            public abstract Builder username(String str);
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Recent create(long j, String str, String str2, FeedKind feedKind, long j2, Long l, Friendmojis friendmojis, String str3, Long l2, String str4, String str5, String str6, Integer num, Long l3, CalendarDate calendarDate, FriendLinkType friendLinkType, String str7, String str8, Boolean bool, String str9, String str10) {
            long j3 = j;
            String str11 = str;
            str11 = str2;
            FeedKind feedKind2 = feedKind;
            j3 = j2;
            Long l4 = l;
            Friendmojis friendmojis2 = friendmojis;
            String str12 = str3;
            Long l5 = l2;
            str12 = str4;
            str12 = str5;
            return builder()._id(j).key(str).feedDisplayName(str2).kind(feedKind).lastInteractionTimestamp(j2).lastAddFriendTimestamp(l).friendmojis(friendmojis).friendmojiCategories(str3).friendRowId(l2).userId(str4).username(str5).friendDisplayName(str6).streakLength(num).streakExpiration(l3).birthday(calendarDate).bitmojiAvatarId(str7).bitmojiSelfieId(str8).friendLinkType(friendLinkType).friendmojisToDisplay(Friendmojis.getBaseFriendmojis(friendmojis)).isOfficial(bool).participantString(str9).fitScreenParticipantString(str10).build();
        }

        public static Recent create(Recent recent, String str, String str2, String str3) {
            return builder()._id(recent._id()).key(recent.key()).feedDisplayName(str3).kind(recent.kind()).lastInteractionTimestamp(recent.lastInteractionTimestamp()).lastAddFriendTimestamp(recent.lastAddFriendTimestamp()).friendmojis(recent.friendmojis()).friendmojiCategories(recent.friendmojiCategories()).friendRowId(recent.friendRowId()).userId(recent.userId()).username(recent.username()).friendDisplayName(recent.friendDisplayName()).streakLength(recent.streakLength()).streakExpiration(recent.streakExpiration()).birthday(recent.birthday()).bitmojiAvatarId(recent.bitmojiAvatarId()).bitmojiSelfieId(str).friendLinkType(recent.friendLinkType()).friendmojisToDisplay(str2).isOfficial(recent.isOfficial()).participantString(recent.participantString()).fitScreenParticipantString(recent.fitScreenParticipantString()).build();
        }

        public String friendDisplayNameSafe() {
            return TextUtils.isEmpty(friendDisplayName()) ? username() : friendDisplayName();
        }

        public abstract String friendmojisToDisplay();

        public boolean isBirthday() {
            return LegacySendToQueries.isBirthdayNullSafe(birthday());
        }

        public boolean isGroup() {
            return kind() == FeedKind.GROUP;
        }

        public boolean isOutGoingFriend() {
            return friendLinkType() == FriendLinkType.OUTGOING;
        }
    }

    @AutoValue
    public static abstract class SuggestedFriend implements GetSuggestedFriendsModel {

        public static abstract class Builder {
            public abstract Builder _id(long j);

            public abstract Builder bitmojiAvatarId(String str);

            public abstract Builder bitmojiSelfieId(String str);

            public abstract SuggestedFriend build();

            public abstract Builder displayName(String str);

            public abstract Builder isAdded(Boolean bool);

            public abstract Builder isOfficial(boolean z);

            public abstract Builder suggestionReason(String str);

            public abstract Builder suggestionToken(String str);

            public abstract Builder userId(String str);

            public abstract Builder username(String str);
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuggestedFriend create(long j, String str, String str2, String str3, String str4, String str5, boolean z, Boolean bool, String str6, String str7) {
            return builder()._id(j).username(str).userId(str2).displayName(str3).bitmojiSelfieId(str4).bitmojiAvatarId(str5).isOfficial(z).isAdded(bool).suggestionReason(str6).suggestionToken(str7).build();
        }

        public String displayNameSafe() {
            return TextUtils.isEmpty(displayName()) ? username() : displayName();
        }
    }

    static {
        Factory factory = new Factory(SuggestedFriendPlacementRecord.FACTORY, FeedRecord.FACTORY, FriendRecord.FACTORY, StoryRecord.FACTORY, PostableStoryRecord.FACTORY);
        FACTORY = factory;
        SELECT_RECENTS_MAPPER = factory.getRecentFeedsMapper(-$$Lambda$SRPLATx_kz3g29T2jY1YT41vD24.INSTANCE);
    }

    private static boolean isBirthdayNullSafe(CalendarDate calendarDate) {
        return calendarDate != null && calendarDate.isSameDay(Calendar.getInstance());
    }
}
