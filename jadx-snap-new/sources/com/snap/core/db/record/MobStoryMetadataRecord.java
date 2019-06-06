package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.column.MobStoryTypeColumnAdapter;
import com.snap.core.db.column.MobStoryTypeExtraDataColumnAdapter;
import com.snap.core.db.column.MobStoryUserWithAdditionalAbilitiesColumnAdapter;
import com.snap.core.db.record.MobStoryMetadataModel.Creator;
import com.snap.core.db.record.MobStoryMetadataModel.Factory;
import com.snap.core.db.record.MobStoryMetadataModel.SelectMobStoryMetadataCreator;
import com.snap.core.db.record.MobStoryMetadataModel.SelectMobStoryMetadataModel;
import defpackage.ainw;
import defpackage.akbo;
import defpackage.akco;
import defpackage.akcr;

@AutoValue
public abstract class MobStoryMetadataRecord implements MobStoryMetadataModel {
    public static final Companion Companion = new Companion();
    private static final Factory<MobStoryMetadataRecord> FACTORY;
    private static final ainw<SelectMobStoryMetadataRecord> SELECT_MOB_STORY_METADATA_ROW_MAPPER;
    private static final MobStoryTypeColumnAdapter STORY_TYPE_COLUMN_ADAPTER = new MobStoryTypeColumnAdapter();
    private static final MobStoryTypeExtraDataColumnAdapter TYPE_EXTRA_DATA_COLUMN_ADAPTER = new MobStoryTypeExtraDataColumnAdapter();
    private static final MobStoryUserWithAdditionalAbilitiesColumnAdapter USER_WITH_ADDITIONAL_ABILITIES_COLUMN_MAPPER = new MobStoryUserWithAdditionalAbilitiesColumnAdapter();

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public static /* synthetic */ void FACTORY$annotations() {
        }

        public final Factory<MobStoryMetadataRecord> getFACTORY() {
            return MobStoryMetadataRecord.FACTORY;
        }

        public final ainw<SelectMobStoryMetadataRecord> getSELECT_MOB_STORY_METADATA_ROW_MAPPER() {
            return MobStoryMetadataRecord.SELECT_MOB_STORY_METADATA_ROW_MAPPER;
        }
    }

    @AutoValue
    public static abstract class SelectMobStoryMetadataRecord implements SelectMobStoryMetadataModel {
    }

    static {
        akbo akbo = MobStoryMetadataRecord$Companion$FACTORY$1.INSTANCE;
        if (akbo != null) {
            akbo = new MobStoryMetadataRecord$sam$com_snap_core_db_record_MobStoryMetadataModel_Creator$0(akbo);
        }
        Factory factory = new Factory((Creator) akbo, STORY_TYPE_COLUMN_ADAPTER, TYPE_EXTRA_DATA_COLUMN_ADAPTER, USER_WITH_ADDITIONAL_ABILITIES_COLUMN_MAPPER);
        FACTORY = factory;
        akbo = MobStoryMetadataRecord$Companion$SELECT_MOB_STORY_METADATA_ROW_MAPPER$1.INSTANCE;
        if (akbo != null) {
            akbo = new MobStoryMetadataRecord$sam$com_snap_core_db_record_MobStoryMetadataModel_SelectMobStoryMetadataCreator$0(akbo);
        }
        Object selectMobStoryMetadataMapper = factory.selectMobStoryMetadataMapper((SelectMobStoryMetadataCreator) akbo);
        akcr.a(selectMobStoryMetadataMapper, "FACTORY.selectMobStoryMe…ctMobStoryMetadataRecord)");
        SELECT_MOB_STORY_METADATA_ROW_MAPPER = (ainw) selectMobStoryMetadataMapper;
    }

    public static final Factory<MobStoryMetadataRecord> getFACTORY() {
        return FACTORY;
    }
}
