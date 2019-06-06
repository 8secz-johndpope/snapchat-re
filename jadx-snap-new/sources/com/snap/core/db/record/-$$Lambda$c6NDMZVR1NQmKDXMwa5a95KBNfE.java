package com.snap.core.db.record;

import com.snap.core.db.column.FeatureType;
import com.snap.core.db.column.PublisherPageSnapType;
import com.snap.core.db.record.PublisherSnapPageModel.Creator;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$c6NDMZVR1NQmKDXMwa5a95KBNfE implements Creator {
    public static final /* synthetic */ -$$Lambda$c6NDMZVR1NQmKDXMwa5a95KBNfE INSTANCE = new -$$Lambda$c6NDMZVR1NQmKDXMwa5a95KBNfE();

    private /* synthetic */ -$$Lambda$c6NDMZVR1NQmKDXMwa5a95KBNfE() {
    }

    public final PublisherSnapPageModel create(long j, long j2, String str, long j3, long j4, String str2, String str3, PublisherPageSnapType publisherPageSnapType, String str4, String str5, Long l, String str6, boolean z, boolean z2, boolean z3, String str7, FeatureType featureType, Long l2, String str8, long j5, long j6, String str9, String str10, String str11, Long l3, String str12, Long l4, String str13, Long l5, Long l6) {
        return new AutoValue_PublisherSnapPageRecord(j, j2, str, j3, j4, str2, str3, publisherPageSnapType, str4, str5, l, str6, z, z2, z3, str7, featureType, l2, str8, j5, j6, str9, str10, str11, l3, str12, l4, str13, l5, l6);
    }
}
