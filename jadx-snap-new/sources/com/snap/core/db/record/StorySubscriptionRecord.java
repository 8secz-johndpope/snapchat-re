package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.api.column.IntegerEnumColumnAdapter;
import com.snap.core.db.column.CardType;
import com.snap.core.db.record.StorySubscriptionModel.Factory;

@AutoValue
public abstract class StorySubscriptionRecord implements StorySubscriptionModel {
    public static final Factory<StorySubscriptionRecord> FACTORY = new Factory(-$$Lambda$oOecQ27Iplh5mI9iSfJT-nNnBRQ.INSTANCE, new IntegerEnumColumnAdapter(CardType.class));
}
