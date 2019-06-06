package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.record.SequenceNumbersModel.Factory;
import com.snap.core.db.record.SequenceNumbersModel.SelectSequenceNumbersForDeltaModel;
import com.snap.core.db.record.SequenceNumbersModel.SelectSequenceNumbersForDeltaMultipleModel;
import defpackage.ainw;

@AutoValue
public abstract class SequenceNumbersRecord implements SequenceNumbersModel {
    public static final Factory<SequenceNumbersRecord> FACTORY;
    public static final ainw<ForDelta> FOR_DELTA_ROW_MAPPER;
    public static final ainw<ForMultipleDelta> FOR_MULTIPLE_DELTA_ROW_MAPPER = FACTORY.selectSequenceNumbersForDeltaMultipleMapper(-$$Lambda$3k1Tx7X6j0xIiw7Ju_ei1BiEMK0.INSTANCE);

    @AutoValue
    public static abstract class ForDelta implements SelectSequenceNumbersForDeltaModel<SequenceNumbersRecord> {
    }

    @AutoValue
    public static abstract class ForMultipleDelta implements SelectSequenceNumbersForDeltaMultipleModel {
    }

    static {
        Factory factory = new Factory(-$$Lambda$ygflC3H4ywNDl0cPzFPvK6NU_P4.INSTANCE);
        FACTORY = factory;
        FOR_DELTA_ROW_MAPPER = factory.selectSequenceNumbersForDeltaMapper(-$$Lambda$oPzODBMsBTeTs0kla_vQuePj15s.INSTANCE, FeedRecord.FACTORY);
    }
}
