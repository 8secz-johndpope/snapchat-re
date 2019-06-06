package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.column.DdmlRecord;
import com.snap.core.db.column.DdmlRecordColumnAdapter;
import com.snap.core.db.record.DdmlDataModel.Factory;
import defpackage.ainu;
import defpackage.ainw;

@AutoValue
public abstract class DdmlDataRecord implements DdmlDataModel {
    public static final ainw<String> DATAIDS = FACTORY.getDataIdsMapper();
    private static final ainu<DdmlRecord, String> DDML_RECORD_ADAPTER = new DdmlRecordColumnAdapter();
    public static final Factory<DdmlDataRecord> FACTORY;
    public static final ainw<Long> NUM_ROWS = FACTORY.numRowsForDataIdMapper();
    public static final ainw<DdmlDataRecord> SELECT_FOR_DATA_ID;
    public static final ainw<Long> TIMESTAMP = FACTORY.getOldestRecordTimestampMapper();

    static {
        Factory factory = new Factory(-$$Lambda$pMXm8BF2Otoq5ETzEjKtymRhTGE.INSTANCE, DDML_RECORD_ADAPTER);
        FACTORY = factory;
        SELECT_FOR_DATA_ID = factory.selectForDataIdMapper();
    }
}
