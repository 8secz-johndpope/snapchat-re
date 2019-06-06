package com.snap.core.db.query;

import com.snap.core.db.column.GeofilterType;
import com.snap.core.db.record.GeofilterModel;
import com.snap.core.db.record.GeofilterModel.StaticGeofiltersCreator;
import com.snap.core.db.record.GeofilterModel.StaticGeofiltersModel;
import defpackage.ahyg.a;
import defpackage.akcf;
import defpackage.akcr;

final class LegacyGeofilterQueries$sam$com_snap_core_db_record_GeofilterModel_StaticGeofiltersCreator$0 implements StaticGeofiltersCreator {
    private final /* synthetic */ akcf function;

    LegacyGeofilterQueries$sam$com_snap_core_db_record_GeofilterModel_StaticGeofiltersCreator$0(akcf akcf) {
        this.function = akcf;
    }

    public final /* synthetic */ StaticGeofiltersModel create(long j, GeofilterType geofilterType, String str, long j2, long j3, boolean z, a aVar, boolean z2) {
        GeofilterType geofilterType2 = geofilterType;
        akcr.b(geofilterType, GeofilterModel.FILTERTYPE);
        String str2 = str;
        akcr.b(str, GeofilterModel.FILTERIMAGEURL);
        return (StaticGeofiltersModel) this.function.invoke(Long.valueOf(j), geofilterType2, str2, Long.valueOf(j2), Long.valueOf(j3), Boolean.valueOf(z), aVar, Boolean.valueOf(z2));
    }
}
