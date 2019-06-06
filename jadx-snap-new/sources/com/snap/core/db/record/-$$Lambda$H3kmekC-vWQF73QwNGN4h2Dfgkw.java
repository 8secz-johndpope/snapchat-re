package com.snap.core.db.record;

import com.snap.core.db.column.FeedKind;
import com.snap.core.db.column.GeofilterMetadata;
import com.snap.core.db.column.SnappableLensMetadata;
import com.snap.core.db.record.MessagingSnapModel.GetSnapMetadataForSnapIdCreator;
import com.snap.core.db.record.MessagingSnapModel.GetSnapMetadataForSnapIdModel;
import defpackage.gcp;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$H3kmekC-vWQF73QwNGN4h2Dfgkw implements GetSnapMetadataForSnapIdCreator {
    public static final /* synthetic */ -$$Lambda$H3kmekC-vWQF73QwNGN4h2Dfgkw INSTANCE = new -$$Lambda$H3kmekC-vWQF73QwNGN4h2Dfgkw();

    private /* synthetic */ -$$Lambda$H3kmekC-vWQF73QwNGN4h2Dfgkw() {
    }

    public final GetSnapMetadataForSnapIdModel create(String str, gcp gcp, Long l, Long l2, GeofilterMetadata geofilterMetadata, SnappableLensMetadata snappableLensMetadata, String str2, FeedKind feedKind, String str3, long j) {
        return new AutoValue_MessagingSnapRecord_SnapMetaData(str, gcp, l, l2, geofilterMetadata, snappableLensMetadata, str2, feedKind, str3, j);
    }
}
