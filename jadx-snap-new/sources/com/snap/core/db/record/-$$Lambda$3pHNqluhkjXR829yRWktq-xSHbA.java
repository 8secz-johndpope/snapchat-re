package com.snap.core.db.record;

import com.snap.core.db.column.FeedSeenSequenceNumbers;
import com.snap.core.db.record.SeenSequenceNumbersModel.Creator;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$3pHNqluhkjXR829yRWktq-xSHbA implements Creator {
    public static final /* synthetic */ -$$Lambda$3pHNqluhkjXR829yRWktq-xSHbA INSTANCE = new -$$Lambda$3pHNqluhkjXR829yRWktq-xSHbA();

    private /* synthetic */ -$$Lambda$3pHNqluhkjXR829yRWktq-xSHbA() {
    }

    public final SeenSequenceNumbersModel create(long j, long j2, FeedSeenSequenceNumbers feedSeenSequenceNumbers) {
        return new AutoValue_SeenSequenceNumbersRecord(j, j2, feedSeenSequenceNumbers);
    }
}
