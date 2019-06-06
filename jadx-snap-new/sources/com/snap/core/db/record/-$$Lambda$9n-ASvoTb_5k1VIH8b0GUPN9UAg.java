package com.snap.core.db.record;

import com.snap.core.db.record.NetworkMessageModel.GetMessagesYetToBeReleasedUpToAndIncludingSequenceNumberCreator;
import com.snap.core.db.record.NetworkMessageModel.GetMessagesYetToBeReleasedUpToAndIncludingSequenceNumberModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$9n-ASvoTb_5k1VIH8b0GUPN9UAg implements GetMessagesYetToBeReleasedUpToAndIncludingSequenceNumberCreator {
    public static final /* synthetic */ -$$Lambda$9n-ASvoTb_5k1VIH8b0GUPN9UAg INSTANCE = new -$$Lambda$9n-ASvoTb_5k1VIH8b0GUPN9UAg();

    private /* synthetic */ -$$Lambda$9n-ASvoTb_5k1VIH8b0GUPN9UAg() {
    }

    public final GetMessagesYetToBeReleasedUpToAndIncludingSequenceNumberModel create(String str, String str2) {
        return new AutoValue_NetworkMessageRecord_UnreleasedMessagesWithType(str, str2);
    }
}
