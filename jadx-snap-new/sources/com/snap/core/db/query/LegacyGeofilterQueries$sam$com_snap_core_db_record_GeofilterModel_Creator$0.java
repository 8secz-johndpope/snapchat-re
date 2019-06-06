package com.snap.core.db.query;

import com.snap.core.db.column.GeofilterType;
import com.snap.core.db.record.GeofilterModel;
import com.snap.core.db.record.GeofilterModel.Creator;
import defpackage.ahyg.a;
import defpackage.akcf;
import defpackage.akcr;

final class LegacyGeofilterQueries$sam$com_snap_core_db_record_GeofilterModel_Creator$0 implements Creator {
    private final /* synthetic */ akcf function;

    LegacyGeofilterQueries$sam$com_snap_core_db_record_GeofilterModel_Creator$0(akcf akcf) {
        this.function = akcf;
    }

    public final /* synthetic */ GeofilterModel create(long j, GeofilterType geofilterType, String str, long j2, long j3, boolean z, boolean z2, a aVar) {
        GeofilterType geofilterType2 = geofilterType;
        akcr.b(geofilterType, GeofilterModel.FILTERTYPE);
        String str2 = str;
        akcr.b(str, GeofilterModel.FILTERIMAGEURL);
        return (GeofilterModel) this.function.invoke(Long.valueOf(j), geofilterType2, str2, Long.valueOf(j2), Long.valueOf(j3), Boolean.valueOf(z), Boolean.valueOf(z2), aVar);
    }
}
