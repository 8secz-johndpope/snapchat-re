package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.api.column.IntegerEnumColumnAdapter;
import com.snap.core.db.column.FriendSuggestionPlacement;
import com.snap.core.db.record.TopSuggestedFriendModel.Factory;
import defpackage.ainu;
import defpackage.ainw;

@AutoValue
public abstract class TopSuggestedFriendRecord implements TopSuggestedFriendModel {
    public static final Factory<TopSuggestedFriendRecord> FACTORY;
    public static final ainw<TopSuggestedFriendRecord> SELECT_ALL_MAPPER;
    private static final ainu<FriendSuggestionPlacement, Long> SUGGESTION_PLACEMENT_MAPPER = new IntegerEnumColumnAdapter(FriendSuggestionPlacement.class);

    static {
        Factory factory = new Factory(-$$Lambda$6Pgi6mlwFYjROxkxaAL5IgeNLgo.INSTANCE, SUGGESTION_PLACEMENT_MAPPER);
        FACTORY = factory;
        SELECT_ALL_MAPPER = factory.selectAllFromTopSuggestedFriendMapper();
    }
}
