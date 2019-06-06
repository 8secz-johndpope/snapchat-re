package com.snap.core.db.record;

import com.snap.core.db.column.FeedKind;
import com.snap.core.db.record.MessagingSnapModel.GetDirectSnapInfoBySnapRowIDCreator;
import com.snap.core.db.record.MessagingSnapModel.GetDirectSnapInfoBySnapRowIDModel;
import defpackage.gcp;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$G0zPCyj2OVciZ9A1t6jtEUb9F2s implements GetDirectSnapInfoBySnapRowIDCreator {
    public static final /* synthetic */ -$$Lambda$G0zPCyj2OVciZ9A1t6jtEUb9F2s INSTANCE = new -$$Lambda$G0zPCyj2OVciZ9A1t6jtEUb9F2s();

    private /* synthetic */ -$$Lambda$G0zPCyj2OVciZ9A1t6jtEUb9F2s() {
    }

    public final GetDirectSnapInfoBySnapRowIDModel create(Long l, String str, String str2, Long l2, Long l3, long j, gcp gcp, boolean z, long j2, FeedKind feedKind, String str3) {
        return new AutoValue_MessagingSnapRecord_SnapOperaChromeInfo(l, str, str2, l2, l3, j, gcp, z, j2, feedKind, str3);
    }
}
