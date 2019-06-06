package com.snap.core.db.query;

import com.google.auto.value.AutoValue;
import com.snap.core.db.query.FriendsFeedSuggestedFriendsModel.Factory;
import com.snap.core.db.query.FriendsFeedSuggestedFriendsModel.SelectSuggestedFriendsModel;
import com.snap.core.db.record.SuggestedFriendPlacementRecord;
import defpackage.ainw;

@AutoValue
public abstract class LegacyFriendsFeedSuggestedFriendQueries implements FriendsFeedSuggestedFriendsModel {
    public static final ainw<WithDisplayInfo> ALL_SUGGESTED_IN_PLACEMENT_MAPPER;
    public static final Factory<SuggestedFriendPlacementRecord> FACTORY;

    @AutoValue
    public static abstract class WithDisplayInfo implements SelectSuggestedFriendsModel {
    }

    static {
        Factory factory = new Factory(SuggestedFriendPlacementRecord.FACTORY);
        FACTORY = factory;
        ALL_SUGGESTED_IN_PLACEMENT_MAPPER = factory.selectSuggestedFriendsMapper(-$$Lambda$q5Be6DiVaD71lIlIujuZcQa5-0o.INSTANCE);
    }
}
