package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import defpackage.ainw;
import defpackage.mpp;
import defpackage.mpp.b;
import defpackage.mpp.e;
import defpackage.mpp.f;
import defpackage.mpp.h;
import defpackage.mpp.i;

@AutoValue
public abstract class LensStatisticsStorageRecord implements mpp {
    public static final b<LensStatisticsStorageRecord> FACTORY = new b(-$$Lambda$kA4Bjfk5-m9aBNoKjJZ_SmXJWp8.INSTANCE);
    public static final ainw<ImpressionsRecord> SELECT_IMPRESSIONS_BY_ID_MAPPER = new h(-$$Lambda$UwBV-86v_JsuYD0QNTCoeS72dvs.INSTANCE);
    public static final ainw<ImpressionsRecord> SELECT_IMPRESSIONS_MAPPER = new e(-$$Lambda$Ke-3KGs59NiApNhI3ZMJPZ301rc.INSTANCE);

    @AutoValue
    public static abstract class ImpressionsRecord implements f, i {
        public static ImpressionsRecord create(String str, int i) {
            return new AutoValue_LensStatisticsStorageRecord_ImpressionsRecord(str, i);
        }
    }
}
