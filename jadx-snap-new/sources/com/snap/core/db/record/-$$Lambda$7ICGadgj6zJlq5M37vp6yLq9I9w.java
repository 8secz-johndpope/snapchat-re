package com.snap.core.db.record;

import com.snap.core.db.record.FriendModel.SelectFriendsAndAddedTimestampsByLinkTypeAddedBeforeCreator;
import com.snap.core.db.record.FriendModel.SelectFriendsAndAddedTimestampsByLinkTypeAddedBeforeModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$7ICGadgj6zJlq5M37vp6yLq9I9w implements SelectFriendsAndAddedTimestampsByLinkTypeAddedBeforeCreator {
    public static final /* synthetic */ -$$Lambda$7ICGadgj6zJlq5M37vp6yLq9I9w INSTANCE = new -$$Lambda$7ICGadgj6zJlq5M37vp6yLq9I9w();

    private /* synthetic */ -$$Lambda$7ICGadgj6zJlq5M37vp6yLq9I9w() {
    }

    public final SelectFriendsAndAddedTimestampsByLinkTypeAddedBeforeModel create(String str, Long l) {
        return new AutoValue_FriendRecord_UsernameAndAddedTimestamp(str, l);
    }
}
