package com.snap.core.db.record;

import com.snap.core.db.record.MessageModel.GetSnapsOlderThanTimestampCreator;
import com.snap.core.db.record.MessageModel.GetSnapsOlderThanTimestampModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$Dy65SnQAZd9Lfk1Ja1Uwc-Pz2V0 implements GetSnapsOlderThanTimestampCreator {
    public static final /* synthetic */ -$$Lambda$Dy65SnQAZd9Lfk1Ja1Uwc-Pz2V0 INSTANCE = new -$$Lambda$Dy65SnQAZd9Lfk1Ja1Uwc-Pz2V0();

    private /* synthetic */ -$$Lambda$Dy65SnQAZd9Lfk1Ja1Uwc-Pz2V0() {
    }

    public final GetSnapsOlderThanTimestampModel create(String str, Long l) {
        return new AutoValue_MessageRecord_GetUnviewedSnapIdsOlderThanTimestamp(str, l);
    }
}
