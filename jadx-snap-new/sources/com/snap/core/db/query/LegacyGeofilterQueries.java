package com.snap.core.db.query;

import com.google.auto.value.AutoValue;
import com.snap.core.db.api.column.IntegerEnumColumnAdapter;
import com.snap.core.db.column.GeofilterType;
import com.snap.core.db.record.GeofilterModel;
import com.snap.core.db.record.GeofilterModel.Creator;
import com.snap.core.db.record.GeofilterModel.Factory;
import com.snap.core.db.record.GeofilterModel.StaticGeofiltersCreator;
import com.snap.core.db.record.GeofilterModel.StaticGeofiltersModel;
import defpackage.ainw;
import defpackage.akcf;
import defpackage.akco;
import defpackage.akcr;

@AutoValue
public abstract class LegacyGeofilterQueries implements GeofilterModel {
    public static final Companion Companion = new Companion();
    private static final Factory<LegacyGeofilterQueries> FACTORY;
    private static final AutoStackTypeColumnAdapter GEOFILTER_AUTO_STACK_CONTETNT_ADAPTER = new AutoStackTypeColumnAdapter();
    private static final IntegerEnumColumnAdapter<GeofilterType> GEOFILTER_TYPE_COLUMN_ADAPTER = new IntegerEnumColumnAdapter(GeofilterType.class);
    private static final ainw<StaticGeofilters> STATIC_GEOFILTERS_MAPPER;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final Factory<LegacyGeofilterQueries> getFACTORY() {
            return LegacyGeofilterQueries.FACTORY;
        }

        public final ainw<StaticGeofilters> getSTATIC_GEOFILTERS_MAPPER() {
            return LegacyGeofilterQueries.STATIC_GEOFILTERS_MAPPER;
        }
    }

    @AutoValue
    public static abstract class StaticGeofilters implements StaticGeofiltersModel {
    }

    static {
        akcf akcf = LegacyGeofilterQueries$Companion$FACTORY$1.INSTANCE;
        if (akcf != null) {
            akcf = new LegacyGeofilterQueries$sam$com_snap_core_db_record_GeofilterModel_Creator$0(akcf);
        }
        Factory factory = new Factory((Creator) akcf, GEOFILTER_TYPE_COLUMN_ADAPTER, GEOFILTER_AUTO_STACK_CONTETNT_ADAPTER);
        FACTORY = factory;
        akcf = LegacyGeofilterQueries$Companion$STATIC_GEOFILTERS_MAPPER$1.INSTANCE;
        if (akcf != null) {
            akcf = new LegacyGeofilterQueries$sam$com_snap_core_db_record_GeofilterModel_StaticGeofiltersCreator$0(akcf);
        }
        Object staticGeofiltersMapper = factory.staticGeofiltersMapper((StaticGeofiltersCreator) akcf);
        akcr.a(staticGeofiltersMapper, "FACTORY.staticGeofilters…Queries_StaticGeofilters)");
        STATIC_GEOFILTERS_MAPPER = (ainw) staticGeofiltersMapper;
    }
}
