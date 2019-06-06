package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.record.TalkAuthContextModel.Factory;
import com.snap.core.db.record.TalkAuthContextModel.SelectAllFromTalkAuthContextModel;
import com.snap.core.db.record.TalkAuthContextModel.SelectTalkAuthContextModel;
import defpackage.ainw;

@AutoValue
public abstract class TalkAuthContextRecord implements TalkAuthContextModel, SelectAllFromTalkAuthContextModel {
    public static final Factory<TalkAuthContextRecord> FACTORY;
    public static final ainw<TalkAuthContextRecord> SELECT_ALL_MAPPER = FACTORY.selectAllFromTalkAuthContextMapper(-$$Lambda$E6Ac-OsftKUN-oFEcxgiz7Nefs0.INSTANCE);
    public static final ainw<BasicTalkAuth> SELECT_MAPPER;

    @AutoValue
    public static abstract class BasicTalkAuth implements SelectTalkAuthContextModel {
    }

    static {
        Factory factory = new Factory(-$$Lambda$3sRBqdxY84qwN0wjqXj6etcYey8.INSTANCE);
        FACTORY = factory;
        SELECT_MAPPER = factory.selectTalkAuthContextMapper(-$$Lambda$PB_kSrpIclHvS-8LW--ZMFdaO3o.INSTANCE);
    }
}
