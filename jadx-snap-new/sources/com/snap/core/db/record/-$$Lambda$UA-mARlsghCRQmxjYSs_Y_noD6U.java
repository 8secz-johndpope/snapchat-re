package com.snap.core.db.record;

import com.snap.core.db.column.FeedKind;
import com.snap.core.db.column.GeofilterMetadata;
import com.snap.core.db.record.MessagingSnapModel.GetPlayableSnapsByMessageRowIdCreator;
import com.snap.core.db.record.MessagingSnapModel.GetPlayableSnapsByMessageRowIdModel;
import defpackage.gcp;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$UA-mARlsghCRQmxjYSs_Y_noD6U implements GetPlayableSnapsByMessageRowIdCreator {
    public static final /* synthetic */ -$$Lambda$UA-mARlsghCRQmxjYSs_Y_noD6U INSTANCE = new -$$Lambda$UA-mARlsghCRQmxjYSs_Y_noD6U();

    private /* synthetic */ -$$Lambda$UA-mARlsghCRQmxjYSs_Y_noD6U() {
    }

    public final GetPlayableSnapsByMessageRowIdModel create(String str, long j, String str2, String str3, String str4, gcp gcp, String str5, long j2, Boolean bool, boolean z, Long l, String str6, String str7, String str8, GeofilterMetadata geofilterMetadata, FeedKind feedKind) {
        return new AutoValue_MessagingSnapRecord_PlayableSnap(str, j, str2, str3, str4, gcp, str5, j2, bool, z, l, str6, str7, str8, geofilterMetadata, feedKind);
    }
}
