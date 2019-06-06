package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.record.StorySyncStateModel.Factory;
import defpackage.ainw;

@AutoValue
public abstract class StorySyncStateRecord implements StorySyncStateModel {
    public static final Factory<StorySyncStateRecord> FACTORY;
    public static final ainw<StorySyncStateRecord> GET_VALUE_MAPPER;

    static {
        Factory factory = new Factory(-$$Lambda$12705Zfz5IqktUDQdBgCGGWiWaY.INSTANCE);
        FACTORY = factory;
        GET_VALUE_MAPPER = factory.getRecordMapper();
    }
}
