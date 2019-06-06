package com.snap.core.db.record;

import com.snap.core.db.column.AdType;
import com.snap.core.db.column.FeatureType;
import com.snap.core.db.record.PromotedStorySnapModel.Creator;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$3dCKwxRK8Gfmr11w_SaJM2ZXCbM implements Creator {
    public static final /* synthetic */ -$$Lambda$3dCKwxRK8Gfmr11w_SaJM2ZXCbM INSTANCE = new -$$Lambda$3dCKwxRK8Gfmr11w_SaJM2ZXCbM();

    private /* synthetic */ -$$Lambda$3dCKwxRK8Gfmr11w_SaJM2ZXCbM() {
    }

    public final PromotedStorySnapModel create(long j, String str, String str2, long j2, FeatureType featureType, String str3, Long l, String str4, String str5, String str6, AdType adType, long j3, String str7) {
        return new AutoValue_PromotedStorySnapRecord(j, str, str2, j2, featureType, str3, l, str4, str5, str6, adType, j3, str7);
    }
}
