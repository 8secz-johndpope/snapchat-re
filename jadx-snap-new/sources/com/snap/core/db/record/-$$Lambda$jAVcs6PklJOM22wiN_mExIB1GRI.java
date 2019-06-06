package com.snap.core.db.record;

import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.NetworkMessageModel.GetIdAndTypeForMessageIdCreator;
import com.snap.core.db.record.NetworkMessageModel.GetIdAndTypeForMessageIdModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$jAVcs6PklJOM22wiN_mExIB1GRI implements GetIdAndTypeForMessageIdCreator {
    public static final /* synthetic */ -$$Lambda$jAVcs6PklJOM22wiN_mExIB1GRI INSTANCE = new -$$Lambda$jAVcs6PklJOM22wiN_mExIB1GRI();

    private /* synthetic */ -$$Lambda$jAVcs6PklJOM22wiN_mExIB1GRI() {
    }

    public final GetIdAndTypeForMessageIdModel create(long j, String str, SnapServerStatus snapServerStatus) {
        return new AutoValue_NetworkMessageRecord_IdAndTypeForMessageId(j, str, snapServerStatus);
    }
}
