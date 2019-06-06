package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.api.column.IntegerEnumColumnAdapter;
import com.snap.core.db.column.CharmDataSourceType;
import com.snap.core.db.column.CharmOwnerType;
import com.snap.core.db.record.CharmsModel.Creator;
import com.snap.core.db.record.CharmsModel.Factory;
import defpackage.ainu;
import defpackage.akby;
import defpackage.akco;

@AutoValue
public abstract class CharmsRecord implements CharmsModel {
    private static final ainu<CharmDataSourceType, Long> CHARM_DATASOURCE_TYPE_ADAPTER = new IntegerEnumColumnAdapter(CharmDataSourceType.class);
    private static final ainu<CharmOwnerType, Long> CHARM_OWNER_TYPE_ADAPTER = new IntegerEnumColumnAdapter(CharmOwnerType.class);
    public static final Companion Companion = new Companion();
    private static final Factory<CharmsRecord> FACTORY;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final Factory<CharmsRecord> getFACTORY() {
            return CharmsRecord.FACTORY;
        }
    }

    static {
        akby akby = CharmsRecord$Companion$FACTORY$1.INSTANCE;
        if (akby != null) {
            akby = new CharmsRecord$sam$com_snap_core_db_record_CharmsModel_Creator$0(akby);
        }
        FACTORY = new Factory((Creator) akby, CHARM_OWNER_TYPE_ADAPTER, CHARM_DATASOURCE_TYPE_ADAPTER);
    }
}
