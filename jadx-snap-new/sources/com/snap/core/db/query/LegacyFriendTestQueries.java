package com.snap.core.db.query;

import com.google.auto.value.AutoValue;
import com.snap.core.db.record.FriendRecord;
import com.snap.core.db.record.FriendTestModel;
import com.snap.core.db.record.FriendTestModel.Factory;
import com.snap.core.db.record.FriendTestModel.SelectFriendTestDataByUserIdModel;
import com.snap.core.db.record.FriendTestModel.SelectFriendTestDataByUsernameModel;
import defpackage.ainw;

@AutoValue
public abstract class LegacyFriendTestQueries implements FriendTestModel {
    public static final Factory FACTORY;
    public static final ainw<FriendTestData> SELECT_FREND_TEST_DATA_BY_USERID_MAPPER = FACTORY.selectFriendTestDataByUserIdMapper(-$$Lambda$amFTGrzjDo-xIohTXOvq4I18OmI.INSTANCE);
    public static final ainw<FriendTestData> SELECT_FREND_TEST_DATA_BY_USERNAME_MAPPER;

    @AutoValue
    public static abstract class FriendTestData implements SelectFriendTestDataByUserIdModel, SelectFriendTestDataByUsernameModel {
    }

    static {
        Factory factory = new Factory(FriendRecord.FACTORY);
        FACTORY = factory;
        SELECT_FREND_TEST_DATA_BY_USERNAME_MAPPER = factory.selectFriendTestDataByUsernameMapper(-$$Lambda$yrl4ii6sN5l54gD2LW6t3t8gtr8.INSTANCE);
    }
}
