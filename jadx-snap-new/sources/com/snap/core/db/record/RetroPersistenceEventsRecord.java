package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.api.column.IntegerEnumColumnAdapter;
import com.snap.core.db.column.RetroEventsCategory;
import com.snap.core.db.record.RetroPersistenceEventsModel.Creator;
import com.snap.core.db.record.RetroPersistenceEventsModel.Factory;
import com.snap.core.db.record.RetroPersistenceEventsModel.GetEventOfIdCreator;
import com.snap.core.db.record.RetroPersistenceEventsModel.GetEventOfIdModel;
import defpackage.ainw;
import defpackage.akce;
import defpackage.akco;
import defpackage.akcr;

@AutoValue
public abstract class RetroPersistenceEventsRecord implements RetroPersistenceEventsModel {
    public static final Companion Companion = new Companion();
    private static final Factory<RetroPersistenceEventsRecord> FACTORY;
    private static final ainw<GetEventOfIdImpl> GET_EVENT_OF_ID_MAPPER;
    private static final IntegerEnumColumnAdapter<RetroEventsCategory> RETRO_EVENTS_CATEGORY_COLUMN_ADAPTER = new IntegerEnumColumnAdapter(RetroEventsCategory.class);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final Factory<RetroPersistenceEventsRecord> getFACTORY() {
            return RetroPersistenceEventsRecord.FACTORY;
        }

        public final ainw<GetEventOfIdImpl> getGET_EVENT_OF_ID_MAPPER() {
            return RetroPersistenceEventsRecord.GET_EVENT_OF_ID_MAPPER;
        }
    }

    @AutoValue
    public static abstract class GetEventOfIdImpl implements GetEventOfIdModel {
    }

    static {
        akce akce = RetroPersistenceEventsRecord$Companion$FACTORY$1.INSTANCE;
        if (akce != null) {
            akce = new RetroPersistenceEventsRecord$sam$com_snap_core_db_record_RetroPersistenceEventsModel_Creator$0(akce);
        }
        Factory factory = new Factory((Creator) akce, RETRO_EVENTS_CATEGORY_COLUMN_ADAPTER);
        FACTORY = factory;
        akce = RetroPersistenceEventsRecord$Companion$GET_EVENT_OF_ID_MAPPER$1.INSTANCE;
        if (akce != null) {
            akce = new RetroPersistenceEventsRecord$sam$com_snap_core_db_record_RetroPersistenceEventsModel_GetEventOfIdCreator$0(akce);
        }
        Object eventOfIdMapper = factory.getEventOfIdMapper((GetEventOfIdCreator) akce);
        akcr.a(eventOfIdMapper, "FACTORY.getEventOfIdMapp…sRecord_GetEventOfIdImpl)");
        GET_EVENT_OF_ID_MAPPER = (ainw) eventOfIdMapper;
    }
}
