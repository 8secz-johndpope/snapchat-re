package com.snap.core.db.record;

import com.snap.core.db.column.FriendSuggestionPlacement;
import com.snap.core.db.record.SuggestedFriendPlacementModel.Creator;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$oFrQghGQWf_L9yzmQd4KlimhH2s implements Creator {
    public static final /* synthetic */ -$$Lambda$oFrQghGQWf_L9yzmQd4KlimhH2s INSTANCE = new -$$Lambda$oFrQghGQWf_L9yzmQd4KlimhH2s();

    private /* synthetic */ -$$Lambda$oFrQghGQWf_L9yzmQd4KlimhH2s() {
    }

    public final SuggestedFriendPlacementModel create(long j, FriendSuggestionPlacement friendSuggestionPlacement, long j2) {
        return new AutoValue_SuggestedFriendPlacementRecord(j, friendSuggestionPlacement, j2);
    }
}
