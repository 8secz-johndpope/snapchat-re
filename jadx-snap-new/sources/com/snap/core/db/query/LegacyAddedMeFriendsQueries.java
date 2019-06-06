package com.snap.core.db.query;

import com.google.auto.value.AutoValue;
import com.snap.core.db.query.AddedMeFriendsModel.Factory;
import com.snap.core.db.query.AddedMeFriendsModel.SelectAddedMeFriendsModel;
import defpackage.ainw;

@AutoValue
public abstract class LegacyAddedMeFriendsQueries implements AddedMeFriendsModel {
    public static final ainw<Long> ADDED_ME_CHANGED_MAPPER = FACTORY.getAddedMeChangeMapper();
    public static final ainw<WithDisplayInfo> ADDED_ME_FRIENDS_MAPPER;
    public static final Factory FACTORY;
    public static final ainw<Long> NEW_ADDED_ME_FRIENDS_COUNT_MAPPER = FACTORY.getNewAddedMeFriendCountMapper();
    public static final ainw<Long> UNRECIPROCATED_ADDED_ME_UNSEEN_COUNT_MAPPER = FACTORY.getUnreciprocatedAddedMeAndUnseenAddedMeBackCountMapper();
    public static final ainw<Long> UNVIEWED_ADDED_ME_FRIENDS_COUNT_MAPPER = FACTORY.getUnviewedAddedMeFriendCountMapper();

    @AutoValue
    public static abstract class WithDisplayInfo implements SelectAddedMeFriendsModel {
    }

    static {
        Factory factory = new Factory();
        FACTORY = factory;
        ADDED_ME_FRIENDS_MAPPER = factory.selectAddedMeFriendsMapper(-$$Lambda$UmvvTUPbewaPaygozwICl8SKpGo.INSTANCE);
    }
}
