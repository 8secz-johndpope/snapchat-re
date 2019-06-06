package com.snap.core.db.record;

import com.snap.core.db.record.FeedModel.GetGroupVersionsForKeysCreator;
import com.snap.core.db.record.FeedModel.GetGroupVersionsForKeysModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$B6EQPfxfhE08FQqYLKyxMeiePWg implements GetGroupVersionsForKeysCreator {
    public static final /* synthetic */ -$$Lambda$B6EQPfxfhE08FQqYLKyxMeiePWg INSTANCE = new -$$Lambda$B6EQPfxfhE08FQqYLKyxMeiePWg();

    private /* synthetic */ -$$Lambda$B6EQPfxfhE08FQqYLKyxMeiePWg() {
    }

    public final GetGroupVersionsForKeysModel create(String str, long j) {
        return new AutoValue_FeedRecord_GroupVersion(str, j);
    }
}
