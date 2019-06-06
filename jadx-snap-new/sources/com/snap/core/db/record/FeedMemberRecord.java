package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.record.FeedMemberModel.Factory;
import com.snap.core.db.record.FeedMemberModel.GetGroupFeedIdsForFriendRowIdsModel;
import com.snap.core.db.record.FeedMemberModel.SelectAllParticipantsForFeedModel;
import com.snap.core.db.record.FeedMemberModel.SelectMemberNamesForFeedModel;
import com.snap.core.db.record.FeedMemberModel.SelectMembersForAvatarModel;
import com.snap.core.db.record.FeedMemberModel.SelectMembersForFeedModel;
import com.snap.core.db.record.FeedMemberModel.SelectMembersForTalkModel;
import com.snap.core.db.record.FeedMemberModel.SelectParticipantDetailsForFeedModel;

@AutoValue
public abstract class FeedMemberRecord implements FeedMemberModel {
    public static final Factory<FeedMemberRecord> FACTORY = new Factory(-$$Lambda$zKVwF-04NvgW3PJoSTxjyybDE7A.INSTANCE);

    @AutoValue
    public static abstract class AllParticipants implements SelectAllParticipantsForFeedModel {
    }

    @AutoValue
    public static abstract class FeedAvatarMember implements SelectMembersForAvatarModel {
    }

    @AutoValue
    public static abstract class ForFeed implements SelectMembersForFeedModel {
    }

    @AutoValue
    public static abstract class ForTalk implements SelectMembersForTalkModel {
    }

    @AutoValue
    public static abstract class GroupInfo implements GetGroupFeedIdsForFriendRowIdsModel {
    }

    @AutoValue
    public static abstract class Participant implements SelectParticipantDetailsForFeedModel {
    }

    @AutoValue
    public static abstract class SelectMemberNames implements SelectMemberNamesForFeedModel {
    }
}
