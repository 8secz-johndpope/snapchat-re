package com.snap.core.db.query;

import com.google.auto.value.AutoValue;
import com.snap.core.db.query.ProfileModel.Factory;
import com.snap.core.db.query.ProfileModel.GetFriendByUsernameCreator;
import com.snap.core.db.query.ProfileModel.GetFriendByUsernameModel;
import com.snap.core.db.query.ProfileModel.GetGroupByFeedIdCreator;
import com.snap.core.db.query.ProfileModel.GetGroupByFeedIdModel;
import com.snap.core.db.query.ProfileModel.GetSharedGroupsByFriendRowIdCreator;
import com.snap.core.db.query.ProfileModel.GetSharedGroupsByFriendRowIdModel;
import com.snap.core.db.query.ProfileModel.SelectMembersForGroupCreator;
import com.snap.core.db.query.ProfileModel.SelectMembersForGroupModel;
import com.snap.core.db.record.FriendRecord;
import com.snap.core.db.record.StoryRecord;
import defpackage.ainw;
import defpackage.akbp;
import defpackage.akbu;
import defpackage.akbw;
import defpackage.akbz;
import defpackage.akco;
import defpackage.akcr;

@AutoValue
public abstract class LegacyProfileQueries implements ProfileModel {
    public static final Companion Companion = new Companion();
    private static final Factory<FriendRecord, StoryRecord> FACTORY;
    private static final ainw<FriendProfileDataRecord> GET_FRIEND_FROM_USERNAME_MAPPER;
    private static final ainw<GroupInfoDataRecord> GET_GROUP_INFO_BY_ID_MAPPER;
    private static final ainw<SharedGroupInfo> GET_SHARED_GROUP_INFO_MAPPER;
    private static final ainw<MemberForGroup> SELECT_MEMBERS_FROM_GROUP_MAPPER;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final Factory<FriendRecord, StoryRecord> getFACTORY() {
            return LegacyProfileQueries.FACTORY;
        }

        public final ainw<FriendProfileDataRecord> getGET_FRIEND_FROM_USERNAME_MAPPER() {
            return LegacyProfileQueries.GET_FRIEND_FROM_USERNAME_MAPPER;
        }

        public final ainw<GroupInfoDataRecord> getGET_GROUP_INFO_BY_ID_MAPPER() {
            return LegacyProfileQueries.GET_GROUP_INFO_BY_ID_MAPPER;
        }

        public final ainw<SharedGroupInfo> getGET_SHARED_GROUP_INFO_MAPPER() {
            return LegacyProfileQueries.GET_SHARED_GROUP_INFO_MAPPER;
        }

        public final ainw<MemberForGroup> getSELECT_MEMBERS_FROM_GROUP_MAPPER() {
            return LegacyProfileQueries.SELECT_MEMBERS_FROM_GROUP_MAPPER;
        }
    }

    @AutoValue
    public static abstract class FriendProfileDataRecord implements GetFriendByUsernameModel {
    }

    @AutoValue
    public static abstract class GroupInfoDataRecord implements GetGroupByFeedIdModel {
    }

    @AutoValue
    public static abstract class MemberForGroup implements SelectMembersForGroupModel {
    }

    @AutoValue
    public static abstract class SharedGroupInfo implements GetSharedGroupsByFriendRowIdModel {
    }

    static {
        Factory factory = new Factory(FriendRecord.FACTORY, StoryRecord.FACTORY);
        FACTORY = factory;
        akbu akbu = LegacyProfileQueries$Companion$GET_FRIEND_FROM_USERNAME_MAPPER$1.INSTANCE;
        if (akbu != null) {
            akbu = new LegacyProfileQueriesKt$sam$com_snap_core_db_query_ProfileModel_GetFriendByUsernameCreator$0(akbu);
        }
        Object friendByUsernameMapper = factory.getFriendByUsernameMapper((GetFriendByUsernameCreator) akbu);
        akcr.a(friendByUsernameMapper, "FACTORY.getFriendByUsern…_FriendProfileDataRecord)");
        GET_FRIEND_FROM_USERNAME_MAPPER = (ainw) friendByUsernameMapper;
        factory = FACTORY;
        akbz akbz = LegacyProfileQueries$Companion$SELECT_MEMBERS_FROM_GROUP_MAPPER$1.INSTANCE;
        if (akbz != null) {
            akbz = new LegacyProfileQueriesKt$sam$com_snap_core_db_query_ProfileModel_SelectMembersForGroupCreator$0(akbz);
        }
        friendByUsernameMapper = factory.selectMembersForGroupMapper((SelectMembersForGroupCreator) akbz);
        akcr.a(friendByUsernameMapper, "FACTORY.selectMembersFor…leQueries_MemberForGroup)");
        SELECT_MEMBERS_FROM_GROUP_MAPPER = (ainw) friendByUsernameMapper;
        factory = FACTORY;
        akbp akbp = LegacyProfileQueries$Companion$GET_GROUP_INFO_BY_ID_MAPPER$1.INSTANCE;
        if (akbp != null) {
            akbp = new LegacyProfileQueriesKt$sam$com_snap_core_db_query_ProfileModel_GetGroupByFeedIdCreator$0(akbp);
        }
        friendByUsernameMapper = factory.getGroupByFeedIdMapper((GetGroupByFeedIdCreator) akbp);
        akcr.a(friendByUsernameMapper, "FACTORY.getGroupByFeedId…ries_GroupInfoDataRecord)");
        GET_GROUP_INFO_BY_ID_MAPPER = (ainw) friendByUsernameMapper;
        factory = FACTORY;
        akbw akbw = LegacyProfileQueries$Companion$GET_SHARED_GROUP_INFO_MAPPER$1.INSTANCE;
        if (akbw != null) {
            akbw = new LegacyProfileQueriesKt$sam$com_snap_core_db_query_ProfileModel_GetSharedGroupsByFriendRowIdCreator$0(akbw);
        }
        friendByUsernameMapper = factory.getSharedGroupsByFriendRowIdMapper((GetSharedGroupsByFriendRowIdCreator) akbw);
        akcr.a(friendByUsernameMapper, "FACTORY.getSharedGroupsB…eQueries_SharedGroupInfo)");
        GET_SHARED_GROUP_INFO_MAPPER = (ainw) friendByUsernameMapper;
    }
}
