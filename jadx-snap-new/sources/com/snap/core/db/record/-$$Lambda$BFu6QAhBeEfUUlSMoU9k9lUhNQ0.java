package com.snap.core.db.record;

import com.snap.core.db.record.MessagingSnapModel.GetDirectSnapsOlderThanTimestampCreator;
import com.snap.core.db.record.MessagingSnapModel.GetDirectSnapsOlderThanTimestampModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$BFu6QAhBeEfUUlSMoU9k9lUhNQ0 implements GetDirectSnapsOlderThanTimestampCreator {
    public static final /* synthetic */ -$$Lambda$BFu6QAhBeEfUUlSMoU9k9lUhNQ0 INSTANCE = new -$$Lambda$BFu6QAhBeEfUUlSMoU9k9lUhNQ0();

    private /* synthetic */ -$$Lambda$BFu6QAhBeEfUUlSMoU9k9lUhNQ0() {
    }

    public final GetDirectSnapsOlderThanTimestampModel create(String str, long j) {
        return new AutoValue_MessagingSnapRecord_DirectSnapsOlderThanTimestamp(str, j);
    }
}
