package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.record.ConfigEtagModel.Factory;
import defpackage.ainw;

@AutoValue
public abstract class ConfigEtagRecord implements ConfigEtagModel {
    public static final Factory<ConfigEtagRecord> FACTORY;
    public static final ainw<String> MAPPER;

    static {
        Factory factory = new Factory(-$$Lambda$GP8oIfbc99gFw6Wh_p-p00z56Ns.INSTANCE);
        FACTORY = factory;
        MAPPER = factory.getEtagMapper();
    }
}
