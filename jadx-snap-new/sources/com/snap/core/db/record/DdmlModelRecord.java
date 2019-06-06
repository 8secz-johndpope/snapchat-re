package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.column.DdmlModelSepcAndParamsColumnAdapter;
import com.snap.core.db.record.DdmlModelModel.Factory;
import defpackage.adsy;
import defpackage.ainu;
import defpackage.ainw;

@AutoValue
public abstract class DdmlModelRecord implements DdmlModelModel {
    private static final ainu<adsy, byte[]> DDML_MODEL_SPEC_AND_PARAMS_ADAPTER = new DdmlModelSepcAndParamsColumnAdapter();
    public static final Factory<DdmlModelRecord> FACTORY;
    public static final ainw<adsy> MODEL_SPEC_AND_PARAMS;
    public static final ainw<Long> TIMESTAMP = FACTORY.getTimestampMapper();

    static {
        Factory factory = new Factory(-$$Lambda$fnTNYTDouYotjUdnCmiVYhfShn4.INSTANCE, DDML_MODEL_SPEC_AND_PARAMS_ADAPTER);
        FACTORY = factory;
        MODEL_SPEC_AND_PARAMS = factory.getModelSpecAndParamsMapper();
    }
}
