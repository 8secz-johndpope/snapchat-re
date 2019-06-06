package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.api.column.IntegerEnumColumnAdapter;
import com.snap.core.db.column.FriendSuggestionPlacement;
import com.snap.core.db.record.SuggestedFriendPlacementModel.Factory;
import defpackage.ainu;

@AutoValue
public abstract class SuggestedFriendPlacementRecord implements SuggestedFriendPlacementModel {
    public static final Factory<SuggestedFriendPlacementRecord> FACTORY = new Factory(-$$Lambda$oFrQghGQWf_L9yzmQd4KlimhH2s.INSTANCE, SUGGESTION_PLACEMENT_MAPPER);
    private static final ainu<FriendSuggestionPlacement, Long> SUGGESTION_PLACEMENT_MAPPER = new IntegerEnumColumnAdapter(FriendSuggestionPlacement.class);
}
