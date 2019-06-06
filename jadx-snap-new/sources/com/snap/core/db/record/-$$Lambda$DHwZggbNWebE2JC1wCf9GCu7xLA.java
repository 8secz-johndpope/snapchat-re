package com.snap.core.db.record;

import com.snap.core.db.record.FeedModel.GetConversationStateCreator;
import com.snap.core.db.record.FeedModel.GetConversationStateModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$DHwZggbNWebE2JC1wCf9GCu7xLA implements GetConversationStateCreator {
    public static final /* synthetic */ -$$Lambda$DHwZggbNWebE2JC1wCf9GCu7xLA INSTANCE = new -$$Lambda$DHwZggbNWebE2JC1wCf9GCu7xLA();

    private /* synthetic */ -$$Lambda$DHwZggbNWebE2JC1wCf9GCu7xLA() {
    }

    public final GetConversationStateModel create(long j, String str, Long l, long j2, long j3, Boolean bool, boolean z, long j4, boolean z2) {
        return new AutoValue_FeedRecord_ConversationState(j, str, l, j2, j3, bool, z, j4, z2);
    }
}
