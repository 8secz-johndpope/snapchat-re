package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.api.column.IntegerEnumColumnAdapter;
import com.snap.core.db.column.PersistableUnlockableType;
import com.snap.core.db.column.UnlockMechanism;
import com.snap.core.db.record.UnlockablesModel.Creator;
import com.snap.core.db.record.UnlockablesModel.Factory;
import com.snap.core.db.record.UnlockablesModel.SelectAllFromUnlockablesCreator;
import com.snap.core.db.record.UnlockablesModel.SelectAllFromUnlockablesModel;
import com.snap.core.db.record.UnlockablesModel.SelectByTypeCreator;
import com.snap.core.db.record.UnlockablesModel.SelectByTypeModel;
import com.snap.core.db.record.UnlockablesModel.SelectChecksumCreator;
import com.snap.core.db.record.UnlockablesModel.SelectChecksumModel;
import defpackage.ainw;
import defpackage.akbp;
import defpackage.akbw;
import defpackage.akce;
import defpackage.akcf;
import defpackage.akco;
import defpackage.akcr;

@AutoValue
public abstract class UnlockablesRecord implements UnlockablesModel {
    private static final ainw<BasicUnlockable> BASIC_UNLOCKABLE_MAPPER;
    public static final Companion Companion = new Companion();
    private static final Factory<UnlockablesRecord> FACTORY;
    private static final UnlockablesRecord$Companion$GEOFENCE_ADAPTER$1 GEOFENCE_ADAPTER = new UnlockablesRecord$Companion$GEOFENCE_ADAPTER$1();
    private static final ainw<SimpleUnlockable> SIMPLE_UNLOCKABLE_MAPPER;
    private static final IntegerEnumColumnAdapter<PersistableUnlockableType> UNLOCKABLES_TYPE_COLUMN_ADAPTER = new IntegerEnumColumnAdapter(PersistableUnlockableType.class);
    private static final ainw<UnlockableChecksum> UNLOCKABLE_CHECKSUM_MAPPER;
    private static final IntegerEnumColumnAdapter<UnlockMechanism> UNLOCK_MECHANISM_COLUMN_ADAPTER = new IntegerEnumColumnAdapter(UnlockMechanism.class);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final ainw<BasicUnlockable> getBASIC_UNLOCKABLE_MAPPER() {
            return UnlockablesRecord.BASIC_UNLOCKABLE_MAPPER;
        }

        public final Factory<UnlockablesRecord> getFACTORY() {
            return UnlockablesRecord.FACTORY;
        }

        public final ainw<SimpleUnlockable> getSIMPLE_UNLOCKABLE_MAPPER() {
            return UnlockablesRecord.SIMPLE_UNLOCKABLE_MAPPER;
        }

        public final ainw<UnlockableChecksum> getUNLOCKABLE_CHECKSUM_MAPPER() {
            return UnlockablesRecord.UNLOCKABLE_CHECKSUM_MAPPER;
        }
    }

    @AutoValue
    public static abstract class SimpleUnlockable implements SelectAllFromUnlockablesModel {
    }

    @AutoValue
    public static abstract class UnlockableChecksum implements SelectChecksumModel {
    }

    @AutoValue
    public static abstract class BasicUnlockable implements SelectByTypeModel {
    }

    static {
        akbp akbp = UnlockablesRecord$Companion$FACTORY$1.INSTANCE;
        if (akbp != null) {
            akbp = new UnlockablesRecord$sam$com_snap_core_db_record_UnlockablesModel_Creator$0(akbp);
        }
        Factory factory = new Factory((Creator) akbp, UNLOCKABLES_TYPE_COLUMN_ADAPTER, UNLOCK_MECHANISM_COLUMN_ADAPTER, GEOFENCE_ADAPTER);
        FACTORY = factory;
        akcf akcf = UnlockablesRecord$Companion$BASIC_UNLOCKABLE_MAPPER$1.INSTANCE;
        if (akcf != null) {
            akcf = new UnlockablesRecord$sam$com_snap_core_db_record_UnlockablesModel_SelectByTypeCreator$0(akcf);
        }
        Object selectByTypeMapper = factory.selectByTypeMapper((SelectByTypeCreator) akcf);
        akcr.a(selectByTypeMapper, "FACTORY.selectByTypeMapp…esRecord_BasicUnlockable)");
        BASIC_UNLOCKABLE_MAPPER = (ainw) selectByTypeMapper;
        factory = FACTORY;
        akce akce = UnlockablesRecord$Companion$SIMPLE_UNLOCKABLE_MAPPER$1.INSTANCE;
        if (akce != null) {
            akce = new UnlockablesRecord$sam$com_snap_core_db_record_UnlockablesModel_SelectAllFromUnlockablesCreator$0(akce);
        }
        selectByTypeMapper = factory.selectAllFromUnlockablesMapper((SelectAllFromUnlockablesCreator) akce);
        akcr.a(selectByTypeMapper, "FACTORY.selectAllFromUnl…sRecord_SimpleUnlockable)");
        SIMPLE_UNLOCKABLE_MAPPER = (ainw) selectByTypeMapper;
        factory = FACTORY;
        akbw akbw = UnlockablesRecord$Companion$UNLOCKABLE_CHECKSUM_MAPPER$1.INSTANCE;
        if (akbw != null) {
            akbw = new UnlockablesRecord$sam$com_snap_core_db_record_UnlockablesModel_SelectChecksumCreator$0(akbw);
        }
        selectByTypeMapper = factory.selectChecksumMapper((SelectChecksumCreator) akbw);
        akcr.a(selectByTypeMapper, "FACTORY.selectChecksumMa…ecord_UnlockableChecksum)");
        UNLOCKABLE_CHECKSUM_MAPPER = (ainw) selectByTypeMapper;
    }
}
