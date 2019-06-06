package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.api.column.IntegerEnumColumnAdapter;
import com.snap.core.db.column.FeedKind;
import com.snap.core.db.record.FeedModel.Factory;
import com.snap.core.db.record.FeedModel.GetBasicFeedInfoByIdModel;
import com.snap.core.db.record.FeedModel.GetConversationStateModel;
import com.snap.core.db.record.FeedModel.GetDisplayNameByMobStoryIdModel;
import com.snap.core.db.record.FeedModel.GetFeedIdForKeysModel;
import com.snap.core.db.record.FeedModel.GetGroupVersionsForKeysModel;
import com.snap.core.db.record.FeedModel.SelectMembersForAvatarPickerModel;
import com.snap.core.db.record.FeedModel.SelectReadWriteInfoModel;
import defpackage.ainu;
import defpackage.ainw;
import defpackage.gcg;
import defpackage.gcp;

@AutoValue
public abstract class FeedRecord implements FeedModel {
    public static final ainw<BasicFeedInfo> BASIC_FEED_INFO_BY_ID_MAPPER = FACTORY.getBasicFeedInfoByIdMapper(-$$Lambda$Y3mxBF2eBsd1JU5FyqpoFEQczAc.INSTANCE);
    public static final Factory<FeedRecord> FACTORY;
    private static final ainu<FeedKind, Long> FEED_KIND_TYPE_ADAPTER = new IntegerEnumColumnAdapter(FeedKind.class);
    public static final ainw<AvatarInfo> GET_AVATAR_PICKER_FRIENDS_MAPPER = FACTORY.selectMembersForAvatarPickerMapper(-$$Lambda$A_CueDtfa8-lZ1g2LG7QL48JgRo.INSTANCE);
    public static final ainw<FeedId> GET_FEED_ID_FOR_KEYS_MAPPER;
    public static final ainw<GroupVersion> GET_GROUP_VERSIONS = FACTORY.getGroupVersionsForKeysMapper(-$$Lambda$B6EQPfxfhE08FQqYLKyxMeiePWg.INSTANCE);
    public static final ainw<GroupChatGroupStoryDisplayName> GROUP_CHAT_GROUP_STORY_DISPLAY_NAME_ROW_MAPPER = FACTORY.getDisplayNameByMobStoryIdMapper(-$$Lambda$d2tdsp33ncyyPNltPBFCDTvocgE.INSTANCE);
    private static final ainu<gcg, Long> GROUP_SYNC_CONTENT_TYPE_ADAPTER = new IntegerEnumColumnAdapter(gcg.class);
    public static final ainw<String> LATEST_AVATAR_ID_MAPPER = FACTORY.getLastWriterAvatarIdForFeedMapper();
    public static final ainw<ConversationState> SELECT_CONVERSATION_STATE = FACTORY.getConversationStateMapper(-$$Lambda$DHwZggbNWebE2JC1wCf9GCu7xLA.INSTANCE);
    public static final ainw<ReadWriteTimeInfo> SELECT_READ_WRITE_TIME_INFO = FACTORY.selectReadWriteInfoMapper(-$$Lambda$80JatSbxdUvprZqj6x5_HlygDSg.INSTANCE);
    private static final ainu<gcp, Long> SNAP_TYPE_ADAPTER = new IntegerEnumColumnAdapter(gcp.class);

    @AutoValue
    public static abstract class FeedId implements GetFeedIdForKeysModel {
    }

    @AutoValue
    public static abstract class ReadWriteTimeInfo implements SelectReadWriteInfoModel {
    }

    @AutoValue
    public static abstract class AvatarInfo implements SelectMembersForAvatarPickerModel {
    }

    @AutoValue
    public static abstract class BasicFeedInfo implements GetBasicFeedInfoByIdModel {
        public boolean isGroup() {
            return kind() == FeedKind.GROUP;
        }

        public boolean isImmediateRetentionDirectConversation() {
            return !isGroup() && messageRetentionInMinutes() == 0;
        }
    }

    @AutoValue
    public static abstract class ConversationState implements GetConversationStateModel {
    }

    @AutoValue
    public static abstract class GroupChatGroupStoryDisplayName implements GetDisplayNameByMobStoryIdModel {
    }

    @AutoValue
    public static abstract class GroupVersion implements GetGroupVersionsForKeysModel {
    }

    static {
        Factory factory = new Factory(-$$Lambda$DsBLU86xRQd-B4sjW0H_9DFhnfA.INSTANCE, SNAP_TYPE_ADAPTER, GROUP_SYNC_CONTENT_TYPE_ADAPTER, FEED_KIND_TYPE_ADAPTER);
        FACTORY = factory;
        GET_FEED_ID_FOR_KEYS_MAPPER = factory.getFeedIdForKeysMapper(-$$Lambda$o0KDv5vPjcfDKMIJpT0tcbgyi04.INSTANCE);
    }
}
