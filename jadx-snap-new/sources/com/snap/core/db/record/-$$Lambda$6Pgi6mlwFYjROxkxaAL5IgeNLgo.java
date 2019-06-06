package com.snap.core.db.record;

import com.snap.core.db.column.FriendSuggestionPlacement;
import com.snap.core.db.record.TopSuggestedFriendModel.Creator;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$6Pgi6mlwFYjROxkxaAL5IgeNLgo implements Creator {
    public static final /* synthetic */ -$$Lambda$6Pgi6mlwFYjROxkxaAL5IgeNLgo INSTANCE = new -$$Lambda$6Pgi6mlwFYjROxkxaAL5IgeNLgo();

    private /* synthetic */ -$$Lambda$6Pgi6mlwFYjROxkxaAL5IgeNLgo() {
    }

    public final TopSuggestedFriendModel create(long j, String str, FriendSuggestionPlacement friendSuggestionPlacement, long j2) {
        return new AutoValue_TopSuggestedFriendRecord(j, str, friendSuggestionPlacement, j2);
    }
}
