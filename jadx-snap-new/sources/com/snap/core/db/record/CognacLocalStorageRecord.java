package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.record.CognacLocalStorageModel.Factory;
import defpackage.ainw;

@AutoValue
public abstract class CognacLocalStorageRecord implements CognacLocalStorageModel {
    public static final Factory<CognacLocalStorageRecord> FACTORY;
    public static final ainw<CognacLocalStorageRecord> SELECT_BY_APP_ID_AND_KEY_MAPPER;
    public static final ainw<CognacLocalStorageRecord> SELECT_BY_APP_ID_MAPPER = FACTORY.selectDataForAppIdMapper();

    static {
        Factory factory = new Factory(-$$Lambda$_3O6CqyKtFA8UqkPknBJXrwZTM4.INSTANCE);
        FACTORY = factory;
        SELECT_BY_APP_ID_AND_KEY_MAPPER = factory.selectDataMapper();
    }
}
