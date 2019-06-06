package com.snap.core.db.record;

import com.snap.core.db.record.FeedMemberRecord.AllParticipants;
import com.snap.core.db.record.FeedMemberRecord.FeedAvatarMember;
import com.snap.core.db.record.FeedMemberRecord.ForFeed;
import com.snap.core.db.record.FeedMemberRecord.ForTalk;
import com.snap.core.db.record.FeedMemberRecord.GroupInfo;
import com.snap.core.db.record.FeedMemberRecord.Participant;
import com.snap.core.db.record.FeedMemberRecord.SelectMemberNames;
import defpackage.ainw;

public class LegacyFeedMemberQueries {
    public static final ainw<GroupInfo> GET_GROUP_FEED_IDS_FOR_FRIENDS_MAPPER = FeedMemberRecord.FACTORY.getGroupFeedIdsForFriendRowIdsMapper(-$$Lambda$75H9ZMNhz6o_6ib3jL58acvUWLU.INSTANCE);
    public static final ainw<Participant> GET_PARTICIPANT_DETAIL_MAPPER = FeedMemberRecord.FACTORY.selectParticipantDetailsForFeedMapper(-$$Lambda$7O2OEoZTkMqS_AL6fZMQmccWYXw.INSTANCE, FriendRecord.FACTORY);
    public static final ainw<AllParticipants> SELECT_ALL_FEED_PARTICIPANTS_MAPPER = FeedMemberRecord.FACTORY.selectAllParticipantsForFeedMapper(-$$Lambda$P1cwtTaXw82X-119sD6GHUvv47g.INSTANCE);
    public static final ainw<FeedAvatarMember> SELECT_FEED_AVATAR_MEMBERS_MAPPER = FeedMemberRecord.FACTORY.selectMembersForAvatarMapper(-$$Lambda$__ONiXvcOAH3doO8VH3ZNBVSRNk.INSTANCE);
    public static final ainw<ForTalk> SELECT_FEED_MEMBERS_FOR_TALK_MAPPER = FeedMemberRecord.FACTORY.selectMembersForTalkMapper(-$$Lambda$B0khANwXGoZy9dX7wX4AsOqjAIs.INSTANCE);
    public static final ainw<ForFeed> SELECT_FEED_MEMBERS_MAPPER = FeedMemberRecord.FACTORY.selectMembersForFeedMapper(-$$Lambda$o94tdLYUoGSjLPi1KsDUz_aQBRA.INSTANCE);
    public static final ainw<SelectMemberNames> SELECT_MEMBER_NAMES_FOR_FEED_MODEL_ROW_MAPPER = FeedMemberRecord.FACTORY.selectMemberNamesForFeedMapper(-$$Lambda$oNT8fCsd-P4ZOUeDKc8CJojnp70.INSTANCE);
}
