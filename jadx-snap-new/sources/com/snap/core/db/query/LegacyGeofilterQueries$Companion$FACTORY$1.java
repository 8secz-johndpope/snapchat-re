package com.snap.core.db.query;

import com.snap.core.db.column.GeofilterType;
import defpackage.ahyg.a;
import defpackage.akcf;
import defpackage.akcq;
import defpackage.akde;
import defpackage.akej;

final class LegacyGeofilterQueries$Companion$FACTORY$1 extends akcq implements akcf<Long, GeofilterType, String, Long, Long, Boolean, Boolean, a, AutoValue_LegacyGeofilterQueries> {
    public static final LegacyGeofilterQueries$Companion$FACTORY$1 INSTANCE = new LegacyGeofilterQueries$Companion$FACTORY$1();

    LegacyGeofilterQueries$Companion$FACTORY$1() {
        super(8);
    }

    public final String getName() {
        return "<init>";
    }

    public final akej getOwner() {
        return akde.a(AutoValue_LegacyGeofilterQueries.class);
    }

    public final String getSignature() {
        return "<init>(JLcom/snap/core/db/column/GeofilterType;Ljava/lang/String;JJZZLcom/snapchat/soju/android/unlockables/AutoStacking$AutoStackType;)V";
    }

    public final AutoValue_LegacyGeofilterQueries invoke(long j, GeofilterType geofilterType, String str, long j2, long j3, boolean z, boolean z2, a aVar) {
        return new AutoValue_LegacyGeofilterQueries(j, geofilterType, str, j2, j3, z, z2, aVar);
    }
}
