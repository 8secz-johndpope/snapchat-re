package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.record.CognacRVModel.Factory;
import defpackage.ainw;

@AutoValue
public abstract class CognacRVRecord implements CognacRVModel {
    public static final Factory<CognacRVRecord> FACTORY;
    public static final ainw<CognacRVRecord> SELECT_BY_APP_ID_MAPPER;

    static {
        Factory factory = new Factory(-$$Lambda$fj5b6SCpJL0fdFPZfGZxwaGVcNI.INSTANCE);
        FACTORY = factory;
        SELECT_BY_APP_ID_MAPPER = factory.selectRVForAppIdMapper();
    }
}
