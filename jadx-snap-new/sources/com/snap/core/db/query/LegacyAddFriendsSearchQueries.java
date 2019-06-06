package com.snap.core.db.query;

import com.google.auto.value.AutoValue;
import com.snap.core.db.query.AddFriendsSearchModel.Factory;
import com.snap.core.db.query.AddFriendsSearchModel.SelectAddFriendsSearchModel;
import com.snap.core.db.record.SuggestedFriendPlacementRecord;
import defpackage.ainw;

@AutoValue
public abstract class LegacyAddFriendsSearchQueries implements AddFriendsSearchModel {
    public static final ainw<WithDisplayInfo> ADD_FRIENDS_SEARCH_MAPPER;
    public static final ainw<String> ALL_ADDED_FRIEND_NAMES_MAPPER = FACTORY.getAllAddedFriendNamesMapper();
    public static final Factory<SuggestedFriendPlacementRecord> FACTORY;

    @AutoValue
    public static abstract class WithDisplayInfo implements SelectAddFriendsSearchModel {
    }

    static {
        Factory factory = new Factory(SuggestedFriendPlacementRecord.FACTORY);
        FACTORY = factory;
        ADD_FRIENDS_SEARCH_MAPPER = factory.selectAddFriendsSearchMapper(-$$Lambda$JL72E9GPyDJRDuI1z_OBgb6oCao.INSTANCE);
    }
}
