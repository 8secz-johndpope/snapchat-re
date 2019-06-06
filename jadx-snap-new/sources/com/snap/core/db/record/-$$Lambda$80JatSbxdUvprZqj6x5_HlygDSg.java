package com.snap.core.db.record;

import com.snap.core.db.record.FeedModel.SelectReadWriteInfoCreator;
import com.snap.core.db.record.FeedModel.SelectReadWriteInfoModel;
import defpackage.gcp;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$80JatSbxdUvprZqj6x5_HlygDSg implements SelectReadWriteInfoCreator {
    public static final /* synthetic */ -$$Lambda$80JatSbxdUvprZqj6x5_HlygDSg INSTANCE = new -$$Lambda$80JatSbxdUvprZqj6x5_HlygDSg();

    private /* synthetic */ -$$Lambda$80JatSbxdUvprZqj6x5_HlygDSg() {
    }

    public final SelectReadWriteInfoModel create(long j, Long l, Long l2, String str, Long l3, Long l4, String str2, String str3, long j2, String str4, Long l5, long j3, Long l6, gcp gcp, Long l7, Long l8, Boolean bool) {
        return new AutoValue_FeedRecord_ReadWriteTimeInfo(j, l, l2, str, l3, l4, str2, str3, j2, str4, l5, j3, l6, gcp, l7, l8, bool);
    }
}
