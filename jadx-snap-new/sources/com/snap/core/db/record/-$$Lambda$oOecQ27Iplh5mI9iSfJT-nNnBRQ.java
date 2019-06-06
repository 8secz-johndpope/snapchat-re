package com.snap.core.db.record;

import com.snap.core.db.column.CardType;
import com.snap.core.db.record.StorySubscriptionModel.Creator;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$oOecQ27Iplh5mI9iSfJT-nNnBRQ implements Creator {
    public static final /* synthetic */ -$$Lambda$oOecQ27Iplh5mI9iSfJT-nNnBRQ INSTANCE = new -$$Lambda$oOecQ27Iplh5mI9iSfJT-nNnBRQ();

    private /* synthetic */ -$$Lambda$oOecQ27Iplh5mI9iSfJT-nNnBRQ() {
    }

    public final StorySubscriptionModel create(long j, String str, Boolean bool, CardType cardType, long j2, Boolean bool2) {
        return new AutoValue_StorySubscriptionRecord(j, str, bool, cardType, j2, bool2);
    }
}
