package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.column.FeedSeenSequenceNumbersAdapter;
import com.snap.core.db.record.SeenSequenceNumbersModel.Factory;

@AutoValue
public abstract class SeenSequenceNumbersRecord implements SeenSequenceNumbersModel {
    public static final Factory<SeenSequenceNumbersRecord> FACTORY = new Factory(-$$Lambda$3pHNqluhkjXR829yRWktq-xSHbA.INSTANCE, new FeedSeenSequenceNumbersAdapter());
}
